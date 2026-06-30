package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FinderIsDaWangStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56960d;

    /* renamed from: e, reason: collision with root package name */
    public long f56961e;

    @Override // jx3.a
    public int g() {
        return 22554;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56960d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56961e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isOnDawang:");
        stringBuffer.append(this.f56960d);
        stringBuffer.append("\r\nnetType:");
        stringBuffer.append(this.f56961e);
        return stringBuffer.toString();
    }
}
