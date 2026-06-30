package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29;

/* renamed from: com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter */
/* loaded from: classes9.dex */
public class C11374x5be6abc6 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293> implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f154640d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1012xd1075a44.C11381x88d3a085 f154641e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f154642f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154643g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154644h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f154645i;

    /* renamed from: m, reason: collision with root package name */
    public int f154646m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f154647n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f154648o;

    public C11374x5be6abc6(android.app.Activity activity) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f154645i = new java.util.ArrayList();
        this.f154646m = 65;
        this.f154648o = new java.util.concurrent.atomic.AtomicInteger();
        this.f154640d = activity;
        this.f39173x3fe91575 = 41785987;
    }

    public final void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "do next scene, oldWx %s,seq %d", this.f154643g, java.lang.Integer.valueOf(i17));
        gm0.j1.d().g(new r61.i1(this.f154643g, i17, this.f154644h));
        if (this.f154642f == null) {
            android.app.Activity activity = this.f154640d;
            this.f154642f = db5.e1.Q(activity, "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572002vy), false, false, null);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a59293) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a592932 = c5891xc4a59293;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c5891xc4a592932.f136199g.f88396b);
        am.hq hqVar = c5891xc4a592932.f136199g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "received RecoverAccountFriendEvent type %d, username %s", valueOf, hqVar.f88395a);
        if (hqVar.f88396b == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hqVar.f88395a)) {
            java.util.Iterator it = this.f154645i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fb5.n nVar = (fb5.n) it.next();
                if (hqVar.f88395a.equals(((r61.y1) nVar.f342431b).f474533a.f67922xdd77ad16)) {
                    ((r61.y1) nVar.f342431b).f474533a = r61.z1.a(this.f154643g, hqVar.f88395a);
                    fb5.m mVar = this.f154641e.f279399g;
                    mVar.c(mVar.f342427d);
                    break;
                }
            }
        }
        return true;
    }

    public final void d() {
        android.database.Cursor m145256x1d3f4980 = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().m145256x1d3f4980("SELECT COUNT(oldUsername) FROM OldAccountFriend WHERE oldUsername = " + d95.b0.O(this.f154643g), new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                r2 = m145256x1d3f4980.moveToFirst() ? m145256x1d3f4980.getInt(0) : 0;
            } finally {
                m145256x1d3f4980.close();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "totalCount %d", java.lang.Integer.valueOf(r2));
        int i17 = this.f154646m;
        java.util.ArrayList arrayList = this.f154645i;
        if (i17 != 65 || r2 >= 20) {
            do {
                e();
                if (arrayList.size() >= 20) {
                    return;
                }
            } while (this.f154646m <= 91);
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) r61.z1.b(this.f154643g, -1);
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                r61.y1 y1Var = (r61.y1) it.next();
                fb5.n nVar = new fb5.n();
                nVar.f342431b = y1Var;
                int i18 = y1Var.f474533a.f67927x98b6022;
                if (i18 < 65 || i18 > 90) {
                    nVar.f342430a = "#";
                } else {
                    nVar.f342430a = "" + ((char) i18);
                }
                arrayList.add(nVar);
            }
            this.f154641e.e(arrayList);
        }
        this.f154646m = 92;
    }

    public final void e() {
        java.util.ArrayList arrayList;
        do {
            int i17 = this.f154646m;
            if (i17 > 91) {
                return;
            }
            java.util.List b17 = r61.z1.b(this.f154643g, i17);
            this.f154646m++;
            arrayList = (java.util.ArrayList) b17;
        } while (arrayList.isEmpty());
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.ArrayList arrayList2 = this.f154645i;
            if (!hasNext) {
                this.f154641e.e(arrayList2);
                return;
            }
            r61.y1 y1Var = (r61.y1) it.next();
            fb5.n nVar = new fb5.n();
            nVar.f342431b = y1Var;
            int i18 = y1Var.f474533a.f67927x98b6022;
            if (i18 < 65 || i18 > 90) {
                nVar.f342430a = "#";
            } else {
                nVar.f342430a = "" + ((char) i18);
            }
            arrayList2.add(nVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            d();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f154642f;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = this.f154640d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
            }
            db5.e1.T(this.f154640d, str);
            return;
        }
        r61.i1 i1Var = (r61.i1) m1Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = i1Var.f474417d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        boolean z17 = ((r45.qj3) fVar).f465586e;
        this.f154647n = z17;
        java.util.LinkedList linkedList = ((r45.qj3) fVar).f465585d;
        java.lang.String str2 = ((r45.pj3) oVar.f152243a.f152217a).f464633d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "hasContinue %s, oldAccount friend %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(linkedList.size()));
        if (!this.f154643g.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecoverFriendPresenter", "(%s,%s), not my old username, ignore", this.f154643g, str2);
            return;
        }
        this.f154648o.getAndIncrement();
        ((ku5.t0) ku5.t0.f394148d).h(new r61.d2(this, str2, linkedList), "Insert_Old_Account_Friend");
        if (this.f154647n) {
            c(i1Var.f474419f);
            return;
        }
        if (this.f154648o.get() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "all insert tasks are finished!");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f154642f;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            d();
        }
    }
}
