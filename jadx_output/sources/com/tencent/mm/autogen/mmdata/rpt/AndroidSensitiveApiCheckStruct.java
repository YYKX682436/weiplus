package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class AndroidSensitiveApiCheckStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55087d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55088e = "";

    @Override // jx3.a
    public int g() {
        return 22948;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55087d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55088e);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ApiName:");
        stringBuffer.append(this.f55087d);
        stringBuffer.append("\r\nApiCaller:");
        stringBuffer.append(this.f55088e);
        stringBuffer.append("\r\nCallCount:0\r\nCacheCallCount:0\r\nRealCallCount:0\r\nDiffCallCount:0");
        return stringBuffer.toString();
    }
}
