package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MvvmOptimizeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59617d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59618e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59619f;

    /* renamed from: g, reason: collision with root package name */
    public long f59620g;

    @Override // jx3.a
    public int g() {
        return 23677;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59617d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59618e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59619f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59620g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f59617d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f59618e);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f59619f);
        stringBuffer.append("\r\nExptType:");
        stringBuffer.append(this.f59620g);
        return stringBuffer.toString();
    }
}
