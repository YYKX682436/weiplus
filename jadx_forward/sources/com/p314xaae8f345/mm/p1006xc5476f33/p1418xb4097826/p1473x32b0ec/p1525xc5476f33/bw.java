package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f193611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f193612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193614g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193615h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193616i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193617m;

    public bw(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4, android.graphics.PointF pointF5) {
        this.f193611d = imageView;
        this.f193612e = owVar;
        this.f193613f = pointF;
        this.f193614g = pointF2;
        this.f193615h = pointF3;
        this.f193616i = pointF4;
        this.f193617m = pointF5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f193611d;
        android.view.ViewPropertyAnimator animate = imageView.animate();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f193612e;
        animate.setDuration(owVar.L).setInterpolator(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nv(new android.graphics.PointF(0.18f, 0.3f))).setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zv(this.f193611d, this.f193612e, this.f193613f, this.f193614g, this.f193615h, this.f193616i, this.f193617m)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.aw(owVar, imageView)).start();
    }
}
