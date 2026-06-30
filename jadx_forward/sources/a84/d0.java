package a84;

/* loaded from: classes4.dex */
public abstract class d0 {
    public static final int a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return b17;
    }

    public static final float b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDpTextFloat", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        float q17 = i65.a.q(context);
        if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(context)) || com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(context))) {
            q17 = i65.a.t(context);
        }
        float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * i17 * q17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDpTextFloat", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return g17;
    }

    public static final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStringId", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17933xe8d1b226, "<this>");
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T, "getSnsStringId(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStringId", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return T;
    }

    public static final java.lang.String d(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("md5", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        java.lang.String str2 = "";
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdExprUtil", "the string to md5 is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("md5", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
            return "";
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kk.k.g(bytes));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("md5", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        java.lang.String str3 = (java.lang.String) m143895xf1229813;
        if (str3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdExprUtil", "the get md5 failed!");
        } else {
            str2 = str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("md5", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return str2;
    }

    public static final boolean e(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startActivitySafely", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startActivitySafely", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
        return z17;
    }
}
