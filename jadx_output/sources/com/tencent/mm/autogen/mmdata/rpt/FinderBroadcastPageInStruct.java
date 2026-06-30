package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderBroadcastPageInStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56553d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56554e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56555f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56556g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56557h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56558i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56559j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56560k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56561l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56562m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56563n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56564o = "";

    @Override // jx3.a
    public int g() {
        return 22946;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56553d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56554e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56555f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56556g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56557h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56558i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56559j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56560k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56561l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56562m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56563n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56564o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("client_time:");
        stringBuffer.append(this.f56553d);
        stringBuffer.append("\r\npag_id:");
        stringBuffer.append(this.f56554e);
        stringBuffer.append("\r\ntab_id:");
        stringBuffer.append(this.f56555f);
        stringBuffer.append("\r\nsub_tab_id:");
        stringBuffer.append(this.f56556g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f56557h);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f56558i);
        stringBuffer.append("\r\nTabContextID:");
        stringBuffer.append(this.f56559j);
        stringBuffer.append("\r\nSubTabContextID:");
        stringBuffer.append(this.f56560k);
        stringBuffer.append("\r\npg_udf_kv:");
        stringBuffer.append(this.f56561l);
        stringBuffer.append("\r\nref_page_id:");
        stringBuffer.append(this.f56562m);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f56563n);
        stringBuffer.append("\r\nswitch_extra:");
        stringBuffer.append(this.f56564o);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct p(java.lang.String str) {
        this.f56563n = b("commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct q(java.lang.String str) {
        this.f56558i = b("contextid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct r(java.lang.String str) {
        this.f56554e = b("pag_id", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct s(java.lang.String str) {
        this.f56561l = b("pg_udf_kv", str, true);
        return this;
    }
}
