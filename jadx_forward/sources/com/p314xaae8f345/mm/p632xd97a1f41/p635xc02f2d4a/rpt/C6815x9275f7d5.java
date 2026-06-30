package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PreloadVideoInfoStruct */
/* loaded from: classes4.dex */
public final class C6815x9275f7d5 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141394d;

    /* renamed from: e, reason: collision with root package name */
    public long f141395e;

    /* renamed from: f, reason: collision with root package name */
    public long f141396f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141397g;

    /* renamed from: h, reason: collision with root package name */
    public long f141398h;

    /* renamed from: i, reason: collision with root package name */
    public int f141399i;

    /* renamed from: j, reason: collision with root package name */
    public long f141400j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f141401k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f141402l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f141403m;

    /* renamed from: n, reason: collision with root package name */
    public long f141404n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f141405o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f141406p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f141407q;

    /* renamed from: r, reason: collision with root package name */
    public int f141408r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f141409s;

    public C6815x9275f7d5() {
        this.f141394d = 0L;
        this.f141395e = 0L;
        this.f141396f = 0L;
        this.f141397g = "";
        this.f141398h = 0L;
        this.f141399i = 0;
        this.f141400j = 0L;
        this.f141401k = "";
        this.f141402l = "";
        this.f141403m = "";
        this.f141404n = 0L;
        this.f141405o = "";
        this.f141406p = "";
        this.f141407q = "";
        this.f141409s = "";
    }

    @Override // jx3.a
    public int g() {
        return 14499;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141394d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141395e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141396f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141397g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141398h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141399i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141400j);
        stringBuffer.append(",");
        stringBuffer.append(this.f141401k);
        stringBuffer.append(",");
        stringBuffer.append(this.f141402l);
        stringBuffer.append(",");
        stringBuffer.append(this.f141403m);
        stringBuffer.append(",");
        stringBuffer.append(this.f141404n);
        stringBuffer.append(",");
        stringBuffer.append(this.f141405o);
        stringBuffer.append(",");
        stringBuffer.append(this.f141406p);
        stringBuffer.append(",");
        stringBuffer.append(this.f141407q);
        stringBuffer.append(",");
        stringBuffer.append(this.f141408r);
        stringBuffer.append(",");
        stringBuffer.append(this.f141409s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DownloadStartTime:");
        stringBuffer.append(this.f141394d);
        stringBuffer.append("\r\nDownloadEndTime:");
        stringBuffer.append(this.f141395e);
        stringBuffer.append("\r\nDownloadSize:");
        stringBuffer.append(this.f141396f);
        stringBuffer.append("\r\nNewMd5:");
        stringBuffer.append(this.f141397g);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f141398h);
        stringBuffer.append("\r\nDownloadSpeed:");
        stringBuffer.append(this.f141399i);
        stringBuffer.append("\r\nHadFinishSize:");
        stringBuffer.append(this.f141400j);
        stringBuffer.append("\r\nCDNIp:");
        stringBuffer.append(this.f141401k);
        stringBuffer.append("\r\nFromUser:");
        stringBuffer.append(this.f141402l);
        stringBuffer.append("\r\nSession:");
        stringBuffer.append(this.f141403m);
        stringBuffer.append("\r\nChatroomNum:");
        stringBuffer.append(this.f141404n);
        stringBuffer.append("\r\nFileId:");
        stringBuffer.append(this.f141405o);
        stringBuffer.append("\r\nSnsUrl:");
        stringBuffer.append(this.f141406p);
        stringBuffer.append("\r\nPublishid:");
        stringBuffer.append(this.f141407q);
        stringBuffer.append("\r\nBackSourceCount:");
        stringBuffer.append(this.f141408r);
        stringBuffer.append("\r\nVideoColdRuleExptGroupId:");
        stringBuffer.append(this.f141409s);
        return stringBuffer.toString();
    }

    public C6815x9275f7d5(java.lang.String str) {
        java.lang.String[] split;
        this.f141394d = 0L;
        this.f141395e = 0L;
        this.f141396f = 0L;
        this.f141397g = "";
        this.f141398h = 0L;
        this.f141399i = 0;
        this.f141400j = 0L;
        this.f141401k = "";
        this.f141402l = "";
        this.f141403m = "";
        this.f141404n = 0L;
        this.f141405o = "";
        this.f141406p = "";
        this.f141407q = "";
        this.f141409s = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 16) {
            java.lang.String[] strArr = new java.lang.String[16];
            java.util.Arrays.fill(strArr, 0, 16, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f141394d = h(split[0]);
        this.f141395e = h(split[1]);
        this.f141396f = h(split[2]);
        this.f141397g = b("NewMd5", split[3], true);
        this.f141398h = h(split[4]);
        this.f141399i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[5], 0);
        this.f141400j = h(split[6]);
        this.f141401k = b("CDNIp", split[7], true);
        this.f141402l = b("FromUser", split[8], true);
        this.f141403m = b("Session", split[9], true);
        this.f141404n = h(split[10]);
        this.f141405o = b("FileId", split[11], true);
        this.f141406p = b("SnsUrl", split[12], true);
        this.f141407q = b("Publishid", split[13], true);
        this.f141408r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[14], 0);
        this.f141409s = b("VideoColdRuleExptGroupId", split[15], true);
    }
}
