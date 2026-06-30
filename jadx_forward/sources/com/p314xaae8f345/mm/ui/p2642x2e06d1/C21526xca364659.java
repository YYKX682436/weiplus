package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.NoMeasuredTextView */
/* loaded from: classes15.dex */
public class C21526xca364659 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee {
    public static final android.text.BoringLayout.Metrics Q;
    public int A;
    public android.graphics.Paint.FontMetricsInt B;
    public boolean C;
    public boolean D;
    public db5.u8 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f279198J;
    public int K;
    public java.lang.String L;
    public int M;
    public int N;
    public db5.v8 P;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f279199d;

    /* renamed from: e, reason: collision with root package name */
    public int f279200e;

    /* renamed from: f, reason: collision with root package name */
    public android.text.Editable.Factory f279201f;

    /* renamed from: g, reason: collision with root package name */
    public android.text.Spannable.Factory f279202g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f279203h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f279204i;

    /* renamed from: m, reason: collision with root package name */
    public db5.t8 f279205m;

    /* renamed from: mText */
    private java.lang.CharSequence f39401x627bb3a;

    /* renamed from: n, reason: collision with root package name */
    public final android.text.TextPaint f279206n;

    /* renamed from: o, reason: collision with root package name */
    public android.text.Layout f279207o;

    /* renamed from: p, reason: collision with root package name */
    public int f279208p;

    /* renamed from: q, reason: collision with root package name */
    public final float f279209q;

    /* renamed from: r, reason: collision with root package name */
    public int f279210r;

    /* renamed from: s, reason: collision with root package name */
    public int f279211s;

    /* renamed from: t, reason: collision with root package name */
    public int f279212t;

    /* renamed from: u, reason: collision with root package name */
    public int f279213u;

    /* renamed from: v, reason: collision with root package name */
    public int f279214v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279215w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f279216x;

