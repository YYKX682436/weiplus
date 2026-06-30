package org.p3343x72743996.net;

/* renamed from: org.chromium.net.NetworkQualityRttListener */
/* loaded from: classes16.dex */
public abstract class AbstractC29537x1d237975 {

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74207x9ec3a060;

    public AbstractC29537x1d237975(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.IllegalStateException("Executor must not be null");
        }
        this.f74207x9ec3a060 = executor;
    }

    /* renamed from: getExecutor */
    public java.util.concurrent.Executor mo153437xf5a03649() {
        return this.f74207x9ec3a060;
    }

    /* renamed from: onRttObservation */
    public abstract void mo153438xbe23d219(int i17, long j17, int i18);
}
