package pg2;

/* loaded from: classes3.dex */
public final class n0 implements com.p314xaae8f345.mm.ui.cd, j45.k {
    static {
        new pg2.m0(null);
    }

    @Override // com.p314xaae8f345.mm.ui.ad, j45.i
    public boolean b(android.content.Context context, java.lang.String activity, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        if (context != null) {
            if (!(activity == null || activity.length() == 0) && intent != null) {
                try {
                    c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
                    if (s0Var == null) {
                        return false;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    if ((r26.i0.n(activity, "FinderLiveVisitorWithoutAffinityUI", false) || r26.i0.n(activity, "FinderLiveVisitorAffinityUI", false) || r26.i0.n(activity, "FinderLiveVisitorTopStoryAffinityUI", false)) && ((pg2.j0) s0Var).wh() && !intent.getBooleanExtra("key_handle_insert", false) && !intent.getBooleanExtra("intent_key_support_performer", false) && !(context instanceof com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorUIStartInterceptor", "insert start ViewFluentTransparentActivity from " + context.getClass().getSimpleName() + '@' + context.hashCode() + " to " + activity);
                        intent.putExtra("key_handle_insert", true);
                        ez2.e eVar = ez2.g.f339435a;
                        if (eVar != null) {
                            eVar.c();
                        }
                        boolean z17 = context instanceof android.app.Activity;
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) ((z17 || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(context)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.class : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14108xc249afc1.class));
                        if (!z17) {
                            intent2.addFlags(268435456);
                        }
                        intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveVisitorUIStartInterceptor", "intercept", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILcom/tencent/mm/ui/IActInterceptExtension;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveVisitorUIStartInterceptor", "intercept", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILcom/tencent/mm/ui/IActInterceptExtension;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    return false;
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveVisitorUIStartInterceptor", "IFinderLiveSurfaceViewService not registered in process (like appbrand, it's ok)");
                }
            }
        }
        return false;
    }
}
