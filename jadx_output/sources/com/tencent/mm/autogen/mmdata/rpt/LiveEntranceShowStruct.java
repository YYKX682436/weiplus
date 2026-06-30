package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class LiveEntranceShowStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58579d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58580e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f58581f;

    /* renamed from: g, reason: collision with root package name */
    public long f58582g;

    @Override // jx3.a
    public int g() {
        return 19887;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58579d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58580e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58581f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58582g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f58579d);
        stringBuffer.append("\r\nroomid:");
        stringBuffer.append(this.f58580e);
        stringBuffer.append("\r\nreddot:0\r\nroomRole:");
        stringBuffer.append(this.f58581f);
        stringBuffer.append("\r\nPanelPage:");
        stringBuffer.append(this.f58582g);
        return stringBuffer.toString();
    }
}
