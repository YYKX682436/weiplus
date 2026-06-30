package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class CmdProcFailedStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55701d;

    /* renamed from: e, reason: collision with root package name */
    public long f55702e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55703f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f55704g;

    @Override // jx3.a
    public int g() {
        return 26246;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55701d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55702e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55703f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55704g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type:");
        stringBuffer.append(this.f55701d);
        stringBuffer.append("\r\nsvrId:");
        stringBuffer.append(this.f55702e);
        stringBuffer.append("\r\ncrash:");
        stringBuffer.append(this.f55703f);
        stringBuffer.append("\r\ncmdId:");
        stringBuffer.append(this.f55704g);
        return stringBuffer.toString();
    }
}
