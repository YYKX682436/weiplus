package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.JceCmd */
/* loaded from: classes11.dex */
public final class C26747x83e8a76e implements java.io.Serializable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56641x7118e671 = false;

    /* renamed from: _Empty */
    public static final int f56648xa61bf82e = 0;

    /* renamed from: _GetAppSimpleDetail */
    public static final int f56649x781d21ed = 5;

    /* renamed from: _GetAppUpdate */
    public static final int f56650xe868f193 = 3;

    /* renamed from: _GetSettings */
    public static final int f56651xfb2ffba = 2;

    /* renamed from: _ReportApkFileInfo */
    public static final int f56652x37e4a613 = 4;

    /* renamed from: _ReportLog */
    public static final int f56653x9a373d1 = 1;
    private java.lang.String __T;

    /* renamed from: __value */
    private int f56655x4a38f191;

    /* renamed from: __values */
    private static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e[] f56654xfce54102 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e[6];

    /* renamed from: Empty */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e f56642x3ff952d = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e(0, 0, "Empty");

    /* renamed from: ReportLog */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e f56647x62627950 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e(1, 1, "ReportLog");

    /* renamed from: GetSettings */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e f56645x34c6a179 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e(2, 2, "GetSettings");

    /* renamed from: GetAppUpdate */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e f56644x65c987b4 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e(3, 3, "GetAppUpdate");

    /* renamed from: ReportApkFileInfo */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e f56646x45c1bc92 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e(4, 4, "ReportApkFileInfo");

    /* renamed from: GetAppSimpleDetail */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e f56643x25e2db4e = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e(5, 5, "GetAppSimpleDetail");

    private C26747x83e8a76e(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.__T = str;
        this.f56655x4a38f191 = i18;
        f56654xfce54102[i17] = this;
    }

    /* renamed from: convert */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e m105227x38b81db3(int i17) {
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e[] c26747x83e8a76eArr = f56654xfce54102;
            if (i18 >= c26747x83e8a76eArr.length) {
                return null;
            }
            if (c26747x83e8a76eArr[i18].m105230x6ac9171() == i17) {
                return f56654xfce54102[i18];
            }
            i18++;
        }
    }

    /* renamed from: toString */
    public java.lang.String m105229x9616526c() {
        return this.__T;
    }

    /* renamed from: value */
    public int m105230x6ac9171() {
        return this.f56655x4a38f191;
    }

    /* renamed from: convert */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e m105228x38b81db3(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26747x83e8a76e[] c26747x83e8a76eArr = f56654xfce54102;
            if (i17 >= c26747x83e8a76eArr.length) {
                return null;
            }
            if (c26747x83e8a76eArr[i17].m105229x9616526c().equals(str)) {
                return f56654xfce54102[i17];
            }
            i17++;
        }
    }
}
