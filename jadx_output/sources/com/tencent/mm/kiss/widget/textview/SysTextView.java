package com.tencent.mm.kiss.widget.textview;

/* loaded from: classes4.dex */
public class SysTextView extends com.tencent.mm.view.x2c.X2CTextView implements mm0.a {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f68482h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Field f68483i;

    /* renamed from: g, reason: collision with root package name */
    public final mm0.h f68484g;

    public SysTextView(android.content.Context context) {
        super(context);
        this.f68484g = new mm0.h(this, new nm0.a());
        b();
    }

    public final void b() {
        super.setText(" ", android.widget.TextView.BufferType.SPANNABLE);
        nm0.a aVar = new nm0.a();
        mm0.h hVar = this.f68484g;
        hVar.f328613b = aVar;
        hVar.f328613b.f338463m = super.getTextColors().getDefaultColor();
        hVar.f328613b.f338456f = super.getEllipsize();
        hVar.f328613b.f338457g = super.getGravity();
        hVar.f328613b.f338462l = super.getTextSize();
        if (f68482h) {
            return;
        }
        try {
            if (f68483i == null) {
                java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mSingleLine");
                f68483i = declaredField;
                declaredField.setAccessible(true);
            }
            if (f68483i.getBoolean(this)) {
                hVar.f328613b.f338451a = 1;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysPLTextView", "initSingleLine error: %s", e17.getMessage());
            f68482h = true;
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysPLTextView", th6, "", new java.lang.Object[0]);
            return -1;
        }
    }

    public nm0.a getConfig() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return null;
        }
        return hVar.f328613b;
    }

    @Override // mm0.a
    public int getHorizontalDrawOffset() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return 0;
        }
        return hVar.f328617f;
    }

    public mm0.g getLayoutWrapper() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return null;
        }
        return hVar.f328612a;
    }

    @Override // android.widget.TextView
    public int getLineCount() {
        android.text.StaticLayout staticLayout;
        mm0.h hVar = this.f68484g;
        if (hVar == null || (staticLayout = hVar.f328615d) == null) {
            return 0;
        }
        return staticLayout.getLineCount();
    }

    @Override // android.widget.TextView
    public int getLineHeight() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return 0;
        }
        return hVar.a();
    }

    @Override // android.widget.TextView
    public int getSelectionEnd() {
        if (getF130846i() == null) {
            return -1;
        }
        return android.text.Selection.getSelectionEnd(getF130846i());
    }

    @Override // android.widget.TextView
    public int getSelectionStart() {
        if (getF130846i() == null) {
            return -1;
        }
        return android.text.Selection.getSelectionStart(getF130846i());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    /* renamed from: getText */
    public java.lang.CharSequence getF130846i() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return null;
        }
        return hVar.f328614c;
    }

    public int getTextColor() {
        mm0.h hVar = this.f68484g;
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

    @Override // android.widget.TextView
    public float getTextSize() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return 0.0f;
        }
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
        return this.f68484g.f328615d;
    }

    @Override // mm0.a
    public int getVerticalDrawOffset() {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return 0;
        }
        return hVar.f328618g;
    }

    public void h(java.lang.CharSequence charSequence, boolean z17) {
        mm0.h hVar = this.f68484g;
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
            mm0.h hVar = this.f68484g;
            if (hVar == null) {
                return;
            }
            hVar.b(canvas);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysPLTextView", th6, "", new java.lang.Object[0]);
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            android.graphics.Point c17 = this.f68484g.c(i17, i18);
            if (c17 != null) {
                setMeasuredDimension(c17.x, c17.y);
            } else {
                try {
                    super.onMeasure(i17, i18);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysPLTextView", e17, "onMeasure error: %s", e17.getMessage());
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysPLTextView", th6, "", new java.lang.Object[0]);
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysPLTextView", e17, "onProvideStructure error: %s", e17.getMessage());
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        g();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (getTvLayout() == null) {
            return false;
        }
        boolean d17 = this.f68484g.d(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (d17) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public boolean performClick() {
        mm0.h hVar = this.f68484g;
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
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return;
        }
        hVar.f328620i = z17;
    }

    @Override // android.widget.TextView
    public void setGravity(int i17) {
        nm0.a aVar;
        mm0.h hVar = this.f68484g;
        if (hVar == null || (aVar = hVar.f328613b) == null || i17 == aVar.f338457g) {
            return;
        }
        aVar.f338457g = i17;
        hVar.f328616e = true;
    }

    public void setHandleClickableSpan(boolean z17) {
        this.f68484g.f328621j = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        mm0.h hVar = this.f68484g;
        if (hVar != null) {
            hVar.f();
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView
    public void setLines(int i17) {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return;
        }
        hVar.g(i17);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        nm0.a aVar;
        mm0.h hVar = this.f68484g;
        if (hVar == null || (aVar = hVar.f328613b) == null || i17 == aVar.f338451a) {
            return;
        }
        aVar.f338451a = i17;
        hVar.f328616e = true;
        hVar.f();
        android.view.View view = hVar.f328623l;
        view.requestLayout();
        view.invalidate();
    }

    @Override // android.widget.TextView
    public void setMinLines(int i17) {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return;
        }
        nm0.a aVar = hVar.f328613b;
        if (aVar.f338452b != i17) {
            aVar.f338452b = i17;
            hVar.f();
            android.view.View view = hVar.f328623l;
            view.requestLayout();
            view.invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        mm0.h hVar = this.f68484g;
        if (hVar != null) {
            hVar.f();
        }
        super.setPadding(i17, i18, i19, i27);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
        mm0.h hVar = this.f68484g;
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
        mm0.h hVar = this.f68484g;
        if (hVar == null || (aVar = hVar.f328613b) == null || i17 == aVar.f338463m) {
            return;
        }
        aVar.f338463m = i17;
        hVar.f328616e = true;
    }

    public void setTextLayout(mm0.g gVar) {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return;
        }
        hVar.j(gVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f17) {
        setTextSize(0, f17);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        mm0.h hVar = this.f68484g;
        if (hVar == null) {
            return;
        }
        hVar.k(i17, f17);
    }

    public SysTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68484g = new mm0.h(this, new nm0.a());
        b();
    }

    public SysTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68484g = new mm0.h(this, new nm0.a());
        b();
    }
}
