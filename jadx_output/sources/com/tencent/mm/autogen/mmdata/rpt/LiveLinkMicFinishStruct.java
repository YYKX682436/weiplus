package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveLinkMicFinishStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58608d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58609e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58610f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58611g = "";

    @Override // jx3.a
    public int g() {
        return 19895;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58608d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58609e);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f58610f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58611g);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f58608d);
        stringBuffer.append("\r\nliveid:0\r\nmicid:0\r\nliveuin:");
        stringBuffer.append(this.f58609e);
        stringBuffer.append("\r\nlastTime:0\r\ncloseRole:0\r\nhasVideo:0\r\nliveusername:");
        stringBuffer.append(this.f58610f);
        stringBuffer.append("\r\nlivemicid:");
        stringBuffer.append(this.f58611g);
        stringBuffer.append("\r\nStartTimeStamp:0\r\nEndTimeStamp:0\r\nStartAudienceUV:0\r\nEndAudienceUV:0");
        return stringBuffer.toString();
    }
}
