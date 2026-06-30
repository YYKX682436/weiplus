package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f287555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z1 f287556e;

    public y1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z1 z1Var, android.graphics.Bitmap bitmap) {
        this.f287556e = z1Var;
        this.f287555d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f287556e.f287641a.f287276f.setImageBitmap(this.f287555d);
    }
}
