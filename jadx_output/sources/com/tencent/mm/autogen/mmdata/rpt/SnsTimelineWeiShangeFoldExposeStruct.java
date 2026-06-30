package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsTimelineWeiShangeFoldExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60739d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60740e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60741f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f60742g;

    /* renamed from: h, reason: collision with root package name */
    public int f60743h;

    /* renamed from: i, reason: collision with root package name */
    public int f60744i;

    /* renamed from: j, reason: collision with root package name */
    public long f60745j;

    /* renamed from: k, reason: collision with root package name */
    public long f60746k;

    /* renamed from: l, reason: collision with root package name */
    public long f60747l;

    @Override // jx3.a
    public int g() {
        return 21340;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60739d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60740e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60741f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60742g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60743h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60744i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60745j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60746k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60747l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60739d);
        stringBuffer.append("\r\nFoldedBlockId:");
        stringBuffer.append(this.f60740e);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f60741f);
        stringBuffer.append("\r\nFeedCount:");
        stringBuffer.append(this.f60742g);
        stringBuffer.append("\r\nIsExploded:");
        stringBuffer.append(this.f60743h);
        stringBuffer.append("\r\nIsClicked:");
        stringBuffer.append(this.f60744i);
        stringBuffer.append("\r\nTimelineBrowseFeedCount:");
        stringBuffer.append(this.f60745j);
        stringBuffer.append("\r\nLocationIndex:");
        stringBuffer.append(this.f60746k);
        stringBuffer.append("\r\nFoldType:");
        stringBuffer.append(this.f60747l);
        return stringBuffer.toString();
    }
}
