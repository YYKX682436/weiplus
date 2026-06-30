package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class widgetPreloadActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f63220d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f63221e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f63222f = "";

    @Override // jx3.a
    public int g() {
        return 15778;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63220d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f63221e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63222f);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f63220d);
        stringBuffer.append("\r\nappVersion:0\r\npkgMd5:");
        stringBuffer.append(this.f63221e);
        stringBuffer.append("\r\ndownloadUrl:");
        stringBuffer.append(this.f63222f);
        stringBuffer.append("\r\nisSuccess:0\r\ntimeCostInMs:0\r\ntimeStampInMs:0\r\ntotalLen:0");
        return stringBuffer.toString();
    }
}
