package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes11.dex */
public class x extends com.p314xaae8f345.mm.ui.p2690x38b72420.f5 {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String[] f231928n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f231929o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f231930p;

    public x(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.lang.String str) {
        super(abstractActivityC22312xbd689c47, null, true, 0);
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
        if (L0 != null) {
            this.f231928n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d1(L0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f231929o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (!this.f231929o.moveToPosition(i17)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f231929o);
        sj3.h1 h1Var = new sj3.h1(i17);
        h1Var.f(z3Var);
        h1Var.f288369e = this.f288611f;
        h1Var.f288381q = this.f231930p;
        return h1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        super.k();
        android.database.Cursor cursor = this.f231929o;
        if (cursor != null) {
            cursor.close();
            this.f231929o = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.multitalk.MultiTalkSelectSearchAdapter", "doSearch: %s", str);
        h();
        this.f231930p = str;
        android.database.Cursor cursor = this.f231929o;
        if (cursor != null) {
            cursor.close();
            this.f231929o = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f231930p) && this.f231928n != null) {
            this.f231929o = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().V(this.f231928n, "@all.chatroom", this.f231930p, new java.util.LinkedList(), null);
        }
        notifyDataSetChanged();
        f(str, true);
    }
}
