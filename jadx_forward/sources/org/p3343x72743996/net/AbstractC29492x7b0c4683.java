package org.p3343x72743996.net;

/* renamed from: org.chromium.net.BidirectionalStream */
/* loaded from: classes16.dex */
public abstract class AbstractC29492x7b0c4683 {

    /* renamed from: org.chromium.net.BidirectionalStream$Builder */
    /* loaded from: classes16.dex */
    public static abstract class Builder {

        /* renamed from: STREAM_PRIORITY_HIGHEST */
        public static final int f73689xc73977c8 = 4;

        /* renamed from: STREAM_PRIORITY_IDLE */
        public static final int f73690x55dce310 = 0;

        /* renamed from: STREAM_PRIORITY_LOW */
        public static final int f73691x86e62478 = 2;

        /* renamed from: STREAM_PRIORITY_LOWEST */
        public static final int f73692x57eef5ee = 1;

        /* renamed from: STREAM_PRIORITY_MEDIUM */
        public static final int f73693x590e4fb1 = 3;

        /* renamed from: addHeader */
        public abstract org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153102xec6c8a8e(java.lang.String str, java.lang.String str2);

        /* renamed from: addRequestAnnotation */
        public org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153103xbd4b107d(java.lang.Object obj) {
            return this;
        }

        /* renamed from: bindToNetwork */
        public org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153104x5f2b2376(long j17) {
            return this;
        }

        /* renamed from: build */
        public abstract org.p3343x72743996.net.AbstractC29492x7b0c4683 mo153105x59bc66e();

        /* renamed from: delayRequestHeadersUntilFirstFlush */
        public abstract org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153106xa75d5278(boolean z17);

        /* renamed from: setHttpMethod */
        public abstract org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153107x492a458b(java.lang.String str);

        /* renamed from: setPriority */
        public abstract org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153108x311b1826(int i17);

        /* renamed from: setTrafficStatsTag */
        public org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153109x5fdeed6(int i17) {
            return this;
        }

        /* renamed from: setTrafficStatsUid */
        public org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153110x5fdf38c(int i17) {
            return this;
        }
    }

    /* renamed from: org.chromium.net.BidirectionalStream$Callback */
    /* loaded from: classes16.dex */
    public static abstract class Callback {
        /* renamed from: onCanceled */
        public void mo153111x9dc2a798(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        }

        /* renamed from: onFailed */
        public abstract void mo153112x428b6afc(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2);

        /* renamed from: onReadCompleted */
        public abstract void mo153113x6da909b6(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer, boolean z17);

        /* renamed from: onResponseHeadersReceived */
        public abstract void mo153114x6c4f027(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);

        /* renamed from: onResponseTrailersReceived */
        public void mo153115x1c98bb01(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29564x6974077e.HeaderBlock headerBlock) {
        }

        /* renamed from: onStreamReady */
        public abstract void mo153116x7cd1d2a4(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683);

        /* renamed from: onSucceeded */
        public abstract void mo153117x3688ff42(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);

        /* renamed from: onWriteCompleted */
        public abstract void mo153118x8789d0eb(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer, boolean z17);
    }

    /* renamed from: cancel */
    public abstract void mo153096xae7a2e7a();

    /* renamed from: flush */
    public abstract void mo153097x5d03b04();

    /* renamed from: isDone */
    public abstract boolean mo153098xb9a1ffcc();

    /* renamed from: read */
    public abstract void mo153099x355996(java.nio.ByteBuffer byteBuffer);

    /* renamed from: start */
    public abstract void mo153100x68ac462();

    /* renamed from: write */
    public abstract void mo153101x6c257df(java.nio.ByteBuffer byteBuffer, boolean z17);
}
