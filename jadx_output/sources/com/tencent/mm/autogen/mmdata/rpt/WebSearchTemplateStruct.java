package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class WebSearchTemplateStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62940d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62941e = 0;

    @Override // jx3.a
    public int g() {
        return 17040;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62940d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62941e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f62940d);
        stringBuffer.append("\r\nTemplateVersion:");
        stringBuffer.append(this.f62941e);
        return stringBuffer.toString();
    }
}
