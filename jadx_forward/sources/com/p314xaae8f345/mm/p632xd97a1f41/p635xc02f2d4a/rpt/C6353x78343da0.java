package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct */
/* loaded from: classes12.dex */
public final class C6353x78343da0 extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f137021h;

    /* renamed from: n, reason: collision with root package name */
    public cm.b f137027n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137017d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f137018e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f137019f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f137020g = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f137022i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f137023j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f137024k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f137025l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f137026m = 0;

    @Override // jx3.a
    public int g() {
        return 15749;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137017d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137018e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137019f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137020g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137021h ? 1 : 0);
        stringBuffer.append(",");
        stringBuffer.append(this.f137022i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137023j);
        stringBuffer.append(",");
        stringBuffer.append(this.f137024k);
        stringBuffer.append(",");
        stringBuffer.append(this.f137025l);
        stringBuffer.append(",");
        stringBuffer.append(this.f137026m);
        stringBuffer.append(",");
        cm.b bVar = this.f137027n;
        stringBuffer.append(bVar != null ? bVar.f124561d : -1);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f137017d);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f137018e);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f137019f);
        stringBuffer.append("\r\nMsgCreateTime:");
        stringBuffer.append(this.f137020g);
        stringBuffer.append("\r\nIsHdImgBool:");
        stringBuffer.append(this.f137021h);
        stringBuffer.append("\r\nImgSize:");
        stringBuffer.append(this.f137022i);
        stringBuffer.append("\r\nImgWidth:");
        stringBuffer.append(this.f137023j);
        stringBuffer.append("\r\nImgHeight:");
        stringBuffer.append(this.f137024k);
        stringBuffer.append("\r\nStartDownloadTimeStampMs:");
        stringBuffer.append(this.f137025l);
        stringBuffer.append("\r\nFinishDownloadTimeStampMs:");
        stringBuffer.append(this.f137026m);
        stringBuffer.append("\r\nFinishCode:");
        stringBuffer.append(this.f137027n);
        return stringBuffer.toString();
    }
}
