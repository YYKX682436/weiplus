package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5;

/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView */
/* loaded from: classes15.dex */
public class C16641x95e58cfe extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {
    public android.animation.ValueAnimator A;
    public android.view.GestureDetector B;
    public android.widget.Scroller C;
    public float D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f232362J;
    public int K;
    public boolean L;
    public final int M;
    public final int N;
    public int P;
    public int Q;
    public final android.view.GestureDetector.SimpleOnGestureListener R;
    public final java.lang.Runnable S;

    /* renamed from: g, reason: collision with root package name */
    public ll3.h1 f232363g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f232364h;

    /* renamed from: i, reason: collision with root package name */
    public final android.text.TextPaint f232365i;

    /* renamed from: m, reason: collision with root package name */
    public final android.text.TextPaint f232366m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint.FontMetrics f232367n;

    /* renamed from: o, reason: collision with root package name */
    public long f232368o;

    /* renamed from: p, reason: collision with root package name */
    public int f232369p;

    /* renamed from: q, reason: collision with root package name */
    public float f232370q;

    /* renamed from: r, reason: collision with root package name */
    public final int f232371r;

    /* renamed from: s, reason: collision with root package name */
    public int f232372s;

    /* renamed from: t, reason: collision with root package name */
    public float f232373t;

    /* renamed from: u, reason: collision with root package name */
    public final int f232374u;

    /* renamed from: v, reason: collision with root package name */
    public int f232375v;

    /* renamed from: w, reason: collision with root package name */
    public final int f232376w;

    /* renamed from: x, reason: collision with root package name */
    public int f232377x;

    /* renamed from: y, reason: collision with root package name */
    public int f232378y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f232379z;

    public C16641x95e58cfe(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        h(null);
    }

