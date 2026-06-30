package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f194268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f194269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f194270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f194271g;

    public gw(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        this.f194268d = imageView;
        this.f194269e = owVar;
        this.f194270f = pointF;
        this.f194271g = pointF2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f194268d;
        android.view.ViewPropertyAnimator animate = imageView.animate();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f194269e;
        animate.setDuration(owVar.L).setInterpolator(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nv(new android.graphics.PointF(0.18f, 0.3f))).setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ew(imageView, owVar, this.f194270f, this.f194271g)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fw(owVar, imageView)).start();
    }
}
