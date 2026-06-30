package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsCleanDbReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60473d;

    /* renamed from: e, reason: collision with root package name */
    public long f60474e;

    /* renamed from: f, reason: collision with root package name */
    public long f60475f;

    /* renamed from: g, reason: collision with root package name */
    public long f60476g;

    /* renamed from: h, reason: collision with root package name */
    public long f60477h;

    /* renamed from: i, reason: collision with root package name */
    public long f60478i;

    /* renamed from: j, reason: collision with root package name */
    public int f60479j;

    /* renamed from: k, reason: collision with root package name */
    public long f60480k;

    /* renamed from: l, reason: collision with root package name */
    public int f60481l;

    /* renamed from: m, reason: collision with root package name */
    public long f60482m;

    /* renamed from: n, reason: collision with root package name */
    public long f60483n;

    /* renamed from: o, reason: collision with root package name */
    public int f60484o;

    /* renamed from: p, reason: collision with root package name */
    public int f60485p;

    /* renamed from: q, reason: collision with root package name */
    public int f60486q;

    /* renamed from: r, reason: collision with root package name */
    public long f60487r;

    /* renamed from: s, reason: collision with root package name */
    public long f60488s;

    /* renamed from: t, reason: collision with root package name */
    public long f60489t;

    /* renamed from: u, reason: collision with root package name */
    public long f60490u;

    public SnsCleanDbReportStruct() {
        this.f60473d = 0;
        this.f60474e = 0L;
        this.f60475f = 0L;
        this.f60476g = 0L;
        this.f60477h = 0L;
        this.f60478i = 0L;
        this.f60479j = 0;
        this.f60480k = 0L;
        this.f60481l = -1;
        this.f60482m = 0L;
        this.f60483n = -1L;
        this.f60484o = 0;
        this.f60485p = 0;
        this.f60486q = 0;
        this.f60487r = 0L;
        this.f60488s = 0L;
        this.f60489t = 0L;
        this.f60490u = 0L;
    }

    @Override // jx3.a
    public int g() {
        return 23030;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60473d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60474e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60475f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60476g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60477h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60478i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60479j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60480k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60481l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60482m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60483n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60484o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60485p);
        stringBuffer.append(",");
        stringBuffer.append(this.f60486q);
        stringBuffer.append(",");
        stringBuffer.append(this.f60487r);
        stringBuffer.append(",");
        stringBuffer.append(this.f60488s);
        stringBuffer.append(",");
        stringBuffer.append(this.f60489t);
        stringBuffer.append(",");
        stringBuffer.append(this.f60490u);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Code:");
        stringBuffer.append(this.f60473d);
        stringBuffer.append("\r\nOriginDbCount:");
        stringBuffer.append(this.f60474e);
        stringBuffer.append("\r\nDeleteDbCount:");
        stringBuffer.append(this.f60475f);
        stringBuffer.append("\r\nOriginDbSize:");
        stringBuffer.append(this.f60476g);
        stringBuffer.append("\r\nDeleteDbSize:");
        stringBuffer.append(this.f60477h);
        stringBuffer.append("\r\nCleanCostTime:");
        stringBuffer.append(this.f60478i);
        stringBuffer.append("\r\nNeedRestUserSize:");
        stringBuffer.append(this.f60479j);
        stringBuffer.append("\r\nTimeLimit:");
        stringBuffer.append(this.f60480k);
        stringBuffer.append("\r\nIsFirstTimeClean:");
        stringBuffer.append(this.f60481l);
        stringBuffer.append("\r\nStartCleanTime:");
        stringBuffer.append(this.f60482m);
        stringBuffer.append("\r\nTimeSinceLastClean:");
        stringBuffer.append(this.f60483n);
        stringBuffer.append("\r\nReportType:");
        stringBuffer.append(this.f60484o);
        stringBuffer.append("\r\nFailTime:");
        stringBuffer.append(this.f60485p);
        stringBuffer.append("\r\nDbType:");
        stringBuffer.append(this.f60486q);
        stringBuffer.append("\r\nOriginFileSize:");
        stringBuffer.append(this.f60487r);
        stringBuffer.append("\r\nDeleteFileSize:");
        stringBuffer.append(this.f60488s);
        stringBuffer.append("\r\nOriginFileCount:");
        stringBuffer.append(this.f60489t);
        stringBuffer.append("\r\nDeleteFileCount:");
        stringBuffer.append(this.f60490u);
        return stringBuffer.toString();
    }

    public SnsCleanDbReportStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f60473d = 0;
        this.f60474e = 0L;
        this.f60475f = 0L;
        this.f60476g = 0L;
        this.f60477h = 0L;
        this.f60478i = 0L;
        this.f60479j = 0;
        this.f60480k = 0L;
        this.f60481l = -1;
        this.f60482m = 0L;
        this.f60483n = -1L;
        this.f60484o = 0;
        this.f60485p = 0;
        this.f60486q = 0;
        this.f60487r = 0L;
        this.f60488s = 0L;
        this.f60489t = 0L;
        this.f60490u = 0L;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 18) {
            java.lang.String[] strArr = new java.lang.String[18];
            java.util.Arrays.fill(strArr, 0, 18, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f60473d = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
        this.f60474e = h(split[1]);
        this.f60475f = h(split[2]);
        this.f60476g = h(split[3]);
        this.f60477h = h(split[4]);
        this.f60478i = h(split[5]);
        this.f60479j = com.tencent.mm.sdk.platformtools.t8.P(split[6], 0);
        this.f60480k = h(split[7]);
        this.f60481l = com.tencent.mm.sdk.platformtools.t8.P(split[8], 0);
        this.f60482m = h(split[9]);
        this.f60483n = h(split[10]);
        this.f60484o = com.tencent.mm.sdk.platformtools.t8.P(split[11], 0);
        this.f60485p = com.tencent.mm.sdk.platformtools.t8.P(split[12], 0);
        this.f60486q = com.tencent.mm.sdk.platformtools.t8.P(split[13], 0);
        this.f60487r = h(split[14]);
        this.f60488s = h(split[15]);
        this.f60489t = h(split[16]);
        this.f60490u = h(split[17]);
    }
}
