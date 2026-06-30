package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct */
/* loaded from: classes2.dex */
public final class C6465xc36db3c4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138087e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138088f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138089g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138090h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138091i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f138092j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f138093k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f138094l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f138095m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f138096n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f138097o = "";

    @Override // jx3.a
    public int g() {
        return 22946;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138086d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138087e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138088f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138089g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138090h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138091i);
        stringBuffer.append(",");
        stringBuffer.append(this.f138092j);
        stringBuffer.append(",");
        stringBuffer.append(this.f138093k);
        stringBuffer.append(",");
        stringBuffer.append(this.f138094l);
        stringBuffer.append(",");
        stringBuffer.append(this.f138095m);
        stringBuffer.append(",");
        stringBuffer.append(this.f138096n);
        stringBuffer.append(",");
        stringBuffer.append(this.f138097o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("client_time:");
        stringBuffer.append(this.f138086d);
        stringBuffer.append("\r\npag_id:");
        stringBuffer.append(this.f138087e);
        stringBuffer.append("\r\ntab_id:");
        stringBuffer.append(this.f138088f);
        stringBuffer.append("\r\nsub_tab_id:");
        stringBuffer.append(this.f138089g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f138090h);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f138091i);
        stringBuffer.append("\r\nTabContextID:");
        stringBuffer.append(this.f138092j);
        stringBuffer.append("\r\nSubTabContextID:");
        stringBuffer.append(this.f138093k);
        stringBuffer.append("\r\npg_udf_kv:");
        stringBuffer.append(this.f138094l);
        stringBuffer.append("\r\nref_page_id:");
        stringBuffer.append(this.f138095m);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f138096n);
        stringBuffer.append("\r\nswitch_extra:");
        stringBuffer.append(this.f138097o);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 p(java.lang.String str) {
        this.f138096n = b("commentscene", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 q(java.lang.String str) {
        this.f138091i = b("contextid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 r(java.lang.String str) {
        this.f138087e = b("pag_id", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 s(java.lang.String str) {
        this.f138094l = b("pg_udf_kv", str, true);
        return this;
    }
}
