package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAppServiceUSageStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.t f62422g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62419d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62420e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62421f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62423h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62424i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62425j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62426k = 0;

    @Override // jx3.a
    public int g() {
        return 16369;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62419d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62420e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62421f);
        stringBuffer.append(",");
        cm.t tVar = this.f62422g;
        stringBuffer.append(tVar != null ? tVar.f43212d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62423h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62424i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f62425j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62426k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62419d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62420e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62421f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62422g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62423h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f62424i);
        stringBuffer.append("\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0\r\nisPreload:");
        stringBuffer.append(this.f62425j);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62426k);
        return stringBuffer.toString();
    }
}
