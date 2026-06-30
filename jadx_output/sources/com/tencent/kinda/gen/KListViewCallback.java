package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public abstract class KListViewCallback {

    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KListViewCallback {
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

        private native com.tencent.kinda.gen.KView native_fillData(long j17, int i17, com.tencent.kinda.gen.KViewLayout kViewLayout);

        private native int native_getCount(long j17);

        private native int native_getViewType(long j17, int i17);

        private native int native_getViewTypeCount(long j17);

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KListViewCallback
        public com.tencent.kinda.gen.KView fillData(int i17, com.tencent.kinda.gen.KViewLayout kViewLayout) {
            return native_fillData(this.nativeRef, i17, kViewLayout);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.kinda.gen.KListViewCallback
        public int getCount() {
            return native_getCount(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KListViewCallback
        public int getViewType(int i17) {
            return native_getViewType(this.nativeRef, i17);
        }

        @Override // com.tencent.kinda.gen.KListViewCallback
        public int getViewTypeCount() {
            return native_getViewTypeCount(this.nativeRef);
        }
    }

    public abstract com.tencent.kinda.gen.KView fillData(int i17, com.tencent.kinda.gen.KViewLayout kViewLayout);

    public abstract int getCount();

    public abstract int getViewType(int i17);

    public abstract int getViewTypeCount();
}
