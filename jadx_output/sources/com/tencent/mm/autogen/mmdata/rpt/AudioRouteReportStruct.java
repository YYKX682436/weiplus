package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class AudioRouteReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55341d;

    /* renamed from: e, reason: collision with root package name */
    public int f55342e;

    /* renamed from: f, reason: collision with root package name */
    public int f55343f;

    /* renamed from: h, reason: collision with root package name */
    public int f55345h;

    /* renamed from: i, reason: collision with root package name */
    public long f55346i;

    /* renamed from: j, reason: collision with root package name */
    public int f55347j;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55344g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55348k = "";

    @Override // jx3.a
    public int g() {
        return 28590;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55341d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55342e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55343f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55344g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55345h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55346i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55347j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55348k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportType:");
        stringBuffer.append(this.f55341d);
        stringBuffer.append("\r\nUseCase:");
        stringBuffer.append(this.f55342e);
        stringBuffer.append("\r\nPortType:");
        stringBuffer.append(this.f55343f);
        stringBuffer.append("\r\nRouteTo:");
        stringBuffer.append(this.f55344g);
        stringBuffer.append("\r\nOpType:");
        stringBuffer.append(this.f55345h);
        stringBuffer.append("\r\nPrevDeviceTillTime:");
        stringBuffer.append(this.f55346i);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f55347j);
        stringBuffer.append("\r\nCurrentDevice:");
        stringBuffer.append(this.f55348k);
        return stringBuffer.toString();
    }
}
