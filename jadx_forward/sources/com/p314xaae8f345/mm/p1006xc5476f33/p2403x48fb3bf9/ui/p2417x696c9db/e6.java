package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class e6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f265665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd f265666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f265667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f265668g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f265669h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f265670i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f265671m;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd jdVar, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, boolean z17, long j17, int i17) {
        this.f265671m = c6Var;
        this.f265665d = arrayList;
        this.f265666e = jdVar;
        this.f265667f = c19775x58fd37b3;
        this.f265668g = z17;
        this.f265669h = j17;
        this.f265670i = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v97 */
    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean f07;
        ?? r27;
        db5.h4 h4Var;
        boolean z27;
        if (this.f265671m.d()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(480L, 0L, 1L, false);
        g4Var.clear();
        if (this.f265671m.N.booleanValue()) {
            return;
        }
        boolean z28 = false;
        if (!this.f265665d.isEmpty()) {
            for (int i17 = 0; i17 < this.f265665d.size(); i17++) {
                try {
                    java.lang.String str = (java.lang.String) this.f265665d.get(i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "menuItem:" + str);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.lang.String obj = jSONObject.opt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28).toString();
                    byte[] decode = android.util.Base64.decode(jSONObject.opt("iconData").toString(), 0);
                    int length = decode.length;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(length));
                    arrayList.add(0);
                    arrayList.add(decode);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$11", "onCreateMMMenu", "(Lcom/tencent/mm/ui/base/MMMenu;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                    yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$11", "onCreateMMMenu", "(Lcom/tencent/mm/ui/base/MMMenu;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    g4Var.m(1000, obj, new android.graphics.drawable.BitmapDrawable(decodeByteArray));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewMenuHelper", e17, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f265671m;
        c6Var.getClass();
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() && c6Var.c().F2 != null && c6Var.c().F2.f522850x.m8() && c6Var.m(58) && c6Var.n(58)) {
            g4Var.k(58, c6Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrh), com.p314xaae8f345.mm.R.raw.f79389xd714ba6, c6Var.c().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw), c6Var.f265593q.a(c6Var.K, c6Var.f265589m ? pv.b0.f440013e : pv.b0.f440014f), false);
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() && this.f265671m.c().F2 != null && this.f265671m.c().F2.f522850x.m8() && this.f265671m.m(35) && this.f265671m.n(35)) {
            g4Var.g(35, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrh), com.p314xaae8f345.mm.R.raw.f80201x151107e6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var2 = this.f265671m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd jdVar = this.f265666e;
        c6Var2.getClass();
        if (jdVar != null && jdVar.f266414k) {
            g4Var.b(51, com.p314xaae8f345.mm.R.C30867xcad56011.lg_, com.p314xaae8f345.mm.R.raw.f80146x522d6d1f);
            boolean Ai = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ai();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "isEnableStarMode = " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai());
            if (Ai) {
                g4Var.b(50, com.p314xaae8f345.mm.R.C30867xcad56011.jyv, com.p314xaae8f345.mm.R.raw.f80148xd486b049);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "tyt_listen_later");
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                hashMap.put("currscene", 1104);
                hashMap.put("which_button", 21);
                hashMap.put("actionbizinfo", rk4.j5.f(c6Var2.c().x7()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap, 5, false);
                z27 = true;
            } else {
                z27 = false;
            }
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j6(c6Var2, true, z27));
        }
        int i18 = this.f265671m.c().U2;
        if (i18 == 1) {
            g4Var.g(40, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7j), com.p314xaae8f345.mm.R.raw.f79579x84b62123);
        } else if (i18 == 2) {
            g4Var.g(41, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7h), com.p314xaae8f345.mm.R.raw.f79577x11dad51d);
        } else if (i18 == 3) {
            g4Var.g(42, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7i), com.p314xaae8f345.mm.R.raw.f79579x84b62123);
        }
        java.util.List z76 = this.f265671m.c().z7();
        if (z76 != null && !z76.isEmpty() && !this.f265671m.D()) {
            int i19 = 0;
            while (i19 < z76.size() && i19 < 8) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.DynamicMenuItem dynamicMenuItem = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.DynamicMenuItem) z76.get(i19);
                java.lang.String mo113556x5db1b11 = dynamicMenuItem.mo113556x5db1b11();
                boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str2 = mo113556x5db1b11 == null ? "" : mo113556x5db1b11;
                switch (str2.hashCode()) {
                    case -1950288693:
                        if (str2.equals("pdd_categories")) {
                            r27 = z28;
                            break;
                        }
                        break;
                    case -1077769574:
                        if (str2.equals("member")) {
                            r27 = 1;
                            break;
                        }
                        break;
                    case -1007892285:
                        if (str2.equals("pdd_index")) {
                            r27 = 2;
                            break;
                        }
                        break;
                    case -863994664:
                        if (str2.equals("pdd_bybt")) {
                            r27 = 3;
                            break;
                        }
                        break;
                    case -309425751:
                        if (str2.equals(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589)) {
                            r27 = 4;
                            break;
                        }
                        break;
                    case -174591654:
                        if (str2.equals("pdd_profile")) {
                            r27 = 5;
                            break;
                        }
                        break;
                    case 3046176:
                        if (str2.equals("cart")) {
                            r27 = 6;
                            break;
                        }
                        break;
                    case 100346066:
                        if (str2.equals(ya.b.f77479x42930b2)) {
                            r27 = 7;
                            break;
                        }
                        break;
                    case 935680011:
                        if (str2.equals("pdd_favorite")) {
                            r27 = 8;
                            break;
                        }
                        break;
                    case 1296516636:
                        if (str2.equals("categories")) {
                            r27 = 9;
                            break;
                        }
                        break;
                }
                r27 = -1;
                switch (r27) {
                    case 0:
                        h4Var = (db5.h4) g4Var.g(53, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyk), com.p314xaae8f345.mm.R.raw.f80377x7c0df128);
                        break;
                    case 1:
                        h4Var = (db5.h4) g4Var.g(19, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6a), com.p314xaae8f345.mm.R.raw.f78689x421e5684);
                        break;
                    case 2:
                        h4Var = (db5.h4) g4Var.g(52, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyl), com.p314xaae8f345.mm.R.raw.f80379x3520c646);
                        break;
                    case 3:
                        h4Var = (db5.h4) g4Var.g(56, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyi), com.p314xaae8f345.mm.R.raw.f80376xc7e542f5);
                        break;
                    case 4:
                        h4Var = (db5.h4) g4Var.g(18, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6b), com.p314xaae8f345.mm.R.raw.f78694x862c682e);
                        break;
                    case 5:
                        h4Var = (db5.h4) g4Var.g(55, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lym), com.p314xaae8f345.mm.R.raw.f80380xe9c29a1d);
                        break;
                    case 6:
                        h4Var = (db5.h4) g4Var.g(17, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l68), com.p314xaae8f345.mm.R.raw.f78686x3000398a);
                        break;
                    case 7:
                        h4Var = (db5.h4) g4Var.g(15, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6_), com.p314xaae8f345.mm.R.raw.f78688xd06137a8);
                        break;
                    case 8:
                        h4Var = (db5.h4) g4Var.g(54, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyj), com.p314xaae8f345.mm.R.raw.f80378xc8efc7a8);
                        break;
                    case 9:
                        h4Var = (db5.h4) g4Var.g(16, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l69), com.p314xaae8f345.mm.R.raw.f78687x5e7fe6fd);
                        break;
                    default:
                        h4Var = null;
                        break;
                }
                if (h4Var != null) {
                    h4Var.A = dynamicMenuItem.mo113560xb5887639();
                }
                i19++;
                z28 = false;
            }
        }
        java.lang.String stringExtra = this.f265671m.b().getStringExtra("srcUsername");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                z17 = this.f265671m.c().L1.A.j8(stringExtra);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "sharebtn click fail isBizContact, ex = " + e18.getMessage());
                z17 = false;
            }
            if (z17) {
                try {
                    z18 = this.f265671m.c().L1.A.Mb(stringExtra);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "sharebtn click fail, ex = " + e19.getMessage());
                    z18 = false;
                }
                if (z18) {
                    z19 = this.f265671m.z(this.f265667f, 19);
                    f07 = this.f265671m.f0(this.f265667f, 19);
                } else {
                    z19 = this.f265671m.z(this.f265667f, 20);
                    f07 = this.f265671m.f0(this.f265667f, 20);
                }
                boolean t17 = this.f265671m.c().L1.t1();
                if (this.f265671m.m(5) && z19 && this.f265671m.n(5)) {
                    if (t17) {
                        g4Var.l(5, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.laj), com.p314xaae8f345.mm.R.raw.f80261x69edcbfe, f07);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd jdVar2 = this.f265666e;
                        if (jdVar2 == null || !jdVar2.f266409f) {
                            g4Var.l(5, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lai), com.p314xaae8f345.mm.R.raw.f80261x69edcbfe, f07);
                        }
                    }
                }
            } else {
                try {
                    this.f265671m.c().L1.A.Dd(stringExtra);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "sharebtn click fail triggerGetContact, ex = " + e27.getMessage());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var3 = this.f265671m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = this.f265667f;
        c6Var3.getClass();
        boolean z37 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20828xcfbf3b80()) == 1;
        boolean z38 = gm0.m.i() != 0;
        boolean f08 = c6Var3.f0(c19775x58fd37b3, 21);
        boolean f09 = c6Var3.f0(c19775x58fd37b3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de);
        if (!z38 || f09 || f08 || !c6Var3.n(57) || !c6Var3.z(c19775x58fd37b3, 456) || !z37 || c6Var3.c() == null || java.lang.Boolean.TRUE.equals(c6Var3.c().Q1.get(c6Var3.c().x7())) || c6Var3.c().f265348f == null || !c6Var3.c().f265348f.z0()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MENU_SAVE_SCREENSHOT: ");
            sb6.append(z38 ? "hadLogin" : "noLogin");
            sb6.append(", isForbidShare = ");
            sb6.append(f08);
            sb6.append(", isForbidFav = ");
            sb6.append(f09);
            sb6.append(", canShowLongScreenshot = ");
            sb6.append(z37);
            sb6.append(", canShowMenuItem = ");
            sb6.append(c6Var3.n(57));
            sb6.append("isXwebKernel = ");
            sb6.append((c6Var3.c() == null || c6Var3.c().f265348f == null || !c6Var3.c().f265348f.z0()) ? false : true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", sb6.toString());
        } else {
            g4Var.g(57, c6Var3.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3n), com.p314xaae8f345.mm.R.raw.f80089x8164b1e0);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b c7138x4892e88b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b();
            c7138x4892e88b.f144480e = 1L;
            c7138x4892e88b.f144482g = 2L;
            c7138x4892e88b.p(c6Var3.c().x7());
            c7138x4892e88b.k();
        }
        if (this.f265671m.n(10)) {
            g4Var.g(10, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ak6), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var4 = this.f265671m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b32 = this.f265667f;
        if (c6Var4.m(6) && c6Var4.z(c19775x58fd37b32, 44) && c6Var4.n(6)) {
            g4Var.l(6, c6Var4.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.la_), com.p314xaae8f345.mm.R.raw.f80145xebd70552, c6Var4.f0(c19775x58fd37b32, 44));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var5 = this.f265671m;
        boolean z39 = this.f265668g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b33 = this.f265667f;
        if (!z39) {
            c6Var5.getClass();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6Var5.f265602z) && c6Var5.z(c19775x58fd37b33, nd1.i2.f72939x366c91de) && c6Var5.n(59)) {
            g4Var.l(59, c6Var5.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oov), com.p314xaae8f345.mm.R.raw.f78861x4919b46b, c6Var5.f0(c19775x58fd37b33, nd1.i2.f72939x366c91de));
            zq1.i0 i0Var = new zq1.i0();
            i0Var.f556516a = c6Var5.f265602z;
            i0Var.f556518c = 176;
            arrayList2.add(i0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var6 = this.f265671m;
        boolean z47 = this.f265668g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b34 = this.f265667f;
        if (!z47) {
            c6Var6.getClass();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6Var6.A) && c6Var6.z(c19775x58fd37b34, be1.x0.f4238x366c91de) && c6Var6.n(60)) {
            g4Var.l(60, c6Var6.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oow), com.p314xaae8f345.mm.R.raw.f80340x9e0ede65, c6Var6.f0(c19775x58fd37b34, be1.x0.f4238x366c91de));
            zq1.i0 i0Var2 = new zq1.i0();
            i0Var2.f556516a = c6Var6.A;
            i0Var2.f556518c = 176;
            arrayList2.add(i0Var2);
        }
        if (!arrayList2.isEmpty()) {
            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList2);
        }
        if (this.f265671m.m(28) && this.f265671m.n(28)) {
            g4Var.g(28, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5c), com.p314xaae8f345.mm.R.raw.f80286x295a1e83);
        }
        if ((this.f265669h & 1) == 0 && this.f265671m.m(31) && this.f265671m.n(31)) {
            g4Var.g(31, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575226lb3), com.p314xaae8f345.mm.R.raw.f81004x7cd061d2);
        }
        if (this.f265667f.f273713d != null && this.f265671m.c().T && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265671m.c().L1.f263497y) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265671m.c().f265366l3) && this.f265671m.c().L1.f263497y.startsWith(this.f265671m.c().f265366l3) && this.f265671m.b().getBooleanExtra("key_detail_can_delete", true) && com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6.f(this.f265671m) && !this.f265671m.D()) {
            if (this.f265671m.m(12) && this.f265671m.n(12)) {
                g4Var.g(12, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_a), com.p314xaae8f345.mm.R.raw.f78672x65d03434);
            }
            if (this.f265671m.m(9)) {
                g4Var.g(9, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), com.p314xaae8f345.mm.R.raw.f78678x36756d10);
            }
        }
        if (this.f265671m.m(37) && this.f265671m.n(37)) {
            if (((cw4.p0) this.f265671m.c().f265399w2.f267189g.f263278h.mo3195x754a37bb()) == cw4.p0.f305798f) {
                g4Var.g(37, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6w), com.p314xaae8f345.mm.R.raw.f80319x9810f934);
                this.f265671m.c().f265399w2.f267189g.f(cw4.n0.f305787d, cw4.o0.f305792f);
            } else {
                g4Var.g(37, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6u), com.p314xaae8f345.mm.R.raw.f80336x9bb432f6);
                this.f265671m.c().f265399w2.f267189g.f(cw4.n0.f305787d, cw4.o0.f305791e);
            }
        }
        if ((this.f265669h & 2) == 0 && this.f265671m.m(11) && this.f265671m.z(this.f265667f, 18) && this.f265671m.n(11)) {
            if (hy4.b0.c(this.f265671m.c().x7())) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_mp_page_use_global_font_android, false) && hy4.i.l(this.f265671m.c().x7())) {
                    if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ban_biz_mp_page_show_new_font_android, false)) {
                        boolean booleanExtra = this.f265671m.c().getIntent().getBooleanExtra("show_mp_page_new_font", false);
                        boolean z48 = this.f265671m.c().v7() == 0;
                        if (booleanExtra && z48) {
                            g4Var.l(11, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575375pb2), com.p314xaae8f345.mm.R.raw.f80129xebd461a7, this.f265671m.f0(this.f265667f, 18));
                        }
                    }
                }
            } else {
                g4Var.l(11, this.f265671m.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr9), com.p314xaae8f345.mm.R.raw.f80129xebd461a7, this.f265671m.f0(this.f265667f, 18));
            }
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_debug, 0) == 1) {
            g4Var.l(99, this.f265671m.c().getString(nw4.w2.a() ? com.p314xaae8f345.mm.R.C30867xcad56011.l6o : com.p314xaae8f345.mm.R.C30867xcad56011.l6p), com.p314xaae8f345.mm.R.raw.f81400xc0c570b1, false);
        }
        this.f265671m.u(this.f265670i, g4Var);
        this.f265671m.f265577J.j();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var7 = this.f265671m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6.h(c6Var7, g4Var, c6Var7.f265599w, 2);
        this.f265671m.f265601y.clear();
        this.f265671m.f265601y = (java.util.List) g4Var.f309877d.stream().map(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19358x59a464f()).collect(java.util.stream.Collectors.toList());
    }
}
