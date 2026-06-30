package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class AppBrandFileCleanReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55137e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55138f;

    /* renamed from: g, reason: collision with root package name */
    public long f55139g;

    /* renamed from: h, reason: collision with root package name */
    public long f55140h;

    /* renamed from: i, reason: collision with root package name */
    public long f55141i;

    /* renamed from: j, reason: collision with root package name */
    public long f55142j;

    /* renamed from: k, reason: collision with root package name */
    public long f55143k;

    /* renamed from: l, reason: collision with root package name */
    public long f55144l;

    /* renamed from: m, reason: collision with root package name */
    public long f55145m;

    /* renamed from: n, reason: collision with root package name */
    public long f55146n;

    /* renamed from: o, reason: collision with root package name */
    public long f55147o;

    /* renamed from: p, reason: collision with root package name */
    public long f55148p;

    @Override // jx3.a
    public int g() {
        return 30759;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55136d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55137e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55138f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55139g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55140h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55141i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55142j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55143k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55144l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55145m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55146n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55147o);
        stringBuffer.append(",");
        stringBuffer.append(this.f55148p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Event:");
        stringBuffer.append(this.f55136d);
        stringBuffer.append("\r\nResidueAppIds:");
        stringBuffer.append(this.f55137e);
        stringBuffer.append("\r\nCommLibSpaceSize:");
        stringBuffer.append(this.f55138f);
        stringBuffer.append("\r\nOccupiedSpaceSize:");
        stringBuffer.append(this.f55139g);
        stringBuffer.append("\r\nTotalSpaceSize:");
        stringBuffer.append(this.f55140h);
        stringBuffer.append("\r\nUnder5DaysSpace:");
        stringBuffer.append(this.f55141i);
        stringBuffer.append("\r\nUnder10DaysSpace:");
        stringBuffer.append(this.f55142j);
        stringBuffer.append("\r\nUnder15DaysSpace:");
        stringBuffer.append(this.f55143k);
        stringBuffer.append("\r\nUnder20DaysSpace:");
        stringBuffer.append(this.f55144l);
        stringBuffer.append("\r\nUnder25DaysSpace:");
        stringBuffer.append(this.f55145m);
        stringBuffer.append("\r\nUnder30DaysSpace:");
        stringBuffer.append(this.f55146n);
        stringBuffer.append("\r\nAbove30DaysSpace:");
        stringBuffer.append(this.f55147o);
        stringBuffer.append("\r\nUnknownDaySpace:");
        stringBuffer.append(this.f55148p);
        return stringBuffer.toString();
    }
}
