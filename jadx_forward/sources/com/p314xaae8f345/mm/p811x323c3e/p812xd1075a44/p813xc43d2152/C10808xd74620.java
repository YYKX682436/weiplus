package com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152;

/* renamed from: com.tencent.mm.kiss.widget.textview.StaticTextView */
/* loaded from: classes4.dex */
public class C10808xd74620 extends android.view.View implements mm0.a, wl5.a {

    /* renamed from: d, reason: collision with root package name */
    public final mm0.h f150014d;

    public C10808xd74620(android.content.Context context) {
        super(context);
        this.f150014d = new mm0.h(this, b());
        a();
    }

    public final void a() {
        mm0.h hVar = this.f150014d;
        hVar.f410147c = "";
        hVar.f410156l.setWillNotDraw(false);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public nm0.a b() {
        return new nm0.a();
    }

    public void c() {
    }

    public void d() {
    }

    public void e(float f17, float f18) {
        mm0.h hVar = this.f150014d;
        nm0.a aVar = hVar.f410146b;
        if (aVar.f419992i == f17 && aVar.f419993j == f18) {
            return;
        }
        aVar.f419992i = f17;
        aVar.f419993j = f18;
        hVar.f410149e = true;
        android.view.View view = hVar.f410156l;
        view.requestLayout();
        view.invalidate();
    }

    public void f(java.lang.CharSequence charSequence, boolean z17) {
        this.f150014d.i(charSequence, z17);
        setContentDescription(charSequence);
        setImportantForAccessibility(1);
    }

    /* renamed from: getConfig */
    public nm0.a m46319x1456a638() {
        mm0.h hVar = this.f150014d;
        if (hVar == null) {
            return null;
        }
        return hVar.f410146b;
    }

    @Override // mm0.a
    /* renamed from: getHorizontalDrawOffset */
    public int mo46320x4e1ac2b1() {
        mm0.h hVar = this.f150014d;
        if (hVar == null) {
            return 0;
        }
        return hVar.f410150f;
    }

    /* renamed from: getLayoutWrapper */
    public mm0.g m46321x2a87da53() {
        mm0.h hVar = this.f150014d;
        if (hVar == null) {
            return null;
        }
        return hVar.f410145a;
    }

    /* renamed from: getLineCount */
    public int m46322x92d2fac5() {
        android.text.StaticLayout staticLayout = this.f150014d.f410148d;
        if (staticLayout == null) {
            return 0;
        }
        return staticLayout.getLineCount();
    }

    /* renamed from: getLineHeight */
    public int m46323xcf821e31() {
        return this.f150014d.a();
    }

    /* renamed from: getLineSpacingExtra */
    public float m46324x66610f17() {
        return this.f150014d.f410146b.f419992i;
    }

    /* renamed from: getLineSpacingMultiplier */
    public float m46325x5274cf1a() {
        return this.f150014d.f410146b.f419993j;
    }

    /* renamed from: getMaxLines */
    public int m46326x931cb571() {
        nm0.a aVar = this.f150014d.f410146b;
        if (aVar != null) {
            return aVar.f419984a;
        }
        return -1;
    }

    /* renamed from: getOrientation */
    public int m46327x84093c9a() {
        int i17 = getResources().getConfiguration().orientation;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticTextView", "test test getOrientation " + i17);
        return i17;
    }

    @Override // wl5.a
    /* renamed from: getSelectableLayout */
    public android.text.Layout mo46328xcfa12296() {
        return m46337x7741c9c2();
    }

    @Override // wl5.a
    /* renamed from: getSelectableLineHeight */
    public int mo46329xcb8df7a7() {
        android.text.TextPaint textPaint;
        try {
            return m46323xcf821e31();
        } catch (java.lang.Throwable unused) {
            nm0.a m46319x1456a638 = m46319x1456a638();
            if (m46319x1456a638 == null || (textPaint = m46319x1456a638.f419987d) == null) {
                return 0;
            }
            return java.lang.Math.round((textPaint.getFontMetricsInt(null) * m46319x1456a638.f419993j) + m46319x1456a638.f419992i);
        }
    }

    @Override // wl5.a
    /* renamed from: getSelectableText */
    public java.lang.CharSequence mo46330x7df75799() {
        java.lang.CharSequence m46334xfb85ada3 = m46334xfb85ada3();
        return m46334xfb85ada3 == null ? "" : m46334xfb85ada3;
    }

    @Override // wl5.a
    /* renamed from: getSelectableTextSize */
    public float mo46331x7d07373a() {
        return m46336x40077844();
    }

    /* renamed from: getSelectionEnd */
    public int m46332xffd93625() {
        java.lang.CharSequence charSequence = this.f150014d.f410147c;
        if (charSequence == null) {
            return -1;
        }
        return android.text.Selection.getSelectionEnd(charSequence);
    }

    /* renamed from: getSelectionStart */
    public int m46333x6f2c472c() {
        java.lang.CharSequence charSequence = this.f150014d.f410147c;
        if (charSequence == null) {
            return -1;
        }
        return android.text.Selection.getSelectionStart(charSequence);
    }

    /* renamed from: getText */
    public java.lang.CharSequence m46334xfb85ada3() {
        return this.f150014d.f410147c;
    }

    /* renamed from: getTextColor */
    public int m46335xc0089f80() {
        mm0.h hVar = this.f150014d;
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

    /* renamed from: getTextSize */
    public float m46336x40077844() {
        mm0.h hVar = this.f150014d;
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
    public android.text.Layout m46337x7741c9c2() {
        return this.f150014d.f410148d;
    }

    @Override // mm0.a
    /* renamed from: getVerticalDrawOffset */
    public int mo46338xb15dc503() {
        mm0.h hVar = this.f150014d;
        if (hVar == null) {
            return 0;
        }
        return hVar.f410151g;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        mm0.h hVar = this.f150014d;
        if (hVar != null) {
            hVar.b(canvas);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        c();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 8192) {
            accessibilityEvent.setFromIndex(android.text.Selection.getSelectionStart(m46334xfb85ada3()));
            accessibilityEvent.setToIndex(android.text.Selection.getSelectionEnd(m46334xfb85ada3()));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(m46334xfb85ada3())) {
                return;
            }
            accessibilityEvent.setItemCount(m46334xfb85ada3().length());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(m46334xfb85ada3())) {
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            if (fp.h.c(18)) {
                accessibilityNodeInfo.addAction(131072);
            }
        }
        if (isFocused() && fp.h.c(18)) {
            accessibilityNodeInfo.addAction(16384);
            accessibilityNodeInfo.addAction(32768);
            accessibilityNodeInfo.addAction(65536);
        }
        if (fp.h.c(19)) {
            nm0.a aVar = this.f150014d.f410146b;
            if ((aVar != null ? aVar.f419984a : -1) > 1) {
                accessibilityNodeInfo.setMultiLine(true);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        mm0.h hVar = this.f150014d;
        if (hVar == null) {
            super.onMeasure(i17, i18);
            return;
        }
        android.graphics.Point c17 = hVar.c(i17, i18);
        if (c17 != null) {
            setMeasuredDimension(c17.x, c17.y);
        } else {
            super.onMeasure(i17, i18);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(m46334xfb85ada3())) {
            return;
        }
        accessibilityEvent.getText().add(m46334xfb85ada3());
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (m46337x7741c9c2() == null) {
            return false;
        }
        boolean d17 = this.f150014d.d(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (d17) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public boolean performClick() {
        mm0.h hVar = this.f150014d;
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
        mm0.h hVar = this.f150014d;
        if (hVar != null) {
            hVar.f410153i = z17;
        }
    }

    /* renamed from: setConfig */
    public void m46339x78bda44(nm0.a aVar) {
        this.f150014d.f410146b = aVar;
    }

    /* renamed from: setGravity */
    public void m46340xc1f6fb8c(int i17) {
        mm0.h hVar = this.f150014d;
        nm0.a aVar = hVar.f410146b;
        if (aVar == null || i17 == aVar.f419990g) {
            return;
        }
        aVar.f419990g = i17;
        hVar.f410149e = true;
    }

    /* renamed from: setHandleClickableSpan */
    public void m46341x27e2042(boolean z17) {
        this.f150014d.f410154j = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        mm0.h hVar = this.f150014d;
        if (hVar != null) {
            hVar.f();
        }
        super.setLayoutParams(layoutParams);
    }

    /* renamed from: setLines */
    public void m46342x534f0fbd(int i17) {
        this.f150014d.g(i17);
    }

    /* renamed from: setMaxLines */
    public void mo46343x8dd5167d(int i17) {
        mm0.h hVar = this.f150014d;
        nm0.a aVar = hVar.f410146b;
        if (aVar == null || i17 == aVar.f419984a) {
            return;
        }
        aVar.f419984a = i17;
        hVar.f410149e = true;
        hVar.f();
        android.view.View view = hVar.f410156l;
        view.requestLayout();
        view.invalidate();
    }

    /* renamed from: setMinLines */
    public void m46344x23f67a4f(int i17) {
        mm0.h hVar = this.f150014d;
        nm0.a aVar = hVar.f410146b;
        if (aVar.f419985b != i17) {
            aVar.f419985b = i17;
            hVar.f();
            android.view.View view = hVar.f410156l;
            view.requestLayout();
            view.invalidate();
        }
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        mm0.h hVar = this.f150014d;
        if (hVar != null) {
            hVar.f();
        }
        super.setPadding(i17, i18, i19, i27);
    }

    @Override // wl5.a
    /* renamed from: setSelectableText */
    public void mo46345x45edbfa5(java.lang.CharSequence charSequence) {
        mo46318x765074af(charSequence);
    }

    /* renamed from: setSingleLine */
    public void m46346x52d64a5e(boolean z17) {
        this.f150014d.h(z17);
    }

    /* renamed from: setText */
    public void mo46318x765074af(java.lang.CharSequence charSequence) {
        f(charSequence, true);
    }

    /* renamed from: setTextColor */
    public void m46347x1c5c5ff4(int i17) {
        mm0.h hVar = this.f150014d;
        nm0.a aVar = hVar.f410146b;
        if (aVar == null || i17 == aVar.f419996m) {
            return;
        }
        aVar.f419996m = i17;
        hVar.f410149e = true;
    }

    /* renamed from: setTextLayout */
    public void m46348x7dcbdcb9(mm0.g gVar) {
        this.f150014d.j(gVar);
    }

    /* renamed from: setTextSize */
    public void m46349x3abfd950(float f17) {
        this.f150014d.k(0, f17);
    }

    public C10808xd74620(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150014d = new mm0.h(this, b());
        a();
    }

    public C10808xd74620(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150014d = new mm0.h(this, b());
        a();
    }
}
