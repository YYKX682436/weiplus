package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteOpenReportStruct */
/* loaded from: classes12.dex */
public final class C6448xa7d86d81 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137881d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137882e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137883f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f137884g;

    /* renamed from: h, reason: collision with root package name */
    public int f137885h;

    /* renamed from: i, reason: collision with root package name */
    public int f137886i;

    @Override // jx3.a
    public int g() {
        return 14789;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137881d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137882e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137883f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137884g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137885h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137886i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpenNoteFrom:");
        stringBuffer.append(this.f137881d);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f137882e);
        stringBuffer.append("\r\nnoteid:");
        stringBuffer.append(this.f137883f);
        stringBuffer.append("\r\npicStatus:");
        stringBuffer.append(this.f137884g);
        stringBuffer.append("\r\nowner:");
        stringBuffer.append(this.f137885h);
        stringBuffer.append("\r\npicViewCnt:");
        stringBuffer.append(this.f137886i);
        return stringBuffer.toString();
    }
}
