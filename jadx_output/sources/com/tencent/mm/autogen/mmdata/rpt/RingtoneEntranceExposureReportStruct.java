package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class RingtoneEntranceExposureReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60061d;

    /* renamed from: e, reason: collision with root package name */
    public long f60062e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60063f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60064g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60065h = "";

    @Override // jx3.a
    public int g() {
        return 24336;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60061d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60062e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60063f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60064g);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f60065h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("wording_type:");
        stringBuffer.append(this.f60061d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f60062e);
        stringBuffer.append("\r\nwording:");
        stringBuffer.append(this.f60063f);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f60064g);
        stringBuffer.append("\r\ntouin:0\r\ntitle_type:0\r\nUserName:");
        stringBuffer.append(this.f60065h);
        return stringBuffer.toString();
    }
}
