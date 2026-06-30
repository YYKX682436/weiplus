package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderLbsCardActionReportStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f56993g;

    /* renamed from: h, reason: collision with root package name */
    public long f56994h;

    /* renamed from: i, reason: collision with root package name */
    public long f56995i;

    /* renamed from: k, reason: collision with root package name */
    public long f56997k;

    /* renamed from: n, reason: collision with root package name */
    public long f57000n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56990d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56991e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56992f = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56996j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56998l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56999m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f57001o = "";

    @Override // jx3.a
    public int g() {
        return 21564;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56990d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56991e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56992f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56993g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56994h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56995i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56996j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56997k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56998l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56999m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57000n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57001o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Sessionid:");
        stringBuffer.append(this.f56990d);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f56991e);
        stringBuffer.append("\r\nclickTabContextId:");
        stringBuffer.append(this.f56992f);
        stringBuffer.append("\r\nrefreshTime:");
        stringBuffer.append(this.f56993g);
        stringBuffer.append("\r\nclickType:");
        stringBuffer.append(this.f56994h);
        stringBuffer.append("\r\nclickTime:");
        stringBuffer.append(this.f56995i);
        stringBuffer.append("\r\ncardid:");
        stringBuffer.append(this.f56996j);
        stringBuffer.append("\r\ncardIcon:");
        stringBuffer.append(this.f56997k);
        stringBuffer.append("\r\ncardTag:");
        stringBuffer.append(this.f56998l);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f56999m);
        stringBuffer.append("\r\nfeedIndex:");
        stringBuffer.append(this.f57000n);
        stringBuffer.append("\r\nSessionBuffer:");
        stringBuffer.append(this.f57001o);
        return stringBuffer.toString();
    }
}
