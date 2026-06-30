package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class kc extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f288533n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f288534o;

    public kc(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.lang.String str) {
        super(abstractActivityC22312xbd689c47, new java.util.ArrayList(), false, false);
        this.f288533n = str;
        t();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f288534o.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (i17 < 0 || !this.f288534o.moveToPosition(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpecialContactAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f288534o);
        uVar.f(z3Var);
        uVar.f288369e = this.f288611f;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpecialContactAdapter", "finish!");
        android.database.Cursor cursor = this.f288534o;
        if (cursor != null) {
            cursor.close();
            this.f288534o = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        t();
        h();
        notifyDataSetChanged();
    }

    public final void t() {
        gm0.j1.i();
        this.f288534o = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().x(this.f288533n, "", this.f288121m);
    }
}
