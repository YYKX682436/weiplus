package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class KFContactSessionSearchLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58543d;

    /* renamed from: e, reason: collision with root package name */
    public long f58544e;

    /* renamed from: g, reason: collision with root package name */
    public long f58546g;

    /* renamed from: h, reason: collision with root package name */
    public long f58547h;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58545f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58548i = "";

    @Override // jx3.a
    public int g() {
        return 29105;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58543d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58544e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58545f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58546g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58547h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58548i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f58543d);
        stringBuffer.append("\r\npageType:");
        stringBuffer.append(this.f58544e);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f58545f);
        stringBuffer.append("\r\nresCount:");
        stringBuffer.append(this.f58546g);
        stringBuffer.append("\r\nmatchType:");
        stringBuffer.append(this.f58547h);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f58548i);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct p(java.lang.String str) {
        this.f58545f = b("query", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct q(java.lang.String str) {
        this.f58548i = b("sessionid", str, true);
        return this;
    }
}
