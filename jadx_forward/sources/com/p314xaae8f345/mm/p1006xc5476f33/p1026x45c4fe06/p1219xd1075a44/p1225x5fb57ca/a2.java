package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class a2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 {
    public yl1.a A;
    public boolean B;
    public java.lang.String C;
    public android.view.MotionEvent D;
    public boolean E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e5 F;

    /* renamed from: v, reason: collision with root package name */
    public final android.text.InputFilter f172812v;

    /* renamed from: w, reason: collision with root package name */
    public final float f172813w;

    /* renamed from: x, reason: collision with root package name */
    public float f172814x;

    /* renamed from: y, reason: collision with root package name */
    public float f172815y;

    /* renamed from: z, reason: collision with root package name */
    public float f172816z;

    public a2(android.content.Context context) {
        super(context);
        this.f172812v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z1(this);
        this.f172814x = 0.0f;
        this.f172815y = 1.2f;
        this.f172816z = getTextSize();
        this.B = false;
        this.C = "cursor";
        this.E = false;
        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e5(this);
        super.setSingleLine(false);
        super.setLineSpacing(0.0f, 1.0f);
        setVerticalScrollbarPosition(2);
        setSpannableFactory(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w1(this));
        ((x.n) this.f172946m).put(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x1(this), this);
        setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y1(this));
        this.f172813w = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        m53435xf1f921b8(false);
        m53434x7f004a33("cursor");
        x(0.0f, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public void c(float f17, float f18) {
        int a17;
        if (isEnabled()) {
            if (g() && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l5.a(this, f17 + getScrollX(), f18 + getScrollY())) >= 0) {
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public boolean e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, bl1.c
    public boolean g() {
        if (!this.B) {
            k();
            getMeasuredHeight();
        }
        return (isFocusable() || this.f172951r) ? false : true;
    }

    /* renamed from: getAdjustKeyboardTo */
    public java.lang.String m53432xdb03b527() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    /* renamed from: getInputPanel */
    public android.view.View mo53433x400bc850() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.y(this);
    }

    @Override // android.widget.TextView
    public int getLineHeight() {
        yl1.a aVar = this.A;
        return aVar != null ? aVar.f544491d : super.getLineHeight();
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(this).restartInput(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02bb, code lost:
    
        if (r3[0].f173044g != false) goto L160;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performHapticFeedback(int i17, int i18) {
        return super.performHapticFeedback(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public android.text.Editable s(android.text.Editable editable) {
        this.f172949p.a(editable);
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

    /* renamed from: setAdjustKeyboardTo */
    public void m53434x7f004a33(java.lang.String str) {
        this.C = str;
    }

    /* renamed from: setAutoHeight */
    public void m53435xf1f921b8(boolean z17) {
        this.B = z17;
        setVerticalScrollBarEnabled(!z17);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        android.text.InputFilter inputFilter = this.f172812v;
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.widget.TextView
    public final void setInputType(int i17) {
        super.setInputType(i17 | 131072);
    }

    /* renamed from: setLineHeight */
    public void m53436xfda66c3d(float f17) {
        if (f17 <= 0.0f) {
            return;
        }
        x(f17, true);
    }

    /* renamed from: setLineSpace */
    public void m53437xf0085b30(float f17) {
        setLineSpacing(f17, this.f172815y);
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f17, float f18) {
        this.f172814x = f17;
        this.f172815y = f18;
        x(0.0f, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.widget.TextView
    public void setSingleLine(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        super.setTextSize(i17, f17);
        this.f172816z = android.util.TypedValue.applyDimension(i17, f17, getResources().getDisplayMetrics());
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
            f17 = (this.f172815y * this.f172816z) + this.f172814x;
        }
        yl1.a aVar = this.A;
        if (aVar != null) {
            if (!(aVar.f544491d != java.lang.Math.round(f17))) {
                return;
            }
        }
        yl1.a aVar2 = this.A;
        if (aVar2 == null) {
            this.A = new yl1.a(f17, 17);
        } else {
            aVar2.f544491d = java.lang.Math.round(f17);
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
