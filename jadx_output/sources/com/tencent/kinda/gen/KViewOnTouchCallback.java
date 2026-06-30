package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public abstract class KViewOnTouchCallback {

    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KViewOnTouchCallback {
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

        private native void native_onTouch(long j17, com.tencent.kinda.gen.TouchEvent touchEvent);

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

        @Override // com.tencent.kinda.gen.KViewOnTouchCallback
        public void onTouch(com.tencent.kinda.gen.TouchEvent touchEvent) {
            native_onTouch(this.nativeRef, touchEvent);
        }
    }

    public abstract void onTouch(com.tencent.kinda.gen.TouchEvent touchEvent);
}
