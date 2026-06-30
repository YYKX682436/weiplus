package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f270813a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270815c;

    /* renamed from: d, reason: collision with root package name */
    public int f270816d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f270817e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f270818f;

    public e0(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f270813a = "";
        this.f270814b = "";
        this.f270815c = -1;
        this.f270817e = "";
        this.f270818f = new java.util.HashMap();
        this.f270813a = url;
        this.f270817e = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a.b(url);
    }

    /* renamed from: toString */
    public java.lang.String m75231x9616526c() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a.b(this.f270813a);
        java.lang.String str = this.f270814b;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f270815c);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f270816d);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String format = java.lang.String.format("BizImageBlankReportInfo %s {id: %s, timeTotal: %d, timeTaskRun: %d, timeFile: %d, timeNet: %d, timeScroll: %d, timeHevc: %d, timeThread: %d, \nnetType: %s, position: %d, imageSize: %d, retryCount: %d, downloadSuccess: %b, local: %b, \nurl: %s}", java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, b17, 0L, 0L, 0L, 0L, 0L, 0L, 0L, str, valueOf2, 0L, valueOf3, bool, bool, this.f270813a}, 16));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
