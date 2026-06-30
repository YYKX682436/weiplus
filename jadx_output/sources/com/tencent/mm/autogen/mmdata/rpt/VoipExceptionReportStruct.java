package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class VoipExceptionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61758d;

    /* renamed from: e, reason: collision with root package name */
    public long f61759e;

    @Override // jx3.a
    public int g() {
        return 27080;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f61758d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61759e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ds:0\r\nreasonCode:");
        stringBuffer.append(this.f61758d);
        stringBuffer.append("\r\nrecall:");
        stringBuffer.append(this.f61759e);
        return stringBuffer.toString();
    }
}
