package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class SpamMediaToEmojiOPStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60853d;

    /* renamed from: e, reason: collision with root package name */
    public long f60854e;

    /* renamed from: f, reason: collision with root package name */
    public long f60855f;

    /* renamed from: g, reason: collision with root package name */
    public long f60856g;

    @Override // jx3.a
    public int g() {
        return 21321;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60853d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60854e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60855f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60856g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MsgSvrId:");
        stringBuffer.append(this.f60853d);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f60854e);
        stringBuffer.append("\r\nBanType:");
        stringBuffer.append(this.f60855f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f60856g);
        return stringBuffer.toString();
    }
}
