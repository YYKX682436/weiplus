package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class a2 extends com.tencent.mm.plugin.appbrand.widget.input.e4 {
    public yl1.a A;
    public boolean B;
    public java.lang.String C;
    public android.view.MotionEvent D;
    public boolean E;
    public final com.tencent.mm.plugin.appbrand.widget.input.e5 F;

    /* renamed from: v, reason: collision with root package name */
    public final android.text.InputFilter f91279v;

    /* renamed from: w, reason: collision with root package name */
    public final float f91280w;

    /* renamed from: x, reason: collision with root package name */
    public float f91281x;

    /* renamed from: y, reason: collision with root package name */
    public float f91282y;

    /* renamed from: z, reason: collision with root package name */
    public float f91283z;

    public a2(android.content.Context context) {
        super(context);
        this.f91279v = new com.tencent.mm.plugin.appbrand.widget.input.z1(this);
        this.f91281x = 0.0f;
        this.f91282y = 1.2f;
        this.f91283z = getTextSize();
        this.B = false;
        this.C = "cursor";
        this.E = false;
        this.F = new com.tencent.mm.plugin.appbrand.widget.input.e5(this);
        super.setSingleLine(false);
        super.setLineSpacing(0.0f, 1.0f);
        setVerticalScrollbarPosition(2);
        setSpannableFactory(new com.tencent.mm.plugin.appbrand.widget.input.w1(this));
        ((x.n) this.f91413m).put(new com.tencent.mm.plugin.appbrand.widget.input.x1(this), this);
        setOnLongClickListener(new com.tencent.mm.plugin.appbrand.widget.input.y1(this));
        this.f91280w = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setAutoHeight(false);
        setAdjustKeyboardTo("cursor");
        x(0.0f, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void c(float f17, float f18) {
        int a17;
        if (isEnabled()) {
            if (g() && (a17 = com.tencent.mm.plugin.appbrand.widget.input.l5.a(this, f17 + getScrollX(), f18 + getScrollY())) >= 0) {
                setSelection(a17);
            }
            performClick();
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        if (k() <= getHeight()) {
            return false;
        }
        return super.canScrollVertically(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.t4
    public boolean e() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, bl1.c
    public boolean g() {
        if (!this.B) {
            k();
            getMeasuredHeight();
        }
        return (isFocusable() || this.f91418r) ? false : true;
    }

    public java.lang.String getAdjustKeyboardTo() {
        return this.C;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public android.view.View getInputPanel() {
        return com.tencent.mm.plugin.appbrand.widget.input.u3.y(this);
    }

    @Override // android.widget.TextView
    public int getLineHeight() {
        yl1.a aVar = this.A;
        return aVar != null ? aVar.f462958d : super.getLineHeight();
    }

    @Override // android.widget.TextView
    @java.lang.Deprecated
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    @Override // android.widget.TextView
    @java.lang.Deprecated
    public float getLineSpacingMultiplier() {
        return super.getLineSpacingMultiplier();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void o() {
        com.tencent.mm.plugin.appbrand.widget.input.m5.b(this).restartInput(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02bb, code lost:
    
        if (r3[0].f91511g != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030d, code lost:
    
        if (r2 != 3) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        if (r9 != 3) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.input.a2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performHapticFeedback(int i17, int i18) {
        return super.performHapticFeedback(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public android.text.Editable s(android.text.Editable editable) {
        this.f91416p.a(editable);
        if (this.A != null && !android.text.TextUtils.isEmpty(editable)) {
            editable.setSpan(this.A, 0, editable.length(), 18);
        }
        return editable;
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        super.scrollBy(i17, i18);
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        super.scrollTo(i17, i18);
    }

    public void setAdjustKeyboardTo(java.lang.String str) {
        this.C = str;
    }

    public void setAutoHeight(boolean z17) {
        this.B = z17;
        setVerticalScrollBarEnabled(!z17);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        android.text.InputFilter inputFilter = this.f91279v;
        if (inputFilter != null) {
            int i17 = 0;
            if (inputFilterArr == null) {
                inputFilterArr = new android.text.InputFilter[0];
            }
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
            while (i17 < inputFilterArr.length) {
                inputFilterArr2[i17] = inputFilterArr[i17];
                i17++;
            }
            inputFilterArr2[i17] = inputFilter;
            inputFilterArr = inputFilterArr2;
        }
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public void setGravity(int i17) {
        super.setGravity((i17 & (-81) & (-17)) | 48);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView
    public final void setInputType(int i17) {
        super.setInputType(i17 | 131072);
    }

    public void setLineHeight(float f17) {
        if (f17 <= 0.0f) {
            return;
        }
        x(f17, true);
    }

    public void setLineSpace(float f17) {
        setLineSpacing(f17, this.f91282y);
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f17, float f18) {
        this.f91281x = f17;
        this.f91282y = f18;
        x(0.0f, true);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView
    public void setSingleLine(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        super.setTextSize(i17, f17);
        this.f91283z = android.util.TypedValue.applyDimension(i17, f17, getResources().getDisplayMetrics());
        x(0.0f, true);
    }

    public void w() {
        if (this.B) {
            if (getMeasuredHeight() > getMaxHeight()) {
                setMeasuredDimension(getMeasuredWidth(), getMaxHeight());
            } else {
                if (getMeasuredHeight() >= getMinHeight() || getMinHeight() <= 0) {
                    return;
                }
                setMeasuredDimension(getMeasuredWidth(), getMinHeight());
            }
        }
    }

    public final void x(float f17, boolean z17) {
        if (f17 <= 0.0f) {
            f17 = (this.f91282y * this.f91283z) + this.f91281x;
        }
        yl1.a aVar = this.A;
        if (aVar != null) {
            if (!(aVar.f462958d != java.lang.Math.round(f17))) {
                return;
            }
        }
        yl1.a aVar2 = this.A;
        if (aVar2 == null) {
            this.A = new yl1.a(f17, 17);
        } else {
            aVar2.f462958d = java.lang.Math.round(f17);
        }
        if (z17) {
            if (hasFocus()) {
                invalidate();
                return;
            }
            p();
            setText(getEditableText());
            t();
        }
    }
}
