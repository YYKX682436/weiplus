package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba f234860e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba activityC16816x5ca1ddba, android.graphics.Bitmap bitmap) {
        this.f234860e = activityC16816x5ca1ddba;
        this.f234859d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234860e.f234749e.setImageBitmap(this.f234859d);
    }
}
