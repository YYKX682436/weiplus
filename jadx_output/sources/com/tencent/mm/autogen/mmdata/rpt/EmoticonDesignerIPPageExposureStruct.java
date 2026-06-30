package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class EmoticonDesignerIPPageExposureStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56025d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56026e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56027f = "";

    @Override // jx3.a
    public int g() {
        return 27617;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56025d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56026e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56027f);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f56025d);
        stringBuffer.append("\r\nIPSetKey:");
        stringBuffer.append(this.f56026e);
        stringBuffer.append("\r\nDesUin:");
        stringBuffer.append(this.f56027f);
        stringBuffer.append("\r\nSendClick:0");
        return stringBuffer.toString();
    }
}
