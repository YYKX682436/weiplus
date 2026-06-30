package com.tencent.mm.memory.ui;

/* loaded from: classes4.dex */
public class QPictureView extends com.tencent.mm.ui.widget.QImageView {
    public static boolean G = true;
    public com.tencent.mm.memory.l D;
    public boolean E;
    public final java.lang.Runnable F;

    public QPictureView(android.content.Context context) {
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

    private void onDetach() {
        if (this.E) {
            this.E = false;
            java.lang.Runnable runnable = this.F;
            removeCallbacks(runnable);
            postDelayed(runnable, 500L);
        }
    }

    public void m() {
        com.tencent.mm.memory.l lVar = this.D;
        if (lVar != null) {
            lVar.b();
        }
        this.D = null;
    }

    public void o() {
        super.setImageDrawable(null);
        com.tencent.mm.memory.l lVar = this.D;
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

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (G) {
            onDetach();
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
            onDetach();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.widget.QImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        removeCallbacks(this.F);
        if (drawable == 0 || drawable.equals(this.D)) {
            return;
        }
        com.tencent.mm.memory.l lVar = this.D;
        if (lVar != null) {
            lVar.b();
        }
        boolean z17 = drawable instanceof com.tencent.mm.memory.l;
        if (z17) {
            this.D = (com.tencent.mm.memory.l) drawable;
        } else {
            this.D = null;
        }
        if (z17) {
            ((com.tencent.mm.memory.l) drawable).a();
        }
        super.setImageDrawable(drawable);
    }

    public void setReleasableBitmap(com.tencent.mm.memory.r rVar) {
        if (rVar == null || rVar.equals(this.D)) {
            return;
        }
        setImageBitmap(rVar.f68970d);
        this.D = rVar;
        rVar.a();
    }

    public QPictureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = null;
        this.E = false;
        this.F = new nt0.b(this);
    }

    public QPictureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.D = null;
        this.E = false;
        this.F = new nt0.b(this);
    }
}
