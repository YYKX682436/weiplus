package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class mobile_network_registerStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f63135d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f63136e = "";

    @Override // jx3.a
    public int g() {
        return 19822;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f63135d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63136e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:0\r\nRegisterMobile:");
        stringBuffer.append(this.f63135d);
        stringBuffer.append("\r\nDeviceID:");
        stringBuffer.append(this.f63136e);
        stringBuffer.append("\r\nAction:0\r\nResult:0");
        return stringBuffer.toString();
    }
}
