package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsClipPageEntranceExposeReportStruct */
/* loaded from: classes5.dex */
public final class C6884xcc87063a extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142024d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142025e;

    @Override // jx3.a
    public int g() {
        return 21183;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142024d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142025e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f142024d);
        stringBuffer.append("\r\nexposeType:");
        stringBuffer.append(this.f142025e);
        return stringBuffer.toString();
    }
}
