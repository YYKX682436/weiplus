package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WCMomentsStarActionReporterLogIDStruct extends jx3.a {

    /* renamed from: j, reason: collision with root package name */
    public long f62090j;

    /* renamed from: d, reason: collision with root package name */
    public long f62084d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62085e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62086f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62087g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f62088h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62089i = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62091k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62092l = 0;

    @Override // jx3.a
    public int g() {
        return 28263;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62084d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62085e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62086f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62087g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62088h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62089i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62090j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62091k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62092l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f62084d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f62085e);
        stringBuffer.append("\r\nentranceType:");
        stringBuffer.append(this.f62086f);
        stringBuffer.append("\r\nfeedID:");
        stringBuffer.append(this.f62087g);
        stringBuffer.append("\r\ncurrentLikeCnt:");
        stringBuffer.append(this.f62088h);
        stringBuffer.append("\r\ncurrentCommentCnt:");
        stringBuffer.append(this.f62089i);
        stringBuffer.append("\r\npublishTime:");
        stringBuffer.append(this.f62090j);
        stringBuffer.append("\r\nuserAlbumVisibleSetting:");
        stringBuffer.append(this.f62091k);
        stringBuffer.append("\r\nprivacyType:");
        stringBuffer.append(this.f62092l);
        return stringBuffer.toString();
    }
}
