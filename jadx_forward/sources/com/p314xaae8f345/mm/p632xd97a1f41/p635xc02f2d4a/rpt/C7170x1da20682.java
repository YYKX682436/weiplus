package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ring_search_tips_and_historyStruct */
/* loaded from: classes10.dex */
public final class C7170x1da20682 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144691d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144692e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144693f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f144694g;

    @Override // jx3.a
    public int g() {
        return 29537;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144691d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144692e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144693f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144694g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f144691d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f144692e);
        stringBuffer.append("\r\nsearch_request_id:");
        stringBuffer.append(this.f144693f);
        stringBuffer.append("\r\nclk_position:");
        stringBuffer.append(this.f144694g);
        return stringBuffer.toString();
    }
}
