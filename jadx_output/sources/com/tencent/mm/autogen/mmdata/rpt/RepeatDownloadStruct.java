package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class RepeatDownloadStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f59988g;

    /* renamed from: j, reason: collision with root package name */
    public int f59991j;

    /* renamed from: l, reason: collision with root package name */
    public int f59993l;

    /* renamed from: m, reason: collision with root package name */
    public int f59994m;

    /* renamed from: d, reason: collision with root package name */
    public long f59985d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59986e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59987f = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59989h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59990i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59992k = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f59995n = "";

    @Override // jx3.a
    public int g() {
        return 29596;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59985d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59986e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59987f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59988g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59989h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59990i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59991j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59992k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59993l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59994m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59995n);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("timing:");
        stringBuffer.append(this.f59985d);
        stringBuffer.append("\r\ntaskID:");
        stringBuffer.append(this.f59986e);
        stringBuffer.append("\r\nmediaID:");
        stringBuffer.append(this.f59987f);
        stringBuffer.append("\r\nrepeatByte:");
        stringBuffer.append(this.f59988g);
        stringBuffer.append("\r\nrepeatSection:");
        stringBuffer.append(this.f59989h);
        stringBuffer.append("\r\nsnsID:");
        stringBuffer.append(this.f59990i);
        stringBuffer.append("\r\ndownloadSize:");
        stringBuffer.append(this.f59991j);
        stringBuffer.append("\r\ndownloadFlag:");
        stringBuffer.append(this.f59992k);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f59993l);
        stringBuffer.append("\r\nfileType:");
        stringBuffer.append(this.f59994m);
        stringBuffer.append("\r\nurl:");
        stringBuffer.append(this.f59995n);
        stringBuffer.append("\r\nfileSize:0");
        return stringBuffer.toString();
    }
}
