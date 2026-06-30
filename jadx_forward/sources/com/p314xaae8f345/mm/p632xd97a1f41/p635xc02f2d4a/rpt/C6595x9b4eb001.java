package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderThumbCheckReportStruct */
/* loaded from: classes10.dex */
public final class C6595x9b4eb001 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f139445d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f139446e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f139447f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f139448g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f139449h = 0;

    @Override // jx3.a
    public int g() {
        return 26304;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139445d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139446e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139447f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139448g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139449h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ThumbTimeStamp:");
        stringBuffer.append(this.f139445d);
        stringBuffer.append("\r\nCheckThumbDuration:");
        stringBuffer.append(this.f139446e);
        stringBuffer.append("\r\nCoverTimeStamp:");
        stringBuffer.append(this.f139447f);
        stringBuffer.append("\r\nUseAlgorithmCheckBlackFrame:");
        stringBuffer.append(this.f139448g);
        stringBuffer.append("\r\nReplaceUserDefaultThumb:");
        stringBuffer.append(this.f139449h);
        return stringBuffer.toString();
    }
}
