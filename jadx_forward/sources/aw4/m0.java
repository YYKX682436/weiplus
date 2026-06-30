package aw4;

/* loaded from: classes11.dex */
public final class m0 {
    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(org.json.JSONObject paramsObj, boolean z17) {
        bw5.v70 v70Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsObj, "paramsObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "playSearchMusic " + paramsObj + " openMv:" + z17);
        java.lang.String optString = paramsObj.optString("musicId", "");
        java.lang.String optString2 = paramsObj.optString("songName", "");
        java.lang.String optString3 = paramsObj.optString("singerName", "");
        java.lang.String optString4 = paramsObj.optString("musicWebUrl", "");
        java.lang.String optString5 = paramsObj.optString("albumUrl", "");
        java.lang.String optString6 = paramsObj.optString("musicDataUrl", "");
        java.lang.String optString7 = paramsObj.optString("musicAppId", "");
        java.lang.String optString8 = paramsObj.optString("songLyric", "");
        java.lang.String optString9 = paramsObj.optString("albumName", "");
        java.lang.String optString10 = paramsObj.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37653xb5f52253, "");
        java.lang.String optString11 = paramsObj.optString("identification", "");
        java.lang.String str = optString;
        paramsObj.optLong("issueDate", 0L);
        long optLong = paramsObj.optLong("duration", 0L);
        paramsObj.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, "");
        paramsObj.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37643xcb779c97, 0);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchUtils", "playSearchMusic listenItem parse failed");
                return;
            }
        }
        if (str.length() == 0) {
            str = v70Var.m13170xcc16feb8();
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
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            qk.f9.b(aj6, context, true, lp0Var, eVar, null, null, ar0Var, null, 176, null);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(lp0Var, ar0Var);
            return;
        }
        rk4.z8 z8Var = (rk4.z8) g9Var;
        z8Var.getClass();
        java.lang.String b17 = lp0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        if (z8Var.oj(b17)) {
            z8Var.pj();
        } else if (z8Var.mj(b17)) {
            z8Var.wj();
        } else {
            z8Var.qj(b17, lp0Var, eVar);
        }
    }

    public final void b(android.content.Context context, tg0.h1 h1Var, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context);
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.eqo);
        android.widget.TextView textView = (android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f568864ob2);
        android.widget.TextView textView2 = (android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.oad);
        android.widget.Button button = (android.widget.Button) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.kao);
        android.widget.Button button2 = (android.widget.Button) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        android.widget.ImageView imageView = (android.widget.ImageView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.d9m);
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        int textSize = (int) textView.getTextSize();
        lf0.h0 h0Var = (lf0.h0) g0Var;
        java.lang.CharSequence wi6 = h0Var.wi(context, str, "#", textSize, mf0.f0.Medium, context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        textView.setText(h0Var.wi(context, str2, "#", textSize, mf0.f0.Heavy, context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
        textView2.setText(wi6);
        if (z17) {
            imageView.setImageDrawable(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgo));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        button.setOnClickListener(new aw4.d0(c0Var, z2Var, str3, h1Var));
        button.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571540i9));
        button2.setOnClickListener(new aw4.e0(c0Var2, z2Var, str3, h1Var, c0Var));
        z2Var.l(new aw4.f0(c0Var, c0Var2, str3, h1Var));
        z2Var.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
    }

    public final void c(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            try {
                uv4.g g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i17);
                if (g17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchUtils", "showTemplateDebugInfo: template is null for type=" + i17);
                    return;
                }
                java.lang.String l17 = g17.l();
                int b17 = g17.b();
                java.lang.String simpleName = g17.getClass().getSimpleName();
                boolean D = r26.n0.D(l17, "_udr", false, 2, null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("模板: " + simpleName + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                sb6.append("版本: " + b17 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                sb6.append("UDR: ".concat(D ? "是" : "否"));
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = sb7;
                e4Var.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "showTemplateDebugInfo: ".concat(sb7));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchUtils", e17, "showTemplateDebugInfo failed", new java.lang.Object[0]);
            }
        }
    }

    public final void d(android.content.Context context, tg0.h1 callback, boolean z17) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        db5.g3 g3Var = new db5.g3(context);
        if (((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ai()) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574933on0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            if (z17) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.omz);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574934on1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            }
            b(context, callback, string, string2, false, "tophitory_show_comment_dialog");
            return;
        }
        java.lang.String string3 = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.k1a : com.p314xaae8f345.mm.R.C30867xcad56011.k1b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80213xebd7e02b, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        android.widget.ImageView imageView = g3Var.S;
        imageView.setImageDrawable(e17);
        imageView.setVisibility(0);
        android.widget.TextView textView = g3Var.M;
        textView.setText(string3);
        textView.setVisibility(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        g3Var.E(new aw4.g0(g3Var, callback));
        g3Var.D(new aw4.h0(c0Var, g3Var, callback));
        g3Var.F(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571540i9));
        g3Var.l(new aw4.i0(g3Var, c0Var, callback));
        g3Var.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
    }

    public final void e(android.content.Context context, tg0.h1 callback, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        db5.g3 g3Var = new db5.g3(context);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80213xebd7e02b, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        android.widget.ImageView imageView = g3Var.S;
        imageView.setImageDrawable(e17);
        imageView.setVisibility(0);
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgo);
        android.widget.ImageView imageView2 = g3Var.R;
        imageView2.setImageDrawable(drawable);
        imageView2.setVisibility(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        android.widget.TextView textView = g3Var.M;
        textView.setText(str);
        textView.setVisibility(0);
        g3Var.E(new aw4.j0(g3Var, callback));
        g3Var.D(new aw4.k0(c0Var, g3Var, callback));
        g3Var.F(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571540i9));
        g3Var.l(new aw4.l0(g3Var, c0Var, callback));
        g3Var.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "show education pop window");
    }

    public final boolean f(java.lang.String str) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "vibrateShort , type = " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
            java.lang.Object obj = jSONObject.get("style");
            char c17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "light") ? (char) 1 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, ya.b.f77490x87518375) ? (char) 2 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "heavy") ? (char) 3 : (char) 65535;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchUtils", e17, be1.a1.f4207x24728b, new java.lang.Object[0]);
            return false;
        }
    }
}
