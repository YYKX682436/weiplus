package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class IAppKinda {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.IAppKinda {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.concurrent.atomic.AtomicBoolean destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j17;
        }

        private native void nativeDestroy(long j17);

        private native void native_applicationBecomeActive(long j17);

        private native void native_applicationEnterBackground(long j17);

        private native void native_applicationEnterForeground(long j17);

        private native void native_applicationReceiveMemoryWarning(long j17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_applicationResignActive(long j17);

        private native void native_applicationRestart(long j17);

        private native void native_applicationWillTerminate(long j17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_checkIfNeedRequestUserBindqueryWhenUnBindCard(long j17, java.lang.String str);

        private native void native_checkIfNeedUpdateOfflinePayToken(long j17);

        private native boolean native_checkOfflineReady(long j17);

        private native boolean native_getIsPaying(long j17);

        private native com.tencent.kinda.gen.UseCase native_getUseCaseInStack(long j17, java.lang.String str);

        private native com.tencent.kinda.gen.UseCase native_getUseCaseInStackWithData(long j17, java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native boolean native_isInAnyUseCase(long j17);

        private native boolean native_isUseCaseAlive(long j17, java.lang.String str);

        private native void native_networkChange(long j17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_notifyAllUseCases(long j17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_notifyHKOfflineNewXml(long j17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_notifyOnManualAuthOK(long j17);

        private native void native_notifyScreenCapture(long j17);

        private native void native_popToUseCase(long j17, java.lang.String str);

        private native com.tencent.kinda.gen.UseCase native_startUseCase(long j17, java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.UseCaseCallback useCaseCallback);

        private native void native_stopUseCase(long j17, java.lang.String str);

        private native void native_takeScreenshot(long j17);

        private native void native_updateOfflinePayDefaultCard(long j17, java.lang.String str, java.lang.String str2);

        private native void native_updateOfflinePayTokenWithScene(long j17, int i17);

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationBecomeActive() {
            native_applicationBecomeActive(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationEnterBackground() {
            native_applicationEnterBackground(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationEnterForeground() {
            native_applicationEnterForeground(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationReceiveMemoryWarning(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_applicationReceiveMemoryWarning(this.nativeRef, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationResignActive() {
            native_applicationResignActive(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationRestart() {
            native_applicationRestart(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void applicationWillTerminate(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_applicationWillTerminate(this.nativeRef, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void checkIfNeedRequestUserBindqueryWhenUnBindCard(java.lang.String str) {
            native_checkIfNeedRequestUserBindqueryWhenUnBindCard(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void checkIfNeedUpdateOfflinePayToken() {
            native_checkIfNeedUpdateOfflinePayToken(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public boolean checkOfflineReady() {
            return native_checkOfflineReady(this.nativeRef);
        }

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public boolean getIsPaying() {
            return native_getIsPaying(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public com.tencent.kinda.gen.UseCase getUseCaseInStack(java.lang.String str) {
            return native_getUseCaseInStack(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public com.tencent.kinda.gen.UseCase getUseCaseInStackWithData(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            return native_getUseCaseInStackWithData(this.nativeRef, str, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public boolean isInAnyUseCase() {
            return native_isInAnyUseCase(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public boolean isUseCaseAlive(java.lang.String str) {
            return native_isUseCaseAlive(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void networkChange(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_networkChange(this.nativeRef, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void notifyAllUseCases(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_notifyAllUseCases(this.nativeRef, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void notifyHKOfflineNewXml(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_notifyHKOfflineNewXml(this.nativeRef, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void notifyOnManualAuthOK() {
            native_notifyOnManualAuthOK(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void notifyScreenCapture() {
            native_notifyScreenCapture(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void popToUseCase(java.lang.String str) {
            native_popToUseCase(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public com.tencent.kinda.gen.UseCase startUseCase(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.UseCaseCallback useCaseCallback) {
            return native_startUseCase(this.nativeRef, str, iTransmitKvData, useCaseCallback);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void stopUseCase(java.lang.String str) {
            native_stopUseCase(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void takeScreenshot() {
            native_takeScreenshot(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void updateOfflinePayDefaultCard(java.lang.String str, java.lang.String str2) {
            native_updateOfflinePayDefaultCard(this.nativeRef, str, str2);
        }

        @Override // com.tencent.kinda.gen.IAppKinda
        public void updateOfflinePayTokenWithScene(int i17) {
            native_updateOfflinePayTokenWithScene(this.nativeRef, i17);
        }
    }

    public static native com.tencent.kinda.gen.IAppKinda getInstance();

    public abstract void applicationBecomeActive();

    public abstract void applicationEnterBackground();

    public abstract void applicationEnterForeground();

    public abstract void applicationReceiveMemoryWarning(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void applicationResignActive();

    public abstract void applicationRestart();

    public abstract void applicationWillTerminate(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void checkIfNeedRequestUserBindqueryWhenUnBindCard(java.lang.String str);

    public abstract void checkIfNeedUpdateOfflinePayToken();

    public abstract boolean checkOfflineReady();

    public abstract boolean getIsPaying();

    public abstract com.tencent.kinda.gen.UseCase getUseCaseInStack(java.lang.String str);

    public abstract com.tencent.kinda.gen.UseCase getUseCaseInStackWithData(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract boolean isInAnyUseCase();

    public abstract boolean isUseCaseAlive(java.lang.String str);

    public abstract void networkChange(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void notifyAllUseCases(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void notifyHKOfflineNewXml(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void notifyOnManualAuthOK();

    public abstract void notifyScreenCapture();

    public abstract void popToUseCase(java.lang.String str);

    public abstract com.tencent.kinda.gen.UseCase startUseCase(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.UseCaseCallback useCaseCallback);

    public abstract void stopUseCase(java.lang.String str);

    public abstract void takeScreenshot();

    public abstract void updateOfflinePayDefaultCard(java.lang.String str, java.lang.String str2);

    public abstract void updateOfflinePayTokenWithScene(int i17);
}
