package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o f235000d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar) {
        this.f235000d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String d17;
        pb5.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17;
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar = this.f235000d;
        switch (itemId) {
            case 2:
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = oVar.f235075b;
                java.lang.String d18 = z3Var != null ? z3Var.d1() : null;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = oVar.f235075b;
                java.lang.String d19 = z3Var2 != null ? z3Var2.d1() : null;
                gr3.e.d(d19 == null ? "" : d19, 800, oVar.f235077d.c(), oVar.f235074a.getIntent(), oVar.f235081h, oVar.f235077d.b(), 0, null, null, null, 0, 0, 4032, null);
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = oVar.f235075b;
                if (z3Var3 != null && z3Var3.l2()) {
                    z17 = true;
                }
                if (z17) {
                    ob5.a aVar2 = new ob5.a();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var4 = oVar.f235075b;
                    d17 = z3Var4 != null ? z3Var4.d1() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    aVar2.n(d17);
                    aVar = aVar2;
                } else {
                    pb5.a aVar3 = new pb5.a();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var5 = oVar.f235075b;
                    d17 = z3Var5 != null ? z3Var5.d1() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    aVar3.n(d17);
                    aVar = aVar3;
                }
                n13.r rVar = new n13.r();
                rVar.f415658i.add(d18 != null ? d18 : "");
                rVar.f415651b = 1;
                rVar.f415653d.f415672a = 8;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(oVar.f235074a, aVar, rVar);
                return;
            case 3:
                oVar.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(oVar.f235074a, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var6 = oVar.f235075b;
                intent.putExtra("Contact_User", z3Var6 != null ? z3Var6.d1() : null);
                intent.putExtra("key_start_biz_profile_setting_from_scene", 2);
                intent.putExtra("key_profile_enter_timestamp", oVar.f235077d.c());
                intent.putExtra("key_start_biz_profile_setting_service_type", oVar.f235081h);
                intent.putExtras(oVar.f235074a.getIntent());
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = oVar.f235074a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC16840x4302a3e2, arrayList.toArray(), "com/tencent/mm/plugin/profile/BizProfileMenuController", "jumpToSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16840x4302a3e2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC16840x4302a3e2, "com/tencent/mm/plugin/profile/BizProfileMenuController", "jumpToSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 4:
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var7 = oVar.f235075b;
                java.lang.String d110 = z3Var7 != null ? z3Var7.d1() : null;
                gr3.e.d(d110 == null ? "" : d110, oc1.f.f73032x366c91de, oVar.f235077d.c(), oVar.f235074a.getIntent(), oVar.f235081h, oVar.f235077d.b(), 0, null, null, null, 0, 0, 4032, null);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var8 = oVar.f235075b;
                c01.i0.a(z3Var8 != null ? z3Var8.d1() : null, true);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var9 = oVar.f235075b;
                if (z3Var9 != null && ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui() && z3Var9.m2()) {
                    if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Bi(z3Var9.d1()) && (p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(z3Var9.d1())) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("service_officialaccounts", p17.W0())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileMenuController", "dealBrandEcsPlaceTopLogic place top out brand ecs box:%s", z3Var9.d1());
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().M(z3Var9.d1());
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5196x9324f929 c5196x9324f929 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5196x9324f929();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var10 = oVar.f235075b;
                c5196x9324f929.f135537g.f89581a = z3Var10 != null ? z3Var10.d1() : null;
                c5196x9324f929.e();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var11 = oVar.f235075b;
                if (r01.z.n(z3Var11 != null ? z3Var11.d1() : null)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e22 = oVar.f235074a;
                    db5.e1.T(activityC16840x4302a3e22, activityC16840x4302a3e22.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqg));
                    return;
                }
                return;
            case 5:
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var12 = oVar.f235075b;
                c01.e2.B0(z3Var12 != null ? z3Var12.d1() : null, true, true);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var13 = oVar.f235075b;
                if (z3Var13 != null && ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui() && z3Var13.m2()) {
                    if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Bi(z3Var13.d1())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileMenuController", "dealBrandEcsUnPlaceTopLogic un place top to brand ecs box:%s", z3Var13.d1());
                        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                        java.lang.String d111 = z3Var13.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d111, "getUsername(...)");
                        Di.P(new java.lang.String[]{d111}, "service_officialaccounts");
                    }
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var14 = oVar.f235075b;
                java.lang.String d112 = z3Var14 != null ? z3Var14.d1() : null;
                gr3.e.d(d112 == null ? "" : d112, 904, oVar.f235077d.c(), oVar.f235074a.getIntent(), oVar.f235081h, oVar.f235077d.b(), 0, null, null, null, 0, 0, 4032, null);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5196x9324f929 c5196x9324f9292 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5196x9324f929();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var15 = oVar.f235075b;
                c5196x9324f9292.f135537g.f89581a = z3Var15 != null ? z3Var15.d1() : null;
                c5196x9324f9292.e();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var16 = oVar.f235075b;
                if (r01.z.n(z3Var16 != null ? z3Var16.d1() : null)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e23 = oVar.f235074a;
                    db5.e1.T(activityC16840x4302a3e23, activityC16840x4302a3e23.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ama));
                    return;
                }
                return;
            case 6:
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var17 = oVar.f235075b;
                if (z3Var17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var17.d1())) {
                    return;
                }
                gr3.f.f356390a.a(oVar.f235080g, "complaint", "", -1L);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var18 = oVar.f235075b;
                java.lang.String d113 = z3Var18 != null ? z3Var18.d1() : null;
                gr3.e.d(d113 == null ? "" : d113, 601, oVar.f235077d.c(), oVar.f235074a.getIntent(), oVar.f235081h, oVar.f235077d.b(), 0, null, null, null, 0, 0, 4032, null);
                android.content.Intent intent2 = new android.content.Intent();
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var19 = oVar.f235075b;
                java.lang.String d114 = z3Var19 != null ? z3Var19.d1() : null;
                objArr[0] = d114 != null ? d114 : "";
                java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", java.util.Arrays.copyOf(objArr, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                intent2.putExtra("rawUrl", format);
                intent2.putExtra("key_menu_hide_expose", true);
                j45.l.j(oVar.f235074a, "webview", ".ui.tools.WebViewUI", intent2, null);
                return;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = oVar.f235078e;
                if (m0Var != null) {
                    m0Var.f();
                    return;
                }
                return;
            case 8:
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.o(oVar.f235074a, oVar.f235076c, oVar.f235087n, true, oVar.f235077d.c(), oVar.f235081h, oVar.f235077d.b(), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.f(oVar));
                return;
            case 9:
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileMenuController", "default onMMMenuItemSelected err");
                return;
            case 10:
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var2 = oVar.f235078e;
                if (m0Var2 != null) {
                    m0Var2.g();
                    return;
                }
                return;
        }
    }
}
