package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes11.dex */
public class w extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f231839n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f231840o;

    public w(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, java.lang.String str) {
        super(l4Var, null, true, true);
        this.f231840o = str;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f231839n.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) this.f231839n.get(i17), true);
        sj3.h1 h1Var = new sj3.h1(i17);
        h1Var.f(n17);
        h1Var.f288369e = this.f288611f;
        return h1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.multitalk.MultiTalkSelectInitAdapter", "resetData");
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.f231840o);
        this.f231839n = L0;
        if (L0 == null) {
            this.f231839n = new java.util.ArrayList();
        }
    }
}
