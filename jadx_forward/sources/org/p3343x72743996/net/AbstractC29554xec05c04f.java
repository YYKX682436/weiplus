package org.p3343x72743996.net;

/* renamed from: org.chromium.net.RequestFinishedInfo */
/* loaded from: classes16.dex */
public abstract class AbstractC29554xec05c04f {

    /* renamed from: CANCELED */
    public static final int f74301x274e7499 = 2;

    /* renamed from: FAILED */
    public static final int f74302x7b29883d = 1;

    /* renamed from: SUCCEEDED */
    public static final int f74303xde76d241 = 0;

    /* renamed from: org.chromium.net.RequestFinishedInfo$Listener */
    /* loaded from: classes16.dex */
    public static abstract class Listener {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f74304x9ec3a060;

        public Listener(java.util.concurrent.Executor executor) {
            if (executor == null) {
                throw new java.lang.IllegalStateException("Executor must not be null");
            }
            this.f74304x9ec3a060 = executor;
        }

        /* renamed from: getExecutor */
        public java.util.concurrent.Executor mo153632xf5a03649() {
            return this.f74304x9ec3a060;
        }

        /* renamed from: onRequestFinished */
        public abstract void mo153633x1d116842(org.p3343x72743996.net.AbstractC29554xec05c04f abstractC29554xec05c04f);
    }

    /* renamed from: org.chromium.net.RequestFinishedInfo$Metrics */
    /* loaded from: classes16.dex */
    public static abstract class Metrics {
        /* renamed from: getConnectEnd */
        public abstract java.util.Date mo153634xc004af87();

        /* renamed from: getConnectStart */
        public abstract java.util.Date mo153635xd25ef00e();

        /* renamed from: getDnsEnd */
        public abstract java.util.Date mo153636x15ff31e8();

        /* renamed from: getDnsStart */
        public abstract java.util.Date mo153637x93c25e2f();

        /* renamed from: getPushEnd */
        public abstract java.util.Date mo153638x30b30f2b();

        /* renamed from: getPushStart */
        public abstract java.util.Date mo153639xd0f3f6b2();

        /* renamed from: getReceivedByteCount */
        public abstract java.lang.Long mo153640x9feeaf50();

        /* renamed from: getRequestEnd */
        public abstract java.util.Date mo153641xf07697c2();

        /* renamed from: getRequestStart */
        public abstract java.util.Date mo153642xadf7b589();

        /* renamed from: getResponseStart */
        public abstract java.util.Date mo153643x20a7fceb();

        /* renamed from: getSendingEnd */
        public abstract java.util.Date mo153644x30599717();

        /* renamed from: getSendingStart */
        public abstract java.util.Date mo153645x8118339e();

        /* renamed from: getSentByteCount */
        public abstract java.lang.Long mo153646x92817c79();

        /* renamed from: getSocketReused */
        public abstract boolean mo153647x5bc7a439();

        /* renamed from: getSslEnd */
        public abstract java.util.Date mo153648x2fdb2a25();

        /* renamed from: getSslStart */
        public abstract java.util.Date mo153649xa6813b2c();

        /* renamed from: getTotalTimeMs */
        public abstract java.lang.Long mo153650xaf166881();

        /* renamed from: getTtfbMs */
        public abstract java.lang.Long mo153651x319bc8f8();
    }

    /* renamed from: getAnnotations */
    public abstract java.util.Collection<java.lang.Object> mo153626xa083c1ee();

    /* renamed from: getException */
    public abstract org.p3343x72743996.net.AbstractC29501x119930f2 mo153627x57bd4199();

    /* renamed from: getFinishedReason */
    public abstract int mo153628x51116e4c();

    /* renamed from: getMetrics */
    public abstract org.p3343x72743996.net.AbstractC29554xec05c04f.Metrics mo153629x76c5fc8d();

    /* renamed from: getResponseInfo */
    public abstract org.p3343x72743996.net.AbstractC29564x6974077e mo153630xb6b67705();

    /* renamed from: getUrl */
    public abstract java.lang.String mo153631xb5887639();
}
