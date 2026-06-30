package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker */
/* loaded from: classes15.dex */
public class C12792x5854885f extends android.view.View {
    public int A;
    public java.lang.CharSequence[] A1;
    public int B;
    public java.lang.CharSequence[] B1;
    public int C;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 C1;
    public int D;
    public android.os.Handler D1;
    public int E;
    public tl1.g0 E1;
    public int F;
    public int F1;
    public int G;
    public int G1;
    public int H;
    public int H1;
    public java.lang.String I;
    public float I1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f173352J;
    public float J1;
    public java.lang.String K;
    public float K1;
    public java.lang.String L;
    public boolean L1;
    public float M;
    public int M1;
    public float N;
    public int N1;
    public int O1;
    public float P;
    public float P1;
    public float Q;
    public float Q1;
    public boolean R;
    public float R1;
    public boolean S;
    public int S1;
    public boolean T;
    public int T1;
    public boolean U;
    public int U1;
    public boolean V;
    public int V1;
    public boolean W;
    public int W1;

    /* renamed from: d, reason: collision with root package name */
    public int f173353d;

    /* renamed from: e, reason: collision with root package name */
    public int f173354e;

    /* renamed from: f, reason: collision with root package name */
    public int f173355f;

    /* renamed from: g, reason: collision with root package name */
    public int f173356g;

    /* renamed from: h, reason: collision with root package name */
    public int f173357h;

    /* renamed from: i, reason: collision with root package name */
    public int f173358i;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.VelocityTracker f173359l1;

    /* renamed from: m, reason: collision with root package name */
    public int f173360m;

    /* renamed from: n, reason: collision with root package name */
    public int f173361n;

    /* renamed from: o, reason: collision with root package name */
    public int f173362o;

    /* renamed from: p, reason: collision with root package name */
    public int f173363p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f173364p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.graphics.Paint f173365p1;

    /* renamed from: q, reason: collision with root package name */
    public int f173366q;

    /* renamed from: r, reason: collision with root package name */
    public int f173367r;

    /* renamed from: s, reason: collision with root package name */
    public int f173368s;

    /* renamed from: t, reason: collision with root package name */
    public int f173369t;

    /* renamed from: u, reason: collision with root package name */
    public int f173370u;

    /* renamed from: v, reason: collision with root package name */
    public int f173371v;

    /* renamed from: w, reason: collision with root package name */
    public int f173372w;

    /* renamed from: x, reason: collision with root package name */
    public int f173373x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f173374x0;

    /* renamed from: x1, reason: collision with root package name */
    public final android.text.TextPaint f173375x1;

    /* renamed from: y, reason: collision with root package name */
    public int f173376y;

    /* renamed from: y0, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s f173377y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.graphics.Paint f173378y1;

    /* renamed from: z, reason: collision with root package name */
    public int f173379z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String[] f173380z1;

