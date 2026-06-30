package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.AppDetailParam */
/* loaded from: classes13.dex */
public final class C26740xf8b7a5fb extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: actionFlag */
    public byte f56580x6e5ae6c2;

    /* renamed from: apkId */
    public long f56581x58b6c57;

    /* renamed from: apkVersionCode */
    public int f56582xb2111729;

    /* renamed from: appId */
    public long f56583x58b7f1c;

    /* renamed from: appType */
    public byte f56584xd0ad84fb;

    /* renamed from: authPlatform */
    public byte f56585x5781823b;

    /* renamed from: channelId */
    public java.lang.String f56586x5720517e;

    /* renamed from: grayVersionCode */
    public int f56587x4b1ce482;

    /* renamed from: manifestMd5 */
    public java.lang.String f56588xc969ccf;

    /* renamed from: packageName */
    public java.lang.String f56589x362a8ff1;

    /* renamed from: signatureMd5 */
    public java.lang.String f56590xa85039a6;

    /* renamed from: token */
    public java.lang.String f56591x696b9f9;

    /* renamed from: verifyAppId */
    public java.lang.String f56592x8a376a23;

    /* renamed from: verifyType */
    public byte f56593xc26da753;

    /* renamed from: versionCode */
    public int f56594x290b12e5;

    public C26740xf8b7a5fb() {
        this.f56583x58b7f1c = 0L;
        this.f56589x362a8ff1 = "";
        this.f56590xa85039a6 = "";
        this.f56594x290b12e5 = 0;
        this.f56588xc969ccf = "";
        this.f56584xd0ad84fb = (byte) 1;
        this.f56581x58b6c57 = 0L;
        this.f56582xb2111729 = 0;
        this.f56586x5720517e = "";
        this.f56580x6e5ae6c2 = (byte) 0;
        this.f56587x4b1ce482 = 0;
        this.f56591x696b9f9 = "";
        this.f56593xc26da753 = (byte) 0;
        this.f56585x5781823b = (byte) 0;
        this.f56592x8a376a23 = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56583x58b7f1c = c2859xe10ac61e.m21300x355996(this.f56583x58b7f1c, 0, false);
        this.f56589x362a8ff1 = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f56590xa85039a6 = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56594x290b12e5 = c2859xe10ac61e.m21299x355996(this.f56594x290b12e5, 3, false);
        this.f56588xc969ccf = c2859xe10ac61e.m21321xe22f9d47(4, false);
        this.f56584xd0ad84fb = c2859xe10ac61e.m21296x355996(this.f56584xd0ad84fb, 5, false);
        this.f56581x58b6c57 = c2859xe10ac61e.m21300x355996(this.f56581x58b6c57, 6, false);
        this.f56582xb2111729 = c2859xe10ac61e.m21299x355996(this.f56582xb2111729, 7, false);
        this.f56586x5720517e = c2859xe10ac61e.m21321xe22f9d47(8, false);
        this.f56580x6e5ae6c2 = c2859xe10ac61e.m21296x355996(this.f56580x6e5ae6c2, 9, false);
        this.f56587x4b1ce482 = c2859xe10ac61e.m21299x355996(this.f56587x4b1ce482, 10, false);
        this.f56591x696b9f9 = c2859xe10ac61e.m21321xe22f9d47(11, false);
        this.f56593xc26da753 = c2859xe10ac61e.m21296x355996(this.f56593xc26da753, 12, false);
        this.f56585x5781823b = c2859xe10ac61e.m21296x355996(this.f56585x5781823b, 13, false);
        this.f56592x8a376a23 = c2859xe10ac61e.m21321xe22f9d47(14, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21339x6c257df(this.f56583x58b7f1c, 0);
        java.lang.String str = this.f56589x362a8ff1;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 1);
        }
        java.lang.String str2 = this.f56590xa85039a6;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 2);
        }
        c2860x6de9642d.m21338x6c257df(this.f56594x290b12e5, 3);
        java.lang.String str3 = this.f56588xc969ccf;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 4);
        }
        c2860x6de9642d.m21335x6c257df(this.f56584xd0ad84fb, 5);
        c2860x6de9642d.m21339x6c257df(this.f56581x58b6c57, 6);
        c2860x6de9642d.m21338x6c257df(this.f56582xb2111729, 7);
        java.lang.String str4 = this.f56586x5720517e;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 8);
        }
        c2860x6de9642d.m21335x6c257df(this.f56580x6e5ae6c2, 9);
        c2860x6de9642d.m21338x6c257df(this.f56587x4b1ce482, 10);
        java.lang.String str5 = this.f56591x696b9f9;
        if (str5 != null) {
            c2860x6de9642d.m21349x6c257df(str5, 11);
        }
        c2860x6de9642d.m21335x6c257df(this.f56593xc26da753, 12);
        c2860x6de9642d.m21335x6c257df(this.f56585x5781823b, 13);
        java.lang.String str6 = this.f56592x8a376a23;
        if (str6 != null) {
            c2860x6de9642d.m21349x6c257df(str6, 14);
        }
    }

    public C26740xf8b7a5fb(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, byte b17, long j18, int i18, java.lang.String str4, byte b18, int i19, java.lang.String str5, byte b19, byte b27, java.lang.String str6) {
        this.f56583x58b7f1c = j17;
        this.f56589x362a8ff1 = str;
        this.f56590xa85039a6 = str2;
        this.f56594x290b12e5 = i17;
        this.f56588xc969ccf = str3;
        this.f56584xd0ad84fb = b17;
        this.f56581x58b6c57 = j18;
        this.f56582xb2111729 = i18;
        this.f56586x5720517e = str4;
        this.f56580x6e5ae6c2 = b18;
        this.f56587x4b1ce482 = i19;
        this.f56591x696b9f9 = str5;
        this.f56593xc26da753 = b19;
        this.f56585x5781823b = b27;
        this.f56592x8a376a23 = str6;
    }
}
