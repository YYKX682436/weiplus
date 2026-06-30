package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class VoidBoolOptionCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.VoidBoolOptionCallback {
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

        private native void native_call(long j17, boolean z17, com.tencent.kinda.gen.Option option);

        @Override // com.tencent.kinda.gen.VoidBoolOptionCallback
        public void call(boolean z17, com.tencent.kinda.gen.Option option) {
            native_call(this.nativeRef, z17, option);
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

    public abstract void call(boolean z17, com.tencent.kinda.gen.Option option);
}
