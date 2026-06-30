package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppTradeCommentReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f62872d;

    /* renamed from: e, reason: collision with root package name */
    public int f62873e;

    /* renamed from: f, reason: collision with root package name */
    public int f62874f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62875g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62876h = "";

    @Override // jx3.a
    public int g() {
        return 27948;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62872d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62873e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62874f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62875g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62876h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f62872d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f62873e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62874f);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62875g);
        stringBuffer.append("\r\nActionNote:");
        stringBuffer.append(this.f62876h);
        return stringBuffer.toString();
    }
}
