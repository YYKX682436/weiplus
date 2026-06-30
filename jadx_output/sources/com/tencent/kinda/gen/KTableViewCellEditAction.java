package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public abstract class KTableViewCellEditAction {

    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KTableViewCellEditAction {
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

        private native boolean native_getIsDestructive(long j17);

        private native java.lang.String native_getTitle(long j17);

        private native void native_triggered(long j17);

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

        @Override // com.tencent.kinda.gen.KTableViewCellEditAction
        public boolean getIsDestructive() {
            return native_getIsDestructive(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KTableViewCellEditAction
        public java.lang.String getTitle() {
            return native_getTitle(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KTableViewCellEditAction
        public void triggered() {
            native_triggered(this.nativeRef);
        }
    }

    public abstract boolean getIsDestructive();

    public abstract java.lang.String getTitle();

    public abstract void triggered();
}
