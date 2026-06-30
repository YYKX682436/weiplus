package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ErrorMsgInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56112d;

    /* renamed from: e, reason: collision with root package name */
    public long f56113e;

    /* renamed from: g, reason: collision with root package name */
    public long f56115g;

    /* renamed from: i, reason: collision with root package name */
    public long f56117i;

    /* renamed from: j, reason: collision with root package name */
    public long f56118j;

    /* renamed from: k, reason: collision with root package name */
    public long f56119k;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56114f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56116h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56120l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56121m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56122n = "";

    @Override // jx3.a
    public int g() {
        return 25996;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56112d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56113e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56114f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56115g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56116h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56117i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56118j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56119k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56120l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56121m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56122n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MsgCount:");
        stringBuffer.append(this.f56112d);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f56113e);
        stringBuffer.append("\r\nLastMsgId:");
        stringBuffer.append(this.f56114f);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f56115g);
        stringBuffer.append("\r\nMsgCreateTime:");
        stringBuffer.append(this.f56116h);
        stringBuffer.append("\r\nIntArg1:");
        stringBuffer.append(this.f56117i);
        stringBuffer.append("\r\nIntArg2:");
        stringBuffer.append(this.f56118j);
        stringBuffer.append("\r\nIntArg3:");
        stringBuffer.append(this.f56119k);
        stringBuffer.append("\r\nStrArg1:");
        stringBuffer.append(this.f56120l);
        stringBuffer.append("\r\nStrArg2:");
        stringBuffer.append(this.f56121m);
        stringBuffer.append("\r\nStrArg3:");
        stringBuffer.append(this.f56122n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct p(java.lang.String str) {
        this.f56114f = b("LastMsgId", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct q(java.lang.String str) {
        this.f56116h = b("MsgCreateTime", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct r(java.lang.String str) {
        this.f56120l = b("StrArg1", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct s(java.lang.String str) {
        this.f56121m = b("StrArg2", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct t(java.lang.String str) {
        this.f56122n = b("StrArg3", str, true);
        return this;
    }
}
