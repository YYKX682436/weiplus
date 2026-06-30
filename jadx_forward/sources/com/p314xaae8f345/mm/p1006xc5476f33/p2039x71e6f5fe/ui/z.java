package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes5.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f241355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f241356e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a0 a0Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f241355d = imageView;
        this.f241356e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f241356e;
        android.widget.ImageView imageView = this.f241355d;
        imageView.setImageBitmap(bitmap);
        imageView.setBackgroundColor(0);
    }
}
