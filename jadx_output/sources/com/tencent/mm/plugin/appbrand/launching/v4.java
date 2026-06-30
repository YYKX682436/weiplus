package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class v4 implements k91.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f85254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.x4 f85255d;

    public v4(com.tencent.mm.plugin.appbrand.launching.x4 x4Var, java.lang.String str, int i17, long j17) {
        this.f85255d = x4Var;
        this.f85252a = str;
        this.f85253b = i17;
        this.f85254c = j17;
    }

    @Override // k91.c5
    public void a(k91.b5 b5Var, java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        ne1.j jVar = ne1.j.NO_UPDATE;
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "onGetContact with username(%s) maybeNew == NULL", this.f85252a);
            try {
                this.f85255d.f85404h.a(jVar, 0, null, null, null);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", e17, "onGetContact with username(%s) maybeNew == NULL", this.f85252a);
                return;
            }
        }
        if (v5Var.w0() == null) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "onGetContact with username(%s), maybeNew.versionInfo == NULL", this.f85252a);
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", format);
            try {
                this.f85255d.f85404h.a(jVar, 0, null, null, null);
                return;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", e18, format, new java.lang.Object[0]);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "[appversion] onGetContact(%s), result %s, old.version %d, maybeNew.ver %d", this.f85252a, b5Var, java.lang.Integer.valueOf(this.f85253b), java.lang.Integer.valueOf(v5Var.w0().f77444d));
        cm.i0 i0Var = b5Var.ordinal() != 3 ? cm.i0.ok : cm.i0.common_fail;
        k91.b5 b5Var2 = k91.b5.RET_HIT_FREQUENCY_LIMIT;
        if (b5Var2 != b5Var) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct a17 = com.tencent.mm.plugin.appbrand.report.quality.u.a(this.f85255d.f85405i);
            long j17 = this.f85254c;
            a17.f62730k = j17;
            a17.f62731l = currentTimeMillis;
            a17.f62728i = currentTimeMillis - j17;
            a17.f62732m = i0Var;
            a17.f62733n = cm.h0.async;
            a17.f62734o = com.tencent.mm.plugin.appbrand.report.quality.u.c();
            a17.f62736q = a17.b("NetworkTypeStr", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
            a17.k();
            va1.b bVar = va1.b.f434229a;
            com.tencent.mm.plugin.appbrand.launching.x4 x4Var = this.f85255d;
            bVar.a(x4Var.f85405i.f88134d, x4Var.f85398b, "ContactCGI", this.f85254c, currentTimeMillis, null);
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f85255d.f85403g;
        if (b5Var2 == b5Var && v5Var.w0().f77444d <= wxaAttributes$WxaVersionInfo.f77444d) {
            com.tencent.mm.plugin.appbrand.launching.x4 x4Var2 = this.f85255d;
            if (x4Var2.f85409m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "skip dispatch noUpdate for username:%s, appId:%s", this.f85252a, x4Var2.f85398b);
                return;
            }
        }
        if (v5Var.w0().f77446f != 0) {
            this.f85255d.f85404h.a(jVar, 0, null, null, null);
            return;
        }
        if (wxaAttributes$WxaVersionInfo.f77444d >= v5Var.w0().f77444d) {
            this.f85255d.f85404h.a(jVar, wxaAttributes$WxaVersionInfo.f77444d, wxaAttributes$WxaVersionInfo.f77445e, v5Var.field_passThroughInfo, v5Var.field_stablePassThroughInfo);
            return;
        }
        this.f85255d.f85404h.a(ne1.j.UPDATING, v5Var.w0().f77444d, v5Var.w0().f77445e, v5Var.field_passThroughInfo, v5Var.field_stablePassThroughInfo);
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).h(new com.tencent.mm.plugin.appbrand.launching.u4(this, v5Var), "MicroMsg.AppBrand.Launching.ContactSilentSyncProcess|download|" + this.f85252a);
    }
}
