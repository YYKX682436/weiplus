package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityWebviewUsageStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.y0 f62863g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62860d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62861e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62862f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62864h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62865i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62866j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62867k = 0;

    @Override // jx3.a
    public int g() {
        return 16368;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62860d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62861e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62862f);
        stringBuffer.append(",");
        cm.y0 y0Var = this.f62863g;
        stringBuffer.append(y0Var != null ? y0Var.f43264d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62864h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62865i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f62866j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62867k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62860d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62861e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62862f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62863g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62864h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f62865i);
        stringBuffer.append("\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0\r\nisPreload:");
        stringBuffer.append(this.f62866j);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62867k);
        return stringBuffer.toString();
    }
}
