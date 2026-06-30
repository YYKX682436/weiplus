package ms4;

/* loaded from: classes8.dex */
public class z implements js4.i {
    public z() {
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41383xb7de63a5(false);
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41382xcdae5de7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19061x48b2899b.class);
    }

    public final js4.k a(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, js4.n nVar) {
        if (nVar.f383082g != js4.m.DIRECT_CHARGE) {
            if (activityC1102x9ee2d9f != null) {
                return new ns4.s(activityC1102x9ee2d9f, nVar);
            }
            return null;
        }
        if (activityC1102x9ee2d9f == null || android.text.TextUtils.isEmpty(nVar.f383081f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinManagerImplement", "DirectRecharge productInfo is invalid.");
            ((ku5.t0) ku5.t0.f394148d).B(new ms4.y(this, nVar));
        } else {
            ms4.j0.f412579e.c(activityC1102x9ee2d9f, nVar);
        }
        return null;
    }

    public void b(js4.o oVar) {
        new ks4.e().l().h(new ms4.x(this, oVar));
    }

    public boolean c() {
        return "CN".equalsIgnoreCase(gm0.j1.u().c().u(274436, "CN")) || (c01.z1.i() & 8) != 0;
    }

    public js4.k d(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, js4.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinManagerImplement", "prepareWeCoinRecharge");
        if (nVar.f383085j) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            js4.r.f383100c = uuid;
            js4.r.f383098a = nVar.f383077b;
        }
        if (c()) {
            return a(activityC1102x9ee2d9f, nVar);
        }
        f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC1102x9ee2d9f, new ms4.w(this, activityC1102x9ee2d9f, nVar));
        return null;
    }

    public js4.h e(android.content.Context context, boolean z17) {
        if (context == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECOIN_HAS_SHOW_ENTRANCE_TUTORIAL_BOOLEAN_SYNC;
        java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            return null;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        return new ns4.p1(context, z17);
    }

    public void f(android.app.Activity activity, js4.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinManagerImplement", "showWecoinAuthDialog");
        if (activity == null) {
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        ms4.v vVar = new ms4.v(this, oVar);
        ((vd0.j2) q1Var).getClass();
        v24.o0.b(activity, 8L, true, vVar);
    }

    public java.lang.Object g(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, js4.q qVar, java.lang.ref.WeakReference weakReference) {
        ls4.w wVar = new ls4.w(abstractActivityC21394xb3d2c0cf, qVar, weakReference);
        r45.kj5 kj5Var = wVar.f402639b.f383092d;
        if (kj5Var == null || kj5Var.f460299i != 1) {
            wVar.a();
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(wVar.f402638a), null, null, new ls4.v(wVar, null), 3, null);
        }
        return wVar;
    }

    public void h(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.class);
        } else {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.class);
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("wecoin_enter_encash_business_kv_data", new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630(1, str, ""));
        intent.putExtra("wecoin_enter_encash_business_kv_is_cocert_activate", z17);
        intent.putExtra("wecoin_enter_encash_business_kv_tips", str2);
        intent.putExtra("WECOIN_BUSINESS_ID", i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinIncomeDetailView", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinIncomeDetailView", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.class);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinMainPageView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinMainPageView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
