package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WACanvasJSExceptionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61903d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61904e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61905f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f61906g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f61907h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61908i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f61909j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f61910k = "";

    @Override // jx3.a
    public int g() {
        return 23410;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61903d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61904e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61905f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61906g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61907h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61908i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61909j);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f61910k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizType:");
        stringBuffer.append(this.f61903d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f61904e);
        stringBuffer.append("\r\nErrorType:");
        stringBuffer.append(this.f61905f);
        stringBuffer.append("\r\nErrorName:");
        stringBuffer.append(this.f61906g);
        stringBuffer.append("\r\nErrorStack:");
        stringBuffer.append(this.f61907h);
        stringBuffer.append("\r\nErrorMessage:");
        stringBuffer.append(this.f61908i);
        stringBuffer.append("\r\nLibVersion:");
        stringBuffer.append(this.f61909j);
        stringBuffer.append("\r\nLibBuildTime:0\r\nJsVMType:0\r\nIsMainContext:0\r\nContextName:");
        stringBuffer.append(this.f61910k);
        return stringBuffer.toString();
    }
}
