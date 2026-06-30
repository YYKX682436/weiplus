package zk3;

/* loaded from: classes8.dex */
public final class x0 extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 2;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.mo11468x92b714fd(info.f66790x225a93cf);
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(k97Var.m75945x2fec8307(1))) {
                java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                android.net.Uri parse = android.net.Uri.parse(m75945x2fec8307);
                android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryParameterNames, "getQueryParameterNames(...)");
                for (java.lang.String str : queryParameterNames) {
                    java.util.List<java.lang.String> c17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) ? kz5.b0.c("334") : parse.getQueryParameters(str);
                    if (c17 != null) {
                        java.util.Iterator<T> it = c17.iterator();
                        while (it.hasNext()) {
                            clearQuery.appendQueryParameter(str, (java.lang.String) it.next());
                        }
                    }
                }
                if (!parse.getQueryParameterNames().contains(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
                    clearQuery.appendQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "334");
                }
                if (parse.getFragment() != null) {
                    clearQuery.fragment(parse.getFragment());
                }
                k97Var.set(1, clearQuery.build().toString());
                k97Var.set(13, 334);
            }
        } catch (java.lang.Exception unused) {
        }
        android.content.Intent intent = new android.content.Intent();
        al3.d.b(intent, k97Var);
        int m75939xb282bd08 = k97Var.m75939xb282bd08(19);
        r45.w60 w60Var = new r45.w60();
        w60Var.set(3, bm5.f1.a());
        w60Var.set(0, animateData);
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((md0.e) eVar).getClass();
            if ((context instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 ? (t04.a) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(t04.a.class) : null) != null) {
                nd0.e eVar2 = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context2 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar2).wi(context2, 5);
                w60Var.set(1, kr4Var != null ? kr4Var.m75945x2fec8307(0) : null);
            }
        }
        intent.putExtra("rawUrl", k97Var.m75945x2fec8307(1));
        intent.putExtra("convertActivityFromTranslucent", false);
        intent.putExtra("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
        intent.putExtra("float_ball_key", info.f66791xc8a07680);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        intent.putExtra("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        intent.putExtra("currentAnimOut", 0);
        intent.putExtra("minimize_secene", 0);
        intent.putExtra("webpageTitle", k97Var.m75945x2fec8307(4));
        if (m75939xb282bd08 > -1) {
            boolean z17 = m75939xb282bd08 == 5;
            int m75939xb282bd082 = k97Var.m75939xb282bd08(13);
            int m75939xb282bd083 = k97Var.m75939xb282bd08(14);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(m75939xb282bd082)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(m158354x19263085(), k97Var.m75945x2fec8307(1), m75939xb282bd08, z17, m75939xb282bd082, m75939xb282bd083, intent)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskUIC", "openWebPage, use fast Load");
                    return;
                }
            }
        }
        j45.l.j(m158354x19263085(), "webview", ".ui.tools.WebViewUI", intent, null);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265737d.remove(info.f66791xc8a07680);
    }

    @Override // pk3.h
    public void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        info.f66792x98981ec.m75945x2fec8307(1);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a.f(info);
    }

    @Override // pk3.h
    public void S6() {
    }

    @Override // pk3.h
    public void T6() {
    }

    @Override // pk3.h
    public void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        info.f66792x98981ec.m75945x2fec8307(1);
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.mo11468x92b714fd(info.f66790x225a93cf);
            int m75939xb282bd08 = k97Var.m75939xb282bd08(19);
            java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(1);
            if (m75939xb282bd08 > -1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                int m75939xb282bd082 = k97Var.m75939xb282bd08(13);
                info.f66792x98981ec.m75945x2fec8307(1);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(m75945x2fec8307, m75939xb282bd08, m75939xb282bd082, new java.lang.Object[0]);
            }
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a.e(info);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebMultiTaskUIC", "WebMultiTaskData parse fail", th6);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return super.mo569x2ee31f5b();
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
