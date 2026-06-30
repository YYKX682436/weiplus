package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderBroadcastPageOutStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56565d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56566e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56567f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56568g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56569h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56570i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56571j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56572k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56573l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56574m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56575n = "";

    @Override // jx3.a
    public int g() {
        return 22947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56565d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56566e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56567f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56568g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56569h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56570i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56571j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56572k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56573l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56574m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56575n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("client_time:");
        stringBuffer.append(this.f56565d);
        stringBuffer.append("\r\npag_id:");
        stringBuffer.append(this.f56566e);
        stringBuffer.append("\r\ntab_id:");
        stringBuffer.append(this.f56567f);
        stringBuffer.append("\r\nsub_tab_id:");
        stringBuffer.append(this.f56568g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f56569h);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f56570i);
        stringBuffer.append("\r\nTabContextID:");
        stringBuffer.append(this.f56571j);
        stringBuffer.append("\r\nSubTabContextID:");
        stringBuffer.append(this.f56572k);
        stringBuffer.append("\r\npg_udf_kv:");
        stringBuffer.append(this.f56573l);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f56574m);
        stringBuffer.append("\r\nswitch_extra:");
        stringBuffer.append(this.f56575n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct p(java.lang.String str) {
        this.f56574m = b("commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct q(java.lang.String str) {
        this.f56570i = b("contextid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct r(java.lang.String str) {
        this.f56566e = b("pag_id", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct s(java.lang.String str) {
        this.f56573l = b("pg_udf_kv", str, true);
        return this;
    }
}
