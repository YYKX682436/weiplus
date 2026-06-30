package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail */
/* loaded from: classes13.dex */
public final class C26741x98500544 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_apkDownUrl */
    static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26739x2105efd1> f56595x79b4548e;

    /* renamed from: apkDownUrl */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26739x2105efd1> f56596xaa3413b1;

    /* renamed from: apkId */
    public long f56597x58b6c57;

    /* renamed from: apkMd5 */
    public java.lang.String f56598xabe22dc2;

    /* renamed from: appId */
    public long f56599x58b7f1c;

    /* renamed from: appName */
    public java.lang.String f56600xd0aa704c;

    /* renamed from: channelId */
    public java.lang.String f56601x5720517e;

    /* renamed from: diffApkMd5 */
    public java.lang.String f56602x297c4e27;

    /* renamed from: diffFileSize */
    public long f56603x53bbc6c2;

    /* renamed from: fileSize */
    public long f56604xd4282b9d;

    /* renamed from: iconUrl */
    public java.lang.String f56605x61ad9236;

    /* renamed from: packageName */
    public java.lang.String f56606x362a8ff1;

    /* renamed from: signatureMd5 */
    public java.lang.String f56607xa85039a6;

    /* renamed from: versionCode */
    public int f56608x290b12e5;

    /* renamed from: versionName */
    public java.lang.String f56609x290fdf83;

    public C26741x98500544() {
        this.f56599x58b7f1c = 0L;
        this.f56597x58b6c57 = 0L;
        this.f56600xd0aa704c = "";
        this.f56605x61ad9236 = "";
        this.f56606x362a8ff1 = "";
        this.f56609x290fdf83 = "";
        this.f56608x290b12e5 = 0;
        this.f56607xa85039a6 = "";
        this.f56598xabe22dc2 = "";
        this.f56604xd4282b9d = 0L;
        this.f56596xaa3413b1 = null;
        this.f56602x297c4e27 = "";
        this.f56603x53bbc6c2 = 0L;
        this.f56601x5720517e = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56599x58b7f1c = c2859xe10ac61e.m21300x355996(this.f56599x58b7f1c, 0, false);
        this.f56597x58b6c57 = c2859xe10ac61e.m21300x355996(this.f56597x58b6c57, 1, false);
        this.f56600xd0aa704c = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56605x61ad9236 = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.f56606x362a8ff1 = c2859xe10ac61e.m21321xe22f9d47(4, false);
        this.f56609x290fdf83 = c2859xe10ac61e.m21321xe22f9d47(5, false);
        this.f56608x290b12e5 = c2859xe10ac61e.m21299x355996(this.f56608x290b12e5, 6, false);
        this.f56607xa85039a6 = c2859xe10ac61e.m21321xe22f9d47(7, false);
        this.f56598xabe22dc2 = c2859xe10ac61e.m21321xe22f9d47(8, false);
        this.f56604xd4282b9d = c2859xe10ac61e.m21300x355996(this.f56604xd4282b9d, 9, false);
        if (f56595x79b4548e == null) {
            f56595x79b4548e = new java.util.ArrayList<>();
            f56595x79b4548e.add(new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26739x2105efd1());
        }
        this.f56596xaa3413b1 = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56595x79b4548e, 10, false);
        this.f56602x297c4e27 = c2859xe10ac61e.m21321xe22f9d47(11, false);
        this.f56603x53bbc6c2 = c2859xe10ac61e.m21300x355996(this.f56603x53bbc6c2, 12, false);
        this.f56601x5720517e = c2859xe10ac61e.m21321xe22f9d47(13, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21339x6c257df(this.f56599x58b7f1c, 0);
        c2860x6de9642d.m21339x6c257df(this.f56597x58b6c57, 1);
        java.lang.String str = this.f56600xd0aa704c;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 2);
        }
        java.lang.String str2 = this.f56605x61ad9236;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 3);
        }
        java.lang.String str3 = this.f56606x362a8ff1;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 4);
        }
        java.lang.String str4 = this.f56609x290fdf83;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 5);
        }
        c2860x6de9642d.m21338x6c257df(this.f56608x290b12e5, 6);
        java.lang.String str5 = this.f56607xa85039a6;
        if (str5 != null) {
            c2860x6de9642d.m21349x6c257df(str5, 7);
        }
        java.lang.String str6 = this.f56598xabe22dc2;
        if (str6 != null) {
            c2860x6de9642d.m21349x6c257df(str6, 8);
        }
        c2860x6de9642d.m21339x6c257df(this.f56604xd4282b9d, 9);
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26739x2105efd1> arrayList = this.f56596xaa3413b1;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 10);
        }
        java.lang.String str7 = this.f56602x297c4e27;
        if (str7 != null) {
            c2860x6de9642d.m21349x6c257df(str7, 11);
        }
        c2860x6de9642d.m21339x6c257df(this.f56603x53bbc6c2, 12);
        java.lang.String str8 = this.f56601x5720517e;
        if (str8 != null) {
            c2860x6de9642d.m21349x6c257df(str8, 13);
        }
    }

    public C26741x98500544(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, long j19, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26739x2105efd1> arrayList, java.lang.String str7, long j27, java.lang.String str8) {
        this.f56599x58b7f1c = j17;
        this.f56597x58b6c57 = j18;
        this.f56600xd0aa704c = str;
        this.f56605x61ad9236 = str2;
        this.f56606x362a8ff1 = str3;
        this.f56609x290fdf83 = str4;
        this.f56608x290b12e5 = i17;
        this.f56607xa85039a6 = str5;
        this.f56598xabe22dc2 = str6;
        this.f56604xd4282b9d = j19;
        this.f56596xaa3413b1 = arrayList;
        this.f56602x297c4e27 = str7;
        this.f56603x53bbc6c2 = j27;
        this.f56601x5720517e = str8;
    }
}
