package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class CppUtil {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.CppUtil {
        private final java.util.concurrent.atomic.AtomicBoolean destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j17;
        }

        private native void nativeDestroy(long j17);

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

    public static native java.lang.String getFilterLog(java.lang.String str);
}
