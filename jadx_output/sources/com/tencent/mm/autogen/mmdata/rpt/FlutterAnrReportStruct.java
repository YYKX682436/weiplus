package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class FlutterAnrReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58134d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f58135e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58136f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58137g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58138h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58139i = "";

    @Override // jx3.a
    public int g() {
        return 27481;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58134d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58135e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58136f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58137g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58138h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58139i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StackTrace:");
        stringBuffer.append(this.f58134d);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f58135e);
        stringBuffer.append("\r\nIsForeground:");
        stringBuffer.append(this.f58136f);
        stringBuffer.append("\r\nRevision:");
        stringBuffer.append(this.f58137g);
        stringBuffer.append("\r\nLiveEngineCount:0\r\nPhase:");
        stringBuffer.append(this.f58138h);
        stringBuffer.append("\r\nrev:");
        stringBuffer.append(this.f58139i);
        return stringBuffer.toString();
    }
}
