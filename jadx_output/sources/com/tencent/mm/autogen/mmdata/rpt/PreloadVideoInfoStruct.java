package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class PreloadVideoInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59861d;

    /* renamed from: e, reason: collision with root package name */
    public long f59862e;

    /* renamed from: f, reason: collision with root package name */
    public long f59863f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59864g;

    /* renamed from: h, reason: collision with root package name */
    public long f59865h;

    /* renamed from: i, reason: collision with root package name */
    public int f59866i;

    /* renamed from: j, reason: collision with root package name */
    public long f59867j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59868k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59869l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59870m;

    /* renamed from: n, reason: collision with root package name */
    public long f59871n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f59872o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f59873p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f59874q;

    /* renamed from: r, reason: collision with root package name */
    public int f59875r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f59876s;

    public PreloadVideoInfoStruct() {
        this.f59861d = 0L;
        this.f59862e = 0L;
        this.f59863f = 0L;
        this.f59864g = "";
        this.f59865h = 0L;
        this.f59866i = 0;
        this.f59867j = 0L;
        this.f59868k = "";
        this.f59869l = "";
        this.f59870m = "";
        this.f59871n = 0L;
        this.f59872o = "";
        this.f59873p = "";
        this.f59874q = "";
        this.f59876s = "";
    }

    @Override // jx3.a
    public int g() {
        return 14499;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59861d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59862e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59863f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59864g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59865h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59866i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59867j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59868k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59869l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59870m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59871n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59872o);
        stringBuffer.append(",");
        stringBuffer.append(this.f59873p);
        stringBuffer.append(",");
        stringBuffer.append(this.f59874q);
        stringBuffer.append(",");
        stringBuffer.append(this.f59875r);
        stringBuffer.append(",");
        stringBuffer.append(this.f59876s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DownloadStartTime:");
        stringBuffer.append(this.f59861d);
        stringBuffer.append("\r\nDownloadEndTime:");
        stringBuffer.append(this.f59862e);
        stringBuffer.append("\r\nDownloadSize:");
        stringBuffer.append(this.f59863f);
        stringBuffer.append("\r\nNewMd5:");
        stringBuffer.append(this.f59864g);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f59865h);
        stringBuffer.append("\r\nDownloadSpeed:");
        stringBuffer.append(this.f59866i);
        stringBuffer.append("\r\nHadFinishSize:");
        stringBuffer.append(this.f59867j);
        stringBuffer.append("\r\nCDNIp:");
        stringBuffer.append(this.f59868k);
        stringBuffer.append("\r\nFromUser:");
        stringBuffer.append(this.f59869l);
        stringBuffer.append("\r\nSession:");
        stringBuffer.append(this.f59870m);
        stringBuffer.append("\r\nChatroomNum:");
        stringBuffer.append(this.f59871n);
        stringBuffer.append("\r\nFileId:");
        stringBuffer.append(this.f59872o);
        stringBuffer.append("\r\nSnsUrl:");
        stringBuffer.append(this.f59873p);
        stringBuffer.append("\r\nPublishid:");
        stringBuffer.append(this.f59874q);
        stringBuffer.append("\r\nBackSourceCount:");
        stringBuffer.append(this.f59875r);
        stringBuffer.append("\r\nVideoColdRuleExptGroupId:");
        stringBuffer.append(this.f59876s);
        return stringBuffer.toString();
    }

    public PreloadVideoInfoStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f59861d = 0L;
        this.f59862e = 0L;
        this.f59863f = 0L;
        this.f59864g = "";
        this.f59865h = 0L;
        this.f59866i = 0;
        this.f59867j = 0L;
        this.f59868k = "";
        this.f59869l = "";
        this.f59870m = "";
        this.f59871n = 0L;
        this.f59872o = "";
        this.f59873p = "";
        this.f59874q = "";
        this.f59876s = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 16) {
            java.lang.String[] strArr = new java.lang.String[16];
            java.util.Arrays.fill(strArr, 0, 16, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f59861d = h(split[0]);
        this.f59862e = h(split[1]);
        this.f59863f = h(split[2]);
        this.f59864g = b("NewMd5", split[3], true);
        this.f59865h = h(split[4]);
        this.f59866i = com.tencent.mm.sdk.platformtools.t8.P(split[5], 0);
        this.f59867j = h(split[6]);
        this.f59868k = b("CDNIp", split[7], true);
        this.f59869l = b("FromUser", split[8], true);
        this.f59870m = b("Session", split[9], true);
        this.f59871n = h(split[10]);
        this.f59872o = b("FileId", split[11], true);
        this.f59873p = b("SnsUrl", split[12], true);
        this.f59874q = b("Publishid", split[13], true);
        this.f59875r = com.tencent.mm.sdk.platformtools.t8.P(split[14], 0);
        this.f59876s = b("VideoColdRuleExptGroupId", split[15], true);
    }
}
