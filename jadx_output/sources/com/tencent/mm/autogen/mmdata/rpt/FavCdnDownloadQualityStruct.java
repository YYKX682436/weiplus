package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavCdnDownloadQualityStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56244d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56245e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f56246f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f56247g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f56248h = 0;

    @Override // jx3.a
    public int g() {
        return 31650;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56244d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56245e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56246f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56247g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56248h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("dataType:");
        stringBuffer.append(this.f56244d);
        stringBuffer.append("\r\ndataId:");
        stringBuffer.append(this.f56245e);
        stringBuffer.append("\r\nisThumb:");
        stringBuffer.append(this.f56246f);
        stringBuffer.append("\r\ndownloadRet:");
        stringBuffer.append(this.f56247g);
        stringBuffer.append("\r\nretryCount:");
        stringBuffer.append(this.f56248h);
        return stringBuffer.toString();
    }
}
