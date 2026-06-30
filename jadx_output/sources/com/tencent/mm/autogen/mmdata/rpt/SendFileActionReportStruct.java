package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class SendFileActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60184d;

    /* renamed from: e, reason: collision with root package name */
    public long f60185e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60186f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60187g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60188h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f60189i;

    @Override // jx3.a
    public int g() {
        return 22579;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60184d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60185e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60186f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60187g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60188h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60189i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f60184d);
        stringBuffer.append("\r\nFileSize:");
        stringBuffer.append(this.f60185e);
        stringBuffer.append("\r\nFileExt:");
        stringBuffer.append(this.f60186f);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f60187g);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f60188h);
        stringBuffer.append("\r\nLogVersionlog:");
        stringBuffer.append(this.f60189i);
        return stringBuffer.toString();
    }
}
