package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MaasTemplateResReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59013e = "";

    @Override // jx3.a
    public int g() {
        return 25161;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59012d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59013e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ResType:");
        stringBuffer.append(this.f59012d);
        stringBuffer.append("\r\nSubTypeList:");
        stringBuffer.append(this.f59013e);
        return stringBuffer.toString();
    }
}
