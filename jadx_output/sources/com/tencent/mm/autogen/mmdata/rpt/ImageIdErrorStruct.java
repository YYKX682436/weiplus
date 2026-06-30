package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ImageIdErrorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58462d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58463e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f58464f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58465g = "";

    @Override // jx3.a
    public int g() {
        return 29289;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58462d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58463e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58464f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58465g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("mmkvId:");
        stringBuffer.append(this.f58462d);
        stringBuffer.append("\r\ndbId:");
        stringBuffer.append(this.f58463e);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f58464f);
        stringBuffer.append("\r\nextraMsg:");
        stringBuffer.append(this.f58465g);
        return stringBuffer.toString();
    }
}
