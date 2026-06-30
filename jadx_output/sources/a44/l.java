package a44;

/* loaded from: classes4.dex */
public final class l implements za4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1293a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1294b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1295c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1296d;

    public l(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        this.f1293a = str;
        this.f1294b = str2;
        this.f1295c = i17;
        this.f1296d = i18;
    }

    @Override // za4.h
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPkgRemoved", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
        com.tencent.mars.xlog.Log.i("ApkInstalledCallback", "pkg %s removed", str);
        java.lang.String str2 = this.f1293a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            kotlin.jvm.internal.m0.c(callbackIds).remove(str2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && kotlin.jvm.internal.o.b(str, this.f1294b)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().deleteDeferredDeepLinkMM(str);
        }
        if (str2 != null) {
            i64.t.f289316d.a(str2, new i64.r(str2, 0, 0, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPkgRemoved", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
    }

    @Override // za4.h
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPkgInstalled", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
        com.tencent.mars.xlog.Log.i("ApkInstalledCallback", "pkg %s installed", str);
        za4.k g17 = za4.k.g();
        java.lang.String str2 = this.f1293a;
        g17.s(5, str2);
        za4.k.g().q(4001011, str2, new za4.g(this.f1295c));
        a44.m.a(this.f1296d, 106);
        if (str2 != null) {
            i64.t.f289316d.a(str2, new i64.r(str2, 5, 0, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPkgInstalled", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
    }
}
