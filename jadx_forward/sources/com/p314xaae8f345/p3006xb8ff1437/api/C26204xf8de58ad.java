package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPVideoInfo */
/* loaded from: classes15.dex */
public class C26204xf8de58ad {

    /* renamed from: builder */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder f51085xdc3ef9b;

    /* renamed from: definition */
    private java.lang.String f51086xc3893553;

    /* renamed from: downloadParamList */
    private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> f51087xdb6f9f23;

    /* renamed from: fileID */
    private java.lang.String f51088xb4088f97;

    /* renamed from: height */
    private long f51089xb7389127;

    /* renamed from: videoCodecId */
    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_VIDEO_CODEC_TYPE
    private int f51090x2f5dfed6;

    /* renamed from: width */
    private long f51091x6be2dc6;

    /* renamed from: com.tencent.thumbplayer.api.TPVideoInfo$Builder */
    /* loaded from: classes15.dex */
    public static class Builder {

        /* renamed from: definition */
        private java.lang.String f51092xc3893553;

        /* renamed from: downloadParamList */
        private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> f51093xdb6f9f23;

        /* renamed from: fileID */
        private java.lang.String f51094xb4088f97;

        /* renamed from: height */
        private long f51095xb7389127;

        /* renamed from: videoCodecId */
        @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_VIDEO_CODEC_TYPE
        private int f51096x2f5dfed6;

        /* renamed from: width */
        private long f51097x6be2dc6;

        /* renamed from: build */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad m101222x59bc66e() {
            return new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad(this);
        }

        /* renamed from: definition */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101223xc3893553(java.lang.String str) {
            this.f51092xc3893553 = str;
            return this;
        }

        /* renamed from: downloadParam */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101224x10a74e5(com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f51093xdb6f9f23)) {
                this.f51093xdb6f9f23 = new java.util.ArrayList<>();
            } else {
                this.f51093xdb6f9f23.clear();
            }
            this.f51093xdb6f9f23.add(c26231xafaedb13);
            return this;
        }

        /* renamed from: downloadParamList */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101225xdb6f9f23(java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> arrayList) {
            this.f51093xdb6f9f23 = arrayList;
            return this;
        }

        /* renamed from: fileId */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101226xb4088fb7(java.lang.String str) {
            this.f51094xb4088f97 = str;
            return this;
        }

        /* renamed from: size */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101227x35e001(long j17, long j18) {
            this.f51097x6be2dc6 = j17;
            this.f51095xb7389127 = j18;
            return this;
        }

        /* renamed from: videoCodecId */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101228x2f5dfed6(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_VIDEO_CODEC_TYPE int i17) {
            this.f51096x2f5dfed6 = i17;
            return this;
        }
    }

    /* renamed from: getBuilder */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101209x4b912b65() {
        return this.f51085xdc3ef9b;
    }

    /* renamed from: getDefinition */
    public java.lang.String m101210xb1c9ed49() {
        return this.f51086xc3893553;
    }

    /* renamed from: getDownloadPraramList */
    public java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> m101211x90b86fb() {
        return this.f51087xdb6f9f23;
    }

    /* renamed from: getHeight */
    public long m101212x1c4fb41d() {
        return this.f51089xb7389127;
    }

    /* renamed from: getProxyFileID */
    public java.lang.String m101213x4011826f() {
        return this.f51088xb4088f97;
    }

    /* renamed from: getVideoCodecId */
    public int m101214x9050914c() {
        return this.f51090x2f5dfed6;
    }

    /* renamed from: getWidth */
    public long m101215x755bd410() {
        return this.f51091x6be2dc6;
    }

    private C26204xf8de58ad(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder builder) {
        this.f51087xdb6f9f23 = new java.util.ArrayList<>();
        this.f51091x6be2dc6 = builder.f51097x6be2dc6;
        this.f51089xb7389127 = builder.f51095xb7389127;
        this.f51090x2f5dfed6 = builder.f51096x2f5dfed6;
        this.f51088xb4088f97 = builder.f51094xb4088f97;
        this.f51086xc3893553 = builder.f51092xc3893553;
        this.f51087xdb6f9f23 = builder.f51093xdb6f9f23;
        this.f51085xdc3ef9b = builder;
    }
}
