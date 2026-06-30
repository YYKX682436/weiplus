package com.tencent.mm.kiss.widget.textview;

/* loaded from: classes4.dex */
public class StaticTextView extends android.view.View implements mm0.a, wl5.a {

    /* renamed from: d, reason: collision with root package name */
    public final mm0.h f68481d;

    public StaticTextView(android.content.Context context) {
        super(context);
        this.f68481d = new mm0.h(this, b());
        a();
    }

    public final void a() {
        mm0.h hVar = this.f68481d;
        hVar.f328614c = "";
        hVar.f328623l.setWillNotDraw(false);
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
        mm0.h hVar = this.f68481d;
        nm0.a aVar = hVar.f328613b;
        if (aVar.f338459i == f17 && aVar.f338460j == f18) {
            return;
        }
        aVar.f338459i = f17;
        aVar.f338460j = f18;
        hVar.f328616e = true;
        android.view.View view = hVar.f328623l;
        view.requestLayout();
        view.invalidate();
    }

    public void f(java.lang.CharSequence charSequence, boolean z17) {
        this.f68481d.i(charSequence, z17);
        setContentDescription(charSequence);
        setImportantForAccessibility(1);
    }

    public nm0.a getConfig() {
        mm0.h hVar = this.f68481d;
        if (hVar == null) {
            return null;
        }
        return hVar.f328613b;
    }

    @Override // mm0.a
    public int getHorizontalDrawOffset() {
        mm0.h hVar = this.f68481d;
        if (hVar == null) {
            return 0;
        }
        return hVar.f328617f;
    }

    public mm0.g getLayoutWrapper() {
        mm0.h hVar = this.f68481d;
        if (hVar == null) {
            return null;
        }
        return hVar.f328612a;
    }

    public int getLineCount() {
        android.text.StaticLayout staticLayout = this.f68481d.f328615d;
        if (staticLayout == null) {
            return 0;
        }
        return staticLayout.getLineCount();
    }

    public int getLineHeight() {
        return this.f68481d.a();
    }

    public float getLineSpacingExtra() {
        return this.f68481d.f328613b.f338459i;
    }

    public float getLineSpacingMultiplier() {
        return this.f68481d.f328613b.f338460j;
    }

    public int getMaxLines() {
        nm0.a aVar = this.f68481d.f328613b;
        if (aVar != null) {
            return aVar.f338451a;
        }
        return -1;
    }

    public int getOrientation() {
        int i17 = getResources().getConfiguration().orientation;
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticTextView", "test test getOrientation " + i17);
        return i17;
    }

    @Override // wl5.a
    public android.text.Layout getSelectableLayout() {
        return getTvLayout();
    }

    @Override // wl5.a
    public int getSelectableLineHeight() {
        android.text.TextPaint textPaint;
        try {
            return getLineHeight();
        } catch (java.lang.Throwable unused) {
            nm0.a config = getConfig();
            if (config == null || (textPaint = config.f338454d) == null) {
                return 0;
            }
            return java.lang.Math.round((textPaint.getFontMetricsInt(null) * config.f338460j) + config.f338459i);
        }
    }

    @Override // wl5.a
    public java.lang.CharSequence getSelectableText() {
        java.lang.CharSequence text = getText();
        return text == null ? "" : text;
    }

    @Override // wl5.a
    public float getSelectableTextSize() {
        return getTextSize();
    }

    public int getSelectionEnd() {
        java.lang.CharSequence charSequence = this.f68481d.f328614c;
        if (charSequence == null) {
            return -1;
        }
        return android.text.Selection.getSelectionEnd(charSequence);
    }

    public int getSelectionStart() {
        java.lang.CharSequence charSequence = this.f68481d.f328614c;
        if (charSequence == null) {
            return -1;
        }
        return android.text.Selection.getSelectionStart(charSequence);
    }

    public java.lang.CharSequence getText() {
        return this.f68481d.f328614c;
    }

    public int getTextColor() {
        mm0.h hVar = this.f68481d;
        mm0.g gVar = hVar.f328612a;
        if (gVar != null) {
            return gVar.f328606f.getColor();
        }
        nm0.a aVar = hVar.f328613b;
        if (aVar != null) {
            return aVar.f338463m;
        }
        return 0;
    }

