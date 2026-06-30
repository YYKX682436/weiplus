package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.IUIModal */
/* loaded from: classes9.dex */
public abstract class AbstractC3412xb0aa4810 {

    /* renamed from: com.tencent.kinda.gen.IUIModal$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13542x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13543x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13544xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13544xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27621x23caefe3(long j17);

        /* renamed from: native_IsShowAndroidCenterPadding */
        private native boolean m27622x8d3c42fc(long j17);

        /* renamed from: native_animationCutLinePosition */
        private native float m27623x26ab5ba3(long j17);

        /* renamed from: native_forceShowInLightMode */
        private native boolean m27624xa95a99b4(long j17);

        /* renamed from: native_getFuncDelegate */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac m27625x7fc8ab7(long j17);

        /* renamed from: native_getReportUrl */
        private native java.lang.String m27626xe0ea240d(long j17);

        /* renamed from: native_inVisibleOnRecently */
        private native boolean m27627x17d41f6c(long j17);

        /* renamed from: native_keyboardWillHide */
        private native void m27628xd7c42c63(long j17);

        /* renamed from: native_keyboardWillShow */
        private native void m27629xd7c92a1e(long j17, float f17);

        /* renamed from: native_navigationBarColor */
        private native com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 m27630x7cabaa6c(long j17);

        /* renamed from: native_onClickAndroidBack */
        private native void m27631x21626a75(long j17);

        /* renamed from: native_onCreateLayout */
        private native void m27632x482d73ed(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda);

        /* renamed from: native_onDestroy */
        private native void m27633xc2e4faf3(long j17);

        /* renamed from: native_onFirstRenderFinish */
        private native void m27634x538a0852(long j17);

        /* renamed from: native_onModalEnterBackground */
        private native void m27635x8dfcf960(long j17);

        /* renamed from: native_onModalEnterForeground */
        private native void m27636x53ad0d75(long j17);

        /* renamed from: native_setFuncDelegate */
        private native void m27637x3e4585c3(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac interfaceC3413x5796dcac);

        /* renamed from: native_setPlatformDelegate */
        private native void m27638xbadf6f72(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004);

        /* renamed from: native_statusbarColor */
        private native com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 m27639x4677222a(long j17);

        /* renamed from: native_useImmediateKeyboardAnimation */
        private native boolean m27640x233df06b(long j17);

        /* renamed from: native_useKeyboardCoverMode */
        private native boolean m27641xe4295634(long j17);

        /* renamed from: native_usePanelModalMode */
        private native boolean m27642xebd7f8b(long j17);

