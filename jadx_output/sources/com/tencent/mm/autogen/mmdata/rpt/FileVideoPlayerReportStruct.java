package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class FileVideoPlayerReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56392d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56393e = "";

    @Override // jx3.a
    public int g() {
        return 36617;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56392d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56393e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventId:");
        stringBuffer.append(this.f56392d);
        stringBuffer.append("\r\nEventTime:0\r\nEventParams:");
        stringBuffer.append(this.f56393e);
        return stringBuffer.toString();
    }
}
