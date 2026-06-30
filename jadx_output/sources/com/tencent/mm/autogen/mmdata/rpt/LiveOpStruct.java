package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveOpStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58616d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58617e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58618f = "";

    @Override // jx3.a
    public int g() {
        return 19893;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58616d);
        stringBuffer.append(",0,0,0,0,0,0,0,");
        stringBuffer.append(this.f58617e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58618f);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f58616d);
        stringBuffer.append("\r\nliveid:0\r\naudienceUin:0\r\nliveRole:0\r\nroomRole:0\r\naction:0\r\nactionResult:0\r\nactionTS:0\r\naudienceUserName:");
        stringBuffer.append(this.f58617e);
        stringBuffer.append("\r\nanchorusername:");
        stringBuffer.append(this.f58618f);
        stringBuffer.append("\r\naudiencecount:0");
        return stringBuffer.toString();
    }
}
