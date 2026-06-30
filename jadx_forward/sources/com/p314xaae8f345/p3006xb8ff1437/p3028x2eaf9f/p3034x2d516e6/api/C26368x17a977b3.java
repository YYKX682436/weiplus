package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam */
/* loaded from: classes16.dex */
public class C26368x17a977b3 implements java.io.Serializable {

    /* renamed from: appVer */
    private java.lang.String f52719xabe495c2;

    /* renamed from: cacheDir */
    private java.lang.String f52720xe62915ab;

    /* renamed from: configStr */
    private java.lang.String f52721xd00ce38f;

    /* renamed from: dataDir */
    private java.lang.String f52722x56050483;

    /* renamed from: guid */
    private java.lang.String f52723x309689;

    /* renamed from: platform */
    private int f52724x6fbd6873;

    public C26368x17a977b3(int i17, java.lang.String str, java.lang.String str2) {
        this.f52720xe62915ab = "";
        this.f52722x56050483 = "";
        this.f52721xd00ce38f = "";
        this.f52724x6fbd6873 = i17;
        this.f52719xabe495c2 = str;
        this.f52723x309689 = str2;
    }

    /* renamed from: getAppVer */
    public java.lang.String m102300x10fbb8b8() {
        return this.f52719xabe495c2;
    }

    /* renamed from: getCacheDir */
    public java.lang.String m102301x62035321() {
        return this.f52720xe62915ab;
    }

    /* renamed from: getConfigStr */
    public java.lang.String m102302xcf7a54d9() {
        return this.f52721xd00ce38f;
    }

    /* renamed from: getDataDir */
    public java.lang.String m102303x93d2404d() {
        return this.f52722x56050483;
    }

    /* renamed from: getGuid */
    public java.lang.String m102304xfb7ffeff() {
        return this.f52723x309689;
    }

    /* renamed from: getPlatform */
    public int m102305xeb97a5e9() {
        return this.f52724x6fbd6873;
    }

    public C26368x17a977b3(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(i17, str, str2);
        if (android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        this.f52722x56050483 = str3;
    }

    public C26368x17a977b3(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(i17, str, str2, str4);
        if (!android.text.TextUtils.isEmpty(str3)) {
            this.f52720xe62915ab = str3;
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            this.f52722x56050483 = str4;
        }
        if (android.text.TextUtils.isEmpty(str5)) {
            return;
        }
        this.f52721xd00ce38f = str5;
    }
}
