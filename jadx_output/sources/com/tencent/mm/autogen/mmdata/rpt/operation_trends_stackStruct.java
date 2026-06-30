package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class operation_trends_stackStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f63137d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f63138e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f63139f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f63140g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f63141h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f63142i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f63143j = "";

    @Override // jx3.a
    public int g() {
        return 26069;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,");
        stringBuffer.append(this.f63137d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63138e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63139f);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,");
        stringBuffer.append(this.f63140g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f63141h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63142i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63143j);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("traceId:0\r\nnodeIndex:0\r\nsceneValue:0\r\nsceneName:");
        stringBuffer.append(this.f63137d);
        stringBuffer.append("\r\nsceneDesc:");
        stringBuffer.append(this.f63138e);
        stringBuffer.append("\r\noperatorType:");
        stringBuffer.append(this.f63139f);
        stringBuffer.append("\r\ncountOfLayer:0\r\nenterTime:0\r\nleaveTime:0\r\nduration:0\r\npssSum:0\r\ncode:0\r\nstack:0\r\ngraphics:0\r\njavaHeap:0\r\nnativeHeap:0\r\nsystem:0\r\ntotalPss:0\r\nprivateOther:0\r\ntotalSwap:0\r\nbatteryCapacity:0\r\nincrementPssSum:0\r\nincrementCode:0\r\nincrementStack:0\r\nincrementGraphics:0\r\nincrementJavaHeap:0\r\nincrementNativeHeap:0\r\nincrementSystem:0\r\nincrementTotalPss:0\r\nincrementPrivateOther:0\r\nincrementTotalSwap:0\r\nincrementBatteryCapacity:0\r\nbatteryCurrentNow:0\r\nisChargeAfterEnter:0\r\nstillRunning:");
        stringBuffer.append(this.f63140g);
        stringBuffer.append("\r\nstillRunningCount:0\r\nanythingElse:");
        stringBuffer.append(this.f63141h);
        stringBuffer.append("\r\ntraceHistoriesBeforeEnter:");
        stringBuffer.append(this.f63142i);
        stringBuffer.append("\r\ntraceHistoriesAfterEnter:");
        stringBuffer.append(this.f63143j);
        stringBuffer.append("\r\nrelevanceNodeIndex:0");
        return stringBuffer.toString();
    }
}
