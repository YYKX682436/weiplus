package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveVisitorEnterLiveStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58677d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58678e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58679f = "";

    @Override // jx3.a
    public int g() {
        return 19892;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58677d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58678e);
        stringBuffer.append(",0,0,0,0,0,0,0,");
        stringBuffer.append(this.f58679f);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:0\r\nroomid:");
        stringBuffer.append(this.f58677d);
        stringBuffer.append("\r\nliveid:0\r\nliveuin:");
        stringBuffer.append(this.f58678e);
        stringBuffer.append("\r\nerrcode:0\r\nenterRoomCount:0\r\nexitRoomCount:0\r\ncommentCount:0\r\nheartCount:0\r\nconnectReqCount:0\r\nconnectCount:0\r\nliveusername:");
        stringBuffer.append(this.f58679f);
        stringBuffer.append("\r\nlastTime:0\r\nenterTimestamp:0\r\nexitTimestamp:0\r\nexitChatroomUV:0");
        return stringBuffer.toString();
    }
}
