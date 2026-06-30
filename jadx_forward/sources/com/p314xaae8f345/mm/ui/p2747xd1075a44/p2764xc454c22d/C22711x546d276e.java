package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d;

/* renamed from: com.tencent.mm.ui.widget.progress.MMProgressWheel */
/* loaded from: classes13.dex */
public class C22711x546d276e extends android.view.View {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public int f293891d;

    /* renamed from: e, reason: collision with root package name */
    public int f293892e;

    /* renamed from: f, reason: collision with root package name */
    public int f293893f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f293894g;

    /* renamed from: h, reason: collision with root package name */
    public double f293895h;

    /* renamed from: i, reason: collision with root package name */
    public double f293896i;

    /* renamed from: m, reason: collision with root package name */
    public float f293897m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f293898n;

    /* renamed from: o, reason: collision with root package name */
    public long f293899o;

    /* renamed from: p, reason: collision with root package name */
    public int f293900p;

    /* renamed from: q, reason: collision with root package name */
    public int f293901q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f293902r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f293903s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.RectF f293904t;

    /* renamed from: u, reason: collision with root package name */
    public float f293905u;

    /* renamed from: v, reason: collision with root package name */
    public long f293906v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f293907w;

    /* renamed from: x, reason: collision with root package name */
    public float f293908x;

    /* renamed from: y, reason: collision with root package name */
    public float f293909y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f293910z;

    /* renamed from: com.tencent.mm.ui.widget.progress.MMProgressWheel$WheelSavedState */
    /* loaded from: classes13.dex */
    public static class WheelSavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22711x546d276e.WheelSavedState> f39757x681a0c0c = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.c();

        /* renamed from: d, reason: collision with root package name */
        public float f293911d;

        /* renamed from: e, reason: collision with root package name */
        public float f293912e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f293913f;

        /* renamed from: g, reason: collision with root package name */
        public float f293914g;

        /* renamed from: h, reason: collision with root package name */
        public int f293915h;

        /* renamed from: i, reason: collision with root package name */
        public int f293916i;

        /* renamed from: m, reason: collision with root package name */
        public int f293917m;

        /* renamed from: n, reason: collision with root package name */
        public int f293918n;

        /* renamed from: o, reason: collision with root package name */
        public int f293919o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f293920p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f293921q;

