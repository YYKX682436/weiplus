package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class EmoticonStoreActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56070d;

    /* renamed from: e, reason: collision with root package name */
    public int f56071e;

    /* renamed from: f, reason: collision with root package name */
    public int f56072f;

    /* renamed from: j, reason: collision with root package name */
    public long f56076j;

    /* renamed from: k, reason: collision with root package name */
    public long f56077k;

    /* renamed from: l, reason: collision with root package name */
    public long f56078l;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56073g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56074h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56075i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f56079m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56080n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56081o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f56082p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f56083q = 0;

    @Override // jx3.a
    public int g() {
        return 18662;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56070d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56071e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56072f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56073g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56074h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56075i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56076j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56077k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56078l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56079m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56080n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56081o);
        stringBuffer.append(",");
        stringBuffer.append(this.f56082p);
        stringBuffer.append(",");
        stringBuffer.append(this.f56083q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterTime:");
        stringBuffer.append(this.f56070d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f56071e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f56072f);
        stringBuffer.append("\r\npid:");
        stringBuffer.append(this.f56073g);
        stringBuffer.append("\r\ninfo:");
        stringBuffer.append(this.f56074h);
        stringBuffer.append("\r\nindex:");
        stringBuffer.append(this.f56075i);
        stringBuffer.append("\r\nentrance_scene:");
        stringBuffer.append(this.f56076j);
        stringBuffer.append("\r\nlinkID:");
        stringBuffer.append(this.f56077k);
        stringBuffer.append("\r\nlinkStatus:");
        stringBuffer.append(this.f56078l);
        stringBuffer.append("\r\nlinkReportInfo:");
        stringBuffer.append(this.f56079m);
        stringBuffer.append("\r\nlinkIDStr:");
        stringBuffer.append(this.f56080n);
        stringBuffer.append("\r\nlinkStatusStr:");
        stringBuffer.append(this.f56081o);
        stringBuffer.append("\r\nrequestId:");
        stringBuffer.append(this.f56082p);
        stringBuffer.append("\r\nis_teenager:");
        stringBuffer.append(this.f56083q);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct p(java.lang.String str) {
        this.f56075i = b(ya.b.INDEX, str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct q(java.lang.String str) {
        this.f56074h = b("info", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct r(java.lang.String str) {
        this.f56080n = b("linkIDStr", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct s(java.lang.String str) {
        this.f56079m = b("linkReportInfo", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct t(java.lang.String str) {
        this.f56081o = b("linkStatusStr", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct u(java.lang.String str) {
        this.f56073g = b("pid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct v(java.lang.String str) {
        this.f56082p = b("requestId", str, true);
        return this;
    }
}
