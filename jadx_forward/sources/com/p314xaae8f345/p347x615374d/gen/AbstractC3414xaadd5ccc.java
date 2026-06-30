package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.IUIPage */
/* loaded from: classes9.dex */
public abstract class AbstractC3414xaadd5ccc {

    /* renamed from: com.tencent.kinda.gen.IUIPage$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13545x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13546x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13547xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13547xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27676x23caefe3(long j17);

        /* renamed from: native_defaultNavigationBarConfig */
        private native com.p314xaae8f345.p347x615374d.gen.C3580xf3b74561 m27677xd9b7aea8(long j17);

        /* renamed from: native_enableInteractivePop */
        private native boolean m27678x38b7879a(long j17);

        /* renamed from: native_forceShowInLightMode */
        private native boolean m27679xa95a99b4(long j17);

        /* renamed from: native_fullPageMode */
        private native boolean m27680xe6c5efa9(long j17);

        /* renamed from: native_getPlatformFuncDelegate */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 m27681x8b9504ca(long j17);

        /* renamed from: native_getReportUrl */
        private native java.lang.String m27682xe0ea240d(long j17);

        /* renamed from: native_inVisibleOnRecently */
        private native boolean m27683x17d41f6c(long j17);

        /* renamed from: native_keyboardTopView */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 m27684x38e0978b(long j17);

        /* renamed from: native_keyboardTopViewBottomMargin */
        private native float m27685x37b572e4(long j17);

        /* renamed from: native_keyboardWillHide */
        private native void m27686xd7c42c63(long j17);

        /* renamed from: native_keyboardWillShow */
        private native void m27687xd7c92a1e(long j17, float f17);

