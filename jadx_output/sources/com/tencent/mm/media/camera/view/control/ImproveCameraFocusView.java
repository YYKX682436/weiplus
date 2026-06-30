package com.tencent.mm.media.camera.view.control;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB%\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001eJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/media/camera/view/control/ImproveCameraFocusView;", "Landroid/view/View;", "Lcs0/i;", "Ljz5/l;", "", "getLineHeight", "", "color", "Ljz5/f0;", "setFocusColor", "orientation", "setOrientation", "o", "I", "getViewWidth", "()I", "setViewWidth", "(I)V", "viewWidth", "p", "getViewHeight", "setViewHeight", "viewHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveCameraFocusView extends android.view.View implements cs0.i {
    public android.animation.ValueAnimator A;
    public boolean B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public int f68912d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f68913e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f68915g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f68916h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f68917i;

    /* renamed from: m, reason: collision with root package name */
    public long f68918m;

    /* renamed from: n, reason: collision with root package name */
    public long f68919n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int viewWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int viewHeight;

    /* renamed from: q, reason: collision with root package name */
    public int f68922q;

    /* renamed from: r, reason: collision with root package name */
    public int f68923r;

    /* renamed from: s, reason: collision with root package name */
    public int f68924s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68925t;

    /* renamed from: u, reason: collision with root package name */
    public float f68926u;

    /* renamed from: v, reason: collision with root package name */
    public float f68927v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f68928w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f68929x;

    /* renamed from: y, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f68930y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.r2 f68931z;

    public ImproveCameraFocusView(android.content.Context context) {
        super(context);
        this.f68912d = android.graphics.Color.parseColor("#FFFFFFFF");
        this.f68913e = new android.graphics.Paint();
        this.f68930y = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }

    private final jz5.l getLineHeight() {
        int i17 = this.C;
        if (i17 == 90 || i17 == 270) {
            float f17 = this.f68926u;
            float f18 = this.f68927v;
            return new jz5.l(java.lang.Float.valueOf(f17 - f18), java.lang.Float.valueOf(f17 + f18));
        }
        float f19 = this.f68926u;
        float f27 = this.f68927v;
        return new jz5.l(java.lang.Float.valueOf(f19 + f27), java.lang.Float.valueOf(f19 - f27));
    }

    @Override // cs0.i
    public void a(float f17, float f18, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraFocusView", "doAnimation >> " + f17 + ", " + f18 + ", " + z17);
        reset();
        this.B = z17;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveCameraFocusView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f17) - (this.viewWidth / 2);
        marginLayoutParams.topMargin = ((int) f18) - (this.viewHeight / 2);
        setLayoutParams(layoutParams);
        setVisibility(0);
        this.f68914f = true;
        this.f68915g = false;
        this.f68916h = false;
        this.f68917i = false;
        this.f68918m = java.lang.System.currentTimeMillis();
        invalidate();
    }

    @Override // cs0.i
    public void b(float f17, cs0.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraFocusView", "showExpoLine >> mStayPeriod: " + this.f68916h + ", " + f17 + ", " + this.f68927v + (char) 65292 + this.f68928w);
        if (!this.f68929x && this.f68916h) {
            if (f17 == 0.0f) {
                if (this.f68927v == 0.0f) {
                    d();
                    this.f68925t = true;
                    return;
                }
            }
        }
        if (this.f68916h) {
            if (!(f17 == this.f68927v) && !this.f68928w) {
                d();
                this.f68928w = true;
                this.f68925t = true;
                float f18 = this.f68927v;
                float f19 = f17 - f18;
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                this.A = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(50L);
                }
                android.animation.ValueAnimator valueAnimator = this.A;
                if (valueAnimator != null) {
                    valueAnimator.setInterpolator(new android.view.animation.AccelerateInterpolator());
                }
                android.animation.ValueAnimator valueAnimator2 = this.A;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new cs0.l(this, f18, f19));
                }
                android.animation.ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.addListener(new cs0.m(this, hVar));
                }
                android.animation.ValueAnimator valueAnimator4 = this.A;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                    return;
                }
                return;
            }
        }
        if (hVar != null) {
            ((cs0.c) hVar).a(false);
        }
    }

    @Override // cs0.i
    public void c(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        this.viewWidth = i17;
        this.viewHeight = i18;
        this.f68922q = i17 / 2;
        int i19 = i18 / 2;
        this.f68923r = i19;
        this.f68926u = i19 / 2.0f;
        this.f68924s = i65.a.b(getContext(), 1);
        int i27 = this.f68912d;
        android.graphics.Paint paint = this.f68913e;
        paint.setColor(i27);
        paint.setStrokeWidth(this.f68924s);
        setLayerType(1, null);
    }

    public final void d() {
        kotlinx.coroutines.r2 r2Var = this.f68931z;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f68931z = null;
        this.f68931z = kotlinx.coroutines.l.d(this.f68930y, null, null, new cs0.k(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0309  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.media.camera.view.control.ImproveCameraFocusView.draw(android.graphics.Canvas):void");
    }

    public final int getViewHeight() {
        return this.viewHeight;
    }

    public final int getViewWidth() {
        return this.viewWidth;
    }

    @Override // cs0.i
    public void reset() {
        this.f68928w = false;
        this.f68925t = false;
        kotlinx.coroutines.r2 r2Var = this.f68931z;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f68931z = null;
        this.f68927v = 0.0f;
        android.animation.ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A = null;
        this.f68919n = 0L;
        this.f68929x = false;
    }

    @Override // cs0.i
    public void setFocusColor(int i17) {
        if (i17 != 0) {
            this.f68912d = i17;
            this.f68913e.setColor(i17);
        }
    }

    @Override // cs0.i
    public void setOrientation(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraFocusView", "setCurrentOrientation >> " + i17);
        if (this.C != i17) {
            this.C = i17;
        }
    }

    public final void setViewHeight(int i17) {
        this.viewHeight = i17;
    }

    public final void setViewWidth(int i17) {
        this.viewWidth = i17;
    }

    public ImproveCameraFocusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68912d = android.graphics.Color.parseColor("#FFFFFFFF");
        this.f68913e = new android.graphics.Paint();
        this.f68930y = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }

    public ImproveCameraFocusView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68912d = android.graphics.Color.parseColor("#FFFFFFFF");
        this.f68913e = new android.graphics.Paint();
        this.f68930y = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }
}
