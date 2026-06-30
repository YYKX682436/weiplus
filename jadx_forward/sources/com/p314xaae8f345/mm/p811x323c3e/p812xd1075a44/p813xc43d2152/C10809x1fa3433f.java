package com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152;

/* renamed from: com.tencent.mm.kiss.widget.textview.SysTextView */
/* loaded from: classes4.dex */
public class C10809x1fa3433f extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b implements mm0.a {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f150015h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Field f150016i;

    /* renamed from: g, reason: collision with root package name */
    public final mm0.h f150017g;

    public C10809x1fa3433f(android.content.Context context) {
        super(context);
        this.f150017g = new mm0.h(this, new nm0.a());
        b();
    }

    public final void b() {
        super.setText(" ", android.widget.TextView.BufferType.SPANNABLE);
        nm0.a aVar = new nm0.a();
        mm0.h hVar = this.f150017g;
        hVar.f410146b = aVar;
        hVar.f410146b.f419996m = super.getTextColors().getDefaultColor();
        hVar.f410146b.f419989f = super.getEllipsize();
        hVar.f410146b.f419990g = super.getGravity();
        hVar.f410146b.f419995l = super.getTextSize();
        if (f150015h) {
            return;
        }
        try {
            if (f150016i == null) {
                java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mSingleLine");
                f150016i = declaredField;
                declaredField.setAccessible(true);
            }
            if (f150016i.getBoolean(this)) {
                hVar.f410146b.f419984a = 1;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysPLTextView", "initSingleLine error: %s", e17.getMessage());
            f150015h = true;
        }
    }

    @Override // android.view.View
    public void dispatchProvideStructure(android.view.ViewStructure viewStructure) {
    }

    public void e() {
    }

    public void g() {
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysPLTextView", th6, "", new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: getConfig */
    public nm0.a m46350x1456a638() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return null;
        }
        return hVar.f410146b;
    }

