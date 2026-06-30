package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1480;
    public static final java.lang.String NAME = "detectImageCode";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int[] iArr;
        android.graphics.Bitmap bitmap;
        java.lang.String str;
        java.io.InputStream q17;
        com.tencent.mm.plugin.appbrand.service.c0 service = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.d(jSONObject);
        java.lang.String optString = jSONObject.optString("imageUrl");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            str = android.text.TextUtils.isEmpty("fail:check imageUrl, empty") ? "fail:jsapi invalid request data" : "fail:check imageUrl, empty";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
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
        com.tencent.mm.plugin.appbrand.o6 t37 = service.t3();
        kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
        com.tencent.mm.vfs.r6 absoluteFile = t37.getFileSystem().getAbsoluteFile(optString, false);
        if (absoluteFile != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            java.lang.String o17 = absoluteFile.o();
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
        if (bitmap == null && (q17 = com.tencent.mm.plugin.appbrand.appcache.la.q(t37, optString)) != null) {
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
                com.tencent.mm.sdk.platformtools.t8.v1(q17);
            }
        }
        if (bitmap == null) {
            str = android.text.TextUtils.isEmpty("fail:decodeImage fail, check imageUrl") ? "fail:jsapi invalid request data" : "fail:decodeImage fail, check imageUrl";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            service.a(i17, u(str, jSONObject3));
            return;
        }
        ((jd0.j2) ((kd0.v2) i95.n0.c(kd0.v2.class))).getClass();
        java.util.List a17 = bt5.a.a(bitmap, iArr, true);
        if (a17 == null || a17.isEmpty()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("results", new java.util.ArrayList(0));
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            service.a(i17, t("ok", hashMap));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", "qBarResultList.size=qBarResultList.size=" + a17.size());
        java.lang.String str5 = service.t3().u0().f47278x;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(a17.size());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(a17.size());
        int size = a17.size();
        int i19 = 0;
        while (i19 < size) {
            zs5.c0 c0Var = (zs5.c0) a17.get(i19);
            int a18 = com.tencent.mm.plugin.scanner.j1.a(c0Var.f475331e);
            java.util.List list = a17;
            if (a18 == 19 || a18 == 22) {
                arrayList4.add(c0Var);
            } else {
                kotlin.jvm.internal.o.d(str5);
                arrayList3.add(C(str5, a18, c0Var, null));
            }
            i19++;
            a17 = list;
        }
        if (arrayList4.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", "needA8KeyList is empty");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("results", arrayList3);
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 0);
            service.a(i17, t("ok", hashMap2));
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(service.getF147807d())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", "offline mode");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("results", arrayList3);
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 0);
            service.a(i17, t("ok", hashMap3));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", "online mode, needA8KeyList size=" + arrayList4.size());
        com.tencent.mm.plugin.appbrand.jsapi.scanner.h hVar = new com.tencent.mm.plugin.appbrand.jsapi.scanner.h(arrayList3, arrayList4, service, i17, this, str5);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            zs5.c0 c0Var2 = (zs5.c0) it.next();
            java.lang.String data = c0Var2.f475332f;
            kotlin.jvm.internal.o.f(data, "data");
            arrayList5.add(new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData(data, com.tencent.mm.plugin.scanner.j1.a(c0Var2.f475331e), c0Var2 instanceof com.tencent.qbar.WxQBarResult ? ((com.tencent.qbar.WxQBarResult) c0Var2).f215250m : 0));
        }
        uk0.a.b(new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList(arrayList5), new com.tencent.mm.plugin.appbrand.jsapi.scanner.e(), new com.tencent.mm.plugin.appbrand.jsapi.scanner.c(arrayList4, hVar));
    }

    public final java.util.Map C(java.lang.String str, int i17, zs5.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData jsApiDetectImageCode$A8KeyRespData) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("charSet", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        byte[] rawData = c0Var.f475333g;
        kotlin.jvm.internal.o.f(rawData, "rawData");
        hashMap.put("rawData", rawData);
        hashMap.put("codeVersion", java.lang.Integer.valueOf(c0Var instanceof com.tencent.qbar.WxQBarResult ? ((com.tencent.qbar.WxQBarResult) c0Var).f215250m : 0));
        if (i17 == 19 || i17 == 22) {
            java.lang.String str2 = i17 == 22 ? "" : c0Var.f475332f;
            kotlin.jvm.internal.o.d(str2);
            hashMap.put("result", str2);
            hashMap.put("scanType", i17 == 22 ? "WX_CODE" : "QR_CODE");
        } else {
            java.lang.String data = c0Var.f475332f;
            kotlin.jvm.internal.o.f(data, "data");
            hashMap.put("result", data);
            java.lang.String str3 = c0Var.f475331e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("scanType", str3);
        }
        if (jsApiDetectImageCode$A8KeyRespData != null && jsApiDetectImageCode$A8KeyRespData.f82929d == 26) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillWXAppInfoIPC result=");
            sb6.append(c0Var.f475332f);
            sb6.append(", respStr=");
            java.lang.String str4 = jsApiDetectImageCode$A8KeyRespData.f82930e;
            sb6.append(str4);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", sb6.toString());
            android.net.Uri parse = android.net.Uri.parse(str4);
            if (kotlin.jvm.internal.o.b(str, parse.getQueryParameter(dm.i4.COL_USERNAME))) {
                java.lang.String queryParameter = parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, queryParameter != null ? queryParameter : "");
            }
        }
        return hashMap;
    }
}
