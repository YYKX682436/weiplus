package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class IUIPage {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.IUIPage {
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

        private native com.tencent.kinda.gen.NavigationBarConfig native_defaultNavigationBarConfig(long j17);

        private native boolean native_enableInteractivePop(long j17);

        private native boolean native_forceShowInLightMode(long j17);

        private native boolean native_fullPageMode(long j17);

        private native com.tencent.kinda.gen.IUIPagePlatformFuncDelegate native_getPlatformFuncDelegate(long j17);

        private native java.lang.String native_getReportUrl(long j17);

        private native boolean native_inVisibleOnRecently(long j17);

        private native com.tencent.kinda.gen.KView native_keyboardTopView(long j17);

        private native float native_keyboardTopViewBottomMargin(long j17);

        private native void native_keyboardWillHide(long j17);

        private native void native_keyboardWillShow(long j17, float f17);

        private native void native_notify(long j17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_onBack(long j17);

        private native void native_onClickAndroidBack(long j17);

        private native void native_onCreate(long j17);

        private native void native_onCreateLayout(long j17, com.tencent.kinda.gen.KViewLayout kViewLayout);

        private native void native_onDestroy(long j17);

        private native void native_onFirstLayoutFinished(long j17);

        private native void native_onInvisible(long j17);

        private native void native_onPause(long j17);

        private native void native_onResume(long j17);

        private native void native_onVisible(long j17);

        private native void native_onWillVisible(long j17);

        private native void native_setPlatformDelegate(long j17, com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate);

        private native void native_setPlatformFuncDelegate(long j17, com.tencent.kinda.gen.IUIPagePlatformFuncDelegate iUIPagePlatformFuncDelegate);

        private native void native_startLoading(long j17, java.lang.String str, boolean z17);

        private native void native_stopLoading(long j17);

        private native boolean native_useSafeAreaToLayout(long j17);

        private native void native_viewDidTransitionToNewSize(long j17);

        @Override // com.tencent.kinda.gen.IUIPage
        public com.tencent.kinda.gen.NavigationBarConfig defaultNavigationBarConfig() {
            return native_defaultNavigationBarConfig(this.nativeRef);
        }

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public boolean enableInteractivePop() {
            return native_enableInteractivePop(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public boolean forceShowInLightMode() {
            return native_forceShowInLightMode(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public boolean fullPageMode() {
            return native_fullPageMode(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public com.tencent.kinda.gen.IUIPagePlatformFuncDelegate getPlatformFuncDelegate() {
            return native_getPlatformFuncDelegate(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public java.lang.String getReportUrl() {
            return native_getReportUrl(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public boolean inVisibleOnRecently() {
            return native_inVisibleOnRecently(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public com.tencent.kinda.gen.KView keyboardTopView() {
            return native_keyboardTopView(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public float keyboardTopViewBottomMargin() {
            return native_keyboardTopViewBottomMargin(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void keyboardWillHide() {
            native_keyboardWillHide(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void keyboardWillShow(float f17) {
            native_keyboardWillShow(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void notify(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_notify(this.nativeRef, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onBack() {
            native_onBack(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onClickAndroidBack() {
            native_onClickAndroidBack(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onCreate() {
            native_onCreate(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onCreateLayout(com.tencent.kinda.gen.KViewLayout kViewLayout) {
            native_onCreateLayout(this.nativeRef, kViewLayout);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onDestroy() {
            native_onDestroy(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onFirstLayoutFinished() {
            native_onFirstLayoutFinished(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onInvisible() {
            native_onInvisible(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onPause() {
            native_onPause(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onResume() {
            native_onResume(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onVisible() {
            native_onVisible(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void onWillVisible() {
            native_onWillVisible(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void setPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate) {
            native_setPlatformDelegate(this.nativeRef, iUIPagePlatformDelegate);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void setPlatformFuncDelegate(com.tencent.kinda.gen.IUIPagePlatformFuncDelegate iUIPagePlatformFuncDelegate) {
            native_setPlatformFuncDelegate(this.nativeRef, iUIPagePlatformFuncDelegate);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void startLoading(java.lang.String str, boolean z17) {
            native_startLoading(this.nativeRef, str, z17);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void stopLoading() {
            native_stopLoading(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public boolean useSafeAreaToLayout() {
            return native_useSafeAreaToLayout(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IUIPage
        public void viewDidTransitionToNewSize() {
            native_viewDidTransitionToNewSize(this.nativeRef);
        }
    }

    public static native com.tencent.kinda.gen.IUIPage createAppUipage(java.lang.String str);

    public abstract com.tencent.kinda.gen.NavigationBarConfig defaultNavigationBarConfig();

    public abstract boolean enableInteractivePop();

    public abstract boolean forceShowInLightMode();

    public abstract boolean fullPageMode();

    public abstract com.tencent.kinda.gen.IUIPagePlatformFuncDelegate getPlatformFuncDelegate();

    public abstract java.lang.String getReportUrl();

    public abstract boolean inVisibleOnRecently();

    public abstract com.tencent.kinda.gen.KView keyboardTopView();

    public abstract float keyboardTopViewBottomMargin();

    public abstract void keyboardWillHide();

    public abstract void keyboardWillShow(float f17);

    public abstract void notify(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void onBack();

    public abstract void onClickAndroidBack();

    public abstract void onCreate();

    public abstract void onCreateLayout(com.tencent.kinda.gen.KViewLayout kViewLayout);

    public abstract void onDestroy();

    public abstract void onFirstLayoutFinished();

    public abstract void onInvisible();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onVisible();

    public abstract void onWillVisible();

    public abstract void setPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate);

    public abstract void setPlatformFuncDelegate(com.tencent.kinda.gen.IUIPagePlatformFuncDelegate iUIPagePlatformFuncDelegate);

    public abstract void startLoading(java.lang.String str, boolean z17);

    public abstract void stopLoading();

    public abstract boolean useSafeAreaToLayout();

    public abstract void viewDidTransitionToNewSize();
}
