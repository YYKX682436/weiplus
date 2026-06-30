package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f243845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 f243846f;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f243846f = activityC17681x5e0a88e4;
        this.f243844d = str;
        this.f243845e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4 = this.f243846f;
        java.lang.String str = activityC17681x5e0a88e4.f243759f;
        if (str != null && str.equals(this.f243844d)) {
            android.widget.ImageView imageView = activityC17681x5e0a88e4.f243758e;
            if (imageView != null && (bitmap = this.f243845e) != null) {
                imageView.setImageBitmap(bitmap);
                activityC17681x5e0a88e4.X6();
            }
            activityC17681x5e0a88e4.f243766p = true;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC17681x5e0a88e4.f243757d;
    }
}
