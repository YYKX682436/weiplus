package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportTimeCostStruct */
/* loaded from: classes15.dex */
public final class C6721x99869c50 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f140597f;

    /* renamed from: g, reason: collision with root package name */
    public long f140598g;

    /* renamed from: i, reason: collision with root package name */
    public long f140600i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140595d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140596e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140599h = "";

    @Override // jx3.a
    public int g() {
        return 26777;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140595d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140596e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140597f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140598g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140599h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140600i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f140595d);
        stringBuffer.append("\r\nBizName:");
        stringBuffer.append(this.f140596e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f140597f);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f140598g);
        stringBuffer.append("\r\nExtras:");
        stringBuffer.append(this.f140599h);
        stringBuffer.append("\r\nAppStatus:");
        stringBuffer.append(this.f140600i);
        return stringBuffer.toString();
    }
}
