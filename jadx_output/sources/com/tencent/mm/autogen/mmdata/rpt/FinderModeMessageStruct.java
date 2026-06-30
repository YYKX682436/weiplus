package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class FinderModeMessageStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57413d;

    /* renamed from: e, reason: collision with root package name */
    public long f57414e;

    /* renamed from: f, reason: collision with root package name */
    public long f57415f;

    @Override // jx3.a
    public int g() {
        return 22554;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57413d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57414e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57415f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("identity:");
        stringBuffer.append(this.f57413d);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f57414e);
        stringBuffer.append("\r\nnotificationType:");
        stringBuffer.append(this.f57415f);
        return stringBuffer.toString();
    }
}
