package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f236782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236783e;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b, android.graphics.Bitmap bitmap) {
        this.f236783e = activityC16960x141f579b;
        this.f236782d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f236783e.f236661m.setImageBitmap(this.f236782d);
    }
}