    @Override // mm0.a
    /* renamed from: getHorizontalDrawOffset */
    public int mo46320x4e1ac2b1() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return 0;
        }
        return hVar.f410150f;
    }

    /* renamed from: getLayoutWrapper */
    public mm0.g m46351x2a87da53() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return null;
        }
        return hVar.f410145a;
    }

    @Override // android.widget.TextView
    public int getLineCount() {
        android.text.StaticLayout staticLayout;
        mm0.h hVar = this.f150017g;
        if (hVar == null || (staticLayout = hVar.f410148d) == null) {
            return 0;
        }
        return staticLayout.getLineCount();
    }

    @Override // android.widget.TextView
    public int getLineHeight() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return 0;
        }
        return hVar.a();
    }

    @Override // android.widget.TextView
    public int getSelectionEnd() {
        if (getF212379i() == null) {
            return -1;
        }
        return android.text.Selection.getSelectionEnd(getF212379i());
    }

    @Override // android.widget.TextView
    public int getSelectionStart() {
        if (getF212379i() == null) {
            return -1;
        }
        return android.text.Selection.getSelectionStart(getF212379i());
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView
    /* renamed from: getText */
    public java.lang.CharSequence getF212379i() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return null;
        }
        return hVar.f410147c;
    }

    /* renamed from: getTextColor */
    public int m46352xc0089f80() {
        mm0.h hVar = this.f150017g;
        mm0.g gVar = hVar.f410145a;
        if (gVar != null) {
            return gVar.f410139f.getColor();
        }
        nm0.a aVar = hVar.f410146b;
        if (aVar != null) {
            return aVar.f419996m;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public float getTextSize() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return 0.0f;
        }
        mm0.g gVar = hVar.f410145a;
        if (gVar != null) {
            return gVar.f410139f.getTextSize();
        }
        nm0.a aVar = hVar.f410146b;
        if (aVar != null) {
            return aVar.f419995l;
        }
        return 0.0f;
    }

    /* renamed from: getTvLayout */
    public android.text.Layout m46353x7741c9c2() {
        return this.f150017g.f410148d;
    }

    @Override // mm0.a
    /* renamed from: getVerticalDrawOffset */
    public int mo46338xb15dc503() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return 0;
        }
        return hVar.f410151g;
    }

    public void h(java.lang.CharSequence charSequence, boolean z17) {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            super.setText("");
        } else {
            hVar.i(charSequence, z17);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            mm0.h hVar = this.f150017g;
            if (hVar == null) {
                return;
            }
            hVar.b(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysPLTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        e();
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z17) {
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            android.graphics.Point c17 = this.f150017g.c(i17, i18);
            if (c17 != null) {
                setMeasuredDimension(c17.x, c17.y);
            } else {
                try {
                    super.onMeasure(i17, i18);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysPLTextView", e17, "onMeasure error: %s", e17.getMessage());
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysPLTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return true;
    }

    @Override // android.view.View
    public void onProvideStructure(android.view.ViewStructure viewStructure) {
        try {
            super.onProvideStructure(viewStructure);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysPLTextView", e17, "onProvideStructure error: %s", e17.getMessage());
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        g();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (m46353x7741c9c2() == null) {
            return false;
        }
        boolean d17 = this.f150017g.d(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (d17) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public boolean performClick() {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return false;
        }
        if (!hVar.f410155k && hVar.f410153i) {
            return super.performClick();
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        super.setClickable(z17);
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return;
        }
        hVar.f410153i = z17;
    }

    @Override // android.widget.TextView
    public void setGravity(int i17) {
        nm0.a aVar;
        mm0.h hVar = this.f150017g;
        if (hVar == null || (aVar = hVar.f410146b) == null || i17 == aVar.f419990g) {
            return;
        }
        aVar.f419990g = i17;
        hVar.f410149e = true;
    }

    /* renamed from: setHandleClickableSpan */
    public void m46354x27e2042(boolean z17) {
        this.f150017g.f410154j = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        mm0.h hVar = this.f150017g;
        if (hVar != null) {
            hVar.f();
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView
    public void setLines(int i17) {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return;
        }
        hVar.g(i17);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        nm0.a aVar;
        mm0.h hVar = this.f150017g;
        if (hVar == null || (aVar = hVar.f410146b) == null || i17 == aVar.f419984a) {
            return;
        }
        aVar.f419984a = i17;
        hVar.f410149e = true;
        hVar.f();
        android.view.View view = hVar.f410156l;
        view.requestLayout();
        view.invalidate();
    }

    @Override // android.widget.TextView
    public void setMinLines(int i17) {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return;
        }
        nm0.a aVar = hVar.f410146b;
        if (aVar.f419985b != i17) {
            aVar.f419985b = i17;
            hVar.f();
            android.view.View view = hVar.f410156l;
            view.requestLayout();
            view.invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        mm0.h hVar = this.f150017g;
        if (hVar != null) {
            hVar.f();
        }
        super.setPadding(i17, i18, i19, i27);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return;
        }
        hVar.h(z17);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        h(charSequence, false);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i17) {
        nm0.a aVar;
        mm0.h hVar = this.f150017g;
        if (hVar == null || (aVar = hVar.f410146b) == null || i17 == aVar.f419996m) {
            return;
        }
        aVar.f419996m = i17;
        hVar.f410149e = true;
    }

    /* renamed from: setTextLayout */
    public void m46355x7dcbdcb9(mm0.g gVar) {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return;
        }
        hVar.j(gVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f17) {
        setTextSize(0, f17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        mm0.h hVar = this.f150017g;
        if (hVar == null) {
            return;
        }
        hVar.k(i17, f17);
    }

    public C10809x1fa3433f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150017g = new mm0.h(this, new nm0.a());
        b();
    }

    public C10809x1fa3433f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150017g = new mm0.h(this, new nm0.a());
        b();
    }
}