    public C12792x5854885f(android.content.Context context) {
        super(context);
        this.f173353d = -13421773;
        this.f173354e = -695533;
        this.f173355f = -695533;
        this.f173356g = 0;
        this.f173357h = 0;
        this.f173358i = 0;
        this.f173360m = 0;
        this.f173361n = 0;
        this.f173362o = 0;
        this.f173363p = 0;
        this.f173366q = 0;
        this.f173367r = 0;
        this.f173368s = -695533;
        this.f173369t = 2;
        this.f173370u = 0;
        this.f173371v = 0;
        this.f173372w = 3;
        this.f173373x = -1;
        this.f173376y = -1;
        this.f173379z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 150;
        this.H = 8;
        this.M = 1.0f;
        this.N = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = true;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.W = false;
        this.f173364p0 = false;
        this.f173374x0 = true;
        this.f173365p1 = new android.graphics.Paint();
        this.f173375x1 = new android.text.TextPaint();
        this.f173378y1 = new android.graphics.Paint();
        this.F1 = 0;
        this.I1 = 0.0f;
        this.J1 = 0.0f;
        this.K1 = 0.0f;
        this.L1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0;
        k(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f c12792x5854885f, int i17, int i18, java.lang.Object obj) {
        tl1.g0 g0Var;
        c12792x5854885f.n(0);
        if (i17 != i18 && ((obj == null || !(obj instanceof java.lang.Boolean) || ((java.lang.Boolean) obj).booleanValue()) && (g0Var = c12792x5854885f.E1) != null)) {
            int i19 = c12792x5854885f.f173379z;
            ((tl1.f) g0Var).a(c12792x5854885f, i17 + i19, i19 + i18);
        }
        c12792x5854885f.F = i18;
        if (c12792x5854885f.W) {
            c12792x5854885f.W = false;
            c12792x5854885f.c(c12792x5854885f.m53579xb640f2a5() - c12792x5854885f.f173373x, false);
            c12792x5854885f.S = false;
            c12792x5854885f.postInvalidate();
        }
    }

    /* renamed from: getEllipsizeType */
    private android.text.TextUtils.TruncateAt m53573x290a6bb1() {
        java.lang.String str = this.f173352J;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c17 = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c17 = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return android.text.TextUtils.TruncateAt.MIDDLE;
            case 1:
                return android.text.TextUtils.TruncateAt.END;
            case 2:
                return android.text.TextUtils.TruncateAt.START;
            default:
                throw new java.lang.IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    public final void b() {
        int floor = (int) java.lang.Math.floor(this.U1 / this.O1);
        this.S1 = floor;
        this.T1 = -(this.U1 - (floor * this.O1));
    }

    public final void c(int i17, boolean z17) {
        int i18 = i17 - ((this.f173372w - 1) / 2);
        this.S1 = i18;
        int m53578x18502fe4 = m53578x18502fe4();
        if (m53578x18502fe4 <= 0) {
            i18 = 0;
        } else if (z17 && (i18 = i18 % m53578x18502fe4) < 0) {
            i18 += m53578x18502fe4;
        }
        this.S1 = i18;
        int i19 = this.O1;
        if (i19 == 0) {
            this.T = true;
            return;
        }
        this.U1 = i19 * i18;
        if ((i18 + (this.f173372w / 2)) % m53578x18502fe4() < 0) {
            m53578x18502fe4();
        }
        b();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.O1 != 0 && this.f173377y0.f92637a.computeScrollOffset()) {
            this.U1 = this.f173377y0.b();
            b();
            postInvalidate();
        }
    }

    public final int d(android.content.Context context, float f17) {
        return (int) ((f17 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int e(float f17, int i17, int i18) {
        int i19 = (i17 & (-16777216)) >>> 24;
        int i27 = (i17 & 16711680) >>> 16;
        int i28 = (i17 & 65280) >>> 8;
        return ((int) (((i17 & 255) >>> 0) + ((((i18 & 255) >>> 0) - r9) * f17))) | (((int) (i19 + (((((-16777216) & i18) >>> 24) - i19) * f17))) << 24) | (((int) (i27 + ((((16711680 & i18) >>> 16) - i27) * f17))) << 16) | (((int) (i28 + ((((65280 & i18) >>> 8) - i28) * f17))) << 8);
    }

    public final int f(java.lang.CharSequence[] charSequenceArr, android.graphics.Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i17 = 0;
        for (java.lang.CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i17 = java.lang.Math.max(i(charSequence, paint), i17);
            }
        }
        return i17;
    }

    public final android.os.Message g(int i17, int i18, int i19, java.lang.Object obj) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        obtain.arg1 = i18;
        obtain.arg2 = i19;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: getContentByCurrValue */
    public java.lang.String m53574x424b6f85() {
        return this.f173380z1[m53581x754a37bb() - this.f173379z];
    }

    /* renamed from: getDisplayedValues */
    public java.lang.String[] m53575xd75b6b2d() {
        return this.f173380z1;
    }

    /* renamed from: getMaxValue */
    public int m53576x93a5f7e3() {
        return this.A;
    }

    /* renamed from: getMinValue */
    public int m53577x29c75bb5() {
        return this.f173379z;
    }

    /* renamed from: getOneRecycleSize */
    public int m53578x18502fe4() {
        return (this.f173376y - this.f173373x) + 1;
    }

    /* renamed from: getPickedIndexRelativeToRaw */
    public int m53579xb640f2a5() {
        int i17 = this.T1;
        if (i17 == 0) {
            return j(this.U1);
        }
        int i18 = this.O1;
        return i17 < (-i18) / 2 ? j(this.U1 + i18 + i17) : j(this.U1 + i17);
    }

    /* renamed from: getRawContentSize */
    public int m53580xc2cc37c8() {
        java.lang.String[] strArr = this.f173380z1;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    /* renamed from: getValue */
    public int m53581x754a37bb() {
        return m53579xb640f2a5() + this.f173379z;
    }

    /* renamed from: getWrapSelectorWheel */
    public boolean m53582xd12799dc() {
        return this.S;
    }

    /* renamed from: getWrapSelectorWheelAbsolutely */
    public boolean m53583x918b6c40() {
        return this.S && this.V;
    }

    public final float h(android.graphics.Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return java.lang.Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    public final int i(java.lang.CharSequence charSequence, android.graphics.Paint paint) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return (int) (paint.measureText(charSequence.toString()) + 0.5f);
    }

    public final int j(int i17) {
        int i18 = this.O1;
        int i19 = 0;
        if (i18 == 0) {
            return 0;
        }
        int i27 = (i17 / i18) + (this.f173372w / 2);
        int m53578x18502fe4 = m53578x18502fe4();
        boolean z17 = this.S && this.V;
        if (m53578x18502fe4 > 0) {
            if (z17 && (i27 = i27 % m53578x18502fe4) < 0) {
                i27 += m53578x18502fe4;
            }
            i19 = i27;
        }
        if (i19 >= 0 && i19 < m53578x18502fe4()) {
            return i19 + this.f173373x;
        }
        throw new java.lang.IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + i19 + " getOneRecycleSize() : " + m53578x18502fe4() + " mWrapSelectorWheel : " + this.S);
    }

    public final void k(android.content.Context context) {
        this.f173377y0 = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s(context, null);
        this.G = android.view.ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.H = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f173356g == 0) {
            this.f173356g = p(context, 13.0f);
        }
        if (this.f173357h == 0) {
            this.f173357h = p(context, 15.0f);
        }
        if (this.f173358i == 0) {
            this.f173358i = p(context, 14.0f);
        }
        if (this.f173362o == 0) {
            this.f173362o = d(context, 8.0f);
        }
        if (this.f173363p == 0) {
            this.f173363p = d(context, 8.0f);
        }
        int i17 = this.f173368s;
        android.graphics.Paint paint = this.f173365p1;
        paint.setColor(i17);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f173369t);
        int i18 = this.f173353d;
        android.text.TextPaint textPaint = this.f173375x1;
        textPaint.setColor(i18);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        int i19 = this.f173355f;
        android.graphics.Paint paint2 = this.f173378y1;
        paint2.setColor(i19);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setTextSize(this.f173358i);
        int i27 = this.f173372w;
        if (i27 % 2 == 0) {
            this.f173372w = i27 + 1;
        }
        int i28 = this.f173373x;
        if (i28 == -1 || this.f173376y == -1) {
            if (this.f173380z1 == null) {
                this.f173380z1 = r2;
                java.lang.String[] strArr = {"0"};
            }
            java.lang.String[] strArr2 = this.f173380z1;
            this.V = strArr2.length > this.f173372w;
            if (i28 == -1) {
                this.f173373x = 0;
            }
            if (this.f173376y == -1) {
                this.f173376y = strArr2.length - 1;
            }
            o(this.f173373x, this.f173376y, false);
        }
        this.C1 = new tl1.d0(this, "HandlerThread-For-Refreshing");
        this.D1 = new tl1.e0(this);
    }

    public final void l(android.content.Context context, android.util.AttributeSet attributeSet) {
        java.lang.String[] strArr;
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rd.a.f475731a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i17 = 0; i17 < indexCount; i17++) {
            int index = obtainStyledAttributes.getIndex(i17);
            if (index == 17) {
                this.f173372w = obtainStyledAttributes.getInt(index, 3);
            } else if (index == 3) {
                this.f173368s = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == 4) {
                this.f173369t = obtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == 5) {
                this.f173370u = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 6) {
                this.f173371v = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 19) {
                java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(index);
                if (textArray == null) {
                    strArr = null;
                } else {
                    java.lang.String[] strArr2 = new java.lang.String[textArray.length];
                    for (int i18 = 0; i18 < textArray.length; i18++) {
                        strArr2[i18] = textArray[i18].toString();
                    }
                    strArr = strArr2;
                }
                this.f173380z1 = strArr;
            } else if (index == 21) {
                this.f173353d = obtainStyledAttributes.getColor(index, -13421773);
            } else if (index == 22) {
                this.f173354e = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == 20) {
                this.f173355f = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == 25) {
                this.f173356g = obtainStyledAttributes.getDimensionPixelSize(index, p(context, 13.0f));
            } else if (index == 26) {
                this.f173357h = obtainStyledAttributes.getDimensionPixelSize(index, p(context, 15.0f));
            } else if (index == 24) {
                this.f173358i = obtainStyledAttributes.getDimensionPixelSize(index, p(context, 14.0f));
            } else if (index == 14) {
                this.f173373x = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 13) {
                this.f173376y = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 27) {
                this.S = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 18) {
                this.R = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 8) {
                this.I = obtainStyledAttributes.getString(index);
            } else if (index == 0) {
                this.L = obtainStyledAttributes.getString(index);
            } else if (index == 7) {
                this.K = obtainStyledAttributes.getString(index);
            } else if (index == 12) {
                this.f173362o = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 8.0f));
            } else if (index == 11) {
                this.f173363p = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 8.0f));
            } else if (index == 10) {
                this.f173366q = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 2.0f));
            } else if (index == 9) {
                this.f173367r = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 5.0f));
            } else if (index == 1) {
                this.A1 = obtainStyledAttributes.getTextArray(index);
            } else if (index == 2) {
                this.B1 = obtainStyledAttributes.getTextArray(index);
            } else if (index == 16) {
                this.f173364p0 = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 15) {
                this.f173374x0 = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 23) {
                this.f173352J = obtainStyledAttributes.getString(index);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int m(int i17) {
        if (this.S && this.V) {
            return i17;
        }
        int i18 = this.H1;
        return (i17 >= i18 && i17 <= (i18 = this.G1)) ? i17 : i18;
    }

    public final void n(int i17) {
        if (this.F1 == i17) {
            return;
        }
        this.F1 = i17;
    }

    public void o(int i17, int i18, boolean z17) {
        if (i17 > i18) {
            throw new java.lang.IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i17 + ", maxShowIndex is " + i18 + ".");
        }
        java.lang.String[] strArr = this.f173380z1;
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
        }
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i17);
        }
        if (i17 > strArr.length - 1) {
            throw new java.lang.IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f173380z1.length - 1) + " minShowIndex is " + i17);
        }
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i18);
        }
        if (i18 > strArr.length - 1) {
            throw new java.lang.IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f173380z1.length - 1) + " maxShowIndex is " + i18);
        }
        this.f173373x = i17;
        this.f173376y = i18;
        if (z17) {
            this.F = i17 + 0;
            c(0, this.S && this.V);
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C1 == null) {
            this.C1 = new tl1.d0(this, "HandlerThread-For-Refreshing");
            this.D1 = new tl1.e0(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1.mo50299x35224f();
        this.D1 = null;
        if (this.O1 == 0) {
            return;
        }
        if (!this.f173377y0.c()) {
            this.f173377y0.a();
            this.U1 = this.f173377y0.b();
            b();
            int i17 = this.T1;
            if (i17 != 0) {
                int i18 = this.O1;
                if (i17 < (-i18) / 2) {
                    this.U1 = this.U1 + i18 + i17;
                } else {
                    this.U1 += i17;
                }
                b();
            }
            n(0);
        }
        int j17 = j(this.U1);
        int i19 = this.F;
        if (j17 != i19 && this.f173364p0) {
            try {
                tl1.g0 g0Var = this.E1;
                if (g0Var != null) {
                    int i27 = this.f173379z;
                    ((tl1.f) g0Var).a(this, i19 + i27, i27 + j17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.YANumberPicker", e17, "", new java.lang.Object[0]);
            }
        }
        this.F = j17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        float f19;
        int i17;
        super.onDraw(canvas);
        float f27 = 0.0f;
        int i18 = 0;
        while (true) {
            if (i18 >= this.f173372w + 1) {
                break;
            }
            float f28 = this.T1 + (this.O1 * i18);
            int i19 = this.S1 + i18;
            int m53578x18502fe4 = m53578x18502fe4();
            boolean z17 = this.S && this.V;
            if (m53578x18502fe4 <= 0) {
                i19 = 0;
            } else if (z17 && (i19 = i19 % m53578x18502fe4) < 0) {
                i19 += m53578x18502fe4;
            }
            int i27 = this.f173372w / 2;
            if (i18 == i27) {
                f19 = (this.T1 + r0) / this.O1;
                i17 = e(f19, this.f173353d, this.f173354e);
                float f29 = this.f173356g;
                f17 = f29 + ((this.f173357h - f29) * f19);
                float f37 = this.N;
                f18 = f37 + ((this.P - f37) * f19);
            } else if (i18 == i27 + 1) {
                float f38 = 1.0f - f27;
                int e17 = e(f38, this.f173353d, this.f173354e);
                float f39 = this.f173356g;
                float f47 = f39 + ((this.f173357h - f39) * f38);
                float f48 = this.N;
                float f49 = f48 + ((this.P - f48) * f38);
                f19 = f27;
                i17 = e17;
                f17 = f47;
                f18 = f49;
            } else {
                int i28 = this.f173353d;
                f17 = this.f173356g;
                f18 = this.N;
                f19 = f27;
                i17 = i28;
            }
            android.text.TextPaint textPaint = this.f173375x1;
            textPaint.setColor(i17);
            textPaint.setTextSize(f17);
            if (i19 >= 0 && i19 < m53578x18502fe4()) {
                java.lang.CharSequence charSequence = this.f173380z1[i19 + this.f173373x];
                if (this.f173352J != null) {
                    charSequence = android.text.TextUtils.ellipsize(charSequence, textPaint, getWidth() - (this.f173367r * 2), m53573x290a6bb1());
                }
                canvas.drawText(charSequence.toString(), this.R1, f28 + (this.O1 / 2) + f18, textPaint);
            } else if (!android.text.TextUtils.isEmpty(this.K)) {
                canvas.drawText(this.K, this.R1, f28 + (this.O1 / 2) + f18, textPaint);
            }
            i18++;
            f27 = f19;
        }
        if (this.R) {
            float paddingLeft = getPaddingLeft() + this.f173370u;
            float f57 = this.P1;
            float paddingRight = (this.M1 - getPaddingRight()) - this.f173371v;
            float f58 = this.P1;
            android.graphics.Paint paint = this.f173365p1;
            canvas.drawLine(paddingLeft, f57, paddingRight, f58, paint);
            canvas.drawLine(getPaddingLeft() + this.f173370u, this.Q1, (this.M1 - getPaddingRight()) - this.f173371v, this.Q1, paint);
        }
        if (android.text.TextUtils.isEmpty(this.I)) {
            return;
        }
        canvas.drawText(this.I, this.R1 + ((this.B + this.f173360m) / 2) + this.f173362o, ((this.P1 + this.Q1) / 2.0f) + this.Q, this.f173378y1);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        r(false);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        this.V1 = mode;
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode != 1073741824) {
            int paddingLeft = getPaddingLeft() + getPaddingRight() + java.lang.Math.max(this.D, java.lang.Math.max(this.B, this.E) + (((java.lang.Math.max(this.f173360m, this.f173361n) != 0 ? this.f173362o : 0) + java.lang.Math.max(this.f173360m, this.f173361n) + (java.lang.Math.max(this.f173360m, this.f173361n) == 0 ? 0 : this.f173363p) + (this.f173367r * 2)) * 2));
            size = mode == Integer.MIN_VALUE ? java.lang.Math.min(paddingLeft, size) : paddingLeft;
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        this.W1 = mode2;
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 != 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f173372w * (this.C + (this.f173366q * 2)));
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSizeChanged(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r1 < r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cb, code lost:
    
        if (r3 < 0) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final int p(android.content.Context context, float f17) {
        return (int) ((f17 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.view.View
    public void postInvalidate() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            super.postInvalidate();
        }
    }

    public void q() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s sVar = this.f173377y0;
        if (sVar == null || sVar.c()) {
            return;
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s sVar2 = this.f173377y0;
        sVar2.d(0, sVar2.b(), 0, 0, 1);
        this.f173377y0.a();
        postInvalidate();
    }

    public final void r(boolean z17) {
        android.text.TextPaint textPaint = this.f173375x1;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(this.f173357h);
        this.B = f(this.f173380z1, textPaint);
        this.D = f(this.A1, textPaint);
        this.E = f(this.B1, textPaint);
        textPaint.setTextSize(this.f173358i);
        this.f173361n = i(this.L, textPaint);
        textPaint.setTextSize(textSize);
        float textSize2 = textPaint.getTextSize();
        textPaint.setTextSize(this.f173357h);
        this.C = (int) ((textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) + 0.5d);
        textPaint.setTextSize(textSize2);
        if (z17) {
            if (this.V1 == Integer.MIN_VALUE || this.W1 == Integer.MIN_VALUE) {
                this.D1.sendEmptyMessage(3);
            }
        }
    }

    public final void s() {
        this.G1 = 0;
        this.H1 = (-this.f173372w) * this.O1;
        if (this.f173380z1 != null) {
            int m53578x18502fe4 = m53578x18502fe4();
            int i17 = this.f173372w;
            int i18 = this.O1;
            this.G1 = ((m53578x18502fe4 - (i17 / 2)) - 1) * i18;
            this.H1 = (-(i17 / 2)) * i18;
        }
    }

    /* renamed from: setContentTextTypeface */
    public void m53584xaf729c3b(android.graphics.Typeface typeface) {
        this.f173375x1.setTypeface(typeface);
    }

    /* renamed from: setDisplayedValues */
    public void m53585xe3204a1(java.lang.String[] strArr) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.C1;
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(1);
        }
        q();
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if ((this.A - this.f173379z) + 1 > strArr.length) {
            throw new java.lang.IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.A - this.f173379z) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        this.f173380z1 = strArr;
        this.V = strArr.length > this.f173372w;
        r(true);
        this.F = this.f173373x + 0;
        c(0, this.S && this.V);
        postInvalidate();
        this.D1.sendEmptyMessage(3);
    }

    /* renamed from: setDividerColor */
    public void m53586x4d90c14c(int i17) {
        if (this.f173368s == i17) {
            return;
        }
        this.f173368s = i17;
        this.f173365p1.setColor(i17);
        postInvalidate();
    }

    /* renamed from: setDividerHeight */
    public void m53587x6c813c5e(int i17) {
        if (i17 == this.f173369t) {
            return;
        }
        this.f173369t = i17;
        this.f173365p1.setStrokeWidth(i17);
        postInvalidate();
    }

    /* renamed from: setEllipsizeType */
    public void m53588xbbe0d225(java.lang.String str) {
        java.lang.String[] strArr = {"end", "middle", "start"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (strArr[i17].equals(str)) {
                this.f173352J = str;
                return;
            }
        }
        this.f173352J = "end";
    }

    /* renamed from: setFriction */
    public void m53589x21a7257c(float f17) {
        if (f17 > 0.0f) {
            android.view.ViewConfiguration.get(getContext());
            this.M = android.view.ViewConfiguration.getScrollFriction() / f17;
        } else {
            throw new java.lang.IllegalArgumentException("you should set a a positive float friction, now friction is " + f17);
        }
    }

    /* renamed from: setHintText */
    public void m53590x1eba9ad6(java.lang.String str) {
        java.lang.String str2 = this.I;
        if (str2 == null ? str == null : str2.equals(str)) {
            return;
        }
        this.I = str;
        android.graphics.Paint paint = this.f173378y1;
        this.Q = h(paint.getFontMetrics());
        this.f173360m = i(this.I, paint);
        this.D1.sendEmptyMessage(3);
    }

    /* renamed from: setHintTextColor */
    public void m53591x40e6fa2d(int i17) {
        if (this.f173355f == i17) {
            return;
        }
        this.f173355f = i17;
        this.f173378y1.setColor(i17);
        postInvalidate();
    }

    /* renamed from: setHintTextTypeface */
    public void m53592xbc48018d(android.graphics.Typeface typeface) {
        this.f173378y1.setTypeface(typeface);
    }

    /* renamed from: setItemPaddingVertical */
    public void m53593x63a5752(int i17) {
        if (this.f173366q == i17) {
            return;
        }
        this.f173366q = i17;
        postInvalidate();
    }

    /* renamed from: setMaxValue */
    public void m53594x8e5e58ef(int i17) {
        java.lang.String[] strArr = this.f173380z1;
        if (strArr == null) {
            throw new java.lang.NullPointerException("mDisplayedValues should not be null");
        }
        int i18 = this.f173379z;
        if ((i17 - i18) + 1 > strArr.length) {
            throw new java.lang.IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i17 - this.f173379z) + 1) + " and mDisplayedValues.length is " + this.f173380z1.length);
        }
        this.A = i17;
        int i19 = this.f173373x;
        int i27 = (i17 - i18) + i19;
        this.f173376y = i27;
        o(i19, i27, true);
        s();
    }

    /* renamed from: setMinValue */
    public void m53595x247fbcc1(int i17) {
        this.f173379z = i17;
        this.f173373x = 0;
        s();
    }

    /* renamed from: setNormalTextColor */
    public void m53596xd557904d(int i17) {
        if (this.f173353d == i17) {
            return;
        }
        this.f173353d = i17;
        postInvalidate();
    }

    /* renamed from: setOnScrollListener */
    public void m53597x1a2696e2(tl1.f0 f0Var) {
    }

    /* renamed from: setOnValueChangeListenerInScrolling */
    public void m53598x3d59b0fc(tl1.h0 h0Var) {
    }

    /* renamed from: setOnValueChangedListener */
    public void m53599x5dc03d58(tl1.g0 g0Var) {
        this.E1 = g0Var;
    }

    /* renamed from: setOnValueChangedListenerRelativeToRaw */
    public void m53600x248fb1c9(tl1.i0 i0Var) {
    }

    /* renamed from: setPickedIndexRelativeToMin */
    public void m53601x660da9db(int i17) {
        if (i17 < 0 || i17 >= m53578x18502fe4()) {
            return;
        }
        this.F = this.f173373x + i17;
        c(i17, this.S && this.V);
        postInvalidate();
    }

    /* renamed from: setPickedIndexRelativeToRaw */
    public void m53602x660dbbb1(int i17) {
        int i18 = this.f173373x;
        if (i18 <= -1 || i18 > i17 || i17 > this.f173376y) {
            return;
        }
        this.F = i17;
        c(i17 - i18, this.S && this.V);
        postInvalidate();
    }

    /* renamed from: setSelectedTextColor */
    public void m53603x8ad9ad99(int i17) {
        if (this.f173354e == i17) {
            return;
        }
        this.f173354e = i17;
        postInvalidate();
    }

    /* renamed from: setValue */
    public void m53604x53d8522f(int i17) {
        int i18 = this.f173379z;
        if (i17 < i18) {
            throw new java.lang.IllegalArgumentException("should not set a value less than mMinValue, value is " + i17);
        }
        if (i17 <= this.A) {
            m53602x660dbbb1(i17 - i18);
        } else {
            throw new java.lang.IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i17);
        }
    }

    /* renamed from: setWrapSelectorWheel */
    public void m53605xacbda650(boolean z17) {
        if (this.S != z17) {
            if (z17) {
                this.S = z17;
                this.V = this.f173380z1.length > this.f173372w;
                postInvalidate();
            } else {
                if (this.F1 != 0) {
                    this.W = true;
                    return;
                }
                c(m53579xb640f2a5() - this.f173373x, false);
                this.S = false;
                postInvalidate();
            }
        }
    }

    public C12792x5854885f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173353d = -13421773;
        this.f173354e = -695533;
        this.f173355f = -695533;
        this.f173356g = 0;
        this.f173357h = 0;
        this.f173358i = 0;
        this.f173360m = 0;
        this.f173361n = 0;
        this.f173362o = 0;
        this.f173363p = 0;
        this.f173366q = 0;
        this.f173367r = 0;
        this.f173368s = -695533;
        this.f173369t = 2;
        this.f173370u = 0;
        this.f173371v = 0;
        this.f173372w = 3;
        this.f173373x = -1;
        this.f173376y = -1;
        this.f173379z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 150;
        this.H = 8;
        this.M = 1.0f;
        this.N = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = true;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.W = false;
        this.f173364p0 = false;
        this.f173374x0 = true;
        this.f173365p1 = new android.graphics.Paint();
        this.f173375x1 = new android.text.TextPaint();
        this.f173378y1 = new android.graphics.Paint();
        this.F1 = 0;
        this.I1 = 0.0f;
        this.J1 = 0.0f;
        this.K1 = 0.0f;
        this.L1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0;
        l(context, attributeSet);
        k(context);
    }

    public C12792x5854885f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173353d = -13421773;
        this.f173354e = -695533;
        this.f173355f = -695533;
        this.f173356g = 0;
        this.f173357h = 0;
        this.f173358i = 0;
        this.f173360m = 0;
        this.f173361n = 0;
        this.f173362o = 0;
        this.f173363p = 0;
        this.f173366q = 0;
        this.f173367r = 0;
        this.f173368s = -695533;
        this.f173369t = 2;
        this.f173370u = 0;
        this.f173371v = 0;
        this.f173372w = 3;
        this.f173373x = -1;
        this.f173376y = -1;
        this.f173379z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 150;
        this.H = 8;
        this.M = 1.0f;
        this.N = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = true;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.W = false;
        this.f173364p0 = false;
        this.f173374x0 = true;
        this.f173365p1 = new android.graphics.Paint();
        this.f173375x1 = new android.text.TextPaint();
        this.f173378y1 = new android.graphics.Paint();
        this.F1 = 0;
        this.I1 = 0.0f;
        this.J1 = 0.0f;
        this.K1 = 0.0f;
        this.L1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0;
        l(context, attributeSet);
        k(context);
    }
}
