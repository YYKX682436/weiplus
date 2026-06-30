package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAPrefetchGetCodeResultStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62010d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62011e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62012f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62013g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62014h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62015i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62016j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62017k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62018l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62019m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f62020n = "";

    @Override // jx3.a
    public int g() {
        return 16636;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62010d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62011e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62012f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62013g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62014h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62015i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62016j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62017k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62018l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62019m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62020n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Username:");
        stringBuffer.append(this.f62010d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f62011e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62012f);
        stringBuffer.append("\r\nIsEncrypt:");
        stringBuffer.append(this.f62013g);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f62014h);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f62015i);
        stringBuffer.append("\r\nRetryCount:");
        stringBuffer.append(this.f62016j);
        stringBuffer.append("\r\nCmdSequence:");
        stringBuffer.append(this.f62017k);
        stringBuffer.append("\r\nReportId:");
        stringBuffer.append(this.f62018l);
        stringBuffer.append("\r\nPackageType:");
        stringBuffer.append(this.f62019m);
        stringBuffer.append("\r\nPackageKey:");
        stringBuffer.append(this.f62020n);
        return stringBuffer.toString();
    }
}
