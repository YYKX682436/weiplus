package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 f234818e;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 activityC16817xdad885e7, android.graphics.Bitmap bitmap) {
        this.f234818e = activityC16817xdad885e7;
        this.f234817d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234818e.f234767m.setImageBitmap(this.f234817d);
    }
}
