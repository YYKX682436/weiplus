package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class FinderMultiTaskEnterStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57443e = "";

    @Override // jx3.a
    public int g() {
        return 23850;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57442d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57443e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("opType:");
        stringBuffer.append(this.f57442d);
        stringBuffer.append("\r\nopDesc:");
        stringBuffer.append(this.f57443e);
        return stringBuffer.toString();
    }
}
