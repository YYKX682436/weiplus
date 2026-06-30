package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class l3 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f288539n;

    public l3(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, boolean z17, java.util.List list, java.util.List list2) {
        super(abstractActivityC22312xbd689c47, list2, true, z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.removeAll(list2);
        }
        if (arrayList.isEmpty()) {
            gm0.j1.i();
            this.f288539n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().D();
        } else {
            gm0.j1.i();
            this.f288539n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().B(arrayList);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f288539n.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (i17 < 0 || !this.f288539n.moveToPosition(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CustomContactAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f288539n);
        uVar.f(z3Var);
        uVar.f288369e = this.f288611f;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomContactAdapter", "finish!");
        android.database.Cursor cursor = this.f288539n;
        if (cursor != null) {
            cursor.close();
            this.f288539n = null;
        }
    }
}
