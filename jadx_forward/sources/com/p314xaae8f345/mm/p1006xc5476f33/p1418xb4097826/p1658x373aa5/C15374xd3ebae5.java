package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/PageIndicatorView;", "Landroid/view/View;", "", "count", "Ljz5/f0;", "setPageCount", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, "setCurrentPage", "Landroidx/recyclerview/widget/w2;", "<set-?>", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Landroidx/recyclerview/widget/w2;", "getOnScrollListener", "()Landroidx/recyclerview/widget/w2;", "onScrollListener", "Landroidx/recyclerview/widget/h2;", "w", "Landroidx/recyclerview/widget/h2;", "getAdapterDataObserver", "()Landroidx/recyclerview/widget/h2;", "adapterDataObserver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.PageIndicatorView */
/* loaded from: classes13.dex */
public final class C15374xd3ebae5 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f213083d;

    /* renamed from: e, reason: collision with root package name */
    public final int f213084e;

    /* renamed from: f, reason: collision with root package name */
    public final int f213085f;

    /* renamed from: g, reason: collision with root package name */
    public final int f213086g;

    /* renamed from: h, reason: collision with root package name */
    public final float f213087h;

    /* renamed from: i, reason: collision with root package name */
    public int f213088i;

    /* renamed from: m, reason: collision with root package name */
    public int f213089m;

    /* renamed from: n, reason: collision with root package name */
    public float f213090n;

    /* renamed from: o, reason: collision with root package name */
    public float f213091o;

    /* renamed from: p, reason: collision with root package name */
    public int f213092p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f213093q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f213094r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f213095s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f213096t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f213097u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 onScrollListener;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 adapterDataObserver;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f213100x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f213101y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f213102z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15374xd3ebae5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(float f17) {
        android.animation.ValueAnimator valueAnimator = this.f213094r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f213090n, f17);
        ofFloat.setDuration(180L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vr(this));
        ofFloat.start();
        this.f213094r = ofFloat;
    }

    public final void b(int i17, yz5.a aVar) {
        this.f213092p = i17;
        android.animation.ValueAnimator valueAnimator = this.f213093q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f213091o, i17);
        ofFloat.setDuration(180L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wr(this));
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xr(aVar));
        ofFloat.start();
        this.f213093q = ofFloat;
    }

    public final void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 pagerSnapHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagerSnapHelper, "pagerSnapHelper");
        if (this.f213096t) {
            return;
        }
        this.f213096t = true;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.onScrollListener;
        if (w2Var != null) {
            recyclerView.V0(w2Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yr yrVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yr(this, pagerSnapHelper);
        recyclerView.i(yrVar);
        this.onScrollListener = yrVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            m62464x8ee3717e(mo7946xf939df19.mo1894x7e414b06());
            p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 h2Var = this.adapterDataObserver;
            if (h2Var != null) {
                mo7946xf939df19.mo8165x48eac7b3(h2Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zr zrVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zr(this, mo7946xf939df19);
            mo7946xf939df19.mo8163xed962dec(zrVar);
            this.adapterDataObserver = zrVar;
        }
    }

    public final int d(int i17) {
        int min = java.lang.Math.min(this.f213088i, 5);
        int i18 = this.f213088i;
        if (i18 <= min) {
            return 0;
        }
        int i19 = i18 - min;
        return e06.p.f(this.f213092p, e06.p.f(i17 - (min - 2), 0, i19), e06.p.f(i17 - 1, 0, i19));
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 getAdapterDataObserver() {
        return this.adapterDataObserver;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 getOnScrollListener() {
        return this.onScrollListener;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f213093q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f213093q = null;
        android.animation.ValueAnimator valueAnimator2 = this.f213094r;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f213094r = null;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int i17 = this.f213088i;
        if (i17 <= 0) {
            return;
        }
        int i18 = 5;
        int min = java.lang.Math.min(i17, 5);
        float height = getHeight() / 2.0f;
        float f37 = this.f213088i - min;
        float width = getWidth() / 2.0f;
        float f38 = this.f213091o + ((min - 1) / 2.0f);
        float f39 = this.f213084e;
        float f47 = width - (f38 * f39);
        float f48 = min;
        float f49 = f39 * ((f48 / 2.0f) + 0.5f);
        float f57 = width - f49;
        float f58 = width + f49;
        canvas.save();
        canvas.clipRect(f57, 0.0f, f58, getHeight());
        int i19 = this.f213088i;
        int i27 = 0;
        while (i27 < i19) {
            float f59 = (i27 * r9) + f47;
            int i28 = this.f213083d;
            float f66 = i28 * 2;
            if (f59 < f57 - f66 || f59 > f66 + f58) {
                f17 = f48;
                f18 = f57;
                f19 = f37;
                f27 = f58;
                f28 = f47;
            } else {
                float f67 = this.f213091o;
                f18 = f57;
                if (this.f213088i <= i18) {
                    f29 = 1.0f;
                    f27 = f58;
                } else {
                    float f68 = i27 - f67;
                    float f69 = this.f213087h;
                    if (f68 >= 1.0f || f67 <= 0.01f) {
                        f27 = f58;
                        float f76 = (f48 - 1.0f) - 1.0f;
                        if (f68 <= f76 || f67 >= f37 - 0.01f) {
                            f29 = 1.0f;
                        } else {
                            e17 = e06.p.e(f68 - f76, 0.0f, 1.0f) * e06.p.e(f37 - f67, 0.0f, 1.0f);
                            android.animation.TimeInterpolator timeInterpolator = w9.a.f525567a;
                        }
                    } else {
                        f27 = f58;
                        e17 = e06.p.e(1.0f - f68, 0.0f, 1.0f) * e06.p.e(f67, 0.0f, 1.0f);
                        android.animation.TimeInterpolator timeInterpolator2 = w9.a.f525567a;
                    }
                    f29 = (e17 * (f69 - 1.0f)) + 1.0f;
                }
                float e18 = e06.p.e(1.0f - java.lang.Math.abs(i27 - this.f213090n), 0.0f, 1.0f);
                int i29 = this.f213085f;
                float[] fArr = this.f213100x;
                android.graphics.Color.colorToHSV(i29, fArr);
                int i37 = this.f213086g;
                f17 = f48;
                float[] fArr2 = this.f213101y;
                android.graphics.Color.colorToHSV(i37, fArr2);
                float f77 = fArr[0];
                float f78 = fArr2[0];
                f19 = f37;
                if (f78 - f77 > 180.0f) {
                    f28 = f47;
                    f78 -= com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                } else {
                    f28 = f47;
                    if (f77 - f78 > 180.0f) {
                        f77 -= com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                    }
                }
                float f79 = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                float f86 = fArr[1];
                float f87 = f86 + ((fArr2[1] - f86) * e18);
                float f88 = fArr[2];
                float f89 = f88 + ((fArr2[2] - f88) * e18);
                int f96 = e06.p.f(a06.d.b(((i29 >>> 24) & 255) + ((((i37 >>> 24) & 255) - r2) * e18)), 0, 255);
                float[] fArr3 = this.f213102z;
                fArr3[0] = ((f77 + ((f78 - f77) * e18)) + f79) % f79;
                fArr3[1] = f87;
                fArr3[2] = f89;
                int HSVToColor = android.graphics.Color.HSVToColor(f96, fArr3);
                android.graphics.Paint paint = this.f213097u;
                paint.setColor(HSVToColor);
                canvas.drawCircle(f59, height, i28 * f29, paint);
            }
            i27++;
            f57 = f18;
            f58 = f27;
            f48 = f17;
            f47 = f28;
            f37 = f19;
            i18 = 5;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int paddingLeft;
        int paddingRight;
        int min = java.lang.Math.min(this.f213088i, 5);
        int i19 = this.f213083d;
        if (min > 0) {
            paddingRight = (this.f213084e * (min - 1)) + (i19 * 2) + getPaddingLeft();
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        setMeasuredDimension(android.view.View.resolveSize(paddingRight + paddingLeft, i17), android.view.View.resolveSize((i19 * 2) + getPaddingTop() + getPaddingBottom(), i18));
    }

    /* renamed from: setCurrentPage */
    public final void m62463x940fe9e6(int i17) {
        int i18 = this.f213088i;
        if (i18 <= 0) {
            return;
        }
        int f17 = e06.p.f(i17, 0, i18 - 1);
        this.f213089m = f17;
        this.f213090n = f17;
        int d17 = d(f17);
        this.f213092p = d17;
        this.f213091o = d17;
        invalidate();
    }

    /* renamed from: setPageCount */
    public final void m62464x8ee3717e(int i17) {
        int max = java.lang.Math.max(0, i17);
        this.f213088i = max;
        int f17 = e06.p.f(this.f213089m, 0, java.lang.Math.max(0, max - 1));
        this.f213089m = f17;
        this.f213090n = f17;
        int d17 = d(f17);
        this.f213092p = d17;
        this.f213091o = d17;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15374xd3ebae5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f213083d = dimensionPixelSize;
        this.f213084e = (dimensionPixelSize * 2) + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f213085f = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        this.f213086g = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        this.f213087h = 0.75f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f213097u = paint;
        this.f213100x = new float[3];
        this.f213101y = new float[3];
        this.f213102z = new float[3];
    }
}
