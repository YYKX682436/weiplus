package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class ILinkVoIPReportLogicStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58451d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58452e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58453f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58454g = "";

    @Override // jx3.a
    public int g() {
        return 28500;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f58451d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58452e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58453f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58454g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:0\r\nroomtype:0\r\nbatteryTemperate:");
        stringBuffer.append(this.f58451d);
        stringBuffer.append("\r\ncpuLoadInfo:");
        stringBuffer.append(this.f58452e);
        stringBuffer.append("\r\nmemoryLoadInfo:");
        stringBuffer.append(this.f58453f);
        stringBuffer.append("\r\nbatteryUsage:");
        stringBuffer.append(this.f58454g);
        stringBuffer.append("\r\nroomid_long:0");
        return stringBuffer.toString();
    }
}
