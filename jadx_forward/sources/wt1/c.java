package wt1;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f530788e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f530789f;

    /* renamed from: g, reason: collision with root package name */
    public xt1.a0 f530790g;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f530787d = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f530791h = new java.util.ArrayList();

    public c() {
        xt1.s0 hj6 = xt1.t0.hj();
        hj6.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = hj6.f538100d.f("select * from PendingCardId where retryCount < 10", null, 2);
        while (f17.moveToNext()) {
            xt1.r0 r0Var = new xt1.r0();
            r0Var.mo9015xbf5d97fd(f17);
            arrayList.add(r0Var);
        }
        f17.close();
        arrayList.size();
        this.f530788e = arrayList;
        this.f530789f = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", java.lang.Integer.valueOf(arrayList.size()));
        gm0.j1.n().f354821b.a(1074, this);
    }

    public void a(int i17) {
        gm0.j1.n().f354821b.g(new xt1.e0(1, i17));
    }

    public void b() {
        java.util.List list = this.f530788e;
        if (((java.util.ArrayList) list).size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
            return;
        }
        if (this.f530790g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (((java.util.ArrayList) list).size() <= 10) {
            linkedList.addAll(list);
        } else {
            linkedList.addAll(((java.util.ArrayList) list).subList(0, 10));
        }
        this.f530790g = new xt1.a0(linkedList);
        gm0.j1.n().f354821b.g(this.f530790g);
    }

    public void c(r45.xu xuVar) {
        if (xuVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe z07 = xt1.t0.cj().z0("" + xuVar.f471953d);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = xuVar.f471953d;
        objArr[1] = java.lang.Long.valueOf(z07 == null ? 0L : z07.f67753x266f95d1);
        objArr[2] = java.lang.Long.valueOf(xuVar.f471954e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", objArr);
        if (z07 != null && z07.f67753x266f95d1 == xuVar.f471954e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
            return;
        }
        xt1.r0 r0Var = new xt1.r0();
        r0Var.f66167xe3413ddb = xuVar.f471953d;
        synchronized (this.f530787d) {
            if (((java.util.ArrayList) this.f530788e).contains(r0Var)) {
                return;
            }
            if (((java.util.ArrayList) this.f530789f).contains(r0Var)) {
                return;
            }
            ((java.util.ArrayList) this.f530788e).add(r0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", java.lang.Boolean.valueOf(xt1.t0.hj().mo880xb970c2b9(r0Var)));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tt1.l lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f530790g = null;
        java.util.LinkedList<xt1.r0> linkedList = ((xt1.a0) m1Var).f537975g;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            synchronized (this.f530787d) {
                if (linkedList != null) {
                    if (linkedList.size() > 0) {
                        ((java.util.ArrayList) this.f530788e).removeAll(linkedList);
                        ((java.util.ArrayList) this.f530789f).addAll(linkedList);
                    }
                }
            }
            xt1.s0 hj6 = xt1.t0.hj();
            hj6.getClass();
            if (linkedList == null || linkedList.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
                return;
            }
            for (xt1.r0 r0Var : linkedList) {
                if (r0Var != null) {
                    r0Var.f66168x73c8dbac++;
                    hj6.mo9952xce0038c9(r0Var, new java.lang.String[0]);
                }
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", objArr);
        if (linkedList != null) {
            synchronized (this.f530787d) {
                ((java.util.ArrayList) this.f530788e).removeAll(linkedList);
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        xt1.s0 hj7 = xt1.t0.hj();
        hj7.getClass();
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
        } else {
            for (xt1.r0 r0Var2 : linkedList) {
                if (r0Var2 != null) {
                    hj7.mo9951xb06685ab(r0Var2, new java.lang.String[0]);
                }
            }
        }
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        b();
        if (this.f530791h == null) {
            return;
        }
        for (int i19 = 0; i19 < ((java.util.ArrayList) this.f530791h).size(); i19++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530791h).get(i19);
            if (weakReference != null && (lVar = (tt1.l) weakReference.get()) != null) {
                lVar.W0();
            }
        }
    }
}
