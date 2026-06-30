package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes10.dex */
public class t1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f154339n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f154340o;

    public t1(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, java.util.ArrayList arrayList) {
        super(l4Var, null, true, true);
        this.f154340o = arrayList;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f154339n).size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f154339n).get(i17);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17.X1(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1(i17);
        j1Var.f(n17);
        j1Var.f288369e = true;
        return j1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AASelectInitAdapter", "resetData");
        if (this.f154339n == null) {
            this.f154339n = new java.util.ArrayList();
        }
        this.f154339n.clear();
        java.util.Iterator it = this.f154340o.iterator();
        while (it.hasNext()) {
            this.f154339n.add((java.lang.String) it.next());
        }
    }
}
