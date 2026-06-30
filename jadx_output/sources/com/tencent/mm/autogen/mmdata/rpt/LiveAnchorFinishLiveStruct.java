package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveAnchorFinishLiveStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58556d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58557e = "";

    @Override // jx3.a
    public int g() {
        return 19891;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58556d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58557e);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:0\r\nroomid:");
        stringBuffer.append(this.f58556d);
        stringBuffer.append("\r\nliveid:0\r\ntopic:");
        stringBuffer.append(this.f58557e);
        stringBuffer.append("\r\nroomRole:0\r\nlastTime:0\r\naudienceCount:0\r\naudienceCountMax:0\r\ncommentCount:0\r\nheartCount:0\r\nconnectCount:0\r\nallowReplay:0\r\nroomCount:0\r\ncostTime:0");
        return stringBuffer.toString();
    }
}
