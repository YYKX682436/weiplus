package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFormVerifyCodeInputView */
/* loaded from: classes5.dex */
public class C21493x36e72905 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f278905d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f278906e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f278907f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f278908g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f278909h;

    /* renamed from: i, reason: collision with root package name */
    public final int f278910i;

    /* renamed from: m, reason: collision with root package name */
    public final int f278911m;

    /* renamed from: n, reason: collision with root package name */
    public final int f278912n;

    /* renamed from: o, reason: collision with root package name */
    public final int f278913o;

    /* renamed from: p, reason: collision with root package name */
    public int f278914p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f278915q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f278916r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f278917s;

    public C21493x36e72905(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f278910i = -1;
        this.f278911m = -1;
        this.f278912n = -1;
        this.f278913o = 60;
        this.f278914p = 60;
        this.f278916r = null;
        this.f278917s = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544635i, i17, 0);
        this.f278911m = obtainStyledAttributes.getResourceId(1, -1);
        this.f278910i = obtainStyledAttributes.getResourceId(3, -1);
        this.f278912n = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId, this);
    }

    public void a() {
        this.f278908g.setVisibility(8);
        this.f278907f.setVisibility(0);
        this.f278907f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwu, java.lang.Integer.valueOf(this.f278913o)));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f278915q;
        if (b4Var != null) {
            b4Var.d();
            this.f278915q.c(1000L, 1000L);
        } else if (getContext() != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(getContext().getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new db5.k2(this), true);
            this.f278915q = b4Var2;
            b4Var2.c(1000L, 1000L);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f278915q;
            if (b4Var3 != null) {
                b4Var3.d();
            }
        }
    }

    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f278915q;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f278906e.setText("");
        this.f278907f.setVisibility(8);
        this.f278914p = this.f278913o;
        this.f278908g.setVisibility(0);
    }

    /* renamed from: getContentEditText */
    public android.widget.EditText m78955xd454f3ba() {
        return this.f278906e;
    }

    /* renamed from: getText */
    public android.text.Editable m78956xfb85ada3() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            return c21486x59d05a04.getText();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        return null;
    }

    /* renamed from: getTitleTextView */
    public android.widget.TextView m78957xc6410034() {
        return this.f278905d;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f278905d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f278906e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.d98);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.bxs);
        this.f278909h = findViewById;
        findViewById.setOnClickListener(new db5.g2(this));
        float f17 = j65.f.f379476g;
        if (i65.a.D(getContext()) || f17 > 1.1d) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.o8x);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.mm7);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.hsz);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f278907f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567007ht1);
            this.f278908g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567006ht0);
        } else {
            this.f278907f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o8x);
            this.f278908g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mm7);
        }
        this.f278908g.setVisibility(0);
        android.widget.TextView textView = this.f278905d;
        if (textView == null || this.f278906e == null || this.f278907f == null || this.f278908g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", textView, this.f278906e, this.f278907f, this.f278908g);
        } else {
            int i17 = this.f278910i;
            if (i17 != -1) {
                textView.setText(i17);
            }
            int i18 = this.f278911m;
            if (i18 != -1) {
                this.f278906e.setHint(i18);
            }
            int i19 = this.f278912n;
            if (i19 != -1) {
                this.f278908g.setText(i19);
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setOnFocusChangeListener(new db5.h2(this));
            this.f278906e.m78916xcc19bcee(new db5.i2(this));
        }
        android.widget.Button button = this.f278908g;
        if (button != null) {
            button.setOnClickListener(new db5.j2(this));
        }
    }

    /* renamed from: setFocusListener */
    public void m78958xd748486a(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f278916r = onFocusChangeListener;
    }

    /* renamed from: setHint */
    public void m78960x764b0e09(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setHint(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setImeOption */
    public void m78961xd2b7a954(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setImeOptions(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setInputType */
    public void m78962xc17f97e2(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setInputType(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setSendSmsBtnClickListener */
    public void m78963x3d4bc56f(android.view.View.OnClickListener onClickListener) {
        this.f278917s = onClickListener;
    }

    /* renamed from: setSmsBtnText */
    public void m78964x14308412(int i17) {
        android.widget.Button button = this.f278908g;
        if (button != null) {
            button.setText(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    /* renamed from: setText */
    public void m78966x765074af(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setTitle */
    public void m78968x53bfe316(java.lang.String str) {
        android.widget.TextView textView = this.f278905d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    /* renamed from: setHint */
    public void m78959x764b0e09(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.setHint(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setSmsBtnText */
    public void m78965x14308412(java.lang.String str) {
        android.widget.Button button = this.f278908g;
        if (button != null) {
            button.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    /* renamed from: setTitle */
    public void m78967x53bfe316(int i17) {
        android.widget.TextView textView = this.f278905d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public C21493x36e72905(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
