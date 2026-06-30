package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveAnchorLinkMicStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58558d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58559e = "";

    @Override // jx3.a
    public int g() {
        return 19894;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58558d);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f58559e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f58558d);
        stringBuffer.append("\r\nliveid:0\r\nwaitCount:0\r\nallowConnect:0\r\naudienceUin:");
        stringBuffer.append(this.f58559e);
        stringBuffer.append("\r\nactionCode:0\r\nlinkCount:0");
        return stringBuffer.toString();
    }
}
