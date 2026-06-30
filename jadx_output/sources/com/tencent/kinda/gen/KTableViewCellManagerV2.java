package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public abstract class KTableViewCellManagerV2 {

    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KTableViewCellManagerV2 {
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

        private native java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellEditActionV2> native_getEditActions(long j17);

        private native com.tencent.kinda.gen.KViewLayout native_getView(long j17);

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

        @Override // com.tencent.kinda.gen.KTableViewCellManagerV2
        public java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellEditActionV2> getEditActions() {
            return native_getEditActions(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KTableViewCellManagerV2
        public com.tencent.kinda.gen.KViewLayout getView() {
            return native_getView(this.nativeRef);
        }
    }

    public abstract java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellEditActionV2> getEditActions();

    public abstract com.tencent.kinda.gen.KViewLayout getView();
}
