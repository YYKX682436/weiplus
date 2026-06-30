package a84;

/* loaded from: classes4.dex */
public abstract class d0 {
    public static final int a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return b17;
    }

    public static final float b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDpTextFloat", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        float q17 = i65.a.q(context);
        if (com.tencent.mm.ui.bk.M(q17, i65.a.u(context)) || com.tencent.mm.ui.bk.M(q17, i65.a.v(context))) {
            q17 = i65.a.t(context);
        }
        float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a) * i17 * q17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDpTextFloat", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return g17;
    }

    public static final java.lang.String c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringId", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        kotlin.jvm.internal.o.g(snsInfo, "<this>");
        java.lang.String T = ca4.z0.T(snsInfo);
        kotlin.jvm.internal.o.f(T, "getSnsStringId(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringId", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return T;
    }

    public static final java.lang.String d(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("md5", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        java.lang.String str2 = "";
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("AdExprUtil", "the string to md5 is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("md5", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
            return "";
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            m521constructorimpl = kotlin.Result.m521constructorimpl(kk.k.g(bytes));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("md5", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.String str3 = (java.lang.String) m521constructorimpl;
        if (str3 == null) {
            com.tencent.mars.xlog.Log.w("AdExprUtil", "the get md5 failed!");
        } else {
            str2 = str3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("md5", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return str2;
    }

    public static final boolean e(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startActivitySafely", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        kotlin.jvm.internal.o.g(context, "<this>");
        kotlin.jvm.internal.o.g(intent, "intent");
        boolean z17 = false;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/utils/ContextExtKt", "startActivitySafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/ad/utils/ContextExtKt", "startActivitySafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z17 = true;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startActivitySafely", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return z17;
    }
}
