package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class voipRingToneRecommendReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f63181e;

    /* renamed from: f, reason: collision with root package name */
    public long f63182f;

    /* renamed from: g, reason: collision with root package name */
    public long f63183g;

    /* renamed from: h, reason: collision with root package name */
    public long f63184h;

    /* renamed from: j, reason: collision with root package name */
    public long f63186j;

    /* renamed from: k, reason: collision with root package name */
    public long f63187k;

    /* renamed from: l, reason: collision with root package name */
    public long f63188l;

    /* renamed from: o, reason: collision with root package name */
    public long f63191o;

    /* renamed from: p, reason: collision with root package name */
    public long f63192p;

    /* renamed from: q, reason: collision with root package name */
    public long f63193q;

    /* renamed from: u, reason: collision with root package name */
    public long f63197u;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63180d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63185i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f63189m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f63190n = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f63194r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f63195s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f63196t = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f63198v = "";

    @Override // jx3.a
    public int g() {
        return 23604;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f63180d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63181e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63182f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63183g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63184h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63185i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63186j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63187k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63188l);
        stringBuffer.append(",");
        stringBuffer.append(this.f63189m);
        stringBuffer.append(",");
        stringBuffer.append(this.f63190n);
        stringBuffer.append(",");
        stringBuffer.append(this.f63191o);
        stringBuffer.append(",");
        stringBuffer.append(this.f63192p);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f63193q);
        stringBuffer.append(",");
        stringBuffer.append(this.f63194r);
        stringBuffer.append(",");
        stringBuffer.append(this.f63195s);
        stringBuffer.append(",");
        stringBuffer.append(this.f63196t);
        stringBuffer.append(",");
        stringBuffer.append(this.f63197u);
        stringBuffer.append(",");
        stringBuffer.append(this.f63198v);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:0\r\nFeedID:");
        stringBuffer.append(this.f63180d);
        stringBuffer.append("\r\nFeedType:");
        stringBuffer.append(this.f63181e);
        stringBuffer.append("\r\nExposure_pos:");
        stringBuffer.append(this.f63182f);
        stringBuffer.append("\r\neventCode:");
        stringBuffer.append(this.f63183g);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f63184h);
        stringBuffer.append("\r\nsearchKeyword:");
        stringBuffer.append(this.f63185i);
        stringBuffer.append("\r\npreviewTimeMs:");
        stringBuffer.append(this.f63186j);
        stringBuffer.append("\r\nchooseTimeMs:");
        stringBuffer.append(this.f63187k);
        stringBuffer.append("\r\nis_individual:");
        stringBuffer.append(this.f63188l);
        stringBuffer.append("\r\ntoUserName:");
        stringBuffer.append(this.f63189m);
        stringBuffer.append("\r\nsession_ID:");
        stringBuffer.append(this.f63190n);
        stringBuffer.append("\r\nsetType:");
        stringBuffer.append(this.f63191o);
        stringBuffer.append("\r\nchannel:");
        stringBuffer.append(this.f63192p);
        stringBuffer.append("\r\nis_vibrate:0\r\nreason:");
        stringBuffer.append(this.f63193q);
        stringBuffer.append("\r\nrecall_cmdid:");
        stringBuffer.append(this.f63194r);
        stringBuffer.append("\r\nsearch_request_id:");
        stringBuffer.append(this.f63195s);
        stringBuffer.append("\r\nrec_request_id:");
        stringBuffer.append(this.f63196t);
        stringBuffer.append("\r\nis_video_stream:");
        stringBuffer.append(this.f63197u);
        stringBuffer.append("\r\nextrainfo:");
        stringBuffer.append(this.f63198v);
        return stringBuffer.toString();
    }
}
