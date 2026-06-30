package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveAnchorStartLiveStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58560d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58561e = "";

    @Override // jx3.a
    public int g() {
        return 19890;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58560d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58561e);
        stringBuffer.append(",0,0,0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:0\r\nroomid:");
        stringBuffer.append(this.f58560d);
        stringBuffer.append("\r\nrulePop:0\r\nruleCheck:0\r\ntopic:");
        stringBuffer.append(this.f58561e);
        stringBuffer.append("\r\ncustomTopic:0\r\ncameraStatus:0\r\nhorizontalStatus:0\r\nexitType:0\r\nerrcode:0\r\nroomRole:0\r\nroomCount:0");
        return stringBuffer.toString();
    }
}
