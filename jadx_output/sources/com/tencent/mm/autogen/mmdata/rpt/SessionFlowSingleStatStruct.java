package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SessionFlowSingleStatStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60278d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60279e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60280f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60281g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60282h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60283i = "";

    @Override // jx3.a
    public int g() {
        return 16974;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60278d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60279e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60280f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60281g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60282h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60283i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PId:");
        stringBuffer.append(this.f60278d);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f60279e);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f60280f);
        stringBuffer.append("\r\nSubSeq:");
        stringBuffer.append(this.f60281g);
        stringBuffer.append("\r\nSubSeqSum:");
        stringBuffer.append(this.f60282h);
        stringBuffer.append("\r\nDataContent:");
        stringBuffer.append(this.f60283i);
        return stringBuffer.toString();
    }
}
