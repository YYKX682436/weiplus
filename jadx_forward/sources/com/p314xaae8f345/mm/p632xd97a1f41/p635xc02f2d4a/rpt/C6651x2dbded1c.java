package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ILinkVoIPReportLogicStruct */
/* loaded from: classes.dex */
public final class C6651x2dbded1c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f139984d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139985e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f139986f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f139987g = "";

    @Override // jx3.a
    public int g() {
        return 28500;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f139984d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139985e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139986f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139987g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:0\r\nroomtype:0\r\nbatteryTemperate:");
        stringBuffer.append(this.f139984d);
        stringBuffer.append("\r\ncpuLoadInfo:");
        stringBuffer.append(this.f139985e);
        stringBuffer.append("\r\nmemoryLoadInfo:");
        stringBuffer.append(this.f139986f);
        stringBuffer.append("\r\nbatteryUsage:");
        stringBuffer.append(this.f139987g);
        stringBuffer.append("\r\nroomid_long:0");
        return stringBuffer.toString();
    }
}