        /* renamed from: native_notify */
        private native void m27688xc7364c71(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_onBack */
        private native void m27689xc8c6348e(long j17);

        /* renamed from: native_onClickAndroidBack */
        private native void m27690x21626a75(long j17);

        /* renamed from: native_onCreate */
        private native void m27691xb2b082e3(long j17);

        /* renamed from: native_onCreateLayout */
        private native void m27692x482d73ed(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda);

        /* renamed from: native_onDestroy */
        private native void m27693xc2e4faf3(long j17);

        /* renamed from: native_onFirstLayoutFinished */
        private native void m27694xbb802e05(long j17);

        /* renamed from: native_onInvisible */
        private native void m27695xb5cb4066(long j17);

        /* renamed from: native_onPause */
        private native void m27696x50c5eb2f(long j17);

        /* renamed from: native_onResume */
        private native void m27697xcb98aa14(long j17);

        /* renamed from: native_onVisible */
        private native void m27698x81e34b6b(long j17);

        /* renamed from: native_onWillVisible */
        private native void m27699x3edffeb9(long j17);

        /* renamed from: native_setPlatformDelegate */
        private native void m27700xbadf6f72(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004);

        /* renamed from: native_setPlatformFuncDelegate */
        private native void m27701x5e833d6(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 interfaceC3417x6dcc3b68);

        /* renamed from: native_startLoading */
        private native void m27702x29999a2(long j17, java.lang.String str, boolean z17);

        /* renamed from: native_stopLoading */
        private native void m27703xf0790eb2(long j17);

        /* renamed from: native_useSafeAreaToLayout */
        private native boolean m27704x338174de(long j17);

        /* renamed from: native_viewDidTransitionToNewSize */
        private native void m27705xe47a441f(long j17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: defaultNavigationBarConfig */
        public com.p314xaae8f345.p347x615374d.gen.C3580xf3b74561 mo27647x1a0f1d80() {
            return m27677xd9b7aea8(this.f13547xc3e764fc);
        }

        /* renamed from: destroy */
        public void m27706x5cd39ffa() {
            if (this.f13546x766b9619.getAndSet(true)) {
                return;
            }
            m27676x23caefe3(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: enableInteractivePop */
        public boolean mo27648xafa0f872() {
            return m27678x38b7879a(this.f13547xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27707xd764dc1e() {
            m27706x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: forceShowInLightMode */
        public boolean mo27649x20440a8c() {
            return m27679xa95a99b4(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: fullPageMode */
        public boolean mo27650xf039b881() {
            return m27680xe6c5efa9(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: getPlatformFuncDelegate */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 mo27651x7357c4f2() {
            return m27681x8b9504ca(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: getReportUrl */
        public java.lang.String mo27652xea5dece5() {
            return m27682xe0ea240d(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: inVisibleOnRecently */
        public boolean mo27653xa80d3394() {
            return m27683x17d41f6c(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: keyboardTopView */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 mo27654x31d9ffb3() {
            return m27684x38e0978b(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: keyboardTopViewBottomMargin */
        public float mo27655x24bdf0c() {
            return m27685x37b572e4(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: keyboardWillHide */
        public void mo27656xfdf7c93b() {
            m27686xd7c42c63(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: keyboardWillShow */
        public void mo27657xfdfcc6f6(float f17) {
            m27687xd7c92a1e(this.f13547xc3e764fc, f17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: notify */
        public void mo27658xc2079749(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27688xc7364c71(this.f13547xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onBack */
        public void mo27659xc3977f66() {
            m27689xc8c6348e(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onClickAndroidBack */
        public void mo27660x8922314d() {
            m27690x21626a75(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onCreate */
        public void mo27661x3e5a77bb() {
            m27691xb2b082e3(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onCreateLayout */
        public void mo27662xc3d266c5(com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda) {
            m27692x482d73ed(this.f13547xc3e764fc, interfaceC3546x99da0cda);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onDestroy */
        public void mo27663xac79a11b() {
            m27693xc2e4faf3(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onFirstLayoutFinished */
        public void mo27664x21c4d82d() {
            m27694xbb802e05(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onInvisible */
        public void mo27665x8ccefc8e() {
            m27695xb5cb4066(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onPause */
        public void mo27666xb01dfb57() {
            m27696x50c5eb2f(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onResume */
        public void mo27667x57429eec() {
            m27697xcb98aa14(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onVisible */
        public void mo27668x6b77f193() {
            m27698x81e34b6b(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: onWillVisible */
        public void mo27669x63e550e1() {
            m27699x3edffeb9(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: setPlatformDelegate */
        public void mo27670x4b18839a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004) {
            m27700xbadf6f72(this.f13547xc3e764fc, interfaceC3416x710a1004);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: setPlatformFuncDelegate */
        public void mo27671xedaaf3fe(com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 interfaceC3417x6dcc3b68) {
            m27701x5e833d6(this.f13547xc3e764fc, interfaceC3417x6dcc3b68);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: startLoading */
        public void mo27672xc0d627a(java.lang.String str, boolean z17) {
            m27702x29999a2(this.f13547xc3e764fc, str, z17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: stopLoading */
        public void mo27673xc77ccada() {
            m27703xf0790eb2(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: useSafeAreaToLayout */
        public boolean mo27674xc3ba8906() {
            return m27704x338174de(this.f13547xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc
        /* renamed from: viewDidTransitionToNewSize */
        public void mo27675x24d1b2f7() {
            m27705xe47a441f(this.f13547xc3e764fc);
        }
    }

    /* renamed from: createAppUipage */
    public static native com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc m27646x4df6b08(java.lang.String str);

    /* renamed from: defaultNavigationBarConfig */
    public abstract com.p314xaae8f345.p347x615374d.gen.C3580xf3b74561 mo27647x1a0f1d80();

    /* renamed from: enableInteractivePop */
    public abstract boolean mo27648xafa0f872();

    /* renamed from: forceShowInLightMode */
    public abstract boolean mo27649x20440a8c();

    /* renamed from: fullPageMode */
    public abstract boolean mo27650xf039b881();

    /* renamed from: getPlatformFuncDelegate */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 mo27651x7357c4f2();

    /* renamed from: getReportUrl */
    public abstract java.lang.String mo27652xea5dece5();

    /* renamed from: inVisibleOnRecently */
    public abstract boolean mo27653xa80d3394();

    /* renamed from: keyboardTopView */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 mo27654x31d9ffb3();

    /* renamed from: keyboardTopViewBottomMargin */
    public abstract float mo27655x24bdf0c();

    /* renamed from: keyboardWillHide */
    public abstract void mo27656xfdf7c93b();

    /* renamed from: keyboardWillShow */
    public abstract void mo27657xfdfcc6f6(float f17);

    /* renamed from: notify */
    public abstract void mo27658xc2079749(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: onBack */
    public abstract void mo27659xc3977f66();

    /* renamed from: onClickAndroidBack */
    public abstract void mo27660x8922314d();

    /* renamed from: onCreate */
    public abstract void mo27661x3e5a77bb();

    /* renamed from: onCreateLayout */
    public abstract void mo27662xc3d266c5(com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda);

    /* renamed from: onDestroy */
    public abstract void mo27663xac79a11b();

    /* renamed from: onFirstLayoutFinished */
    public abstract void mo27664x21c4d82d();

    /* renamed from: onInvisible */
    public abstract void mo27665x8ccefc8e();

    /* renamed from: onPause */
    public abstract void mo27666xb01dfb57();

    /* renamed from: onResume */
    public abstract void mo27667x57429eec();

    /* renamed from: onVisible */
    public abstract void mo27668x6b77f193();

    /* renamed from: onWillVisible */
    public abstract void mo27669x63e550e1();

    /* renamed from: setPlatformDelegate */
    public abstract void mo27670x4b18839a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004);

    /* renamed from: setPlatformFuncDelegate */
    public abstract void mo27671xedaaf3fe(com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 interfaceC3417x6dcc3b68);

    /* renamed from: startLoading */
    public abstract void mo27672xc0d627a(java.lang.String str, boolean z17);

    /* renamed from: stopLoading */
    public abstract void mo27673xc77ccada();

    /* renamed from: useSafeAreaToLayout */
    public abstract boolean mo27674xc3ba8906();

    /* renamed from: viewDidTransitionToNewSize */
    public abstract void mo27675x24d1b2f7();
}
