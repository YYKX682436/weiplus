package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.JavaUploadDataSinkBase */
/* loaded from: classes16.dex */
public abstract class AbstractC29617x409fd851 extends org.p3343x72743996.net.AbstractC29562xf1e0a9e {

    /* renamed from: DEFAULT_UPLOAD_BUFFER_SIZE */
    public static final int f74750x9879de40 = 8192;

    /* renamed from: mBuffer */
    private java.nio.ByteBuffer f74751xfd47bb0d;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74752x9ec3a060;

    /* renamed from: mSinkState */
    private final java.util.concurrent.atomic.AtomicInteger f74753x271c63d1 = new java.util.concurrent.atomic.AtomicInteger(3);

    /* renamed from: mTotalBytes */
    private long f74754xb09057d4;

    /* renamed from: mUploadProvider */
    private final org.p3343x72743996.net.AbstractC29560x8cb1347c f74755xac0bf0df;

    /* renamed from: mUserUploadExecutor */
    private final java.util.concurrent.Executor f74756x32cdedec;

    /* renamed from: mWrittenBytes */
    private long f74757x8a8fdea1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.JavaUploadDataSinkBase$SinkState */
    /* loaded from: classes6.dex */
    public @interface SinkState {

        /* renamed from: AWAITING_READ_RESULT */
        public static final int f74767xc4ba5f3 = 0;

        /* renamed from: AWAITING_REWIND_RESULT */
        public static final int f74768x8f03a3ee = 1;

        /* renamed from: NOT_STARTED */
        public static final int f74769xad133ed5 = 3;

        /* renamed from: UPLOADING */
        public static final int f74770xeff34e21 = 2;
    }

    public AbstractC29617x409fd851(final java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c) {
        this.f74756x32cdedec = new java.util.concurrent.Executor() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.1
            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154254xd12fea98(e17);
                }
            }
        };
        this.f74752x9ec3a060 = executor2;
        this.f74755xac0bf0df = abstractC29560x8cb1347c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: executeOnUploadExecutor */
    public void m154246x1aba3348(org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable checkedRunnable) {
        try {
            this.f74756x32cdedec.execute(m154250x1bf9cdfc(checkedRunnable));
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            m154254xd12fea98(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startRead */
    public void m154247x81149118() {
        this.f74752x9ec3a060.execute(m154249x50c846db(new org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.3
            @Override // org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable
            public void run() {
                org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154251x7b225146();
                org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74753x271c63d1.set(0);
                org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154246x1aba3348(new org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.3.1
                    @Override // org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable
                    public void run() {
                        org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74755xac0bf0df;
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd851 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                        abstractC29560x8cb1347c.mo153655x355996(abstractC29617x409fd851, abstractC29617x409fd851.f74751xfd47bb0d);
                    }
                });
            }
        }));
    }

    /* renamed from: finish */
    public abstract void m154248xb4098c93();

    /* renamed from: getErrorSettingRunnable */
    public abstract java.lang.Runnable m154249x50c846db(org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable checkedRunnable);

    /* renamed from: getUploadErrorSettingRunnable */
    public abstract java.lang.Runnable m154250x1bf9cdfc(org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable checkedRunnable);

    /* renamed from: initializeRead */
    public abstract void m154251x7b225146();

    /* renamed from: initializeStart */
    public abstract void m154252xe93cc2b2(long j17);

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onReadError */
    public void mo153662xba5d52f3(java.lang.Exception exc) {
        m154254xd12fea98(exc);
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onReadSucceeded */
    public void mo153663xf9a6d5cc(final boolean z17) {
        if (this.f74753x271c63d1.compareAndSet(0, 2)) {
            this.f74752x9ec3a060.execute(m154249x50c846db(new org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.2
                @Override // org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable
                public void run() {
                    if (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 != -1 && org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 - org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74757x8a8fdea1 < org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74751xfd47bb0d.remaining()) {
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154254xd12fea98(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74757x8a8fdea1 + org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74751xfd47bb0d.remaining()), java.lang.Long.valueOf(org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4))));
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd851 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                    long j17 = abstractC29617x409fd851.f74757x8a8fdea1;
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd8512 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                    abstractC29617x409fd851.f74757x8a8fdea1 = j17 + abstractC29617x409fd8512.m154253xb1ac179f(abstractC29617x409fd8512.f74751xfd47bb0d);
                    if (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74757x8a8fdea1 < org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 || (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 == -1 && !z17)) {
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74753x271c63d1.set(0);
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154246x1aba3348(new org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.2.1
                            @Override // org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable
                            public void run() {
                                org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74755xac0bf0df;
                                org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd8513 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                                abstractC29560x8cb1347c.mo153655x355996(abstractC29617x409fd8513, abstractC29617x409fd8513.f74751xfd47bb0d);
                            }
                        });
                    } else if (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 == -1) {
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154248xb4098c93();
                    } else if (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 == org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74757x8a8fdea1) {
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154248xb4098c93();
                    } else {
                        org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154254xd12fea98(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74757x8a8fdea1), java.lang.Long.valueOf(org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4))));
                    }
                }
            }));
            return;
        }
        throw new java.lang.IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.f74753x271c63d1.get());
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onRewindError */
    public void mo153664xbc1ebaae(java.lang.Exception exc) {
        m154254xd12fea98(exc);
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onRewindSucceeded */
    public void mo153665xe8a7e807() {
        if (this.f74753x271c63d1.compareAndSet(1, 2)) {
            m154247x81149118();
            return;
        }
        throw new java.lang.IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.f74753x271c63d1.get());
    }

    /* renamed from: processSuccessfulRead */
    public abstract int m154253xb1ac179f(java.nio.ByteBuffer byteBuffer);

    /* renamed from: processUploadError */
    public abstract void m154254xd12fea98(java.lang.Throwable th6);

    /* renamed from: start */
    public void m154255x68ac462(final boolean z17) {
        m154246x1aba3348(new org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.4
            @Override // org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.CheckedRunnable
            public void run() {
                org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd851 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                abstractC29617x409fd851.f74754xb09057d4 = abstractC29617x409fd851.f74755xac0bf0df.mo153654x23255ddc();
                if (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 == 0) {
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154248xb4098c93();
                    return;
                }
                if (org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 <= 0 || org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74754xb09057d4 >= 8192) {
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74751xfd47bb0d = java.nio.ByteBuffer.allocateDirect(8192);
                } else {
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd8512 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                    abstractC29617x409fd8512.f74751xfd47bb0d = java.nio.ByteBuffer.allocateDirect(((int) abstractC29617x409fd8512.f74754xb09057d4) + 1);
                }
                org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851 abstractC29617x409fd8513 = org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this;
                abstractC29617x409fd8513.m154252xe93cc2b2(abstractC29617x409fd8513.f74754xb09057d4);
                if (z17) {
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.m154247x81149118();
                } else {
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74753x271c63d1.set(1);
                    org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this.f74755xac0bf0df.mo153656xc84f6cbb(org.p3343x72743996.net.p3358x316220.AbstractC29617x409fd851.this);
                }
            }
        });
    }
}
