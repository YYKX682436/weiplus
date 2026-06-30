package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl */
/* loaded from: classes9.dex */
public class C3308x7d66815f extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.view.View> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IEditFocusChangeCallback {

    /* renamed from: mContext */
    private java.lang.ref.WeakReference<android.content.Context> f12837xd6cfe882;

    /* renamed from: pwdChangeCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3509x64dcc82c f12838xe7d278b2;

    /* renamed from: pwdEndCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3508x4e0a4a79 f12840xaed97ec3;

    /* renamed from: pwdView */
    private com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f12844xf5747b82;

    /* renamed from: dummyFocusView */
    private android.widget.LinearLayout f12835x37c4afd5 = null;

    /* renamed from: pwdStyle */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f f12842xb8f5f874 = com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f.CHECKPWDSTYLE;

    /* renamed from: pwdEncryptMode */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b f12839x29bca22b = com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.RSA;

    /* renamed from: pwdNonce */
    private java.lang.String f12841xb8ad12b2 = "";

    /* renamed from: pwdTimestamp */
    private long f12843x7b72ea59 = 0;

    /* renamed from: softEncryptSalt */
    private java.lang.String f12846x49d901d1 = "";

    /* renamed from: softEncryptVersion */
    private int f12847x6236257d = 0;

    /* renamed from: keyboardDisabled */
    private boolean f12836x53a43b83 = false;

    /* renamed from: shouldKeepKeyboardOnClearFocus */
    private boolean f12845xd5c09749 = false;

    /* renamed from: HKSOFT_RSA2048WithMD5 */
    private final int f12833x38a48008 = 0;

    /* renamed from: HKSOFT_RSA2048WithPBKDF2 */
    private final int f12834x941c85ed = 1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPwdNullAndSm2EncryptMode */
    public boolean m26574x95ec546d(java.lang.String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b enumC3593xee036e4b = this.f12839x29bca22b;
        return enumC3593xee036e4b == com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.SM2WITHMD5 || enumC3593xee036e4b == com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.SM2WITHPBKDF2;
    }

