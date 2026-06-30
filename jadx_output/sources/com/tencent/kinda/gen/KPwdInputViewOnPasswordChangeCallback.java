package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class KPwdInputViewOnPasswordChangeCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback {
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

        private native void native_onPasswordChange(long j17, int i17, java.lang.String str, java.lang.String str2);

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

        @Override // com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback
        public void onPasswordChange(int i17, java.lang.String str, java.lang.String str2) {
            native_onPasswordChange(this.nativeRef, i17, str, str2);
        }
    }

    public abstract void onPasswordChange(int i17, java.lang.String str, java.lang.String str2);
}
