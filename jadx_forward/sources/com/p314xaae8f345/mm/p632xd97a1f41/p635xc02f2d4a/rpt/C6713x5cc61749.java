package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MaasTemplateResReportStruct */
/* loaded from: classes5.dex */
public final class C6713x5cc61749 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140545d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140546e = "";

    @Override // jx3.a
    public int g() {
        return 25161;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140545d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140546e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ResType:");
        stringBuffer.append(this.f140545d);
        stringBuffer.append("\r\nSubTypeList:");
        stringBuffer.append(this.f140546e);
        return stringBuffer.toString();
    }
}
