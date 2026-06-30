package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f241058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f241059e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f0 f0Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f241058d = imageView;
        this.f241059e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f241059e;
        android.widget.ImageView imageView = this.f241058d;
        imageView.setImageBitmap(bitmap);
        imageView.setBackgroundColor(0);
    }
}
