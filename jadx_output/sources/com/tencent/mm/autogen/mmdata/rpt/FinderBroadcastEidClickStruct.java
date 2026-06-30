package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderBroadcastEidClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56522d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56523e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56524f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56525g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56526h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56527i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56528j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56529k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56530l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56531m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56532n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56533o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f56534p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f56535q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f56536r = "";

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct A(java.lang.String str) {
        this.f56530l = b("TabContextID", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct B(java.lang.String str) {
        this.f56525g = b("tab_id", str, true);
        return this;
    }

    @Override // jx3.a
    public int g() {
        return 23059;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56522d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56523e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56524f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56525g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56526h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56527i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56528j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56529k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56530l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56531m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56532n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56533o);
        stringBuffer.append(",");
        stringBuffer.append(this.f56534p);
        stringBuffer.append(",");
        stringBuffer.append(this.f56535q);
        stringBuffer.append(",");
        stringBuffer.append(this.f56536r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("client_time:");
        stringBuffer.append(this.f56522d);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f56523e);
        stringBuffer.append("\r\nchnl_extra:");
        stringBuffer.append(this.f56524f);
        stringBuffer.append("\r\ntab_id:");
        stringBuffer.append(this.f56525g);
        stringBuffer.append("\r\nsub_tab_id:");
        stringBuffer.append(this.f56526h);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f56527i);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f56528j);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f56529k);
        stringBuffer.append("\r\nTabContextID:");
        stringBuffer.append(this.f56530l);
        stringBuffer.append("\r\nSubTabContextID:");
        stringBuffer.append(this.f56531m);
        stringBuffer.append("\r\npg_udf_kv:");
        stringBuffer.append(this.f56532n);
        stringBuffer.append("\r\neid:");
        stringBuffer.append(this.f56533o);
        stringBuffer.append("\r\neld_udf_kv:");
        stringBuffer.append(this.f56534p);
        stringBuffer.append("\r\nswitch_extra:");
        stringBuffer.append(this.f56535q);
        stringBuffer.append("\r\nsession_buffer:");
        stringBuffer.append(this.f56536r);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct p(java.lang.String str) {
        this.f56524f = b("chnl_extra", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct q(java.lang.String str) {
        this.f56529k = b("commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct r(java.lang.String str) {
        this.f56528j = b("contextid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct s(java.lang.String str) {
        this.f56533o = b("eid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct t(java.lang.String str) {
        this.f56534p = b("eld_udf_kv", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct u(java.lang.String str) {
        this.f56523e = b("finderusername", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct v(java.lang.String str) {
        this.f56532n = b("pg_udf_kv", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct w(java.lang.String str) {
        this.f56527i = b("sessionid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct x(java.lang.String str) {
        this.f56531m = b("SubTabContextID", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct y(java.lang.String str) {
        this.f56526h = b("sub_tab_id", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct z(java.lang.String str) {
        this.f56535q = b("switch_extra", str, true);
        return this;
    }
}
