package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public abstract class u {
    public static final boolean a(android.app.Activity activity, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig config, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(stat, "stat");
        if (!(config instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC)) {
            return false;
        }
        try {
            if (!com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h.a((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) config, stat)) {
                return false;
            }
            activity.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
