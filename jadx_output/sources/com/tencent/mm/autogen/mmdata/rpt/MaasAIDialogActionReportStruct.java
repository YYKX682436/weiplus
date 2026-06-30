package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MaasAIDialogActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58967d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58968e = "";

    @Override // jx3.a
    public int g() {
        return 31173;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58967d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58968e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f58967d);
        stringBuffer.append("\r\nsessionid_:");
        stringBuffer.append(this.f58968e);
        return stringBuffer.toString();
    }
}
