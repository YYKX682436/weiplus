package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.BaseFragment */
/* loaded from: classes9.dex */
public abstract class AbstractViewOnTouchListenerC3283x43ef4061 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba implements android.view.View.OnTouchListener {

    /* renamed from: SERVICE_SAFETY_ACTION_TYPE_DEFAULT */
    public static final int f12609x4a9d6882 = 0;

    /* renamed from: SERVICE_SAFETY_ACTION_TYPE_REPORT_ELEMENT */
    public static final int f12610x48c6150 = 1;

    /* renamed from: SERVICE_SAFETY_ACTION_TYPE_REPORT_NONE */
    public static final int f12611x8203a544 = 2;

    /* renamed from: SERVICE_SAFETY_ACTION_TYPE_REPORT_NONE_AND_SHOW_DIALOG */
    public static final int f12612xb56ca947 = 3;
    public static final java.lang.String TAG = "MicroMsg.BaseFragment";

    /* renamed from: URL_CHECK_PAY_PWD */
    public static final java.lang.String f12613x273b679f = "CheckPayPwd";

    /* renamed from: URL_PAY_DESK_MAIN */
    public static final java.lang.String f12614x7d3f41b8 = "payDeskMain";

    /* renamed from: _hellAccFlag_ */
    private byte f12615x7f11beae;

    /* renamed from: fragEvent */
    protected com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41 f12617x148d53c8;

    /* renamed from: life */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife f12624x32aefc;

    /* renamed from: mCoveredFragment */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 f12626xb337ced9;

    /* renamed from: mReportUIC */
    private m05.p f12628x65a7c08e;

    /* renamed from: mReportUrl */
    protected java.lang.String f12629x65a7c5ae;

    /* renamed from: pagePlatformDelegate */
    protected com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b f12631xfb1b2fc7;

    /* renamed from: pagePlatformFuncDelegate */
    protected com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f f12632x46f1c1ab;

    /* renamed from: rootLayout */
    protected android.view.ViewGroup f12633x9c95b6ac;

    /* renamed from: statusBarSpaceView */
    protected android.widget.FrameLayout f12636xd72bff0a;

    /* renamed from: uiModalFuncDelegate */
    protected com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2 f12638xa7dfbf82;

    /* renamed from: mActionBarContainer */
    private p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 f12625xb6f16251 = null;

    /* renamed from: mCustomActioinBarController */
    public com.p314xaae8f345.mm.ui.yb f12627x5bcc8210 = null;

    /* renamed from: isActive */
    private boolean f12620xd35c70d0 = false;

    /* renamed from: willBeRemoved */
    private boolean f12643xc003feeb = false;

    /* renamed from: isEnterBackground */
    private boolean f12621x4159fb9c = false;

    /* renamed from: isTinyApp */
    public boolean f12622x8f371677 = false;

    /* renamed from: tinyAppUserName */
    public java.lang.String f12637xfac09f17 = "";

    /* renamed from: showSingleActionStWcKbWhenHide */
    public boolean f12634xeaf2c1b = false;

    /* renamed from: wcpayKeyboardAnimationHandler */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f12640xa1870fa9 = null;

    /* renamed from: inVisibleOnRecentlyFromLast */
    public boolean f12619x5e60fd14 = false;

    /* renamed from: isWebUI */
    public boolean f12623x7ba4fdde = false;

    /* renamed from: webRawUrl */
    public java.lang.String f12642xb944ac9b = "";

    /* renamed from: webFromKindaId */
    public java.lang.String f12641x46724e4a = "";

    /* renamed from: enterAnimStyle */
    public int f12616x55935a28 = 1;

    /* renamed from: useTime */
    private long f12639xf72d70f4 = 0;

    /* renamed from: hasCheckAccessibilitySecurityServiceList */
    private boolean f12618xd290a813 = false;

    /* renamed from: needBlockAccessibility */
    private boolean f12630x4d3444f7 = false;

    /* renamed from: statusBarColor */
    private long f12635xc5f67922 = -1;

