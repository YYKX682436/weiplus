package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCTopicSearchTipActionStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f62181e;

    /* renamed from: g, reason: collision with root package name */
    public int f62183g;

    /* renamed from: h, reason: collision with root package name */
    public int f62184h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62180d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62182f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62185i = "";

    @Override // jx3.a
    public int g() {
        return 23012;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62180d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62181e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62182f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62183g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62184h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62185i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("requestid:");
        stringBuffer.append(this.f62180d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f62181e);
        stringBuffer.append("\r\nmessage:");
        stringBuffer.append(this.f62182f);
        stringBuffer.append("\r\nactiontype:");
        stringBuffer.append(this.f62183g);
        stringBuffer.append("\r\npagetype:");
        stringBuffer.append(this.f62184h);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f62185i);
        return stringBuffer.toString();
    }
}
