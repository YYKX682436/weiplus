package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SessionFlowMergeStatStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60272d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60273e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60274f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60275g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60276h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60277i = "";

    @Override // jx3.a
    public int g() {
        return 16976;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60272d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60273e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60274f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60275g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60276h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60277i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PId:");
        stringBuffer.append(this.f60272d);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f60273e);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f60274f);
        stringBuffer.append("\r\nSubSeq:");
        stringBuffer.append(this.f60275g);
        stringBuffer.append("\r\nSubSeqSum:");
        stringBuffer.append(this.f60276h);
        stringBuffer.append("\r\nDataContent:");
        stringBuffer.append(this.f60277i);
        return stringBuffer.toString();
    }
}
