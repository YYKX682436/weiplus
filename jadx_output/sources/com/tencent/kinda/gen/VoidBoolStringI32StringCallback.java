package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class VoidBoolStringI32StringCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.VoidBoolStringI32StringCallback {
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

        private native void native_call(long j17, boolean z17, java.lang.String str, int i17, java.lang.String str2);

        @Override // com.tencent.kinda.gen.VoidBoolStringI32StringCallback
        public void call(boolean z17, java.lang.String str, int i17, java.lang.String str2) {
            native_call(this.nativeRef, z17, str, i17, str2);
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

    public abstract void call(boolean z17, java.lang.String str, int i17, java.lang.String str2);
}
