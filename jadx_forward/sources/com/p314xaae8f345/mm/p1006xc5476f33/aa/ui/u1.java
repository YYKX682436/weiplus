package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes10.dex */
public class u1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f154353n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f154354o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f154355p;

    public u1(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, java.lang.String str, java.util.List list, java.util.List list2, boolean z17) {
        super(l4Var, null, true, true);
        this.f154354o = str;
        this.f154353n = list;
        this.f154355p = z17;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f154353n.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        java.lang.String str = (java.lang.String) this.f154353n.get(i17);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1(i17);
        java.lang.String str2 = this.f154354o;
        j1Var.f288382r = str2;
        j1Var.f(n17);
        j1Var.f288369e = true;
        j1Var.f288378n = java.lang.Boolean.valueOf(this.f154355p).booleanValue();
        j1Var.f288379o = java.lang.Boolean.valueOf(h61.o.o(str2, str)).booleanValue();
        return j1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AASelectInitAdapter", "resetData");
        if (c01.e2.R(this.f154354o)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List<java.lang.String> list = this.f154353n;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (java.lang.String str : list) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
            if (arrayList.size() > 0) {
                list.clear();
                list.addAll(arrayList2);
                list.addAll(arrayList);
            }
        }
    }
}
