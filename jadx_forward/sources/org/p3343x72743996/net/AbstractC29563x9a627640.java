package org.p3343x72743996.net;

/* renamed from: org.chromium.net.UrlRequest */
/* loaded from: classes7.dex */
public abstract class AbstractC29563x9a627640 {

    /* renamed from: org.chromium.net.UrlRequest$Builder */
    /* loaded from: classes13.dex */
    public static abstract class Builder {

        /* renamed from: REQUEST_PRIORITY_HIGHEST */
        public static final int f74318xd93498b9 = 4;

        /* renamed from: REQUEST_PRIORITY_IDLE */
        public static final int f74319xe9f9cfbf = 0;

        /* renamed from: REQUEST_PRIORITY_LOW */
        public static final int f74320x9c3165e9 = 2;

        /* renamed from: REQUEST_PRIORITY_LOWEST */
        public static final int f74321x588372dd = 1;

        /* renamed from: REQUEST_PRIORITY_MEDIUM */
        public static final int f74322x59a2cca0 = 3;

        /* renamed from: addHeader */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153266xec6c8a8e(java.lang.String str, java.lang.String str2);

        /* renamed from: addRequestAnnotation */
        public org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153267xbd4b107d(java.lang.Object obj) {
            return this;
        }

        /* renamed from: allowDirectExecutor */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153268x99087b85();

        /* renamed from: bindToNetwork */
        public org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153672x5f2b2376(long j17) {
            return this;
        }

        /* renamed from: build */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640 mo153269x59bc66e();

        /* renamed from: disableCache */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153270xc3a92d7a();

        /* renamed from: setHttpMethod */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153272x492a458b(java.lang.String str);

        /* renamed from: setPriority */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153274x311b1826(int i17);

        /* renamed from: setRequestFinishedListener */
        public org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153275x69abdd33(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
            return this;
        }

        /* renamed from: setTrafficStatsTag */
        public org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153276x5fdeed6(int i17) {
            return this;
        }

        /* renamed from: setTrafficStatsUid */
        public org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153277x5fdf38c(int i17) {
            return this;
        }

        /* renamed from: setUploadDataProvider */
        public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153278xc9755c5e(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c, java.util.concurrent.Executor executor);
    }

    /* renamed from: org.chromium.net.UrlRequest$Callback */
    /* loaded from: classes16.dex */
    public static abstract class Callback {
        /* renamed from: onCanceled */
        public void mo153673x9dc2a798(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        }

        /* renamed from: onFailed */
        public abstract void mo153674x428b6afc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2);

        /* renamed from: onReadCompleted */
        public abstract void mo153675x6da909b6(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer);

        /* renamed from: onRedirectReceived */
        public abstract void mo153676x4d4e5ddc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str);

        /* renamed from: onResponseStarted */
        public abstract void mo153677x5d21f921(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);

        /* renamed from: onSucceeded */
        public abstract void mo153678x3688ff42(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);
    }

    /* renamed from: org.chromium.net.UrlRequest$Status */
    /* loaded from: classes16.dex */
    public static class Status {

        /* renamed from: CONNECTING */
        public static final int f74323xeeae6ab8 = 10;

        /* renamed from: DOWNLOADING_PAC_FILE */
        public static final int f74324x77a5c58e = 5;

        /* renamed from: ESTABLISHING_PROXY_TUNNEL */
        public static final int f74325x8a5063ef = 8;

        /* renamed from: IDLE */
        public static final int f74326x2237d4 = 0;

        /* renamed from: INVALID */
        public static final int f74327x9f9b7dd7 = -1;

        /* renamed from: READING_RESPONSE */
        public static final int f74328x9c71d4b4 = 14;

        /* renamed from: RESOLVING_HOST */
        public static final int f74329xa432909e = 9;

        /* renamed from: RESOLVING_HOST_IN_PAC_FILE */
        public static final int f74330xf224fce2 = 7;

        /* renamed from: RESOLVING_PROXY_FOR_URL */
        public static final int f74331x2c90a992 = 6;

        /* renamed from: SENDING_REQUEST */
        public static final int f74332xb543126a = 12;

        /* renamed from: SSL_HANDSHAKE */
        public static final int f74333x58885144 = 11;

        /* renamed from: WAITING_FOR_AVAILABLE_SOCKET */
        public static final int f74334x8e287571 = 2;

        /* renamed from: WAITING_FOR_CACHE */
        public static final int f74335xeb2450ba = 4;

        /* renamed from: WAITING_FOR_DELEGATE */
        public static final int f74336x1bb952d = 3;

        /* renamed from: WAITING_FOR_RESPONSE */
        public static final int f74337xbc9ccbe9 = 13;

        /* renamed from: WAITING_FOR_STALLED_SOCKET_POOL */
        public static final int f74338x1528e0a0 = 1;

        private Status() {
        }
    }

    /* renamed from: org.chromium.net.UrlRequest$StatusListener */
    /* loaded from: classes16.dex */
    public static abstract class StatusListener {
        /* renamed from: onStatus */
        public abstract void mo153679x59c2a6b1(int i17);
    }

    /* renamed from: cancel */
    public abstract void mo153666xae7a2e7a();

    /* renamed from: followRedirect */
    public abstract void mo153667x25da56ad();

    /* renamed from: getStatus */
    public abstract void mo153668x2fe4f2e8(org.p3343x72743996.net.AbstractC29563x9a627640.StatusListener statusListener);

    /* renamed from: isDone */
    public abstract boolean mo153669xb9a1ffcc();

    /* renamed from: read */
    public abstract void mo153670x355996(java.nio.ByteBuffer byteBuffer);

    /* renamed from: start */
    public abstract void mo153671x68ac462();
}
