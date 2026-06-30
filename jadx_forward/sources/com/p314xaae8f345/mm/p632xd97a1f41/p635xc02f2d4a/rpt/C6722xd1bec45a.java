package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct */
/* loaded from: classes7.dex */
public final class C6722xd1bec45a extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f140603f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140601d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140602e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140604g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140605h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140606i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140607j = "";

    @Override // jx3.a
    public int g() {
        return 31501;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140601d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140602e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140603f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140604g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140605h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140606i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140607j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizScene:");
        stringBuffer.append(this.f140601d);
        stringBuffer.append("\r\nBizSubScene:");
        stringBuffer.append(this.f140602e);
        stringBuffer.append("\r\nImplType:");
        stringBuffer.append(this.f140603f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f140604g);
        stringBuffer.append("\r\nExtraJson:");
        stringBuffer.append(this.f140605h);
        stringBuffer.append("\r\nTraceId:");
        stringBuffer.append(this.f140606i);
        stringBuffer.append("\r\nReportSource:");
        stringBuffer.append(this.f140607j);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a p(java.lang.String str) {
        this.f140604g = b("Action", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a q(java.lang.String str) {
        this.f140605h = b("ExtraJson", str, true);
        return this;
    }
}
