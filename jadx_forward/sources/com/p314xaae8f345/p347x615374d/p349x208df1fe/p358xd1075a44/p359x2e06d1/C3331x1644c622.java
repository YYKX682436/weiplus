package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKEditText */
/* loaded from: classes9.dex */
public class C3331x1644c622 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.LinearLayout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2 {

    /* renamed from: confirmButtonText */
    private java.lang.String f13000xcd004a5f;

    /* renamed from: cursorColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13001xa0e2d1ad;

    /* renamed from: editText */
    protected com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f13003x5f7d1257;

    /* renamed from: hintText */
    private java.lang.String f13006xa827fc54;

    /* renamed from: hintTextSize */
    private float f13007x20910675;

    /* renamed from: iconImageView */
    private com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e f13009x97440e27;

    /* renamed from: mKEditTextOnEditorActionCallback */
    protected com.p314xaae8f345.p347x615374d.gen.AbstractC3454x2207fe49 f13014x1e93303c;

    /* renamed from: mKEditTextOnFocusChangeCallback */
    protected com.p314xaae8f345.p347x615374d.gen.AbstractC3455x7a4da80c f13015x616aebb9;

    /* renamed from: mKEditTextOnTextEndEditingCallback */
    protected com.p314xaae8f345.p347x615374d.gen.AbstractC3458xd85b4250 f13016xdee1c383;

    /* renamed from: mRestriceType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3394x220ed02d f13018x5246b894;

    /* renamed from: onTextBeginChangeCallback */
    protected com.p314xaae8f345.p347x615374d.gen.AbstractC3456x5abec430 f13020xb39b01d2;

    /* renamed from: onTextChangedCallback */
    protected com.p314xaae8f345.p347x615374d.gen.AbstractC3457xe38bbf2b f13021x2edc1dcd;

    /* renamed from: textAlign */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 f13024xc07d95d8;

    /* renamed from: textFontName */
    private java.lang.String f13026x5cb67c7;

    /* renamed from: textSize */
    private float f13027xc42d3ace;

    /* renamed from: wcPayKeyboard */
    private com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f13028x26200243;

    /* renamed from: textColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13025xc09b2e36 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: hintColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13005x5bec5d1c = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: maxLength */
    private int f13019xd0d4316a = -1;

    /* renamed from: keyboardType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 f13011xc742bc1 = com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.NORMAL;

    /* renamed from: initialOnFocusChangeListener */
    private android.view.View.OnFocusChangeListener f13010xd5709639 = null;

    /* renamed from: clearButtonMode */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 f12999xe771c222 = com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING;

    /* renamed from: dummyFocusView */
    private android.widget.LinearLayout f13002x37c4afd5 = null;

    /* renamed from: mBaseFrActivity */
    protected com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc f13012x83fc3379 = null;

    /* renamed from: mMoneyRestrictionIntegerLimit */
    private int f13017x15674536 = 10;

    /* renamed from: mFixedHeaderText */
    private java.lang.String f13013x2d99bfc1 = "";

    /* renamed from: iconHadShow */
    private boolean f13008x290b56f = false;

    /* renamed from: expandSize */
    private float f13004x202b55bb = 24.0f;

    /* renamed from: stayFocusWhenEnterClick */
    private boolean f13023x9888ec49 = false;

