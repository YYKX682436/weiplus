package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long f253351a;

    /* renamed from: b, reason: collision with root package name */
    public long f253352b;

    /* renamed from: c, reason: collision with root package name */
    public long f253353c;

    /* renamed from: d, reason: collision with root package name */
    public long f253354d;

    /* renamed from: e, reason: collision with root package name */
    public long f253355e;

    /* renamed from: f, reason: collision with root package name */
    public long f253356f;

    /* renamed from: g, reason: collision with root package name */
    public long f253357g;

    public final void a(java.lang.String detailInfoStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detailInfoStr, "detailInfoStr");
        java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(detailInfoStr, 0).toArray(new java.lang.String[0]);
        try {
            if (!(!(strArr.length == 0)) || strArr.length < 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKvStorage", "invalid sport detail str %s", detailInfoStr);
            } else {
                this.f253351a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[0], 0L);
                this.f253352b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[1], 0L);
                this.f253353c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[2], 0L);
                this.f253354d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[3], 0L);
                this.f253355e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[4], 0L);
                this.f253356f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[5], 0L);
                this.f253357g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(strArr[6], 0L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Sport.SportKvStorage", e17, "fromStr:" + detailInfoStr + ' ', new java.lang.Object[0]);
        }
    }

    /* renamed from: toString */
    public java.lang.String m71369x9616526c() {
        java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(this.f253351a), java.lang.Long.valueOf(this.f253352b), java.lang.Long.valueOf(this.f253353c), java.lang.Long.valueOf(this.f253354d), java.lang.Long.valueOf(this.f253355e), java.lang.Long.valueOf(this.f253356f), java.lang.Long.valueOf(this.f253357g)}, 7));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
