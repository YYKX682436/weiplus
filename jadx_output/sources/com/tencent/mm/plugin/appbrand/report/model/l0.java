package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f88047a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f88048b = false;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f88049c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f88050d;

    /* renamed from: e, reason: collision with root package name */
    public int f88051e;

    /* renamed from: f, reason: collision with root package name */
    public int f88052f;

    /* renamed from: g, reason: collision with root package name */
    public int f88053g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f88054h;

    /* renamed from: i, reason: collision with root package name */
    public int f88055i;

    /* renamed from: j, reason: collision with root package name */
    public long f88056j;

    /* renamed from: k, reason: collision with root package name */
    public long f88057k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f88058l;

    /* renamed from: m, reason: collision with root package name */
    public long f88059m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f88060n;

    public void a() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14576", "report|" + toString());
            jx3.f.INSTANCE.d(14576, this.f88049c, this.f88050d, java.lang.Integer.valueOf(this.f88051e), java.lang.Integer.valueOf(this.f88052f), java.lang.Integer.valueOf(this.f88053g), this.f88054h, java.lang.Integer.valueOf(this.f88055i), 0, java.lang.Long.valueOf(this.f88056j), java.lang.Long.valueOf(this.f88057k), this.f88058l, java.lang.Long.valueOf(this.f88059m), this.f88060n);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", e17);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kv_14576{, networkType='");
        sb6.append(this.f88049c);
        sb6.append("', appId='");
        sb6.append(this.f88050d);
        sb6.append("', appVersion=");
        sb6.append(this.f88051e);
        sb6.append(", appState=");
        sb6.append(this.f88052f);
        sb6.append(", scene=");
        sb6.append(this.f88053g);
        sb6.append(", sessionId='");
        sb6.append(this.f88054h);
        sb6.append("', is_download_code=");
        sb6.append(this.f88055i);
        sb6.append(", is_load_x5=0, cost_time=");
        sb6.append(this.f88056j);
        sb6.append(", event_time=");
        sb6.append(this.f88057k);
        sb6.append(", load_time=");
        sb6.append(this.f88047a);
        sb6.append(", real_time=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", username=");
        sb6.append(this.f88058l);
        sb6.append(", appType=");
        sb6.append(this.f88059m);
        sb6.append(", instanceId=");
        sb6.append(this.f88060n);
        sb6.append('}');
        return sb6.toString();
    }
}
