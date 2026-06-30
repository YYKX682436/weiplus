package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f243974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f243975e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.r rVar, android.view.View view, android.graphics.Bitmap bitmap) {
        this.f243974d = view;
        this.f243975e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f243974d.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(this.f243975e));
    }
}
