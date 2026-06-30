package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct */
/* loaded from: classes2.dex */
public final class C6586xa056ef95 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f139362g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139359d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139360e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139361f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139363h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f139364i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139365j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f139366k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f139367l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f139368m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f139369n = "";

    @Override // jx3.a
    public int g() {
        return 21875;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139359d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139360e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139361f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139362g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139363h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139364i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139365j);
        stringBuffer.append(",");
        stringBuffer.append(this.f139366k);
        stringBuffer.append(",");
        stringBuffer.append(this.f139367l);
        stringBuffer.append(",");
        stringBuffer.append(this.f139368m);
        stringBuffer.append(",");
        stringBuffer.append(this.f139369n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f139359d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f139360e);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f139361f);
        stringBuffer.append("\r\nevent_code:");
        stringBuffer.append(this.f139362g);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f139363h);
        stringBuffer.append("\r\neid:");
        stringBuffer.append(this.f139364i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f139365j);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f139366k);
        stringBuffer.append("\r\nref_commentscene:");
        stringBuffer.append(this.f139367l);
        stringBuffer.append("\r\njump_id:");
        stringBuffer.append(this.f139368m);
        stringBuffer.append("\r\nsession_buffer:");
        stringBuffer.append(this.f139369n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 p(java.lang.String str) {
        this.f139361f = b("commentscene", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 q(java.lang.String str) {
        this.f139364i = b("eid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 r(java.lang.String str) {
        this.f139363h = b("event_time", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 s(java.lang.String str) {
        this.f139359d = b("sessionid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 t(java.lang.String str) {
        this.f139365j = b("udf_kv", str, true);
        return this;
    }
}
