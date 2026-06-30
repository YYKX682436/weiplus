package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class ring_search_tips_and_historyStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63158d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63159e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63160f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f63161g;

    @Override // jx3.a
    public int g() {
        return 29537;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63158d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63159e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63160f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63161g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f63158d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f63159e);
        stringBuffer.append("\r\nsearch_request_id:");
        stringBuffer.append(this.f63160f);
        stringBuffer.append("\r\nclk_position:");
        stringBuffer.append(this.f63161g);
        return stringBuffer.toString();
    }
}
