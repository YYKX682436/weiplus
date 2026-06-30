package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct */
/* loaded from: classes7.dex */
public final class C7112x2186c744 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.q0 f144316g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144313d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144314e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f144315f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f144317h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f144318i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f144319j = 0;

    @Override // jx3.a
    public int g() {
        return 15853;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144313d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144314e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144315f);
        stringBuffer.append(",");
        cm.q0 q0Var = this.f144316g;
        stringBuffer.append(q0Var != null ? q0Var.f124721d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f144317h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144318i);
        stringBuffer.append(",");
        stringBuffer.append(this.f144319j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f144313d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f144314e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f144315f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f144316g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f144317h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f144318i);
        stringBuffer.append("\r\nWaitingTimeMs:");
        stringBuffer.append(this.f144319j);
        return stringBuffer.toString();
    }
}
