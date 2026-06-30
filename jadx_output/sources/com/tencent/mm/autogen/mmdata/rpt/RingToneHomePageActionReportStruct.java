package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class RingToneHomePageActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60022d;

    /* renamed from: f, reason: collision with root package name */
    public long f60024f;

    /* renamed from: i, reason: collision with root package name */
    public long f60027i;

    /* renamed from: j, reason: collision with root package name */
    public long f60028j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60023e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60025g = "";

    /* renamed from: h, reason: collision with root package name */
    public final int f60026h = -1;

    @Override // jx3.a
    public int g() {
        return 23612;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60022d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60023e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60024f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60025g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60026h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60027i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60028j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f60022d);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f60023e);
        stringBuffer.append("\r\nfeedtype:");
        stringBuffer.append(this.f60024f);
        stringBuffer.append("\r\ntousername:");
        stringBuffer.append(this.f60025g);
        stringBuffer.append("\r\nis_individual:");
        stringBuffer.append(this.f60026h);
        stringBuffer.append("\r\nis_valid:");
        stringBuffer.append(this.f60027i);
        stringBuffer.append("\r\nis_vibrate:");
        stringBuffer.append(this.f60028j);
        return stringBuffer.toString();
    }
}
