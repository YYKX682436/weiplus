package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySystemProcessReadyStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.q0 f62783g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62780d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62781e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62782f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62784h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62785i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62786j = 0;

    @Override // jx3.a
    public int g() {
        return 15853;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62780d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62781e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62782f);
        stringBuffer.append(",");
        cm.q0 q0Var = this.f62783g;
        stringBuffer.append(q0Var != null ? q0Var.f43188d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62784h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62785i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62786j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62780d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62781e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62782f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62783g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62784h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62785i);
        stringBuffer.append("\r\nWaitingTimeMs:");
        stringBuffer.append(this.f62786j);
        return stringBuffer.toString();
    }
}
