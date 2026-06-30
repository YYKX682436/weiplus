package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class j4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f263893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f263894f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263895g = "";

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, sd.b bVar) {
        j4Var.getClass();
        if (bVar.f488130b.f426039c.optLong("liteCallbackId", 0L) != 0) {
            j4Var.d(((sd.a) bVar.f488129a).mo64555x76847179(), bVar.f488130b.f426039c.toString(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q4(j4Var, bVar));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsapi_name", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.class.getName());
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bVar.f488130b.f426039c.toString());
        sw4.g.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d, bundle, sw4.k.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r4(j4Var, bVar));
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        j4Var.getClass();
        if (jSONObject == null) {
            q5Var.a("params is null", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 35);
        intent.putExtra("mutil_select_is_ret", true);
        if (j4Var.f263893e == com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG) {
            intent.putExtra("select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 0);
            j4Var.k(jSONObject, context, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.a5(j4Var, q5Var, jSONObject, intent, context, str));
            return;
        }
        intent.putExtra("scene_from", 2);
        intent.putExtra("Retr_Msg_Type", 2);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("friend");
        if (optJSONObject == null) {
            q5Var.a("friend data is null", null);
            return;
        }
        j4Var.f263895g = optJSONObject.optString("appid");
        java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = optJSONObject.optString("desc");
        java.lang.String optString3 = optJSONObject.optString("img_url");
        java.lang.String optString4 = optJSONObject.optString("link");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(optString3);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("img_url", optString3);
        hashMap.put("desc", optString2);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, optString);
        hashMap.put("url", optString4);
        hashMap.put("appId", j4Var.f263895g);
        hashMap.put("srcUserName", optJSONObject.optString("src_username"));
        hashMap.put("srcDisplayname", optJSONObject.optString("src_displayname"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "shareCustomContent params:" + hashMap);
        intent.putExtra("webview_params", hashMap);
        j4Var.n(intent, context, jSONObject, hashMap, str, q5Var);
    }

    public static boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, boolean z17) {
        j4Var.getClass();
        java.lang.String optString = jSONObject.optString("videoId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            return false;
        }
        m33.g1 mj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).mj(optString);
        if (mj6 == null) {
            q5Var.a("localVideo not exist videoId = videoId", null);
        } else {
            m33.k1 k1Var = new m33.k1();
            k1Var.f404838c = mj6.f404823d;
            k1Var.f404836a = mj6.f404821b;
            k1Var.f404837b = mj6.f404822c;
            k1Var.f404840e = mj6.f404827h;
            k1Var.f404841f = mj6.f404828i;
            k1Var.f404839d = mj6.f404829j;
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ri(context, k1Var, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.d5(j4Var, q5Var));
            } else if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ri((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, k1Var, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.e5(j4Var, q5Var));
            } else {
                q5Var.a("context is not MMFragmentActivity", null);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        j4Var.getClass();
        if (context == 0) {
            return;
        }
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            if (abstractActivityC21394xb3d2c0cf.isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareCustomContent", "activity is null or finish");
                return;
            }
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l4(j4Var, q5Var, str, abstractActivityC21394xb3d2c0cf));
        } else if (context instanceof q80.z) {
            ((q80.z) context).R1(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.m4(j4Var, q5Var, str, context));
        }
        android.content.Intent intent = new android.content.Intent();
        if (j4Var.f263893e == com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG) {
            j4Var.k(jSONObject, context, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n4(j4Var, q5Var, intent, context));
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("timeline");
        if (optJSONObject == null) {
            return;
        }
        java.lang.String optString = optJSONObject.optString("link");
        java.lang.String optString2 = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "link is null");
            return;
        }
        java.lang.String optString3 = optJSONObject.optString("img_url");
        intent.putExtra("Ksnsupload_link", optString);
        intent.putExtra("Ksnsupload_title", optString2);
        intent.putExtra("Ksnsupload_imgurl", optString3);
        intent.putExtra("ShareUrlOriginal", optString);
        intent.putExtra("ShareUrlOpen", optJSONObject.optString("currentUrl"));
        intent.putExtra("JsAppId", optJSONObject.optString("preVerifyAppId"));
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "doTimeline, start activity");
        j45.l.o(context, "sns", ".ui.SnsUploadUI", intent, 2, false);
    }

    @Override // sd.c
    public java.lang.String b() {
        return "shareCustomContent";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4(this, str, q5Var, context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p4(this, bVar));
    }

    public final void j(org.json.JSONArray jSONArray, db5.g4 g4Var, android.content.Context context) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        if (jSONArray == null) {
            return;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a);
                byte[] decode = android.util.Base64.decode(jSONObject.optString("iconData"), 0);
                if (decode != null) {
                    int length = decode.length;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(length));
                    arrayList.add(0);
                    arrayList.add(decode);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent", "addMenuItemByJsonArray", "(Lorg/json/JSONArray;Lcom/tencent/mm/ui/base/MMMenu;Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                    yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent", "addMenuItemByJsonArray", "(Lorg/json/JSONArray;Lcom/tencent/mm/ui/base/MMMenu;Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), decodeByteArray);
                } else {
                    bitmapDrawable = null;
                }
                if (bitmapDrawable != null) {
                    try {
                        g4Var.n(optInt + 1000, optString, bitmapDrawable, 0);
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "err:" + e.getMessage());
                    }
                }
            } catch (org.json.JSONException e18) {
                e = e18;
            }
        }
    }

    public final void k(org.json.JSONObject jSONObject, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        int i17;
        if (jSONObject == null) {
            q5Var.a("params is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("imgUrl");
        java.lang.String optString2 = jSONObject.optString("imgLocalId");
        this.f263894f = jSONObject.optString("imgPath");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f263894f)) {
                    jSONObject2.put("imgPath", this.f263894f);
                    q5Var.a(null, jSONObject2);
                    return;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f263894f)) {
                    this.f263894f = m(optString2, null);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f263894f)) {
                    jSONObject2.put("imgPath", this.f263894f);
                    q5Var.a(null, jSONObject2);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    q5Var.a("imgUrl is null", null);
                    return;
                }
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                k70.v vVar = (k70.v) i95.n0.c(k70.v.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o4 o4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o4(this, countDownLatch, jSONObject2, q5Var);
                ((j70.e) vVar).getClass();
                m11.b1.wi().a(optString, false, o4Var);
                try {
                    try {
                        countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(optString);
                        if (currentTimeMillis2 >= 5000 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject2.optString(this.f263894f))) {
                            q5Var.a("download image fail", null);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "recent forward send success, loading duration is %d", java.lang.Long.valueOf(currentTimeMillis2));
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiShareCustomContent", e17, "", new java.lang.Object[0]);
                        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(optString);
                        if (currentTimeMillis3 >= 5000 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject2.optString(this.f263894f))) {
                            q5Var.a("download image fail", null);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "recent forward send success, loading duration is %d", java.lang.Long.valueOf(currentTimeMillis3));
                    }
                } catch (java.lang.Throwable th6) {
                    long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(optString);
                    if (currentTimeMillis4 >= 5000 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject2.optString(this.f263894f))) {
                        q5Var.a("download image fail", null);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "recent forward send success, loading duration is %d", java.lang.Long.valueOf(currentTimeMillis4));
                    throw th6;
                }
            } catch (org.json.JSONException e18) {
                e = e18;
                i17 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiShareCustomContent", e, "", new java.lang.Object[i17]);
                q5Var.a("JSONException", null);
            }
        } catch (org.json.JSONException e19) {
            e = e19;
            i17 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.content.Context r20, org.json.JSONObject r21, java.lang.String r22, int r23, int r24, android.content.Intent r25, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 r26) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.l(android.content.Context, org.json.JSONObject, java.lang.String, int, int, android.content.Intent, com.tencent.mm.plugin.webview.luggage.jsapi.q5):void");
    }

    public final java.lang.String m(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
            return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir() + "/gamecenter/tmp/share/";
        if (bitmap == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMImage_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b("shareImage".getBytes()));
        sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        java.lang.String sb7 = sb6.toString();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2 + sb7, true);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "save temp file failed");
        }
        return str2 + sb7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(android.content.Intent intent, final android.content.Context context, final org.json.JSONObject jSONObject, java.util.HashMap hashMap, final java.lang.String str, final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.b5(this, context, jSONObject, str, q5Var));
        } else if (context instanceof q80.z) {
            ((q80.z) context).R1(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c5(this, context, jSONObject, str, q5Var));
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.j4$$c
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.this.l(context, jSONObject, str, i17, i18, intent2, q5Var);
            }
        };
        if (this.f263893e != com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG) {
            se5.a aVar = new se5.a();
            aVar.l(n13.v.f415673a.e(hashMap));
            n13.r rVar = new n13.r();
            rVar.f415650a = true;
            rVar.f415651b = 1;
            rVar.f415652c = daVar;
            rVar.f415653d.f415672a = 3;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", this.f263894f);
        intent2.putExtra("Retr_Compress_Type", 1);
        intent2.putExtra("Retr_Msg_Type", 0);
        intent2.putExtra("Retr_show_success_tips", false);
        intent2.putExtra("content_type_forward_to_wework", 2);
        intent2.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed(this.f263894f));
        java.lang.Object obj = hashMap.get("tail_url");
        if (obj != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj.toString())) {
            intent2.putExtra("sourceImgInfo", new com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256(obj.toString(), 1));
        }
        j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent2, 1);
    }
}
