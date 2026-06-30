package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class SnsTimelineStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60721d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60722e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f60723f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60724g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f60725h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f60726i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f60727j = "";

    @Override // jx3.a
    public int g() {
        return 16242;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f60721d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60722e);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f60723f);
        stringBuffer.append(",0,0,0,0,");
        stringBuffer.append(this.f60724g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60725h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60726i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60727j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PID:0\r\nPName:");
        stringBuffer.append(this.f60721d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f60722e);
        stringBuffer.append("\r\nfrontTime:0\r\nstayTotalTime:0\r\nscrollTotalTime:0\r\nreportFeedList:");
        stringBuffer.append(this.f60723f);
        stringBuffer.append("\r\nreportFeedCount:0\r\nSeq:0\r\nSubSeq:0\r\nSubSeqSum:0\r\nPerformance:");
        stringBuffer.append(this.f60724g);
        stringBuffer.append("\r\nSessionPageId:");
        stringBuffer.append(this.f60725h);
        stringBuffer.append("\r\nSessionKey:");
        stringBuffer.append(this.f60726i);
        stringBuffer.append("\r\nSvrSessionid:");
        stringBuffer.append(this.f60727j);
        return stringBuffer.toString();
    }
}
