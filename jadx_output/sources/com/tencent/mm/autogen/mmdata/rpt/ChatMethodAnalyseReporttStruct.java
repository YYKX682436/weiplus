package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class ChatMethodAnalyseReporttStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55641d = "";

    /* renamed from: e, reason: collision with root package name */
    public final int f55642e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55643f = "";

    /* renamed from: g, reason: collision with root package name */
    public final int f55644g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f55645h = "";

    /* renamed from: i, reason: collision with root package name */
    public final int f55646i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f55647j = -1;

    @Override // jx3.a
    public int g() {
        return 30250;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55641d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55642e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55643f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55644g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55645h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55646i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55647j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MethodName:");
        stringBuffer.append(this.f55641d);
        stringBuffer.append("\r\nMethodCostMs:");
        stringBuffer.append(this.f55642e);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f55643f);
        stringBuffer.append("\r\nFrameIndex:");
        stringBuffer.append(this.f55644g);
        stringBuffer.append("\r\nMethodTrace:");
        stringBuffer.append(this.f55645h);
        stringBuffer.append("\r\nEnableImrove:");
        stringBuffer.append(this.f55646i);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f55647j);
        return stringBuffer.toString();
    }
}
