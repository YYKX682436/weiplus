package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class WebSearchViewStayDurationStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f62942d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f62943e = "";

    @Override // jx3.a
    public int g() {
        return 21202;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f62942d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62943e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SearchScene:0\r\nEnterScene:0\r\nContent:");
        stringBuffer.append(this.f62942d);
        stringBuffer.append("\r\nstaytime:0\r\nconnectid:");
        stringBuffer.append(this.f62943e);
        return stringBuffer.toString();
    }
}