    /* renamed from: setupPwdView */
    private void m26575x72c68245(android.content.Context context) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = new com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14(context);
        this.f12844xf5747b82 = viewOnFocusChangeListenerC22906x9d30fd14;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = viewOnFocusChangeListenerC22906x9d30fd14.f295676d;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.setMovementMethod(null);
        }
        com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f enumC3594x2389e76f = this.f12842xb8f5f874;
        if (enumC3594x2389e76f == com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f.CHECKPWDSTYLE || enumC3594x2389e76f == com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f.HALFPAGECASHIERSTYLE) {
            this.f12844xf5747b82.d(1);
        } else {
            this.f12844xf5747b82.d(0);
        }
        qp5.p.b(this.f12844xf5747b82);
        this.f12844xf5747b82.m83162x631d8491(6);
        if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26059x8f91b80(this.f12844xf5747b82, 0, false, true, null, true, this);
        }
        this.f12844xf5747b82.m83166x1270e8e7(new qp5.t() { // from class: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.1
            @Override // qp5.t
            /* renamed from: onInputValidChange */
            public void mo26603x194c4a1(boolean z17) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd142 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82;
                if (viewOnFocusChangeListenerC22906x9d30fd142.f295676d != null) {
                    if (viewOnFocusChangeListenerC22906x9d30fd142.f295684o.length() > 0) {
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(viewOnFocusChangeListenerC22906x9d30fd142.f295684o);
                    } else {
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
                    }
                }
                if (!z17) {
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12838xe7d278b2 != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12838xe7d278b2.mo28105xf345c1ea(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83158x898e7ad6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83161xfb85ada3(), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83156xc003f809());
                        return;
                    }
                    return;
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12839x29bca22b == com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.SM2WITHMD5) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83164xdcb508b4(4);
                } else if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12839x29bca22b == com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.SM2WITHPBKDF2) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83164xdcb508b4(5);
                } else if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12839x29bca22b == com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.RSAWITHHKSOFT) {
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12847x6236257d == 0) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83164xdcb508b4(6);
                    } else if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12847x6236257d == 1) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83164xdcb508b4(7);
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83167x2f3fb134(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12841xb8ad12b2);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83168x12ae77db(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12843x7b72ea59);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83165x786d063(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12846x49d901d1);
                java.lang.String m83161xfb85ada3 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83161xfb85ada3();
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_sm2_downgrade_to_rsa, false);
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.m26574x95ec546d(m83161xfb85ada3) || (fj6 && com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12839x29bca22b != com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b.RSAWITHHKSOFT)) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83164xdcb508b4(1);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83167x2f3fb134("");
                    com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd143 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82;
                    if (viewOnFocusChangeListenerC22906x9d30fd143.f295676d != null) {
                        if (viewOnFocusChangeListenerC22906x9d30fd143.f295684o.length() > 0) {
                            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(viewOnFocusChangeListenerC22906x9d30fd143.f295684o);
                        } else {
                            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
                        }
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83161xfb85ada3();
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12840xaed97ec3 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12840xaed97ec3.mo28100x4a97a477(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83161xfb85ada3(), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83156xc003f809());
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12838xe7d278b2 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12838xe7d278b2.mo28105xf345c1ea(6, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83161xfb85ada3(), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83156xc003f809());
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        this.f12837xd6cfe882 = new java.lang.ref.WeakReference<>(context);
        boolean z17 = android.os.Build.VERSION.SDK_INT < 26;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_kinda_pwd_input_dummy_focus_enable, false);
        if (!z17 && !fj6) {
            m26575x72c68245(context);
            return this.f12844xf5747b82;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        this.f12835x37c4afd5 = linearLayout2;
        linearLayout2.setFocusable(true);
        this.f12835x37c4afd5.setFocusableInTouchMode(true);
        linearLayout.addView(this.f12835x37c4afd5, layoutParams);
        m26575x72c68245(context);
        linearLayout.addView(this.f12844xf5747b82, new android.widget.LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getAutoRemarkKeyBoradType */
    public boolean mo26576x61165308() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getChearInput */
    public boolean mo26577x7048956f() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getFocus */
    public boolean mo26578x746efb22() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getHashData */
    public java.lang.String mo26579x84a82b4e() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getKeyboardDisabled */
    public boolean mo26580xfb7ca2f9() {
        return this.f12836x53a43b83;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getPwdEncryptMode */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b mo26581x18546f21() {
        return this.f12839x29bca22b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getPwdNonce */
    public java.lang.String mo26582x34875028() {
        return this.f12841xb8ad12b2;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getPwdStyle */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f mo26583x34d035ea() {
        return this.f12842xb8f5f874;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getPwdTimestamp */
    public long mo26584xdc657ccf() {
        return this.f12843x7b72ea59;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: getTextLength */
    public long mo26585x4fdace69() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setAccessible */
    public void mo26268xd85ca1b8(boolean z17) {
        super.mo26268xd85ca1b8(z17);
        this.f12844xf5747b82.m83153xdb574fcd().setImportantForAccessibility(2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setAutoRemarkKeyBoradType */
    public void mo26586x9359ef14(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setChearInput */
    public void mo26587x9e6ce37b(boolean z17) {
        if (z17) {
            this.f12844xf5747b82.a();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setEncryptSoftSaltAndVersion */
    public void mo26588x5e497c4(java.lang.String str, int i17) {
        this.f12846x49d901d1 = str;
        this.f12847x6236257d = i17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setFocus */
    public void mo26589x52fd1596(boolean z17) {
        if (z17 && this.f12844xf5747b82.getVisibility() == 0 && !this.f12844xf5747b82.hasFocus()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83153xdb574fcd().requestFocus();
                }
            });
        } else {
            if (z17) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3308x7d66815f.this.f12844xf5747b82.m83153xdb574fcd().clearFocus();
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setFocusModalListener */
    public void mo26590x6730848b(com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810) {
        if (abstractC3412xb0aa4810 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "modal == null.");
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac mo27602xf5f2df = abstractC3412xb0aa4810.mo27602xf5f2df();
        if (mo27602xf5f2df instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2) mo27602xf5f2df).f13256x7bb9ede8.get();
            if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "delegateImpl.activity == null.");
                return;
            }
            java.lang.ref.WeakReference<android.content.Context> weakReference = this.f12837xd6cfe882;
            if (weakReference == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "mContext == null.");
                return;
            }
            android.content.Context context = weakReference.get();
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "tempContext == null.");
                return;
            }
            if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context;
                abstractActivityC3282x418ff5cc.m26059x8f91b80(this.f12844xf5747b82, 0, false, true, abstractViewOnAttachStateChangeListenerC21400xb429b010, true, this);
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 m26050x99e0b15d = abstractActivityC3282x418ff5cc.m26050x99e0b15d(abstractViewOnAttachStateChangeListenerC21400xb429b010);
                if (m26050x99e0b15d != null) {
                    m26050x99e0b15d.m121470x9f793805(this.f12836x53a43b83);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setFocusUIPageListener */
    public void mo26591x6b54442d(com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc) {
        if (abstractC3414xaadd5ccc == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "page == null.");
            return;
        }
        java.lang.Object mo27651x7357c4f2 = abstractC3414xaadd5ccc.mo27651x7357c4f2();
        if (mo27651x7357c4f2 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2) mo27651x7357c4f2).f13256x7bb9ede8.get();
            if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "delegateImpl.activity == null.");
                return;
            }
            java.lang.ref.WeakReference<android.content.Context> weakReference = this.f12837xd6cfe882;
            if (weakReference == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "mContext == null.");
                return;
            }
            android.content.Context context = weakReference.get();
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "tempContext == null.");
            } else if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26059x8f91b80(this.f12844xf5747b82, 0, false, true, abstractViewOnAttachStateChangeListenerC21400xb429b010, true, this);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setHashData */
    public void mo26592x7f608c5a(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setKeepKeyboardOnClearFocus */
    public void mo26593x1889e0f8(boolean z17) {
        this.f12845xd5c09749 = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setKeyboardDisabled */
    public void mo26594x9f793805(boolean z17) {
        android.content.Context context;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 m26049x99e0b15d;
        this.f12836x53a43b83 = z17;
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.f12837xd6cfe882;
        if (weakReference == null || (context = weakReference.get()) == null || !(context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) || (m26049x99e0b15d = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26049x99e0b15d()) == null) {
            return;
        }
        m26049x99e0b15d.m121470x9f793805(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setOnEndEnterPasswordCallback */
    public void mo26595xcf0683de(com.p314xaae8f345.p347x615374d.gen.AbstractC3508x4e0a4a79 abstractC3508x4e0a4a79) {
        if (abstractC3508x4e0a4a79 != null) {
            this.f12840xaed97ec3 = abstractC3508x4e0a4a79;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setOnPasswordChangeCallback */
    public void mo26596xd5f216d1(com.p314xaae8f345.p347x615374d.gen.AbstractC3509x64dcc82c abstractC3509x64dcc82c) {
        if (abstractC3509x64dcc82c != null) {
            this.f12838xe7d278b2 = abstractC3509x64dcc82c;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setPwdEncryptMode */
    public void mo26597xe04ad72d(com.p314xaae8f345.p347x615374d.gen.EnumC3593xee036e4b enumC3593xee036e4b) {
        this.f12839x29bca22b = enumC3593xee036e4b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setPwdNonce */
    public void mo26598x2f3fb134(java.lang.String str) {
        this.f12841xb8ad12b2 = str;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setPwdStyle */
    public void mo26599x2f8896f6(com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f enumC3594x2389e76f) {
        this.f12842xb8f5f874 = enumC3594x2389e76f;
        if (enumC3594x2389e76f == com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f.CHECKPWDSTYLE || enumC3594x2389e76f == com.p314xaae8f345.p347x615374d.gen.EnumC3594x2389e76f.HALFPAGECASHIERSTYLE) {
            this.f12844xf5747b82.d(1);
        } else {
            this.f12844xf5747b82.d(0);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setPwdTimestamp */
    public void mo26600x12ae77db(long j17) {
        this.f12843x7b72ea59 = j17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: setTextLength */
    public void mo26601x7dff1c75(long j17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IEditFocusChangeCallback
    /* renamed from: shouldKeepKeyboardOnEditClearFocus */
    public boolean mo26065x6db4cdf3() {
        return this.f12845xd5c09749;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3507xc8170ebd
    /* renamed from: sm2HashType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3602x4b78be80 mo26602xe80f16a0() {
        gm0.j1.i();
        return com.p314xaae8f345.p347x615374d.gen.EnumC3602x4b78be80.m28370xcee59d22()[((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, 0)).intValue()];
    }
}
