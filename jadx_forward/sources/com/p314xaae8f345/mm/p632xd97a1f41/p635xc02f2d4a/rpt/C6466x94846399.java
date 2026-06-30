package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct */
/* loaded from: classes2.dex */
public final class C6466x94846399 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138098d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138099e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138100f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138101g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138102h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138103i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f138104j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f138105k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f138106l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f138107m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f138108n = "";

    @Override // jx3.a
    public int g() {
        return 22947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138098d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138099e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138100f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138101g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138102h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138103i);
        stringBuffer.append(",");
        stringBuffer.append(this.f138104j);
        stringBuffer.append(",");
        stringBuffer.append(this.f138105k);
        stringBuffer.append(",");
        stringBuffer.append(this.f138106l);
        stringBuffer.append(",");
        stringBuffer.append(this.f138107m);
        stringBuffer.append(",");
        stringBuffer.append(this.f138108n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("client_time:");
        stringBuffer.append(this.f138098d);
        stringBuffer.append("\r\npag_id:");
        stringBuffer.append(this.f138099e);
        stringBuffer.append("\r\ntab_id:");
        stringBuffer.append(this.f138100f);
        stringBuffer.append("\r\nsub_tab_id:");
        stringBuffer.append(this.f138101g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f138102h);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f138103i);
        stringBuffer.append("\r\nTabContextID:");
        stringBuffer.append(this.f138104j);
        stringBuffer.append("\r\nSubTabContextID:");
        stringBuffer.append(this.f138105k);
        stringBuffer.append("\r\npg_udf_kv:");
        stringBuffer.append(this.f138106l);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f138107m);
        stringBuffer.append("\r\nswitch_extra:");
        stringBuffer.append(this.f138108n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 p(java.lang.String str) {
        this.f138107m = b("commentscene", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 q(java.lang.String str) {
        this.f138103i = b("contextid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 r(java.lang.String str) {
        this.f138099e = b("pag_id", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 s(java.lang.String str) {
        this.f138106l = b("pg_udf_kv", str, true);
        return this;
    }
}
