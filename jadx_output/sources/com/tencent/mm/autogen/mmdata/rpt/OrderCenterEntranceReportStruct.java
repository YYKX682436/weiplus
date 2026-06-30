package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class OrderCenterEntranceReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59821d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59822e = "";

    @Override // jx3.a
    public int g() {
        return 31116;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59821d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59822e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventName:");
        stringBuffer.append(this.f59821d);
        stringBuffer.append("\r\nEventObject:");
        stringBuffer.append(this.f59822e);
        stringBuffer.append("\r\nEnterFrom:0\r\nRedDotState:0");
        return stringBuffer.toString();
    }
}
