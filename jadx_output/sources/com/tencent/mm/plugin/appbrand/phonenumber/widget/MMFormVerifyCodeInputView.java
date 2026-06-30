package com.tencent.mm.plugin.appbrand.phonenumber.widget;

/* loaded from: classes5.dex */
public class MMFormVerifyCodeInputView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f87409d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f87410e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f87411f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f87412g;

    /* renamed from: h, reason: collision with root package name */
    public final int f87413h;

    /* renamed from: i, reason: collision with root package name */
    public final int f87414i;

    /* renamed from: m, reason: collision with root package name */
    public final int f87415m;

    /* renamed from: n, reason: collision with root package name */
    public final int f87416n;

    /* renamed from: o, reason: collision with root package name */
    public int f87417o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f87418p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f87419q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f87420r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f87421s;

    public MMFormVerifyCodeInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f87413h = -1;
        this.f87414i = -1;
        this.f87415m = -1;
        this.f87416n = 60;
        this.f87417o = 60;
        this.f87420r = null;
        this.f87421s = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463102i, i17, 0);
        this.f87414i = obtainStyledAttributes.getResourceId(1, -1);
        this.f87413h = obtainStyledAttributes.getResourceId(3, -1);
        this.f87415m = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId, this);
    }

    public android.widget.EditText getContentEditText() {
        return this.f87410e;
    }

    public android.text.Editable getText() {
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            return editText.getText();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        return null;
    }

    public android.widget.TextView getTitleTextView() {
        return this.f87409d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f87409d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f87410e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d98);
        this.f87411f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o8x);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.mm7);
        this.f87412g = button;
        android.widget.TextView textView = this.f87409d;
        if (textView == null || this.f87410e == null || this.f87411f == null || button == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", textView, this.f87410e, this.f87411f, button);
        } else {
            int i17 = this.f87413h;
            if (i17 != -1) {
                textView.setText(i17);
            }
            int i18 = this.f87414i;
            if (i18 != -1) {
                this.f87410e.setHint(i18);
            }
            int i19 = this.f87415m;
            if (i19 != -1) {
                this.f87412g.setText(i19);
            }
        }
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            editText.setOnFocusChangeListener(new wi1.a(this));
        }
        android.widget.Button button2 = this.f87412g;
        if (button2 != null) {
            zk1.m.a(button2, null, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9));
            this.f87412g.setOnClickListener(new wi1.b(this));
        }
    }

    public void setFocusListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f87420r = onFocusChangeListener;
    }

    public void setHint(java.lang.String str) {
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setImeOption(int i17) {
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            editText.setImeOptions(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setInputType(int i17) {
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            editText.setInputType(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSendSmsBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f87421s = onClickListener;
    }

    public void setSmsBtnText(int i17) {
        android.widget.Button button = this.f87412g;
        if (button != null) {
            button.setText(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setText(java.lang.String str) {
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setTitle(java.lang.String str) {
        android.widget.TextView textView = this.f87409d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public void setHint(int i17) {
        android.widget.EditText editText = this.f87410e;
        if (editText != null) {
            editText.setHint(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSmsBtnText(java.lang.String str) {
        android.widget.Button button = this.f87412g;
        if (button != null) {
            button.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setTitle(int i17) {
        android.widget.TextView textView = this.f87409d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public MMFormVerifyCodeInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
