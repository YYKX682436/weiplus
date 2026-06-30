package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class s implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f211320b;

    public s(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f211319a = str;
        this.f211320b = activityC15007xc74afeba;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.r(this.f211320b));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba.f210021x1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActivityDescUI", "[handleActivityProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f211319a);
        }
    }
}
