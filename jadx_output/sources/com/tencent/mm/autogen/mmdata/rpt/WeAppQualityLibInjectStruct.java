package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityLibInjectStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62556d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62557e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62558f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62559g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62560h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62561i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62562j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62563k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62564l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62565m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f62566n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f62567o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f62568p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f62569q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f62570r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f62571s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f62572t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f62573u = "";

    /* renamed from: v, reason: collision with root package name */
    public long f62574v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f62575w = "";

    @Override // jx3.a
    public int g() {
        return 15815;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62556d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62557e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62558f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62559g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62560h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62561i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62562j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62563k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62564l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62565m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62566n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62567o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62568p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62569q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62570r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62571s);
        stringBuffer.append(",");
        stringBuffer.append(this.f62572t);
        stringBuffer.append(",");
        stringBuffer.append(this.f62573u);
        stringBuffer.append(",");
        stringBuffer.append(this.f62574v);
        stringBuffer.append(",");
        stringBuffer.append(this.f62575w);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62556d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62557e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62558f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62559g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62560h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62561i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62562j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62563k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62564l);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62565m);
        stringBuffer.append("\r\nfileName:");
        stringBuffer.append(this.f62566n);
        stringBuffer.append("\r\nlibVersion:");
        stringBuffer.append(this.f62567o);
        stringBuffer.append("\r\nfileSize:");
        stringBuffer.append(this.f62568p);
        stringBuffer.append("\r\nengineType:");
        stringBuffer.append(this.f62569q);
        stringBuffer.append("\r\nuseCodeCache:");
        stringBuffer.append(this.f62570r);
        stringBuffer.append("\r\nuseIsolatedContext:");
        stringBuffer.append(this.f62571s);
        stringBuffer.append("\r\ncompileTime:");
        stringBuffer.append(this.f62572t);
        stringBuffer.append("\r\nengineVersion:");
        stringBuffer.append(this.f62573u);
        stringBuffer.append("\r\ncodeCacheType:");
        stringBuffer.append(this.f62574v);
        stringBuffer.append("\r\nexpt:");
        stringBuffer.append(this.f62575w);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct p(java.lang.String str) {
        this.f62566n = b(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, str, true);
        return this;
    }
}
