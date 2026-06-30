package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.b3 f87812a = new com.tencent.mm.plugin.appbrand.report.b3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f87813b = jz5.h.b(com.tencent.mm.plugin.appbrand.report.x2.f88427d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer[] f87814c = {1084, 1046, 1045};

    public static final com.tencent.mm.sdk.platformtools.o4 a(com.tencent.mm.plugin.appbrand.report.b3 b3Var) {
        b3Var.getClass();
        java.lang.Object value = ((jz5.n) f87813b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public static final void b(com.tencent.mm.plugin.appbrand.report.b3 b3Var, java.lang.String str) {
        b3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLaunchOpenSdkAdTracer", "reportKV key[18460] value[" + str + ']');
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18460, str);
    }

    public final void c(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = initConfig.f77298k2;
        java.lang.String str = qualitySession != null ? qualitySession.f88134d : null;
        if (str == null || str.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.report.y2(str, initConfig), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
    }

    public final void d(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel parcel, java.lang.String instanceId) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        if (parcel.f84911p == null) {
            java.lang.Integer[] numArr = f87814c;
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = parcel.f84910o;
            if (!kz5.z.G(numArr, appBrandStatObject != null ? java.lang.Integer.valueOf(appBrandStatObject.f87790f) : null)) {
                return;
            }
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.os.PersistableBundle persistableBundle = parcel.C;
        java.lang.String string = persistableBundle != null ? persistableBundle.getString("KEY_OPENSDK_AD_TRACE_KEY") : null;
        h0Var.f310123d = string;
        java.lang.String str = string;
        if (str == null || str.length() == 0) {
            android.os.PersistableBundle persistableBundle2 = parcel.f84920w;
            h0Var.f310123d = persistableBundle2 != null ? persistableBundle2.getString("adUxInfo") : null;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.report.z2(instanceId, h0Var), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
    }

    public final void e(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = initConfig.f77298k2;
        java.lang.String str = qualitySession != null ? qualitySession.f88134d : null;
        if (str == null || str.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.report.a3(str, initConfig), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
    }
}
