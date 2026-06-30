package r53;

/* loaded from: classes8.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f474186a = true;

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f474187b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f474188c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f474189d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.util.HashMap f474190e = null;

    /* renamed from: f, reason: collision with root package name */
    public static long f474191f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static android.util.DisplayMetrics f474192g;

    static {
        new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_MONTH);
    }

    public static cl0.g A(android.net.Uri uri, cl0.g gVar) {
        java.lang.String query = uri.getQuery();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (query == null) {
            query = "";
        }
        java.lang.String[] split = query.split("&");
        if (split == null || split.length == 0) {
            return null;
        }
        cl0.g gVar2 = gVar;
        for (java.lang.String str : split) {
            java.lang.String[] split2 = str.split("=");
            if (split2 != null && split2.length == 2) {
                if (gVar2 == null) {
                    try {
                        gVar2 = new cl0.g();
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameCenterUtil", e17, "JSONException", new java.lang.Object[0]);
                    }
                }
                gVar.h(split2[0], split2[1]);
            }
        }
        return gVar;
    }

    public static synchronized void B(java.lang.String str, float f17) {
        synchronized (r53.f.class) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e c5578x677d556e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e();
            am.ue ueVar = c5578x677d556e.f135900g;
            ueVar.f89611a = 1;
            ueVar.f89612b = str;
            c5578x677d556e.e();
            if (c5578x677d556e.f135901h.f89727b) {
                java.lang.String str2 = c5578x677d556e.f135901h.f89726a + kk.k.g(str.getBytes());
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423615f = str2;
                n11.a.b().k(str, null, fVar.a(), new r53.h(c5578x677d556e), new r53.i(f17, c5578x677d556e));
            }
        }
    }

    public static void C(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "setNotDisturbMsg, msgRelatedId:%s, flag:%b", str, java.lang.Boolean.valueOf(z17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotDisturb_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        java.lang.String sb7 = sb6.toString();
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().L0(sb7, "1".getBytes());
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().z0(sb7);
        }
    }

    public static void D(android.content.Context context, android.content.Intent intent) {
        l33.c.c();
        if (intent.getIntExtra("game_report_from_scene", 0) == 901) {
            r53.d dVar = r53.b.f474173a;
            r53.c cVar = dVar.f474182c;
            cVar.f474175a = 0L;
            cVar.f474176b = 0L;
            cVar.f474177c = 0L;
            cVar.f474178d = 0L;
            cVar.f474175a = java.lang.System.currentTimeMillis();
            dVar.f474182c.f474178d = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.d((android.app.Activity) context, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r0.getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy)) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(android.content.Intent r4, android.content.Context r5) {
        /*
            java.lang.String r0 = "rawUrl"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.Class<kj0.l> r1 = kj0.l.class
            i95.m r1 = i95.n0.c(r1)
            kj0.l r1 = (kj0.l) r1
            e42.d0 r2 = e42.d0.game_luggage
            kj0.i r1 = (kj0.i) r1
            r3 = 1
            boolean r1 = r1.Bi(r2, r3)
            r2 = 0
            if (r1 != 0) goto L1c
        L1a:
            r3 = r2
            goto L3e
        L1c:
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 == 0) goto L23
            goto L1a
        L23:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getHost()
            if (r1 == 0) goto L1a
            java.lang.String r0 = r0.getHost()
            r1 = 2131769592(0x7f1038f8, float:1.9170463E38)
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
        L3e:
            if (r3 == 0) goto L44
            F(r4, r5)
            goto L54
        L44:
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent r0 = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent
            r0.<init>()
            am.nl r1 = r0.f136075g
            r1.f88966a = r2
            r1.f88967b = r5
            r1.f88968c = r4
            r0.e()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.E(android.content.Intent, android.content.Context):void");
    }

    public static void F(android.content.Intent intent, android.content.Context context) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991();
        am.nl nlVar = c5756xf590b991.f136075g;
        nlVar.f88966a = 2;
        nlVar.f88967b = context;
        nlVar.f88968c = intent;
        c5756xf590b991.e();
    }

    public static java.util.LinkedList G(java.lang.String str) {
        java.lang.String[] split = str.substring(1, str.length() - 1).split(",");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : split) {
            linkedList.add(str2.trim());
        }
        return linkedList;
    }

    public static void H(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return;
            }
            android.net.Uri parse = android.net.Uri.parse(str3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = parse.getQueryParameter("wechat_pkgid");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                java.lang.String queryParameter = parse.getQueryParameter("liteapp");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                    return;
                }
                java.lang.String[] split = queryParameter.split("\\?");
                if (split.length == 0) {
                    return;
                }
                str2 = split[0].replace("liteapp://", "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    return;
                }
            }
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str2);
        d(str, str2, Bj == null ? null : Bj.f14368xd0d13783);
    }

    public static boolean I(android.view.View view, android.content.Context context) {
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.String)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
            return false;
        }
        java.lang.String str = (java.lang.String) view.getTag();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        E(intent, context);
        return true;
    }

    public static java.lang.String a(java.lang.String str, java.util.Map map) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || map == null || map.isEmpty()) {
            return str;
        }
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        for (java.lang.String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (java.lang.String) map.get(str2));
        }
        return buildUpon.build().toString();
    }

    public static java.util.LinkedList b(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.String trim = jSONArray.optString(i17).trim();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                linkedList.add(trim);
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "MicroMsg.GameCenterUtil"
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r1 = "weapp"
            java.lang.String r13 = r13.getQueryParameter(r1)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r13)
            r2 = 0
            if (r1 != 0) goto Lac
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch: java.lang.Exception -> L96
            java.lang.String r6 = r13.getAuthority()     // Catch: java.lang.Exception -> L96
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L29
            java.lang.String r12 = "targetAppId is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r12)     // Catch: java.lang.Exception -> L96
            return r2
        L29:
            java.lang.String r1 = "env_version"
            java.lang.String r1 = r13.getQueryParameter(r1)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "path"
            java.lang.String r9 = r13.getQueryParameter(r3)     // Catch: java.lang.Exception -> L96
            if (r1 != 0) goto L39
            java.lang.String r1 = ""
        L39:
            int r13 = r1.hashCode()     // Catch: java.lang.Exception -> L96
            r3 = 110628630(0x6980f16, float:5.719821E-35)
            r11 = 1
            if (r13 == r3) goto L53
            r3 = 1559690845(0x5cf6fe5d, float:5.5618016E17)
            if (r13 == r3) goto L49
            goto L5e
        L49:
            java.lang.String r13 = "develop"
            boolean r13 = r1.equals(r13)     // Catch: java.lang.Exception -> L96
            if (r13 == 0) goto L5e
            r13 = r2
            goto L5f
        L53:
            java.lang.String r13 = "trial"
            boolean r13 = r1.equals(r13)     // Catch: java.lang.Exception -> L96
            if (r13 == 0) goto L5e
            r13 = r11
            goto L5f
        L5e:
            r13 = -1
        L5f:
            r1 = 2
            if (r13 == 0) goto L68
            if (r13 == r11) goto L66
            r7 = r2
            goto L69
        L66:
            r7 = r1
            goto L69
        L68:
            r7 = r11
        L69:
            java.lang.String r13 = "jumpWeApp, appId: %s, versionType: %d, path: %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L96
            r3[r2] = r6     // Catch: java.lang.Exception -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L96
            r3[r11] = r4     // Catch: java.lang.Exception -> L96
            r3[r1] = r9     // Catch: java.lang.Exception -> L96
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r13, r3)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject     // Catch: java.lang.Exception -> L96
            r10.<init>()     // Catch: java.lang.Exception -> L96
            r13 = 1079(0x437, float:1.512E-42)
            r10.f169323f = r13     // Catch: java.lang.Exception -> L96
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.h6> r13 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class
            i95.m r13 = i95.n0.c(r13)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.plugin.appbrand.service.h6 r13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) r13     // Catch: java.lang.Exception -> L96
            r5 = 0
            r8 = 0
            r3 = r13
            com.tencent.mm.plugin.appbrand.launching.xc r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) r3     // Catch: java.lang.Exception -> L96
            r4 = r12
            r3.aj(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L96
            return r11
        L96:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "checkJumpWeApp: "
            r13.<init>(r1)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r12)
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.c(android.content.Context, java.lang.String):boolean");
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "checkPatchExist fail,pkgId or appId is empty");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new r53.j(str, str2, str3));
    }

    public static android.app.Dialog e(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bhf, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575755hh);
        k2Var.setContentView(inflate);
        k2Var.setCancelable(true);
        k2Var.setCanceledOnTouchOutside(false);
        k2Var.setOnCancelListener(new r53.g(k2Var));
        return k2Var;
    }

    public static java.lang.String f(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        if (!it.hasNext()) {
            return "()";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        while (true) {
            sb6.append("\"" + ((java.lang.String) it.next()).trim() + "\"");
            if (!it.hasNext()) {
                sb6.append(')');
                return sb6.toString();
            }
            sb6.append(',');
        }
    }

    public static java.lang.String g() {
        m53.e1 e1Var;
        m53.e1 e1Var2;
        java.lang.String Ai = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_home_url_android, "");
        if (Ai != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai.trim())) {
            if (Ai.equals("native")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, 11L, 1L, false);
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, 10L, 1L, false);
            return Ai;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d1 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a;
        if (c15936xa915f9d1 != null && (e1Var2 = c15936xa915f9d1.f36952x8379d650) != null && e1Var2.f405177f == 1) {
            return e1Var2.f405178g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1755xc50a8b8b.C15936xa915f9d1 c15936xa915f9d12 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a;
        if (c15936xa915f9d12 == null || (e1Var = c15936xa915f9d12.f36952x8379d650) == null || e1Var.f405177f != 1) {
            return null;
        }
        return e1Var.f405178g;
    }

    public static int h(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        if (f474192g == null) {
            f474192g = new android.util.DisplayMetrics();
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(f474192g);
        }
        return f474192g.widthPixels;
    }

    public static int i(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameCenterUtil", "Null or Nil path");
            return 0;
        }
        android.content.pm.PackageInfo packageArchiveInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return 0;
        }
        return packageArchiveInfo.versionCode;
    }

    public static int j(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
            return 0;
        }
        try {
            packageInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameCenterUtil", "Exception: %s", e17.toString());
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    public static java.lang.String k(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
            return "";
        }
        try {
            packageInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo(str, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameCenterUtil", "Exception: %s", e17.toString());
            packageInfo = null;
        }
        return packageInfo == null ? "" : packageInfo.versionName;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 l() {
        if (f474187b == null) {
            synchronized (f474188c) {
                if (f474187b == null) {
                    f474187b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("SubCoreGameCenter#WorkThread");
                    lm5.i.c("SubCoreGameCenter#WorkThread", new t65.g("SubCoreGameCenter#WorkThread"));
                }
            }
        }
        return f474187b;
    }

    public static boolean m(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str) != null;
    }

    public static boolean n(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotDisturb_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0(sb6.toString()) != null;
    }

    public static int o(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return v(context, str2, "game_center_detail", null);
        }
        m53.v0 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f();
        int i18 = f17 != null ? f17.f405649d : 0;
        if (i18 == 2) {
            return p(context, str, i17);
        }
        if (i18 == 1) {
            q(context, bundle);
            return 6;
        }
        java.lang.String d07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d07) || d07.toLowerCase().equals("cn")) {
            return p(context, str, i17);
        }
        q(context, bundle);
        return 6;
    }

    public static int p(android.content.Context context, java.lang.String str, int i17) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        m53.v0 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f();
        java.lang.String str3 = f17 != null ? f17.f405650e : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/cgi-bin/h5/static/gamecenter/detail.html?appid=" + str;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appid", str);
            if (i17 > 0) {
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, java.lang.String.valueOf(i17));
            }
            str2 = a(str3, hashMap);
        }
        return v(context, str2, "game_center_detail", null);
    }

    public static void q(android.content.Context context, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.GameDetailUI2");
        intent.putExtras(bundle);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/utils/GameCenterUtil", "jumpGameDetailNative", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/utils/GameCenterUtil", "jumpGameDetailNative", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void r(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", e1Var.f221824p2.f221856a);
        intent.putExtra("finishviewifloadfailed", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = e1Var.f221824p2;
        intent.putExtra("show_full_screen", h0Var.f221857b);
        intent.putExtra("disable_progress_bar", h0Var.f221857b);
        int i17 = h0Var.f221858c;
        intent.putExtra("screen_orientation", i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? -1 : 1002 : 1001 : 1 : 0);
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("open_game_float", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991();
        am.nl nlVar = c5756xf590b991.f136075g;
        nlVar.f88966a = 1;
        nlVar.f88967b = context;
        nlVar.f88968c = intent;
        c5756xf590b991.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(final android.content.Context r17, final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r18, java.lang.String r19, java.lang.String r20, final q80.f0 r21) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.s(android.content.Context, com.tencent.mm.plugin.game.model.r0, java.lang.String, java.lang.String, q80.f0):void");
    }

    public static void t(android.content.Context context, java.lang.String str, cl0.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r0Var, q80.f0 f0Var) {
        boolean z17;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = "";
        try {
            bundle.putString("appId", str);
            if (gVar.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f)) {
                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, gVar.mo15074x2fec8307(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f));
            }
            if (gVar.has("query")) {
                bundle.putString("query", gVar.a("query").toString());
            }
            if (str.contains("?")) {
                bundle.putString("pkgId", str.split("\\?")[1]);
            }
            if (gVar.has("isTransparent")) {
                bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, gVar.mo15070x41a8a7f2("isTransparent"));
            }
            if (gVar.has("pageOrientation")) {
                bundle.putString("pageOrientation", "portrait");
            }
            if (gVar.has("isHalfScreen")) {
                z17 = gVar.mo15070x41a8a7f2("isHalfScreen");
                if (z17) {
                    bundle.putBoolean("isHalfScreen", true);
                }
            } else {
                z17 = false;
            }
            if (gVar.has("heightPercent")) {
                bundle.putDouble("heightPercent", gVar.mo15071x160e9ec7("heightPercent"));
            }
            if (gVar.has("enableDragToCloseInHalfScreen")) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gVar.mo15070x41a8a7f2("enableDragToCloseInHalfScreen"));
                if (z17) {
                    bundle.putBoolean("enableDragToCloseInHalfScreen", valueOf.booleanValue());
                }
            }
            if (gVar.has("isForbidRightGesture")) {
                bundle.putBoolean("forbidRightGesture", gVar.mo15070x41a8a7f2("isForbidRightGesture"));
            }
            cl0.g b17 = gVar.b("keepAlive");
            if (b17 != null) {
                bundle.putInt("keepAliveSeconds", b17.mo15080xc3ca103c("seconds", 0));
            }
            if (gVar.has("ignoreAlive")) {
                bundle.putInt("ignoreAlive", b17.mo15080xc3ca103c("seconds", 0));
            }
            if (gVar.has("preInjectData")) {
                java.lang.String mo15074x2fec8307 = gVar.mo15074x2fec8307("preInjectData");
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15074x2fec8307)) {
                        bundle.putString("preInjectData", mo15074x2fec8307);
                    }
                    str2 = mo15074x2fec8307;
                } catch (org.json.JSONException e17) {
                    e = e17;
                    str2 = mo15074x2fec8307;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameCenterUtil", e, "JSONException", new java.lang.Object[0]);
                    y(context, r0Var, 0, str2, bundle, f0Var);
                }
            }
            if (gVar.has("withDownloadLoading")) {
                bundle.putBoolean("withDownloadLoading", gVar.mo15070x41a8a7f2("withDownloadLoading"));
            }
            if (gVar.has("entranceStoreData")) {
                bundle.putString("entranceStoreData", gVar.mo15074x2fec8307("entranceStoreData"));
            }
            if (gVar.has("fromFindGameEntrance")) {
                bundle.putBoolean("fromFindGameEntrance", gVar.mo15070x41a8a7f2("fromFindGameEntrance"));
            }
            if (gVar.has("pkgId")) {
                bundle.putString("pkgId", gVar.mo15074x2fec8307("pkgId"));
            }
        } catch (org.json.JSONException e18) {
            e = e18;
        }
        y(context, r0Var, 0, str2, bundle, f0Var);
    }

    public static int u(android.content.Context context, java.lang.String str) {
        return v(context, str, null, null);
    }

    public static int v(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        if (c(context, str)) {
            return 30;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("game_pre_inject_data", str3);
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str2);
        E(intent, context);
        return 7;
    }

    public static void w(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        b1Var.f398555f = str2;
        b1Var.f398549c = i17;
        b1Var.f398565k = 1079;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }

    public static int x(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f = c15780xf49d6a1c.f36741x68a8edf8;
        if (c15777x5c9b169f != null) {
            int i18 = c15777x5c9b169f.f36732x368f3a;
            if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.a(context, c15780xf49d6a1c.f36743xf0cd21de, i17, true, c15777x5c9b169f.f36730xd371e91, -1.0f, "", str);
                return 2;
            }
            if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.a(context, c15780xf49d6a1c.f36743xf0cd21de, i17, true, 0, c15777x5c9b169f.f36731x3474cd60, "", str);
                return 2;
            }
        }
        return v(context, c15780xf49d6a1c.f36743xf0cd21de, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(android.content.Context r13, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c r14, int r15, java.lang.String r16, android.os.Bundle r17, q80.f0 r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.y(android.content.Context, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo, int, java.lang.String, android.os.Bundle, q80.f0):void");
    }

    public static int z(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", "parseColor: " + e17.getMessage());
            }
        }
        return 0;
    }
}
