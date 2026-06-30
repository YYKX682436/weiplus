package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FTSSeachSimilarImgActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56142d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56143e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56144f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56145g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56146h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f56147i;

    @Override // jx3.a
    public int g() {
        return 22411;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56142d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56143e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56144f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56145g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56146h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56147i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f56142d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f56143e);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f56144f);
        stringBuffer.append("\r\nDocId:");
        stringBuffer.append(this.f56145g);
        stringBuffer.append("\r\nPicMD5:");
        stringBuffer.append(this.f56146h);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f56147i);
        return stringBuffer.toString();
    }
}
