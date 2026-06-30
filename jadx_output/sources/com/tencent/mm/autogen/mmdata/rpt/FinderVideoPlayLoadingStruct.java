package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinderVideoPlayLoadingStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58012e;

    /* renamed from: f, reason: collision with root package name */
    public long f58013f;

    /* renamed from: g, reason: collision with root package name */
    public long f58014g;

    /* renamed from: h, reason: collision with root package name */
    public long f58015h;

    /* renamed from: j, reason: collision with root package name */
    public long f58017j;

    /* renamed from: k, reason: collision with root package name */
    public int f58018k;

    /* renamed from: l, reason: collision with root package name */
    public long f58019l;

    /* renamed from: m, reason: collision with root package name */
    public int f58020m;

    /* renamed from: n, reason: collision with root package name */
    public long f58021n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58011d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58016i = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f58022o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f58023p = "";

    @Override // jx3.a
    public int g() {
        return 31590;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58011d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58012e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58013f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58014g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58015h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58016i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58017j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58018k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58019l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58020m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58021n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58022o);
        stringBuffer.append(",");
        stringBuffer.append(this.f58023p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("NetType:0\r\nFeedId:");
        stringBuffer.append(this.f58011d);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f58012e);
        stringBuffer.append("\r\nFeedPosition:");
        stringBuffer.append(this.f58013f);
        stringBuffer.append("\r\nPlayPosition:");
        stringBuffer.append(this.f58014g);
        stringBuffer.append("\r\nPreloadSize:");
        stringBuffer.append(this.f58015h);
        stringBuffer.append("\r\nSvrBypass:");
        stringBuffer.append(this.f58016i);
        stringBuffer.append("\r\nFirstWaitTimeMs:");
        stringBuffer.append(this.f58017j);
        stringBuffer.append("\r\nPlayWaitCount:");
        stringBuffer.append(this.f58018k);
        stringBuffer.append("\r\nPlayWaitCostMs:");
        stringBuffer.append(this.f58019l);
        stringBuffer.append("\r\nSeekWaitCount:");
        stringBuffer.append(this.f58020m);
        stringBuffer.append("\r\nSeekWaitCostMs:");
        stringBuffer.append(this.f58021n);
        stringBuffer.append("\r\nwaittingDetail:");
        stringBuffer.append(this.f58022o);
        stringBuffer.append("\r\nclientJSON:");
        stringBuffer.append(this.f58023p);
        return stringBuffer.toString();
    }
}
