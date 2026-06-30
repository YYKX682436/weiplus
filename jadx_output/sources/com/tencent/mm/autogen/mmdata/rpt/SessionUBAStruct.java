package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SessionUBAStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60302d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60303e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60304f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60305g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60306h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60307i = "";

    @Override // jx3.a
    public int g() {
        return 17193;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60302d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60303e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60304f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60305g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60306h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60307i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PId:");
        stringBuffer.append(this.f60302d);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f60303e);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f60304f);
        stringBuffer.append("\r\nSubSeq:");
        stringBuffer.append(this.f60305g);
        stringBuffer.append("\r\nSubSeqSum:");
        stringBuffer.append(this.f60306h);
        stringBuffer.append("\r\nDataContent:");
        stringBuffer.append(this.f60307i);
        return stringBuffer.toString();
    }
}
