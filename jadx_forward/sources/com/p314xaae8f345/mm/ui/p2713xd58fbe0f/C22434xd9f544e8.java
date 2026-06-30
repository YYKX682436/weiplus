package com.p314xaae8f345.mm.ui.p2713xd58fbe0f;

/* renamed from: com.tencent.mm.ui.indicator.TitlePageIndicator */
/* loaded from: classes15.dex */
public class C22434xd9f544e8 extends android.view.View implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f290479d;

    /* renamed from: e, reason: collision with root package name */
    public int f290480e;

    /* renamed from: f, reason: collision with root package name */
    public float f290481f;

    /* renamed from: g, reason: collision with root package name */
    public int f290482g;

    /* renamed from: h, reason: collision with root package name */
    public int f290483h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f290484i;

    /* renamed from: m, reason: collision with root package name */
    public int f290485m;

    /* renamed from: mViewPager */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f39600x1c18ee31;

    /* renamed from: n, reason: collision with root package name */
    public int f290486n;

    /* renamed from: o, reason: collision with root package name */
    public int f290487o;

    /* renamed from: p, reason: collision with root package name */
    public int f290488p;

    /* renamed from: q, reason: collision with root package name */
    public float f290489q;

    /* renamed from: r, reason: collision with root package name */
    public float f290490r;

    /* renamed from: s, reason: collision with root package name */
    public float f290491s;

    /* renamed from: t, reason: collision with root package name */
    public int f290492t;

    /* renamed from: u, reason: collision with root package name */
    public float f290493u;

    /* renamed from: v, reason: collision with root package name */
    public int f290494v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f290495w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2713xd58fbe0f.a f290496x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2713xd58fbe0f.a f290497y;

    /* renamed from: com.tencent.mm.ui.indicator.TitlePageIndicator$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2713xd58fbe0f.C22434xd9f544e8.SavedState> f39601x681a0c0c = new com.p314xaae8f345.mm.ui.p2713xd58fbe0f.c();

        /* renamed from: d, reason: collision with root package name */
        public int f290498d;

        public SavedState(android.os.Parcel parcel, com.p314xaae8f345.mm.ui.p2713xd58fbe0f.b bVar) {
            super(parcel);
            this.f290498d = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f290498d);
        }
    }

    public C22434xd9f544e8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f290480e = -1;
        this.f290484i = new android.graphics.Paint();
        new android.graphics.Rect();
        this.f290493u = -1.0f;
        this.f290494v = -1;
        b();
    }

    /* renamed from: getCount */
    private int m80728x7444f759() {
        return this.f39600x1c18ee31.m80829xf939df19().mo8338x7444f759() + 1;
    }

    public final android.graphics.Rect a(int i17, android.graphics.Paint paint) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        java.lang.CharSequence mo8340x337c8253 = this.f39600x1c18ee31.m80829xf939df19().mo8340x337c8253(i17);
        if (mo8340x337c8253 == null) {
            mo8340x337c8253 = "";
        }
        paint.getTextBounds(mo8340x337c8253.toString(), 0, mo8340x337c8253.length(), rect2);
        rect.left = 0;
        rect.top = (getHeight() - rect2.height()) / 2;
        rect.right = rect.left + rect2.width();
        rect.bottom = rect.top + rect2.height();
        return rect;
    }

    public final void b() {
        if (isInEditMode()) {
            return;
        }
        this.f290490r = i65.a.b(getContext(), 16);
        this.f290489q = i65.a.b(getContext(), 16);
        this.f290491s = i65.a.b(getContext(), 16);
        this.f290485m = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d);
        this.f290486n = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        this.f290487o = i65.a.b(getContext(), 17);
        this.f290488p = i65.a.b(getContext(), 22);
        this.f290496x = new com.p314xaae8f345.mm.ui.p2713xd58fbe0f.a(this.f290485m, this.f290486n, 100);
        this.f290497y = new com.p314xaae8f345.mm.ui.p2713xd58fbe0f.a(this.f290486n, this.f290485m, 100);
        android.graphics.Paint paint = this.f290484i;
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        java.lang.reflect.Method method = n3.o1.f415911a;
        this.f290492t = viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: getClipPadding */
    public float m80729xf3011d6b() {
        return this.f290491s;
    }

    /* renamed from: getSelectedColor */
    public int m80730x12a471d2() {
        return this.f290486n;
    }

    /* renamed from: getTextColor */
    public int m80731xc0089f80() {
        return this.f290485m;
    }

    /* renamed from: getTextSize */
    public float m80732x40077844() {
        return this.f290484i.getTextSize();
    }

    /* renamed from: getTitlePadding */
    public float m80733x5c64710f() {
        return this.f290489q;
    }

    /* renamed from: getTopPadding */
    public float m80734x8ee090f2() {
        return this.f290490r;
    }

    /* renamed from: getTypeface */
    public android.graphics.Typeface m80735x5392760d() {
        return this.f290484i.getTypeface();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int m80728x7444f759;
        int i17;
        int i18;
        android.graphics.Rect a17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d;
        super.onDraw(canvas);
        if (this.f39600x1c18ee31 == null || (m80728x7444f759 = m80728x7444f759()) == 0) {
            return;
        }
        if (this.f290480e == -1 && (c21470xb673f8d = this.f39600x1c18ee31) != null) {
            this.f290480e = c21470xb673f8d.m80830xfda78ef6();
        }
        int left = getLeft();
        int width = getWidth() + left;
        int i19 = this.f290480e;
        float f17 = this.f290481f;
        if (f17 > 0.5d) {
            i19++;
            f17 = 1.0f - f17;
        }
        android.graphics.Paint paint = this.f290484i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int m80728x7444f7592 = m80728x7444f759();
        int width2 = getWidth();
        getHeight();
        int i27 = width2 / 2;
        int i28 = 0;
        while (i28 < m80728x7444f7592) {
            if (i19 == i28) {
                paint.setTextSize(this.f290488p - ((r10 - this.f290487o) * f17));
                a17 = a(i28, paint);
            } else {
                int i29 = this.f290488p;
                paint.setTextSize(this.f290487o + ((i29 - r11) * f17));
                a17 = a(i28, paint);
            }
            int i37 = a17.right - a17.left;
            float f18 = i37;
            int m80729xf3011d6b = (((int) (i27 - (f18 / 2.0f))) - (((int) (this.f290482g - (this.f290481f * (f18 + m80729xf3011d6b())))) / 2)) + (((int) ((i28 - this.f290480e) * ((width2 - i37) - m80729xf3011d6b()))) / 2);
            a17.left = m80729xf3011d6b;
            a17.right = m80729xf3011d6b + i37;
            arrayList.add(a17);
            i28++;
            m80728x7444f7592 = m80728x7444f7592;
            i27 = i27;
        }
        int size = arrayList.size();
        if (this.f290480e >= size) {
            m80736x940d026a(size - 1);
            return;
        }
        int i38 = 0;
        while (i38 < m80728x7444f759) {
            android.graphics.Rect rect = (android.graphics.Rect) arrayList.get(i38);
            int i39 = rect.left;
            if ((i39 <= left || i39 >= width) && ((i17 = rect.right) <= left || i17 >= width)) {
                i18 = i38;
            } else {
                boolean z17 = i38 == i19;
                java.lang.CharSequence mo8340x337c8253 = this.f39600x1c18ee31.m80829xf939df19().mo8340x337c8253(i38);
                if (mo8340x337c8253 == null) {
                    mo8340x337c8253 = "";
                }
                if (z17) {
                    paint.setTextSize(this.f290488p - ((r7 - this.f290487o) * f17));
                    paint.setColor(this.f290497y.a((int) (100.0f * f17)));
                } else {
                    int i47 = this.f290488p;
                    paint.setTextSize(this.f290487o + ((i47 - r10) * f17));
                    paint.setColor(this.f290496x.a((int) (100.0f * f17)));
                }
                i18 = i38;
                canvas.drawText(mo8340x337c8253, 0, mo8340x337c8253.length(), rect.left, rect.bottom, paint);
            }
            i38 = i18 + 1;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        this.f290483h = i17;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f290479d;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8331xcb2941fe(i17);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TitlePageIndicator", "onPageScrolled %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18));
        this.f290480e = i17;
        this.f290481f = f17;
        this.f290482g = i18;
        invalidate();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f290479d;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8332xf210c75a(i17, f17, i18);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        if (this.f290483h == 0) {
            this.f290480e = i17;
            invalidate();
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f290479d;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8333x510f45c9(i17);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.p314xaae8f345.mm.ui.p2713xd58fbe0f.C22434xd9f544e8.SavedState savedState = (com.p314xaae8f345.mm.ui.p2713xd58fbe0f.C22434xd9f544e8.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f290480e = savedState.f290498d;
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p314xaae8f345.mm.ui.p2713xd58fbe0f.C22434xd9f544e8.SavedState savedState = new com.p314xaae8f345.mm.ui.p2713xd58fbe0f.C22434xd9f544e8.SavedState(super.onSaveInstanceState());
        savedState.f290498d = this.f290480e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int i17;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f39600x1c18ee31 == null || m80728x7444f759() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x17 = motionEvent.getX(motionEvent.findPointerIndex(this.f290494v));
                    float f17 = x17 - this.f290493u;
                    if (!this.f290495w && java.lang.Math.abs(f17) > this.f290492t) {
                        this.f290495w = true;
                    }
                    if (this.f290495w) {
                        this.f290493u = x17;
                        if (this.f39600x1c18ee31.m80837xb978e60e() || this.f39600x1c18ee31.m80823x55dee9f2()) {
                            this.f39600x1c18ee31.m80828x47a1e860(f17);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f290493u = motionEvent.getX(actionIndex);
                        this.f290494v = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex2) == this.f290494v) {
                            this.f290494v = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f290493u = motionEvent.getX(motionEvent.findPointerIndex(this.f290494v));
                    }
                }
            }
            if (!this.f290495w) {
                int m80728x7444f759 = m80728x7444f759();
                float width = getWidth();
                float f18 = width / 2.0f;
                float f19 = width / 6.0f;
                float f27 = f18 - f19;
                float f28 = f18 + f19;
                float x18 = motionEvent.getX();
                if (x18 < f27) {
                    int i18 = this.f290480e;
                    if (i18 > 0) {
                        if (action != 3) {
                            this.f39600x1c18ee31.m80844x940d026a(i18 - 1);
                        }
                        return true;
                    }
                } else if (x18 > f28 && (i17 = this.f290480e) < m80728x7444f759 - 1) {
                    if (action != 3) {
                        this.f39600x1c18ee31.m80844x940d026a(i17 + 1);
                    }
                    return true;
                }
            }
            this.f290495w = false;
            this.f290494v = -1;
            if (this.f39600x1c18ee31.m80837xb978e60e()) {
                this.f39600x1c18ee31.m80826xcf99a824();
            }
        } else {
            this.f290494v = motionEvent.getPointerId(0);
            this.f290493u = motionEvent.getX();
        }
        return true;
    }

    /* renamed from: setCurrentItem */
    public void m80736x940d026a(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = this.f39600x1c18ee31;
        if (c21470xb673f8d == null) {
            throw new java.lang.IllegalStateException("ViewPager has not been bound.");
        }
        c21470xb673f8d.m80844x940d026a(i17);
        this.f290480e = i17;
        invalidate();
    }

    /* renamed from: setOnPageChangeListener */
    public void m80737x2d3430b4(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        this.f290479d = onPageChangeListener;
    }

    /* renamed from: setSelectedBold */
    public void m80738x2ea06942(boolean z17) {
        invalidate();
    }

    /* renamed from: setSelectedColor */
    public void m80739xa57ad846(int i17) {
        this.f290486n = i17;
        invalidate();
    }

    /* renamed from: setTextColor */
    public void m80740x1c5c5ff4(int i17) {
        this.f290484i.setColor(i17);
        this.f290485m = i17;
        invalidate();
    }

    /* renamed from: setTextSize */
    public void m80741x3abfd950(float f17) {
        this.f290484i.setTextSize(f17);
        invalidate();
    }

    /* renamed from: setTitlePadding */
    public void m80742x92ad6c1b(float f17) {
        this.f290489q = f17;
        invalidate();
    }

    /* renamed from: setTopPadding */
    public void m80743xbd04defe(float f17) {
        this.f290490r = f17;
        invalidate();
    }

    /* renamed from: setTypeface */
    public void m80744x4e4ad719(android.graphics.Typeface typeface) {
        this.f290484i.setTypeface(typeface);
        invalidate();
    }

    /* renamed from: setViewPager */
    public void m80745xfd22d5dc(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d2 = this.f39600x1c18ee31;
        if (c21470xb673f8d2 == c21470xb673f8d) {
            return;
        }
        if (c21470xb673f8d2 != null) {
            c21470xb673f8d2.mo79170x2d3430b4(null);
        }
        if (c21470xb673f8d.m80829xf939df19() == null) {
            throw new java.lang.IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f39600x1c18ee31 = c21470xb673f8d;
        c21470xb673f8d.mo79170x2d3430b4(this);
        invalidate();
    }

    public C22434xd9f544e8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f290480e = -1;
        this.f290484i = new android.graphics.Paint();
        new android.graphics.Rect();
        this.f290493u = -1.0f;
        this.f290494v = -1;
        b();
    }
}
