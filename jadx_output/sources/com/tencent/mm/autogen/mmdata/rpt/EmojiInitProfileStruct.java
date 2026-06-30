package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class EmojiInitProfileStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55986d;

    /* renamed from: e, reason: collision with root package name */
    public int f55987e;

    /* renamed from: f, reason: collision with root package name */
    public long f55988f;

    /* renamed from: g, reason: collision with root package name */
    public int f55989g = 0;

    @Override // jx3.a
    public int g() {
        return 23818;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55986d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55987e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55988f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55989g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Version:");
        stringBuffer.append(this.f55986d);
        stringBuffer.append("\r\nEmojiCount:");
        stringBuffer.append(this.f55987e);
        stringBuffer.append("\r\nInitCost:");
        stringBuffer.append(this.f55988f);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f55989g);
        return stringBuffer.toString();
    }
}
