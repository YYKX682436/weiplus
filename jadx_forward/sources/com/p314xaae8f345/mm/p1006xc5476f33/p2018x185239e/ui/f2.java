package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes11.dex */
public class f2 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f239234n;

    /* renamed from: o, reason: collision with root package name */
    public int f239235o;

    /* renamed from: p, reason: collision with root package name */
    public int f239236p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f239237q;

    /* renamed from: r, reason: collision with root package name */
    public final int f239238r;

    /* renamed from: s, reason: collision with root package name */
    public int f239239s;

    public f2(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, java.util.List list2, int i17, boolean z17) {
        super(abstractActivityC22312xbd689c47, list2, z17, false);
        this.f239239s = 0;
        this.f239237q = list;
        this.f239238r = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "create!");
        s();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f239234n.getCount() + this.f239239s;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        int i18;
        int i19 = this.f239236p;
        if (i17 == i19 || i17 == this.f239235o) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            int i27 = this.f239235o;
            com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
            if (i17 != i27) {
                if (i17 != this.f239236p) {
                    return n0Var;
                }
                n0Var.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kz9);
                return n0Var;
            }
            int i28 = this.f239238r;
            if (i28 == 1) {
                n0Var.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571286aq);
                return n0Var;
            }
            if (i28 == 3) {
                n0Var.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_9);
                return n0Var;
            }
            n0Var.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0w);
            return n0Var;
        }
        int i29 = this.f239239s;
        if (i29 == 2) {
            if (i17 > i19) {
                i18 = i17 - 2;
            }
            i18 = i17 - 1;
        } else {
            if (i29 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentConversationAdapter", "Actually dead branch. position=%d", java.lang.Integer.valueOf(i17));
                i18 = i17;
            }
            i18 = i17 - 1;
        }
        if (!this.f239234n.moveToPosition(i18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentConversationAdapter", "wrong case: %s, %s", java.lang.Boolean.valueOf(this.f239234n.isClosed()), java.lang.Integer.valueOf(i18));
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e2(this, 4, i17);
        }
        ((qd0.e) ((rd0.x0) i95.n0.c(rd0.x0.class))).getClass();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 c0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var2.mo9015xbf5d97fd(this.f239234n);
        gm0.j1.i();
        c0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var2.h1()));
        if (c0Var.B != null) {
            return c0Var;
        }
        gm0.j1.i();
        c0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var2.h1()));
        return c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "finish!");
        android.database.Cursor cursor = this.f239234n;
        if (cursor != null) {
            cursor.close();
            this.f239234n = null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        int i17;
        java.util.List list;
        android.database.Cursor C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "resetData");
        android.database.Cursor cursor = this.f239234n;
        if (cursor != null) {
            cursor.close();
            this.f239234n = null;
        }
        this.f239239s = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f239235o = -1;
        this.f239236p = -1;
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        java.util.List list2 = this.f239237q;
        if (list2 == null || list2.size() <= 0) {
            i17 = 0;
        } else {
            gm0.j1.i();
            android.database.Cursor C2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().C(list2);
            arrayList.add(C2);
            i17 = C2.getCount();
            if (i17 > 0) {
                this.f239235o = l4Var.O3().getHeaderViewsCount();
                this.f239239s++;
            } else {
                this.f239235o = -1;
            }
        }
        java.util.List list3 = this.f288121m;
        if (list3 != null) {
            list3.addAll(list2);
            list = list3;
        } else {
            list = list2;
        }
        int i18 = this.f239238r;
        if (i18 == 1 || i18 == 3) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            l75.e0 e0Var = pp.a.f438897e2;
            C = Di.C(1, list, null, this.f288120i, "");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            l75.e0 e0Var2 = pp.a.f438897e2;
            C = Di2.C(3, list, null, this.f288120i, "");
        }
        if (C.getCount() > 0) {
            this.f239239s++;
            if (i17 > 0) {
                this.f239236p = this.f239235o + i17 + 1;
            } else {
                this.f239236p = l4Var.O3().getHeaderViewsCount();
            }
        } else {
            this.f239236p = -1;
        }
        arrayList.add(C);
        this.f239234n = new android.database.MergeCursor((android.database.Cursor[]) arrayList.toArray(new android.database.Cursor[0]));
    }
}
