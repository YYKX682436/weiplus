package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class MagicBrushClickFunnelReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59044f;

    /* renamed from: h, reason: collision with root package name */
    public long f59046h;

    /* renamed from: i, reason: collision with root package name */
    public long f59047i;

    /* renamed from: j, reason: collision with root package name */
    public long f59048j;

    /* renamed from: k, reason: collision with root package name */
    public long f59049k;

    /* renamed from: l, reason: collision with root package name */
    public int f59050l;

    /* renamed from: n, reason: collision with root package name */
    public long f59052n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59042d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59043e = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59045g = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59051m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f59053o = "";

    @Override // jx3.a
    public int g() {
        return 31860;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59042d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59043e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59044f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59045g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59046h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59047i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59048j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59049k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59050l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59051m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59052n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59053o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizName:");
        stringBuffer.append(this.f59042d);
        stringBuffer.append("\r\nSubScene:");
        stringBuffer.append(this.f59043e);
        stringBuffer.append("\r\nReportTime:");
        stringBuffer.append(this.f59044f);
        stringBuffer.append("\r\nClickId:");
        stringBuffer.append(this.f59045g);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f59046h);
        stringBuffer.append("\r\nEventType:");
        stringBuffer.append(this.f59047i);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59048j);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f59049k);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f59050l);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f59051m);
        stringBuffer.append("\r\nNewReportTime:");
        stringBuffer.append(this.f59052n);
        stringBuffer.append("\r\nCardName:");
        stringBuffer.append(this.f59053o);
        return stringBuffer.toString();
    }
}
