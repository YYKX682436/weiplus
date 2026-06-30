package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView */
/* loaded from: classes5.dex */
public class C12545x36e72905 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f168942d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f168943e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f168944f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f168945g;

    /* renamed from: h, reason: collision with root package name */
    public final int f168946h;

    /* renamed from: i, reason: collision with root package name */
    public final int f168947i;

    /* renamed from: m, reason: collision with root package name */
    public final int f168948m;

    /* renamed from: n, reason: collision with root package name */
    public final int f168949n;

    /* renamed from: o, reason: collision with root package name */
    public int f168950o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f168951p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f168952q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f168953r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f168954s;

    public C12545x36e72905(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f168946h = -1;
        this.f168947i = -1;
        this.f168948m = -1;
        this.f168949n = 60;
        this.f168950o = 60;
        this.f168953r = null;
        this.f168954s = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544635i, i17, 0);
        this.f168947i = obtainStyledAttributes.getResourceId(1, -1);
        this.f168946h = obtainStyledAttributes.getResourceId(3, -1);
        this.f168948m = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId, this);
    }

    /* renamed from: getContentEditText */
    public android.widget.EditText m52279xd454f3ba() {
        return this.f168943e;
    }

    /* renamed from: getText */
    public android.text.Editable m52280xfb85ada3() {
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            return editText.getText();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        return null;
    }

    /* renamed from: getTitleTextView */
    public android.widget.TextView m52281xc6410034() {
        return this.f168942d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f168942d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f168943e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f168944f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o8x);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mm7);
        this.f168945g = button;
        android.widget.TextView textView = this.f168942d;
        if (textView == null || this.f168943e == null || this.f168944f == null || button == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", textView, this.f168943e, this.f168944f, button);
        } else {
            int i17 = this.f168946h;
            if (i17 != -1) {
                textView.setText(i17);
            }
            int i18 = this.f168947i;
            if (i18 != -1) {
                this.f168943e.setHint(i18);
            }
            int i19 = this.f168948m;
            if (i19 != -1) {
                this.f168945g.setText(i19);
            }
        }
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            editText.setOnFocusChangeListener(new wi1.a(this));
        }
        android.widget.Button button2 = this.f168945g;
        if (button2 != null) {
            zk1.m.a(button2, null, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            this.f168945g.setOnClickListener(new wi1.b(this));
        }
    }

    /* renamed from: setFocusListener */
    public void m52282xd748486a(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f168953r = onFocusChangeListener;
    }

    /* renamed from: setHint */
    public void m52284x764b0e09(java.lang.String str) {
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setImeOption */
    public void m52285xd2b7a954(int i17) {
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            editText.setImeOptions(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setInputType */
    public void m52286xc17f97e2(int i17) {
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            editText.setInputType(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setSendSmsBtnClickListener */
    public void m52287x3d4bc56f(android.view.View.OnClickListener onClickListener) {
        this.f168954s = onClickListener;
    }

    /* renamed from: setSmsBtnText */
    public void m52288x14308412(int i17) {
        android.widget.Button button = this.f168945g;
        if (button != null) {
            button.setText(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    /* renamed from: setText */
    public void m52290x765074af(java.lang.String str) {
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setTitle */
    public void m52292x53bfe316(java.lang.String str) {
        android.widget.TextView textView = this.f168942d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    /* renamed from: setHint */
    public void m52283x764b0e09(int i17) {
        android.widget.EditText editText = this.f168943e;
        if (editText != null) {
            editText.setHint(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    /* renamed from: setSmsBtnText */
    public void m52289x14308412(java.lang.String str) {
        android.widget.Button button = this.f168945g;
        if (button != null) {
            button.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    /* renamed from: setTitle */
    public void m52291x53bfe316(int i17) {
        android.widget.TextView textView = this.f168942d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public C12545x36e72905(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
