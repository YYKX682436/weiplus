package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class VideoPlayReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61595e;

    /* renamed from: f, reason: collision with root package name */
    public long f61596f;

    /* renamed from: g, reason: collision with root package name */
    public long f61597g;

    /* renamed from: i, reason: collision with root package name */
    public long f61599i;

    /* renamed from: k, reason: collision with root package name */
    public long f61601k;

    /* renamed from: l, reason: collision with root package name */
    public long f61602l;

    /* renamed from: m, reason: collision with root package name */
    public long f61603m;

    /* renamed from: n, reason: collision with root package name */
    public long f61604n;

    /* renamed from: o, reason: collision with root package name */
    public long f61605o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61594d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61598h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61600j = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f61606p = "";

    @Override // jx3.a
    public int g() {
        return 25000;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61594d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61595e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61596f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61597g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61598h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61599i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61600j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61601k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61602l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61603m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61604n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61605o);
        stringBuffer.append(",");
        stringBuffer.append(this.f61606p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FileId:");
        stringBuffer.append(this.f61594d);
        stringBuffer.append("\r\nOriginSize:");
        stringBuffer.append(this.f61595e);
        stringBuffer.append("\r\nCompressSize:");
        stringBuffer.append(this.f61596f);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f61597g);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f61598h);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f61599i);
        stringBuffer.append("\r\nSenderUserName:");
        stringBuffer.append(this.f61600j);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61601k);
        stringBuffer.append("\r\nOriginLoadingTime:");
        stringBuffer.append(this.f61602l);
        stringBuffer.append("\r\nVideoPlayTime:");
        stringBuffer.append(this.f61603m);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f61604n);
        stringBuffer.append("\r\nOverWriteMsgID:");
        stringBuffer.append(this.f61605o);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f61606p);
        return stringBuffer.toString();
    }
}
