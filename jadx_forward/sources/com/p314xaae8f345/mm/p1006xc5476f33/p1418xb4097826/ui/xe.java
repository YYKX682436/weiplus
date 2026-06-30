package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class xe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f211556e;

    public xe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, android.graphics.Bitmap bitmap) {
        this.f211555d = activityC15059x3e98c949;
        this.f211556e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.f210201e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211555d;
        if (activityC15059x3e98c949.s7()) {
            android.widget.ImageView imageView = activityC15059x3e98c949.f210202J;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbImageView");
                throw null;
            }
            android.graphics.Bitmap bitmap = activityC15059x3e98c949.W;
            if (bitmap == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbBitmap");
                throw null;
            }
            imageView.setImageBitmap(bitmap);
        } else if (activityC15059x3e98c949.P1) {
            android.widget.SeekBar seekBar = activityC15059x3e98c949.F;
            if (seekBar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            android.content.res.Resources resources = activityC15059x3e98c949.getResources();
            android.graphics.Bitmap bitmap2 = activityC15059x3e98c949.W;
            if (bitmap2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbBitmap");
                throw null;
            }
            seekBar.setThumb(new android.graphics.drawable.BitmapDrawable(resources, bitmap2));
            android.widget.SeekBar seekBar2 = activityC15059x3e98c949.F;
            if (seekBar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            seekBar2.setThumbOffset(0);
            activityC15059x3e98c949.P1 = false;
        } else {
            android.widget.SeekBar seekBar3 = activityC15059x3e98c949.F;
            if (seekBar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            android.graphics.drawable.Drawable thumb = seekBar3.getThumb();
            if (thumb != null) {
                thumb.invalidateSelf();
            }
        }
        android.graphics.Bitmap h76 = activityC15059x3e98c949.h7();
        if (h76 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.e7(activityC15059x3e98c949, h76);
        }
        android.widget.ImageView imageView2 = activityC15059x3e98c949.f210212v;
        if (imageView2 != null) {
            imageView2.setImageBitmap(this.f211556e);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropBlurView");
            throw null;
        }
    }
}
