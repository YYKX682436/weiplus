package com.tencent.mm.memory.ui;

/* loaded from: classes4.dex */
public class PictureView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.memory.l f68982d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f68983e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f68984f;

    public PictureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68982d = null;
        this.f68983e = false;
        this.f68984f = new nt0.a(this);
    }

    public static void a(com.tencent.mm.memory.ui.PictureView pictureView) {
        com.tencent.mm.memory.l lVar = pictureView.f68982d;
        if (lVar != null) {
            lVar.b();
        }
        pictureView.f68982d = null;
        super.setImageDrawable(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f68984f);
        if (this.f68983e) {
            return;
        }
        this.f68983e = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f68983e) {
            this.f68983e = false;
            java.lang.Runnable runnable = this.f68984f;
            removeCallbacks(runnable);
            postDelayed(runnable, 500L);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        removeCallbacks(this.f68984f);
        if (this.f68983e) {
            return;
        }
        this.f68983e = true;
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f68983e) {
            this.f68983e = false;
            java.lang.Runnable runnable = this.f68984f;
            removeCallbacks(runnable);
            postDelayed(runnable, 500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        removeCallbacks(this.f68984f);
        if (drawable == 0 || drawable.equals(this.f68982d)) {
            return;
        }
        com.tencent.mm.memory.l lVar = this.f68982d;
        if (lVar != null) {
            lVar.b();
        }
        boolean z17 = drawable instanceof com.tencent.mm.memory.l;
        if (z17) {
            this.f68982d = (com.tencent.mm.memory.l) drawable;
        } else {
            this.f68982d = null;
        }
        if (z17) {
            ((com.tencent.mm.memory.l) drawable).a();
        }
        super.setImageDrawable(drawable);
    }

    public void setReleasableBitmap(com.tencent.mm.memory.r rVar) {
        if (rVar == null || rVar.equals(this.f68982d)) {
            return;
        }
        setImageBitmap(rVar.f68970d);
        this.f68982d = rVar;
        rVar.a();
    }

    public PictureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68982d = null;
        this.f68983e = false;
        this.f68984f = new nt0.a(this);
    }
}
