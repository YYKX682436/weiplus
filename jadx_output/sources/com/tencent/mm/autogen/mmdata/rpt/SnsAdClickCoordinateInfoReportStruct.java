package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsAdClickCoordinateInfoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60435d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f60436e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f60437f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f60438g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f60439h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60440i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60441j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60442k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60443l = "";

    @Override // jx3.a
    public int g() {
        return 23600;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60435d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60436e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60437f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60438g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60439h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60440i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60441j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60442k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60443l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContentW:");
        stringBuffer.append(this.f60435d);
        stringBuffer.append("\r\nContentH:");
        stringBuffer.append(this.f60436e);
        stringBuffer.append("\r\nClickX:");
        stringBuffer.append(this.f60437f);
        stringBuffer.append("\r\nClickY:");
        stringBuffer.append(this.f60438g);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f60439h);
        stringBuffer.append("\r\nSnsId:");
        stringBuffer.append(this.f60440i);
        stringBuffer.append("\r\nUxinfo:");
        stringBuffer.append(this.f60441j);
        stringBuffer.append("\r\nExtra1:");
        stringBuffer.append(this.f60442k);
        stringBuffer.append("\r\nExtra2:");
        stringBuffer.append(this.f60443l);
        return stringBuffer.toString();
    }
}
