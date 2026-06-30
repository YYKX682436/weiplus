package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderClickMentionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56635d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56636e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56637f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56638g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56639h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f56640i;

    /* renamed from: j, reason: collision with root package name */
    public long f56641j;

    /* renamed from: k, reason: collision with root package name */
    public long f56642k;

    /* renamed from: l, reason: collision with root package name */
    public long f56643l;

    @Override // jx3.a
    public int g() {
        return 19793;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56635d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56636e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56637f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56638g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56639h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56640i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56641j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56642k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56643l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedId:");
        stringBuffer.append(this.f56635d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f56636e);
        stringBuffer.append("\r\nPosterUsername:");
        stringBuffer.append(this.f56637f);
        stringBuffer.append("\r\nViewerUsername:");
        stringBuffer.append(this.f56638g);
        stringBuffer.append("\r\nMentionedUsername:");
        stringBuffer.append(this.f56639h);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f56640i);
        stringBuffer.append("\r\nrecommendtype:");
        stringBuffer.append(this.f56641j);
        stringBuffer.append("\r\nlikecnt:");
        stringBuffer.append(this.f56642k);
        stringBuffer.append("\r\ncommcnt:");
        stringBuffer.append(this.f56643l);
        return stringBuffer.toString();
    }
}
