package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p0 implements com.tencent.mm.plugin.appbrand.page.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.o1 f86979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f86982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86983e;

    public p0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, com.tencent.mm.plugin.appbrand.page.o1 o1Var, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str, android.widget.TextView textView) {
        this.f86983e = appBrandMenuHeader;
        this.f86979a = o1Var;
        this.f86980b = o6Var;
        this.f86981c = str;
        this.f86982d = textView;
    }

    public void a(java.lang.String str) {
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f86983e;
        appBrandMenuHeader.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            appBrandMenuHeader.f86358r.setVisibility(8);
        } else {
            appBrandMenuHeader.f86358r.setText(str);
            appBrandMenuHeader.f86358r.setVisibility(0);
        }
    }

    public void b(final com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule, boolean z17, boolean z18) {
        r45.fk6 fk6Var;
        java.util.LinkedList linkedList;
        final com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f86983e;
        java.lang.String str = this.f86979a.f86940a.f74803n;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86980b;
        appBrandMenuHeader.f86359s.setVisibility(0);
        if (appBrandMenuHeader.E.getVisibility() == 0) {
            android.view.View view = appBrandMenuHeader.f86366z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showTradeCommentInfo", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Lcom/tencent/mm/protocal/protobuf/AppCommentModule;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showTradeCommentInfo", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Lcom/tencent/mm/protocal/protobuf/AppCommentModule;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = appBrandMenuHeader.f86359s;
        if (z17) {
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton d17 = o6Var.f74821z.d();
            boolean z19 = d17.f91036g;
            d17.f91036g = false;
            if (z19) {
                int color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478660pd);
                android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), 0, java.lang.Integer.valueOf(color));
                ofObject.setDuration(300L);
                ofObject.addUpdateListener(new com.tencent.mm.plugin.appbrand.page.c0(appBrandMenuHeader, linearLayout));
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 1);
                ofInt.setDuration(1000L);
                android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), 0);
                ofObject2.setDuration(300L);
                ofObject2.addUpdateListener(new com.tencent.mm.plugin.appbrand.page.d0(appBrandMenuHeader, linearLayout));
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playSequentially(ofObject, ofInt, ofObject2);
                animatorSet.start();
            }
        }
        if (android.text.TextUtils.isEmpty(appCommentModule.name_text)) {
            l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.page.u0(appBrandMenuHeader), com.tencent.mm.ui.bk.C() ? appCommentModule.name_img_url_black : appCommentModule.name_img_url, null);
        } else {
            appBrandMenuHeader.f86350g.setText(appCommentModule.name_text);
            appBrandMenuHeader.a(true);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.score_str)) {
            appBrandMenuHeader.a(true);
            appBrandMenuHeader.f86350g.setText(appCommentModule.no_score_text);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.more_appid) && com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.recommend) && com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.more_text)) {
                appBrandMenuHeader.f86356p.setVisibility(0);
                appBrandMenuHeader.f86350g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getColor(com.tencent.mm.R.color.f478873jj));
            }
        } else {
            appBrandMenuHeader.f86352i.setVisibility(0);
            appBrandMenuHeader.f86352i.setText(java.lang.String.format("%.1f", java.lang.Float.valueOf(appCommentModule.score_num / 100.0f)));
            if (com.tencent.mm.sdk.platformtools.m2.j()) {
                appBrandMenuHeader.f86353m.setVisibility(0);
            } else {
                appBrandMenuHeader.f86353m.setVisibility(8);
            }
        }
        r45.y9 y9Var = appCommentModule.recommend_list;
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$b
            @Override // yz5.a
            public final java.lang.Object invoke() {
                l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
                com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader2 = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.this;
                appBrandMenuHeader2.getClass();
                com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule2 = appCommentModule;
                appBrandMenuHeader2.b(appCommentModule2.more_appid, appCommentModule2.more_path, appCommentModule2.more_query);
                return null;
            }
        };
        if (appBrandMenuHeader.c(y9Var)) {
            appBrandMenuHeader.A.setVisibility(8);
        } else if (y9Var == null || (fk6Var = y9Var.f390874e) == null || (linkedList = fk6Var.f374415d) == null || linkedList.size() == 0) {
            appBrandMenuHeader.A.setVisibility(8);
        } else {
            appBrandMenuHeader.A.setVisibility(0);
            appBrandMenuHeader.A.setAdapter(new com.tencent.mm.plugin.appbrand.page.h0(appBrandMenuHeader, y9Var, aVar, str));
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(appBrandMenuHeader.f86348e.getContext());
            linearLayoutManager.Q(0);
            appBrandMenuHeader.A.setLayoutManager(linearLayoutManager);
            appBrandMenuHeader.A.setNestedScrollingEnabled(false);
            appBrandMenuHeader.A.setOverScrollMode(2);
            com.tencent.mm.plugin.appbrand.report.v0.k(str, 1, 4, 1);
        }
        r45.y9 y9Var2 = appCommentModule.recommend_list;
        if (appBrandMenuHeader.c(y9Var2)) {
            appBrandMenuHeader.C.setVisibility(0);
            appBrandMenuHeader.C.setAdapter(new com.tencent.mm.plugin.appbrand.page.f0(appBrandMenuHeader, y9Var2, str));
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = new androidx.recyclerview.widget.LinearLayoutManager(appBrandMenuHeader.f86348e.getContext());
            linearLayoutManager2.Q(1);
            appBrandMenuHeader.C.setLayoutManager(linearLayoutManager2);
            appBrandMenuHeader.C.setNestedScrollingEnabled(false);
            appBrandMenuHeader.C.setOverScrollMode(2);
            com.tencent.mm.plugin.appbrand.report.v0.l(str, 1, 6, 1, "" + y9Var2.f390876g.f387994d.size());
        } else {
            appBrandMenuHeader.C.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.recommend)) {
            appBrandMenuHeader.f86361u.setVisibility(8);
        } else if (appBrandMenuHeader.c(appCommentModule.recommend_list)) {
            appBrandMenuHeader.f86361u.setVisibility(8);
        } else {
            appBrandMenuHeader.f86361u.setVisibility(0);
            appBrandMenuHeader.f86357q.setVisibility(0);
            java.lang.String str2 = appCommentModule.recommend;
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490638n40);
            java.lang.String str3 = str2 != null ? str2 : "";
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) string);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append((java.lang.CharSequence) str3);
            appBrandMenuHeader.f86357q.setText(spannableStringBuilder);
            com.tencent.mm.plugin.appbrand.report.v0.k(str, 1, 2, 1);
        }
        java.lang.String str4 = appCommentModule.more_text;
        java.lang.String str5 = appCommentModule.more_appid;
        java.lang.String str6 = appCommentModule.more_path;
        java.lang.String str7 = appCommentModule.more_query;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a2d);
        }
        appBrandMenuHeader.f86354n.setText(str4);
        appBrandMenuHeader.f86354n.setOnClickListener(new com.tencent.mm.plugin.appbrand.page.i0(appBrandMenuHeader, str5, str6, str7, str));
        appBrandMenuHeader.f86355o.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.low_score_text) ? 8 : 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.low_score_text)) {
            appBrandMenuHeader.f86355o.setText(appCommentModule.low_score_text);
        }
        com.tencent.mm.plugin.appbrand.page.a0 a0Var = new com.tencent.mm.plugin.appbrand.page.a0(appBrandMenuHeader, appCommentModule, str);
        appBrandMenuHeader.f86360t.setOnClickListener(a0Var);
        appBrandMenuHeader.f86361u.setOnClickListener(a0Var);
        r45.s04 s04Var = appCommentModule.invite_info;
        if (s04Var != null) {
            appBrandMenuHeader.f86362v.setVisibility(0);
            com.tencent.mm.plugin.appbrand.report.v0.k(str, 1, 3, 1);
            if (com.tencent.mm.sdk.platformtools.t8.K0(s04Var.f385367i)) {
                appBrandMenuHeader.f86363w.setVisibility(0);
                appBrandMenuHeader.f86363w.setText(s04Var.f385362d);
                appBrandMenuHeader.f86364x.setText(s04Var.f385363e);
            } else {
                appBrandMenuHeader.f86364x.setText(s04Var.f385367i);
                appBrandMenuHeader.f86363w.setVisibility(8);
            }
            appBrandMenuHeader.f86364x.setOnClickListener(new com.tencent.mm.plugin.appbrand.page.b0(appBrandMenuHeader, s04Var, str));
        } else {
            appBrandMenuHeader.f86362v.setVisibility(8);
        }
        if (z18) {
            appBrandMenuHeader.f86361u.setVisibility(8);
            appBrandMenuHeader.A.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(appCommentModule.more_text)) {
                appBrandMenuHeader.f86365y.setVisibility(8);
            } else {
                appBrandMenuHeader.f86365y.setVisibility(0);
                appBrandMenuHeader.f86365y.setText(appCommentModule.more_text);
            }
        }
        com.tencent.mm.plugin.appbrand.report.v0.k(this.f86979a.f86940a.f74803n, 1, 1, 1);
    }
}
