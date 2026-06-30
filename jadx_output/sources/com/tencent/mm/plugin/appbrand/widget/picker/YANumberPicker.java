package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public class YANumberPicker extends android.view.View {
    public int A;
    public java.lang.CharSequence[] A1;
    public int B;
    public java.lang.CharSequence[] B1;
    public int C;
    public com.tencent.mm.sdk.platformtools.n3 C1;
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
    public java.lang.String f91819J;
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
    public int f91820d;

    /* renamed from: e, reason: collision with root package name */
    public int f91821e;

    /* renamed from: f, reason: collision with root package name */
    public int f91822f;

    /* renamed from: g, reason: collision with root package name */
    public int f91823g;

    /* renamed from: h, reason: collision with root package name */
    public int f91824h;

    /* renamed from: i, reason: collision with root package name */
    public int f91825i;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.VelocityTracker f91826l1;

    /* renamed from: m, reason: collision with root package name */
    public int f91827m;

    /* renamed from: n, reason: collision with root package name */
    public int f91828n;

    /* renamed from: o, reason: collision with root package name */
    public int f91829o;

    /* renamed from: p, reason: collision with root package name */
    public int f91830p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f91831p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.graphics.Paint f91832p1;

    /* renamed from: q, reason: collision with root package name */
    public int f91833q;

    /* renamed from: r, reason: collision with root package name */
    public int f91834r;

    /* renamed from: s, reason: collision with root package name */
    public int f91835s;

    /* renamed from: t, reason: collision with root package name */
    public int f91836t;

    /* renamed from: u, reason: collision with root package name */
    public int f91837u;

    /* renamed from: v, reason: collision with root package name */
    public int f91838v;

    /* renamed from: w, reason: collision with root package name */
    public int f91839w;

    /* renamed from: x, reason: collision with root package name */
    public int f91840x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f91841x0;

    /* renamed from: x1, reason: collision with root package name */
    public final android.text.TextPaint f91842x1;

    /* renamed from: y, reason: collision with root package name */
    public int f91843y;

    /* renamed from: y0, reason: collision with root package name */
    public androidx.core.widget.s f91844y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.graphics.Paint f91845y1;

    /* renamed from: z, reason: collision with root package name */
    public int f91846z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String[] f91847z1;

    public YANumberPicker(android.content.Context context) {
        super(context);
        this.f91820d = -13421773;
        this.f91821e = -695533;
        this.f91822f = -695533;
        this.f91823g = 0;
        this.f91824h = 0;
        this.f91825i = 0;
        this.f91827m = 0;
        this.f91828n = 0;
        this.f91829o = 0;
        this.f91830p = 0;
        this.f91833q = 0;
        this.f91834r = 0;
        this.f91835s = -695533;
        this.f91836t = 2;
        this.f91837u = 0;
        this.f91838v = 0;
        this.f91839w = 3;
        this.f91840x = -1;
        this.f91843y = -1;
        this.f91846z = 0;
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
        this.f91831p0 = false;
        this.f91841x0 = true;
        this.f91832p1 = new android.graphics.Paint();
        this.f91842x1 = new android.text.TextPaint();
        this.f91845y1 = new android.graphics.Paint();
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

    public static void a(com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker yANumberPicker, int i17, int i18, java.lang.Object obj) {
        tl1.g0 g0Var;
        yANumberPicker.n(0);
        if (i17 != i18 && ((obj == null || !(obj instanceof java.lang.Boolean) || ((java.lang.Boolean) obj).booleanValue()) && (g0Var = yANumberPicker.E1) != null)) {
            int i19 = yANumberPicker.f91846z;
            ((tl1.f) g0Var).a(yANumberPicker, i17 + i19, i19 + i18);
        }
        yANumberPicker.F = i18;
        if (yANumberPicker.W) {
            yANumberPicker.W = false;
            yANumberPicker.c(yANumberPicker.getPickedIndexRelativeToRaw() - yANumberPicker.f91840x, false);
            yANumberPicker.S = false;
            yANumberPicker.postInvalidate();
        }
    }

    private android.text.TextUtils.TruncateAt getEllipsizeType() {
        java.lang.String str = this.f91819J;
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
        int i18 = i17 - ((this.f91839w - 1) / 2);
        this.S1 = i18;
        int oneRecycleSize = getOneRecycleSize();
        if (oneRecycleSize <= 0) {
            i18 = 0;
        } else if (z17 && (i18 = i18 % oneRecycleSize) < 0) {
            i18 += oneRecycleSize;
        }
        this.S1 = i18;
        int i19 = this.O1;
        if (i19 == 0) {
            this.T = true;
            return;
        }
        this.U1 = i19 * i18;
        if ((i18 + (this.f91839w / 2)) % getOneRecycleSize() < 0) {
            getOneRecycleSize();
        }
        b();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.O1 != 0 && this.f91844y0.f11104a.computeScrollOffset()) {
            this.U1 = this.f91844y0.b();
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

    public java.lang.String getContentByCurrValue() {
        return this.f91847z1[getValue() - this.f91846z];
    }

    public java.lang.String[] getDisplayedValues() {
        return this.f91847z1;
    }

    public int getMaxValue() {
        return this.A;
    }

    public int getMinValue() {
        return this.f91846z;
    }

    public int getOneRecycleSize() {
        return (this.f91843y - this.f91840x) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i17 = this.T1;
        if (i17 == 0) {
            return j(this.U1);
        }
        int i18 = this.O1;
        return i17 < (-i18) / 2 ? j(this.U1 + i18 + i17) : j(this.U1 + i17);
    }

    public int getRawContentSize() {
        java.lang.String[] strArr = this.f91847z1;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f91846z;
    }

    public boolean getWrapSelectorWheel() {
        return this.S;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
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
        int i27 = (i17 / i18) + (this.f91839w / 2);
        int oneRecycleSize = getOneRecycleSize();
        boolean z17 = this.S && this.V;
        if (oneRecycleSize > 0) {
            if (z17 && (i27 = i27 % oneRecycleSize) < 0) {
                i27 += oneRecycleSize;
            }
            i19 = i27;
        }
        if (i19 >= 0 && i19 < getOneRecycleSize()) {
            return i19 + this.f91840x;
        }
        throw new java.lang.IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + i19 + " getOneRecycleSize() : " + getOneRecycleSize() + " mWrapSelectorWheel : " + this.S);
    }

    public final void k(android.content.Context context) {
        this.f91844y0 = new androidx.core.widget.s(context, null);
        this.G = android.view.ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.H = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f91823g == 0) {
            this.f91823g = p(context, 13.0f);
        }
        if (this.f91824h == 0) {
            this.f91824h = p(context, 15.0f);
        }
        if (this.f91825i == 0) {
            this.f91825i = p(context, 14.0f);
        }
        if (this.f91829o == 0) {
            this.f91829o = d(context, 8.0f);
        }
        if (this.f91830p == 0) {
            this.f91830p = d(context, 8.0f);
        }
        int i17 = this.f91835s;
        android.graphics.Paint paint = this.f91832p1;
        paint.setColor(i17);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f91836t);
        int i18 = this.f91820d;
        android.text.TextPaint textPaint = this.f91842x1;
        textPaint.setColor(i18);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        int i19 = this.f91822f;
        android.graphics.Paint paint2 = this.f91845y1;
        paint2.setColor(i19);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setTextSize(this.f91825i);
        int i27 = this.f91839w;
        if (i27 % 2 == 0) {
            this.f91839w = i27 + 1;
        }
        int i28 = this.f91840x;
        if (i28 == -1 || this.f91843y == -1) {
            if (this.f91847z1 == null) {
                this.f91847z1 = r2;
                java.lang.String[] strArr = {"0"};
            }
            java.lang.String[] strArr2 = this.f91847z1;
            this.V = strArr2.length > this.f91839w;
            if (i28 == -1) {
                this.f91840x = 0;
            }
            if (this.f91843y == -1) {
                this.f91843y = strArr2.length - 1;
            }
            o(this.f91840x, this.f91843y, false);
        }
        this.C1 = new tl1.d0(this, "HandlerThread-For-Refreshing");
        this.D1 = new tl1.e0(this);
    }

    public final void l(android.content.Context context, android.util.AttributeSet attributeSet) {
        java.lang.String[] strArr;
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rd.a.f394198a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i17 = 0; i17 < indexCount; i17++) {
            int index = obtainStyledAttributes.getIndex(i17);
            if (index == 17) {
                this.f91839w = obtainStyledAttributes.getInt(index, 3);
            } else if (index == 3) {
                this.f91835s = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == 4) {
                this.f91836t = obtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == 5) {
                this.f91837u = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 6) {
                this.f91838v = obtainStyledAttributes.getDimensionPixelSize(index, 0);
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
                this.f91847z1 = strArr;
            } else if (index == 21) {
                this.f91820d = obtainStyledAttributes.getColor(index, -13421773);
            } else if (index == 22) {
                this.f91821e = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == 20) {
                this.f91822f = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == 25) {
                this.f91823g = obtainStyledAttributes.getDimensionPixelSize(index, p(context, 13.0f));
            } else if (index == 26) {
                this.f91824h = obtainStyledAttributes.getDimensionPixelSize(index, p(context, 15.0f));
            } else if (index == 24) {
                this.f91825i = obtainStyledAttributes.getDimensionPixelSize(index, p(context, 14.0f));
            } else if (index == 14) {
                this.f91840x = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 13) {
                this.f91843y = obtainStyledAttributes.getInteger(index, 0);
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
                this.f91829o = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 8.0f));
            } else if (index == 11) {
                this.f91830p = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 8.0f));
            } else if (index == 10) {
                this.f91833q = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 2.0f));
            } else if (index == 9) {
                this.f91834r = obtainStyledAttributes.getDimensionPixelSize(index, d(context, 5.0f));
            } else if (index == 1) {
                this.A1 = obtainStyledAttributes.getTextArray(index);
            } else if (index == 2) {
                this.B1 = obtainStyledAttributes.getTextArray(index);
            } else if (index == 16) {
                this.f91831p0 = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 15) {
                this.f91841x0 = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 23) {
                this.f91819J = obtainStyledAttributes.getString(index);
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
        java.lang.String[] strArr = this.f91847z1;
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
        }
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i17);
        }
        if (i17 > strArr.length - 1) {
            throw new java.lang.IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f91847z1.length - 1) + " minShowIndex is " + i17);
        }
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i18);
        }
        if (i18 > strArr.length - 1) {
            throw new java.lang.IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f91847z1.length - 1) + " maxShowIndex is " + i18);
        }
        this.f91840x = i17;
        this.f91843y = i18;
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
        this.C1.quit();
        this.D1 = null;
        if (this.O1 == 0) {
            return;
        }
        if (!this.f91844y0.c()) {
            this.f91844y0.a();
            this.U1 = this.f91844y0.b();
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
        if (j17 != i19 && this.f91831p0) {
            try {
                tl1.g0 g0Var = this.E1;
                if (g0Var != null) {
                    int i27 = this.f91846z;
                    ((tl1.f) g0Var).a(this, i19 + i27, i27 + j17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.YANumberPicker", e17, "", new java.lang.Object[0]);
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
            if (i18 >= this.f91839w + 1) {
                break;
            }
            float f28 = this.T1 + (this.O1 * i18);
            int i19 = this.S1 + i18;
            int oneRecycleSize = getOneRecycleSize();
            boolean z17 = this.S && this.V;
            if (oneRecycleSize <= 0) {
                i19 = 0;
            } else if (z17 && (i19 = i19 % oneRecycleSize) < 0) {
                i19 += oneRecycleSize;
            }
            int i27 = this.f91839w / 2;
            if (i18 == i27) {
                f19 = (this.T1 + r0) / this.O1;
                i17 = e(f19, this.f91820d, this.f91821e);
                float f29 = this.f91823g;
                f17 = f29 + ((this.f91824h - f29) * f19);
                float f37 = this.N;
                f18 = f37 + ((this.P - f37) * f19);
            } else if (i18 == i27 + 1) {
                float f38 = 1.0f - f27;
                int e17 = e(f38, this.f91820d, this.f91821e);
                float f39 = this.f91823g;
                float f47 = f39 + ((this.f91824h - f39) * f38);
                float f48 = this.N;
                float f49 = f48 + ((this.P - f48) * f38);
                f19 = f27;
                i17 = e17;
                f17 = f47;
                f18 = f49;
            } else {
                int i28 = this.f91820d;
                f17 = this.f91823g;
                f18 = this.N;
                f19 = f27;
                i17 = i28;
            }
            android.text.TextPaint textPaint = this.f91842x1;
            textPaint.setColor(i17);
            textPaint.setTextSize(f17);
            if (i19 >= 0 && i19 < getOneRecycleSize()) {
                java.lang.CharSequence charSequence = this.f91847z1[i19 + this.f91840x];
                if (this.f91819J != null) {
                    charSequence = android.text.TextUtils.ellipsize(charSequence, textPaint, getWidth() - (this.f91834r * 2), getEllipsizeType());
                }
                canvas.drawText(charSequence.toString(), this.R1, f28 + (this.O1 / 2) + f18, textPaint);
            } else if (!android.text.TextUtils.isEmpty(this.K)) {
                canvas.drawText(this.K, this.R1, f28 + (this.O1 / 2) + f18, textPaint);
            }
            i18++;
            f27 = f19;
        }
        if (this.R) {
            float paddingLeft = getPaddingLeft() + this.f91837u;
            float f57 = this.P1;
            float paddingRight = (this.M1 - getPaddingRight()) - this.f91838v;
            float f58 = this.P1;
            android.graphics.Paint paint = this.f91832p1;
            canvas.drawLine(paddingLeft, f57, paddingRight, f58, paint);
            canvas.drawLine(getPaddingLeft() + this.f91837u, this.Q1, (this.M1 - getPaddingRight()) - this.f91838v, this.Q1, paint);
        }
        if (android.text.TextUtils.isEmpty(this.I)) {
            return;
        }
        canvas.drawText(this.I, this.R1 + ((this.B + this.f91827m) / 2) + this.f91829o, ((this.P1 + this.Q1) / 2.0f) + this.Q, this.f91845y1);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        r(false);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        this.V1 = mode;
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode != 1073741824) {
            int paddingLeft = getPaddingLeft() + getPaddingRight() + java.lang.Math.max(this.D, java.lang.Math.max(this.B, this.E) + (((java.lang.Math.max(this.f91827m, this.f91828n) != 0 ? this.f91829o : 0) + java.lang.Math.max(this.f91827m, this.f91828n) + (java.lang.Math.max(this.f91827m, this.f91828n) == 0 ? 0 : this.f91830p) + (this.f91834r * 2)) * 2));
            size = mode == Integer.MIN_VALUE ? java.lang.Math.min(paddingLeft, size) : paddingLeft;
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        this.W1 = mode2;
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 != 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f91839w * (this.C + (this.f91833q * 2)));
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker.onSizeChanged(int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final int p(android.content.Context context, float f17) {
        return (int) ((f17 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.view.View
    public void postInvalidate() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            super.postInvalidate();
        }
    }

    public void q() {
        androidx.core.widget.s sVar = this.f91844y0;
        if (sVar == null || sVar.c()) {
            return;
        }
        androidx.core.widget.s sVar2 = this.f91844y0;
        sVar2.d(0, sVar2.b(), 0, 0, 1);
        this.f91844y0.a();
        postInvalidate();
    }

    public final void r(boolean z17) {
        android.text.TextPaint textPaint = this.f91842x1;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(this.f91824h);
        this.B = f(this.f91847z1, textPaint);
        this.D = f(this.A1, textPaint);
        this.E = f(this.B1, textPaint);
        textPaint.setTextSize(this.f91825i);
        this.f91828n = i(this.L, textPaint);
        textPaint.setTextSize(textSize);
        float textSize2 = textPaint.getTextSize();
        textPaint.setTextSize(this.f91824h);
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
        this.H1 = (-this.f91839w) * this.O1;
        if (this.f91847z1 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i17 = this.f91839w;
            int i18 = this.O1;
            this.G1 = ((oneRecycleSize - (i17 / 2)) - 1) * i18;
            this.H1 = (-(i17 / 2)) * i18;
        }
    }

    public void setContentTextTypeface(android.graphics.Typeface typeface) {
        this.f91842x1.setTypeface(typeface);
    }

    public void setDisplayedValues(java.lang.String[] strArr) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.C1;
        if (n3Var != null) {
            n3Var.removeMessages(1);
        }
        q();
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if ((this.A - this.f91846z) + 1 > strArr.length) {
            throw new java.lang.IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.A - this.f91846z) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        this.f91847z1 = strArr;
        this.V = strArr.length > this.f91839w;
        r(true);
        this.F = this.f91840x + 0;
        c(0, this.S && this.V);
        postInvalidate();
        this.D1.sendEmptyMessage(3);
    }

    public void setDividerColor(int i17) {
        if (this.f91835s == i17) {
            return;
        }
        this.f91835s = i17;
        this.f91832p1.setColor(i17);
        postInvalidate();
    }

    public void setDividerHeight(int i17) {
        if (i17 == this.f91836t) {
            return;
        }
        this.f91836t = i17;
        this.f91832p1.setStrokeWidth(i17);
        postInvalidate();
    }

    public void setEllipsizeType(java.lang.String str) {
        java.lang.String[] strArr = {"end", "middle", "start"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (strArr[i17].equals(str)) {
                this.f91819J = str;
                return;
            }
        }
        this.f91819J = "end";
    }

    public void setFriction(float f17) {
        if (f17 > 0.0f) {
            android.view.ViewConfiguration.get(getContext());
            this.M = android.view.ViewConfiguration.getScrollFriction() / f17;
        } else {
            throw new java.lang.IllegalArgumentException("you should set a a positive float friction, now friction is " + f17);
        }
    }

    public void setHintText(java.lang.String str) {
        java.lang.String str2 = this.I;
        if (str2 == null ? str == null : str2.equals(str)) {
            return;
        }
        this.I = str;
        android.graphics.Paint paint = this.f91845y1;
        this.Q = h(paint.getFontMetrics());
        this.f91827m = i(this.I, paint);
        this.D1.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i17) {
        if (this.f91822f == i17) {
            return;
        }
        this.f91822f = i17;
        this.f91845y1.setColor(i17);
        postInvalidate();
    }

    public void setHintTextTypeface(android.graphics.Typeface typeface) {
        this.f91845y1.setTypeface(typeface);
    }

    public void setItemPaddingVertical(int i17) {
        if (this.f91833q == i17) {
            return;
        }
        this.f91833q = i17;
        postInvalidate();
    }

    public void setMaxValue(int i17) {
        java.lang.String[] strArr = this.f91847z1;
        if (strArr == null) {
            throw new java.lang.NullPointerException("mDisplayedValues should not be null");
        }
        int i18 = this.f91846z;
        if ((i17 - i18) + 1 > strArr.length) {
            throw new java.lang.IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i17 - this.f91846z) + 1) + " and mDisplayedValues.length is " + this.f91847z1.length);
        }
        this.A = i17;
        int i19 = this.f91840x;
        int i27 = (i17 - i18) + i19;
        this.f91843y = i27;
        o(i19, i27, true);
        s();
    }

    public void setMinValue(int i17) {
        this.f91846z = i17;
        this.f91840x = 0;
        s();
    }

    public void setNormalTextColor(int i17) {
        if (this.f91820d == i17) {
            return;
        }
        this.f91820d = i17;
        postInvalidate();
    }

    public void setOnScrollListener(tl1.f0 f0Var) {
    }

    public void setOnValueChangeListenerInScrolling(tl1.h0 h0Var) {
    }

    public void setOnValueChangedListener(tl1.g0 g0Var) {
        this.E1 = g0Var;
    }

    public void setOnValueChangedListenerRelativeToRaw(tl1.i0 i0Var) {
    }

    public void setPickedIndexRelativeToMin(int i17) {
        if (i17 < 0 || i17 >= getOneRecycleSize()) {
            return;
        }
        this.F = this.f91840x + i17;
        c(i17, this.S && this.V);
        postInvalidate();
    }

    public void setPickedIndexRelativeToRaw(int i17) {
        int i18 = this.f91840x;
        if (i18 <= -1 || i18 > i17 || i17 > this.f91843y) {
            return;
        }
        this.F = i17;
        c(i17 - i18, this.S && this.V);
        postInvalidate();
    }

    public void setSelectedTextColor(int i17) {
        if (this.f91821e == i17) {
            return;
        }
        this.f91821e = i17;
        postInvalidate();
    }

    public void setValue(int i17) {
        int i18 = this.f91846z;
        if (i17 < i18) {
            throw new java.lang.IllegalArgumentException("should not set a value less than mMinValue, value is " + i17);
        }
        if (i17 <= this.A) {
            setPickedIndexRelativeToRaw(i17 - i18);
        } else {
            throw new java.lang.IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i17);
        }
    }

    public void setWrapSelectorWheel(boolean z17) {
        if (this.S != z17) {
            if (z17) {
                this.S = z17;
                this.V = this.f91847z1.length > this.f91839w;
                postInvalidate();
            } else {
                if (this.F1 != 0) {
                    this.W = true;
                    return;
                }
                c(getPickedIndexRelativeToRaw() - this.f91840x, false);
                this.S = false;
                postInvalidate();
            }
        }
    }

    public YANumberPicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91820d = -13421773;
        this.f91821e = -695533;
        this.f91822f = -695533;
        this.f91823g = 0;
        this.f91824h = 0;
        this.f91825i = 0;
        this.f91827m = 0;
        this.f91828n = 0;
        this.f91829o = 0;
        this.f91830p = 0;
        this.f91833q = 0;
        this.f91834r = 0;
        this.f91835s = -695533;
        this.f91836t = 2;
        this.f91837u = 0;
        this.f91838v = 0;
        this.f91839w = 3;
        this.f91840x = -1;
        this.f91843y = -1;
        this.f91846z = 0;
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
        this.f91831p0 = false;
        this.f91841x0 = true;
        this.f91832p1 = new android.graphics.Paint();
        this.f91842x1 = new android.text.TextPaint();
        this.f91845y1 = new android.graphics.Paint();
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

    public YANumberPicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91820d = -13421773;
        this.f91821e = -695533;
        this.f91822f = -695533;
        this.f91823g = 0;
        this.f91824h = 0;
        this.f91825i = 0;
        this.f91827m = 0;
        this.f91828n = 0;
        this.f91829o = 0;
        this.f91830p = 0;
        this.f91833q = 0;
        this.f91834r = 0;
        this.f91835s = -695533;
        this.f91836t = 2;
        this.f91837u = 0;
        this.f91838v = 0;
        this.f91839w = 3;
        this.f91840x = -1;
        this.f91843y = -1;
        this.f91846z = 0;
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
        this.f91831p0 = false;
        this.f91841x0 = true;
        this.f91832p1 = new android.graphics.Paint();
        this.f91842x1 = new android.text.TextPaint();
        this.f91845y1 = new android.graphics.Paint();
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
