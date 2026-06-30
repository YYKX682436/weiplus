package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class KCardTypePickerViewOnSelectCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback {
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

        private native void native_onSelect(long j17, int i17);

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

        @Override // com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback
        public void onSelect(int i17) {
            native_onSelect(this.nativeRef, i17);
        }
    }

    public abstract void onSelect(int i17);
}
