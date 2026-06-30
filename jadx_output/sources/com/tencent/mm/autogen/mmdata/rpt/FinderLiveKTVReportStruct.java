package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderLiveKTVReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f57156f;

    /* renamed from: g, reason: collision with root package name */
    public long f57157g;

    /* renamed from: i, reason: collision with root package name */
    public int f57159i;

    /* renamed from: j, reason: collision with root package name */
    public int f57160j;

    /* renamed from: k, reason: collision with root package name */
    public int f57161k;

    /* renamed from: m, reason: collision with root package name */
    public int f57163m;

    /* renamed from: n, reason: collision with root package name */
    public int f57164n;

    /* renamed from: o, reason: collision with root package name */
    public int f57165o;

    /* renamed from: p, reason: collision with root package name */
    public int f57166p;

    /* renamed from: q, reason: collision with root package name */
    public int f57167q;

    /* renamed from: r, reason: collision with root package name */
    public int f57168r;

    /* renamed from: s, reason: collision with root package name */
    public int f57169s;

    /* renamed from: t, reason: collision with root package name */
    public int f57170t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57154d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57155e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57158h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57162l = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f57171u = "";

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f57172v = "";

    @Override // jx3.a
    public int g() {
        return 33921;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57154d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57155e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57156f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57157g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57158h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57159i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57160j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57161k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57162l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57163m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57164n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57165o);
        stringBuffer.append(",");
        stringBuffer.append(this.f57166p);
        stringBuffer.append(",");
        stringBuffer.append(this.f57167q);
        stringBuffer.append(",");
        stringBuffer.append(this.f57168r);
        stringBuffer.append(",");
        stringBuffer.append(this.f57169s);
        stringBuffer.append(",");
        stringBuffer.append(this.f57170t);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57171u);
        stringBuffer.append(",");
        stringBuffer.append(this.f57172v);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SongId:");
        stringBuffer.append(this.f57154d);
        stringBuffer.append("\r\nUniqueId:");
        stringBuffer.append(this.f57155e);
        stringBuffer.append("\r\nLiveId:");
        stringBuffer.append(this.f57156f);
        stringBuffer.append("\r\nObjectId:");
        stringBuffer.append(this.f57157g);
        stringBuffer.append("\r\nAnchorNickName:");
        stringBuffer.append(this.f57158h);
        stringBuffer.append("\r\nNetWorkType:");
        stringBuffer.append(this.f57159i);
        stringBuffer.append("\r\nResultType:");
        stringBuffer.append(this.f57160j);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f57161k);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f57162l);
        stringBuffer.append("\r\nSingCost:");
        stringBuffer.append(this.f57163m);
        stringBuffer.append("\r\nNoteEmpty:");
        stringBuffer.append(this.f57164n);
        stringBuffer.append("\r\nQrcEmpty:");
        stringBuffer.append(this.f57165o);
        stringBuffer.append("\r\nSampleRate:");
        stringBuffer.append(this.f57166p);
        stringBuffer.append("\r\nChannel:");
        stringBuffer.append(this.f57167q);
        stringBuffer.append("\r\nScoreEngineFlag:");
        stringBuffer.append(this.f57168r);
        stringBuffer.append("\r\nReverbEngineFlag:");
        stringBuffer.append(this.f57169s);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f57170t);
        stringBuffer.append("\r\nViewScene:0\r\nExtraMsg:");
        stringBuffer.append(this.f57171u);
        stringBuffer.append("\r\nExtraMsg_2:");
        stringBuffer.append(this.f57172v);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct p(java.lang.String str) {
        this.f57162l = b("ErrorMsg", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct q(java.lang.String str) {
        this.f57171u = b("ExtraMsg", str, true);
        return this;
    }
}