    /* renamed from: y, reason: collision with root package name */
    public android.text.BoringLayout f279217y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f279218z;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.measureText("H");
        Q = new android.text.BoringLayout.Metrics();
    }

    public C21526xca364659(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279201f = android.text.Editable.Factory.getInstance();
        this.f279202g = android.text.Spannable.Factory.getInstance();
        this.f279203h = null;
        this.f279205m = db5.t8.NORMAL;
        this.f279208p = 51;
        this.f279209q = 1.0f;
        this.f279210r = Integer.MAX_VALUE;
        this.f279211s = 1;
        this.f279212t = 0;
        this.f279213u = 1;
        this.f279214v = Integer.MAX_VALUE;
        this.f279215w = false;
        this.f279216x = true;
        this.f279218z = false;
        this.C = false;
        this.D = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f279198J = -1;
        this.K = -1;
        this.f39401x627bb3a = "";
        this.f279204i = "";
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f279206n = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        setDrawingCacheEnabled(false);
        this.B = textPaint.getFontMetricsInt();
        e();
        m79267x52d64a5e(true);
        m79252xb86dec4b(null);
    }

    /* renamed from: getDesiredHeight */
    private int m79208x335cfcab() {
        android.text.Layout layout = this.f279207o;
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int m79215x51707585 = m79215x51707585() + m79212xf4837fb();
        int lineTop = layout.getLineTop(lineCount) + m79215x51707585;
        if (this.f279211s == 1) {
            int i17 = this.f279210r;
            if (lineCount > i17) {
                lineTop = layout.getLineTop(i17) + layout.getBottomPadding() + m79215x51707585;
                lineCount = this.f279210r;
            }
        } else {
            lineTop = java.lang.Math.min(lineTop, this.f279210r);
        }
        if (this.f279213u != 1) {
            lineTop = java.lang.Math.max(lineTop, this.f279212t);
        } else if (lineCount < this.f279212t) {
            lineTop += m79226xcf821e31() * (this.f279212t - lineCount);
        }
        return java.lang.Math.max(lineTop, getSuggestedMinimumHeight());
    }

    /* renamed from: setRawTextSize */
    private void m79209x1be6954(float f17) {
        android.text.TextPaint textPaint = this.f279206n;
        if (f17 != textPaint.getTextSize()) {
            textPaint.setTextSize(f17);
            this.B = textPaint.getFontMetricsInt();
            this.A = (int) (java.lang.Math.ceil(r5.descent - r5.ascent) + 2.0d);
            if (this.f279207o != null) {
                d();
                requestLayout();
                invalidate();
            }
        }
    }

    public final void a() {
        int right;
        int m79214xb70a2a4c;
        if (this.f279215w) {
            right = this.f279214v - m79213xdc9a71d7();
            m79214xb70a2a4c = m79214xb70a2a4c();
        } else {
            right = (getRight() - getLeft()) - m79213xdc9a71d7();
            m79214xb70a2a4c = m79214xb70a2a4c();
        }
        int i17 = right - m79214xb70a2a4c;
        if (i17 < 1) {
            i17 = 0;
        }
        int i18 = i17;
        android.text.BoringLayout.Metrics metrics = Q;
        c(i18, metrics, metrics, i18, false);
    }

    public final int b(boolean z17) {
        int measuredHeight;
        int height;
        int i17 = this.f279208p & 112;
        android.text.Layout layout = this.f279207o;
        if (i17 == 48 || (height = layout.getHeight()) >= (measuredHeight = (getMeasuredHeight() - m79222x14c7f93()) - m79221x67e4b2d())) {
            return 0;
        }
        return i17 == 80 ? measuredHeight - height : (measuredHeight - height) >> 1;
    }

    public void c(int i17, android.text.BoringLayout.Metrics metrics, android.text.BoringLayout.Metrics metrics2, int i18, boolean z17) {
        int i19 = i17 < 0 ? 0 : i17;
        int i27 = this.f279208p & 7;
        android.text.Layout.Alignment alignment = i27 != 1 ? i27 != 5 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_CENTER;
        boolean z18 = this.f279203h != null;
        android.text.TextPaint textPaint = this.f279206n;
        if (!z18) {
            this.f279207o = new android.text.StaticLayout(this.f279204i, textPaint, i19, alignment, this.f279209q, 0.0f, this.f279216x);
        } else {
            java.lang.CharSequence charSequence = this.f279204i;
            this.f279207o = new android.text.StaticLayout(charSequence, 0, charSequence.length(), textPaint, i19, alignment, this.f279209q, 0.0f, this.f279216x, this.f279203h, i18);
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        android.text.Layout layout = this.f279207o;
        return layout != null ? layout.getWidth() : super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return (getHeight() - m79215x51707585()) - m79212xf4837fb();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        android.text.Layout layout = this.f279207o;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    public final void d() {
        android.text.Layout layout = this.f279207o;
        if ((layout instanceof android.text.BoringLayout) && this.f279217y == null) {
            this.f279217y = (android.text.BoringLayout) layout;
        }
        this.f279207o = null;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.content.res.ColorStateList colorStateList = this.f279199d;
        if (colorStateList != null && colorStateList.isStateful()) {
            j();
        }
        db5.u8 u8Var = this.E;
        if (u8Var != null) {
            int[] drawableState = getDrawableState();
            android.graphics.drawable.Drawable drawable = u8Var.f310063b;
            if (drawable != null && drawable.isStateful()) {
                u8Var.f310063b.setState(drawableState);
            }
            android.graphics.drawable.Drawable drawable2 = u8Var.f310064c;
            if (drawable2 != null && drawable2.isStateful()) {
                u8Var.f310064c.setState(drawableState);
            }
            android.graphics.drawable.Drawable drawable3 = u8Var.f310065d;
            if (drawable3 != null && drawable3.isStateful()) {
                u8Var.f310065d.setState(drawableState);
            }
            android.graphics.drawable.Drawable drawable4 = u8Var.f310066e;
            if (drawable4 == null || !drawable4.isStateful()) {
                return;
            }
            u8Var.f310066e.setState(drawableState);
        }
    }

    public void e() {
        if (this.A == 0) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = this.B;
            this.A = (int) (java.lang.Math.ceil(fontMetricsInt.descent - fontMetricsInt.ascent) + 2.0d);
        }
    }

    public void f(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        db5.u8 u8Var = this.E;
        if ((drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) ? false : true) {
            if (u8Var == null) {
                u8Var = new db5.u8(this);
                this.E = u8Var;
            }
            android.graphics.drawable.Drawable drawable5 = u8Var.f310065d;
            if (drawable5 != drawable && drawable5 != null) {
                drawable5.setCallback(null);
            }
            u8Var.f310065d = drawable;
            android.graphics.drawable.Drawable drawable6 = u8Var.f310063b;
            if (drawable6 != drawable2 && drawable6 != null) {
                drawable6.setCallback(null);
            }
            u8Var.f310063b = drawable2;
            android.graphics.drawable.Drawable drawable7 = u8Var.f310066e;
            if (drawable7 != drawable3 && drawable7 != null) {
                drawable7.setCallback(null);
            }
            u8Var.f310066e = drawable3;
            android.graphics.drawable.Drawable drawable8 = u8Var.f310064c;
            if (drawable8 != drawable4 && drawable8 != null) {
                drawable8.setCallback(null);
            }
            u8Var.f310064c = drawable4;
            int[] drawableState = getDrawableState();
            android.graphics.Rect rect = u8Var.f310062a;
            if (drawable != null) {
                drawable.setState(drawableState);
                drawable.copyBounds(rect);
                drawable.setCallback(this);
                u8Var.f310069h = rect.width();
                u8Var.f310073l = rect.height();
            } else {
                u8Var.f310073l = 0;
                u8Var.f310069h = 0;
            }
            if (drawable3 != null) {
                drawable3.setState(drawableState);
                drawable3.copyBounds(rect);
                drawable3.setCallback(this);
                u8Var.f310070i = rect.width();
                u8Var.f310074m = rect.height();
            } else {
                u8Var.f310074m = 0;
                u8Var.f310070i = 0;
            }
            if (drawable2 != null) {
                drawable2.setState(drawableState);
                drawable2.copyBounds(rect);
                drawable2.setCallback(this);
                u8Var.f310067f = rect.height();
                u8Var.f310071j = rect.width();
            } else {
                u8Var.f310071j = 0;
                u8Var.f310067f = 0;
            }
            if (drawable4 != null) {
                drawable4.setState(drawableState);
                drawable4.copyBounds(rect);
                drawable4.setCallback(this);
                u8Var.f310068g = rect.height();
                u8Var.f310072k = rect.width();
            } else {
                u8Var.f310072k = 0;
                u8Var.f310068g = 0;
            }
        } else if (u8Var != null) {
            if (u8Var.f310075n == 0) {
                this.E = null;
            } else {
                android.graphics.drawable.Drawable drawable9 = u8Var.f310065d;
                if (drawable9 != null) {
                    drawable9.setCallback(null);
                }
                u8Var.f310065d = null;
                android.graphics.drawable.Drawable drawable10 = u8Var.f310063b;
                if (drawable10 != null) {
                    drawable10.setCallback(null);
                }
                u8Var.f310063b = null;
                android.graphics.drawable.Drawable drawable11 = u8Var.f310066e;
                if (drawable11 != null) {
                    drawable11.setCallback(null);
                }
                u8Var.f310066e = null;
                android.graphics.drawable.Drawable drawable12 = u8Var.f310064c;
                if (drawable12 != null) {
                    drawable12.setCallback(null);
                }
                u8Var.f310064c = null;
                u8Var.f310073l = 0;
                u8Var.f310069h = 0;
                u8Var.f310074m = 0;
                u8Var.f310070i = 0;
                u8Var.f310071j = 0;
                u8Var.f310067f = 0;
                u8Var.f310072k = 0;
                u8Var.f310068g = 0;
            }
        }
        invalidate();
    }

    public void g(java.lang.String str, int i17, int i18) {
        this.L = str;
        this.M = i17;
        this.N = i18;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f279207o == null) {
            return super.getBaseline();
        }
        return m79222x14c7f93() + ((this.f279208p & 112) != 48 ? b(true) : 0) + this.f279207o.getLineBaseline(0);
    }

    /* renamed from: getCompoundDrawablePadding */
    public int m79210x63867032() {
        db5.u8 u8Var = this.E;
        if (u8Var != null) {
            return u8Var.f310075n;
        }
        return 0;
    }

    /* renamed from: getCompoundDrawables */
    public android.graphics.drawable.Drawable[] m79211x3cd42174() {
        db5.u8 u8Var = this.E;
        return u8Var != null ? new android.graphics.drawable.Drawable[]{u8Var.f310065d, u8Var.f310063b, u8Var.f310066e, u8Var.f310064c} : new android.graphics.drawable.Drawable[]{null, null, null, null};
    }

    /* renamed from: getCompoundPaddingBottom */
    public int m79212xf4837fb() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f310064c == null || !this.I) ? getPaddingBottom() : getPaddingBottom() + u8Var.f310075n + u8Var.f310068g;
    }

    /* renamed from: getCompoundPaddingLeft */
    public int m79213xdc9a71d7() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f310065d == null || !this.F) ? getPaddingLeft() : getPaddingLeft() + u8Var.f310075n + u8Var.f310069h;
    }

    /* renamed from: getCompoundPaddingRight */
    public int m79214xb70a2a4c() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f310066e == null || !this.G) ? getPaddingRight() : getPaddingRight() + u8Var.f310075n + u8Var.f310070i;
    }

    /* renamed from: getCompoundPaddingTop */
    public int m79215x51707585() {
        db5.u8 u8Var = this.E;
        return (u8Var == null || u8Var.f310063b == null || !this.H) ? getPaddingTop() : getPaddingTop() + u8Var.f310075n + u8Var.f310067f;
    }

    /* renamed from: getCurrentTextColor */
    public final int m79216xac551033() {
        return this.f279200e;
    }

    /* renamed from: getDefaultEditable */
    public boolean m79217xbafd298f() {
        return false;
    }

    /* renamed from: getDefaultMovementMethod */
    public android.text.method.MovementMethod m79218xd12d2d5b() {
        return null;
    }

    /* renamed from: getEditableText */
    public android.text.Editable m79219x4ef76827() {
        java.lang.CharSequence charSequence = this.f39401x627bb3a;
        if (charSequence instanceof android.text.Editable) {
            return (android.text.Editable) charSequence;
        }
        return null;
    }

    @android.view.ViewDebug.ExportedProperty
    /* renamed from: getEllipsize */
    public android.text.TextUtils.TruncateAt m79220x5c1a2bd7() {
        return this.f279203h;
    }

    /* renamed from: getExtendedPaddingBottom */
    public int m79221x67e4b2d() {
        android.text.Layout layout = this.f279207o;
        if (layout == null || this.f279211s != 1) {
            return m79212xf4837fb();
        }
        if (layout.getLineCount() <= this.f279210r) {
            return m79212xf4837fb();
        }
        int m79215x51707585 = m79215x51707585();
        int m79212xf4837fb = m79212xf4837fb();
        int height = (getHeight() - m79215x51707585) - m79212xf4837fb;
        int lineTop = this.f279207o.getLineTop(this.f279210r);
        if (lineTop >= height) {
            return m79212xf4837fb;
        }
        int i17 = this.f279208p & 112;
        return i17 == 48 ? (m79212xf4837fb + height) - lineTop : i17 == 80 ? m79212xf4837fb : m79212xf4837fb + ((height - lineTop) / 2);
    }

    /* renamed from: getExtendedPaddingTop */
    public int m79222x14c7f93() {
        int i17;
        android.text.Layout layout = this.f279207o;
        if (layout == null || this.f279211s != 1) {
            return m79215x51707585();
        }
        if (layout.getLineCount() <= this.f279210r) {
            return m79215x51707585();
        }
        int m79215x51707585 = m79215x51707585();
        int height = (getHeight() - m79215x51707585) - m79212xf4837fb();
        int lineTop = this.f279207o.getLineTop(this.f279210r);
        return (lineTop < height && (i17 = this.f279208p & 112) != 48) ? i17 == 80 ? (m79215x51707585 + height) - lineTop : m79215x51707585 + ((height - lineTop) / 2) : m79215x51707585;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.f279207o == null) {
            super.getFocusedRect(rect);
            return;
        }
        int m79229xffd93625 = m79229xffd93625();
        if (m79229xffd93625 < 0) {
            super.getFocusedRect(rect);
            return;
        }
        int lineForOffset = this.f279207o.getLineForOffset(m79229xffd93625);
        rect.top = this.f279207o.getLineTop(lineForOffset);
        rect.bottom = this.f279207o.getLineBottom(lineForOffset);
        int primaryHorizontal = (int) this.f279207o.getPrimaryHorizontal(m79229xffd93625);
        rect.left = primaryHorizontal;
        rect.right = primaryHorizontal + 1;
        int m79213xdc9a71d7 = m79213xdc9a71d7();
        int m79222x14c7f93 = m79222x14c7f93();
        if ((this.f279208p & 112) != 48) {
            m79222x14c7f93 += b(false);
        }
        rect.offset(m79213xdc9a71d7, m79222x14c7f93);
    }

    /* renamed from: getGravity */
    public int m79223x4e85ae18() {
        return this.f279208p;
    }

    /* renamed from: getLayout */
    public final android.text.Layout m79224x22f21e20() {
        return this.f279207o;
    }

    /* renamed from: getLineCount */
    public int m79225x92d2fac5() {
        android.text.Layout layout = this.f279207o;
        if (layout != null) {
            return layout.getLineCount();
        }
        return 0;
    }

    /* renamed from: getLineHeight */
    public int m79226xcf821e31() {
        return java.lang.Math.round((this.f279206n.getFontMetricsInt(null) * this.f279209q) + 0.0f);
    }

    /* renamed from: getPaint */
    public android.text.TextPaint m79227x74f59ea8() {
        return this.f279206n;
    }

    /* renamed from: getPaintFlags */
    public int m79228x1c9848bf() {
        return this.f279206n.getFlags();
    }

    @android.view.ViewDebug.ExportedProperty
    /* renamed from: getSelectionEnd */
    public int m79229xffd93625() {
        return android.text.Selection.getSelectionEnd(m79231xfb85ada3());
    }

    @android.view.ViewDebug.ExportedProperty
    /* renamed from: getSelectionStart */
    public int m79230x6f2c472c() {
        return android.text.Selection.getSelectionStart(m79231xfb85ada3());
    }

    @android.view.ViewDebug.CapturedViewProperty
    /* renamed from: getText */
    public java.lang.CharSequence m79231xfb85ada3() {
        return this.f39401x627bb3a;
    }

    /* renamed from: getTextColors */
    public final android.content.res.ColorStateList m79232x410b50f3() {
        return this.f279199d;
    }

    /* renamed from: getTextScaleX */
    public float m79233x5baab3d1() {
        return this.f279206n.getTextScaleX();
    }

    /* renamed from: getTextSize */
    public float m79234x40077844() {
        return this.f279206n.getTextSize();
    }

    /* renamed from: getTotalPaddingBottom */
    public int m79235xe699d6ae() {
        int i17;
        int measuredHeight;
        int height;
        int m79221x67e4b2d = m79221x67e4b2d();
        int i18 = this.f279208p & 112;
        android.text.Layout layout = this.f279207o;
        if (i18 == 80 || (height = layout.getHeight()) >= (measuredHeight = (getMeasuredHeight() - m79222x14c7f93()) - m79221x67e4b2d())) {
            i17 = 0;
        } else {
            i17 = measuredHeight - height;
            if (i18 != 48) {
                i17 >>= 1;
            }
        }
        return m79221x67e4b2d + i17;
    }

    /* renamed from: getTotalPaddingLeft */
    public int m79236xd51a214a() {
        return m79213xdc9a71d7();
    }

    /* renamed from: getTotalPaddingRight */
    public int m79237xce806939() {
        return m79214xb70a2a4c();
    }

    /* renamed from: getTotalPaddingTop */
    public int m79238xd5538bb2() {
        return m79222x14c7f93() + b(true);
    }

    /* renamed from: getTypeface */
    public android.graphics.Typeface m79239x5392760d() {
        return this.f279206n.getTypeface();
    }

    public void h(java.lang.CharSequence charSequence, db5.t8 t8Var) {
        if (charSequence == null) {
            charSequence = "";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        try {
            if (charSequence2.equals(this.f39401x627bb3a)) {
                return;
            }
            if (getMeasuredWidth() > 0 && this.P != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
                charSequence2 = this.P.a(this, charSequence2, this.L, this.M, this.N);
                this.L = null;
            }
            if (charSequence2 instanceof android.text.Spanned) {
                this.f279218z = false;
            } else {
                this.f279218z = true;
            }
            if (t8Var == db5.t8.EDITABLE) {
                charSequence2 = this.f279201f.newEditable(charSequence2);
            } else if (t8Var == db5.t8.SPANNABLE) {
                charSequence2 = this.f279202g.newSpannable(charSequence2);
            }
            int m79214xb70a2a4c = m79214xb70a2a4c() + m79213xdc9a71d7();
            if (this.D) {
                boolean z17 = this.f279215w;
                android.text.TextPaint textPaint = this.f279206n;
                if (z17) {
                    int i17 = this.f279214v;
                    if (getMeasuredWidth() > 0) {
                        i17 = java.lang.Math.min(this.f279214v, getMeasuredWidth());
                    }
                    charSequence2 = android.text.TextUtils.ellipsize(charSequence2, textPaint, i17 - m79214xb70a2a4c, android.text.TextUtils.TruncateAt.END);
                } else if (this.C || getMeasuredWidth() <= 0) {
                    this.C = true;
                } else {
                    charSequence2 = android.text.TextUtils.ellipsize(charSequence2, textPaint, getMeasuredWidth() - m79214xb70a2a4c, android.text.TextUtils.TruncateAt.END);
                }
            }
            this.f279205m = t8Var;
            this.f39401x627bb3a = charSequence2;
            this.f279204i = charSequence2;
            if (this.f279218z) {
                e();
                invalidate();
                return;
            }
            if (getWidth() == 0) {
                requestLayout();
                invalidate();
                return;
            }
            android.text.Layout layout = this.f279207o;
            if (layout == null) {
                a();
                if (this.f279207o.getHeight() != getHeight()) {
                    requestLayout();
                }
                invalidate();
                return;
            }
            int height = layout.getHeight();
            int width = this.f279207o.getWidth();
            android.text.BoringLayout.Metrics metrics = Q;
            c(width, metrics, metrics, width - m79214xb70a2a4c, false);
            if (this.f279203h != android.text.TextUtils.TruncateAt.MARQUEE) {
                if (getLayoutParams().height != -2 && getLayoutParams().height != -1) {
                    invalidate();
                    return;
                }
                int height2 = this.f279207o.getHeight();
                if (height2 == height && height2 == getHeight()) {
                    invalidate();
                    return;
                }
            }
            requestLayout();
            invalidate();
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(charSequence2.toString());
            java.lang.CharSequence charSequence3 = this.f39401x627bb3a;
            objArr[1] = charSequence3 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(charSequence3.toString()) : null;
            objArr[2] = getContext().getClass().getSimpleName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("TextView", th6, "equal err text:%s mText:%s context:%s", objArr);
            jx3.f.INSTANCE.d(25996, 0, 33, ((java.lang.Object) charSequence2) + "_" + getContext().getClass().getSimpleName(), 0, this.f39401x627bb3a);
        }
    }

    public void i(int i17, float f17) {
        android.content.Context context = getContext();
        m79209x1be6954(android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        int bottom;
        int m79215x51707585;
        int i17;
        if (verifyDrawable(drawable)) {
            android.graphics.Rect bounds = drawable.getBounds();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            db5.u8 u8Var = this.E;
            if (u8Var != null) {
                if (drawable == u8Var.f310065d) {
                    m79215x51707585 = m79215x51707585();
                    int bottom2 = ((getBottom() - getTop()) - m79212xf4837fb()) - m79215x51707585;
                    scrollX += getPaddingLeft();
                    i17 = (bottom2 - u8Var.f310073l) / 2;
                } else if (drawable == u8Var.f310066e) {
                    m79215x51707585 = m79215x51707585();
                    int bottom3 = ((getBottom() - getTop()) - m79212xf4837fb()) - m79215x51707585;
                    scrollX += ((getRight() - getLeft()) - getPaddingRight()) - u8Var.f310070i;
                    i17 = (bottom3 - u8Var.f310074m) / 2;
                } else {
                    if (drawable == u8Var.f310063b) {
                        int m79213xdc9a71d7 = m79213xdc9a71d7();
                        scrollX += m79213xdc9a71d7 + (((((getRight() - getLeft()) - m79214xb70a2a4c()) - m79213xdc9a71d7) - u8Var.f310071j) / 2);
                        bottom = getPaddingTop();
                    } else if (drawable == u8Var.f310064c) {
                        int m79213xdc9a71d72 = m79213xdc9a71d7();
                        scrollX += m79213xdc9a71d72 + (((((getRight() - getLeft()) - m79214xb70a2a4c()) - m79213xdc9a71d72) - u8Var.f310072k) / 2);
                        bottom = ((getBottom() - getTop()) - getPaddingBottom()) - u8Var.f310068g;
                    }
                    scrollY += bottom;
                }
                bottom = m79215x51707585 + i17;
                scrollY += bottom;
            }
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
        }
    }

    public final void j() {
        boolean z17 = false;
        int colorForState = this.f279199d.getColorForState(getDrawableState(), 0);
        if (colorForState != this.f279200e) {
            this.f279200e = colorForState;
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        float f17;
        int i19;
        int i27;
        int i28;
        float ceil;
        super.onDraw(canvas);
        int m79213xdc9a71d7 = m79213xdc9a71d7();
        int m79215x51707585 = m79215x51707585();
        int m79214xb70a2a4c = m79214xb70a2a4c();
        int m79212xf4837fb = m79212xf4837fb();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int right = getRight();
        int left = getLeft();
        int bottom = getBottom();
        int top = getTop();
        int width = getWidth();
        int height = getHeight();
        db5.u8 u8Var = this.E;
        android.text.TextPaint textPaint = this.f279206n;
        if (u8Var != null) {
            int i29 = ((bottom - top) - m79212xf4837fb) - m79215x51707585;
            int i37 = ((right - left) - m79214xb70a2a4c) - m79213xdc9a71d7;
            if (!this.F || u8Var.f310065d == null) {
                i18 = height;
            } else {
                canvas.save();
                i18 = height;
                canvas.translate(getPaddingLeft() + scrollX, scrollY + m79215x51707585 + ((i29 - u8Var.f310073l) / 2));
                u8Var.f310065d.draw(canvas);
                canvas.restore();
            }
            if (!this.G || u8Var.f310066e == null) {
                i17 = m79214xb70a2a4c;
                f17 = -1.0f;
            } else {
                canvas.save();
                if (this.f279218z) {
                    java.lang.CharSequence charSequence = this.f39401x627bb3a;
                    i17 = m79214xb70a2a4c;
                    ceil = textPaint.measureText(charSequence, 0, charSequence.length());
                    f17 = ceil;
                } else {
                    i17 = m79214xb70a2a4c;
                    ceil = (float) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(this.f279204i, textPaint));
                    f17 = -1.0f;
                }
                canvas.translate(((scrollX + ceil) - getPaddingRight()) + u8Var.f310076o, m79215x51707585 + scrollY + ((i29 - u8Var.f310074m) / 2) + u8Var.f310077p);
                u8Var.f310066e.draw(canvas);
                canvas.restore();
            }
            if (this.H && u8Var.f310063b != null) {
                canvas.save();
                canvas.translate(scrollX + m79213xdc9a71d7 + ((i37 - u8Var.f310071j) / 2), getPaddingTop() + scrollY);
                u8Var.f310063b.draw(canvas);
                canvas.restore();
            }
            if (this.I && u8Var.f310064c != null) {
                canvas.save();
                canvas.translate(scrollX + m79213xdc9a71d7 + ((i37 - u8Var.f310072k) / 2), (((scrollY + bottom) - top) - getPaddingBottom()) - u8Var.f310068g);
                u8Var.f310064c.draw(canvas);
                canvas.restore();
            }
        } else {
            i17 = m79214xb70a2a4c;
            i18 = height;
            f17 = -1.0f;
        }
        textPaint.setColor(this.f279200e);
        textPaint.drawableState = getDrawableState();
        canvas.save();
        int m79222x14c7f93 = m79222x14c7f93();
        canvas.clipRect(m79213xdc9a71d7 + scrollX, m79222x14c7f93 + scrollY, ((right - left) - i17) + scrollX, ((bottom - top) - m79221x67e4b2d()) + scrollY);
        if ((this.f279208p & 112) != 48) {
            i27 = b(false);
            i19 = b(true);
        } else {
            i19 = 0;
            i27 = 0;
        }
        canvas.translate(m79213xdc9a71d7, m79222x14c7f93 + i27);
        if (this.f279218z) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = this.B;
            int i38 = fontMetricsInt.bottom;
            int i39 = fontMetricsInt.top;
            float f18 = ((i18 - (i38 - i39)) / 2) - i39;
            int i47 = this.f279208p;
            if ((i47 & 7) != 3) {
                int i48 = i47 & 7;
                if (i48 == 1) {
                    if (f17 == -1.0f) {
                        java.lang.CharSequence charSequence2 = this.f39401x627bb3a;
                        f17 = textPaint.measureText(charSequence2, 0, charSequence2.length());
                    }
                    i28 = ((int) ((width - getPaddingRight()) - f17)) / 2;
                } else if (i48 == 5) {
                    if (f17 == -1.0f) {
                        java.lang.CharSequence charSequence3 = this.f39401x627bb3a;
                        f17 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                    }
                    i28 = (int) ((width - getPaddingRight()) - f17);
                }
                java.lang.CharSequence charSequence4 = this.f39401x627bb3a;
                canvas.drawText(charSequence4, 0, charSequence4.length(), i28, f18, textPaint);
            }
            i28 = 0;
            java.lang.CharSequence charSequence42 = this.f39401x627bb3a;
            canvas.drawText(charSequence42, 0, charSequence42.length(), i28, f18, textPaint);
        } else {
            if (this.f279207o == null) {
                a();
            }
            try {
                this.f279207o.draw(canvas, null, null, i19 - i27);
            } catch (java.lang.IndexOutOfBoundsException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("TextView", e17, "", new java.lang.Object[0]);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        java.lang.CharSequence contentDescription = getContentDescription();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = m79231xfb85ada3();
        }
        accessibilityNodeInfo.setText(contentDescription);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        db5.v8 v8Var;
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.C || getMeasuredWidth() <= 0) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L) || (v8Var = this.P) == null) {
            m79270x765074af(android.text.TextUtils.ellipsize(this.f39401x627bb3a, m79227x74f59ea8(), (getMeasuredWidth() - m79214xb70a2a4c()) - m79213xdc9a71d7(), android.text.TextUtils.TruncateAt.END));
        } else {
            java.lang.CharSequence a17 = v8Var.a(this, this.f39401x627bb3a, this.L, this.M, this.N);
            this.L = null;
            m79270x765074af(a17);
        }
        this.C = false;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View.MeasureSpec.getMode(i17);
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (size == 0) {
            setMeasuredDimension(size, this.A);
            return;
        }
        if (this.f279218z) {
            if (this.A == 0) {
                e();
            }
            setMeasuredDimension(size, this.A);
            return;
        }
        android.text.BoringLayout.Metrics metrics = Q;
        int m79213xdc9a71d7 = m79213xdc9a71d7() + m79214xb70a2a4c();
        int i19 = this.f279215w ? this.f279214v - m79213xdc9a71d7 : size - m79213xdc9a71d7;
        android.text.Layout layout = this.f279207o;
        if (layout == null) {
            c(i19, metrics, metrics, i19, false);
        } else {
            if (layout.getWidth() != i19) {
                c(i19, metrics, metrics, i19, false);
            }
        }
        if (mode != 1073741824) {
            int m79208x335cfcab = m79208x335cfcab();
            size2 = mode == Integer.MIN_VALUE ? java.lang.Math.min(m79208x335cfcab, size2) : m79208x335cfcab;
        }
        scrollTo(0, 0);
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setCompoundDrawablePadding */
    public void m79240x79b655a6(int i17) {
        db5.u8 u8Var = this.E;
        if (i17 != 0) {
            if (u8Var == null) {
                u8Var = new db5.u8(this);
                this.E = u8Var;
            }
            u8Var.f310075n = i17;
        } else if (u8Var != null) {
            u8Var.f310075n = i17;
        }
        invalidate();
        requestLayout();
    }

    /* renamed from: setCompoundLeftDrawablesWithIntrinsicBounds */
    public void m79242x7886f493(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        db5.u8 u8Var = this.E;
        if (u8Var == null || u8Var.f310065d != drawable) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            f(drawable, null, null, null);
        }
    }

    /* renamed from: setCompoundRightDrawablesWithIntrinsicBounds */
    public void m79244xc0a6ee2e(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        db5.u8 u8Var = this.E;
        if (u8Var == null || u8Var.f310066e != drawable) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            f(null, null, drawable, null);
        }
    }

    /* renamed from: setDrawDownDrawable */
    public void m79245x90f1ff46(boolean z17) {
        if (this.I != z17) {
            invalidate();
        }
        this.I = z17;
    }

    /* renamed from: setDrawLeftDrawable */
    public void m79246x3e4a45ab(boolean z17) {
        if (this.F != z17) {
            invalidate();
        }
        this.F = z17;
    }

    /* renamed from: setDrawRightDrawable */
    public void m79247xe39e0fb4(boolean z17) {
        if (this.G != z17) {
            invalidate();
        }
        this.G = z17;
    }

    /* renamed from: setDrawTopDrawable */
    public void m79248x3455346d(boolean z17) {
        if (this.H != z17) {
            invalidate();
        }
        this.H = z17;
    }

    /* renamed from: setDrawableLeftPadding */
    public void m79249x9e042ca(int i17) {
        db5.u8 u8Var = this.E;
        if (u8Var == null || i17 == 0) {
            return;
        }
        u8Var.f310076o = i17;
    }

    /* renamed from: setDrawableTopPadding */
    public void m79250x943c6c3c(int i17) {
        db5.u8 u8Var = this.E;
        if (u8Var == null || i17 == 0) {
            return;
        }
        u8Var.f310077p = i17;
    }

    /* renamed from: setEditableFactory */
    public final void m79251xb3470d44(android.text.Editable.Factory factory) {
        this.f279201f = factory;
        m79270x765074af(this.f39401x627bb3a);
    }

    /* renamed from: setEllipsize */
    public void m79252xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        this.f279203h = truncateAt;
        if (this.f279207o != null) {
            d();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: setEllipsizeLater */
    public void m79253xbfbddd01(boolean z17) {
        this.C = z17;
    }

    /* renamed from: setGravity */
    public void m79254xc1f6fb8c(int i17) {
        if ((i17 & 7) == 0) {
            i17 |= 3;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        int i18 = i17 & 7;
        int i19 = this.f279208p;
        boolean z17 = i18 != (i19 & 7);
        if (i17 != i19) {
            invalidate();
        }
        this.f279208p = i17;
        android.text.Layout layout = this.f279207o;
        if (layout == null || !z17) {
            return;
        }
        int width = layout.getWidth();
        android.text.BoringLayout.Metrics metrics = Q;
        c(width, metrics, metrics, (getWidth() - m79213xdc9a71d7()) - m79214xb70a2a4c(), true);
    }

    /* renamed from: setHeight */
    public void m79255xf84e829(int i17) {
        this.f279212t = i17;
        this.f279210r = i17;
        this.f279213u = 2;
        this.f279211s = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setIncludeFontPadding */
    public void m79256x22f05efc(boolean z17) {
        this.f279216x = z17;
        if (this.f279207o != null) {
            d();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: setLayoutCallback */
    public void m79257x600eea91(db5.v8 v8Var) {
        this.P = v8Var;
    }

    /* renamed from: setLines */
    public void m79258x534f0fbd(int i17) {
        this.f279212t = i17;
        this.f279210r = i17;
        this.f279213u = 1;
        this.f279211s = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxHeight */
    public void m79259x25bfb969(int i17) {
        this.f279210r = i17;
        this.f279211s = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxLines */
    public void m79260x8dd5167d(int i17) {
        this.f279210r = i17;
        this.f279211s = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxWidth */
    public void m79261x8e6ff544(int i17) {
        this.f279214v = i17;
        this.f279215w = true;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinHeight */
    public void m79262x53cacfd7(int i17) {
        this.f279212t = i17;
        this.f279213u = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinLines */
    public void m79263x23f67a4f(int i17) {
        this.f279212t = i17;
        this.f279213u = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinWidth */
    public void m79264x24915916(int i17) {
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingLeft() || i19 != getPaddingRight() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            d();
        }
        super.setPadding(i17, i18, i19, i27);
        invalidate();
    }

    /* renamed from: setPaintFlags */
    public void m79265x4abc96cb(int i17) {
        android.text.TextPaint textPaint = this.f279206n;
        if (textPaint.getFlags() != i17) {
            textPaint.setFlags(i17);
            if (this.f279207o != null) {
                d();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setShouldEllipsize */
    public void m79266x3b2de958(boolean z17) {
        this.D = z17;
    }

    /* renamed from: setSingleLine */
    public void m79267x52d64a5e(boolean z17) {
        if (z17) {
            m79258x534f0fbd(1);
        } else {
            m79260x8dd5167d(Integer.MAX_VALUE);
        }
    }

    /* renamed from: setSpannableFactory */
    public final void m79268xe9a3bdee(android.text.Spannable.Factory factory) {
        this.f279202g = factory;
        m79270x765074af(this.f39401x627bb3a);
    }

    /* renamed from: setText */
    public final void m79270x765074af(java.lang.CharSequence charSequence) {
        h(charSequence, this.f279205m);
    }

    /* renamed from: setTextColor */
    public void m79271x1c5c5ff4(int i17) {
        this.f279199d = android.content.res.ColorStateList.valueOf(i17);
        j();
    }

    /* renamed from: setTextKeepState */
    public final void m79273xf7c5941d(java.lang.CharSequence charSequence) {
        db5.t8 t8Var = this.f279205m;
        int m79230x6f2c472c = m79230x6f2c472c();
        int m79229xffd93625 = m79229xffd93625();
        int length = charSequence.length();
        h(charSequence, t8Var);
        if (m79230x6f2c472c >= 0 || m79229xffd93625 >= 0) {
            java.lang.CharSequence charSequence2 = this.f39401x627bb3a;
            if (charSequence2 instanceof android.text.Spannable) {
                android.text.Selection.setSelection((android.text.Spannable) charSequence2, java.lang.Math.max(0, java.lang.Math.min(m79230x6f2c472c, length)), java.lang.Math.max(0, java.lang.Math.min(m79229xffd93625, length)));
            }
        }
    }

    /* renamed from: setTextSize */
    public void m79274x3abfd950(float f17) {
        i(2, f17);
    }

    /* renamed from: setTypeface */
    public void m79275x4e4ad719(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.f279206n;
        if (textPaint.getTypeface() != typeface) {
            textPaint.setTypeface(typeface);
            if (this.f279207o != null) {
                d();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setWidth */
    public void m79276x53e9ee84(int i17) {
        this.f279214v = i17;
        this.f279215w = true;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        db5.u8 u8Var;
        boolean verifyDrawable = super.verifyDrawable(drawable);
        return (verifyDrawable || (u8Var = this.E) == null) ? verifyDrawable : drawable == u8Var.f310065d || drawable == u8Var.f310063b || drawable == u8Var.f310066e || drawable == u8Var.f310064c;
    }

    /* renamed from: setText */
    public final void m79269x765074af(int i17) {
        m79270x765074af(getContext().getResources().getText(i17));
    }

    /* renamed from: setTextColor */
    public void m79272x1c5c5ff4(android.content.res.ColorStateList colorStateList) {
        colorStateList.getClass();
        if (this.f279199d == colorStateList) {
            return;
        }
        this.f279199d = colorStateList;
        j();
    }

    /* renamed from: setCompoundLeftDrawablesWithIntrinsicBounds */
    public void m79241x7886f493(int i17) {
        if (i17 != this.f279198J) {
            this.f279198J = i17;
            m79242x7886f493(getResources().getDrawable(i17));
        }
    }

    /* renamed from: setCompoundRightDrawablesWithIntrinsicBounds */
    public void m79243xc0a6ee2e(int i17) {
        if (i17 != this.K) {
            this.K = i17;
            m79244xc0a6ee2e(getResources().getDrawable(i17));
        }
    }
}