        public WheelSavedState(android.os.Parcel parcel, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.a aVar) {
            super(parcel);
            this.f293911d = parcel.readFloat();
            this.f293912e = parcel.readFloat();
            this.f293913f = parcel.readByte() != 0;
            this.f293914g = parcel.readFloat();
            this.f293915h = parcel.readInt();
            this.f293916i = parcel.readInt();
            this.f293917m = parcel.readInt();
            this.f293918n = parcel.readInt();
            this.f293919o = parcel.readInt();
            this.f293920p = parcel.readByte() != 0;
            this.f293921q = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeFloat(this.f293911d);
            parcel.writeFloat(this.f293912e);
            parcel.writeByte(this.f293913f ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.f293914g);
            parcel.writeInt(this.f293915h);
            parcel.writeInt(this.f293916i);
            parcel.writeInt(this.f293917m);
            parcel.writeInt(this.f293918n);
            parcel.writeInt(this.f293919o);
            parcel.writeByte(this.f293920p ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f293921q ? (byte) 1 : (byte) 0);
        }
    }

    public C22711x546d276e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293891d = 28;
        this.f293892e = 4;
        this.f293893f = 4;
        this.f293894g = false;
        this.f293895h = 0.0d;
        this.f293896i = 460.0d;
        this.f293897m = 0.0f;
        this.f293898n = true;
        this.f293899o = 0L;
        this.f293900p = -1442840576;
        this.f293901q = 16777215;
        this.f293902r = new android.graphics.Paint();
        this.f293903s = new android.graphics.Paint();
        this.f293904t = new android.graphics.RectF();
        this.f293905u = 230.0f;
        this.f293906v = 0L;
        this.f293908x = 0.0f;
        this.f293909y = 0.0f;
        this.f293910z = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544638l);
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f293892e = (int) android.util.TypedValue.applyDimension(1, this.f293892e, displayMetrics);
        this.f293893f = (int) android.util.TypedValue.applyDimension(1, this.f293893f, displayMetrics);
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, this.f293891d, displayMetrics);
        this.f293891d = applyDimension;
        this.f293891d = (int) obtainStyledAttributes.getDimension(3, applyDimension);
        this.f293894g = obtainStyledAttributes.getBoolean(4, false);
        this.f293892e = (int) obtainStyledAttributes.getDimension(2, this.f293892e);
        this.f293893f = (int) obtainStyledAttributes.getDimension(8, this.f293893f);
        this.f293905u = obtainStyledAttributes.getFloat(9, this.f293905u / 360.0f) * 360.0f;
        this.f293896i = obtainStyledAttributes.getInt(1, (int) this.f293896i);
        this.f293900p = obtainStyledAttributes.getColor(0, this.f293900p);
        this.f293901q = obtainStyledAttributes.getColor(7, this.f293901q);
        this.f293907w = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f293906v = android.os.SystemClock.uptimeMillis();
            this.f293910z = true;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        this.A = android.provider.Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void a() {
        android.graphics.Paint paint = this.f293902r;
        paint.setColor(this.f293900p);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f293892e);
        android.graphics.Paint paint2 = this.f293903s;
        paint2.setColor(this.f293901q);
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f293893f);
    }

    /* renamed from: getBarColor */
    public int m82091x11b69486() {
        return this.f293900p;
    }

    /* renamed from: getBarWidth */
    public int m82092x12cd92e9() {
        return this.f293892e;
    }

    /* renamed from: getCircleRadius */
    public int m82093xcee5cbf8() {
        return this.f293891d;
    }

    /* renamed from: getProgress */
    public float m82094x402effa3() {
        if (this.f293910z) {
            return -1.0f;
        }
        return this.f293908x / 360.0f;
    }

    /* renamed from: getRimColor */
    public int m82095x2e730163() {
        return this.f293901q;
    }

    /* renamed from: getRimWidth */
    public int m82096x2f89ffc6() {
        return this.f293893f;
    }

    /* renamed from: getSpinSpeed */
    public float m82097x7f98626f() {
        return this.f293905u / 360.0f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        super.onDraw(canvas);
        canvas.drawArc(this.f293904t, 360.0f, 360.0f, false, this.f293903s);
        if (this.A) {
            boolean z17 = this.f293910z;
            android.graphics.Paint paint = this.f293902r;
            float f19 = 0.0f;
            boolean z18 = true;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f293906v;
                float f27 = (((float) uptimeMillis) * this.f293905u) / 1000.0f;
                long j17 = this.f293899o;
                if (j17 >= 200) {
                    double d17 = this.f293895h + uptimeMillis;
                    this.f293895h = d17;
                    double d18 = this.f293896i;
                    if (d17 > d18) {
                        this.f293895h = d17 - d18;
                        this.f293899o = 0L;
                        this.f293898n = !this.f293898n;
                    }
                    float cos = (((float) java.lang.Math.cos(((this.f293895h / d18) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.f293898n) {
                        this.f293897m = cos * 254.0f;
                    } else {
                        float f28 = (1.0f - cos) * 254.0f;
                        this.f293908x += this.f293897m - f28;
                        this.f293897m = f28;
                    }
                } else {
                    this.f293899o = j17 + uptimeMillis;
                }
                float f29 = this.f293908x + f27;
                this.f293908x = f29;
                if (f29 > 360.0f) {
                    this.f293908x = f29 - 360.0f;
                }
                this.f293906v = android.os.SystemClock.uptimeMillis();
                float f37 = this.f293908x - 90.0f;
                float f38 = this.f293897m + 16.0f;
                if (isInEditMode()) {
                    f17 = 135.0f;
                    f18 = 0.0f;
                } else {
                    f17 = f38;
                    f18 = f37;
                }
                canvas.drawArc(this.f293904t, f18, f17, false, paint);
            } else {
                if (this.f293908x != this.f293909y) {
                    this.f293908x = java.lang.Math.min(this.f293908x + ((((float) (android.os.SystemClock.uptimeMillis() - this.f293906v)) / 1000.0f) * this.f293905u), this.f293909y);
                    this.f293906v = android.os.SystemClock.uptimeMillis();
                } else {
                    z18 = false;
                }
                float f39 = this.f293908x;
                if (!this.f293907w) {
                    f19 = ((float) (1.0d - java.lang.Math.pow(1.0f - (f39 / 360.0f), 4.0f))) * 360.0f;
                    f39 = ((float) (1.0d - java.lang.Math.pow(1.0f - (this.f293908x / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.f293904t, f19 - 90.0f, isInEditMode() ? 360.0f : f39, false, paint);
            }
            if (z18) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int paddingLeft = this.f293891d + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f293891d + getPaddingTop() + getPaddingBottom();
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = java.lang.Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = java.lang.Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22711x546d276e.WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22711x546d276e.WheelSavedState wheelSavedState = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22711x546d276e.WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.f293908x = wheelSavedState.f293911d;
        this.f293909y = wheelSavedState.f293912e;
        this.f293910z = wheelSavedState.f293913f;
        this.f293905u = wheelSavedState.f293914g;
        this.f293892e = wheelSavedState.f293915h;
        this.f293900p = wheelSavedState.f293916i;
        this.f293893f = wheelSavedState.f293917m;
        this.f293901q = wheelSavedState.f293918n;
        this.f293891d = wheelSavedState.f293919o;
        this.f293907w = wheelSavedState.f293920p;
        this.f293894g = wheelSavedState.f293921q;
        this.f293906v = android.os.SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22711x546d276e.WheelSavedState wheelSavedState = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22711x546d276e.WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.f293911d = this.f293908x;
        wheelSavedState.f293912e = this.f293909y;
        wheelSavedState.f293913f = this.f293910z;
        wheelSavedState.f293914g = this.f293905u;
        wheelSavedState.f293915h = this.f293892e;
        wheelSavedState.f293916i = this.f293900p;
        wheelSavedState.f293917m = this.f293893f;
        wheelSavedState.f293918n = this.f293901q;
        wheelSavedState.f293919o = this.f293891d;
        wheelSavedState.f293920p = this.f293907w;
        wheelSavedState.f293921q = this.f293894g;
        return wheelSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f293894g) {
            int i28 = this.f293892e;
            this.f293904t = new android.graphics.RectF(paddingLeft + i28, paddingTop + i28, (i17 - paddingRight) - i28, (i18 - paddingBottom) - i28);
        } else {
            int i29 = (i17 - paddingLeft) - paddingRight;
            int min = java.lang.Math.min(java.lang.Math.min(i29, (i18 - paddingBottom) - paddingTop), (this.f293891d * 2) - (this.f293892e * 2));
            int i37 = ((i29 - min) / 2) + paddingLeft;
            int i38 = ((((i18 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i39 = this.f293892e;
            this.f293904t = new android.graphics.RectF(i37 + i39, i38 + i39, (i37 + min) - i39, (i38 + min) - i39);
        }
        a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        if (i17 == 0) {
            this.f293906v = android.os.SystemClock.uptimeMillis();
        }
    }

    /* renamed from: setBarColor */
    public void m82098xc6ef592(int i17) {
        this.f293900p = i17;
        a();
        if (this.f293910z) {
            return;
        }
        invalidate();
    }

    /* renamed from: setBarWidth */
    public void m82099xd85f3f5(int i17) {
        this.f293892e = i17;
        if (this.f293910z) {
            return;
        }
        invalidate();
    }

    /* renamed from: setCallback */
    public void m82100x6c4ebec7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.b bVar) {
    }

    /* renamed from: setCircleRadius */
    public void m82101x52ec704(int i17) {
        this.f293891d = i17;
        if (this.f293910z) {
            return;
        }
        invalidate();
    }

    /* renamed from: setInstantProgress */
    public void m82102xfe46466c(float f17) {
        if (this.f293910z) {
            this.f293908x = 0.0f;
            this.f293910z = false;
        }
        if (f17 > 1.0f) {
            f17 -= 1.0f;
        } else if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (java.lang.Math.abs(f17 - this.f293909y) <= 0.0f) {
            return;
        }
        float min = java.lang.Math.min(f17 * 360.0f, 360.0f);
        this.f293909y = min;
        this.f293908x = min;
        this.f293906v = android.os.SystemClock.uptimeMillis();
        invalidate();
    }

    /* renamed from: setLinearProgress */
    public void m82103x3ee8f574(boolean z17) {
        this.f293907w = z17;
        if (this.f293910z) {
            return;
        }
        invalidate();
    }

    /* renamed from: setProgress */
    public void m82104x3ae760af(float f17) {
        if (this.f293910z) {
            this.f293908x = 0.0f;
            this.f293910z = false;
        }
        if (f17 > 1.0f) {
            f17 -= 1.0f;
        } else if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (java.lang.Math.abs(f17 - this.f293909y) <= 0.0f) {
            return;
        }
        if (this.f293908x == this.f293909y) {
            this.f293906v = android.os.SystemClock.uptimeMillis();
        }
        this.f293909y = java.lang.Math.min(f17 * 360.0f, 360.0f);
        invalidate();
    }

    /* renamed from: setRimColor */
    public void m82105x292b626f(int i17) {
        this.f293901q = i17;
        a();
        if (this.f293910z) {
            return;
        }
        invalidate();
    }

    /* renamed from: setRimWidth */
    public void m82106x2a4260d2(int i17) {
        this.f293893f = i17;
        if (this.f293910z) {
            return;
        }
        invalidate();
    }

    /* renamed from: setSpinSpeed */
    public void m82107xdbec22e3(float f17) {
        this.f293905u = f17 * 360.0f;
    }
}
