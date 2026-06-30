package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VideoBGMSearchStruct */
/* loaded from: classes5.dex */
public final class C6995x32f4d2aa extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143084d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f143085e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143086f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f143087g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143088h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f143089i = 0;

    @Override // jx3.a
    public int g() {
        return 17121;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f143084d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143085e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143086f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143087g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143088h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143089i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SearchID:0\r\nRecommentID:0\r\nQueryContent:");
        stringBuffer.append(this.f143084d);
        stringBuffer.append("\r\nFinishType:");
        stringBuffer.append(this.f143085e);
        stringBuffer.append("\r\nBehavior:");
        stringBuffer.append(this.f143086f);
        stringBuffer.append("\r\nMaxIndex:");
        stringBuffer.append(this.f143087g);
        stringBuffer.append("\r\nNewSearchID:");
        stringBuffer.append(this.f143088h);
        stringBuffer.append("\r\nNewRecommentID:");
        stringBuffer.append(this.f143089i);
        return stringBuffer.toString();
    }
}
