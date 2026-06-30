package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34749x366c91de = 1480;

    /* renamed from: NAME */
    public static final java.lang.String f34750x24728b = "detectImageCode";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int[] iArr;
        android.graphics.Bitmap bitmap;
        java.lang.String str;
        java.io.InputStream q17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        java.lang.String optString = jSONObject.optString("imageUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            str = android.text.TextUtils.isEmpty("fail:check imageUrl, empty") ? "fail:jsapi invalid request data" : "fail:check imageUrl, empty";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str, jSONObject2));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanType");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            iArr = new int[]{2, 1, 3};
        } else {
            iArr = new int[optJSONArray.length()];
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString2 = optJSONArray.optString(i18);
                if (optString2 != null) {
                    switch (optString2.hashCode()) {
                        case -993060056:
                            if (optString2.equals("pdf417")) {
                                iArr[i18] = 4;
                                break;
                            } else {
                                break;
                            }
                        case -952485970:
                            if (optString2.equals("qrCode")) {
                                iArr[i18] = 2;
                                break;
                            } else {
                                break;
                            }
                        case -775169938:
                            if (optString2.equals("wxCode")) {
                                iArr[i18] = 3;
                                break;
                            } else {
                                break;
                            }
                        case -334537568:
                            if (optString2.equals("barCode")) {
                                iArr[i18] = 1;
                                break;
                            } else {
                                break;
                            }
                        case 2003869675:
                            if (optString2.equals("datamatrix")) {
                                iArr[i18] = 5;
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = service.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t37, "getRuntime(...)");
        com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609 = t37.mo48802x59eafec1().mo49301x1d537609(optString, false);
        if (mo49301x1d537609 != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            java.lang.String o17 = mo49301x1d537609.o();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(o17);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode", "decodeImage", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode", "decodeImage", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        } else {
            bitmap = null;
        }
        if (bitmap == null && (q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.q(t37, optString)) != null) {
            try {
                q17.mark(0);
                android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
                android.graphics.Rect rect = new android.graphics.Rect();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options2);
                arrayList2.add(rect);
                arrayList2.add(q17);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode", "decodeImage", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
                yj0.a.e(obj2, bitmap, "com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode", "decodeImage", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            } finally {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(q17);
            }
        }
        if (bitmap == null) {
            str = android.text.TextUtils.isEmpty("fail:decodeImage fail, check imageUrl") ? "fail:jsapi invalid request data" : "fail:decodeImage fail, check imageUrl";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            service.a(i17, u(str, jSONObject3));
            return;
        }
        ((jd0.j2) ((kd0.v2) i95.n0.c(kd0.v2.class))).getClass();
        java.util.List a17 = bt5.a.a(bitmap, iArr, true);
        if (a17 == null || a17.isEmpty()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("results", new java.util.ArrayList(0));
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            service.a(i17, t("ok", hashMap));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", "qBarResultList.size=qBarResultList.size=" + a17.size());
        java.lang.String str5 = service.t3().u0().f128811x;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(a17.size());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(a17.size());
        int size = a17.size();
        int i19 = 0;
        while (i19 < size) {
            zs5.c0 c0Var = (zs5.c0) a17.get(i19);
            int a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c0Var.f556864e);
            java.util.List list = a17;
            if (a18 == 19 || a18 == 22) {
                arrayList4.add(c0Var);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                arrayList3.add(C(str5, a18, c0Var, null));
            }
            i19++;
            a17 = list;
        }
        if (arrayList4.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", "needA8KeyList is empty");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("results", arrayList3);
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 0);
            service.a(i17, t("ok", hashMap2));
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(service.getF229340d())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", "offline mode");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("results", arrayList3);
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 0);
            service.a(i17, t("ok", hashMap3));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", "online mode, needA8KeyList size=" + arrayList4.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.h(arrayList3, arrayList4, service, i17, this, str5);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            zs5.c0 c0Var2 = (zs5.c0) it.next();
            java.lang.String data = c0Var2.f556865f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
            arrayList5.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580(data, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c0Var2.f556864e), c0Var2 instanceof com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 ? ((com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) c0Var2).f296783m : 0));
        }
        uk0.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e(arrayList5), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.e(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.c(arrayList4, hVar));
    }

    public final java.util.Map C(java.lang.String str, int i17, zs5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832 c12226xbf714832) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("charSet", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        byte[] rawData = c0Var.f556866g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rawData, "rawData");
        hashMap.put("rawData", rawData);
        hashMap.put("codeVersion", java.lang.Integer.valueOf(c0Var instanceof com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 ? ((com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) c0Var).f296783m : 0));
        if (i17 == 19 || i17 == 22) {
            java.lang.String str2 = i17 == 22 ? "" : c0Var.f556865f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            hashMap.put("result", str2);
            hashMap.put("scanType", i17 == 22 ? "WX_CODE" : "QR_CODE");
        } else {
            java.lang.String data = c0Var.f556865f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
            hashMap.put("result", data);
            java.lang.String str3 = c0Var.f556864e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("scanType", str3);
        }
        if (c12226xbf714832 != null && c12226xbf714832.f164462d == 26) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillWXAppInfoIPC result=");
            sb6.append(c0Var.f556865f);
            sb6.append(", respStr=");
            java.lang.String str4 = c12226xbf714832.f164463e;
            sb6.append(str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDetectImageCode", sb6.toString());
            android.net.Uri parse = android.net.Uri.parse(str4);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, parse.getQueryParameter(dm.i4.f66875xa013b0d5))) {
                java.lang.String queryParameter = parse.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, queryParameter != null ? queryParameter : "");
            }
        }
        return hashMap;
    }
}
