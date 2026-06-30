package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.IAppKinda */
/* loaded from: classes9.dex */
public abstract class AbstractC3403x8fdb0515 {

    /* renamed from: com.tencent.kinda.gen.IAppKinda$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13526x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13527x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13528xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13528xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27501x23caefe3(long j17);

        /* renamed from: native_applicationBecomeActive */
        private native void m27502xc157bcf5(long j17);

        /* renamed from: native_applicationEnterBackground */
        private native void m27503x349683de(long j17);

        /* renamed from: native_applicationEnterForeground */
        private native void m27504xfa4697f3(long j17);

        /* renamed from: native_applicationReceiveMemoryWarning */
        private native void m27505x235b3680(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_applicationResignActive */
        private native void m27506x743f92de(long j17);

        /* renamed from: native_applicationRestart */
        private native void m27507xfbfdcfc7(long j17);

        /* renamed from: native_applicationWillTerminate */
        private native void m27508x2e2de267(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_checkIfNeedRequestUserBindqueryWhenUnBindCard */
        private native void m27509x39c94a64(long j17, java.lang.String str);

        /* renamed from: native_checkIfNeedUpdateOfflinePayToken */
        private native void m27510x76168498(long j17);

        /* renamed from: native_checkOfflineReady */
        private native boolean m27511x4e350080(long j17);

        /* renamed from: native_getIsPaying */
        private native boolean m27512x91b1b952(long j17);

        /* renamed from: native_getUseCaseInStack */
        private native com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 m27513xab0e21da(long j17, java.lang.String str);

        /* renamed from: native_getUseCaseInStackWithData */
        private native com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 m27514x9d644d8a(long j17, java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_isInAnyUseCase */
        private native boolean m27515xa8f57442(long j17);

        /* renamed from: native_isUseCaseAlive */
        private native boolean m27516xbca84d28(long j17, java.lang.String str);

        /* renamed from: native_networkChange */
        private native void m27517x868b2d56(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_notifyAllUseCases */
        private native void m27518x38e0198c(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_notifyHKOfflineNewXml */
        private native void m27519x60d5d546(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_notifyOnManualAuthOK */
        private native void m27520x86ca0f3a(long j17);

        /* renamed from: native_notifyScreenCapture */
        private native void m27521x4e33f049(long j17);

        /* renamed from: native_popToUseCase */
        private native void m27522xcf04a233(long j17, java.lang.String str);

        /* renamed from: native_startUseCase */
        private native com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 m27523xe5ae51bd(long j17, java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c);

        /* renamed from: native_stopUseCase */
        private native void m27524xd38dc6cd(long j17, java.lang.String str);

        /* renamed from: native_takeScreenshot */
        private native void m27525x8ff9e675(long j17);

        /* renamed from: native_updateOfflinePayDefaultCard */
        private native void m27526x6b85be7b(long j17, java.lang.String str, java.lang.String str2);

        /* renamed from: native_updateOfflinePayTokenWithScene */
        private native void m27527x45faaba3(long j17, int i17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationBecomeActive */
        public void mo27475xa91a7d1d() {
            m27502xc157bcf5(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationEnterBackground */
        public void mo27476x74edf2b6() {
            m27503x349683de(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationEnterForeground */
        public void mo27477x3a9e06cb() {
            m27504xfa4697f3(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationReceiveMemoryWarning */
        public void mo27478xa70f4ea8(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27505x235b3680(this.f13528xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationResignActive */
        public void mo27479x5c025306() {
            m27506x743f92de(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationRestart */
        public void mo27480x63bd969f() {
            m27507xfbfdcfc7(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: applicationWillTerminate */
        public void mo27481x3ec3273f(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27508x2e2de267(this.f13528xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: checkIfNeedRequestUserBindqueryWhenUnBindCard */
        public void mo27482xcebbfc8c(java.lang.String str) {
            m27509x39c94a64(this.f13528xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: checkIfNeedUpdateOfflinePayToken */
        public void mo27483x68e57170() {
            m27510x76168498(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: checkOfflineReady */
        public boolean mo27484xee74fea8() {
            return m27511x4e350080(this.f13528xc3e764fc);
        }

        /* renamed from: destroy */
        public void m27528x5cd39ffa() {
            if (this.f13527x766b9619.getAndSet(true)) {
                return;
            }
            m27501x23caefe3(this.f13528xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27529xd764dc1e() {
            m27528x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: getIsPaying */
        public boolean mo27485x68b5757a() {
            return m27512x91b1b952(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: getUseCaseInStack */
        public com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27486x4b4e2002(java.lang.String str) {
            return m27513xab0e21da(this.f13528xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: getUseCaseInStackWithData */
        public com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27487x9f77a3b2(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            return m27514x9d644d8a(this.f13528xc3e764fc, str, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: isInAnyUseCase */
        public boolean mo27488x249a671a() {
            return m27515xa8f57442(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: isUseCaseAlive */
        public boolean mo27489x384d4000(java.lang.String str) {
            return m27516xbca84d28(this.f13528xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: networkChange */
        public void mo27490xab907f7e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27517x868b2d56(this.f13528xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: notifyAllUseCases */
        public void mo27491xd92017b4(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27518x38e0198c(this.f13528xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: notifyHKOfflineNewXml */
        public void mo27492xc71a7f6e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27519x60d5d546(this.f13528xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: notifyOnManualAuthOK */
        public void mo27493xfdb38012() {
            m27520x86ca0f3a(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: notifyScreenCapture */
        public void mo27494xde6d0471() {
            m27521x4e33f049(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: popToUseCase */
        public void mo27495xd8786b0b(java.lang.String str) {
            m27522xcf04a233(this.f13528xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: startUseCase */
        public com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27496xef221a95(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c) {
            return m27523xe5ae51bd(this.f13528xc3e764fc, str, abstractC3411xcfaed72e, interfaceC3614x9e78e9c);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: stopUseCase */
        public void mo27497xaa9182f5(java.lang.String str) {
            m27524xd38dc6cd(this.f13528xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: takeScreenshot */
        public void mo27498xb9ed94d() {
            m27525x8ff9e675(this.f13528xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: updateOfflinePayDefaultCard */
        public void mo27499x361c2aa3(java.lang.String str, java.lang.String str2) {
            m27526x6b85be7b(this.f13528xc3e764fc, str, str2);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515
        /* renamed from: updateOfflinePayTokenWithScene */
        public void mo27500x9cceee7b(int i17) {
            m27527x45faaba3(this.f13528xc3e764fc, i17);
        }
    }

    /* renamed from: getInstance */
    public static native com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515 m27474x9cf0d20b();

    /* renamed from: applicationBecomeActive */
    public abstract void mo27475xa91a7d1d();

    /* renamed from: applicationEnterBackground */
    public abstract void mo27476x74edf2b6();

    /* renamed from: applicationEnterForeground */
    public abstract void mo27477x3a9e06cb();

    /* renamed from: applicationReceiveMemoryWarning */
    public abstract void mo27478xa70f4ea8(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: applicationResignActive */
    public abstract void mo27479x5c025306();

    /* renamed from: applicationRestart */
    public abstract void mo27480x63bd969f();

    /* renamed from: applicationWillTerminate */
    public abstract void mo27481x3ec3273f(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: checkIfNeedRequestUserBindqueryWhenUnBindCard */
    public abstract void mo27482xcebbfc8c(java.lang.String str);

    /* renamed from: checkIfNeedUpdateOfflinePayToken */
    public abstract void mo27483x68e57170();

    /* renamed from: checkOfflineReady */
    public abstract boolean mo27484xee74fea8();

    /* renamed from: getIsPaying */
    public abstract boolean mo27485x68b5757a();

    /* renamed from: getUseCaseInStack */
    public abstract com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27486x4b4e2002(java.lang.String str);

    /* renamed from: getUseCaseInStackWithData */
    public abstract com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27487x9f77a3b2(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: isInAnyUseCase */
    public abstract boolean mo27488x249a671a();

    /* renamed from: isUseCaseAlive */
    public abstract boolean mo27489x384d4000(java.lang.String str);

    /* renamed from: networkChange */
    public abstract void mo27490xab907f7e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: notifyAllUseCases */
    public abstract void mo27491xd92017b4(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: notifyHKOfflineNewXml */
    public abstract void mo27492xc71a7f6e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: notifyOnManualAuthOK */
    public abstract void mo27493xfdb38012();

    /* renamed from: notifyScreenCapture */
    public abstract void mo27494xde6d0471();

    /* renamed from: popToUseCase */
    public abstract void mo27495xd8786b0b(java.lang.String str);

    /* renamed from: startUseCase */
    public abstract com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27496xef221a95(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c);

    /* renamed from: stopUseCase */
    public abstract void mo27497xaa9182f5(java.lang.String str);

    /* renamed from: takeScreenshot */
    public abstract void mo27498xb9ed94d();

    /* renamed from: updateOfflinePayDefaultCard */
    public abstract void mo27499x361c2aa3(java.lang.String str, java.lang.String str2);

    /* renamed from: updateOfflinePayTokenWithScene */
    public abstract void mo27500x9cceee7b(int i17);
}
