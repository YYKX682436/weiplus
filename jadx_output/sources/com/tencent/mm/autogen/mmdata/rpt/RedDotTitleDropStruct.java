package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class RedDotTitleDropStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59924d;

    /* renamed from: i, reason: collision with root package name */
    public long f59929i;

    /* renamed from: j, reason: collision with root package name */
    public long f59930j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59925e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59926f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59927g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59928h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59931k = "";

    @Override // jx3.a
    public int g() {
        return 23363;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59924d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59925e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59926f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59927g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59928h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59929i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59930j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59931k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("reddotCtrlType:");
        stringBuffer.append(this.f59924d);
        stringBuffer.append("\r\nredDotTipsId:");
        stringBuffer.append(this.f59925e);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f59926f);
        stringBuffer.append("\r\nreportText:");
        stringBuffer.append(this.f59927g);
        stringBuffer.append("\r\ntitle:");
        stringBuffer.append(this.f59928h);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f59929i);
        stringBuffer.append("\r\ndropReason:");
        stringBuffer.append(this.f59930j);
        stringBuffer.append("\r\nshowInfoPath:");
        stringBuffer.append(this.f59931k);
        return stringBuffer.toString();
    }
}
