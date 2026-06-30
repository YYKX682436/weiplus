package org.p3343x72743996.net;

/* renamed from: org.chromium.net.NetworkQualityThroughputListener */
/* loaded from: classes16.dex */
public abstract class AbstractC29538x763be9ef {

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74208x9ec3a060;

    public AbstractC29538x763be9ef(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.IllegalStateException("Executor must not be null");
        }
        this.f74208x9ec3a060 = executor;
    }

    /* renamed from: getExecutor */
    public java.util.concurrent.Executor mo153439xf5a03649() {
        return this.f74208x9ec3a060;
    }

    /* renamed from: onThroughputObservation */
    public abstract void mo153440xe09b5f03(int i17, long j17, int i18);
}
