package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f230632d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f230633e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y f230634f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y yVar) {
        this.f230632d = bitmap;
        this.f230633e = imageView;
        this.f230634f = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f230632d;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bitmap == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", objArr);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.y yVar = this.f230634f;
        if (yVar == null || yVar.f230639f || (imageView = this.f230633e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
            return;
        }
        imageView.setTag(null);
        android.animation.ObjectAnimator.ofInt(imageView, "imageAlpha", 50, 255).setDuration(200L).start();
        imageView.setImageBitmap(bitmap);
    }
}