    /* renamed from: showFloatButton */
    private boolean f13022xf92afd71 = false;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKEditText$11, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass11 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$KeyboardType */
        static final /* synthetic */ int[] f13031x27a253ce;

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$TextAlign */
        static final /* synthetic */ int[] f13032xa9ce30eb;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.m28229xcee59d22().length];
            f13031x27a253ce = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.PASSWORD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.EMAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.PHONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.ID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.CRETAIL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f13031x27a253ce[com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT_NOACTION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.m28388xcee59d22().length];
            f13032xa9ce30eb = iArr2;
            try {
                iArr2[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f13032xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f13032xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: changeTextSizeIfNeed */
    public void m26827xaa0b3391() {
        if (this.f13007x20910675 > 0.0f) {
            if (this.f13003x5f7d1257.getText().length() == 0) {
                this.f13003x5f7d1257.setTextSize(1, this.f13007x20910675 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f));
            } else {
                this.f13003x5f7d1257.setTextSize(1, this.f13027xc42d3ace * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f));
            }
            mo26970x380a4f2b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setIconVisibility */
    public void m26828xd2052d6d(int i17) {
        this.f13009x97440e27.setVisibility(i17);
        if (this.f13008x290b56f || i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e c19757x2454ae8e = this.f13009x97440e27;
        float f17 = this.f13004x202b55bb;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27360x3c905bbd(c19757x2454ae8e, f17, f17);
        this.f13008x290b56f = true;
    }

    /* renamed from: callBackKindaTextEndEditing */
    public void m26829xcc0eb552() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3458xd85b4250 abstractC3458xd85b4250 = this.f13016xdee1c383;
        if (abstractC3458xd85b4250 != null) {
            abstractC3458xd85b4250.mo27984xc7be5d09(this.f13003x5f7d1257.getText().toString());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: enableConfirmBtn */
    public void mo26830x2439e15f(boolean z17) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f13028x26200243;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.e(z17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: encryptWith3Des */
    public java.lang.String mo26831x65997a2a() {
        return new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28002xcd8b6923().mo121432x19b57b7a(this.f13003x5f7d1257.getText().toString(), java.lang.Long.toString(c01.id.a() / 1000));
    }

    /* renamed from: getClearButtonMode */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 mo26529xcbd393ec() {
        return this.f12999xe771c222;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getConfirmButtonColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26832xe57a3267() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getConfirmButtonText */
    public java.lang.String mo26833x2034d1a9() {
        return this.f13000xcd004a5f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getCursorColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26834x7ab91877() {
        return this.f13001xa0e2d1ad;
    }

    /* renamed from: getEditText */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 m26835xdb574fcd() {
        return this.f13003x5f7d1257;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getEnabled */
    public boolean mo26836xdddcc70b() {
        return this.f13003x5f7d1257.isEnabled();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getFixedHeaderText */
    public java.lang.String mo26837x424d61b8() {
        return this.f13013x2d99bfc1;
    }

    /* renamed from: getFocus */
    public boolean mo26530x746efb22() {
        return this.f13003x5f7d1257.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getHint */
    public java.lang.String mo26838xfb8046fd() {
        java.lang.CharSequence hint = this.f13003x5f7d1257.getHint();
        if (hint != null) {
            return hint.toString();
        }
        java.lang.String str = this.f13006xa827fc54;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getHintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26839x5b59ce66() {
        return this.f13005x5bec5d1c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getHintTextSize */
    public float mo26840x818398eb() {
        return this.f13007x20910675;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getIsSingleLine */
    public boolean mo26841x18ced39c() {
        return this.f13003x5f7d1257.getMaxLines() == 1;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getKeyboardType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 mo26842x6d66be37() {
        return this.f13011xc742bc1;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getMaxLength */
    public int mo26843xd041a2b4() {
        return this.f13019xd0d4316a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getMoneyRestrictionIntegerLimit */
    public int mo26844xe45ecc9f() {
        return this.f13017x15674536;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getMoneyShowBit */
    public int mo26845xa52c9e66() {
        return 0;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getRestrictType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3394x220ed02d mo26846x1c77928c() {
        return this.f13018x5246b894;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getSelection */
    public int mo26847x9925e2d6() {
        return this.f13003x5f7d1257.getSelectionStart();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getShowFloatButton */
    public boolean mo26848xdd8ccf3b() {
        return this.f13022xf92afd71;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getShowInputDot */
    public boolean mo26849x4a38adb2() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getStayFocusWhenEnter */
    public boolean mo26850x4c9c275() {
        return this.f13023x9888ec49;
    }

    /* renamed from: getText */
    public java.lang.String mo26531xfb85ada3() {
        android.text.Editable text = this.f13003x5f7d1257.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getTextAlign */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 mo26851xbfeb0722() {
        return this.f13024xc07d95d8;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26852xc0089f80() {
        return this.f13025xc09b2e36;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getTextFont */
    public java.lang.String mo26853x4001a492() {
        return this.f13026x5cb67c7;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getTextSize */
    public float mo26854x40077844() {
        return this.f13027xc42d3ace;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getTintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26855x4e8f0272() {
        return null;
    }

    /* renamed from: invokeInitialOnFocusChangeListener */
    public void m26856x4be70ad1(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f13010xd5709639;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setClearButtonMode */
    public void mo26857x2aa2d60(com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 enumC3388xac047a02) {
        this.f12999xe771c222 = enumC3388xac047a02;
        if (enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.NEVER) {
            m26828xd2052d6d(8);
            return;
        }
        if (enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING || enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.UNLESSEDITING) {
            return;
        }
        if (enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.ALWAYS) {
            m26828xd2052d6d(0);
        } else {
            m26828xd2052d6d(4);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setConfirmButtonColor */
    public void mo26858x7ca5b473(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setConfirmButtonText */
    public void mo26859xfbcade1d(java.lang.String str) {
        this.f13000xcd004a5f = str;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setCursorColor */
    public void mo26860x111e8beb(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13001xa0e2d1ad = c3392x2ae78284;
        if (fp.h.c(29)) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setSize(i65.a.a(this.f13206xd6cfe882, 1.5f), -1);
            gradientDrawable.setColor((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284));
            this.f13003x5f7d1257.m121618x12027a39(gradientDrawable);
            return;
        }
        if ((c3392x2ae78284 == null || c3392x2ae78284.m27432xc8b8c186() != 4294951680L) && c3392x2ae78284.m27432xc8b8c186() != 4290481664L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "can't set cursor color on low version");
        } else {
            this.f13003x5f7d1257.m121617x12027a39(com.p314xaae8f345.mm.R.C30861xcebc809e.agu);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setEnabled */
    public void mo26861x514e147f(boolean z17) {
        this.f13003x5f7d1257.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setFixedHeaderText */
    public void mo26862x7923fb2c(java.lang.String str) {
        this.f13013x2d99bfc1 = str;
        this.f13003x5f7d1257.m121620x7923fb2c(str);
    }

    /* renamed from: setFocus */
    public void mo26532x52fd1596(boolean z17) {
        if (z17) {
            if (this.f13003x5f7d1257.hasFocus()) {
                this.f13003x5f7d1257.clearFocus();
            }
            this.f13003x5f7d1257.postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.9
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.requestFocus();
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13011xc742bc1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.ID || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13011xc742bc1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.CRETAIL || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13011xc742bc1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13011xc742bc1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT_NOACTION) {
                        return;
                    }
                    ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13206xd6cfe882.getSystemService("input_method")).showSoftInput(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257, 0);
                }
            }, 50L);
        } else if (this.f13003x5f7d1257.hasFocus()) {
            this.f13003x5f7d1257.clearFocus();
            if (this.f13011xc742bc1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.NORMAL) {
                m26829xcc0eb552();
            }
            com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 enumC3555x163f7fe1 = this.f13011xc742bc1;
            if (enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.ID || enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.CRETAIL || enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT || enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT_NOACTION) {
                return;
            }
            ((android.view.inputmethod.InputMethodManager) this.f13206xd6cfe882.getSystemService("input_method")).hideSoftInputFromWindow(this.f13003x5f7d1257.getWindowToken(), 0);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setHint */
    public void mo26863x764b0e09(java.lang.String str) {
        this.f13006xa827fc54 = str;
        this.f13003x5f7d1257.setHint(str);
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setHintColor */
    public void mo26864xb7ad8eda(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13005x5bec5d1c = c3392x2ae78284;
        this.f13003x5f7d1257.setHintTextColor(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setHintTextSize */
    public void mo26865xb7cc93f7(float f17) {
        this.f13007x20910675 = f17;
        m26827xaa0b3391();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setIsSingleLine */
    public void mo26866x4f17cea8(boolean z17) {
        if (z17) {
            this.f13003x5f7d1257.setMaxLines(1);
        } else {
            this.f13003x5f7d1257.setMaxLines(2);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setKeyboardType */
    public void mo26867xa3afb943(com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 enumC3555x163f7fe1) {
        this.f13011xc742bc1 = enumC3555x163f7fe1;
        switch (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.AnonymousClass11.f13031x27a253ce[enumC3555x163f7fe1.ordinal()]) {
            case 1:
                this.f13003x5f7d1257.setInputType(0);
                return;
            case 2:
                this.f13003x5f7d1257.setInputType(2);
                return;
            case 3:
                this.f13003x5f7d1257.setInputType(128);
                return;
            case 4:
                this.f13003x5f7d1257.setInputType(32);
                return;
            case 5:
                this.f13003x5f7d1257.setInputType(3);
                return;
            case 6:
            case 7:
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = this.f13012x83fc3379;
                if (abstractActivityC3282x418ff5cc != null) {
                    abstractActivityC3282x418ff5cc.m26057x8f91b80(this.f13003x5f7d1257, 1, false);
                    this.f13012x83fc3379.m26061xcfb55a41(new com.p314xaae8f345.mm.p2802xd031a825.ui.m() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.6
                        @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
                        /* renamed from: onVisibleStateChange */
                        public void mo26891xca4e600e(boolean z17) {
                            if (z17 || !com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.isFocused()) {
                                return;
                            }
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.clearFocus();
                        }
                    });
                    return;
                }
                return;
            case 8:
            case 9:
                this.f13003x5f7d1257.setImeOptions(6);
                this.f13003x5f7d1257.setKeyListener(new android.text.method.NumberKeyListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.7
                    @Override // android.text.method.NumberKeyListener
                    public char[] getAcceptedChars() {
                        return (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13013x2d99bfc1 + "01234567890.").toCharArray();
                    }

                    @Override // android.text.method.KeyListener
                    public int getInputType() {
                        return 532482;
                    }
                });
                java.lang.String str = this.f13000xcd004a5f;
                if (android.text.TextUtils.isEmpty(str)) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                }
                if (this.f13011xc742bc1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.DIGIT_NOACTION) {
                    str = "";
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc2 = this.f13012x83fc3379;
                this.f13028x26200243 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3374x3bef2b51.m27352x2e243d((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) abstractActivityC3282x418ff5cc2, this, str, abstractActivityC3282x418ff5cc2.f12566xef78dc9b);
                this.f13003x5f7d1257.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.8
                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
                        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                            if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13023x9888ec49) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.clearFocus();
                            }
                            com.p314xaae8f345.p347x615374d.gen.AbstractC3454x2207fe49 abstractC3454x2207fe49 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13014x1e93303c;
                            if (abstractC3454x2207fe49 != null) {
                                abstractC3454x2207fe49.mo27964x168d9182(com.p314xaae8f345.p347x615374d.gen.EnumC3554x204b6b9b.ENTER);
                            }
                        }
                        return true;
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setMaxLength */
    public void mo26868x2c956328(int i17) {
        if (i17 >= 0) {
            this.f13019xd0d4316a = i17;
            this.f13003x5f7d1257.setFilters(new android.text.InputFilter[]{new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3332x87bfa540(i17)});
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setMoneyRestrictionIntegerLimit */
    public void mo26869xdf482fab(int i17) {
        this.f13017x15674536 = i17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setMoneyShowBit */
    public void mo26870xdb759972(int i17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setNeedForceDismissFloatButton */
    public void mo26871x6f7ce2d7() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setOnEditorActionCallback */
    public void mo26872xdcd586e9(com.p314xaae8f345.p347x615374d.gen.AbstractC3454x2207fe49 abstractC3454x2207fe49) {
        this.f13014x1e93303c = abstractC3454x2207fe49;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setOnFocusChangeCallback */
    public void mo26873xa15c8b6c(com.p314xaae8f345.p347x615374d.gen.AbstractC3455x7a4da80c abstractC3455x7a4da80c) {
        this.f13015x616aebb9 = abstractC3455x7a4da80c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setOnTextBeginChangeCallback */
    public void mo26874xceecf790(com.p314xaae8f345.p347x615374d.gen.AbstractC3456x5abec430 abstractC3456x5abec430) {
        this.f13020xb39b01d2 = abstractC3456x5abec430;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setOnTextChangedCallback */
    public void mo26875xa9aa28b(com.p314xaae8f345.p347x615374d.gen.AbstractC3457xe38bbf2b abstractC3457xe38bbf2b) {
        this.f13021x2edc1dcd = abstractC3457xe38bbf2b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setOnTextEndEditingCallback */
    public void mo26876x15e922f0(com.p314xaae8f345.p347x615374d.gen.AbstractC3458xd85b4250 abstractC3458xd85b4250) {
        this.f13016xdee1c383 = abstractC3458xd85b4250;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setRestrictType */
    public void mo26877x52c08d98(com.p314xaae8f345.p347x615374d.gen.EnumC3394x220ed02d enumC3394x220ed02d) {
        this.f13018x5246b894 = enumC3394x220ed02d;
        if (enumC3394x220ed02d == com.p314xaae8f345.p347x615374d.gen.EnumC3394x220ed02d.MONEY) {
            this.f13003x5f7d1257.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.10
                @Override // android.text.TextWatcher
                public void afterTextChanged(android.text.Editable editable) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.removeTextChangedListener(this);
                    if (editable.toString().startsWith(".")) {
                        editable.insert(0, "0");
                    }
                    java.lang.String obj = editable.toString();
                    int indexOf = obj.indexOf(".");
                    int length = obj.length();
                    int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13017x15674536;
                    if (indexOf < 0 || length - indexOf <= 3) {
                        int i18 = i17 + 2;
                        if (indexOf > i18) {
                            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257, obj, i18, indexOf);
                        } else if (indexOf == -1 && length > i17) {
                            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257, obj, i17, length);
                        } else if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.m121607x245c69ae()) {
                            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257, obj, obj.length() - 1, obj.length());
                        } else if (obj.length() > 1 && obj.startsWith("0") && indexOf == -1) {
                            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257, obj, 0, 1);
                        }
                    } else {
                        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257, obj, indexOf + 3, length);
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.addTextChangedListener(this);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setSelection */
    public void mo26878xf579a34a(int i17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f13003x5f7d1257;
        c28001xdd2bb359.setSelection(c28001xdd2bb359.getText().length());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setShowFloatButton */
    public void mo26879x146368af(boolean z17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262;
        this.f13022xf92afd71 = z17;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = this.f13012x83fc3379;
        if (abstractActivityC3282x418ff5cc == null || (mo26064x748f9262 = abstractActivityC3282x418ff5cc.mo26064x748f9262()) == null) {
            return;
        }
        mo26064x748f9262.f12634xeaf2c1b = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setShowInputDot */
    public void mo26880x8081a8be(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setStayFocusWhenEnter */
    public void mo26881x9bf54481(boolean z17) {
        this.f13023x9888ec49 = z17;
    }

    /* renamed from: setText */
    public void mo26533x765074af(java.lang.String str) {
        if (str == null || mo26531xfb85ada3().equals(str)) {
            return;
        }
        this.f13003x5f7d1257.setText(str);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f13003x5f7d1257;
        c28001xdd2bb359.setSelection(c28001xdd2bb359.getText().length());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setTextAlign */
    public void mo26882x1c3ec796(com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359;
        if (enumC3607x37efb5b8 != null) {
            this.f13024xc07d95d8 = enumC3607x37efb5b8;
            int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.AnonymousClass11.f13032xa9ce30eb[enumC3607x37efb5b8.ordinal()];
            if (i17 == 1) {
                mo27110xfb86a31b().setGravity(3);
            } else if (i17 == 2) {
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f13003x5f7d1257;
                if (c28001xdd2bb3592 != null) {
                    c28001xdd2bb3592.setGravity(1);
                }
            } else if (i17 == 3 && (c28001xdd2bb359 = this.f13003x5f7d1257) != null) {
                c28001xdd2bb359.setGravity(8388613);
            }
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setTextColor */
    public void mo26883x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13025xc09b2e36 = c3392x2ae78284;
        this.f13003x5f7d1257.setTextColor(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setTextFont */
    public void mo26884x3aba059e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : str.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : str.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : str.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : str.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : str.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
        if (i17 != -1) {
            try {
                this.f13003x5f7d1257.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(i17)));
                mo26970x380a4f2b();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                this.f13003x5f7d1257.setTypeface(null, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setTextSize */
    public void mo26885x3abfd950(float f17) {
        if (f17 > 0.0f) {
            float m27358x8f7e19b5 = f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f);
            this.f13027xc42d3ace = m27358x8f7e19b5;
            this.f13003x5f7d1257.setTextSize(1, m27358x8f7e19b5);
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setTintColor */
    public void mo26886xaae2c2e6(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setViewId */
    public void mo26334x279f85a2(java.lang.String str) {
        super.mo26334x279f85a2(str);
        if (this.f13009x97440e27 != null) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27361x5304a1db(this.f13206xd6cfe882, str + "_btn", this.f13009x97440e27);
        }
    }

    /* renamed from: setVisibleClearIcon */
    public void m26887xb9920496(boolean z17) {
        if (!z17 || this.f13003x5f7d1257.getText().length() <= 0) {
            m26828xd2052d6d(4);
        } else {
            m26828xd2052d6d(0);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setupToolBarView */
    public void mo26888xb30f89e3(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        if (this.f13028x26200243 == null || interfaceC3545x4499190 == null) {
            return;
        }
        this.f13028x26200243.m82986xa77281a0(((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: showMoneyBitView */
    public void mo26889x7064980f() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setGravity(16);
        this.f13002x37c4afd5 = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        this.f13002x37c4afd5.setFocusable(true);
        this.f13002x37c4afd5.setFocusableInTouchMode(true);
        linearLayout.addView(this.f13002x37c4afd5, layoutParams);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(context);
        this.f13003x5f7d1257 = c28001xdd2bb359;
        c28001xdd2bb359.setSingleLine(false);
        this.f13003x5f7d1257.setMaxLines(2);
        this.f13003x5f7d1257.setBackground(null);
        this.f13003x5f7d1257.setTextSize(1, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f);
        this.f13003x5f7d1257.setTag(this);
        this.f13003x5f7d1257.m121617x12027a39(com.p314xaae8f345.mm.R.C30861xcebc809e.afr);
        this.f13003x5f7d1257.setPadding(0, 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.f13003x5f7d1257, layoutParams2);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e c19757x2454ae8e = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e(context);
        this.f13009x97440e27 = c19757x2454ae8e;
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560227eb);
        c19757x2454ae8e.f273574u = com.p314xaae8f345.mm.R.raw.f79679xe7836e52;
        c19757x2454ae8e.f273575v = color;
        this.f13009x97440e27.m75916xed5ee0a1(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13009x97440e27.getVisibility() == 0) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.setText("");
                }
            }
        });
        m26828xd2052d6d(8);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(com.p314xaae8f345.mm.ui.zk.a(context, 16), com.p314xaae8f345.mm.ui.zk.a(context, 16));
        layoutParams3.setMargins(16, 0, com.p314xaae8f345.mm.ui.zk.a(context, 4), 0);
        linearLayout.addView(this.f13009x97440e27, layoutParams3);
        linearLayout.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 != com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.NEVER) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(4);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.mo26970x380a4f2b();
                }
            }
        });
        if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
            this.f13012x83fc3379 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context;
        }
        this.f13003x5f7d1257.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592;
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3593;
                com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13024xc07d95d8;
                com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b82 = com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.RIGHT;
                if (enumC3607x37efb5b8 == enumC3607x37efb5b82 && (c28001xdd2bb3593 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257) != null) {
                    c28001xdd2bb3593.setTextDirection(3);
                }
                com.p314xaae8f345.p347x615374d.gen.AbstractC3457xe38bbf2b abstractC3457xe38bbf2b = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13021x2edc1dcd;
                if (abstractC3457xe38bbf2b != null && editable != null) {
                    abstractC3457xe38bbf2b.mo27979x16898168(editable.toString());
                }
                if (editable == null || android.text.TextUtils.isEmpty(editable.toString())) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622 c3331x1644c622 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this;
                    c3331x1644c622.f13003x5f7d1257.setHint(c3331x1644c622.f13006xa827fc54);
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13024xc07d95d8 == enumC3607x37efb5b82 && (c28001xdd2bb3592 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257) != null) {
                        c28001xdd2bb3592.setTextDirection(4);
                    }
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.setHint("");
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26827xaa0b3391();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.mo26970x380a4f2b();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3456x5abec430 abstractC3456x5abec430 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13020xb39b01d2;
                if (abstractC3456x5abec430 == null || charSequence == null) {
                    return;
                }
                abstractC3456x5abec430.mo27974x2bb3a6d(charSequence.toString());
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.NEVER) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(8);
                    return;
                }
                if (charSequence == null || charSequence.length() <= 0 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 != com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING || !com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.hasFocus()) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(4);
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(0);
                }
            }
        });
        android.view.View.OnFocusChangeListener onFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z17) {
                boolean z18 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.ALWAYS || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.UNLESSEDITING;
                if (z17 && com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.getText().length() > 0 && z18) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(0);
                } else if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f12999xe771c222 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.NEVER) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(8);
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m26828xd2052d6d(4);
                }
                com.p314xaae8f345.p347x615374d.gen.AbstractC3455x7a4da80c abstractC3455x7a4da80c = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13015x616aebb9;
                if (abstractC3455x7a4da80c != null) {
                    abstractC3455x7a4da80c.mo27969x678edb49(z17);
                }
            }
        };
        this.f13010xd5709639 = onFocusChangeListener;
        this.f13003x5f7d1257.setOnFocusChangeListener(onFocusChangeListener);
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            this.f13003x5f7d1257.setHintTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            this.f13003x5f7d1257.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        this.f13003x5f7d1257.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e m27109xf72f818;
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.f13003x5f7d1257.isFocused() || motionEvent.getAction() != 0 || (m27109xf72f818 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this.m27109xf72f818()) == null) {
                    return false;
                }
                m27109xf72f818.mo28203xaf6b9ae9(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622.this);
                return true;
            }
        });
        this.f13003x5f7d1257.setId(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11563x748d9a9b);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = this.f13012x83fc3379;
        if (abstractActivityC3282x418ff5cc != null && (mo26064x748f9262 = abstractActivityC3282x418ff5cc.mo26064x748f9262()) != null) {
            mo26064x748f9262.f12634xeaf2c1b = this.f13022xf92afd71;
        }
        return linearLayout;
    }
}
