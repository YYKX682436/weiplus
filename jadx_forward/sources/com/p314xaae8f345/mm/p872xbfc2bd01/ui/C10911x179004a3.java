package com.p314xaae8f345.mm.p872xbfc2bd01.ui;

/* renamed from: com.tencent.mm.memory.ui.PictureView */
/* loaded from: classes4.dex */
public class C10911x179004a3 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p872xbfc2bd01.l f150515d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f150516e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f150517f;

    public C10911x179004a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150515d = null;
        this.f150516e = false;
        this.f150517f = new nt0.a(this);
    }

    public static void a(com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10911x179004a3 c10911x179004a3) {
        com.p314xaae8f345.mm.p872xbfc2bd01.l lVar = c10911x179004a3.f150515d;
        if (lVar != null) {
            lVar.b();
        }
        c10911x179004a3.f150515d = null;
        super.setImageDrawable(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f150517f);
        if (this.f150516e) {
            return;
        }
        this.f150516e = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f150516e) {
            this.f150516e = false;
            java.lang.Runnable runnable = this.f150517f;
            removeCallbacks(runnable);
            postDelayed(runnable, 500L);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        removeCallbacks(this.f150517f);
        if (this.f150516e) {
            return;
        }
        this.f150516e = true;
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f150516e) {
            this.f150516e = false;
            java.lang.Runnable runnable = this.f150517f;
            removeCallbacks(runnable);
            postDelayed(runnable, 500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        removeCallbacks(this.f150517f);
        if (drawable == 0 || drawable.equals(this.f150515d)) {
            return;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.l lVar = this.f150515d;
        if (lVar != null) {
            lVar.b();
        }
        boolean z17 = drawable instanceof com.p314xaae8f345.mm.p872xbfc2bd01.l;
        if (z17) {
            this.f150515d = (com.p314xaae8f345.mm.p872xbfc2bd01.l) drawable;
        } else {
            this.f150515d = null;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.p872xbfc2bd01.l) drawable).a();
        }
        super.setImageDrawable(drawable);
    }

    /* renamed from: setReleasableBitmap */
    public void m46893xdd21d249(com.p314xaae8f345.mm.p872xbfc2bd01.r rVar) {
        if (rVar == null || rVar.equals(this.f150515d)) {
            return;
        }
        setImageBitmap(rVar.f150503d);
        this.f150515d = rVar;
        rVar.a();
    }

    public C10911x179004a3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150515d = null;
        this.f150516e = false;
        this.f150517f = new nt0.a(this);
    }
}
