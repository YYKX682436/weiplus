package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.kinda.framework.app.ModalFragment */
/* loaded from: classes9.dex */
public class C3157xfaf573fd extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 {
    public static final java.lang.String TAG = "MicroMsg.ModalFragment";

    /* renamed from: _hellAccFlag_ */
    private byte f12155x7f11beae;

    /* renamed from: mPreFragment */
    private p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f12156xb74cb766;

    /* renamed from: mViewCenterPadding */
    private android.view.View f12157xd7071e6a;

    /* renamed from: orientationOnCreate */
    private int f12158x903d01ab = 0;

    /* renamed from: page */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 f12159x34628f;

    /* renamed from: getBlackMaskColorRes */
    private int m25474xc27ed632() {
        return com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.a_m : com.p314xaae8f345.mm.R.C30859x5a72f63.a_n;
    }

    /* renamed from: initCenterPaddingView */
    private void m25475xbfcd5b91(android.view.View view) {
        if (view != null) {
            this.f12157xd7071e6a = view.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11641x6efd7f01);
            int p17 = com.p314xaae8f345.mm.ui.bk.p(mo7438x76847179());
            android.view.View view2 = this.f12157xd7071e6a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/app/ModalFragment", "initCenterPaddingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/kinda/framework/app/ModalFragment", "initCenterPaddingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = this.f12157xd7071e6a.getLayoutParams();
            layoutParams.height = p17;
            this.f12157xd7071e6a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: initPage */
    private void m25476xffe33bf() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            abstractC3412xb0aa4810.mo27615x4b18839a(this.f12631xfb1b2fc7);
            this.f12159x34628f.mo27614x373eedeb(this.f12638xa7dfbf82);
            m26075x260b4efa(mo7430x19263085().getIntent().getBundleExtra("key_platform_data"));
            if (mo25486x5b12c70c()) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11564x313a4cad);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11498x6673c8a8);
                android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo26077x4ff8c0f0, arrayList.toArray(), "com/tencent/kinda/framework/app/ModalFragment", "initPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo26077x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo26077x4ff8c0f0, "com/tencent/kinda/framework/app/ModalFragment", "initPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.removeView(mo26077x4ff8c0f0);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                viewGroup2.addView(mo26077x4ff8c0f0, layoutParams);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finish init page");
        }
    }

    /* renamed from: setCenterPaddingColor */
    private void m25477xac7112c9(int i17) {
        android.view.View view = this.f12157xd7071e6a;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    /* renamed from: setupActionAndStatusBarColor */
    private void m25478x8e6d9006() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 == null || abstractC3412xb0aa4810.mo27616xc21c1502() == null || this.f12159x34628f.mo27616xc21c1502().f13482x98ef8c0f <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "uimodal should override statusbarColor");
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m26080x66849819 = m26080x66849819();
            this.f12156xb74cb766 = m26080x66849819;
            if (m26080x66849819 == null) {
                int color = mo7438x76847179().getResources().getColor(m25474xc27ed632());
                m26098x5185d868(color);
                m25477xac7112c9(color);
            } else if (m26080x66849819 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) m26080x66849819).m78647x143f1b92().u();
                m25477xac7112c9(mo7438x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                m26098x5185d868(0);
            } else if (m26080x66849819 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) {
                int u17 = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) m26080x66849819).m78647x143f1b92().u();
                int color2 = mo7438x76847179().getResources().getColor(m25474xc27ed632());
                m26098x5185d868((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27183x534eeba8(u17, color2));
                m25477xac7112c9(color2);
            }
        } else {
            m26098x5185d868((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12159x34628f.mo27616xc21c1502()));
        }
        m25483xc5b52a44();
    }

    /* renamed from: attachModal */
    public void m25479xd2353f68(com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810) {
        this.f12159x34628f = abstractC3412xb0aa4810;
        this.f12629x65a7c5ae = mo25456xea5dece5();
    }

    /* renamed from: finalize */
    public void m25480xd764dc1e() {
        super.finalize();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finalize " + this.f12159x34628f);
    }

    /* renamed from: getPage */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 m25481xfb83cb05() {
        return this.f12159x34628f;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: getReportUrl */
    public java.lang.String mo25456xea5dece5() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        return abstractC3412xb0aa4810 != null ? abstractC3412xb0aa4810.mo27603xea5dece5() : "";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: getTagName */
    public java.lang.String mo25457xe1768d0f() {
        return TAG;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: inVisibleOnRecently */
    public boolean mo25458xa80d3394() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            return abstractC3412xb0aa4810.mo27604xa80d3394();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: initOnCreate */
    public void mo25459xc57830eb() {
        m78647x143f1b92().G.o();
        m25476xffe33bf();
        if (this.f12159x34628f != null) {
            m26085xba58eb04();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onBackPressed */
    public boolean mo25461xbdc3c5dc() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 == null) {
            return false;
        }
        abstractC3412xb0aa4810.mo27608x8922314d();
        return true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != this.f12158x903d01ab && (abstractC3412xb0aa4810 = this.f12159x34628f) != null) {
            abstractC3412xb0aa4810.mo27620x24d1b2f7();
        }
        this.f12158x903d01ab = configuration.orientation;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onCreateLayout */
    public void mo25462xc3d266c5(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.C3280xf4562507 c3280xf4562507) {
        this.f12159x34628f.mo27609xc3d266c5(c3280xf4562507);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(layoutInflater, viewGroup, bundle);
        if (mo7438x76847179() != null && this.f12159x34628f.mo27599xcd93b1d4()) {
            m25475xbfcd5b91(mo7503x18bad100);
        }
        this.f12158x903d01ab = m78652xba8c474f().getConfiguration().orientation;
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            abstractC3412xb0aa4810.mo27610xac79a11b();
        }
        this.f12159x34628f = null;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onFirstRenderFinish */
    public void mo25482xe3c31c7a() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            abstractC3412xb0aa4810.mo27611xe3c31c7a();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnResume */
    public void mo25465xa823495b() {
        super.mo25465xa823495b();
        m25478x8e6d9006();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onKeyboardShow */
    public void mo25466x81b60303(boolean z17, int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f c3163xf6b2031f = this.f12632x46f1c1ab;
        if (c3163xf6b2031f != null) {
            c3163xf6b2031f.m25521x81b60303(z17, i17);
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2 c3358x144888c2 = this.f12638xa7dfbf82;
        if (c3358x144888c2 != null) {
            c3358x144888c2.m27152x81b60303(z17, i17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        if (this.f12159x34628f == null || !m26079x948e82e6()) {
            return;
        }
        this.f12159x34628f.mo27613xb5fda84d();
        m26099x70248f5a(false);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        if (this.f12159x34628f == null || m26082x7d63bb35()) {
            return;
        }
        this.f12159x34628f.mo27612xf04d9438();
        m26099x70248f5a(true);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
        m25478x8e6d9006();
    }

    /* renamed from: refreshNavigationBar */
    public void m25483xc5b52a44() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 == null || abstractC3412xb0aa4810.mo27607xe46b7144() == null || this.f12159x34628f.mo27607xe46b7144().f13482x98ef8c0f <= 0) {
            return;
        }
        m78647x143f1b92().E0((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12159x34628f.mo27607xe46b7144()));
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: restoreActionBarColor */
    public void mo25484xb406b194() {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: setTopRightBtnImage */
    public void mo25469xac171bc8(java.lang.String str) {
        this.f12632x46f1c1ab.mo25537xac171bc8(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: setTopRightBtnTitle */
    public void mo25470xacb094c5(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f12632x46f1c1ab.mo25538xacb094c5(str, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27356xef6fd2ef(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: useImmediateKeyboardAnimation */
    public boolean mo25485xa1e9f293() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            return abstractC3412xb0aa4810.mo27617xa1e9f293();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: useKeyboardCoverMode */
    public boolean mo25486x5b12c70c() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            return abstractC3412xb0aa4810.mo27618x5b12c70c();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: usePanelModalMode */
    public boolean mo25487xaefd7db3() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810 = this.f12159x34628f;
        if (abstractC3412xb0aa4810 != null) {
            return abstractC3412xb0aa4810.mo27619xaefd7db3();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: willActive */
    public void mo25472xf6e97578() {
        super.mo25472xf6e97578();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: willDeActive */
    public void mo25473x2c7574d9() {
        super.mo25473x2c7574d9();
    }
}