        /* renamed from: native_viewDidTransitionToNewSize */
        private native void m27643xe47a441f(long j17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: IsShowAndroidCenterPadding */
        public boolean mo27599xcd93b1d4() {
            return m27622x8d3c42fc(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: animationCutLinePosition */
        public float mo27600x3740a07b() {
            return m27623x26ab5ba3(this.f13544xc3e764fc);
        }

        /* renamed from: destroy */
        public void m27644x5cd39ffa() {
            if (this.f13543x766b9619.getAndSet(true)) {
                return;
            }
            m27621x23caefe3(this.f13544xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27645xd764dc1e() {
            m27644x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: forceShowInLightMode */
        public boolean mo27601x20440a8c() {
            return m27624xa95a99b4(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: getFuncDelegate */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac mo27602xf5f2df() {
            return m27625x7fc8ab7(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: getReportUrl */
        public java.lang.String mo27603xea5dece5() {
            return m27626xe0ea240d(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: inVisibleOnRecently */
        public boolean mo27604xa80d3394() {
            return m27627x17d41f6c(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: keyboardWillHide */
        public void mo27605xfdf7c93b() {
            m27628xd7c42c63(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: keyboardWillShow */
        public void mo27606xfdfcc6f6(float f17) {
            m27629xd7c92a1e(this.f13544xc3e764fc, f17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: navigationBarColor */
        public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo27607xe46b7144() {
            return m27630x7cabaa6c(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: onClickAndroidBack */
        public void mo27608x8922314d() {
            m27631x21626a75(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: onCreateLayout */
        public void mo27609xc3d266c5(com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda) {
            m27632x482d73ed(this.f13544xc3e764fc, interfaceC3546x99da0cda);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: onDestroy */
        public void mo27610xac79a11b() {
            m27633xc2e4faf3(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: onFirstRenderFinish */
        public void mo27611xe3c31c7a() {
            m27634x538a0852(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: onModalEnterBackground */
        public void mo27612xf04d9438() {
            m27635x8dfcf960(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: onModalEnterForeground */
        public void mo27613xb5fda84d() {
            m27636x53ad0d75(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: setFuncDelegate */
        public void mo27614x373eedeb(com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac interfaceC3413x5796dcac) {
            m27637x3e4585c3(this.f13544xc3e764fc, interfaceC3413x5796dcac);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: setPlatformDelegate */
        public void mo27615x4b18839a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004) {
            m27638xbadf6f72(this.f13544xc3e764fc, interfaceC3416x710a1004);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: statusbarColor */
        public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo27616xc21c1502() {
            return m27639x4677222a(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: useImmediateKeyboardAnimation */
        public boolean mo27617xa1e9f293() {
            return m27640x233df06b(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: useKeyboardCoverMode */
        public boolean mo27618x5b12c70c() {
            return m27641xe4295634(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: usePanelModalMode */
        public boolean mo27619xaefd7db3() {
            return m27642xebd7f8b(this.f13544xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810
        /* renamed from: viewDidTransitionToNewSize */
        public void mo27620x24d1b2f7() {
            m27643xe47a441f(this.f13544xc3e764fc);
        }
    }

    /* renamed from: IsShowAndroidCenterPadding */
    public abstract boolean mo27599xcd93b1d4();

    /* renamed from: animationCutLinePosition */
    public abstract float mo27600x3740a07b();

    /* renamed from: forceShowInLightMode */
    public abstract boolean mo27601x20440a8c();

    /* renamed from: getFuncDelegate */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac mo27602xf5f2df();

    /* renamed from: getReportUrl */
    public abstract java.lang.String mo27603xea5dece5();

    /* renamed from: inVisibleOnRecently */
    public abstract boolean mo27604xa80d3394();

    /* renamed from: keyboardWillHide */
    public abstract void mo27605xfdf7c93b();

    /* renamed from: keyboardWillShow */
    public abstract void mo27606xfdfcc6f6(float f17);

    /* renamed from: navigationBarColor */
    public abstract com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo27607xe46b7144();

    /* renamed from: onClickAndroidBack */
    public abstract void mo27608x8922314d();

    /* renamed from: onCreateLayout */
    public abstract void mo27609xc3d266c5(com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda);

    /* renamed from: onDestroy */
    public abstract void mo27610xac79a11b();

    /* renamed from: onFirstRenderFinish */
    public abstract void mo27611xe3c31c7a();

    /* renamed from: onModalEnterBackground */
    public abstract void mo27612xf04d9438();

    /* renamed from: onModalEnterForeground */
    public abstract void mo27613xb5fda84d();

    /* renamed from: setFuncDelegate */
    public abstract void mo27614x373eedeb(com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac interfaceC3413x5796dcac);

    /* renamed from: setPlatformDelegate */
    public abstract void mo27615x4b18839a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004);

    /* renamed from: statusbarColor */
    public abstract com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo27616xc21c1502();

    /* renamed from: useImmediateKeyboardAnimation */
    public abstract boolean mo27617xa1e9f293();

    /* renamed from: useKeyboardCoverMode */
    public abstract boolean mo27618x5b12c70c();

    /* renamed from: usePanelModalMode */
    public abstract boolean mo27619xaefd7db3();

    /* renamed from: viewDidTransitionToNewSize */
    public abstract void mo27620x24d1b2f7();
}
