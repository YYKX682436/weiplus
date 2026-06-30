package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class KViewOnClickCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KViewOnClickCallback {
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

        private native void native_onClick(long j17, com.tencent.kinda.gen.KView kView);

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

        @Override // com.tencent.kinda.gen.KViewOnClickCallback
        public void onClick(com.tencent.kinda.gen.KView kView) {
            native_onClick(this.nativeRef, kView);
        }
    }

    public abstract void onClick(com.tencent.kinda.gen.KView kView);
}
