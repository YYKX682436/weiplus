package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class MBADFullLinkReporterStruct extends jx3.a {

    /* renamed from: j, reason: collision with root package name */
    public long f58712j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58706d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58707e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58708f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58709g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58710h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58711i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58713k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58714l = "";

    @Override // jx3.a
    public int g() {
        return 38097;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58706d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58707e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58708f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58709g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58710h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58711i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58712j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58713k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58714l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizName:");
        stringBuffer.append(this.f58706d);
        stringBuffer.append("\r\nBizScene:");
        stringBuffer.append(this.f58707e);
        stringBuffer.append("\r\nTraceId:");
        stringBuffer.append(this.f58708f);
        stringBuffer.append("\r\nFrameSetName:");
        stringBuffer.append(this.f58709g);
        stringBuffer.append("\r\nReportSource:");
        stringBuffer.append(this.f58710h);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58711i);
        stringBuffer.append("\r\nActionTimestamp:");
        stringBuffer.append(this.f58712j);
        stringBuffer.append("\r\nExtraJson:");
        stringBuffer.append(this.f58713k);
        stringBuffer.append("\r\nImplType:");
        stringBuffer.append(this.f58714l);
        return stringBuffer.toString();
    }
}
