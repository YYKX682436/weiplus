package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FTSSeachSimilarImgActionReportStruct */
/* loaded from: classes12.dex */
public final class C6430x819c75c6 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137675d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137676e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137677f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137678g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137679h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f137680i;

    @Override // jx3.a
    public int g() {
        return 22411;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137675d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137676e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137677f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137678g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137679h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137680i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f137675d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f137676e);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f137677f);
        stringBuffer.append("\r\nDocId:");
        stringBuffer.append(this.f137678g);
        stringBuffer.append("\r\nPicMD5:");
        stringBuffer.append(this.f137679h);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f137680i);
        return stringBuffer.toString();
    }
}
