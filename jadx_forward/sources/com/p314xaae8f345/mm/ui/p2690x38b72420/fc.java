package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class fc extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f288244n;

    public fc(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, boolean z19) {
        super(abstractActivityC22312xbd689c47, list, z17, z18, z19);
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
        android.database.Cursor cursor = this.f288244n;
        if (cursor != null) {
            return cursor.getCount();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConvBoxTransmitUI.SnsSelectFromConvBoxAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (!this.f288244n.moveToPosition(i17)) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0 f0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f0(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var.mo9015xbf5d97fd(this.f288244n);
        gm0.j1.i();
        f0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var.h1()));
        if (f0Var.B == null) {
            gm0.j1.i();
            f0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var.h1()));
        }
        f0Var.f288369e = true;
        return f0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvBoxTransmitUI.SnsSelectFromConvBoxAdapter", "finish!");
        android.database.Cursor cursor = this.f288244n;
        if (cursor != null) {
            cursor.close();
            this.f288244n = null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvBoxTransmitUI.SnsSelectFromConvBoxAdapter", "resetData");
        android.database.Cursor cursor = this.f288244n;
        if (cursor != null) {
            cursor.close();
            this.f288244n = null;
        }
        this.f288244n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(5, this.f288121m, "conversationboxservice", -1);
    }
}
