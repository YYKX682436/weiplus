package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s f265105g;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s sVar, int i17, android.os.Bundle bundle, int i18) {
        this.f265105g = sVar;
        this.f265102d = i17;
        this.f265103e = bundle;
        this.f265104f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 x17;
        int i17 = this.f265104f;
        android.os.Bundle bundle = this.f265103e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s sVar = this.f265105g;
        int i18 = this.f265102d;
        if (i18 == 20) {
            bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t.class.getClassLoader());
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17).f266517o = bundle.getBundle("jsapiargs");
            java.lang.String str = (java.lang.String) bundle.getCharSequence("bizofstartfrom");
            android.os.Bundle bundle2 = bundle.getBundle("startwebviewparams");
            if (str != null && bundle2 != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5769xe77d2534 c5769xe77d2534 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5769xe77d2534();
                am.yl ylVar = c5769xe77d2534.f136086g;
                ylVar.f90001a = str;
                ylVar.f90002b = bundle2;
                c5769xe77d2534.e();
            }
            sVar.f265099d.f265030w = bundle.getInt("screen_orientation", -1);
            return;
        }
        if (i18 == 21) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17).r6().putAll(bundle);
            return;
        }
        boolean z17 = false;
        if (i18 == 29) {
            java.lang.String string = bundle.getString("srcUsername");
            r01.q3.cj().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && r01.z.l(string)) {
                qk.o b17 = r01.z.b(string);
                if (b17.D0(false) != null && b17.D0(false).d() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.y0()) && (x17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().x(b17.y0())) != null && x17.h1().equals(string) && x17.d1() > 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(b17.y0());
                }
                android.database.Cursor b37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b3(string);
                b37.moveToFirst();
                while (!b37.isAfterLast()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(b37);
                    f9Var.r1(4);
                    b37.moveToNext();
                    z17 = true;
                }
                b37.close();
                if (z17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(string);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Mb(string);
                }
            }
            r01.q3.cj().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && r01.z.l(string)) {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f145049b = string;
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).e();
            }
            r01.q3.Zi().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && r01.z.l(string)) {
                r01.r1 Zi = r01.q3.Zi();
                Zi.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new r01.p1(Zi, null, string, null, 0));
                return;
            }
            return;
        }
        if (i18 == 30) {
            java.lang.String string2 = bundle.getString("srcUsername");
            r01.q3.cj().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) && r01.z.l(string2)) {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f145049b = "";
            }
            r01.q3.Zi().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) && r01.z.l(string2)) {
                r01.r1 Zi2 = r01.q3.Zi();
                Zi2.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new r01.q1(Zi2, null, string2));
                return;
            }
            return;
        }
        if (i18 == 53) {
            if (java.lang.Boolean.valueOf(bundle.getBoolean("web_search_data_ui_image_path_use_circle_to_search")).booleanValue()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String string3 = bundle.getString("web_search_data_ui_image_path");
                java.lang.String string4 = bundle.getString("web_search_data_ui_image_path_origin_url");
                java.lang.String string5 = bundle.getString("web_search_data_ui_image_path_image_url");
                hashMap.put("imgPath", string3);
                hashMap.put("sourceUrl", string4);
                hashMap.put("imageUrl", string5);
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 7, 8, hashMap);
                return;
            }
            su4.i1 i1Var = new su4.i1();
            i1Var.f494456b = sVar.f265099d;
            i1Var.f494461g = bundle.getString("web_search_data_ui_image_path");
            i1Var.f494458d = bundle.getInt("KWebSearchSendDataImagePath_from_source");
            i1Var.f494463i = 83;
            i1Var.f494455a = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265463w;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265463w = 0L;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
            return;
        }
        if (i18 == 54) {
            java.lang.String string6 = bundle.getString("web_search_data_ui_image_path_origin_url");
            java.lang.String string7 = bundle.getString("web_search_data_ui_image_path");
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            long g17 = o13.n.g(67);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265463w = g17;
            java.lang.String c17 = o13.p.c(g17);
            int i19 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6) || !(string6.startsWith("http://mp.weixin.qq.com/s?") || string6.startsWith("https://mp.weixin.qq.com/s?") || string6.startsWith("http://mp.weixin.qq.com/s/") || string6.startsWith("https://mp.weixin.qq.com/s/"))) ? 14 : 11;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
            c6367x7875a8e4.t(c17);
            c6367x7875a8e4.r("");
            c6367x7875a8e4.f137161f = i19;
            c6367x7875a8e4.f137160e = 1;
            c6367x7875a8e4.f137162g = 83;
            c6367x7875a8e4.q("");
            c6367x7875a8e4.p("");
            c6367x7875a8e4.f137165j = 0;
            c6367x7875a8e4.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(string7));
            c6367x7875a8e4.f137168m = java.lang.System.currentTimeMillis();
            c6367x7875a8e4.k();
            su4.k3.m(c6367x7875a8e4);
            return;
        }
        switch (i18) {
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.a(sVar.f265099d, 2, bundle, i17);
                return;
            case 2:
                db5.t7.k(sVar.f265099d, null);
                return;
            case 3:
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putInt("stat_scene", 4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
                if (a17 != null) {
                    bundle3.putString("stat_url", a17.n6());
                }
                sVar.f265099d.f265021n.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.u(sVar, bundle, bundle3));
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.a(sVar.f265099d, 3, bundle, i17);
                return;
            case 5:
                int i27 = bundle.getInt("scene_end_type", 0);
                int i28 = bundle.getInt("scene_end_listener_hash_code", -1);
                if (i28 != -1) {
                    ((java.util.HashSet) sVar.f265099d.f265029v).add(java.lang.Integer.valueOf(i28));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "add Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_inc_count[%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(((java.util.HashSet) sVar.f265099d.f265029v).size()), java.lang.Integer.valueOf(sVar.f265099d.f265020m));
                if (i27 > 0) {
                    sVar.f265099d.f265020m++;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "real add Scene end, hashCode:[%d]", java.lang.Integer.valueOf(i28));
                    gm0.j1.d().a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, sVar.f265099d);
                    gm0.j1.d().a(673, sVar.f265099d);
                    gm0.j1.d().a(ma1.i.f72803x366c91de, sVar.f265099d);
                    return;
                }
                return;
            case 6:
                int i29 = bundle.getInt("scene_end_type", 0);
                int i37 = bundle.getInt("scene_end_listener_hash_code", -1);
                if (i37 != -1) {
                    ((java.util.HashSet) sVar.f265099d.f265029v).remove(java.lang.Integer.valueOf(i37));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_dec_count:[%d]", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(((java.util.HashSet) sVar.f265099d.f265029v).size()), java.lang.Integer.valueOf(sVar.f265099d.f265020m));
                if (i29 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = sVar.f265099d;
                    int i38 = serviceC19302xd3c5b06e.f265020m - 1;
                    serviceC19302xd3c5b06e.f265020m = i38;
                    if (i38 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set size:[%d], unexpected_count[%d]", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(((java.util.HashSet) sVar.f265099d.f265029v).size()), java.lang.Integer.valueOf(sVar.f265099d.f265020m));
                        sVar.f265099d.f265020m = 0;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e2 = sVar.f265099d;
                    if (serviceC19302xd3c5b06e2.f265020m > 0 || ((java.util.HashSet) serviceC19302xd3c5b06e2.f265029v).size() > 0) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "real remove Scene end, hashCode:[%d]", java.lang.Integer.valueOf(i37));
                    if (gm0.j1.a()) {
                        gm0.j1.d().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, sVar.f265099d);
                        gm0.j1.d().q(673, sVar.f265099d);
                        gm0.j1.d().q(ma1.i.f72803x366c91de, sVar.f265099d);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
                intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
                intent.addFlags(268435456);
                o25.t1 t1Var = dw4.a.f325830a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e3 = sVar.f265099d;
                ((com.p314xaae8f345.mm.app.y7) t1Var).getClass();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtras(intent.getExtras());
                if (intent.getFlags() != 0) {
                    intent2.addFlags(intent.getFlags());
                }
                java.lang.String str2 = o25.z.f424126a;
                if (c01.e2.a0()) {
                    o25.z.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, o45.cg.a());
                    return;
                } else {
                    o25.z.j(serviceC19302xd3c5b06e3, o45.cg.a());
                    return;
                }
            case 8:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtras(bundle);
                intent3.addFlags(268435456);
                o25.t1 t1Var2 = dw4.a.f325830a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e4 = sVar.f265099d;
                ((com.p314xaae8f345.mm.app.y7) t1Var2).getClass();
                if (serviceC19302xd3c5b06e4 != null) {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtras(intent3.getExtras());
                    if (intent3.getFlags() != 0) {
                        intent4.addFlags(intent3.getFlags());
                    }
                    j45.l.j(serviceC19302xd3c5b06e4, "subapp", ".ui.pluginapp.ContactSearchUI", intent4, null);
                    return;
                }
                return;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "not support action code:[%d]", java.lang.Integer.valueOf(i18));
                return;
        }
    }
}
