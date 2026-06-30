package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveReplayOpStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58651d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58652e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58653f = "";

    @Override // jx3.a
    public int g() {
        return 19898;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58651d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58652e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58653f);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f58651d);
        stringBuffer.append("\r\nliveid:0\r\ntopic:");
        stringBuffer.append(this.f58652e);
        stringBuffer.append("\r\nliveusername:");
        stringBuffer.append(this.f58653f);
        stringBuffer.append("\r\nliveRole:0\r\nroomRole:0\r\nwholeTime:0\r\nviewTime:0");
        return stringBuffer.toString();
    }
}
