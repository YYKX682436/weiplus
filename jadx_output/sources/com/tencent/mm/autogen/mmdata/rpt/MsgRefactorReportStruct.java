package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class MsgRefactorReportStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f59278g;

    /* renamed from: i, reason: collision with root package name */
    public long f59280i;

    /* renamed from: j, reason: collision with root package name */
    public long f59281j;

    /* renamed from: n, reason: collision with root package name */
    public int f59285n;

    /* renamed from: o, reason: collision with root package name */
    public int f59286o;

    /* renamed from: p, reason: collision with root package name */
    public int f59287p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59275d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59276e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59277f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59279h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59282k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59283l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59284m = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f59288q = "";

    @Override // jx3.a
    public int g() {
        return 34985;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59275d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59276e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59277f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59278g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59279h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59280i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59281j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59282k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59283l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59284m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59285n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59286o);
        stringBuffer.append(",");
        stringBuffer.append(this.f59287p);
        stringBuffer.append(",");
        stringBuffer.append(this.f59288q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("innerType:");
        stringBuffer.append(this.f59275d);
        stringBuffer.append("\r\nwholeStack:");
        stringBuffer.append(this.f59276e);
        stringBuffer.append("\r\nrevision:");
        stringBuffer.append(this.f59277f);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f59278g);
        stringBuffer.append("\r\nmsgTalker:");
        stringBuffer.append(this.f59279h);
        stringBuffer.append("\r\nmsgId:");
        stringBuffer.append(this.f59280i);
        stringBuffer.append("\r\nmsgSvrId:");
        stringBuffer.append(this.f59281j);
        stringBuffer.append("\r\nstr1:");
        stringBuffer.append(this.f59282k);
        stringBuffer.append("\r\nstr2:");
        stringBuffer.append(this.f59283l);
        stringBuffer.append("\r\nstr3:");
        stringBuffer.append(this.f59284m);
        stringBuffer.append("\r\nint1:");
        stringBuffer.append(this.f59285n);
        stringBuffer.append("\r\nint2:");
        stringBuffer.append(this.f59286o);
        stringBuffer.append("\r\nint3:");
        stringBuffer.append(this.f59287p);
        stringBuffer.append("\r\nEventParams:");
        stringBuffer.append(this.f59288q);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct p(java.lang.String str) {
        this.f59275d = b("innerType", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct q(java.lang.String str) {
        this.f59277f = b("revision", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct r(java.lang.String str) {
        this.f59282k = b("str1", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct s(java.lang.String str) {
        this.f59283l = b("str2", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct t(java.lang.String str) {
        this.f59284m = b("str3", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct u(java.lang.String str) {
        this.f59276e = b("wholeStack", str, true);
        return this;
    }
}
