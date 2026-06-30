package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class p implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f243851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b f243852e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b, int i17) {
        this.f243852e = activityC17664x1adcec2b;
        this.f243851d = i17;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c34.r rVar = (c34.r) this.f243852e.f243628f.getItem(i17);
        if (rVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        c34.s Ni = c34.h0.Ni();
        Ni.getClass();
        rVar.f66429x63f8483c = 1;
        rVar.f119770p0 = 1024;
        if (-1 != Ni.f119773d.p("shakeitem1", rVar.mo9763xeb27878e(), "shakeItemID=? and insertBatch=?", new java.lang.String[]{"" + rVar.f66439x8756c24f, "2"})) {
            Ni.m145262xf35bbb4();
        }
        int i18 = rVar.f66443x2262335f;
        if (i18 == 4) {
            java.lang.String str3 = rVar.f66436x13320506;
            if (str3 == null || !str3.equals("newShake")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b = this.f243852e;
                activityC17664x1adcec2b.getClass();
                if (h34.v.b(rVar.f66430xbcdbef, 0L) == null) {
                    activityC17664x1adcec2b.U6(rVar);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    if (b21.q.a()) {
                        b21.m.i(h34.v.b(rVar.f66430xbcdbef, 0L));
                    } else {
                        b21.m.j();
                        intent.putExtra("key_mode", 1);
                        intent.putExtra("KGlobalShakeMusic", true);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.a(h34.v.b(rVar.f66430xbcdbef, 0L)));
                    }
                    intent.putExtra("key_scene", 3);
                    intent.putExtra("session_id", y24.b.f540655a);
                    j45.l.j(activityC17664x1adcec2b, "music", ".ui.MusicMainUI", intent, null);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505();
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    y24.a aVar = new y24.a(c6868x3446b505, 103);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.w(aVar, 100L, null);
                }
            } else {
                this.f243852e.U6(rVar);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 11) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b2 = this.f243852e;
            if (currentTimeMillis - activityC17664x1adcec2b2.f243626d > 2000) {
                activityC17664x1adcec2b2.f243626d = java.lang.System.currentTimeMillis();
                java.lang.String str4 = rVar.f66436x13320506;
                if (str4 == null || str4.split(",").length != 3 || rVar.f66436x13320506.split(",")[0] == null || rVar.f66436x13320506.split(",")[0].equals("")) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", rVar.t0());
                    intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 27);
                    intent2.putExtra("stastic_scene", 5);
                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent2, null);
                } else {
                    java.lang.String[] split = rVar.f66436x13320506.split(",");
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                    am.nx nxVar = c6113xa3727625.f136390g;
                    nxVar.f88999a = split[0];
                    java.lang.String str5 = split[1];
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    nxVar.f89000b = str5 != null ? str5 : "";
                    nxVar.f89001c = java.lang.Integer.parseInt(split[2]);
                    c6113xa3727625.f136390g.f89002d = mc1.l.f72830x366c91de;
                    c6113xa3727625.e();
                }
                if (this.f243852e.f243627e) {
                    h34.r.g(rVar);
                    try {
                        str2 = new java.lang.String(rVar.f66430xbcdbef, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    } catch (java.io.UnsupportedEncodingException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeIbeaconService", e17, "%s", "Unsupported");
                        str2 = null;
                    }
                    if (str2 != null) {
                        java.lang.String[] split2 = str2.split(",");
                        if (split2.length == 4) {
                            java.lang.String str6 = split2[1];
                            java.lang.String str7 = split2[2];
                            java.lang.String str8 = split2[3];
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str7, 0);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str8, 0);
                        }
                    }
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (h34.z.d(i18)) {
            h34.z.c(rVar, this.f243852e, true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b5052 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505();
            ku5.u0 u0Var2 = ku5.t0.f394148d;
            y24.a aVar2 = new y24.a(c6868x3446b5052, 104);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.w(aVar2, 100L, null);
            yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str9 = rVar.f66444xdec927b;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str9, true);
        n17.getClass();
        if (n17.r2()) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", str9);
            str = "onItemClick";
            intent3.putExtra("Contact_Scene", this.f243851d == rVar.f66438x4b6e7fa1 ? 23 : 24);
            intent3.putExtra("Sns_from_Scene", 22);
            if (str9 != null && str9.length() > 0) {
                if (n17.k2()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, rVar.f66444xdec927b + "," + intent3.getIntExtra("Contact_Scene", 23));
                    intent3.putExtra("Contact_Scene", 23);
                }
                intent3.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3104);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent3, this.f243852e);
            }
        } else {
            str = "onItemClick";
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("Contact_User", rVar.f66444xdec927b);
            intent4.putExtra("Contact_Nick", rVar.f66431x21f9b213);
            intent4.putExtra("Contact_Distance", rVar.f66426x2ef4959a);
            intent4.putExtra("Contact_Signature", rVar.f66440xda9bc3b3);
            intent4.putExtra("Contact_Province", rVar.u0());
            intent4.putExtra("Contact_City", rVar.t0());
            intent4.putExtra("Contact_Sex", rVar.f66438x4b6e7fa1);
            intent4.putExtra("Contact_IsLBSFriend", true);
            intent4.putExtra("Contact_VUser_Info", rVar.f66436x13320506);
            intent4.putExtra("Contact_VUser_Info_Flag", rVar.f66434x13320504);
            intent4.putExtra("Contact_Scene", this.f243851d == rVar.f66438x4b6e7fa1 ? 23 : 24);
            intent4.putExtra("Sns_from_Scene", 22);
            intent4.putExtra("Contact_KSnsIFlag", rVar.f66441xfa2a62bf);
            intent4.putExtra("Contact_KSnsBgUrl", rVar.f66442x433be87e);
            if ((rVar.f66434x13320504 & 8) > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, rVar.f66444xdec927b + "," + intent4.getIntExtra("Contact_Scene", 23));
            }
            intent4.putExtra("CONTACT_INFO_UI_SOURCE", 31);
            intent4.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3104);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent4, this.f243852e);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b5053 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505();
        c6868x3446b5053.f141861h = i17 + 1;
        c6868x3446b5053.f141859f = c6868x3446b5053.b("ToUsername", rVar.f66444xdec927b, true);
        c6868x3446b5053.f141864k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f66440xda9bc3b3) ? 1L : 2L;
        c6868x3446b5053.f141862i = rVar.f66438x4b6e7fa1;
        c6868x3446b5053.f141863j = c6868x3446b5053.b("ToUinDistanceStr", rVar.f66426x2ef4959a, true);
        ku5.u0 u0Var3 = ku5.t0.f394148d;
        y24.a aVar3 = new y24.a(c6868x3446b5053, 101);
        ku5.t0 t0Var3 = (ku5.t0) u0Var3;
        t0Var3.getClass();
        t0Var3.w(aVar3, 100L, null);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", str, "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
