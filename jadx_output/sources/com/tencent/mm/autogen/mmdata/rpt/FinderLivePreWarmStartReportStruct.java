package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLivePreWarmStartReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57317e;

    /* renamed from: f, reason: collision with root package name */
    public int f57318f;

    /* renamed from: i, reason: collision with root package name */
    public int f57321i;

    /* renamed from: j, reason: collision with root package name */
    public int f57322j;

    /* renamed from: o, reason: collision with root package name */
    public long f57327o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57316d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57319g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57320h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57323k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57324l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57325m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f57326n = "";

    @Override // jx3.a
    public int g() {
        return 21248;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57316d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57317e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57318f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57319g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57320h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57321i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57322j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57323k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57324l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57325m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57326n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57327o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appuin:");
        stringBuffer.append(this.f57316d);
        stringBuffer.append("\r\nappversion:");
        stringBuffer.append(this.f57317e);
        stringBuffer.append("\r\napptype:");
        stringBuffer.append(this.f57318f);
        stringBuffer.append("\r\nnetworktype:");
        stringBuffer.append(this.f57319g);
        stringBuffer.append("\r\nprewarmpath:");
        stringBuffer.append(this.f57320h);
        stringBuffer.append("\r\nispresend:");
        stringBuffer.append(this.f57321i);
        stringBuffer.append("\r\nispreload:");
        stringBuffer.append(this.f57322j);
        stringBuffer.append("\r\nliveid:");
        stringBuffer.append(this.f57323k);
        stringBuffer.append("\r\nfinderid:");
        stringBuffer.append(this.f57324l);
        stringBuffer.append("\r\nshopwindowid:");
        stringBuffer.append(this.f57325m);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f57326n);
        stringBuffer.append("\r\neventtime:");
        stringBuffer.append(this.f57327o);
        return stringBuffer.toString();
    }
}
