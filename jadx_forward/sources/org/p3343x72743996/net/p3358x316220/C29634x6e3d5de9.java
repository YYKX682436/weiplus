package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.VersionSafeCallbacks */
/* loaded from: classes16.dex */
public class C29634x6e3d5de9 {

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback */
    /* loaded from: classes16.dex */
    public static final class BidirectionalStreamCallback extends org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback {

        /* renamed from: mWrappedCallback */
        private final org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback f74862x5027e3bd;

        public BidirectionalStreamCallback(org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback) {
            this.f74862x5027e3bd = callback;
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onCanceled */
        public void mo153111x9dc2a798(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            this.f74862x5027e3bd.mo153111x9dc2a798(abstractC29492x7b0c4683, abstractC29564x6974077e);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onFailed */
        public void mo153112x428b6afc(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
            this.f74862x5027e3bd.mo153112x428b6afc(abstractC29492x7b0c4683, abstractC29564x6974077e, abstractC29501x119930f2);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onReadCompleted */
        public void mo153113x6da909b6(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.f74862x5027e3bd.mo153113x6da909b6(abstractC29492x7b0c4683, abstractC29564x6974077e, byteBuffer, z17);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onResponseHeadersReceived */
        public void mo153114x6c4f027(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            this.f74862x5027e3bd.mo153114x6c4f027(abstractC29492x7b0c4683, abstractC29564x6974077e);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onResponseTrailersReceived */
        public void mo153115x1c98bb01(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29564x6974077e.HeaderBlock headerBlock) {
            this.f74862x5027e3bd.mo153115x1c98bb01(abstractC29492x7b0c4683, abstractC29564x6974077e, headerBlock);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onStreamReady */
        public void mo153116x7cd1d2a4(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683) {
            this.f74862x5027e3bd.mo153116x7cd1d2a4(abstractC29492x7b0c4683);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onSucceeded */
        public void mo153117x3688ff42(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            this.f74862x5027e3bd.mo153117x3688ff42(abstractC29492x7b0c4683, abstractC29564x6974077e);
        }

        @Override // org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback
        /* renamed from: onWriteCompleted */
        public void mo153118x8789d0eb(org.p3343x72743996.net.AbstractC29492x7b0c4683 abstractC29492x7b0c4683, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.f74862x5027e3bd.mo153118x8789d0eb(abstractC29492x7b0c4683, abstractC29564x6974077e, byteBuffer, z17);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$LibraryLoader */
    /* loaded from: classes13.dex */
    public static final class LibraryLoader extends org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader {

        /* renamed from: mWrappedLoader */
        private final org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader f74863xfd8b718b;

        public LibraryLoader(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader) {
            this.f74863xfd8b718b = libraryLoader;
        }

        @Override // org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader
        /* renamed from: loadLibrary */
        public void mo153193xeb57c8f5(java.lang.String str) {
            this.f74863xfd8b718b.mo153193xeb57c8f5(str);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$NetworkQualityRttListenerWrapper */
    /* loaded from: classes16.dex */
    public static final class NetworkQualityRttListenerWrapper extends org.p3343x72743996.net.AbstractC29537x1d237975 {

        /* renamed from: mWrappedListener */
        private final org.p3343x72743996.net.AbstractC29537x1d237975 f74864xaaa8882c;

        public NetworkQualityRttListenerWrapper(org.p3343x72743996.net.AbstractC29537x1d237975 abstractC29537x1d237975) {
            super(abstractC29537x1d237975.mo153437xf5a03649());
            this.f74864xaaa8882c = abstractC29537x1d237975;
        }

        /* renamed from: equals */
        public boolean m154270xb2c87fbf(java.lang.Object obj) {
            if (obj == null || !(obj instanceof org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.f74864xaaa8882c.equals(((org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper) obj).f74864xaaa8882c);
        }

        @Override // org.p3343x72743996.net.AbstractC29537x1d237975
        /* renamed from: getExecutor */
        public java.util.concurrent.Executor mo153437xf5a03649() {
            return this.f74864xaaa8882c.mo153437xf5a03649();
        }

        /* renamed from: hashCode */
        public int m154271x8cdac1b() {
            return this.f74864xaaa8882c.hashCode();
        }

        @Override // org.p3343x72743996.net.AbstractC29537x1d237975
        /* renamed from: onRttObservation */
        public void mo153438xbe23d219(int i17, long j17, int i18) {
            this.f74864xaaa8882c.mo153438xbe23d219(i17, j17, i18);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$NetworkQualityThroughputListenerWrapper */
    /* loaded from: classes16.dex */
    public static final class NetworkQualityThroughputListenerWrapper extends org.p3343x72743996.net.AbstractC29538x763be9ef {

        /* renamed from: mWrappedListener */
        private final org.p3343x72743996.net.AbstractC29538x763be9ef f74865xaaa8882c;

        public NetworkQualityThroughputListenerWrapper(org.p3343x72743996.net.AbstractC29538x763be9ef abstractC29538x763be9ef) {
            super(abstractC29538x763be9ef.mo153439xf5a03649());
            this.f74865xaaa8882c = abstractC29538x763be9ef;
        }

        /* renamed from: equals */
        public boolean m154272xb2c87fbf(java.lang.Object obj) {
            if (obj == null || !(obj instanceof org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.f74865xaaa8882c.equals(((org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper) obj).f74865xaaa8882c);
        }

        @Override // org.p3343x72743996.net.AbstractC29538x763be9ef
        /* renamed from: getExecutor */
        public java.util.concurrent.Executor mo153439xf5a03649() {
            return this.f74865xaaa8882c.mo153439xf5a03649();
        }

        /* renamed from: hashCode */
        public int m154273x8cdac1b() {
            return this.f74865xaaa8882c.hashCode();
        }

        @Override // org.p3343x72743996.net.AbstractC29538x763be9ef
        /* renamed from: onThroughputObservation */
        public void mo153440xe09b5f03(int i17, long j17, int i18) {
            this.f74865xaaa8882c.mo153440xe09b5f03(i17, j17, i18);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$RequestFinishedInfoListener */
    /* loaded from: classes16.dex */
    public static final class RequestFinishedInfoListener extends org.p3343x72743996.net.AbstractC29554xec05c04f.Listener {

        /* renamed from: mWrappedListener */
        private final org.p3343x72743996.net.AbstractC29554xec05c04f.Listener f74866xaaa8882c;

        public RequestFinishedInfoListener(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
            super(listener.mo153632xf5a03649());
            this.f74866xaaa8882c = listener;
        }

        @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Listener
        /* renamed from: getExecutor */
        public java.util.concurrent.Executor mo153632xf5a03649() {
            return this.f74866xaaa8882c.mo153632xf5a03649();
        }

        @Override // org.p3343x72743996.net.AbstractC29554xec05c04f.Listener
        /* renamed from: onRequestFinished */
        public void mo153633x1d116842(org.p3343x72743996.net.AbstractC29554xec05c04f abstractC29554xec05c04f) {
            this.f74866xaaa8882c.mo153633x1d116842(abstractC29554xec05c04f);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$UploadDataProviderWrapper */
    /* loaded from: classes13.dex */
    public static final class UploadDataProviderWrapper extends org.p3343x72743996.net.AbstractC29560x8cb1347c {

        /* renamed from: mWrappedProvider */
        private final org.p3343x72743996.net.AbstractC29560x8cb1347c f74867x1f8fc969;

        public UploadDataProviderWrapper(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c) {
            this.f74867x1f8fc969 = abstractC29560x8cb1347c;
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f74867x1f8fc969.close();
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: getLength */
        public long mo153654x23255ddc() {
            return this.f74867x1f8fc969.mo153654x23255ddc();
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: read */
        public void mo153655x355996(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e, java.nio.ByteBuffer byteBuffer) {
            this.f74867x1f8fc969.mo153655x355996(abstractC29562xf1e0a9e, byteBuffer);
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: rewind */
        public void mo153656xc84f6cbb(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e) {
            this.f74867x1f8fc969.mo153656xc84f6cbb(abstractC29562xf1e0a9e);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$UrlRequestCallback */
    /* loaded from: classes16.dex */
    public static final class UrlRequestCallback extends org.p3343x72743996.net.AbstractC29563x9a627640.Callback {

        /* renamed from: mWrappedCallback */
        private final org.p3343x72743996.net.AbstractC29563x9a627640.Callback f74868x5027e3bd;

        public UrlRequestCallback(org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback) {
            this.f74868x5027e3bd = callback;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onCanceled */
        public void mo153673x9dc2a798(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            this.f74868x5027e3bd.mo153673x9dc2a798(abstractC29563x9a627640, abstractC29564x6974077e);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onFailed */
        public void mo153674x428b6afc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
            this.f74868x5027e3bd.mo153674x428b6afc(abstractC29563x9a627640, abstractC29564x6974077e, abstractC29501x119930f2);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onReadCompleted */
        public void mo153675x6da909b6(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer) {
            this.f74868x5027e3bd.mo153675x6da909b6(abstractC29563x9a627640, abstractC29564x6974077e, byteBuffer);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onRedirectReceived */
        public void mo153676x4d4e5ddc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
            this.f74868x5027e3bd.mo153676x4d4e5ddc(abstractC29563x9a627640, abstractC29564x6974077e, str);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onResponseStarted */
        public void mo153677x5d21f921(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            this.f74868x5027e3bd.mo153677x5d21f921(abstractC29563x9a627640, abstractC29564x6974077e);
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
        /* renamed from: onSucceeded */
        public void mo153678x3688ff42(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
            this.f74868x5027e3bd.mo153678x3688ff42(abstractC29563x9a627640, abstractC29564x6974077e);
        }
    }

    /* renamed from: org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener */
    /* loaded from: classes16.dex */
    public static final class UrlRequestStatusListener extends org.p3343x72743996.net.AbstractC29563x9a627640.StatusListener {

        /* renamed from: mWrappedListener */
        private final org.p3343x72743996.net.AbstractC29563x9a627640.StatusListener f74869xaaa8882c;

        public UrlRequestStatusListener(org.p3343x72743996.net.AbstractC29563x9a627640.StatusListener statusListener) {
            this.f74869xaaa8882c = statusListener;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.StatusListener
        /* renamed from: onStatus */
        public void mo153679x59c2a6b1(int i17) {
            this.f74869xaaa8882c.mo153679x59c2a6b1(i17);
        }
    }
}
