package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0017&\u0011B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView;", "Landroid/view/View;", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "Ljz5/f0;", "setText", "", "textSize", "setTextSize", "", "textColor", "setTextColor", "", "bold", "setTextBold", "getLeftFadingEdgeStrength", "getRightFadingEdgeStrength", "Lcom/tencent/mm/plugin/mv/ui/view/m3;", "o", "Lcom/tencent/mm/plugin/mv/ui/view/m3;", "getViewProvider", "()Lcom/tencent/mm/plugin/mv/ui/view/m3;", "viewProvider", "Lcom/tencent/mm/plugin/mv/ui/view/j3;", "p", "Lcom/tencent/mm/plugin/mv/ui/view/j3;", "getEffect", "()Lcom/tencent/mm/plugin/mv/ui/view/j3;", "setEffect", "(Lcom/tencent/mm/plugin/mv/ui/view/j3;)V", "effect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/mv/ui/view/l3", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView */
/* loaded from: classes15.dex */
public final class C16695xcdc88f46 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f233234d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f233235e;

    /* renamed from: f, reason: collision with root package name */
    public float f233236f;

    /* renamed from: g, reason: collision with root package name */
    public float f233237g;

    /* renamed from: h, reason: collision with root package name */
    public final float f233238h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Scroller f233239i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f233240m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f233241n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m3 viewProvider;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j3 effect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16695xcdc88f46(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        android.graphics.Paint paint = this.f233234d;
        float measureText = paint.measureText(this.f233235e);
        float f17 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        if (this.f233236f == measureText) {
            if (this.f233237g == f17) {
                return;
            }
        }
        this.f233236f = measureText;
        this.f233237g = f17;
        requestLayout();
    }

    public final void b() {
        if (getWidth() >= this.f233236f) {
            this.f233240m = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3) this.effect).a();
            scrollTo(0, 0);
            return;
        }
        this.f233240m = true;
        if (this.f233241n) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3 l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3) this.effect;
            if (l3Var.f233427d == 0) {
                l3Var.f233427d = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3 n3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) l3Var.f233424a;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16695xcdc88f46 c16695xcdc88f46 = n3Var.f233443a;
                java.lang.Runnable runnable = l3Var.f233428e;
                c16695xcdc88f46.removeCallbacks(runnable);
                n3Var.f233443a.postDelayed(runnable, l3Var.f233426c);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f233239i;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j3 getEffect() {
        return this.effect;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.f233240m) {
            if (!(((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3) this.effect).f233424a).f233443a.getScrollX() == 0)) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (!this.f233240m) {
            return 0.0f;
        }
        this.effect.getClass();
        return 1.0f;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m3 getViewProvider() {
        return this.viewProvider;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int save = canvas.save();
        float paddingTop = getPaddingTop();
        android.graphics.Paint paint = this.f233234d;
        canvas.translate(0.0f, paddingTop - paint.getFontMetrics().top);
        canvas.drawText(this.f233235e, 0.0f, 0.0f, paint);
        if (this.f233240m) {
            canvas.translate(this.f233236f + this.f233238h, 0.0f);
            canvas.drawText(this.f233235e, 0.0f, 0.0f, paint);
        }
        canvas.restoreToCount(save);
        if (this.f233240m) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3 l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3) this.effect;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3 n3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) l3Var.f233424a;
            if (n3Var.f233443a.f233239i.isFinished()) {
                n3Var.f233443a.scrollTo(0, 0);
                if (l3Var.f233427d == 2) {
                    l3Var.f233427d = 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16695xcdc88f46 c16695xcdc88f46 = n3Var.f233443a;
                    java.lang.Runnable runnable = l3Var.f233428e;
                    c16695xcdc88f46.removeCallbacks(runnable);
                    n3Var.f233443a.postDelayed(runnable, l3Var.f233426c);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int paddingTop = ((int) this.f233237g) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            float f17 = size;
            float f18 = this.f233236f;
            if (f17 >= f18) {
                size = (int) f18;
            }
        }
        setMeasuredDimension(size, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    /* renamed from: setEffect */
    public final void m67338xa731093(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j3 j3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j3Var, "<set-?>");
        this.effect = j3Var;
    }

    /* renamed from: setText */
    public final void m67339x765074af(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f233235e, str)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f233235e = str;
        a();
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3) this.effect).a();
        scrollTo(0, 0);
        b();
    }

    /* renamed from: setTextBold */
    public final void m67340x3ab833d4(boolean z17) {
        this.f233234d.setFakeBoldText(z17);
    }

    /* renamed from: setTextColor */
    public final void m67341x1c5c5ff4(int i17) {
        android.graphics.Paint paint = this.f233234d;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            invalidate();
        }
    }

    /* renamed from: setTextSize */
    public final void m67342x3abfd950(float f17) {
        android.graphics.Paint paint = this.f233234d;
        if (paint.getTextSize() == f17) {
            return;
        }
        paint.setTextSize(f17);
        a();
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16695xcdc88f46(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f233234d = new android.graphics.Paint(1);
        this.f233235e = "";
        this.f233239i = new android.widget.Scroller(context, new android.view.animation.LinearInterpolator());
        this.f233241n = true;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3(this);
        this.viewProvider = n3Var;
        this.effect = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l3(n3Var);
        this.f233238h = 4 * i65.a.b(context, 8);
    }
}
