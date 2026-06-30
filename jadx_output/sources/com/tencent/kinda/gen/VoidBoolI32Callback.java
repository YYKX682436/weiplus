package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class VoidBoolI32Callback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.VoidBoolI32Callback {
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

        private native void native_call(long j17, boolean z17, int i17);

        @Override // com.tencent.kinda.gen.VoidBoolI32Callback
        public void call(boolean z17, int i17) {
            native_call(this.nativeRef, z17, i17);
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

    public abstract void call(boolean z17, int i17);
}
