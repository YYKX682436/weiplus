package com.tencent.mm.plugin.account.friend.model;

/* loaded from: classes9.dex */
public class RecoverFriendPresenter extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecoverAccountFriendEvent> implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f73107d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView f73108e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73109f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73110g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73111h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f73112i;

    /* renamed from: m, reason: collision with root package name */
    public int f73113m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f73114n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f73115o;

    public RecoverFriendPresenter(android.app.Activity activity) {
        super(com.tencent.mm.app.a0.f53288d);
        this.f73112i = new java.util.ArrayList();
        this.f73113m = 65;
        this.f73115o = new java.util.concurrent.atomic.AtomicInteger();
        this.f73107d = activity;
        this.__eventId = 41785987;
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "do next scene, oldWx %s,seq %d", this.f73110g, java.lang.Integer.valueOf(i17));
        gm0.j1.d().g(new r61.i1(this.f73110g, i17, this.f73111h));
        if (this.f73109f == null) {
            android.app.Activity activity = this.f73107d;
            this.f73109f = db5.e1.Q(activity, "", activity.getString(com.tencent.mm.R.string.f490469vy), false, false, null);
        }
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent) {
        com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent2 = recoverAccountFriendEvent;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(recoverAccountFriendEvent2.f54666g.f6863b);
        am.hq hqVar = recoverAccountFriendEvent2.f54666g;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "received RecoverAccountFriendEvent type %d, username %s", valueOf, hqVar.f6862a);
        if (hqVar.f6863b == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(hqVar.f6862a)) {
            java.util.Iterator it = this.f73112i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fb5.n nVar = (fb5.n) it.next();
                if (hqVar.f6862a.equals(((r61.y1) nVar.f260898b).f393000a.field_encryptUsername)) {
                    ((r61.y1) nVar.f260898b).f393000a = r61.z1.a(this.f73110g, hqVar.f6862a);
                    fb5.m mVar = this.f73108e.f197866g;
                    mVar.c(mVar.f260894d);
                    break;
                }
            }
        }
        return true;
    }

    public final void d() {
        android.database.Cursor rawQuery = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().rawQuery("SELECT COUNT(oldUsername) FROM OldAccountFriend WHERE oldUsername = " + d95.b0.O(this.f73110g), new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                r2 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
            } finally {
                rawQuery.close();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "totalCount %d", java.lang.Integer.valueOf(r2));
        int i17 = this.f73113m;
        java.util.ArrayList arrayList = this.f73112i;
        if (i17 != 65 || r2 >= 20) {
            do {
                e();
                if (arrayList.size() >= 20) {
                    return;
                }
            } while (this.f73113m <= 91);
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) r61.z1.b(this.f73110g, -1);
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                r61.y1 y1Var = (r61.y1) it.next();
                fb5.n nVar = new fb5.n();
                nVar.f260898b = y1Var;
                int i18 = y1Var.f393000a.field_showHead;
                if (i18 < 65 || i18 > 90) {
                    nVar.f260897a = "#";
                } else {
                    nVar.f260897a = "" + ((char) i18);
                }
                arrayList.add(nVar);
            }
            this.f73108e.e(arrayList);
        }
        this.f73113m = 92;
    }

    public final void e() {
        java.util.ArrayList arrayList;
        do {
            int i17 = this.f73113m;
            if (i17 > 91) {
                return;
            }
            java.util.List b17 = r61.z1.b(this.f73110g, i17);
            this.f73113m++;
            arrayList = (java.util.ArrayList) b17;
        } while (arrayList.isEmpty());
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.ArrayList arrayList2 = this.f73112i;
            if (!hasNext) {
                this.f73108e.e(arrayList2);
                return;
            }
            r61.y1 y1Var = (r61.y1) it.next();
            fb5.n nVar = new fb5.n();
            nVar.f260898b = y1Var;
            int i18 = y1Var.f393000a.field_showHead;
            if (i18 < 65 || i18 > 90) {
                nVar.f260897a = "#";
            } else {
                nVar.f260897a = "" + ((char) i18);
            }
            arrayList2.add(nVar);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            d();
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73109f;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = this.f73107d.getString(com.tencent.mm.R.string.f490391to);
            }
            db5.e1.T(this.f73107d, str);
            return;
        }
        r61.i1 i1Var = (r61.i1) m1Var;
        com.tencent.mm.modelbase.o oVar = i1Var.f392884d;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        boolean z17 = ((r45.qj3) fVar).f384053e;
        this.f73114n = z17;
        java.util.LinkedList linkedList = ((r45.qj3) fVar).f384052d;
        java.lang.String str2 = ((r45.pj3) oVar.f70710a.f70684a).f383100d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "hasContinue %s, oldAccount friend %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(linkedList.size()));
        if (!this.f73110g.equals(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecoverFriendPresenter", "(%s,%s), not my old username, ignore", this.f73110g, str2);
            return;
        }
        this.f73115o.getAndIncrement();
        ((ku5.t0) ku5.t0.f312615d).h(new r61.d2(this, str2, linkedList), "Insert_Old_Account_Friend");
        if (this.f73114n) {
            c(i1Var.f392886f);
            return;
        }
        if (this.f73115o.get() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "all insert tasks are finished!");
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f73109f;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            d();
        }
    }
}
