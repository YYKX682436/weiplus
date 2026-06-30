package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderModeMessageStruct */
/* loaded from: classes9.dex */
public final class C6540x22e73e33 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138946d;

    /* renamed from: e, reason: collision with root package name */
    public long f138947e;

    /* renamed from: f, reason: collision with root package name */
    public long f138948f;

    @Override // jx3.a
    public int g() {
        return 22554;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138946d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138947e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138948f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("identity:");
        stringBuffer.append(this.f138946d);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f138947e);
        stringBuffer.append("\r\nnotificationType:");
        stringBuffer.append(this.f138948f);
        return stringBuffer.toString();
    }
}
