package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct */
/* loaded from: classes5.dex */
public final class C6298x8484ff78 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136574d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f136575e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f136576f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f136577g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f136578h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f136579i = 0;

    @Override // jx3.a
    public int g() {
        return 16113;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136574d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136575e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136576f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136577g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136578h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136579i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FirstInputTimeStampMs:");
        stringBuffer.append(this.f136574d);
        stringBuffer.append("\r\nLastInputTimeStampMs:");
        stringBuffer.append(this.f136575e);
        stringBuffer.append("\r\nSendStampMs:");
        stringBuffer.append(this.f136576f);
        stringBuffer.append("\r\nClickCount:");
        stringBuffer.append(this.f136577g);
        stringBuffer.append("\r\nTextLength:");
        stringBuffer.append(this.f136578h);
        stringBuffer.append("\r\nEmojiCount:");
        stringBuffer.append(this.f136579i);
        return stringBuffer.toString();
    }
}
