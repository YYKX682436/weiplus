package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MultiDevSwitcherReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59299d = "";

    @Override // jx3.a
    public int g() {
        return 23533;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f59299d);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:0\r\nToIconType:0\r\nToDeviceID:");
        stringBuffer.append(this.f59299d);
        return stringBuffer.toString();
    }
}
