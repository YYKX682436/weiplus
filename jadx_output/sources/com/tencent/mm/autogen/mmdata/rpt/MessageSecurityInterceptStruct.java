package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class MessageSecurityInterceptStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59200d;

    /* renamed from: e, reason: collision with root package name */
    public long f59201e;

    /* renamed from: f, reason: collision with root package name */
    public long f59202f;

    /* renamed from: g, reason: collision with root package name */
    public long f59203g;

    /* renamed from: h, reason: collision with root package name */
    public long f59204h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f59205i = 0;

    @Override // jx3.a
    public int g() {
        return 18712;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59200d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59201e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59202f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59203g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59204h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59205i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f59200d);
        stringBuffer.append("\r\nSelfSendMsg:");
        stringBuffer.append(this.f59201e);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f59202f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59203g);
        stringBuffer.append("\r\nCopyLen:");
        stringBuffer.append(this.f59204h);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f59205i);
        return stringBuffer.toString();
    }
}
