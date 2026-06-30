package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView */
/* loaded from: classes13.dex */
public class C15519x2d7425ac extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f218511d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.DrawFilter f218512e;

    public C15519x2d7425ac(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f218511d = null;
        this.f218512e = new android.graphics.PaintFlagsDrawFilter(0, 3);
    }

    public void a(int i17, lz2.c cVar) {
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(i17);
        setImageDrawable(drawable);
        if (drawable instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
            animationDrawable.start();
            if (cVar != null) {
                cVar.mo146545xb05099c3();
            }
            if (animationDrawable.isOneShot()) {
                int i18 = 0;
                for (int i19 = 0; i19 < animationDrawable.getNumberOfFrames(); i19++) {
                    i18 += animationDrawable.getDuration(i19);
                }
                if (cVar != null) {
                    lz2.b bVar = new lz2.b(this, cVar);
                    this.f218511d = bVar;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(bVar, i18);
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.setDrawFilter(this.f218512e);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f218511d);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f218511d);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f218511d);
        super.setImageResource(i17);
    }

    public C15519x2d7425ac(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f218511d = null;
        this.f218512e = new android.graphics.PaintFlagsDrawFilter(0, 3);
    }
}
