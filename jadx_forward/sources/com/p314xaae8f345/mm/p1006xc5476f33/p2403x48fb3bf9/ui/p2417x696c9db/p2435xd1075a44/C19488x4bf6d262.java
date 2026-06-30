package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView */
/* loaded from: classes8.dex */
public class C19488x4bf6d262 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19486x36f27892 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2 {
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f268585J;
    public android.view.View K;
    public boolean L;
    public boolean M;
    public float N;
    public float P;

    public C19488x4bf6d262(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getViewHeightWithTitleBar */
    private int m74806x6181e2c3() {
        int height = getHeight();
        return (!isHorizontalScrollBarEnabled() || F()) ? height : height - getHorizontalScrollbarHeight();
    }

    /* renamed from: setEmbeddedTitleBarSinceJellyBean */
    private void m74807x2a1df63b(android.view.View view) {
        if (view != null) {
            android.view.View view2 = this.f268585J;
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            this.f268585J = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a6(this, getContext());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a6) this.f268585J).addView(view, new android.widget.FrameLayout.LayoutParams(-1, -2));
            this.f268585J.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            addView(this.f268585J, layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9
    public void A0(int i17, int i18, int i19, int i27) {
        int mo120141x964f6f4a = (int) (mo120141x964f6f4a() * mo120151x7520af94());
        int height = getHeight() + i18;
        super.A0(i17, i18, i19, i27);
        invalidate();
        int i28 = mo120141x964f6f4a - height;
        if (i28 < m74808xd3ae1da8()) {
            if (java.lang.Math.abs(i28) > 20) {
                J0();
                I0(false);
            } else {
                I0(true);
            }
        }
        if (mo120159x81ae3bc3() == 0) {
            K0();
        }
    }

    public void I0(boolean z17) {
        android.view.View view = this.K;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void J0() {
        mo14660x738236e6("javascript:_updateBottomBarHeight(" + ((int) (m74808xd3ae1da8() / mo120151x7520af94())) + ");", null);
    }

    public void K0() {
        mo14660x738236e6("javascript:_updateTitleBarHeight(" + ((int) (m74809xe50ac469() / mo120151x7520af94())) + ");", null);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return m74806x6181e2c3() - m74810xa0a15efe();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return java.lang.Math.max(mo120162x95a6d12e() - m74809xe50ac469(), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        int mo120162x95a6d12e = mo120162x95a6d12e();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.N = x17;
            this.P = y17;
            if (this.f268585J == null || ((int) y17) >= m74810xa0a15efe()) {
                android.view.View view = this.K;
                if (view != null && view.getVisibility() == 0 && this.P + m74808xd3ae1da8() > getHeight()) {
                    this.M = true;
                }
            } else {
                this.L = true;
            }
        } else if (action == 2 && java.lang.Math.abs(y17 - this.P) > 50.0f && this.L) {
            motionEvent.setAction(3);
            motionEvent.setLocation(this.N, this.P + mo120162x95a6d12e);
            this.f268585J.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(0);
            motionEvent.setLocation(this.N, this.P);
            super.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(2);
            motionEvent.setLocation(x17, y17);
        }
        if (this.L && this.f268585J != null) {
            motionEvent.setLocation(x17, y17 + mo120162x95a6d12e);
            return this.f268585J.dispatchTouchEvent(motionEvent);
        }
        if (!this.M || this.K == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.setLocation(x17, (y17 + m74808xd3ae1da8()) - getHeight());
        return this.K.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        if (view != this.f268585J) {
            return super.drawChild(canvas, view, j17);
        }
        int mo120162x95a6d12e = mo120162x95a6d12e();
        canvas.save();
        canvas.translate(0.0f, -mo120162x95a6d12e);
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.restore();
        return drawChild;
    }

    /* renamed from: getBottomHeight */
    public int m74808xd3ae1da8() {
        android.view.View view = this.K;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    /* renamed from: getTitleHeight */
    public int m74809xe50ac469() {
        android.view.View view = this.f268585J;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    /* renamed from: getVisibleTitleBarHeight */
    public int m74810xa0a15efe() {
        return java.lang.Math.max(m74809xe50ac469() - mo120162x95a6d12e(), 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19486x36f27892, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: loadDataWithBaseURL */
    public void mo64581x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.I = true;
        super.mo64581x9b341568(str, str2, str3, str4, str5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2
    /* renamed from: setEmbeddedBottomBar */
    public void mo74811xefc28a3c(android.view.View view) {
        if (view != null) {
            android.view.View view2 = this.K;
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2, 80);
            this.K = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a6(this, getContext());
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a6) this.K).addView(view, layoutParams3);
            addView(this.K, layoutParams);
            android.view.View view3 = this.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "setEmbeddedBottomBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "setEmbeddedBottomBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2
    /* renamed from: setEmbeddedTitleBarCompat */
    public void mo74812x7b53e229(android.view.View view) {
        m74807x2a1df63b(view);
    }

    public C19488x4bf6d262(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
