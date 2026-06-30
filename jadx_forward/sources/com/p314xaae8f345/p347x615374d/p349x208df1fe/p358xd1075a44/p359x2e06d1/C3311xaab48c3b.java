package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl */
/* loaded from: classes9.dex */
public class C3311xaab48c3b extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.LinearLayout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819 {

    /* renamed from: defaultValue */
    private java.lang.String f12866xd8b68bb0;

    /* renamed from: editText */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f12867x5f7d1257;

    /* renamed from: iconImageView */
    private com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e f12871x97440e27;

    /* renamed from: mContext */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc f12872xd6cfe882;

    /* renamed from: mKeyboardType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 f12873xa40944ce;

    /* renamed from: onTextChangedCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3524xb18d4f34 f12875x2edc1dcd;

    /* renamed from: clearButtonMode */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 f12865xe771c222 = com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING;

    /* renamed from: encryptType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3600x8cd4af3d f12868x15017b3f = com.p314xaae8f345.p347x615374d.gen.EnumC3600x8cd4af3d.TYPE3DES;

    /* renamed from: m_maxLength */
    private int f12874xdd754818 = Integer.MAX_VALUE;

    /* renamed from: iconHadShow */
    private boolean f12870x290b56f = false;

    /* renamed from: expandSize */
    private float f12869x202b55bb = 24.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setIconVisibility */
    public void m26631xd2052d6d(int i17) {
        this.f12871x97440e27.setVisibility(i17);
        if (this.f12870x290b56f || i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e c19757x2454ae8e = this.f12871x97440e27;
        float f17 = this.f12869x202b55bb;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27360x3c905bbd(c19757x2454ae8e, f17, f17);
        this.f12870x290b56f = true;
    }

    /* renamed from: setregExFilterInput */
    private void m26632x568e84ad(com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 enumC3555x163f7fe1) {
        if (enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.ID || enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.CRETAIL) {
            this.f12867x5f7d1257.m121638x568e84ad("[^a-zA-Z0-9]");
        } else if (enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.NUMBER) {
            this.f12867x5f7d1257.m121638x568e84ad("[^0-9]");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getClearButtonMode */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 mo26633xcbd393ec() {
        return this.f12865xe771c222;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getDefaultValue */
    public java.lang.String mo26634x39a91e26() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f12866xd8b68bb0) ? this.f12866xd8b68bb0 : "";
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getEnabled */
    public boolean mo26635xdddcc70b() {
        return this.f12867x5f7d1257.isEnabled();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getEncryptType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3600x8cd4af3d mo26636xeed7c209() {
        return this.f12868x15017b3f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getFocus */
    public boolean mo26637x746efb22() {
        return this.f12867x5f7d1257.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getHint */
    public java.lang.String mo26638xfb8046fd() {
        return this.f12867x5f7d1257.getHint().toString();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getIsCommonText */
    public boolean mo26639x28f784f8() {
        return this.f12867x5f7d1257.m121596x8f8b0df1() == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.COMMON_TEXT;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getKeyboardType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 mo26640x6d66be37() {
        return this.f12873xa40944ce;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getMaxLength */
    public int mo26641xd041a2b4() {
        return this.f12874xdd754818;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getText */
    public java.lang.String mo26642xfb85ada3() {
        if (this.f12868x15017b3f != com.p314xaae8f345.p347x615374d.gen.EnumC3600x8cd4af3d.TYPERSAWITHOUTHASH) {
            return this.f12867x5f7d1257.m121591x7d902dbb();
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f12867x5f7d1257;
        com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
        return c28001xdd2bb359.m121598x15a9108d(false, true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26643xc0089f80() {
        return new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(this.f12867x5f7d1257.getCurrentTextColor(), 0L);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: getTintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26644x4e8f0272() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: isCardFromatValid */
    public boolean mo26645x954824e5(int i17) {
        return this.f12867x5f7d1257.m121604xff9f1dc4(i17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setClearButtonMode */
    public void mo26646x2aa2d60(com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 enumC3388xac047a02) {
        this.f12865xe771c222 = enumC3388xac047a02;
        if (enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.NEVER) {
            m26631xd2052d6d(8);
            return;
        }
        if (enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING || enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.UNLESSEDITING) {
            return;
        }
        if (enumC3388xac047a02 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.ALWAYS) {
            m26631xd2052d6d(0);
        } else {
            m26631xd2052d6d(4);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setDefaultValue */
    public void mo26647x6ff21932(java.lang.String str) {
        this.f12866xd8b68bb0 = str;
        this.f12867x5f7d1257.setText(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setEnabled */
    public void mo26648x514e147f(boolean z17) {
        this.f12867x5f7d1257.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setEncryptType */
    public void mo26649x853d357d(com.p314xaae8f345.p347x615374d.gen.EnumC3600x8cd4af3d enumC3600x8cd4af3d) {
        this.f12868x15017b3f = enumC3600x8cd4af3d;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setFocus */
    public void mo26650x52fd1596(boolean z17) {
        if (z17) {
            this.f12867x5f7d1257.requestFocus();
        } else {
            this.f12867x5f7d1257.clearFocus();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setHint */
    public void mo26651x764b0e09(java.lang.String str) {
        this.f12867x5f7d1257.setHint(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setIsCommonText */
    public void mo26652x5f408004(boolean z17) {
        this.f12867x5f7d1257.m121623x5e3e511b(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setKeyboardType */
    public void mo26653xa3afb943(com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1 enumC3555x163f7fe1) {
        this.f12873xa40944ce = enumC3555x163f7fe1;
        if (enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.ID || enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.CRETAIL) {
            this.f12872xd6cfe882.m26057x8f91b80(this.f12867x5f7d1257, 1, false);
        } else if (enumC3555x163f7fe1 == com.p314xaae8f345.p347x615374d.gen.EnumC3555x163f7fe1.NORMAL) {
            this.f12872xd6cfe882.m26057x8f91b80(this.f12867x5f7d1257, 0, true);
        }
        m26632x568e84ad(enumC3555x163f7fe1);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setMaxLength */
    public void mo26654x2c956328(int i17) {
        this.f12874xdd754818 = i17;
        this.f12867x5f7d1257.setFilters(new android.text.InputFilter[]{new com.p314xaae8f345.mm.ui.p2740x696c9db.v4(i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2)});
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setOnTextChangedCallback */
    public void mo26655xa9aa28b(com.p314xaae8f345.p347x615374d.gen.AbstractC3524xb18d4f34 abstractC3524xb18d4f34) {
        this.f12875x2edc1dcd = abstractC3524xb18d4f34;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setText */
    public void mo26656x765074af(java.lang.String str) {
        this.f12867x5f7d1257.setText(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setTextColor */
    public void mo26657x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f12867x5f7d1257.setTextColor((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setTextSize */
    public void mo26658x3abfd950(float f17) {
        if (f17 > 0.0f) {
            this.f12867x5f7d1257.setTextSize(1, f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f));
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3523x59265819
    /* renamed from: setTintColor */
    public void mo26659xaae2c2e6(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setViewId */
    public void mo26334x279f85a2(java.lang.String str) {
        super.mo26334x279f85a2(str);
        if (this.f12871x97440e27 != null) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27361x5304a1db(this.f12872xd6cfe882, str + "_btn", this.f12871x97440e27);
        }
    }

    /* renamed from: setVisibleClearIcon */
    public void m26660xb9920496(boolean z17) {
        if (z17) {
            m26631xd2052d6d(0);
        } else {
            m26631xd2052d6d(4);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        final android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setGravity(16);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(context);
        this.f12867x5f7d1257 = c28001xdd2bb359;
        c28001xdd2bb359.setSingleLine(true);
        this.f12867x5f7d1257.setBackground(null);
        this.f12867x5f7d1257.setTextSize(1, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
        this.f12867x5f7d1257.setPadding(0, 0, 0, 0);
        this.f12867x5f7d1257.m121617x12027a39(com.p314xaae8f345.mm.R.C30861xcebc809e.afr);
        if (this.f12874xdd754818 != Integer.MAX_VALUE) {
            this.f12867x5f7d1257.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f12874xdd754818)});
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f12867x5f7d1257, layoutParams);
        linearLayout.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.1
            @Override // java.lang.Runnable
            public void run() {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12867x5f7d1257.getLayoutParams();
                layoutParams2.height = linearLayout.getHeight();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12867x5f7d1257.setLayoutParams(layoutParams2);
            }
        });
        if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context;
            this.f12872xd6cfe882 = abstractActivityC3282x418ff5cc;
            abstractActivityC3282x418ff5cc.m26057x8f91b80(this.f12867x5f7d1257, 0, false);
            this.f12867x5f7d1257.setTag(this);
        }
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            this.f12867x5f7d1257.setHintTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            this.f12867x5f7d1257.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e c19757x2454ae8e = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e(context);
        this.f12871x97440e27 = c19757x2454ae8e;
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560227eb);
        c19757x2454ae8e.f273574u = com.p314xaae8f345.mm.R.raw.f79679xe7836e52;
        c19757x2454ae8e.f273575v = color;
        this.f12871x97440e27.m75916xed5ee0a1(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12871x97440e27.getVisibility() == 0) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12867x5f7d1257.setText("");
                }
            }
        });
        m26631xd2052d6d(4);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.p314xaae8f345.mm.ui.zk.a(context, 16), com.p314xaae8f345.mm.ui.zk.a(context, 16));
        layoutParams2.setMargins(0, 0, com.p314xaae8f345.mm.ui.zk.a(context, 4), 0);
        linearLayout.addView(this.f12871x97440e27, layoutParams2);
        this.f12867x5f7d1257.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12875x2edc1dcd == null || editable == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12875x2edc1dcd.mo28143x16898168(editable.toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12865xe771c222 == com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.NEVER) {
                    return;
                }
                if (charSequence.length() <= 0 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.f12865xe771c222 != com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.m26631xd2052d6d(4);
                } else {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b.this.m26631xd2052d6d(0);
                }
            }
        });
        return linearLayout;
    }
}
