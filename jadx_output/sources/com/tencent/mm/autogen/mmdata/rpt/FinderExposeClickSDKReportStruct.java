package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderExposeClickSDKReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56741d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56742e = "";

    @Override // jx3.a
    public int g() {
        return 25496;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56741d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56742e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventId:");
        stringBuffer.append(this.f56741d);
        stringBuffer.append("\r\nEventTime:0\r\nEventParams:");
        stringBuffer.append(this.f56742e);
        return stringBuffer.toString();
    }
}
