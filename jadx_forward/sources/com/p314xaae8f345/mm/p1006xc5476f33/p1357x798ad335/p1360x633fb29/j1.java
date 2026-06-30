package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public abstract class j1 {
    public static void a(boolean z17, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean z18 = false;
        if (z17) {
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false)) {
                z18 = true;
            }
        }
        if (z18 && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            try {
                jSONObject.put("network_tips", 1);
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public static org.json.JSONObject b(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", str);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b, "ok");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGameDownloadManager", e17.getMessage());
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r16, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a r17, boolean r18, vz.z1 r19) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.c(android.content.Context, com.tencent.mm.plugin.downloader_app.model.a, boolean, vz.z1):void");
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, vz.z1 z1Var, boolean z17, boolean z18) {
        aVar.f178778l = z17;
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m1(aVar, z18, z1Var));
    }

    public static void e(android.content.Context context, long j17, boolean z17, vz.z1 z1Var) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            z1Var.a("fail", null);
            return;
        }
        g02.b.c(12, new g02.c(c17.f68404x28d45f97, c17.f68432x29cbf907, c17.f68408x32b20428, "", null, 1));
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        m02.r rVar = (m02.r) i95.n0.c(m02.r.class);
        java.lang.String str = c17.f68404x28d45f97;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y1(c19762x487075a, c17, z17, z1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z1 z1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z1(c19762x487075a, jSONObject, j17, c17, context, z1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.a2(c19762x487075a, z1Var);
        l02.k kVar = (l02.k) rVar;
        kVar.getClass();
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false)) {
            p012xc85e97e9.p016x746ad0e3.app.i0 i0Var = new p012xc85e97e9.p016x746ad0e3.app.i0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
            i0Var.C(1);
            i0Var.setCancelable(false);
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgp, (android.view.ViewGroup) null);
            i0Var.setContentView(inflate);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.d2u).setOnClickListener(new l02.e(kVar, i0Var, a2Var, str));
            inflate.findViewById(com.p314xaae8f345.mm.R.id.d2x).setOnClickListener(new l02.f(kVar, i0Var, y1Var, str));
            inflate.findViewById(com.p314xaae8f345.mm.R.id.d2t).setOnClickListener(new l02.g(kVar, i0Var, z1Var2, str));
            i0Var.show();
        } else {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
            i0Var2.g(com.p314xaae8f345.mm.R.C30867xcad56011.goy);
            i0Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.goz);
            i0Var2.f(com.p314xaae8f345.mm.R.C30867xcad56011.gox);
            l02.h hVar = new l02.h(kVar, c19762x487075a2, y1Var, str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var2.f293354b;
            aVar.E = hVar;
            i0Var2.e(com.p314xaae8f345.mm.R.C30867xcad56011.gov);
            aVar.F = new l02.i(kVar, z1Var2, c19762x487075a2, str);
            aVar.A = true;
            aVar.G = new l02.j(kVar, a2Var, c19762x487075a2, str);
            i0Var2.h();
        }
        o02.a.b(15, 1502, 1, 1, str, "", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.content.Context r9, long r10, boolean r12, boolean r13, boolean r14, vz.z1 r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.f(android.content.Context, long, boolean, boolean, boolean, vz.z1):void");
    }

    public static void g(h02.a aVar, boolean z17, boolean z18, boolean z19, vz.z1 z1Var) {
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).wi("LuggageGameWebViewUI_resumeGameDownloadTask");
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        long j17 = aVar.f68408x32b20428;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.x1(z18, z17, z19, z1Var);
        ((l02.q) sVar).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            x1Var.a(m02.a.FAIL, j17);
            return;
        }
        c17.f68417x26b3182a = l02.q.Di(c17.f68417x26b3182a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.g(c17, z17, x1Var);
    }

    public static void h(android.content.Context context, long j17, boolean z17, vz.z1 z1Var) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGameDownloadManager", "fail, invalid downloadId = " + j17);
            z1Var.a("fail", null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.f293242a = string;
        aVar.f293262s = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573984o82);
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.gox);
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t1(c17, z17, z1Var);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f573983o81);
        aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.v1(c17, z17, z1Var);
        aVar.A = false;
        i0Var.h();
    }

    public static void i(final android.content.Context context, final h02.a aVar, final vz.z1 z1Var) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.downloader.model.j1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    vz.z1 z1Var2 = z1Var;
                    h02.a aVar2 = aVar;
                    k02.l.f(context, aVar2, new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w1(z1Var2, aVar2));
                }
            });
        } else {
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.downloader.model.j1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    vz.z1 z1Var2 = z1Var;
                    h02.a aVar2 = aVar;
                    k02.l.f(context, aVar2, new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w1(z1Var2, aVar2));
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 100L, false);
        }
    }

    public static void j(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, vz.z1 z1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var.f293354b;
        aVar2.f293242a = string;
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573984o82);
        if (aVar.f178773g > 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a49, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czx)).setText(string2);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czw);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573985o83));
            int length = sb6.length();
            float f17 = (float) aVar.f178773g;
            float f18 = f17 / 1.0737418E9f;
            java.lang.String format = f18 >= 1.0f ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(f18)) : java.lang.String.format("%.1fMB", java.lang.Float.valueOf(f17 / 1048576.0f));
            sb6.append(format);
            android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su)), length, format.length() + length, 18);
            textView.setText(spannableString);
            aVar2.L = inflate;
        } else {
            aVar2.f293262s = string2;
        }
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.gox);
        aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k1(aVar, z1Var);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f573983o81);
        aVar2.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l1(aVar, z1Var);
        aVar2.A = false;
        i0Var.h();
    }
}
