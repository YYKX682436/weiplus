package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class FullScreenInputStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58263d;

    /* renamed from: e, reason: collision with root package name */
    public long f58264e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58265f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58266g = "";

    @Override // jx3.a
    public int g() {
        return 26699;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58263d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58264e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58265f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58266g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f58263d);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f58264e);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f58265f);
        stringBuffer.append("\r\nWording:");
        stringBuffer.append(this.f58266g);
        return stringBuffer.toString();
    }
}
