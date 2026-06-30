package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ChatBoxSessionActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55601d;

    /* renamed from: e, reason: collision with root package name */
    public long f55602e;

    /* renamed from: f, reason: collision with root package name */
    public long f55603f;

    @Override // jx3.a
    public int g() {
        return 24201;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55601d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55602e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55603f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f55601d);
        stringBuffer.append("\r\nredType:");
        stringBuffer.append(this.f55602e);
        stringBuffer.append("\r\ngrayStatus:");
        stringBuffer.append(this.f55603f);
        return stringBuffer.toString();
    }
}