    public float getTextSize() {
        mm0.h hVar = this.f68481d;
        mm0.g gVar = hVar.f328612a;
        if (gVar != null) {
            return gVar.f328606f.getTextSize();
        }
        nm0.a aVar = hVar.f328613b;
        if (aVar != null) {
            return aVar.f338462l;
        }
        return 0.0f;
    }

    public android.text.Layout getTvLayout() {
        return this.f68481d.f328615d;
    }

    @Override // mm0.a
    public int getVerticalDrawOffset() {
        mm0.h hVar = this.f68481d;
        if (hVar == null) {
            return 0;
        }
        return hVar.f328618g;
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
        mm0.h hVar = this.f68481d;
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
            accessibilityEvent.setFromIndex(android.text.Selection.getSelectionStart(getText()));
            accessibilityEvent.setToIndex(android.text.Selection.getSelectionEnd(getText()));
            if (com.tencent.mm.sdk.platformtools.t8.J0(getText())) {
                return;
            }
            accessibilityEvent.setItemCount(getText().length());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!com.tencent.mm.sdk.platformtools.t8.J0(getText())) {
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
            nm0.a aVar = this.f68481d.f328613b;
            if ((aVar != null ? aVar.f338451a : -1) > 1) {
                accessibilityNodeInfo.setMultiLine(true);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        mm0.h hVar = this.f68481d;
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
        if (com.tencent.mm.sdk.platformtools.t8.J0(getText())) {
            return;
        }
        accessibilityEvent.getText().add(getText());
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (getTvLayout() == null) {
            return false;
        }
        boolean d17 = this.f68481d.d(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (d17) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public boolean performClick() {
        mm0.h hVar = this.f68481d;
        if (hVar == null) {
            return false;
        }
        if (!hVar.f328622k && hVar.f328620i) {
            return super.performClick();
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        super.setClickable(z17);
        mm0.h hVar = this.f68481d;
        if (hVar != null) {
            hVar.f328620i = z17;
        }
    }

    public void setConfig(nm0.a aVar) {
        this.f68481d.f328613b = aVar;
    }

    public void setGravity(int i17) {
        mm0.h hVar = this.f68481d;
        nm0.a aVar = hVar.f328613b;
        if (aVar == null || i17 == aVar.f338457g) {
            return;
        }
        aVar.f338457g = i17;
        hVar.f328616e = true;
    }

    public void setHandleClickableSpan(boolean z17) {
        this.f68481d.f328621j = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        mm0.h hVar = this.f68481d;
        if (hVar != null) {
            hVar.f();
        }
        super.setLayoutParams(layoutParams);
    }

    public void setLines(int i17) {
        this.f68481d.g(i17);
    }

    public void setMaxLines(int i17) {
        mm0.h hVar = this.f68481d;
        nm0.a aVar = hVar.f328613b;
        if (aVar == null || i17 == aVar.f338451a) {
            return;
        }
        aVar.f338451a = i17;
        hVar.f328616e = true;
        hVar.f();
        android.view.View view = hVar.f328623l;
        view.requestLayout();
        view.invalidate();
    }

    public void setMinLines(int i17) {
        mm0.h hVar = this.f68481d;
        nm0.a aVar = hVar.f328613b;
        if (aVar.f338452b != i17) {
            aVar.f338452b = i17;
            hVar.f();
            android.view.View view = hVar.f328623l;
            view.requestLayout();
            view.invalidate();
        }
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        mm0.h hVar = this.f68481d;
        if (hVar != null) {
            hVar.f();
        }
        super.setPadding(i17, i18, i19, i27);
    }

    @Override // wl5.a
    public void setSelectableText(java.lang.CharSequence charSequence) {
        setText(charSequence);
    }

    public void setSingleLine(boolean z17) {
        this.f68481d.h(z17);
    }

    public void setText(java.lang.CharSequence charSequence) {
        f(charSequence, true);
    }

    public void setTextColor(int i17) {
        mm0.h hVar = this.f68481d;
        nm0.a aVar = hVar.f328613b;
        if (aVar == null || i17 == aVar.f338463m) {
            return;
        }
        aVar.f338463m = i17;
        hVar.f328616e = true;
    }

    public void setTextLayout(mm0.g gVar) {
        this.f68481d.j(gVar);
    }

    public void setTextSize(float f17) {
        this.f68481d.k(0, f17);
    }

    public StaticTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68481d = new mm0.h(this, b());
        a();
    }

    public StaticTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68481d = new mm0.h(this, b());
        a();
    }
}
