package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes12.dex */
public class jf implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kf f242728d;

    public jf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kf kfVar) {
        this.f242728d = kfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17431x39cec8f activityC17431x39cec8f = this.f242728d.f242771d;
        java.lang.String str = activityC17431x39cec8f.f242015m;
        boolean z17 = activityC17431x39cec8f.f242016n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "saveLanguage language: %s notauth %s", str, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243039e.a(activityC17431x39cec8f, "select_view_language", str, 4);
        java.util.Locale s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(str);
        if ("language_default".equalsIgnoreCase(str)) {
            s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274381b;
            java.util.Locale.setDefault(s17);
        }
        activityC17431x39cec8f.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putString("language_key", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.e8.a("language_key", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocaleUtil", "save application lang as:".concat(str));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5231x854ca832 c5231x854ca832 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5231x854ca832();
        c5231x854ca832.f135564g.f89695a = str;
        c5231x854ca832.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.q9.a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 h9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.f274468a.f274400a;
        if (h9Var != null) {
            h9Var.mo13963xc84a8199();
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.h(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(activityC17431x39cec8f, s17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.e8.a("system_property_key_locale", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e = j65.j.e(activityC17431x39cec8f.getApplication().getResources(), activityC17431x39cec8f.getApplication(), false);
        com.p314xaae8f345.mm.p2621x8fb0427b.ha.s();
        com.p314xaae8f345.p3210x3857dc.a3.C(s17);
        if (z17) {
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true), activityC17431x39cec8f);
        } else {
            gm0.j1.d().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lf(activityC17431x39cec8f), null));
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.ui.u2.f292595a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_RELOAD_RESOURCES");
            intent.putExtra("tools_language", str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
            android.content.Intent intent2 = new android.content.Intent(activityC17431x39cec8f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.C17356xc6abdd48.class);
            intent2.putExtra("switch_process_action_code_key", "action_reload_resources");
            intent2.putExtra("switch_language", str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17657x77c04133.f243567w = 8;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().f375085a.clear();
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Intro_Need_Clear_Top ", true);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(intent3, activityC17431x39cec8f);
        }
        return null;
    }
}
