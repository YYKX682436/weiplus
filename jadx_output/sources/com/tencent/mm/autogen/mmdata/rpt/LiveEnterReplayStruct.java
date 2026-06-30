package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveEnterReplayStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58576d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58577e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58578f = "";

    @Override // jx3.a
    public int g() {
        return 19897;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58576d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58577e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58578f);
        stringBuffer.append(",0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f58576d);
        stringBuffer.append("\r\nliveid:0\r\ntopic:");
        stringBuffer.append(this.f58577e);
        stringBuffer.append("\r\nliveusername:");
        stringBuffer.append(this.f58578f);
        stringBuffer.append("\r\nscene:0\r\nliveRole:0\r\nroomRole:0\r\nreplayStatusEnd:0\r\nreplayStatusBegin:0");
        return stringBuffer.toString();
    }
}
