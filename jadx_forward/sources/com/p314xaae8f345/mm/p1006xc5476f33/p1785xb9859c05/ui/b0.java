package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f224288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f224290f;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var, android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f224288d = imageView;
        this.f224289e = str;
        this.f224290f = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView imageView = this.f224288d;
        if (imageView.getTag() == null || !imageView.getTag().equals(this.f224289e) || (bitmap = this.f224290f) == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }
}
