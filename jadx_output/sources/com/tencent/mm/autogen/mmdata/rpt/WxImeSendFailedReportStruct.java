package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WxImeSendFailedReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62998d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62999e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63000f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f63001g;

    @Override // jx3.a
    public int g() {
        return 28540;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62998d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62999e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63000f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63001g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("currentImePacketName:");
        stringBuffer.append(this.f62998d);
        stringBuffer.append("\r\ncurrentImePacketNameMd5:");
        stringBuffer.append(this.f62999e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f63000f);
        stringBuffer.append("\r\nemojiMd5Empty:");
        stringBuffer.append(this.f63001g);
        return stringBuffer.toString();
    }
}
