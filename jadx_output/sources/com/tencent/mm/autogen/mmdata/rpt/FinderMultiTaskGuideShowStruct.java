package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderMultiTaskGuideShowStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57444d;

    /* renamed from: e, reason: collision with root package name */
    public long f57445e;

    /* renamed from: f, reason: collision with root package name */
    public long f57446f;

    @Override // jx3.a
    public int g() {
        return 23863;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57444d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57445e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57446f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExpoFrom:");
        stringBuffer.append(this.f57444d);
        stringBuffer.append("\r\nExitType:");
        stringBuffer.append(this.f57445e);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f57446f);
        return stringBuffer.toString();
    }
}