    /* renamed from: getCenterLine */
    private int m67249x337f75df() {
        float f17 = Float.MAX_VALUE;
        int i17 = 0;
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f232364h).size(); i18++) {
            if (java.lang.Math.abs(this.D - e(i18)) < f17) {
                f17 = java.lang.Math.abs(this.D - e(i18));
                i17 = i18;
            }
        }
        return i17;
    }

    /* renamed from: getLrcWidth */
    private float m67250x8b4a919f() {
        return this.Q - 0.0f;
    }

    public final void b() {
        j(m67249x337f75df(), 100L);
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        if (this.C.computeScrollOffset()) {
            this.D = this.C.getCurrY();
            invalidate();
        }
        if (this.H && this.C.isFinished()) {
            this.H = false;
            if (!g() || this.G) {
                return;
            }
            b();
            postDelayed(this.S, 1000L);
        }
    }

    public final float e(int i17) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f232364h;
        if (((wl3.p) arrayList.get(i17)).f528612f == Float.MIN_VALUE) {
            float f17 = this.N;
            for (int i18 = 1; i18 <= i17; i18++) {
                android.text.StaticLayout staticLayout = ((wl3.p) arrayList.get(i18 - 1)).f528611e;
                int i19 = 0;
                int height = staticLayout == null ? 0 : staticLayout.getHeight();
                android.text.StaticLayout staticLayout2 = ((wl3.p) arrayList.get(i18)).f528611e;
                if (staticLayout2 != null) {
                    i19 = staticLayout2.getHeight();
                }
                f17 -= ((height + i19) >> 1) + this.K;
            }
            ((wl3.p) arrayList.get(i17)).f528612f = f17;
        }
        return ((wl3.p) arrayList.get(i17)).f528612f;
    }

    public boolean g() {
        return !this.f232364h.isEmpty();
    }

    public final void h(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bl3.i.f103263a);
        this.f232373t = obtainStyledAttributes.getDimension(9, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a4d));
        float dimension = obtainStyledAttributes.getDimension(5, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a4d));
        this.f232370q = dimension;
        if (dimension == 0.0f) {
            this.f232370q = this.f232373t;
        }
        this.K = this.M;
        int integer = getResources().getInteger(com.p314xaae8f345.mm.R.C30862x74b5813e.f569351o);
        long j17 = obtainStyledAttributes.getInt(0, integer);
        this.f232368o = j17;
        if (j17 < 0) {
            j17 = integer;
        }
        this.f232368o = j17;
        this.f232369p = obtainStyledAttributes.getColor(4, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560865wo));
        this.f232372s = obtainStyledAttributes.getColor(1, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560864wn));
        this.f232375v = obtainStyledAttributes.getColor(14, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560868wr));
        java.lang.String string = obtainStyledAttributes.getString(3);
        this.f232379z = string;
        this.f232379z = android.text.TextUtils.isEmpty(string) ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573943gj1) : this.f232379z;
        obtainStyledAttributes.getColor(12, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560867wq));
        float dimension2 = obtainStyledAttributes.getDimension(13, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a4g));
        this.f232377x = obtainStyledAttributes.getColor(10, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560866wp));
        float dimension3 = obtainStyledAttributes.getDimension(11, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a4e));
        this.I = obtainStyledAttributes.getInteger(8, 1);
        obtainStyledAttributes.recycle();
        this.f232378y = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a4f);
        android.text.TextPaint textPaint = this.f232365i;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f232362J);
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        android.text.TextPaint textPaint2 = this.f232366m;
        textPaint2.setAntiAlias(true);
        textPaint2.setTextSize(dimension3);
        textPaint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        textPaint2.setStrokeWidth(dimension2);
        textPaint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f232367n = textPaint2.getFontMetrics();
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), this.R);
        this.B = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.C = new android.widget.Scroller(getContext());
        i();
    }

    public final void i() {
        if (g() || this.Q == 0 || this.L) {
            return;
        }
        if (this.f232363g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayerLyricView", "null == lyricObj, maybe you not setLyricObj, check ！！！");
            return;
        }
        for (int i17 = 0; i17 < this.f232363g.e(); i17++) {
            ll3.f1 d17 = this.f232363g.d(i17);
            if (!d17.a()) {
                long j17 = d17.f400700a;
                java.lang.String str = d17.f400701b;
                wl3.p pVar = new wl3.p(this, j17, str);
                android.text.TextPaint textPaint = this.f232365i;
                int m67250x8b4a919f = (int) m67250x8b4a919f();
                int i18 = this.I;
                android.text.Layout.Alignment alignment = i18 != 1 ? i18 != 2 ? android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
                if (!android.text.TextUtils.isEmpty(null)) {
                    str = str + "\nnull";
                }
                pVar.f528611e = new android.text.StaticLayout(str, textPaint, m67250x8b4a919f, alignment, 0.0f, 0.0f, false);
                pVar.f528612f = Float.MIN_VALUE;
                this.f232364h.add(pVar);
            }
        }
        this.D = this.N;
        this.L = true;
    }

    public final void j(int i17, long j17) {
        float e17 = e(i17);
        android.animation.ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A.end();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.D, e17);
        this.A = ofFloat;
        ofFloat.setDuration(j17);
        this.A.setInterpolator(new android.view.animation.LinearInterpolator());
        this.A.addUpdateListener(new wl3.o(this));
        try {
            java.lang.reflect.Field declaredField = android.animation.ValueAnimator.class.getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            declaredField.setFloat(null, 1.0f);
        } catch (java.lang.Exception unused) {
        }
        this.A.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.S);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.P == 0 || this.Q == 0) {
            this.P = getMeasuredHeight();
            this.Q = getMeasuredWidth();
        }
        ll3.h1 h1Var = this.f232363g;
        android.text.TextPaint textPaint = this.f232365i;
        int i17 = this.N;
        if (h1Var == null) {
            textPaint.setColor(this.f232372s);
            android.text.StaticLayout staticLayout = new android.text.StaticLayout(this.f232379z, textPaint, (int) m67250x8b4a919f(), android.text.Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, i17 - (staticLayout.getHeight() >> 1));
            staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        i();
        int m67249x337f75df = m67249x337f75df();
        boolean z17 = this.F;
        java.util.List list = this.f232364h;
        if (z17) {
            android.text.TextPaint textPaint2 = this.f232366m;
            textPaint2.setColor(this.f232377x);
            long j17 = ((wl3.p) ((java.util.ArrayList) list).get(m67249x337f75df)).f528610d;
            java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf((int) (j17 / 60000))) + ":" + java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf((int) ((j17 / 1000) % 60)));
            float f17 = this.Q - this.f232378y;
            android.graphics.Paint.FontMetrics fontMetrics = this.f232367n;
            canvas.drawText(str, f17, i17 - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), textPaint2);
        }
        canvas.translate(0.0f, this.D);
        int i18 = 0;
        float f18 = 0.0f;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i18 >= arrayList.size()) {
                return;
            }
            if (i18 > 0) {
                android.text.StaticLayout staticLayout2 = ((wl3.p) arrayList.get(i18 - 1)).f528611e;
                int height = staticLayout2 == null ? 0 : staticLayout2.getHeight();
                f18 += ((height + (((wl3.p) arrayList.get(i18)).f528611e == null ? 0 : r8.getHeight())) >> 1) + this.K;
            }
            if (i18 == this.E) {
                textPaint.setTextSize(this.f232373t);
                textPaint.setColor(this.f232372s);
                textPaint.setFakeBoldText(true);
                textPaint.setAlpha(this.f232374u);
            } else if (this.F && i18 == m67249x337f75df) {
                textPaint.setShader(null);
                textPaint.setColor(this.f232375v);
                textPaint.setAlpha(this.f232376w);
            } else {
                textPaint.setShader(null);
                textPaint.setFakeBoldText(false);
                textPaint.setTextSize(this.f232370q);
                textPaint.setColor(this.f232369p);
                textPaint.setAlpha(this.f232371r);
            }
            android.text.StaticLayout staticLayout3 = ((wl3.p) arrayList.get(i18)).f528611e;
            canvas.save();
            canvas.translate(0.0f, f18 - (staticLayout3.getHeight() >> 1));
            staticLayout3.draw(canvas);
            canvas.restore();
            i18++;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            i();
            if (g()) {
                j(this.E, 0L);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.P = i18;
        this.Q = i17;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.G = false;
            if (g() && !this.H) {
                b();
                postDelayed(this.S, 1000L);
            }
        }
        android.view.GestureDetector gestureDetector = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* renamed from: setCurrentTextSize */
    public void m67251x65b73ea5(float f17) {
        this.f232373t = f17;
    }

    /* renamed from: setCurrentTime */
    public void m67252x9411da24(long j17) {
        wl3.l lVar = new wl3.l(this, j17);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            lVar.run();
        } else {
            post(lVar);
        }
    }

    /* renamed from: setLyricObj */
    public void m67253x12e1de9a(ll3.h1 h1Var) {
        this.f232363g = h1Var;
        invalidate();
    }

    /* renamed from: setNormalTextSize */
    public void m67254xe5e0b9d7(float f17) {
        this.f232370q = f17;
    }

    /* renamed from: setTimeTextColor */
    public void m67255x89d8f4a7(int i17) {
        this.f232377x = i17;
        postInvalidate();
    }

    public C16641x95e58cfe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f232364h = new java.util.ArrayList();
        this.f232365i = new android.text.TextPaint();
        this.f232366m = new android.text.TextPaint();
        this.f232371r = 256;
        this.f232374u = 256;
        this.f232376w = 256;
        this.f232362J = (int) this.f232370q;
        this.K = 0;
        this.L = false;
        this.M = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 24);
        this.N = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 52);
        this.R = new wl3.m(this);
        this.S = new wl3.n(this);
        h(attributeSet);
    }
}
