package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class VoidStringStringStringCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.VoidStringStringStringCallback {
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

        private native void native_call(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

        @Override // com.tencent.kinda.gen.VoidStringStringStringCallback
        public void call(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            native_call(this.nativeRef, str, str2, str3);
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
    }

    public abstract void call(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
