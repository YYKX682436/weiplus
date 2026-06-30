package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class TeenModeBindStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61079d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f61080e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f61081f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61082g = "";

    @Override // jx3.a
    public int g() {
        return 24415;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61079d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61080e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61081f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61082g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f61079d);
        stringBuffer.append("\r\nstepname:");
        stringBuffer.append(this.f61080e);
        stringBuffer.append("\r\nuserrole:");
        stringBuffer.append(this.f61081f);
        stringBuffer.append("\r\ntargetUsername:");
        stringBuffer.append(this.f61082g);
        return stringBuffer.toString();
    }
}
