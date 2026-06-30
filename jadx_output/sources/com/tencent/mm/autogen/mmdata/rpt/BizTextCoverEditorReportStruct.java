package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class BizTextCoverEditorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55432d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f55433e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55434f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55435g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f55436h = "";

    @Override // jx3.a
    public int g() {
        return 36725;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55432d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55433e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55434f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55435g);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f55436h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f55432d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f55433e);
        stringBuffer.append("\r\nTemplate:");
        stringBuffer.append(this.f55434f);
        stringBuffer.append("\r\nColor:");
        stringBuffer.append(this.f55435g);
        stringBuffer.append("\r\nGenTimeMs:0\r\nInputWordsCount:0\r\nInputContent:");
        stringBuffer.append(this.f55436h);
        return stringBuffer.toString();
    }
}
