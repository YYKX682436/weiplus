package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f230527d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f230528e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0 f230529f;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0 d0Var) {
        this.f230527d = bitmap;
        this.f230528e = imageView;
        this.f230529f = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f230527d;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bitmap == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", objArr);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d0 d0Var = this.f230529f;
        if (d0Var == null || d0Var.f230538h || (imageView = this.f230528e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
            return;
        }
        imageView.setTag(null);
        android.animation.ObjectAnimator.ofInt(imageView, "imageAlpha", 50, 255).setDuration(200L).start();
        imageView.setImageBitmap(bitmap);
    }
}
