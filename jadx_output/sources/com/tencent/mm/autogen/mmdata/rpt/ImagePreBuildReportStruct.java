package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ImagePreBuildReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58466d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58467e = "";

    @Override // jx3.a
    public int g() {
        return 36733;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58466d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58467e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventId:");
        stringBuffer.append(this.f58466d);
        stringBuffer.append("\r\nEventTime:0\r\nEventParams:");
        stringBuffer.append(this.f58467e);
        return stringBuffer.toString();
    }
}
