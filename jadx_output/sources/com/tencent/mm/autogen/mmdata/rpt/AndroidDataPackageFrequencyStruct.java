package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class AndroidDataPackageFrequencyStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55047d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55048e = "";

    @Override // jx3.a
    public int g() {
        return 20808;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,0,0,");
        stringBuffer.append(this.f55047d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55048e);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:0\r\nReqNum:0\r\nRespNum:0\r\nDataStartTime:0\r\nDataEndTime:0\r\nReqContent:");
        stringBuffer.append(this.f55047d);
        stringBuffer.append("\r\nRespContent:");
        stringBuffer.append(this.f55048e);
        stringBuffer.append("\r\nDataNum:0");
        return stringBuffer.toString();
    }
}
