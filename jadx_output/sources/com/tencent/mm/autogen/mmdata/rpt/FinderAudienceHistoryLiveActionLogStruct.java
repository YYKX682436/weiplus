package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderAudienceHistoryLiveActionLogStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56511e;

    /* renamed from: i, reason: collision with root package name */
    public long f56515i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56510d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56512f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56513g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56514h = "";

    @Override // jx3.a
    public int g() {
        return 23432;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f56510d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56511e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56512f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56513g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56514h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56515i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionts:0\r\ncontextid:");
        stringBuffer.append(this.f56510d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f56511e);
        stringBuffer.append("\r\nliveid:");
        stringBuffer.append(this.f56512f);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f56513g);
        stringBuffer.append("\r\nindex:");
        stringBuffer.append(this.f56514h);
        stringBuffer.append("\r\nactionts_new:");
        stringBuffer.append(this.f56515i);
        return stringBuffer.toString();
    }
}
