package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class EmoticonDetailActivityInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56031d = "";

    @Override // jx3.a
    public int g() {
        return 23532;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56031d);
        stringBuffer.append(",0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pid:");
        stringBuffer.append(this.f56031d);
        stringBuffer.append("\r\nscene:0\r\nchannelLinkExposure:0\r\nchannelLinkClick:0");
        return stringBuffer.toString();
    }
}
