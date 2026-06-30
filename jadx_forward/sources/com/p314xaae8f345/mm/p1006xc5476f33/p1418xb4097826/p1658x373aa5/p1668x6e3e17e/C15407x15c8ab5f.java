package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderPageIndicatorView;", "Landroid/view/View;", "Lym5/o1;", "", "getRemainingDurationMs", "", "isShow", "Ljz5/f0;", "setShowOnlyOneIndicator", "", "count", "setCount", "getCount", ya.b.f77479x42930b2, "setCurrentIndex", "getCurrentIndex", "getView", "Lym5/n1;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnSelectedPageListener", "getOnSelectedPageListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView */
/* loaded from: classes2.dex */
public final class C15407x15c8ab5f extends android.view.View implements ym5.o1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f213893d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f213894e;

    /* renamed from: f, reason: collision with root package name */
    public int f213895f;

    /* renamed from: g, reason: collision with root package name */
    public int f213896g;

    /* renamed from: h, reason: collision with root package name */
    public float f213897h;

    /* renamed from: i, reason: collision with root package name */
    public final float f213898i;

    /* renamed from: m, reason: collision with root package name */
    public final float f213899m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f213900n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15407x15c8ab5f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(long j17) {
        android.animation.ValueAnimator valueAnimator = this.f213900n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new nx2.g(this));
        ofFloat.start();
        this.f213900n = ofFloat;
    }

    @Override // ym5.o1
    /* renamed from: getCount, reason: from getter */
    public int getF213895f() {
        return this.f213895f;
    }

    /* renamed from: getCurrentIndex, reason: from getter */
    public int getF213896g() {
        return this.f213896g;
    }

    /* renamed from: getOnSelectedPageListener */
    public ym5.n1 m62761x4f17d613() {
        return null;
    }

    /* renamed from: getRemainingDurationMs */
    public final long m62762xfed12dba() {
        android.animation.ValueAnimator valueAnimator = this.f213900n;
        if (valueAnimator == null) {
            return 0L;
        }
        long duration = valueAnimator.getDuration() - (((float) r3) * this.f213897h);
        if (duration < 0) {
            return 0L;
        }
        return duration;
    }

    @Override // ym5.o1
    /* renamed from: getView */
    public android.view.View mo62751xfb86a31b() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f213900n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f213895f == 0) {
            return;
        }
        float f17 = 2;
        int i17 = this.f213895f;
        float f18 = this.f213899m;
        float width = ((getWidth() - (0.0f * f17)) - ((i17 - 1) * f18)) / i17;
        float height = getHeight() / 2.0f;
        int i18 = this.f213895f;
        int i19 = 0;
        float f19 = 0.0f;
        while (i19 < i18) {
            float f27 = f19 + width;
            float f28 = height / f17;
            float f29 = height - f28;
            float f37 = height + f28;
            float f38 = this.f213898i;
            int i27 = i19;
            canvas.drawRoundRect(f19, f29, f27, f37, f38, f38, this.f213893d);
            int i28 = this.f213896g;
            android.graphics.Paint paint = this.f213894e;
            if (i27 == i28) {
                float f39 = this.f213897h;
                z17 = false;
                if (f39 > 0.0f) {
                    float f47 = this.f213898i;
                    canvas.drawRoundRect(f19, f29, f19 + (f39 * width), f37, f47, f47, paint);
                    f19 += width + f18;
                    i19 = i27 + 1;
                }
            } else {
                z17 = false;
            }
            if (i27 < i28) {
                float f48 = this.f213898i;
                canvas.drawRoundRect(f19, f29, f27, f37, f48, f48, paint);
            }
            f19 += width + f18;
            i19 = i27 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f213895f == 0) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), android.view.View.MeasureSpec.getSize(i18));
        }
    }

    @Override // ym5.o1
    /* renamed from: setCount */
    public void mo62752x52d311cd(int i17) {
        this.f213895f = i17;
    }

    @Override // ym5.o1
    /* renamed from: setCurrentIndex */
    public void mo62753xed908c5b(int i17) {
        if (this.f213896g != i17) {
            this.f213896g = i17;
            this.f213897h = 0.0f;
            invalidate();
        }
    }

    @Override // ym5.o1
    /* renamed from: setOnSelectedPageListener */
    public void mo62754x815b721f(ym5.n1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    @Override // ym5.o1
    /* renamed from: setShowOnlyOneIndicator */
    public void mo62755xc31dc4b4(boolean z17) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15407x15c8ab5f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f213893d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f213894e = paint2;
        this.f213898i = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        this.f213899m = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }
}
