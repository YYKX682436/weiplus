package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class f {
    public static java.lang.String a() {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("game_ban_msg_type_array", "");
        }
        return null;
    }

    public static java.lang.String b() {
        java.lang.String d07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d07)) {
            d07 = "CN";
        }
        return d07.toUpperCase();
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("game_region_default.txt");
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                str2 = new java.lang.String(bArr);
                try {
                    inputStream.close();
                } catch (java.io.IOException e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            } catch (java.io.IOException e18) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                    }
                }
                str2 = "";
            }
            java.lang.String[] split = str2.trim().split("\\|");
            if (split.length >= 3) {
                return "zh_CN".equalsIgnoreCase(str) ? split[0] : ("zh_TW".equalsIgnoreCase(str) || "zh_HK".equalsIgnoreCase(str)) ? split[1] : split[2];
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterLogic", "this region default title has problem %s", str2);
            return "";
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e27) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                }
            }
            throw th6;
        }
    }

    public static java.lang.String d(android.content.Context context) {
        return context.getSharedPreferences("game_center_pref", 0).getString("game_region_code", "");
    }

    public static java.util.LinkedList e(android.content.Context context) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi().f221722a);
        return linkedList;
    }

    public static android.graphics.drawable.ShapeDrawable f(android.content.Context context, int i17, int i18) {
        float f17 = i18;
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, null, null));
        shapeDrawable.getPaint().setColor(i17);
        return shapeDrawable;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 g(android.content.Context context) {
        java.lang.String d17 = d(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            d17 = b();
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) ((java.util.LinkedHashMap) r53.b.f474173a.a()).get(d17);
    }

    public static java.util.LinkedList h(android.content.Context context) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi().f221723b);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it.next();
            boolean z17 = false;
            if (mVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterLogic", "appinfo:[%s], appinfo flag:[%d]", mVar.f67370x28d45f97, java.lang.Integer.valueOf(mVar.f67371xa2e856b6));
                if ((mVar.f67371xa2e856b6 & 4) > 0) {
                    z17 = true;
                }
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterLogic", "app should not show in gamecenter:[%s]", mVar.f67372x453d1e07);
                linkedList2.add(mVar);
            }
        }
        if (linkedList2.size() > 0) {
            linkedList.removeAll(linkedList2);
        }
        return linkedList;
    }

    public static java.lang.String i(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (p5Var != null) {
            java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (d17 == null) {
                d17 = "";
            }
            if ("zh_CN".equalsIgnoreCase(d17)) {
                stringBuffer.append(p5Var.f223245a);
            } else if ("zh_TW".equalsIgnoreCase(d17) || "zh_HK".equalsIgnoreCase(d17)) {
                stringBuffer.append(p5Var.f223246b);
            } else {
                stringBuffer.append(p5Var.f223247c);
            }
        }
        return stringBuffer.toString();
    }

    public static void j(android.content.Context context, java.lang.String str) {
        k(context, str, null, "WX_GameCenter", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.pluginsdk.model.app.a5):void");
    }

    public static void l(int i17) {
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.String a17 = a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0);
        java.lang.String[] split = a17.split(",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : split) {
            if (!str.equals(valueOf)) {
                sb6.append(str);
                sb6.append(",");
            }
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        sharedPreferences.edit().putString("game_ban_msg_type_array", sb6.toString()).apply();
    }

    public static void m(android.content.Context context, java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("game_center_pref", 0);
        java.lang.String string = sharedPreferences.getString("download_app_id_time_map", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            sharedPreferences.edit().putString("download_app_id_time_map", str + "-" + valueOf).commit();
            return;
        }
        if (!string.contains(str)) {
            sharedPreferences.edit().putString("download_app_id_time_map", string + "," + str + "-" + valueOf).apply();
            return;
        }
        java.lang.String str2 = new java.lang.String();
        java.lang.String[] split = string.split(",");
        for (int i17 = 0; i17 < split.length; i17++) {
            java.lang.String str3 = split[i17];
            if (str3.contains(str)) {
                str3 = str + "-" + valueOf;
            }
            str2 = i17 == split.length - 1 ? str2 + str3 : str2 + str3 + ",";
        }
        sharedPreferences.edit().putString("download_app_id_time_map", str2).apply();
    }

    public static void n(int i17) {
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0);
        java.lang.String a17 = a();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            for (java.lang.String str : a17.split(",")) {
                if (str.equals(valueOf)) {
                    return;
                }
            }
            valueOf = a17 + "," + valueOf;
        }
        sharedPreferences.edit().putString("game_ban_msg_type_array", valueOf).apply();
    }
}
