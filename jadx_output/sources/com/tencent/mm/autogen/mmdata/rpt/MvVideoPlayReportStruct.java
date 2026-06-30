package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class MvVideoPlayReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59608d;

    /* renamed from: h, reason: collision with root package name */
    public long f59612h;

    /* renamed from: i, reason: collision with root package name */
    public long f59613i;

    /* renamed from: j, reason: collision with root package name */
    public long f59614j;

    /* renamed from: l, reason: collision with root package name */
    public long f59616l;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59609e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59610f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59611g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59615k = "";

    @Override // jx3.a
    public int g() {
        return 22222;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59608d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59609e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59610f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59611g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59612h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59613i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59614j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59615k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59616l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f59608d);
        stringBuffer.append("\r\ncontextId:");
        stringBuffer.append(this.f59609e);
        stringBuffer.append("\r\nmvObjectId:");
        stringBuffer.append(this.f59610f);
        stringBuffer.append("\r\nmvNonceId:");
        stringBuffer.append(this.f59611g);
        stringBuffer.append("\r\nFirstFrameTime:");
        stringBuffer.append(this.f59612h);
        stringBuffer.append("\r\nWaittingCount:");
        stringBuffer.append(this.f59613i);
        stringBuffer.append("\r\nPlayTime:");
        stringBuffer.append(this.f59614j);
        stringBuffer.append("\r\nVideoPlayInfo:");
        stringBuffer.append(this.f59615k);
        stringBuffer.append("\r\nVideoErrCount:");
        stringBuffer.append(this.f59616l);
        return stringBuffer.toString();
    }
}
