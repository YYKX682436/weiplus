package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMPinProgressBtn */
/* loaded from: classes13.dex */
public class C22626x3e1b8dda extends android.widget.CompoundButton {

    /* renamed from: d, reason: collision with root package name */
    public int f292860d;

    /* renamed from: e, reason: collision with root package name */
    public int f292861e;

    /* renamed from: f, reason: collision with root package name */
    public int f292862f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f292863g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f292864h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f292865i;

    /* renamed from: m, reason: collision with root package name */
    public int f292866m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f292867n;

    /* renamed from: com.tencent.mm.ui.widget.MMPinProgressBtn$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda.SavedState> f39742x681a0c0c = new com.p314xaae8f345.mm.ui.p2747xd1075a44.a();

        /* renamed from: d, reason: collision with root package name */
        public int f292868d;

        /* renamed from: e, reason: collision with root package name */
        public int f292869e;

        public SavedState(android.os.Parcel parcel, al5.x1 x1Var) {
            super(parcel);
            this.f292868d = parcel.readInt();
            this.f292869e = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f292868d);
            parcel.writeInt(this.f292869e);
        }
    }

    public C22626x3e1b8dda(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292865i = new android.graphics.RectF();
        this.f292867n = new al5.x1(this);
        b(context, attributeSet, 0);
    }

    public void a() {
        java.lang.Runnable runnable = this.f292867n;
        removeCallbacks(runnable);
        post(runnable);
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f292860d = 100;
        this.f292861e = 0;
        android.content.res.Resources resources = getResources();
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561007a15);
        int color2 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561008a16);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, wm0.a.f528734s, i17, 0);
                this.f292860d = typedArray.getInteger(2, this.f292860d);
                this.f292861e = typedArray.getInteger(4, this.f292861e);
                color = typedArray.getColor(0, color);
                color2 = typedArray.getColor(5, color2);
                this.f292862f = typedArray.getInteger(6, 0);
                this.f292866m = typedArray.getDimensionPixelSize(1, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7m));
                typedArray.recycle();
            } catch (java.lang.Throwable th6) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th6;
            }
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f292863g = paint;
        paint.setColor(color);
        this.f292863g.setStyle(android.graphics.Paint.Style.STROKE);
        this.f292863g.setStrokeWidth(4.0f);
        this.f292863g.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f292864h = paint2;
        paint2.setColor(color2);
        this.f292864h.setAntiAlias(true);
        setClickable(false);
    }

    /* renamed from: getMax */
    public int m81376xb588562e() {
        return this.f292860d;
    }

    /* renamed from: getProgress */
    public int m81377x402effa3() {
        return this.f292861e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i17 = this.f292866m;
        android.graphics.RectF rectF = this.f292865i;
        rectF.set(2.0f, 2.0f, i17 - 2.0f, i17 - 2.0f);
        rectF.offset((getWidth() - this.f292866m) / 2, (getHeight() - this.f292866m) / 2);
        canvas.drawArc(this.f292865i, 0.0f, 360.0f, true, this.f292863g);
        int i18 = this.f292862f;
        if (i18 == 0) {
            int i19 = this.f292866m;
            rectF.set(8.0f, 8.0f, i19 - 8.0f, i19 - 8.0f);
            rectF.offset((getWidth() - this.f292866m) / 2, (getHeight() - this.f292866m) / 2);
            canvas.drawArc(this.f292865i, -90.0f, ((this.f292861e * 1.0f) / this.f292860d) * 360.0f, true, this.f292864h);
            return;
        }
        if (i18 != 1) {
            return;
        }
        int i27 = this.f292866m;
        rectF.set(2.0f, 2.0f, i27 - 2.0f, i27 - 2.0f);
        rectF.offset((getWidth() - this.f292866m) / 2, (getHeight() - this.f292866m) / 2);
        canvas.drawArc(this.f292865i, 270.0f, (((this.f292861e * 1.0f) / this.f292860d) * 360.0f) - 360.0f, true, this.f292864h);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.resolveSize(this.f292866m, i17), android.view.View.resolveSize(this.f292866m, i18));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda.SavedState savedState = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f292860d = savedState.f292869e;
        this.f292861e = savedState.f292868d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (!isSaveEnabled()) {
            return onSaveInstanceState;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda.SavedState savedState = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda.SavedState(onSaveInstanceState);
        savedState.f292869e = this.f292860d;
        savedState.f292868d = this.f292861e;
        return savedState;
    }

    /* renamed from: setCircleColor */
    public void m81378x6ab8beb1(int i17) {
        this.f292863g.setColor(getResources().getColor(i17));
    }

    /* renamed from: setInnerPixSize */
    public void m81379xb413488c(int i17) {
        this.f292866m = i17;
    }

    /* renamed from: setMax */
    public void m81380xca027da2(int i17) {
        this.f292860d = java.lang.Math.max(0, i17);
        invalidate();
    }

    /* renamed from: setProgress */
    public void m81381x3ae760af(int i17) {
        this.f292861e = java.lang.Math.max(0, i17);
        this.f292861e = java.lang.Math.min(i17, this.f292860d);
        invalidate();
    }

    /* renamed from: setProgressColor */
    public void m81382x7d38f3f4(int i17) {
        this.f292864h.setColor(getResources().getColor(i17));
    }

    /* renamed from: setStyle */
    public void m81383x53b6de6f(int i17) {
        if (i17 == 1 || i17 == 0) {
            this.f292862f = i17;
        }
    }

    public C22626x3e1b8dda(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292865i = new android.graphics.RectF();
        this.f292867n = new al5.x1(this);
        b(context, attributeSet, i17);
    }
}
