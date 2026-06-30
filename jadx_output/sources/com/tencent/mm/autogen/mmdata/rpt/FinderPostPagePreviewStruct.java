package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderPostPagePreviewStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57546d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57547e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f57548f;

    /* renamed from: g, reason: collision with root package name */
    public long f57549g;

    /* renamed from: h, reason: collision with root package name */
    public long f57550h;

    /* renamed from: i, reason: collision with root package name */
    public long f57551i;

    /* renamed from: j, reason: collision with root package name */
    public long f57552j;

    @Override // jx3.a
    public int g() {
        return 21640;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57546d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57547e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57548f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57549g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57550h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57551i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57552j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PostId:");
        stringBuffer.append(this.f57546d);
        stringBuffer.append("\r\nEditId:");
        stringBuffer.append(this.f57547e);
        stringBuffer.append("\r\nVideoSource:");
        stringBuffer.append(this.f57548f);
        stringBuffer.append("\r\nMediaType:0\r\nPicCnt:");
        stringBuffer.append(this.f57549g);
        stringBuffer.append("\r\nVideoLen:");
        stringBuffer.append(this.f57550h);
        stringBuffer.append("\r\nmediaViewType:");
        stringBuffer.append(this.f57551i);
        stringBuffer.append("\r\npreviewViewScene:");
        stringBuffer.append(this.f57552j);
        return stringBuffer.toString();
    }
}
