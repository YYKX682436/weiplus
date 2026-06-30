package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class KindaGlobalReporter {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KindaGlobalReporter {
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

        private native java.lang.String native_getCppSessionId(long j17);

        private native int native_getKindaSequenceId(long j17);

        private native void native_listenSessionId(long j17, com.tencent.kinda.gen.KindaSessionIdListener kindaSessionIdListener);

        private native void native_log(long j17, com.tencent.kinda.gen.KindaLogRecord kindaLogRecord);

        private native void native_setKindaSequenceId(long j17, long j18);

        private native void native_unlistenSessionId(long j17, com.tencent.kinda.gen.KindaSessionIdListener kindaSessionIdListener);

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

        @Override // com.tencent.kinda.gen.KindaGlobalReporter
        public java.lang.String getCppSessionId() {
            return native_getCppSessionId(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KindaGlobalReporter
        public int getKindaSequenceId() {
            return native_getKindaSequenceId(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KindaGlobalReporter
        public void listenSessionId(com.tencent.kinda.gen.KindaSessionIdListener kindaSessionIdListener) {
            native_listenSessionId(this.nativeRef, kindaSessionIdListener);
        }

        @Override // com.tencent.kinda.gen.KindaGlobalReporter
        public void log(com.tencent.kinda.gen.KindaLogRecord kindaLogRecord) {
            native_log(this.nativeRef, kindaLogRecord);
        }

        @Override // com.tencent.kinda.gen.KindaGlobalReporter
        public void setKindaSequenceId(long j17) {
            native_setKindaSequenceId(this.nativeRef, j17);
        }

        @Override // com.tencent.kinda.gen.KindaGlobalReporter
        public void unlistenSessionId(com.tencent.kinda.gen.KindaSessionIdListener kindaSessionIdListener) {
            native_unlistenSessionId(this.nativeRef, kindaSessionIdListener);
        }
    }

    public static native com.tencent.kinda.gen.KindaGlobalReporter createReporter();

    public abstract java.lang.String getCppSessionId();

    public abstract int getKindaSequenceId();

    public abstract void listenSessionId(com.tencent.kinda.gen.KindaSessionIdListener kindaSessionIdListener);

    public abstract void log(com.tencent.kinda.gen.KindaLogRecord kindaLogRecord);

    public abstract void setKindaSequenceId(long j17);

    public abstract void unlistenSessionId(com.tencent.kinda.gen.KindaSessionIdListener kindaSessionIdListener);
}
