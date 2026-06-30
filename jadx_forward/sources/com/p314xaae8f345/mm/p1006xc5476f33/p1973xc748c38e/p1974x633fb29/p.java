package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* loaded from: classes15.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.x0 f236499a = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.l());

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f236500b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f236501c = new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.b();

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseIntArray f236502d = new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.c();

    /* renamed from: e, reason: collision with root package name */
    public static final android.util.SparseIntArray f236503e = new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.d();

    public static int a(int i17) {
        if (i17 == 30 || i17 == 37 || i17 == 38 || i17 == 40) {
            return 13;
        }
        if (i17 == 4 || i17 == 47) {
            return 12;
        }
        if (i17 == 34) {
            return 24;
        }
        return i17 == 39 ? 5 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:245:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a1f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n r33, w60.k r34, android.content.DialogInterface.OnClickListener r35, java.lang.String r36, int r37, int r38, int r39, java.lang.Runnable r40, android.os.Bundle r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 3208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.p.b(com.tencent.mm.plugin.qrcode.model.n, w60.k, android.content.DialogInterface$OnClickListener, java.lang.String, int, int, int, java.lang.Runnable, android.os.Bundle, boolean):boolean");
    }

    public static void c(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.Runnable runnable) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_short_url", str);
        intent.putExtra("tab_type", 9);
        int i18 = 1;
        if (i17 != 0) {
            if (i17 == 1) {
                i18 = 2;
            } else {
                e04.p.y(i17);
                i18 = 0;
            }
        }
        intent.putExtra("KEY_SCAN_TYPE", i18);
        intent.putExtra("KEY_SCAN_EXPORT_URL", str2);
        intent.getIntExtra("report_scene", 2000);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(40, 2, 40, intent);
        intent.putExtra("key_need_related_list", false);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.A(context, intent, false);
        if (runnable != null) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(runnable, 200L);
        }
    }

    public static boolean d(android.content.Context context, java.lang.String str, int i17, int i18, android.os.Bundle bundle, android.os.Bundle bundle2, int i19, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "processAppBrandFullURL, fullURL: " + str);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse.getQueryParameter("search_query") == null || parse.getQueryParameter("search_query").length() <= 0) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("wxa_open_scene"), -1);
            if (P > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "processAppBrandFullURL, override scene:%d from wxa_open_scene", java.lang.Integer.valueOf(P));
            } else {
                P = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("qr_type4wxa"), 0) == 2 ? f236503e : i18 != 22 ? f236501c : f236502d).get(i17);
            }
            if (bundle != null) {
                if (i19 == 37) {
                    bundle.putInt("stat_geta8key_msg_scene", 37);
                } else if (i19 == 38) {
                    bundle.putInt("stat_geta8key_msg_scene", 38);
                } else {
                    bundle.putInt("stat_geta8key_msg_scene", 0);
                }
            }
            int i27 = z17 ? 1374 : P;
            bm5.x0 x0Var = f236499a;
            if (((java.lang.Boolean) x0Var.b()).booleanValue()) {
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = f236500b;
                if (abstractC20980x9b9ad01d != null) {
                    abstractC20980x9b9ad01d.mo48814x2efc64();
                    f236500b = null;
                }
                ((tg1.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6.class))).Ai(context, str, i27, bundle, bundle2, new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.m(oVar));
            } else {
                ((tg1.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6.class))).Ai(context, str, i27, bundle, bundle2, null);
            }
            if (!((java.lang.Boolean) x0Var.b()).booleanValue()) {
                ((e04.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.h) oVar).f236494a).D(false);
            }
            return true;
        }
        java.lang.String queryParameter = parse.getQueryParameter("search_query");
        java.lang.String queryParameter2 = parse.getQueryParameter("appid");
        java.lang.String queryParameter3 = parse.getQueryParameter("search_extInfo");
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("debug"), 0);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("version"), 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5808xcfc568fb c5808xcfc568fb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5808xcfc568fb();
        am.cn cnVar = c5808xcfc568fb.f136116g;
        cnVar.f87895a = 1;
        cnVar.f87896b = queryParameter2;
        cnVar.f87897c = P2;
        cnVar.f87898d = P3;
        cnVar.f87899e = queryParameter3;
        c5808xcfc568fb.e();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsbizscene", 99999);
        a17.putExtra("ftsQuery", queryParameter);
        a17.putExtra("ftsqrcodestring", str);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(300, false, 262144);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put("query", queryParameter);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put("sessionid", f17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_session_id", f17);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.fts.MMFTSWebViewUI", a17, null);
        ((e04.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.h) oVar).f236494a).D(false);
        return true;
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar, java.lang.String str, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
        c11207x71c7a1c1.f153806e = java.lang.System.currentTimeMillis();
        c11207x71c7a1c1.f153807f = 1;
        e04.p pVar = (e04.p) nVar;
        c11207x71c7a1c1.f153805d = pVar.j();
        r45.s4 s4Var = new r45.s4();
        c11207x71c7a1c1.f153810i = s4Var;
        s4Var.f467019d = str;
        s4Var.f467020e = str;
        c11207x71c7a1c1.f153818t = true;
        c11207x71c7a1c1.f153814p = true;
        c11207x71c7a1c1.f153815q = c11207x71c7a1c1.f153805d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hez);
        c11207x71c7a1c1.f153809h = j41.f0.a(c11207x71c7a1c1.f153807f);
        c11207x71c7a1c1.f153816r = true;
        android.content.Intent intent = new android.content.Intent();
        c11207x71c7a1c1.f153821w = intent;
        intent.putExtra("key_result_receiver", new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.ResultReceiverC16943x29779eb1(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper()), pVar, runnable));
        ((l41.g2) ((j41.z) i95.n0.c(j41.z.class))).Bi(c11207x71c7a1c1);
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n nVar, int i17, int i18, java.lang.String str, int i19) {
        android.content.Context j17 = nVar != null ? ((e04.p) nVar).j() : null;
        if (j17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec();
        am.df dfVar = c5587xf7a06bec.f135909g;
        dfVar.f87979a = i18;
        dfVar.f87980b = str;
        dfVar.f87981c = new java.lang.ref.WeakReference(j17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("pay_channel", i19);
        if (i18 == 55) {
            bundle.putInt("entrance", i17);
        }
        dfVar.f87982d = bundle;
        c5587xf7a06bec.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.a(c5587xf7a06bec, nVar);
        c5587xf7a06bec.b(android.os.Looper.myLooper());
    }

    public static void g(android.content.Intent intent, w60.k kVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = (com.p314xaae8f345.mm.p957x53236a1b.k0) kVar;
        r45.y73 y73Var = ((r45.s83) k0Var.f152889e.f152244b.f152233a).f467084m;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = k0Var.f152889e;
        if (y73Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3();
            r45.cu5 cu5Var = ((r45.s83) oVar.f152244b.f152233a).f467093v;
            byte[] bArr = null;
            if (cu5Var != null) {
                try {
                    bArr = x51.j1.d(cu5Var);
                } catch (java.lang.Exception unused) {
                }
            }
            c19775x58fd37b3.f273713d = bArr;
            intent.putExtra("scan_jspermission", c19775x58fd37b3);
        }
        intent.putExtra("scan_general_ctrl", new com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e(((r45.s83) oVar.f152244b.f152233a).f467084m));
        if (bundle != null) {
            intent.putExtra("geta8key_init_request_id", bundle.getInt("geta8key_init_request_id", 0));
            intent.putExtra("serverMsgID", java.lang.String.valueOf(bundle.getLong("serverMsgID", 0L)));
            intent.putExtra("geta8key_username", bundle.getString("geta8key_username", ""));
            intent.putExtra("msgUsername", bundle.getString("msgUsername", ""));
            intent.putExtra("KMsgType", bundle.getInt("KMsgType", 0));
            intent.putExtra("KAppMsgType", bundle.getInt("KAppMsgType", 0));
        }
    }
}
