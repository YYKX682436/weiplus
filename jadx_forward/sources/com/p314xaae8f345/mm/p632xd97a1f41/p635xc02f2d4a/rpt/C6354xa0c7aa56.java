package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct */
/* loaded from: classes8.dex */
public final class C6354xa0c7aa56 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137028d;

    /* renamed from: e, reason: collision with root package name */
    public long f137029e;

    /* renamed from: f, reason: collision with root package name */
    public long f137030f;

    /* renamed from: g, reason: collision with root package name */
    public long f137031g;

    /* renamed from: h, reason: collision with root package name */
    public long f137032h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137033i;

    /* renamed from: j, reason: collision with root package name */
    public long f137034j;

    /* renamed from: k, reason: collision with root package name */
    public long f137035k;

    /* renamed from: l, reason: collision with root package name */
    public long f137036l;

    /* renamed from: m, reason: collision with root package name */
    public long f137037m;

    /* renamed from: n, reason: collision with root package name */
    public long f137038n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f137039o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137040p;

    public C6354xa0c7aa56() {
        this.f137028d = 0L;
        this.f137029e = 0L;
        this.f137030f = 0L;
        this.f137031g = 0L;
        this.f137032h = 0L;
        this.f137033i = "";
        this.f137034j = 0L;
        this.f137035k = 0L;
        this.f137036l = 0L;
        this.f137037m = 0L;
        this.f137038n = 0L;
        this.f137039o = "";
        this.f137040p = "";
    }

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137028d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137029e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137030f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137031g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137032h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137033i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137034j);
        stringBuffer.append(",");
        stringBuffer.append(this.f137035k);
        stringBuffer.append(",");
        stringBuffer.append(this.f137036l);
        stringBuffer.append(",");
        stringBuffer.append(this.f137037m);
        stringBuffer.append(",");
        stringBuffer.append(this.f137038n);
        stringBuffer.append(",");
        stringBuffer.append(this.f137039o);
        stringBuffer.append(",");
        stringBuffer.append(this.f137040p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ds:");
        stringBuffer.append(this.f137028d);
        stringBuffer.append("\r\nfirstExposeTimeMs:");
        stringBuffer.append(this.f137029e);
        stringBuffer.append("\r\nfirstExposeCtrlType:");
        stringBuffer.append(this.f137030f);
        stringBuffer.append("\r\nexposeCount:");
        stringBuffer.append(this.f137031g);
        stringBuffer.append("\r\ntotalStayTimeSec:");
        stringBuffer.append(this.f137032h);
        stringBuffer.append("\r\nlastTipsId:");
        stringBuffer.append(this.f137033i);
        stringBuffer.append("\r\ntipsIdExposeCount:");
        stringBuffer.append(this.f137034j);
        stringBuffer.append("\r\nenterCount:");
        stringBuffer.append(this.f137035k);
        stringBuffer.append("\r\nenterWithRedDotCount:");
        stringBuffer.append(this.f137036l);
        stringBuffer.append("\r\ndropRedDotCount:");
        stringBuffer.append(this.f137037m);
        stringBuffer.append("\r\ndeepReadCount:");
        stringBuffer.append(this.f137038n);
        stringBuffer.append("\r\nstayTimeSecList:");
        stringBuffer.append(this.f137039o);
        stringBuffer.append("\r\nvvCountList:");
        stringBuffer.append(this.f137040p);
        return stringBuffer.toString();
    }

    public C6354xa0c7aa56(java.lang.String str) {
        java.lang.String[] split;
        this.f137028d = 0L;
        this.f137029e = 0L;
        this.f137030f = 0L;
        this.f137031g = 0L;
        this.f137032h = 0L;
        this.f137033i = "";
        this.f137034j = 0L;
        this.f137035k = 0L;
        this.f137036l = 0L;
        this.f137037m = 0L;
        this.f137038n = 0L;
        this.f137039o = "";
        this.f137040p = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 13) {
            java.lang.String[] strArr = new java.lang.String[13];
            java.util.Arrays.fill(strArr, 0, 13, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f137028d = h(split[0]);
        this.f137029e = h(split[1]);
        this.f137030f = h(split[2]);
        this.f137031g = h(split[3]);
        this.f137032h = h(split[4]);
        this.f137033i = b("lastTipsId", split[5], true);
        this.f137034j = h(split[6]);
        this.f137035k = h(split[7]);
        this.f137036l = h(split[8]);
        this.f137037m = h(split[9]);
        this.f137038n = h(split[10]);
        this.f137039o = b("stayTimeSecList", split[11], true);
        this.f137040p = b("vvCountList", split[12], true);
    }
}
