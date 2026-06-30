package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WeGamePluginReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62911d;

    /* renamed from: e, reason: collision with root package name */
    public long f62912e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62913f = "";

    @Override // jx3.a
    public int g() {
        return 29695;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62911d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62912e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62913f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizObject:");
        stringBuffer.append(this.f62911d);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f62912e);
        stringBuffer.append("\r\nBizContent:");
        stringBuffer.append(this.f62913f);
        return stringBuffer.toString();
    }
}
