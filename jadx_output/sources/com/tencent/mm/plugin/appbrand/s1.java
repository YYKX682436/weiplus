package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class s1 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f88441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f88442c;

    public s1(int i17, long j17, l81.v0 v0Var) {
        this.f88440a = i17;
        this.f88441b = j17;
        this.f88442c = v0Var;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        int i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError, requestId:");
        sb6.append(this.f88440a);
        sb6.append(", errCode:");
        sb6.append(l81.u0.f317078a.a(i17));
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f88441b);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreRenderColdStartService", sb6.toString());
        l81.v0 v0Var = this.f88442c;
        if (v0Var != null) {
            v0Var.a(i17, str);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        switch (i17) {
            case -10:
                i18 = 10;
                break;
            case -9:
            default:
                i18 = 10000;
                break;
            case -8:
                i18 = 9;
                break;
            case -7:
                i18 = 8;
                break;
            case -6:
                i18 = 7;
                break;
            case -5:
                i18 = 6;
                break;
            case -4:
                i18 = 5;
                break;
            case -3:
                i18 = 4;
                break;
            case -2:
                i18 = 3;
                break;
            case -1:
                i18 = 2;
                break;
            case 0:
                i18 = 1;
                break;
        }
        g0Var.A(com.tencent.mm.minigame.y.CTRL_INDEX, i18);
    }

    @Override // l81.v0
    public void onSuccess() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSuccess, requestId:");
        sb6.append(this.f88440a);
        sb6.append(", cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f88441b);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService", sb6.toString());
        l81.v0 v0Var = this.f88442c;
        if (v0Var != null) {
            v0Var.onSuccess();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.minigame.y.CTRL_INDEX, 1);
    }
}
