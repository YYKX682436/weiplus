package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderPersonalCenterEventStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57482e;

    /* renamed from: f, reason: collision with root package name */
    public long f57483f;

    /* renamed from: g, reason: collision with root package name */
    public long f57484g;

    /* renamed from: h, reason: collision with root package name */
    public long f57485h;

    /* renamed from: i, reason: collision with root package name */
    public long f57486i;

    /* renamed from: j, reason: collision with root package name */
    public long f57487j;

    /* renamed from: k, reason: collision with root package name */
    public long f57488k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57481d = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57489l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57490m = "";

    @Override // jx3.a
    public int g() {
        return 20372;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57481d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57482e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57483f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57484g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57485h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57486i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57487j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57488k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57489l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57490m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f57481d);
        stringBuffer.append("\r\nEnterTimeMs:");
        stringBuffer.append(this.f57482e);
        stringBuffer.append("\r\nIsRedDotEnter:");
        stringBuffer.append(this.f57483f);
        stringBuffer.append("\r\nEvent:");
        stringBuffer.append(this.f57484g);
        stringBuffer.append("\r\nBannerType:");
        stringBuffer.append(this.f57485h);
        stringBuffer.append("\r\nEventTime:");
        stringBuffer.append(this.f57486i);
        stringBuffer.append("\r\nIsHaveRedDot:");
        stringBuffer.append(this.f57487j);
        stringBuffer.append("\r\nMsgCnt:");
        stringBuffer.append(this.f57488k);
        stringBuffer.append("\r\nRedDotCountDetail:");
        stringBuffer.append(this.f57489l);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f57490m);
        return stringBuffer.toString();
    }
}