    public AbstractViewOnTouchListenerC3283x43ef4061() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24893x450143d0(m7479x8cdac1b());
    }

    /* renamed from: calculateStatusBarColor */
    private void m26069x3ea55e28(int i17) {
        fp.m.e();
        this.f12636xd72bff0a.setBackgroundColor(i17);
        m78647x143f1b92().O0(com.p314xaae8f345.mm.ui.uk.g(i17));
        m78647x143f1b92().W0(mo7430x19263085(), 0);
        m78647x143f1b92().E0(m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
    }

    /* renamed from: doCheckAccessibilitySecure */
    private void m26070x82e3cbe8() {
        if (!m26088x8239a96a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[doCheckAccessibilitySecure] is not contain PassWordView, return ");
            return;
        }
        java.util.ArrayList Di = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Di(false);
        if (Di.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[doCheckAccessibilitySecure] localServiceList == null ||localServiceList.size() <= 0, return");
            return;
        }
        int Ni = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ni(Di, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[doCheckAccessibilitySecure] get action is %d", java.lang.Integer.valueOf(Ni));
        if (Ni == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[doCheckAccessibilitySecure] action is 0, return ");
            return;
        }
        if (this.f12633x9c95b6ac == null || mo7438x76847179() == null || mo7438x76847179().isDestroyed() || mo7438x76847179().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[doCheckAccessibilitySecure] activity is destory, return ");
            return;
        }
        android.view.ViewGroup viewGroup = this.f12633x9c95b6ac;
        if (!(viewGroup instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3138x37de6e0a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[doCheckAccessibilitySecure] rootLayout is not KindaPlatformLayout");
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3138x37de6e0a c3138x37de6e0a = (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3138x37de6e0a) viewGroup;
        if (Ni != 2) {
            this.f12630x4d3444f7 = false;
            c3138x37de6e0a.m25222x47e9bb95(false);
        } else {
            this.f12630x4d3444f7 = true;
            c3138x37de6e0a.m25222x47e9bb95(true);
        }
    }

    /* renamed from: isInVisibleOnRecently */
    private boolean m26071x2b30fa0a() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_close_pay_vague, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clicfg_android_wxpay_close_pay_vague %s, inVisibleOnRecently:%s formLast:%s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(mo25458xa80d3394()), java.lang.Boolean.valueOf(this.f12619x5e60fd14));
        if (fj6) {
            return false;
        }
        return mo25458xa80d3394() || this.f12619x5e60fd14;
    }

    /* renamed from: isSelfInVisibleOnRecently */
    private boolean m26072x1b1e0c1e() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_close_pay_vague, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clicfg_android_wxpay_close_pay_vague %s, isSelfInVisibleOnRecently:%s ", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(mo25458xa80d3394()));
        if (fj6) {
            return false;
        }
        return mo25458xa80d3394();
    }

    /* renamed from: addCustomReportEvent */
    public void m26073xd2c986f4(java.lang.String str, n05.a aVar) {
        this.f12628x65a7c08e.O6(str, aVar);
    }

    /* renamed from: addLifecycleReportEvent */
    public void m26074xe1643a3d(m05.n nVar, n05.a aVar) {
        this.f12628x65a7c08e.P6(nVar, aVar);
    }

    /* renamed from: covertPlatformData */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m26075x260b4efa(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof java.lang.String) {
                    m27539xaf65a0fc.mo27566xe4673800(str, (java.lang.String) obj);
                } else if (obj instanceof java.lang.Long) {
                    m27539xaf65a0fc.mo27564xf2e7ce2b(str, ((java.lang.Long) obj).longValue());
                } else if (obj instanceof java.lang.Integer) {
                    m27539xaf65a0fc.mo27557xc5c55e60(str, ((java.lang.Integer) obj).intValue());
                } else if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) obj;
                    if (arrayList.get(0) instanceof java.lang.String) {
                        m27539xaf65a0fc.mo27563xe1b7d6be(str, arrayList);
                    } else if (arrayList.get(0) instanceof java.lang.Long) {
                        m27539xaf65a0fc.mo27562x4cad0469(str, arrayList);
                    } else if (arrayList.get(0) instanceof java.lang.Integer) {
                        m27539xaf65a0fc.mo27561x23816862(str, arrayList);
                    }
                }
            }
        }
        return m27539xaf65a0fc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View view) {
        super.mo26076x2105eeb2(view);
        if (mo26090x345d1387()) {
            if (this.f12625xb6f16251 == null) {
                this.f12625xb6f16251 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324) ((android.view.ViewStub) view.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11561x545acfa6)).inflate();
            }
            this.f12627x5bcc8210.A0.f406770i = (android.view.ViewGroup) view;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930
    /* renamed from: findViewById */
    public android.view.View mo26077x4ff8c0f0(int i17) {
        if (m7474xfb86a31b() != null) {
            return m7474xfb86a31b().findViewById(i17);
        }
        if (mo7430x19263085() != null) {
            return mo7430x19263085().findViewById(i17);
        }
        return null;
    }

    /* renamed from: getCoveredFragment */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26078xc7eb70d0() {
        return this.f12626xb337ced9;
    }

    /* renamed from: getIsEnterBackground */
    public boolean m26079x948e82e6() {
        return this.f12621x4159fb9c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11646x80bdb3d;
    }

    /* renamed from: getPrevFragment */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m26080x66849819() {
        int indexOf;
        if (m7446xe17c5d07() != null) {
            java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = m7446xe17c5d07().m7675x1626d96d();
            if (m7675x1626d96d.size() > 1 && (indexOf = m7675x1626d96d.indexOf(this) - 1) >= 0) {
                return m7675x1626d96d.get(indexOf);
            }
        }
        return null;
    }

    /* renamed from: getReportUrl */
    public abstract java.lang.String mo25456xea5dece5();

    /* renamed from: getTagName */
    public abstract java.lang.String mo25457xe1768d0f();

    /* renamed from: getWcpayKeyboardAnimationHandler */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 m26081xd108f7f3() {
        if (this.f12640xa1870fa9 == null) {
            this.f12640xa1870fa9 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        }
        return this.f12640xa1870fa9;
    }

    /* renamed from: getWillBeRemoved */
    public boolean m26082x7d63bb35() {
        return this.f12643xc003feeb;
    }

    /* renamed from: hideKeyboard */
    public void m26083x3f895349() {
        m78647x143f1b92().K();
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
        if (mo26077x4ff8c0f0 != null && (mo7430x19263085() instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc)) {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) mo7430x19263085()).m26053xd46dd964(mo26077x4ff8c0f0, new java.lang.ref.WeakReference<>(this));
        }
        m26084xd5cb7021();
    }

    /* renamed from: hideWcPayKeyboard */
    public void m26084xd5cb7021() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11642x2e4f831);
        if (c22894x55bf3223 != null) {
            if (this.f12634xeaf2c1b) {
                c22894x55bf3223.v();
            } else {
                c22894x55bf3223.i();
            }
        }
    }

    /* renamed from: inVisibleOnRecently */
    public abstract boolean mo25458xa80d3394();

    /* renamed from: initOnCreate */
    public abstract void mo25459xc57830eb();

    /* renamed from: initPagePlatformDelegate */
    public void mo25460x26fca0f7() {
        this.f12631xfb1b2fc7 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b(mo7430x19263085());
        this.f12632x46f1c1ab = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f(this);
        this.f12638xa7dfbf82 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2(this);
    }

    /* renamed from: initPageView */
    public void m26085xba58eb04() {
        com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda c1589x9549ddda = new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda(mo7430x19263085());
        c1589x9549ddda.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((android.view.ViewGroup) m7474xfb86a31b().findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11497xe7814c81)).addView(c1589x9549ddda);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "initPageView rootLayout %s", c1589x9549ddda);
        mo25462xc3d266c5(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.C3280xf4562507(c1589x9549ddda));
    }

    /* renamed from: initWithNavigationBarConfig */
    public void m26086xdca023ab(com.p314xaae8f345.p347x615374d.gen.C3580xf3b74561 c3580xf3b74561) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "NavigationBarConfig: %s", c3580xf3b74561);
        if (c3580xf3b74561 == null || m78647x143f1b92().G == null) {
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284 = c3580xf3b74561.f13753x1c6626a8;
        if (c3392x2ae78284 != null) {
            int m27189xf794c2a7 = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284);
            m78647x143f1b92().G.w(new android.graphics.drawable.ColorDrawable(m27189xf794c2a7));
            m26069x3ea55e28(m27189xf794c2a7);
            m78647x143f1b92().E0(m27189xf794c2a7);
        }
        java.lang.String str = c3580xf3b74561.f13754xbbc6f192;
        if (str != null) {
            mo78695xbf7c1df6(str);
        }
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae782842 = c3580xf3b74561.f13760x70f1cc38;
        if (c3392x2ae782842 != null && c3392x2ae782842.f13482x98ef8c0f != 0) {
            com.p314xaae8f345.mm.ui.ga m78647x143f1b92 = m78647x143f1b92();
            int i17 = (int) c3580xf3b74561.f13760x70f1cc38.f13482x98ef8c0f;
            if (m78647x143f1b92.G != null) {
                m78647x143f1b92.H.setTextColor(i17);
            }
        }
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae782843 = c3580xf3b74561.f13756x5271849d;
        if (c3392x2ae782843 == null || c3392x2ae782843.m27432xc8b8c186() == 0) {
            z17 = false;
        } else {
            z17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(c3580xf3b74561.f13756x5271849d.m27432xc8b8c186()) == -1;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = m78647x143f1b92().K;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.clearColorFilter();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = m78647x143f1b92().K;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82037xa10c26f6(false);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.b bVar = m78647x143f1b92().G;
        if (bVar != null) {
            bVar.G(0.0f);
        }
        com.p314xaae8f345.p347x615374d.gen.EnumC3575x59063118 enumC3575x59063118 = c3580xf3b74561.f13755xb23784b;
        if (enumC3575x59063118 == com.p314xaae8f345.p347x615374d.gen.EnumC3575x59063118.BACK) {
            m78683x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFragment.2
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.m26096x8f5417c1();
                    return true;
                }
            }, z17 ? com.p314xaae8f345.mm.R.raw.f78357x4cad4fd4 : com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        } else if (enumC3575x59063118 == com.p314xaae8f345.p347x615374d.gen.EnumC3575x59063118.CANCEL) {
            m78683x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFragment.3
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.m26096x8f5417c1();
                    return true;
                }
            }, z17 ? com.p314xaae8f345.mm.R.raw.f78359x490ff0ab : com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        } else if (enumC3575x59063118 == com.p314xaae8f345.p347x615374d.gen.EnumC3575x59063118.NONE) {
            m78647x143f1b92().t0(false);
        }
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae782844 = c3580xf3b74561.f13756x5271849d;
        if (c3392x2ae782844 != null && com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(c3392x2ae782844.m27432xc8b8c186()) != 0 && c3580xf3b74561.f13756x5271849d.m27432xc8b8c186() == c3580xf3b74561.f13757xaeff4e22.m27432xc8b8c186()) {
            m78647x143f1b92().q0(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3580xf3b74561.f13756x5271849d)));
        }
        java.lang.String str2 = c3580xf3b74561.f13759xafec4117;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3580xf3b74561.f13758xaf52c81a) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (c3580xf3b74561.f13758xaf52c81a.equals("kinda_icons_outlined_more")) {
                str2 = m7467x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3090xcad56011.f11659x8d434529);
            } else if (c3580xf3b74561.f13758xaf52c81a.equals("kinda_icons_outlined_help")) {
                str2 = m7467x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3090xcad56011.f11658x8d40d915);
            }
        }
        mo25469xac171bc8(c3580xf3b74561.f13758xaf52c81a);
        mo25470xacb094c5(str2, c3580xf3b74561.f13757xaeff4e22);
    }

    /* renamed from: isActive */
    public boolean m26087xd35c70d0() {
        return this.f12620xd35c70d0;
    }

    /* renamed from: isContainPassWordView */
    public boolean m26088x8239a96a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[isContainPassWordView] mReportUrl : %s.", this.f12629x65a7c5ae);
        return f12614x7d3f41b8.equals(this.f12629x65a7c5ae);
    }

    /* renamed from: isContainSecureView */
    public boolean m26089xde0a6aa6() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b c3359x65bf7d3b = this.f12631xfb1b2fc7;
        if (c3359x65bf7d3b == null) {
            return false;
        }
        int size = c3359x65bf7d3b.m27157x2db9a801().size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Fragment contains secure view size: %s.", java.lang.Integer.valueOf(size));
        return size > 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: isSupportCustomActionBar */
    public boolean mo26090x345d1387() {
        return true;
    }

    /* renamed from: needBlockAccessibility */
    public boolean m26091x4d3444f7() {
        return this.f12630x4d3444f7;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        mo25457xe1768d0f();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
        if (mo26090x345d1387()) {
            com.p314xaae8f345.mm.ui.yb ybVar = new com.p314xaae8f345.mm.ui.yb();
            this.f12627x5bcc8210 = ybVar;
            ybVar.f294117y0 = this;
            ybVar.A0 = new ma5.e(mo78409x676b27cd(), ybVar);
            m78681xd1f6d00d(this.f12627x5bcc8210);
        }
        this.f12628x65a7c08e = new m05.p(this);
    }

    /* renamed from: onBackPressed */
    public abstract boolean mo25461xbdc3c5dc();

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onCreate %s %s", mo25457xe1768d0f(), this);
        super.mo7398x3e5a77bb(bundle);
    }

    /* renamed from: onCreateLayout */
    public abstract void mo25462xc3d266c5(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.C3280xf4562507 c3280xf4562507);

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return super.mo7503x18bad100(layoutInflater, viewGroup, bundle);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public /* bridge */ /* synthetic */ void mo7504xac79a11b() {
        super.mo7504xac79a11b();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        mo25457xe1768d0f();
        this.f12631xfb1b2fc7 = null;
        this.f12632x46f1c1ab = null;
        this.f12638xa7dfbf82 = null;
        mo25484xb406b194();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife iFrLife = this.f12624x32aefc;
        if (iFrLife != null) {
            iFrLife.mo26150xa6664a60();
        }
        this.f12624x32aefc = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        mo25457xe1768d0f();
        super.mo7400x3f5eee52();
        this.f12617x148d53c8 = null;
    }

    /* renamed from: onFirstLayoutFinished */
    public void mo25463x21c4d82d() {
    }

    /* renamed from: onFirstRenderFinish */
    public void mo25482xe3c31c7a() {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnCreate */
    public /* bridge */ /* synthetic */ void mo26092x8f3b222a() {
        super.mo26092x8f3b222a();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnDestroy */
    public void mo26093x77ae448c() {
        super.mo26093x77ae448c();
        this.f12632x46f1c1ab = null;
        this.f12627x5bcc8210 = null;
        this.f12628x65a7c08e.mo451xac79a11b();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnPause */
    public void mo25464x2656c708() {
        super.mo25464x2656c708();
        if (m26072x1b1e0c1e()) {
            mo7430x19263085().getWindow().addFlags(8192);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FLAG_SECURE onFragmentOnPause, add flag class: %s ", mo7591x9616526c());
        } else if (m26089xde0a6aa6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FLAG_SECURE onFragmentOnPause, still contain secure view, keep flag class: %s ", mo7591x9616526c());
        }
        this.f12628x65a7c08e.mo2281xb01dfb57();
        mo7591x9616526c();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnResume */
    public void mo25465xa823495b() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41 interfaceC3288xc3ba2d41;
        super.mo25465xa823495b();
        if (m26089xde0a6aa6()) {
            mo7430x19263085().getWindow().addFlags(8192);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FLAG_SECURE onFragmentOnResume, add flag class: %s ", mo7591x9616526c());
        } else if (m26071x2b30fa0a()) {
            mo7430x19263085().getWindow().clearFlags(8192);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FLAG_SECURE onFragmentOnResume, clear flag class: %s", mo7591x9616526c());
        } else {
            mo7430x19263085().getWindow().clearFlags(8192);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FLAG_SECURE onFragmentOnResume, default clear flag class: %s", mo7591x9616526c());
        }
        if (!this.f12618xd290a813) {
            this.f12618xd290a813 = true;
            m26070x82e3cbe8();
        }
        this.f12628x65a7c08e.mo2284x57429eec();
        mo7591x9616526c();
        if (!m7483xdf9b8f74() || (interfaceC3288xc3ba2d41 = this.f12617x148d53c8) == null) {
            return;
        }
        interfaceC3288xc3ba2d41.mo26155x606faa21(this);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnStart */
    public /* bridge */ /* synthetic */ void mo26094x26896574() {
        super.mo26094x26896574();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnStop */
    public /* bridge */ /* synthetic */ void mo26095xe035fcb0() {
        super.mo26095xe035fcb0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onHiddenChanged */
    public void mo7506x87316e0b(boolean z17) {
        super.mo7506x87316e0b(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onHiddenChanged %s", java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: onKeyboardShow */
    public abstract void mo25466x81b60303(boolean z17, int i17);

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        mo25457xe1768d0f();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife iFrLife = this.f12624x32aefc;
        if (iFrLife != null) {
            iFrLife.mo26151xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        mo25457xe1768d0f();
        super.mo7517x57429eec();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife iFrLife = this.f12624x32aefc;
        if (iFrLife != null) {
            iFrLife.mo26152x57429eec();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public /* bridge */ /* synthetic */ void mo7405xb05099c3() {
        super.mo7405xb05099c3();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public /* bridge */ /* synthetic */ void mo7406xc39f8281() {
        super.mo7406xc39f8281();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onSwipeBack */
    public void mo25467x59cfc822() {
        super.mo25467x59cfc822();
        mo25457xe1768d0f();
        this.f12617x148d53c8.mo26156x8f5417c1(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(final android.view.View view, android.os.Bundle bundle) {
        this.f12639xf72d70f4 = java.lang.System.currentTimeMillis();
        super.mo7518x594b1124(view, bundle);
        this.f12636xd72bff0a = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11565x4ec250d8);
        int p17 = com.p314xaae8f345.mm.ui.bk.p(mo7438x76847179());
        android.view.ViewGroup.LayoutParams layoutParams = this.f12636xd72bff0a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = p17;
            this.f12636xd72bff0a.setLayoutParams(layoutParams);
        }
        this.f12633x9c95b6ac = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11564x313a4cad);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onViewCreated %s %s", mo25457xe1768d0f(), this);
        this.f12631xfb1b2fc7 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b(mo7430x19263085());
        this.f12632x46f1c1ab = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f(this);
        this.f12638xa7dfbf82 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2(this);
        if (mo25487xaefd7db3()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo25459xc57830eb();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24894xafeb3684(m7479x8cdac1b());
        view.setOnTouchListener(this);
        view.setClickable(true);
        view.setImportantForAccessibility(2);
        view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFragment.1

            /* renamed from: _hellAccFlag_ */
            private byte f12644x7f11beae;

            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.f12639xf72d70f4 = java.lang.System.currentTimeMillis() - com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.f12639xf72d70f4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.TAG, "%s view created useTime: %sms", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.mo25456xea5dece5(), java.lang.Long.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.f12639xf72d70f4));
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.mo25482xe3c31c7a();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.mo25463x21c4d82d();
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061.this.mo25487xaefd7db3()) {
                    android.view.View view2 = view;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/BaseFragment$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseFragment$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife iFrLife = this.f12624x32aefc;
        if (iFrLife != null) {
            iFrLife.mo26153x3cafd740(bundle);
        }
        this.f12628x65a7c08e.mo450x3e5a77bb(null);
    }

    /* renamed from: popFragment */
    public void m26096x8f5417c1() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41 interfaceC3288xc3ba2d41 = this.f12617x148d53c8;
        if (interfaceC3288xc3ba2d41 != null) {
            interfaceC3288xc3ba2d41.mo26156x8f5417c1(this);
        }
    }

    /* renamed from: recordCoveredFragment */
    public void m26097x73d79e75(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        this.f12626xb337ced9 = abstractViewOnTouchListenerC3283x43ef4061;
    }

    /* renamed from: restoreActionBarColor */
    public void mo25484xb406b194() {
    }

    /* renamed from: setActionBarColor */
    public void m26098x5185d868(int i17) {
        if (mo7438x76847179() != null) {
            m78647x143f1b92().G.w(new android.graphics.drawable.ColorDrawable(i17));
            m26069x3ea55e28(i17);
        }
    }

    /* renamed from: setIsEnterBackground */
    public void m26099x70248f5a(boolean z17) {
        this.f12621x4159fb9c = z17;
    }

    /* renamed from: setTopRightBtnImage */
    public abstract void mo25469xac171bc8(java.lang.String str);

    /* renamed from: setTopRightBtnTitle */
    public abstract void mo25470xacb094c5(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284);

    /* renamed from: setWillBeRemoved */
    public void m26100x103a21a9(boolean z17) {
        this.f12643xc003feeb = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }

    /* renamed from: triggerReport */
    public void m26101x9f6b6d0c(m05.n nVar, java.lang.String str) {
        this.f12628x65a7c08e.R6(nVar, str);
    }

    /* renamed from: useImmediateKeyboardAnimation */
    public boolean mo25485xa1e9f293() {
        return false;
    }

    /* renamed from: useKeyboardCoverMode */
    public boolean mo25486x5b12c70c() {
        return false;
    }

    /* renamed from: usePanelModalMode */
    public boolean mo25487xaefd7db3() {
        return false;
    }

    /* renamed from: watchLife */
    public void m26102xef41e86b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife iFrLife) {
        this.f12624x32aefc = iFrLife;
    }

    /* renamed from: willActive */
    public void mo25472xf6e97578() {
        mo25457xe1768d0f();
        this.f12620xd35c70d0 = true;
    }

    /* renamed from: willDeActive */
    public void mo25473x2c7574d9() {
        this.f12620xd35c70d0 = false;
        mo25457xe1768d0f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7497x3b13c504(android.app.Activity activity) {
        mo25457xe1768d0f();
        super.mo7497x3b13c504(activity);
        try {
            this.f12617x148d53c8 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) activity;
        } catch (java.lang.ClassCastException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error IEventFragment");
        }
    }
}
