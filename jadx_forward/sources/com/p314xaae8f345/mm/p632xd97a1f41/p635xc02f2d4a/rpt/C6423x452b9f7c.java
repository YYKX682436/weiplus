package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct */
/* loaded from: classes11.dex */
public final class C6423x452b9f7c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137645d;

    /* renamed from: e, reason: collision with root package name */
    public long f137646e;

    /* renamed from: g, reason: collision with root package name */
    public long f137648g;

    /* renamed from: i, reason: collision with root package name */
    public long f137650i;

    /* renamed from: j, reason: collision with root package name */
    public long f137651j;

    /* renamed from: k, reason: collision with root package name */
    public long f137652k;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137647f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137649h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f137653l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f137654m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f137655n = "";

    @Override // jx3.a
    public int g() {
        return 25996;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137645d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137646e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137647f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137648g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137649h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137650i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137651j);
        stringBuffer.append(",");
        stringBuffer.append(this.f137652k);
        stringBuffer.append(",");
        stringBuffer.append(this.f137653l);
        stringBuffer.append(",");
        stringBuffer.append(this.f137654m);
        stringBuffer.append(",");
        stringBuffer.append(this.f137655n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MsgCount:");
        stringBuffer.append(this.f137645d);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f137646e);
        stringBuffer.append("\r\nLastMsgId:");
        stringBuffer.append(this.f137647f);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f137648g);
        stringBuffer.append("\r\nMsgCreateTime:");
        stringBuffer.append(this.f137649h);
        stringBuffer.append("\r\nIntArg1:");
        stringBuffer.append(this.f137650i);
        stringBuffer.append("\r\nIntArg2:");
        stringBuffer.append(this.f137651j);
        stringBuffer.append("\r\nIntArg3:");
        stringBuffer.append(this.f137652k);
        stringBuffer.append("\r\nStrArg1:");
        stringBuffer.append(this.f137653l);
        stringBuffer.append("\r\nStrArg2:");
        stringBuffer.append(this.f137654m);
        stringBuffer.append("\r\nStrArg3:");
        stringBuffer.append(this.f137655n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c p(java.lang.String str) {
        this.f137647f = b("LastMsgId", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c q(java.lang.String str) {
        this.f137649h = b("MsgCreateTime", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c r(java.lang.String str) {
        this.f137653l = b("StrArg1", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c s(java.lang.String str) {
        this.f137654m = b("StrArg2", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c t(java.lang.String str) {
        this.f137655n = b("StrArg3", str, true);
        return this;
    }
}
