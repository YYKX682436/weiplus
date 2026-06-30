package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct */
/* loaded from: classes2.dex */
public final class C6549xf3595d4e extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f138998g;

    /* renamed from: m, reason: collision with root package name */
    public long f139004m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138995d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138996e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138997f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138999h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f139000i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139001j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f139002k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f139003l = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f139005n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f139006o = "";

    @Override // jx3.a
    public int g() {
        return 21874;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138995d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138996e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138997f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138998g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138999h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139000i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139001j);
        stringBuffer.append(",");
        stringBuffer.append(this.f139002k);
        stringBuffer.append(",");
        stringBuffer.append(this.f139003l);
        stringBuffer.append(",");
        stringBuffer.append(this.f139004m);
        stringBuffer.append(",");
        stringBuffer.append(this.f139005n);
        stringBuffer.append(",");
        stringBuffer.append(this.f139006o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f138995d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f138996e);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f138997f);
        stringBuffer.append("\r\nevent_code:");
        stringBuffer.append(this.f138998g);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f138999h);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f139000i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f139001j);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f139002k);
        stringBuffer.append("\r\nref_commentscene:");
        stringBuffer.append(this.f139003l);
        stringBuffer.append("\r\nstayTime:");
        stringBuffer.append(this.f139004m);
        stringBuffer.append("\r\njump_id:");
        stringBuffer.append(this.f139005n);
        stringBuffer.append("\r\nextrainfo:");
        stringBuffer.append(this.f139006o);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e p(java.lang.String str) {
        this.f139002k = b("clicktabcontextid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e q(java.lang.String str) {
        this.f138997f = b("commentscene", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e r(java.lang.String str) {
        this.f138999h = b("event_time", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e s(java.lang.String str) {
        this.f138996e = b("findercontextid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e t(java.lang.String str) {
        this.f139000i = b("finderusername", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e u(java.lang.String str) {
        this.f139005n = b("jump_id", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e v(java.lang.String str) {
        this.f139003l = b("ref_commentscene", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e w(java.lang.String str) {
        this.f138995d = b("sessionid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e x(java.lang.String str) {
        this.f139001j = b("udf_kv", str, true);
        return this;
    }
}
