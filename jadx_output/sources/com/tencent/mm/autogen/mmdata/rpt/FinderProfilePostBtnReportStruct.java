package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderProfilePostBtnReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57655d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57656e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f57657f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f57658g = "";

    @Override // jx3.a
    public int g() {
        return 21923;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57655d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57656e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57657f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f57658g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57655d);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f57656e);
        stringBuffer.append("\r\nFinderContexId:");
        stringBuffer.append(this.f57657f);
        stringBuffer.append("\r\nCommentScene:0\r\nEventCode:0\r\nEventTime:");
        stringBuffer.append(this.f57658g);
        stringBuffer.append("\r\nEventTarget:0");
        return stringBuffer.toString();
    }
}
