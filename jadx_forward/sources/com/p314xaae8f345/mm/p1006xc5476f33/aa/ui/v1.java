package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class v1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.f5 {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String[] f154380n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f154381o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154382p;

    public v1(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.ArrayList arrayList) {
        super(abstractActivityC22312xbd689c47, null, true, 0);
        if (arrayList != null) {
            this.f154380n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d1(arrayList);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f154381o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (!this.f154381o.moveToPosition(i17)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f154381o);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
        uVar.f(z3Var);
        uVar.f288369e = true;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        super.k();
        android.database.Cursor cursor = this.f154381o;
        if (cursor != null) {
            cursor.close();
            this.f154381o = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.f5, com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", str);
        h();
        this.f154382p = str;
        android.database.Cursor cursor = this.f154381o;
        if (cursor != null) {
            cursor.close();
            this.f154381o = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154382p) && this.f154380n != null) {
            gm0.j1.i();
            this.f154381o = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().V(this.f154380n, "@all.chatroom", this.f154382p, new java.util.LinkedList(), null);
        }
        notifyDataSetChanged();
        f(str, true);
    }
}
