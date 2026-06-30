package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class CalendarStatisticsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55495d;

    /* renamed from: e, reason: collision with root package name */
    public long f55496e;

    /* renamed from: f, reason: collision with root package name */
    public long f55497f;

    /* renamed from: g, reason: collision with root package name */
    public long f55498g;

    /* renamed from: h, reason: collision with root package name */
    public long f55499h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55500i;

    /* renamed from: j, reason: collision with root package name */
    public long f55501j;

    /* renamed from: k, reason: collision with root package name */
    public long f55502k;

    /* renamed from: l, reason: collision with root package name */
    public long f55503l;

    /* renamed from: m, reason: collision with root package name */
    public long f55504m;

    /* renamed from: n, reason: collision with root package name */
    public long f55505n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55506o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f55507p;

    public CalendarStatisticsStruct() {
        this.f55495d = 0L;
        this.f55496e = 0L;
        this.f55497f = 0L;
        this.f55498g = 0L;
        this.f55499h = 0L;
        this.f55500i = "";
        this.f55501j = 0L;
        this.f55502k = 0L;
        this.f55503l = 0L;
        this.f55504m = 0L;
        this.f55505n = 0L;
        this.f55506o = "";
        this.f55507p = "";
    }

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55495d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55496e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55497f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55498g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55499h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55500i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55501j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55502k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55503l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55504m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55505n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55506o);
        stringBuffer.append(",");
        stringBuffer.append(this.f55507p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ds:");
        stringBuffer.append(this.f55495d);
        stringBuffer.append("\r\nfirstExposeTimeMs:");
        stringBuffer.append(this.f55496e);
        stringBuffer.append("\r\nfirstExposeCtrlType:");
        stringBuffer.append(this.f55497f);
        stringBuffer.append("\r\nexposeCount:");
        stringBuffer.append(this.f55498g);
        stringBuffer.append("\r\ntotalStayTimeSec:");
        stringBuffer.append(this.f55499h);
        stringBuffer.append("\r\nlastTipsId:");
        stringBuffer.append(this.f55500i);
        stringBuffer.append("\r\ntipsIdExposeCount:");
        stringBuffer.append(this.f55501j);
        stringBuffer.append("\r\nenterCount:");
        stringBuffer.append(this.f55502k);
        stringBuffer.append("\r\nenterWithRedDotCount:");
        stringBuffer.append(this.f55503l);
        stringBuffer.append("\r\ndropRedDotCount:");
        stringBuffer.append(this.f55504m);
        stringBuffer.append("\r\ndeepReadCount:");
        stringBuffer.append(this.f55505n);
        stringBuffer.append("\r\nstayTimeSecList:");
        stringBuffer.append(this.f55506o);
        stringBuffer.append("\r\nvvCountList:");
        stringBuffer.append(this.f55507p);
        return stringBuffer.toString();
    }

    public CalendarStatisticsStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f55495d = 0L;
        this.f55496e = 0L;
        this.f55497f = 0L;
        this.f55498g = 0L;
        this.f55499h = 0L;
        this.f55500i = "";
        this.f55501j = 0L;
        this.f55502k = 0L;
        this.f55503l = 0L;
        this.f55504m = 0L;
        this.f55505n = 0L;
        this.f55506o = "";
        this.f55507p = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 13) {
            java.lang.String[] strArr = new java.lang.String[13];
            java.util.Arrays.fill(strArr, 0, 13, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f55495d = h(split[0]);
        this.f55496e = h(split[1]);
        this.f55497f = h(split[2]);
        this.f55498g = h(split[3]);
        this.f55499h = h(split[4]);
        this.f55500i = b("lastTipsId", split[5], true);
        this.f55501j = h(split[6]);
        this.f55502k = h(split[7]);
        this.f55503l = h(split[8]);
        this.f55504m = h(split[9]);
        this.f55505n = h(split[10]);
        this.f55506o = b("stayTimeSecList", split[11], true);
        this.f55507p = b("vvCountList", split[12], true);
    }
}
