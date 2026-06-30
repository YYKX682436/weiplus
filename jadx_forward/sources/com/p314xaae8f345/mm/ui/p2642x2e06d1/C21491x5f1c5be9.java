package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFormMobileInputView */
/* loaded from: classes5.dex */
public class C21491x5f1c5be9 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f278895d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f278896e;

    /* renamed from: f, reason: collision with root package name */
    public final int f278897f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f278898g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f278900i;

    public C21491x5f1c5be9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f278897f = -1;
        this.f278899h = "";
        this.f278900i = "";
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544635i, i17, 0);
        this.f278897f = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byl, this);
    }

    public void a(boolean z17) {
        android.widget.EditText editText = this.f278895d;
        this.f278898g = new int[]{editText.getPaddingLeft(), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom()};
        if (z17) {
            this.f278895d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7a);
        } else {
            this.f278895d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7b);
        }
        android.widget.EditText editText2 = this.f278895d;
        int[] iArr = this.f278898g;
        if (iArr != null) {
            editText2.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        android.widget.EditText editText3 = this.f278896e;
        this.f278898g = new int[]{editText3.getPaddingLeft(), editText3.getPaddingTop(), editText3.getPaddingRight(), editText3.getPaddingBottom()};
        if (z17) {
            this.f278896e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7a);
        } else {
            this.f278896e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7b);
        }
        android.widget.EditText editText4 = this.f278896e;
        int[] iArr2 = this.f278898g;
        if (iArr2 != null) {
            editText4.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        }
    }

    /* renamed from: getCountryCode */
    public java.lang.String m78941x81cc056d() {
        android.widget.EditText editText = this.f278895d;
        return editText != null ? editText.getText().toString().trim() : "";
    }

    /* renamed from: getCountryCodeEditText */
    public android.widget.EditText m78942xd071bee4() {
        return this.f278895d;
    }

    /* renamed from: getMobileNumber */
    public java.lang.String m78943xc8806901() {
        android.widget.EditText editText = this.f278896e;
        return editText != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(editText.getText().toString()) : "";
    }

    /* renamed from: getMobileNumberEditText */
    public android.widget.EditText m78944x51a34e78() {
        return this.f278896e;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f278895d = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.cjw);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.jn8);
        this.f278896e = editText;
        android.widget.EditText editText2 = this.f278895d;
        if (editText2 == null || editText == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMFormMobileInputView", "countryCodeET : %s, mobileNumberET : %s", editText2, editText);
        } else {
            int i17 = this.f278897f;
            if (i17 != -1) {
                editText.setHint(i17);
            }
        }
        android.widget.EditText editText3 = this.f278895d;
        if (editText3 == null || this.f278896e == null) {
            return;
        }
        if (editText3.hasFocus() || this.f278896e.hasFocus()) {
            a(true);
        } else {
            a(false);
        }
        db5.c2 c2Var = new db5.c2(this);
        this.f278895d.setOnFocusChangeListener(c2Var);
        this.f278896e.setOnFocusChangeListener(c2Var);
        android.widget.EditText editText4 = this.f278896e;
        editText4.addTextChangedListener(new al5.p1(editText4, null, 20));
        this.f278896e.addTextChangedListener(new db5.d2(this));
        this.f278895d.addTextChangedListener(new db5.e2(this));
    }

    /* renamed from: setCountryCode */
    public void m78945x183178e1(java.lang.String str) {
        android.widget.EditText editText = this.f278895d;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormMobileInputView", "countryCodeET is null!");
        }
    }

    /* renamed from: setHint */
    public void m78946x764b0e09(java.lang.String str) {
        android.widget.EditText editText = this.f278896e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
        }
    }

    /* renamed from: setMobileNumber */
    public void m78947xfec9640d(java.lang.String str) {
        android.widget.EditText editText = this.f278896e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
        }
    }

    /* renamed from: setOnCountryCodeChangedListener */
    public void m78948x45596126(db5.f2 f2Var) {
    }

    public C21491x5f1c5be9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
