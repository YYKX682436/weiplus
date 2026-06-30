package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct */
/* loaded from: classes.dex */
public final class C6955xb3c7260f extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142612d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f142613e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142614f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142615g = "";

    @Override // jx3.a
    public int g() {
        return 24415;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142612d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142613e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142614f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142615g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f142612d);
        stringBuffer.append("\r\nstepname:");
        stringBuffer.append(this.f142613e);
        stringBuffer.append("\r\nuserrole:");
        stringBuffer.append(this.f142614f);
        stringBuffer.append("\r\ntargetUsername:");
        stringBuffer.append(this.f142615g);
        return stringBuffer.toString();
    }
}
