package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class BrandPluginTemplateMsgReportStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f55450h;

    /* renamed from: j, reason: collision with root package name */
    public long f55452j;

    /* renamed from: k, reason: collision with root package name */
    public long f55453k;

    /* renamed from: n, reason: collision with root package name */
    public long f55456n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55446d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55447e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55448f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55449g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55451i = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55454l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55455m = "";

    @Override // jx3.a
    public int g() {
        return 36440;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55446d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55447e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55448f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55449g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55450h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55451i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55452j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55453k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55454l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55455m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55456n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("username:");
        stringBuffer.append(this.f55446d);
        stringBuffer.append("\r\ntemplateId:");
        stringBuffer.append(this.f55447e);
        stringBuffer.append("\r\nmsgTitle:");
        stringBuffer.append(this.f55448f);
        stringBuffer.append("\r\nmsgContent:");
        stringBuffer.append(this.f55449g);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f55450h);
        stringBuffer.append("\r\nopTimestamp:");
        stringBuffer.append(this.f55451i);
        stringBuffer.append("\r\njumpType:");
        stringBuffer.append(this.f55452j);
        stringBuffer.append("\r\nlocation:");
        stringBuffer.append(this.f55453k);
        stringBuffer.append("\r\nweappMsgId:");
        stringBuffer.append(this.f55454l);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f55455m);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f55456n);
        return stringBuffer.toString();
    }
}
