package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.kinda.framework.app.MainFragment */
/* loaded from: classes9.dex */
public class C3156x441ad749 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 {
    public static final java.lang.String TAG = "MicroMsg.MainFragment";

    /* renamed from: hasInvokedOnBack */
    private boolean f12152x3057fcf8 = false;

    /* renamed from: page */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc f12153x34628f;

    /* renamed from: root */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a f12154x3580e2;

    /* renamed from: initPage */
    private void m25450xffe33bf() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27671xedaaf3fe(this.f12632x46f1c1ab);
            this.f12153x34628f.mo27670x4b18839a(this.f12631xfb1b2fc7);
            m26075x260b4efa(mo7430x19263085().getIntent().getBundleExtra("key_platform_data"));
            m26086xdca023ab(this.f12153x34628f.mo27647x1a0f1d80());
            if (this.f12153x34628f.mo27650xf039b881() && m78647x143f1b92().G != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "UIPage is fullPageMode, so hide Actionbar.");
                m78647x143f1b92().G.o();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finish init page");
        }
    }

    /* renamed from: setSystemUIByFullMode */
    private void m25451x343f5fae() {
        int m27189xf794c2a7 = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f12153x34628f.mo27647x1a0f1d80().f13753x1c6626a8);
        m26098x5185d868(m27189xf794c2a7);
        m78647x143f1b92().E0(m27189xf794c2a7);
    }

    /* renamed from: attachPage */
    public void m25452x8aea1a74(com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc) {
        this.f12153x34628f = abstractC3414xaadd5ccc;
        this.f12629x65a7c5ae = mo25456xea5dece5();
    }

    /* renamed from: finalize */
    public void m25453xd764dc1e() {
        super.finalize();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finalize " + this.f12153x34628f);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11646x80bdb3d;
    }

    /* renamed from: getPage */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc m25455xfb83cb05() {
        return this.f12153x34628f;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: getReportUrl */
    public java.lang.String mo25456xea5dece5() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        return abstractC3414xaadd5ccc != null ? abstractC3414xaadd5ccc.mo27652xea5dece5() : "";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: getTagName */
    public java.lang.String mo25457xe1768d0f() {
        return TAG;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: inVisibleOnRecently */
    public boolean mo25458xa80d3394() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            return abstractC3414xaadd5ccc.mo27653xa80d3394();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: initOnCreate */
    public void mo25459xc57830eb() {
        m25450xffe33bf();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27661x3e5a77bb();
            m26085xba58eb04();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: initPagePlatformDelegate */
    public void mo25460x26fca0f7() {
        super.mo25460x26fca0f7();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27671xedaaf3fe(this.f12632x46f1c1ab);
            this.f12153x34628f.mo27670x4b18839a(this.f12631xfb1b2fc7);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onBackPressed */
    public boolean mo25461xbdc3c5dc() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc == null) {
            return false;
        }
        abstractC3414xaadd5ccc.mo27660x8922314d();
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc;
        if (this.f12627x5bcc8210 != null && (abstractC3414xaadd5ccc = this.f12153x34628f) != null && abstractC3414xaadd5ccc.mo27649x20440a8c()) {
            this.f12627x5bcc8210.f290174e0 = false;
        }
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onCreateLayout */
    public void mo25462xc3d266c5(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.C3280xf4562507 c3280xf4562507) {
        this.f12154x3580e2 = c3280xf4562507;
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27662xc3d266c5(c3280xf4562507);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null && !abstractC3414xaadd5ccc.mo27652xea5dece5().equals("liteApp")) {
            if (!this.f12152x3057fcf8) {
                this.f12153x34628f.mo27659xc3977f66();
                this.f12152x3057fcf8 = true;
            }
            this.f12153x34628f.mo27663xac79a11b();
        }
        this.f12153x34628f = null;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onFirstLayoutFinished */
    public void mo25463x21c4d82d() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27664x21c4d82d();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnPause */
    public void mo25464x2656c708() {
        super.mo25464x2656c708();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27666xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda
    /* renamed from: onFragmentOnResume */
    public void mo25465xa823495b() {
        super.mo25465xa823495b();
        m25451x343f5fae();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27669x63e550e1();
            this.f12153x34628f.mo27667x57429eec();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: onKeyboardShow */
    public void mo25466x81b60303(boolean z17, int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f c3163xf6b2031f = this.f12632x46f1c1ab;
        if (c3163xf6b2031f != null) {
            c3163xf6b2031f.m25521x81b60303(z17, i17);
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            if (z17) {
                abstractC3414xaadd5ccc.mo27657xfdfcc6f6(i17);
            } else {
                abstractC3414xaadd5ccc.mo27656xfdf7c93b();
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onSwipeBack */
    public void mo25467x59cfc822() {
        super.mo25467x59cfc822();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc == null || this.f12152x3057fcf8) {
            return;
        }
        abstractC3414xaadd5ccc.mo27659xc3977f66();
        this.f12152x3057fcf8 = true;
    }

    /* renamed from: refreshNavigationBar */
    public void m25468xc5b52a44() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            m26086xdca023ab(abstractC3414xaadd5ccc.mo27647x1a0f1d80());
        }
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

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc == null) {
            return false;
        }
        return abstractC3414xaadd5ccc.mo27648xafa0f872();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: willActive */
    public void mo25472xf6e97578() {
        super.mo25472xf6e97578();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27668x6b77f193();
        }
        if (m78658x28280f95() != null) {
            m78658x28280f95().m81450x8e764904(true);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061
    /* renamed from: willDeActive */
    public void mo25473x2c7574d9() {
        super.mo25473x2c7574d9();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc = this.f12153x34628f;
        if (abstractC3414xaadd5ccc != null) {
            abstractC3414xaadd5ccc.mo27665x8ccefc8e();
            m26083x3f895349();
        }
        if (m78658x28280f95() != null) {
            m78658x28280f95().m81450x8e764904(false);
        }
    }
}
