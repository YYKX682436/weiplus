package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText */
/* loaded from: classes9.dex */
public class C3341xc2aa6ed9 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.LinearLayout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39 {

    /* renamed from: editText */
    protected android.widget.EditText f13086x5f7d1257;

    /* renamed from: focusChangedCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 f13087xcfc00b21;

    /* renamed from: hintText */
    private java.lang.String f13089xa827fc54;

    /* renamed from: textChangedCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a f13092xe64bc62c;

    /* renamed from: textEndEditingCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f13094xe0ca4faf;

    /* renamed from: textFontName */
    private java.lang.String f13095x5cb67c7;

    /* renamed from: textSize */
    private float f13096xc42d3ace;

    /* renamed from: textColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13093xc09b2e36 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: hintColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13088x5bec5d1c = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: dummyFocusView */
    private android.widget.LinearLayout f13085x37c4afd5 = null;

    /* renamed from: textAlign */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 f13091xc07d95d8 = com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT;

    /* renamed from: maxLength */
    private int f13090xd0d4316a = -1;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$TextAlign */
        static final /* synthetic */ int[] f13098xa9ce30eb;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.m28388xcee59d22().length];
            f13098xa9ce30eb = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f13098xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f13098xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createView$1 */
    public /* synthetic */ void m27000x8a863bcb(android.view.View view, boolean z17) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d6123 = this.f13087xcfc00b21;
        if (abstractC3618x898d6123 != null) {
            abstractC3618x898d6123.mo28431x2e7a5e(z17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createView$2 */
    public /* synthetic */ boolean m27001x8a863bcc(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e m27109xf72f818;
        if (this.f13086x5f7d1257.isFocused() || motionEvent.getAction() != 0 || (m27109xf72f818 = m27109xf72f818()) == null) {
            return false;
        }
        m27109xf72f818.mo28203xaf6b9ae9(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setFocus$0 */
    public /* synthetic */ void m27002xc6f7899f() {
        this.f13086x5f7d1257.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f13206xd6cfe882.getSystemService("input_method")).showSoftInput(this.f13086x5f7d1257, 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getEnabled */
    public boolean mo27003xdddcc70b() {
        return this.f13086x5f7d1257.isEnabled();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getFocus */
    public boolean mo27004x746efb22() {
        return this.f13086x5f7d1257.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getHint */
    public java.lang.String mo27005xfb8046fd() {
        java.lang.CharSequence hint = this.f13086x5f7d1257.getHint();
        if (hint != null) {
            return hint.toString();
        }
        java.lang.String str = this.f13089xa827fc54;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getHintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo27006x5b59ce66() {
        return this.f13088x5bec5d1c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getMaxLength */
    public int mo27007xd041a2b4() {
        return this.f13090xd0d4316a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getText */
    public java.lang.String mo27008xfb85ada3() {
        android.text.Editable text = this.f13086x5f7d1257.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getTextAlign */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 mo27009xbfeb0722() {
        return this.f13091xc07d95d8;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo27010xc0089f80() {
        return this.f13093xc09b2e36;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getTextFont */
    public java.lang.String mo27011x4001a492() {
        return this.f13095x5cb67c7;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: getTextSize */
    public float mo27012x40077844() {
        return this.f13096xc42d3ace;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setEnabled */
    public void mo27013x514e147f(boolean z17) {
        this.f13086x5f7d1257.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setFocus */
    public void mo27014x52fd1596(boolean z17) {
        if (z17) {
            if (this.f13086x5f7d1257.hasFocus()) {
                this.f13086x5f7d1257.clearFocus();
            }
            this.f13086x5f7d1257.postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.m27002xc6f7899f();
                }
            }, 50L);
        } else if (this.f13086x5f7d1257.hasFocus()) {
            this.f13086x5f7d1257.clearFocus();
            com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = this.f13094xe0ca4faf;
            if (abstractC3623x3b485619 != null) {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
            ((android.view.inputmethod.InputMethodManager) this.f13206xd6cfe882.getSystemService("input_method")).hideSoftInputFromWindow(this.f13086x5f7d1257.getWindowToken(), 0);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setHint */
    public void mo27015x764b0e09(java.lang.String str) {
        this.f13089xa827fc54 = str;
        this.f13086x5f7d1257.setHint(str);
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setHintColor */
    public void mo27016xb7ad8eda(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13088x5bec5d1c = c3392x2ae78284;
        this.f13086x5f7d1257.setHintTextColor(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setMaxLength */
    public void mo27017x2c956328(int i17) {
        if (i17 >= 0) {
            this.f13090xd0d4316a = i17;
            this.f13086x5f7d1257.setFilters(new android.text.InputFilter[]{new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3332x87bfa540(i17)});
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setOnFocusChangedImpl */
    public void mo27018x33fb2fd(com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d6123) {
        this.f13087xcfc00b21 = abstractC3618x898d6123;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setOnTextChangedImpl */
    public void mo27019xf887f766(com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        this.f13092xe64bc62c = abstractC3635x710ca4a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setOnTextEndEditingImpl */
    public void mo27020x8724b(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f13094xe0ca4faf = abstractC3623x3b485619;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setText */
    public void mo27021x765074af(java.lang.String str) {
        if (str == null || mo27008xfb85ada3().equals(str)) {
            return;
        }
        this.f13086x5f7d1257.setText(str);
        android.widget.EditText editText = this.f13086x5f7d1257;
        editText.setSelection(editText.getText().length());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setTextAlign */
    public void mo27022x1c3ec796(com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8) {
        android.widget.EditText editText;
        if (enumC3607x37efb5b8 != null) {
            this.f13091xc07d95d8 = enumC3607x37efb5b8;
            int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.AnonymousClass2.f13098xa9ce30eb[enumC3607x37efb5b8.ordinal()];
            if (i17 == 1) {
                mo27110xfb86a31b().setGravity(8388611);
            } else if (i17 == 2) {
                mo27110xfb86a31b().setGravity(1);
            } else if (i17 == 3 && (editText = this.f13086x5f7d1257) != null) {
                editText.setGravity(8388613);
            }
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setTextColor */
    public void mo27023x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13093xc09b2e36 = c3392x2ae78284;
        this.f13086x5f7d1257.setTextColor(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setTextFont */
    public void mo27024x3aba059e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : str.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : str.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : str.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : str.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : str.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
        if (i17 != -1) {
            try {
                this.f13086x5f7d1257.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(i17)));
                mo26970x380a4f2b();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                this.f13086x5f7d1257.setTypeface(null, 0);
            }
            this.f13095x5cb67c7 = str;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3483x3abd8d39
    /* renamed from: setTextSize */
    public void mo27025x3abfd950(float f17) {
        if (f17 > 0.0f) {
            float m27358x8f7e19b5 = f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f);
            this.f13096xc42d3ace = m27358x8f7e19b5;
            this.f13086x5f7d1257.setTextSize(1, m27358x8f7e19b5);
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setGravity(16);
        this.f13085x37c4afd5 = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        this.f13085x37c4afd5.setFocusable(true);
        this.f13085x37c4afd5.setFocusableInTouchMode(true);
        linearLayout.addView(this.f13085x37c4afd5, layoutParams);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(context);
        this.f13086x5f7d1257 = c28001xdd2bb359;
        c28001xdd2bb359.setSingleLine(false);
        this.f13086x5f7d1257.setMaxLines(20);
        this.f13086x5f7d1257.setBackground(null);
        this.f13086x5f7d1257.setTextSize(1, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f);
        this.f13086x5f7d1257.setTag(this);
        this.f13086x5f7d1257.setPadding(0, 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.f13086x5f7d1257, layoutParams2);
        this.f13086x5f7d1257.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                android.widget.EditText editText;
                android.widget.EditText editText2;
                com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13091xc07d95d8;
                com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b82 = com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.RIGHT;
                if (enumC3607x37efb5b8 == enumC3607x37efb5b82 && (editText2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13086x5f7d1257) != null) {
                    editText2.setTextDirection(3);
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13092xe64bc62c != null && editable != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13092xe64bc62c.mo28515x2e7a5e(editable.toString());
                }
                if (editable == null || android.text.TextUtils.isEmpty(editable.toString())) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9 c3341xc2aa6ed9 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this;
                    android.widget.EditText editText3 = c3341xc2aa6ed9.f13086x5f7d1257;
                    if (editText3 != null) {
                        editText3.setHint(c3341xc2aa6ed9.f13089xa827fc54);
                    }
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13091xc07d95d8 == enumC3607x37efb5b82 && (editText = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13086x5f7d1257) != null) {
                        editText.setTextDirection(4);
                    }
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.f13086x5f7d1257.setHint("");
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.mo26970x380a4f2b();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }
        });
        this.f13086x5f7d1257.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$$b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.m27000x8a863bcb(view, z17);
            }
        });
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            this.f13086x5f7d1257.setHintTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            this.f13086x5f7d1257.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        this.f13086x5f7d1257.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$$c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean m27001x8a863bcc;
                m27001x8a863bcc = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3341xc2aa6ed9.this.m27001x8a863bcc(view, motionEvent);
                return m27001x8a863bcc;
            }
        });
        this.f13086x5f7d1257.setId(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11563x748d9a9b);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        return linearLayout;
    }
}
