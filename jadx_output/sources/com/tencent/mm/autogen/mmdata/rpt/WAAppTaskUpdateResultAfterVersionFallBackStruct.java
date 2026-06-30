package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAAppTaskUpdateResultAfterVersionFallBackStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61881d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61882e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61883f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61884g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61885h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f61886i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f61887j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f61888k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f61889l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61890m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f61891n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f61892o = 0;

    @Override // jx3.a
    public int g() {
        return 20579;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61881d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61882e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61883f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61884g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61885h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61886i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61887j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61888k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61889l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61890m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61891n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61892o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Appid:");
        stringBuffer.append(this.f61881d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f61882e);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f61883f);
        stringBuffer.append("\r\nOpenScene:");
        stringBuffer.append(this.f61884g);
        stringBuffer.append("\r\nTargetAppVersion:");
        stringBuffer.append(this.f61885h);
        stringBuffer.append("\r\nLocalAppVersion:");
        stringBuffer.append(this.f61886i);
        stringBuffer.append("\r\nUpdateResult:");
        stringBuffer.append(this.f61887j);
        stringBuffer.append("\r\nUpdateCostTimeInMs:");
        stringBuffer.append(this.f61888k);
        stringBuffer.append("\r\nFallbackWaitTimeInMs:");
        stringBuffer.append(this.f61889l);
        stringBuffer.append("\r\nNetType:");
        stringBuffer.append(this.f61890m);
        stringBuffer.append("\r\nIsWeakNet:");
        stringBuffer.append(this.f61891n);
        stringBuffer.append("\r\nFallbackScene:");
        stringBuffer.append(this.f61892o);
        return stringBuffer.toString();
    }
}
