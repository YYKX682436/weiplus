package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderBroadcastEidExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56537d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56538e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56539f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56540g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56541h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56542i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56543j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56544k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56545l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56546m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56547n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56548o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f56549p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f56550q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f56551r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f56552s = "";

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct A(java.lang.String str) {
        this.f56540g = b("tab_id", str, true);
        return this;
    }

    @Override // jx3.a
    public int g() {
        return 23057;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56537d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56538e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56539f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56540g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56541h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56542i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56543j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56544k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56545l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56546m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56547n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56548o);
        stringBuffer.append(",");
        stringBuffer.append(this.f56549p);
        stringBuffer.append(",");
        stringBuffer.append(this.f56550q);
        stringBuffer.append(",");
        stringBuffer.append(this.f56551r);
        stringBuffer.append(",");
        stringBuffer.append(this.f56552s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("client_time:");
        stringBuffer.append(this.f56537d);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f56538e);
        stringBuffer.append("\r\nchnl_extra:");
        stringBuffer.append(this.f56539f);
        stringBuffer.append("\r\ntab_id:");
        stringBuffer.append(this.f56540g);
        stringBuffer.append("\r\nsub_tab_id:");
        stringBuffer.append(this.f56541h);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f56542i);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f56543j);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f56544k);
        stringBuffer.append("\r\nTabContextID:");
        stringBuffer.append(this.f56545l);
        stringBuffer.append("\r\nSubTabContextID:");
        stringBuffer.append(this.f56546m);
        stringBuffer.append("\r\npg_udf_kv:");
        stringBuffer.append(this.f56547n);
        stringBuffer.append("\r\nref_commentscene:");
        stringBuffer.append(this.f56548o);
        stringBuffer.append("\r\neid:");
        stringBuffer.append(this.f56549p);
        stringBuffer.append("\r\neld_udf_kv:");
        stringBuffer.append(this.f56550q);
        stringBuffer.append("\r\nswitch_extra:");
        stringBuffer.append(this.f56551r);
        stringBuffer.append("\r\nsession_buffer:");
        stringBuffer.append(this.f56552s);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct p(java.lang.String str) {
        this.f56539f = b("chnl_extra", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct q(java.lang.String str) {
        this.f56544k = b("commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct r(java.lang.String str) {
        this.f56543j = b("contextid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct s(java.lang.String str) {
        this.f56549p = b("eid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct t(java.lang.String str) {
        this.f56550q = b("eld_udf_kv", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct u(java.lang.String str) {
        this.f56538e = b("finderusername", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct v(java.lang.String str) {
        this.f56547n = b("pg_udf_kv", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct w(java.lang.String str) {
        this.f56542i = b("sessionid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct x(java.lang.String str) {
        this.f56546m = b("SubTabContextID", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct y(java.lang.String str) {
        this.f56541h = b("sub_tab_id", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct z(java.lang.String str) {
        this.f56551r = b("switch_extra", str, true);
        return this;
    }
}
