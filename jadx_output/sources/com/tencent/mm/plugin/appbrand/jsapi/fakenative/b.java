package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/fakenative/b;", "", "Lcom/tencent/mm/plugin/appbrand/o6;", "runtime", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "initConfig", "Ljz5/f0;", "a", "", "enabled$delegate", "Ljz5/g;", "b", "()Z", "enabled", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class b {
    private b() {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
        this();
    }

    private final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.jsapi.fakenative.c.f80941i).getValue()).booleanValue();
    }

    public final void a(com.tencent.mm.plugin.appbrand.o6 runtime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig) {
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs openBusinessViewExtraArgs;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        if (b() && (openBusinessViewExtraArgs = (appBrandLaunchReferrer = initConfig.D).f77331p) != null) {
            java.lang.String str = appBrandLaunchReferrer.f77330o;
            if (str == null || str.length() == 0) {
                return;
            }
            if (openBusinessViewExtraArgs.f77336d || openBusinessViewExtraArgs.f77337e) {
                try {
                    appBrandRuntime = runtime.B0();
                    if (appBrandRuntime == null) {
                        appBrandRuntime = runtime.f74804o;
                    }
                } catch (java.lang.IllegalAccessError unused) {
                    appBrandRuntime = runtime.f74804o;
                }
                if (appBrandRuntime != null) {
                    appBrandRuntime.Q(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.c(runtime));
                }
            }
        }
    }
}
