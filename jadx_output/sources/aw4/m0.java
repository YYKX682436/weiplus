package aw4;

/* loaded from: classes11.dex */
public final class m0 {
    public m0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(org.json.JSONObject paramsObj, boolean z17) {
        bw5.v70 v70Var;
        kotlin.jvm.internal.o.g(paramsObj, "paramsObj");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "playSearchMusic " + paramsObj + " openMv:" + z17);
        java.lang.String optString = paramsObj.optString("musicId", "");
        java.lang.String optString2 = paramsObj.optString("songName", "");
        java.lang.String optString3 = paramsObj.optString("singerName", "");
        java.lang.String optString4 = paramsObj.optString("musicWebUrl", "");
        java.lang.String optString5 = paramsObj.optString("albumUrl", "");
        java.lang.String optString6 = paramsObj.optString("musicDataUrl", "");
        java.lang.String optString7 = paramsObj.optString("musicAppId", "");
        java.lang.String optString8 = paramsObj.optString("songLyric", "");
        java.lang.String optString9 = paramsObj.optString("albumName", "");
        java.lang.String optString10 = paramsObj.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_GENRE, "");
        java.lang.String optString11 = paramsObj.optString("identification", "");
        java.lang.String str = optString;
        paramsObj.optLong("issueDate", 0L);
        long optLong = paramsObj.optLong("duration", 0L);
        paramsObj.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, "");
        paramsObj.optInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COPYRIGHT, 0);
        paramsObj.optString("mvObjectId", "");
        paramsObj.optString("mvNonceId", "");
        java.lang.String optString12 = paramsObj.optString("mvCoverUrl", "");
        paramsObj.optString("mvMakerFinderNickname", "");
        paramsObj.optString("musicOperationUrl", "");
        java.lang.String optString13 = paramsObj.optString("mid", "");
        java.lang.String optString14 = paramsObj.optString("listenItem", "");
        paramsObj.optString("sceneNote", "");
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        if (optString14 == null || r26.n0.N(optString14)) {
            v70Var = new bw5.v70();
            v70Var.y(1);
            bw5.z90 z90Var = new bw5.z90();
            z90Var.E(optString2);
            z90Var.C(optString3);
            z90Var.B(optString4);
            z90Var.z(optString6);
            z90Var.y(optString7);
            if (optString5 == null || r26.n0.N(optString5)) {
                optString5 = optString12;
            }
            z90Var.r(optString5);
            z90Var.x(optString8);
            z90Var.A(optString13);
            z90Var.w(optString11);
            z90Var.q(optString9);
            z90Var.s((int) optLong);
            z90Var.u(optString10);
            v70Var.w(z90Var);
            v70Var.p(v70Var.j().o());
            v70Var.x(v70Var.j().l());
            v70Var.q(v70Var.j().c());
            v70Var.t(true);
        } else {
            v70Var = rk4.l5.c(optString14);
            if (v70Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchUtils", "playSearchMusic listenItem parse failed");
                return;
            }
        }
        if (str.length() == 0) {
            str = v70Var.getListenId();
        }
        if (str.length() == 0) {
            str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g(str);
        bw5.ar0 ar0Var = bw5.ar0.TingScene_WXSearch;
        il4.e eVar = new il4.e(null, 0, 2000, !z17, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null);
        if (z17) {
            qk.f9 aj6 = ((rk4.z8) g9Var).aj();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qk.f9.b(aj6, context, true, lp0Var, eVar, null, null, ar0Var, null, 176, null);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(lp0Var, ar0Var);
            return;
        }
        rk4.z8 z8Var = (rk4.z8) g9Var;
        z8Var.getClass();
        java.lang.String b17 = lp0Var.b();
        kotlin.jvm.internal.o.d(b17);
        if (z8Var.oj(b17)) {
            z8Var.pj();
        } else if (z8Var.mj(b17)) {
            z8Var.wj();
        } else {
            z8Var.qj(b17, lp0Var, eVar);
        }
    }

    public final void b(android.content.Context context, tg0.h1 h1Var, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context);
        z2Var.i(com.tencent.mm.R.layout.eqo);
        android.widget.TextView textView = (android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.f487331ob2);
        android.widget.TextView textView2 = (android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.oad);
        android.widget.Button button = (android.widget.Button) z2Var.f212058g.findViewById(com.tencent.mm.R.id.kao);
        android.widget.Button button2 = (android.widget.Button) z2Var.f212058g.findViewById(com.tencent.mm.R.id.b5i);
        android.widget.ImageView imageView = (android.widget.ImageView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.d9m);
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        int textSize = (int) textView.getTextSize();
        lf0.h0 h0Var = (lf0.h0) g0Var;
        java.lang.CharSequence wi6 = h0Var.wi(context, str, "#", textSize, mf0.f0.Medium, context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        textView.setText(h0Var.wi(context, str2, "#", textSize, mf0.f0.Heavy, context.getColor(com.tencent.mm.R.color.FG_0)));
        textView2.setText(wi6);
        if (z17) {
            imageView.setImageDrawable(context.getDrawable(com.tencent.mm.R.drawable.cgo));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        button.setOnClickListener(new aw4.d0(c0Var, z2Var, str3, h1Var));
        button.setText(context.getResources().getString(com.tencent.mm.R.string.f490007i9));
        button2.setOnClickListener(new aw4.e0(c0Var2, z2Var, str3, h1Var, c0Var));
        z2Var.l(new aw4.f0(c0Var, c0Var2, str3, h1Var));
        z2Var.C();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
    }

    public final void c(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            try {
                uv4.g g17 = com.tencent.mm.plugin.websearch.l2.g(i17);
                if (g17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchUtils", "showTemplateDebugInfo: template is null for type=" + i17);
                    return;
                }
                java.lang.String l17 = g17.l();
                int b17 = g17.b();
                java.lang.String simpleName = g17.getClass().getSimpleName();
                boolean D = r26.n0.D(l17, "_udr", false, 2, null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("模板: " + simpleName + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                sb6.append("版本: " + b17 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                sb6.append("UDR: ".concat(D ? "是" : "否"));
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = sb7;
                e4Var.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "showTemplateDebugInfo: ".concat(sb7));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchUtils", e17, "showTemplateDebugInfo failed", new java.lang.Object[0]);
            }
        }
    }

    public final void d(android.content.Context context, tg0.h1 callback, boolean z17) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        db5.g3 g3Var = new db5.g3(context);
        if (((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ai()) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f493400on0);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (z17) {
                string = context.getString(com.tencent.mm.R.string.omz);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else {
                string = context.getString(com.tencent.mm.R.string.f493401on1);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            b(context, callback, string, string2, false, "tophitory_show_comment_dialog");
            return;
        }
        java.lang.String string3 = context.getString(z17 ? com.tencent.mm.R.string.k1a : com.tencent.mm.R.string.k1b);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_news, context.getResources().getColor(com.tencent.mm.R.color.f478554ao));
        android.widget.ImageView imageView = g3Var.S;
        imageView.setImageDrawable(e17);
        imageView.setVisibility(0);
        android.widget.TextView textView = g3Var.M;
        textView.setText(string3);
        textView.setVisibility(0);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        g3Var.E(new aw4.g0(g3Var, callback));
        g3Var.D(new aw4.h0(c0Var, g3Var, callback));
        g3Var.F(context.getResources().getString(com.tencent.mm.R.string.f490007i9));
        g3Var.l(new aw4.i0(g3Var, c0Var, callback));
        g3Var.C();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
    }

    public final void e(android.content.Context context, tg0.h1 callback, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        db5.g3 g3Var = new db5.g3(context);
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_news, context.getResources().getColor(com.tencent.mm.R.color.f478554ao));
        android.widget.ImageView imageView = g3Var.S;
        imageView.setImageDrawable(e17);
        imageView.setVisibility(0);
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.tencent.mm.R.drawable.cgo);
        android.widget.ImageView imageView2 = g3Var.R;
        imageView2.setImageDrawable(drawable);
        imageView2.setVisibility(0);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        android.widget.TextView textView = g3Var.M;
        textView.setText(str);
        textView.setVisibility(0);
        g3Var.E(new aw4.j0(g3Var, callback));
        g3Var.D(new aw4.k0(c0Var, g3Var, callback));
        g3Var.F(context.getResources().getString(com.tencent.mm.R.string.f490007i9));
        g3Var.l(new aw4.l0(g3Var, c0Var, callback));
        g3Var.C();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
    }

    public final boolean f(java.lang.String str) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "vibrateShort , type = " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
            java.lang.Object obj = jSONObject.get("style");
            char c17 = kotlin.jvm.internal.o.b(obj, "light") ? (char) 1 : kotlin.jvm.internal.o.b(obj, ya.b.MEDIUM) ? (char) 2 : kotlin.jvm.internal.o.b(obj, "heavy") ? (char) 3 : (char) 65535;
            long j17 = 50;
            if (65534 == c17) {
                vibrator.vibrate(50L);
                return true;
            }
            if (65535 == c17) {
                vibrator.vibrate(50L);
                return true;
            }
            if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(50L);
            } else {
                if (c17 == 1) {
                    i17 = 128;
                    j17 = 15;
                } else if (c17 == 2) {
                    i17 = 192;
                } else if (c17 == 3) {
                    i17 = 255;
                    j17 = 85;
                } else {
                    i17 = -1;
                }
                if (-1 == i17) {
                    vibrator.vibrate(j17);
                } else {
                    vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchUtils", e17, be1.a1.NAME, new java.lang.Object[0]);
            return false;
        }
    }
}
