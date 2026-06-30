package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class b0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0 f266472d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0();

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f266473e;

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0 b0Var, nw4.k kVar, nw4.y2 y2Var, int i17, int i18, android.content.Intent intent) {
        b0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "request to open file chooser for passport image, result code = " + i18);
        if (i18 == -1) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.s(intent, kVar, y2Var).mo152xb9724478();
        } else if (i18 != 0) {
            kVar.f422396d.e(y2Var.f422546c, "choosePassport:fail", null);
        } else {
            kVar.f422396d.e(y2Var.f422546c, "choosePassport:cancel", null);
        }
    }

    public static final java.lang.String f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0 b0Var, java.lang.String str, long j17, long j18) {
        java.lang.String str2;
        b0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = Zi != null ? Zi.b(str) : null;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s localId:%s", "item_null", str);
            return null;
        }
        java.lang.String str3 = b17.f264271g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s localId:%s", "path_empty", str);
            return null;
        }
        if (str3 == null) {
            return null;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s srcPath:%s", "src_not_exist", h(b0Var, str3, 0, 2, null));
            return null;
        }
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport album original param need:%b maxMB:%d localId:%s srcSize:%d srcPath:%s", java.lang.Boolean.TRUE, java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(k17), h(b0Var, str3, 0, 2, null));
        if (k17 > j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s srcSize:%d maxBytes:%d", "over_max_size", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(j18));
            return null;
        }
        java.lang.String str4 = lp0.b.e() + "tmpChoosePassportOriginal/";
        com.p314xaae8f345.mm.vfs.w6.u(str4);
        com.p314xaae8f345.mm.vfs.w6.t(str4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str4);
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('_');
        sb6.append(java.util.UUID.randomUUID());
        int O = r26.n0.O(str3, '/', 0, false, 6, null);
        int O2 = r26.n0.O(str3, '.', 0, false, 6, null);
        if (O2 <= O || O2 >= str3.length() - 1) {
            str2 = "";
        } else {
            str2 = str3.substring(O2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(str3, sb7, false);
        if (d17 < 0 || !com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s ret:%d dstPath:%s", "copy_failed", java.lang.Long.valueOf(d17), h(b0Var, sb7, 0, 2, null));
            return null;
        }
        long k18 = com.p314xaae8f345.mm.vfs.w6.k(sb7);
        if (k17 != k18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s srcSize:%d dstSize:%d", "copy_size_mismatch", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(k18));
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(sb7);
        d18.f264281t = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4 Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi();
        if (Zi2 != null) {
            Zi2.a(d18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original saved originLocalId:%s srcSize:%d dstSize:%d dstPath:%s", d18.f264269e, java.lang.Long.valueOf(k17), java.lang.Long.valueOf(k18), h(b0Var, sb7, 0, 2, null));
        return d18.f264269e;
    }

    public static final void g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0 b0Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap, java.lang.String str) {
        long j17;
        b0Var.getClass();
        java.lang.Object obj = y2Var.f422323a.get("originalImageMaxSize");
        if (obj instanceof java.lang.Number) {
            j17 = ((java.lang.Number) obj).longValue();
        } else {
            if (obj instanceof java.lang.String) {
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.Long j18 = r26.h0.j(str2);
                if (j18 != null) {
                    j17 = j18.longValue();
                } else {
                    java.lang.Double e17 = r26.g0.e(str2);
                    java.lang.Long valueOf = e17 != null ? java.lang.Long.valueOf((long) e17.doubleValue()) : null;
                    if (valueOf != null) {
                        j17 = valueOf.longValue();
                    }
                }
            }
            j17 = 10;
        }
        long j19 = j17 > 0 ? j17 : 10L;
        dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x(str, j19, j19 * 1048576, hashMap, kVar, y2Var));
    }

    public static java.lang.String h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0 b0Var, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 160;
        }
        b0Var.getClass();
        if (str != null && str.length() > i17) {
            java.lang.String substring = str.substring(0, i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            return substring.concat("...");
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        j(1);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(env.f422393a).a(null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y(env), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.z(env, msg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a0(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 507;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "choosePassport";
    }

    public final void i(nw4.k kVar, nw4.y2 y2Var, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_capture", i17);
        intent.putExtra("key_pick_local_pic_query_source_type", 8);
        intent.putExtra("query_media_type", 1);
        intent.putExtra("key_pick_local_pic_count", 1);
        java.lang.String str = (java.lang.String) y2Var.f422323a.get("liteAppBusinessScene");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "doChooseImageIdCard liteapp business scene:%s", str);
        if (str.length() > 0) {
            intent.putExtra("key_liteapp_business_scene", str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "doChooseImageIdCard: realScene: %d, querySourceType: %d", java.lang.Integer.valueOf(i17), 8);
        android.content.Context context = kVar.f422393a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.t(kVar, y2Var));
            j45.l.o(kVar.f422393a, "webview", ".ui.tools.OpenFileChooserUI", intent, 43, false);
        }
        java.lang.Object obj = kVar.f422393a;
        if (obj instanceof q80.z) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) obj).R1(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.u(kVar, y2Var));
            j45.l.o(kVar.f422393a, "webview", ".ui.tools.OpenFileChooserUI", intent, 43, false);
        }
    }

    public final void j(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(32227, i17 + ",0,0,0");
    }
}
