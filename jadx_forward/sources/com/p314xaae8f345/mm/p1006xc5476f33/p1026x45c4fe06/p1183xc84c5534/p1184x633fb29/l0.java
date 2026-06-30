package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f169580a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f169581b = false;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f169582c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f169583d;

    /* renamed from: e, reason: collision with root package name */
    public int f169584e;

    /* renamed from: f, reason: collision with root package name */
    public int f169585f;

    /* renamed from: g, reason: collision with root package name */
    public int f169586g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f169587h;

    /* renamed from: i, reason: collision with root package name */
    public int f169588i;

    /* renamed from: j, reason: collision with root package name */
    public long f169589j;

    /* renamed from: k, reason: collision with root package name */
    public long f169590k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f169591l;

    /* renamed from: m, reason: collision with root package name */
    public long f169592m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f169593n;

    public void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_14576", "report|" + m52420x9616526c());
            jx3.f.INSTANCE.d(14576, this.f169582c, this.f169583d, java.lang.Integer.valueOf(this.f169584e), java.lang.Integer.valueOf(this.f169585f), java.lang.Integer.valueOf(this.f169586g), this.f169587h, java.lang.Integer.valueOf(this.f169588i), 0, java.lang.Long.valueOf(this.f169589j), java.lang.Long.valueOf(this.f169590k), this.f169591l, java.lang.Long.valueOf(this.f169592m), this.f169593n);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", e17);
        }
    }

    /* renamed from: toString */
    public java.lang.String m52420x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kv_14576{, networkType='");
        sb6.append(this.f169582c);
        sb6.append("', appId='");
        sb6.append(this.f169583d);
        sb6.append("', appVersion=");
        sb6.append(this.f169584e);
        sb6.append(", appState=");
        sb6.append(this.f169585f);
        sb6.append(", scene=");
        sb6.append(this.f169586g);
        sb6.append(", sessionId='");
        sb6.append(this.f169587h);
        sb6.append("', is_download_code=");
        sb6.append(this.f169588i);
        sb6.append(", is_load_x5=0, cost_time=");
        sb6.append(this.f169589j);
        sb6.append(", event_time=");
        sb6.append(this.f169590k);
        sb6.append(", load_time=");
        sb6.append(this.f169580a);
        sb6.append(", real_time=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", username=");
        sb6.append(this.f169591l);
        sb6.append(", appType=");
        sb6.append(this.f169592m);
        sb6.append(", instanceId=");
        sb6.append(this.f169593n);
        sb6.append('}');
        return sb6.toString();
    }
}
