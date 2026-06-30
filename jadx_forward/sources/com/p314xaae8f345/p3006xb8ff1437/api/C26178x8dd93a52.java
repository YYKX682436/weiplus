package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPInitParams */
/* loaded from: classes16.dex */
public class C26178x8dd93a52 {

    /* renamed from: mDeviceName */
    private java.lang.String f50573xabeea4e;

    /* renamed from: mGuid */
    private java.lang.String f50574x6220c96;

    /* renamed from: mPlatform */
    private int f50575x94bb1000;

    /* renamed from: com.tencent.thumbplayer.api.TPInitParams$Builder */
    /* loaded from: classes16.dex */
    public static class Builder {

        /* renamed from: mGuid */
        private java.lang.String f50577x6220c96 = "";

        /* renamed from: mPlatform */
        private int f50578x94bb1000 = 0;

        /* renamed from: mDeviceName */
        private java.lang.String f50576xabeea4e = "";

        /* renamed from: build */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52 m101041x59bc66e() {
            com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52 c26178x8dd93a52 = new com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52();
            c26178x8dd93a52.f50575x94bb1000 = this.f50578x94bb1000;
            c26178x8dd93a52.f50574x6220c96 = this.f50577x6220c96;
            c26178x8dd93a52.f50573xabeea4e = this.f50576xabeea4e;
            return c26178x8dd93a52;
        }

        /* renamed from: setDeviceName */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52.Builder m101042x4af1f803(java.lang.String str) {
            this.f50576xabeea4e = str;
            return this;
        }

        /* renamed from: setGuid */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52.Builder m101043x764ac60b(java.lang.String str) {
            this.f50577x6220c96 = str;
            return this;
        }

        /* renamed from: setPlatform */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52.Builder m101044xe65006f5(int i17) {
            this.f50578x94bb1000 = i17;
            return this;
        }
    }

    /* renamed from: getDeviceName */
    public java.lang.String m101038x1ccda9f7() {
        return this.f50573xabeea4e;
    }

    /* renamed from: getGuid */
    public java.lang.String m101039xfb7ffeff() {
        return this.f50574x6220c96;
    }

    /* renamed from: getPlatform */
    public int m101040xeb97a5e9() {
        return this.f50575x94bb1000;
    }

    private C26178x8dd93a52() {
        this.f50574x6220c96 = "";
        this.f50575x94bb1000 = 0;
        this.f50573xabeea4e = "";
    }
}
