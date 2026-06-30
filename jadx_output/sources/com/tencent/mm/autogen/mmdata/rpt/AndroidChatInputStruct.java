package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class AndroidChatInputStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55041d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f55042e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f55043f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f55044g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f55045h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f55046i = 0;

    @Override // jx3.a
    public int g() {
        return 16113;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55041d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55042e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55043f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55044g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55045h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55046i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FirstInputTimeStampMs:");
        stringBuffer.append(this.f55041d);
        stringBuffer.append("\r\nLastInputTimeStampMs:");
        stringBuffer.append(this.f55042e);
        stringBuffer.append("\r\nSendStampMs:");
        stringBuffer.append(this.f55043f);
        stringBuffer.append("\r\nClickCount:");
        stringBuffer.append(this.f55044g);
        stringBuffer.append("\r\nTextLength:");
        stringBuffer.append(this.f55045h);
        stringBuffer.append("\r\nEmojiCount:");
        stringBuffer.append(this.f55046i);
        return stringBuffer.toString();
    }
}
