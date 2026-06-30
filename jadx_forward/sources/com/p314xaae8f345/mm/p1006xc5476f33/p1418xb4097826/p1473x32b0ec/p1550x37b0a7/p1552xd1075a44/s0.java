package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class s0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202306b;

    public s0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        this.f202305a = i17;
        this.f202306b = t0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Image load callback triggered for[");
        int i17 = this.f202305a;
        sb6.append(i17);
        sb6.append("] URL: ");
        sb6.append(aVar);
        sb6.append(", resource: ");
        sb6.append(bitmap != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", sb6.toString());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.r0(bitmap, this.f202306b, i17, aVar));
    }
}
