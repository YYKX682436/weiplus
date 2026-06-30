package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderLivePlayErrorStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f57283e;

    /* renamed from: i, reason: collision with root package name */
    public long f57287i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57282d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57284f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57285g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57286h = "";

    @Override // jx3.a
    public int g() {
        return 26088;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57282d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57283e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57284f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57285g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57286h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57287i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f57282d);
        stringBuffer.append("\r\neventCode:");
        stringBuffer.append(this.f57283e);
        stringBuffer.append("\r\nerrMsg:");
        stringBuffer.append(this.f57284f);
        stringBuffer.append("\r\nliveId:");
        stringBuffer.append(this.f57285g);
        stringBuffer.append("\r\nnickname:");
        stringBuffer.append(this.f57286h);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f57287i);
        return stringBuffer.toString();
    }
}
