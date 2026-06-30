package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SolitaireMsgFoldClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60846d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60847e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60848f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f60849g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60850h = 0;

    @Override // jx3.a
    public int g() {
        return 19964;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60846d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60847e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60848f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60849g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60850h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f60846d);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60847e);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f60848f);
        stringBuffer.append("\r\nDisplayCount:");
        stringBuffer.append(this.f60849g);
        stringBuffer.append("\r\nHideCount:");
        stringBuffer.append(this.f60850h);
        return stringBuffer.toString();
    }
}
