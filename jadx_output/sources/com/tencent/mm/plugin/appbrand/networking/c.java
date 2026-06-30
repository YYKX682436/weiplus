package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class c implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.networking.d f86075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js5 f86076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f86077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f86078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xw f86079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86080i;

    public c(com.tencent.mm.plugin.appbrand.networking.d dVar, r45.js5 js5Var, int i17, com.tencent.mm.modelbase.m1 m1Var, r45.xw xwVar, int i18) {
        this.f86075d = dVar;
        this.f86076e = js5Var;
        this.f86077f = i17;
        this.f86078g = m1Var;
        this.f86079h = xwVar;
        this.f86080i = i18;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "";
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.ie ieVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.networking.d dVar = this.f86075d;
        long j17 = elapsedRealtime - dVar.f86082n;
        r45.y50 A = dVar.A();
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct weAppQualityCGISpeedStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct();
        weAppQualityCGISpeedStruct.f62430g = dVar.f86081m;
        weAppQualityCGISpeedStruct.f62431h = currentTimeMillis;
        weAppQualityCGISpeedStruct.f62432i = j17;
        weAppQualityCGISpeedStruct.f62433j = weAppQualityCGISpeedStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        r45.js5 js5Var = this.f86076e;
        weAppQualityCGISpeedStruct.f62434k = js5Var != null ? js5Var.computeSize() : -1L;
        weAppQualityCGISpeedStruct.f62435l = this.f86077f;
        weAppQualityCGISpeedStruct.f62436m = (js5Var == null || (ieVar = js5Var.BaseResponse) == null) ? Integer.MIN_VALUE : ieVar.f376959d;
        weAppQualityCGISpeedStruct.f62437n = this.f86078g.getType();
        weAppQualityCGISpeedStruct.f62438o = com.tencent.mm.plugin.appbrand.networking.i.a();
        r45.xw xwVar = this.f86079h;
        weAppQualityCGISpeedStruct.f62439p = xwVar != null ? xwVar.f390550t : 0L;
        weAppQualityCGISpeedStruct.f62442s = this.f86080i;
        if (A != null) {
            weAppQualityCGISpeedStruct.f62440q = A.f390799f;
            weAppQualityCGISpeedStruct.f62441r = A.f390800g;
        }
        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.c(dVar.y(), dVar.C(), weAppQualityCGISpeedStruct, dVar.B());
    }
}
