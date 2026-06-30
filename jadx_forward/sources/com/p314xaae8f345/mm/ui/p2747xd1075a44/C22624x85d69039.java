package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMNeat7extView */
/* loaded from: classes14.dex */
public class C22624x85d69039 extends com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc {
    public static boolean S;
    public static final java.lang.String T = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de);
    public static boolean U = true;
    public android.view.GestureDetector M;
    public android.view.View.OnLongClickListener N;
    public al5.v1 P;
    public al5.w1 Q;
    public final android.view.View.AccessibilityDelegate R;

    public C22624x85d69039(android.content.Context context) {
        super(context);
        this.R = new al5.u1(this);
        n();
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc
    public void b(java.lang.CharSequence charSequence) {
        al5.w1 w1Var;
        try {
            super.b(charSequence);
            if (this.f296711e && (w1Var = this.Q) != null) {
                charSequence.toString();
                w1Var.getClass();
            }
            setContentDescription(charSequence);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", replaceAll, e17);
            al5.w1 w1Var2 = this.Q;
            if (w1Var2 == null) {
                throw e17;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vn) w1Var2).a(e17, replaceAll, "_setText");
        }
        al5.v1 v1Var = this.P;
        if (v1Var != null) {
            v1Var.a(charSequence, charSequence instanceof android.text.Spannable ? android.widget.TextView.BufferType.SPANNABLE : android.widget.TextView.BufferType.NORMAL);
        }
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc
    public void c(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, java.lang.Boolean bool) {
        al5.w1 w1Var;
        try {
            super.c(charSequence, bufferType, bool);
            if (this.f296711e && (w1Var = this.Q) != null) {
                charSequence.toString();
                w1Var.getClass();
            }
            setContentDescription(charSequence);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", replaceAll, e17);
            al5.w1 w1Var2 = this.Q;
            if (w1Var2 == null) {
                throw e17;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vn) w1Var2).a(e17, replaceAll, "_setText");
        }
        al5.v1 v1Var = this.P;
        if (v1Var != null) {
            v1Var.a(charSequence, bufferType);
        }
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.TextView.class.getName();
    }

    @Override // android.view.View
    public java.lang.CharSequence getContentDescription() {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        return ((accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) || z65.c.a()) ? a() : "";
    }

    /* renamed from: getSelectionEnd */
    public int m81367xffd93625() {
        return android.text.Selection.getSelectionEnd(a());
    }

    /* renamed from: getSelectionStart */
    public int m81368x6f2c472c() {
        return android.text.Selection.getSelectionStart(a());
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a
    /* renamed from: getVerticalOffset */
    public float mo81369xcbe6949f() {
        if (!S) {
            return super.mo81369xcbe6949f();
        }
        float mo81369xcbe6949f = super.mo81369xcbe6949f();
        getMeasuredHeight();
        return mo81369xcbe6949f;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc
    public boolean h() {
        return U;
    }

    public final void n() {
        this.M = new android.view.GestureDetector(getContext(), new al5.s1(this), new android.os.Handler(android.os.Looper.getMainLooper()));
        setAccessibilityDelegate(this.R);
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNeat7extView", "[onDraw] replaceContent:%s exception:%s", replaceAll, e17);
            if (this.Q == null) {
                throw e17;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vn) this.Q).a(e17, replaceAll, "onDraw");
        }
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNeat7extView", "[onMeasure] replaceContent:%s exception:%s", replaceAll, e17);
            if (this.Q == null) {
                throw e17;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vn) this.Q).a(e17, replaceAll, "onMeasure");
        }
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!U || (this.f296711e && this.M != null)) {
            android.view.GestureDetector gestureDetector = this.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/widget/MMNeat7extView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/widget/MMNeat7extView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(drawable);
        if (m84165x334dfae1() != null) {
            m84165x334dfae1().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        if (m84165x334dfae1() != null) {
            m84165x334dfae1().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: setIsOpen */
    public void m81370x11f35996(boolean z17) {
        U = z17;
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.N = onLongClickListener;
        super.setOnLongClickListener(new al5.t1(this));
    }

    /* renamed from: setTextCrashListener */
    public void m81371xc299050c(al5.w1 w1Var) {
        this.Q = w1Var;
    }

    /* renamed from: setTextListener */
    public void m81372xd77b7e83(al5.v1 v1Var) {
        this.P = v1Var;
    }

    public C22624x85d69039(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new al5.u1(this);
        n();
    }
}
