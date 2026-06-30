package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class IUIModal {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.IUIModal {
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

        private native boolean native_IsShowAndroidCenterPadding(long j17);

        private native float native_animationCutLinePosition(long j17);

        private native boolean native_forceShowInLightMode(long j17);

        private native com.tencent.kinda.gen.IUIModalPlatformFuncDelegate native_getFuncDelegate(long j17);

        private native java.lang.String native_getReportUrl(long j17);

        private native boolean native_inVisibleOnRecently(long j17);

        private native void native_keyboardWillHide(long j17);

        private native void native_keyboardWillShow(long j17, float f17);

        private native com.tencent.kinda.gen.DynamicColor native_navigationBarColor(long j17);

        private native void native_onClickAndroidBack(long j17);

        private native void native_onCreateLayout(long j17, com.tencent.kinda.gen.KViewLayout kViewLayout);

        private native void native_onDestroy(long j17);

        private native void native_onFirstRenderFinish(long j17);

        private native void native_onModalEnterBackground(long j17);

        private native void native_onModalEnterForeground(long j17);

        private native void native_setFuncDelegate(long j17, com.tencent.kinda.gen.IUIModalPlatformFuncDelegate iUIModalPlatformFuncDelegate);

        private native void native_setPlatformDelegate(long j17, com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate);

        private native com.tencent.kinda.gen.DynamicColor native_statusbarColor(long j17);

        private native boolean native_useImmediateKeyboardAnimation(long j17);

        private native boolean native_useKeyboardCoverMode(long j17);

        private native boolean native_usePanelModalMode(long j17);

        private native void native_viewDidTransitionToNewSize(long j17);

        @Override // com.tencent.kinda.gen.IUIModal
        public boolean IsShowAndroidCenterPadding() {
            return native_IsShowAndroidCenterPadding(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public float animationCutLinePosition() {
            return native_animationCutLinePosition(this.nativeRef);
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

        @Override // com.tencent.kinda.gen.IUIModal
        public boolean forceShowInLightMode() {
            return native_forceShowInLightMode(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public com.tencent.kinda.gen.IUIModalPlatformFuncDelegate getFuncDelegate() {
            return native_getFuncDelegate(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public java.lang.String getReportUrl() {
            return native_getReportUrl(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public boolean inVisibleOnRecently() {
            return native_inVisibleOnRecently(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void keyboardWillHide() {
            native_keyboardWillHide(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void keyboardWillShow(float f17) {
            native_keyboardWillShow(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public com.tencent.kinda.gen.DynamicColor navigationBarColor() {
            return native_navigationBarColor(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void onClickAndroidBack() {
            native_onClickAndroidBack(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void onCreateLayout(com.tencent.kinda.gen.KViewLayout kViewLayout) {
            native_onCreateLayout(this.nativeRef, kViewLayout);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void onDestroy() {
            native_onDestroy(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void onFirstRenderFinish() {
            native_onFirstRenderFinish(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void onModalEnterBackground() {
            native_onModalEnterBackground(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void onModalEnterForeground() {
            native_onModalEnterForeground(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void setFuncDelegate(com.tencent.kinda.gen.IUIModalPlatformFuncDelegate iUIModalPlatformFuncDelegate) {
            native_setFuncDelegate(this.nativeRef, iUIModalPlatformFuncDelegate);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void setPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate) {
            native_setPlatformDelegate(this.nativeRef, iUIPagePlatformDelegate);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public com.tencent.kinda.gen.DynamicColor statusbarColor() {
            return native_statusbarColor(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public boolean useImmediateKeyboardAnimation() {
            return native_useImmediateKeyboardAnimation(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public boolean useKeyboardCoverMode() {
            return native_useKeyboardCoverMode(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public boolean usePanelModalMode() {
            return native_usePanelModalMode(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIModal
        public void viewDidTransitionToNewSize() {
            native_viewDidTransitionToNewSize(this.nativeRef);
        }
    }

    public abstract boolean IsShowAndroidCenterPadding();

    public abstract float animationCutLinePosition();

    public abstract boolean forceShowInLightMode();

    public abstract com.tencent.kinda.gen.IUIModalPlatformFuncDelegate getFuncDelegate();

    public abstract java.lang.String getReportUrl();

    public abstract boolean inVisibleOnRecently();

    public abstract void keyboardWillHide();

    public abstract void keyboardWillShow(float f17);

    public abstract com.tencent.kinda.gen.DynamicColor navigationBarColor();

    public abstract void onClickAndroidBack();

    public abstract void onCreateLayout(com.tencent.kinda.gen.KViewLayout kViewLayout);

    public abstract void onDestroy();

    public abstract void onFirstRenderFinish();

    public abstract void onModalEnterBackground();

    public abstract void onModalEnterForeground();

    public abstract void setFuncDelegate(com.tencent.kinda.gen.IUIModalPlatformFuncDelegate iUIModalPlatformFuncDelegate);

    public abstract void setPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate);

    public abstract com.tencent.kinda.gen.DynamicColor statusbarColor();

    public abstract boolean useImmediateKeyboardAnimation();

    public abstract boolean useKeyboardCoverMode();

    public abstract boolean usePanelModalMode();

    public abstract void viewDidTransitionToNewSize();
}
