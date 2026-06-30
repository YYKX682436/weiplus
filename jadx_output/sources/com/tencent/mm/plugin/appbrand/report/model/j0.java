package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.i0 f88002a;

    /* renamed from: b, reason: collision with root package name */
    public int f88003b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f88004c;

    /* renamed from: d, reason: collision with root package name */
    public long f88005d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.h0 f88006e;

    public void a() {
        if (this.f88002a == null || this.f88006e == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.kv_13917", "report " + toString());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f88005d = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13917, com.tencent.mm.plugin.appbrand.report.o2.a(java.lang.Integer.valueOf(this.f88002a.f88001d), java.lang.Integer.valueOf(this.f88003b), this.f88004c, java.lang.Long.valueOf(this.f88005d), null, java.lang.Integer.valueOf(this.f88006e.f87992d)));
    }

    public java.lang.String toString() {
        return "kv_13917{scene=" + this.f88002a.f88001d + ", appCount=" + this.f88003b + ", nearbyListId='" + this.f88004c + "', clickTime=" + this.f88005d + ", sceneNote='null', openType=" + this.f88006e.f87992d + '}';
    }
}
