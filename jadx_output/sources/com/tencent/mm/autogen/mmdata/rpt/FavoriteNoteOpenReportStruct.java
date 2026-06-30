package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavoriteNoteOpenReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56348d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56349e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56350f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f56351g;

    /* renamed from: h, reason: collision with root package name */
    public int f56352h;

    /* renamed from: i, reason: collision with root package name */
    public int f56353i;

    @Override // jx3.a
    public int g() {
        return 14789;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56348d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56349e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56350f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56351g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56352h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56353i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpenNoteFrom:");
        stringBuffer.append(this.f56348d);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f56349e);
        stringBuffer.append("\r\nnoteid:");
        stringBuffer.append(this.f56350f);
        stringBuffer.append("\r\npicStatus:");
        stringBuffer.append(this.f56351g);
        stringBuffer.append("\r\nowner:");
        stringBuffer.append(this.f56352h);
        stringBuffer.append("\r\npicViewCnt:");
        stringBuffer.append(this.f56353i);
        return stringBuffer.toString();
    }
}
