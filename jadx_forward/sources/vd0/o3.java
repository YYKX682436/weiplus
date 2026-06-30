package vd0;

@j95.b
/* loaded from: classes5.dex */
public final class o3 extends jm0.o implements wd0.z1 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(xd0.c.class);
    }

    public void Zi(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17434x64616b86.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/setting/SettingsFeatureService", "enterSettingsManagerFindMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/setting/SettingsFeatureService", "enterSettingsManagerFindMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean aj(com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c, wd0.l2 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (!jm0.g.class.isAssignableFrom(xd0.c.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(xd0.c.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.lang.String lastLanguageCode = result.f526281a;
        java.lang.String newLanguageCode = result.f526283c;
        boolean equals = android.text.TextUtils.equals(lastLanguageCode, newLanguageCode);
        java.lang.String str = result.f526284d;
        if (!((equals && android.text.TextUtils.equals(result.f526282b, str)) ? false : true)) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364();
        java.lang.String str2 = c10687xa533b04c != null ? c10687xa533b04c.f149355e : null;
        am.z1 z1Var = c5234x14788364.f135568g;
        z1Var.f90035a = str2;
        z1Var.f90036b = newLanguageCode;
        z1Var.f90037c = str;
        c5234x14788364.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lastLanguageCode, "lastLanguageCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newLanguageCode, "newLanguageCode");
        int i17 = c10687xa533b04c != null ? c10687xa533b04c.f149357g : 0;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lastLanguageCode, newLanguageCode)) {
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("current_language_code", lastLanguageCode);
        hashMap.put("target_language_code", newLanguageCode);
        hashMap.put("modify_language_sence", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("modify_translate_language_end", hashMap, 35268);
        return true;
    }

    public void bj(android.content.Context context, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFeatureService", "openWeLab. query:".concat(query));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalitebf3a88de4da873052ba340892dc97559");
        bundle.putString("query", query);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new vd0.n3());
    }

    public void cj(android.content.Context fromContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromContext, "fromContext");
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(xd0.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.lang.Object l17 = gm0.j1.u().c().l(7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        boolean z17 = (((java.lang.Integer) l17).intValue() & 2) != 0;
        java.lang.Object l18 = gm0.j1.u().c().l(5, null);
        java.lang.String str = l18 instanceof java.lang.String ? (java.lang.String) l18 : null;
        android.content.Intent intent = new android.content.Intent(fromContext, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb.class);
        lk5.s.e(intent, true);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_EMAIL_VERIFY_SEND_TIME_LONG, 0L) >= 300;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsEmailFSC", "SettingsEmailUtil.isVerifyEmailOverTime(): " + z18);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsEmailFSC", "settings email enter SettingsBindEmailUIC");
            intent.putExtra("BINDED_EMAIL", str);
            pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k8.class);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsEmailFSC", "settings email enter SettingsEmailEditUIC");
            pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nb.class);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsEmailFSC", "settings email enter SettingsEmailVerifyUIC");
            intent.putExtra("verify_email_address", str);
            pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tb.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fromContext, arrayList.toArray(), "com/tencent/mm/feature/setting/fsc/SettingsEmailFSC", "startSettingEmailBindUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fromContext.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fromContext, "com/tencent/mm/feature/setting/fsc/SettingsEmailFSC", "startSettingEmailBindUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void fj(android.content.Context fromContext, com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromContext, "fromContext");
        if (!jm0.g.class.isAssignableFrom(xd0.c.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(xd0.c.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        android.content.Intent intent = new android.content.Intent(fromContext, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.class);
        if (c10687xa533b04c != null) {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent.putExtra("BundleKey_SettingsTranslateLanguageParams", c10687xa533b04c));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsTranslateLanguageFSC", e17, "startSettingTranslateLanguageUI", new java.lang.Object[0]);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fromContext, arrayList.toArray(), "com/tencent/mm/feature/setting/fsc/SettingsTranslateLanguageFSC", "startSettingTranslateLanguageUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/setting/api/SettingsTranslateLanguageRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fromContext.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fromContext, "com/tencent/mm/feature/setting/fsc/SettingsTranslateLanguageFSC", "startSettingTranslateLanguageUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/setting/api/SettingsTranslateLanguageRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
