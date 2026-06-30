package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class ChatHbClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55623e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55624f;

    /* renamed from: g, reason: collision with root package name */
    public long f55625g;

    @Override // jx3.a
    public int g() {
        return 18869;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55622d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55623e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55624f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55625g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f55622d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f55623e);
        stringBuffer.append("\r\nWeShiCount:");
        stringBuffer.append(this.f55624f);
        stringBuffer.append("\r\nClickTime:");
        stringBuffer.append(this.f55625g);
        return stringBuffer.toString();
    }
}
