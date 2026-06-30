package org.p3343x72743996.net;

@java.lang.Deprecated
/* renamed from: org.chromium.net.ExperimentalUrlRequest */
/* loaded from: classes13.dex */
public abstract class AbstractC29512x37ecfd48 extends org.p3343x72743996.net.AbstractC29563x9a627640 {

    @java.lang.Deprecated
    /* renamed from: org.chromium.net.ExperimentalUrlRequest$Builder */
    /* loaded from: classes13.dex */
    public static abstract class Builder extends org.p3343x72743996.net.AbstractC29563x9a627640.Builder {

        /* renamed from: DEFAULT_IDEMPOTENCY */
        public static final int f73833x9413a513 = 0;

        /* renamed from: IDEMPOTENT */
        public static final int f73834x8113d739 = 1;

        /* renamed from: NOT_IDEMPOTENT */
        public static final int f73835xb43ee045 = 2;

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: addHeader */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153266xec6c8a8e(java.lang.String str, java.lang.String str2);

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: addRequestAnnotation */
        public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153267xbd4b107d(java.lang.Object obj) {
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: allowDirectExecutor */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153268x99087b85();

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: build */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48 mo153269x59bc66e();

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: disableCache */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153270xc3a92d7a();

        /* renamed from: disableConnectionMigration */
        public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153271xec3a5a88() {
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: setHttpMethod */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153272x492a458b(java.lang.String str);

        /* renamed from: setIdempotency */
        public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153273x914f348f(int i17) {
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: setPriority */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153274x311b1826(int i17);

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: setRequestFinishedListener */
        public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153275x69abdd33(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: setTrafficStatsTag */
        public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153276x5fdeed6(int i17) {
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: setTrafficStatsUid */
        public org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153277x5fdf38c(int i17) {
            return this;
        }

        @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Builder
        /* renamed from: setUploadDataProvider */
        public abstract org.p3343x72743996.net.AbstractC29512x37ecfd48.Builder mo153278xc9755c5e(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c, java.util.concurrent.Executor executor);
    }
}
