package com.p314xaae8f345.mm.p872xbfc2bd01.ui;

/* renamed from: com.tencent.mm.memory.ui.QPictureView */
/* loaded from: classes4.dex */
public class C10912x86c557b2 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f {
    public static boolean G = true;
    public com.p314xaae8f345.mm.p872xbfc2bd01.l D;
    public boolean E;
    public final java.lang.Runnable F;

    public C10912x86c557b2(android.content.Context context) {
        super(context);
        this.D = null;
        this.E = false;
        this.F = new nt0.b(this);
    }

    private void n() {
        removeCallbacks(this.F);
        if (this.E) {
            return;
        }
        this.E = true;
    }

    /* renamed from: onDetach */
    private void m46894x3f5eee52() {
        if (this.E) {
            this.E = false;
            java.lang.Runnable runnable = this.F;
            removeCallbacks(runnable);
            postDelayed(runnable, 500L);
        }
    }

    public void m() {
        com.p314xaae8f345.mm.p872xbfc2bd01.l lVar = this.D;
        if (lVar != null) {
            lVar.b();
        }
        this.D = null;
    }

    public void o() {
        super.mo46895x706225d7(null);
        com.p314xaae8f345.mm.p872xbfc2bd01.l lVar = this.D;
        if (lVar != null) {
            lVar.b();
        }
        this.D = null;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (G) {
            n();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (G) {
            m46894x3f5eee52();
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (G) {
            n();
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (G) {
            m46894x3f5eee52();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f
    /* renamed from: setImageDrawable */
    public void mo46895x706225d7(android.graphics.drawable.Drawable drawable) {
        removeCallbacks(this.F);
        if (drawable == 0 || drawable.equals(this.D)) {
            return;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.l lVar = this.D;
        if (lVar != null) {
            lVar.b();
        }
        boolean z17 = drawable instanceof com.p314xaae8f345.mm.p872xbfc2bd01.l;
        if (z17) {
            this.D = (com.p314xaae8f345.mm.p872xbfc2bd01.l) drawable;
        } else {
            this.D = null;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.p872xbfc2bd01.l) drawable).a();
        }
        super.mo46895x706225d7(drawable);
    }

    /* renamed from: setReleasableBitmap */
    public void m46896xdd21d249(com.p314xaae8f345.mm.p872xbfc2bd01.r rVar) {
        if (rVar == null || rVar.equals(this.D)) {
            return;
        }
        mo69290xd44890a8(rVar.f150503d);
        this.D = rVar;
        rVar.a();
    }

    public C10912x86c557b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = null;
        this.E = false;
        this.F = new nt0.b(this);
    }

    public C10912x86c557b2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.D = null;
        this.E = false;
        this.F = new nt0.b(this);
    }
}
