package com.tencent.mm.plugin.downloader.model;

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
        if (z18 && com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
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
            jSONObject.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME, "ok");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGameDownloadManager", e17.getMessage());
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
    public static void c(android.content.Context r16, com.tencent.mm.plugin.downloader_app.model.a r17, boolean r18, vz.z1 r19) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.downloader.model.j1.c(android.content.Context, com.tencent.mm.plugin.downloader_app.model.a, boolean, vz.z1):void");
    }

    public static void d(com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var, boolean z17, boolean z18) {
        aVar.f97245l = z17;
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, new com.tencent.mm.plugin.downloader.model.m1(aVar, z18, z1Var));
    }

    public static void e(android.content.Context context, long j17, boolean z17, vz.z1 z1Var) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            z1Var.a("fail", null);
            return;
        }
        g02.b.c(12, new g02.c(c17.field_appId, c17.field_scene, c17.field_downloadId, "", null, 1));
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        m02.r rVar = (m02.r) i95.n0.c(m02.r.class);
        java.lang.String str = c17.field_appId;
        com.tencent.mm.plugin.downloader.model.y1 y1Var = new com.tencent.mm.plugin.downloader.model.y1(pBool, c17, z17, z1Var);
        com.tencent.mm.plugin.downloader.model.z1 z1Var2 = new com.tencent.mm.plugin.downloader.model.z1(pBool, jSONObject, j17, c17, context, z1Var);
        com.tencent.mm.plugin.downloader.model.a2 a2Var = new com.tencent.mm.plugin.downloader.model.a2(pBool, z1Var);
        l02.k kVar = (l02.k) rVar;
        kVar.getClass();
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.clicfg_download_game_ignore_network, false)) {
            androidx.appcompat.app.i0 i0Var = new androidx.appcompat.app.i0(context, com.tencent.mm.R.style.f494143fd);
            i0Var.C(1);
            i0Var.setCancelable(false);
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cgp, (android.view.ViewGroup) null);
            i0Var.setContentView(inflate);
            inflate.findViewById(com.tencent.mm.R.id.d2u).setOnClickListener(new l02.e(kVar, i0Var, a2Var, str));
            inflate.findViewById(com.tencent.mm.R.id.d2x).setOnClickListener(new l02.f(kVar, i0Var, y1Var, str));
            inflate.findViewById(com.tencent.mm.R.id.d2t).setOnClickListener(new l02.g(kVar, i0Var, z1Var2, str));
            i0Var.show();
        } else {
            com.tencent.mm.pointers.PBool pBool2 = new com.tencent.mm.pointers.PBool();
            com.tencent.mm.ui.widget.dialog.i0 i0Var2 = new com.tencent.mm.ui.widget.dialog.i0(context);
            i0Var2.g(com.tencent.mm.R.string.goy);
            i0Var2.d(com.tencent.mm.R.string.goz);
            i0Var2.f(com.tencent.mm.R.string.gox);
            l02.h hVar = new l02.h(kVar, pBool2, y1Var, str);
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var2.f211821b;
            aVar.E = hVar;
            i0Var2.e(com.tencent.mm.R.string.gov);
            aVar.F = new l02.i(kVar, z1Var2, pBool2, str);
            aVar.A = true;
            aVar.G = new l02.j(kVar, a2Var, pBool2, str);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.downloader.model.j1.f(android.content.Context, long, boolean, boolean, boolean, vz.z1):void");
    }

    public static void g(h02.a aVar, boolean z17, boolean z18, boolean z19, vz.z1 z1Var) {
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).wi("LuggageGameWebViewUI_resumeGameDownloadTask");
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        long j17 = aVar.field_downloadId;
        com.tencent.mm.plugin.downloader.model.x1 x1Var = new com.tencent.mm.plugin.downloader.model.x1(z18, z17, z19, z1Var);
        ((l02.q) sVar).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            x1Var.a(m02.a.FAIL, j17);
            return;
        }
        c17.field_extInfo = l02.q.Di(c17.field_extInfo);
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        com.tencent.mm.plugin.downloader_app.model.o.g(c17, z17, x1Var);
    }

    public static void h(android.content.Context context, long j17, boolean z17, vz.z1 z1Var) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGameDownloadManager", "fail, invalid downloadId = " + j17);
            z1Var.a("fail", null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        java.lang.String string = context.getString(com.tencent.mm.R.string.l5y);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.f211709a = string;
        aVar.f211729s = context.getString(com.tencent.mm.R.string.f492451o82);
        i0Var.f(com.tencent.mm.R.string.gox);
        aVar.E = new com.tencent.mm.plugin.downloader.model.t1(c17, z17, z1Var);
        i0Var.e(com.tencent.mm.R.string.f492450o81);
        aVar.F = new com.tencent.mm.plugin.downloader.model.v1(c17, z17, z1Var);
        aVar.A = false;
        i0Var.h();
    }

    public static void i(final android.content.Context context, final h02.a aVar, final vz.z1 z1Var) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.downloader.model.j1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    vz.z1 z1Var2 = z1Var;
                    h02.a aVar2 = aVar;
                    k02.l.f(context, aVar2, new com.tencent.mm.plugin.downloader.model.w1(z1Var2, aVar2));
                }
            });
        } else {
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.downloader.model.j1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    vz.z1 z1Var2 = z1Var;
                    h02.a aVar2 = aVar;
                    k02.l.f(context, aVar2, new com.tencent.mm.plugin.downloader.model.w1(z1Var2, aVar2));
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 100L, false);
        }
    }

    public static void j(android.content.Context context, com.tencent.mm.plugin.downloader_app.model.a aVar, vz.z1 z1Var) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        java.lang.String string = context.getString(com.tencent.mm.R.string.l5y);
        com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var.f211821b;
        aVar2.f211709a = string;
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f492451o82);
        if (aVar.f97240g > 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a49, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czx)).setText(string2);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czw);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(context.getString(com.tencent.mm.R.string.f492452o83));
            int length = sb6.length();
            float f17 = (float) aVar.f97240g;
            float f18 = f17 / 1.0737418E9f;
            java.lang.String format = f18 >= 1.0f ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(f18)) : java.lang.String.format("%.1fMB", java.lang.Float.valueOf(f17 / 1048576.0f));
            sb6.append(format);
            android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(b3.l.getColor(context, com.tencent.mm.R.color.f479206su)), length, format.length() + length, 18);
            textView.setText(spannableString);
            aVar2.L = inflate;
        } else {
            aVar2.f211729s = string2;
        }
        i0Var.f(com.tencent.mm.R.string.gox);
        aVar2.E = new com.tencent.mm.plugin.downloader.model.k1(aVar, z1Var);
        i0Var.e(com.tencent.mm.R.string.f492450o81);
        aVar2.F = new com.tencent.mm.plugin.downloader.model.l1(aVar, z1Var);
        aVar2.A = false;
        i0Var.h();
    }
}
