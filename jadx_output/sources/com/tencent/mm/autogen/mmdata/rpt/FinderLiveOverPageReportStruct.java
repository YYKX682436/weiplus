package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveOverPageReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57223d;

    /* renamed from: f, reason: collision with root package name */
    public long f57225f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57224e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57226g = "";

    @Override // jx3.a
    public int g() {
        return 21919;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57223d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57224e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57225f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57226g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f57223d);
        stringBuffer.append("\r\nActionResult:");
        stringBuffer.append(this.f57224e);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f57225f);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f57226g);
        return stringBuffer.toString();
    }
}
