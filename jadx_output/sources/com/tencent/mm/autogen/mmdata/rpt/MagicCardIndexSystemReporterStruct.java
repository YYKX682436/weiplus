package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class MagicCardIndexSystemReporterStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f59070f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59068d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59069e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59071g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59072h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59073i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59074j = "";

    @Override // jx3.a
    public int g() {
        return 31501;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59068d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59069e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59070f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59071g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59072h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59073i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59074j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizScene:");
        stringBuffer.append(this.f59068d);
        stringBuffer.append("\r\nBizSubScene:");
        stringBuffer.append(this.f59069e);
        stringBuffer.append("\r\nImplType:");
        stringBuffer.append(this.f59070f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59071g);
        stringBuffer.append("\r\nExtraJson:");
        stringBuffer.append(this.f59072h);
        stringBuffer.append("\r\nTraceId:");
        stringBuffer.append(this.f59073i);
        stringBuffer.append("\r\nReportSource:");
        stringBuffer.append(this.f59074j);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct p(java.lang.String str) {
        this.f59071g = b("Action", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct q(java.lang.String str) {
        this.f59072h = b("ExtraJson", str, true);
        return this;
    }
}
