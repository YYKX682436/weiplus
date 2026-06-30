package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderPageExposeStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f57465g;

    /* renamed from: m, reason: collision with root package name */
    public long f57471m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57462d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57463e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57464f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57466h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57467i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57468j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57469k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57470l = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f57472n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f57473o = "";

    @Override // jx3.a
    public int g() {
        return 21874;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57462d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57463e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57464f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57465g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57466h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57467i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57468j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57469k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57470l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57471m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57472n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57473o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f57462d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f57463e);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f57464f);
        stringBuffer.append("\r\nevent_code:");
        stringBuffer.append(this.f57465g);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f57466h);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f57467i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f57468j);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f57469k);
        stringBuffer.append("\r\nref_commentscene:");
        stringBuffer.append(this.f57470l);
        stringBuffer.append("\r\nstayTime:");
        stringBuffer.append(this.f57471m);
        stringBuffer.append("\r\njump_id:");
        stringBuffer.append(this.f57472n);
        stringBuffer.append("\r\nextrainfo:");
        stringBuffer.append(this.f57473o);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct p(java.lang.String str) {
        this.f57469k = b("clicktabcontextid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct q(java.lang.String str) {
        this.f57464f = b("commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct r(java.lang.String str) {
        this.f57466h = b("event_time", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct s(java.lang.String str) {
        this.f57463e = b("findercontextid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct t(java.lang.String str) {
        this.f57467i = b("finderusername", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct u(java.lang.String str) {
        this.f57472n = b("jump_id", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct v(java.lang.String str) {
        this.f57470l = b("ref_commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct w(java.lang.String str) {
        this.f57462d = b("sessionid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct x(java.lang.String str) {
        this.f57468j = b("udf_kv", str, true);
        return this;
    }
}
