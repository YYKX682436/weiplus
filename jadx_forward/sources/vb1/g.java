package vb1;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77262x366c91de = 373;

    /* renamed from: NAME */
    public static final java.lang.String f77263x24728b = "canvasPutImageData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str = "MicroMsg.JsApiCanvasPutImageData";
        try {
            int i18 = jSONObject.getInt("canvasId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
            if (Q == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasPutImageData", "invoke JsApi canvasPutImageData failed, component view is null.");
                lVar.a(i17, o("fail:page is null"));
                return;
            }
            android.view.View o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) Q.M(jSONObject.optBoolean("independent", false))).o(i18);
            if (o17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasPutImageData", "view(%s) is null.", java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:view is null"));
                return;
            }
            if (!(o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasPutImageData", "the viewId is not a canvas(%s).", java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:illegal view type"));
                return;
            }
            android.view.KeyEvent.Callback callback = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) o17).d(android.view.View.class);
            if (!(callback instanceof h91.b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCanvasPutImageData", "the view is not a instance of CanvasView.(%s)", java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:illegal view type"));
                return;
            }
            float f17 = ik1.w.f();
            int optInt = jSONObject.optInt("x");
            int optInt2 = jSONObject.optInt("y");
            int optInt3 = jSONObject.optInt("width");
            int optInt4 = jSONObject.optInt("height");
            java.lang.Math.round(optInt * f17);
            java.lang.Math.round(optInt2 * f17);
            java.lang.Math.round(optInt3 * f17);
            java.lang.Math.round(optInt4 * f17);
            if (optInt3 == 0 || optInt4 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCanvasPutImageData", "width(%s) or height(%s) is 0.(%s)", java.lang.Integer.valueOf(optInt3), java.lang.Integer.valueOf(optInt4), java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:width or height is 0"));
                return;
            }
            if (optInt3 < 0) {
                optInt += optInt3;
                optInt3 = -optInt3;
            }
            if (optInt4 < 0) {
                optInt2 += optInt4;
                optInt4 = -optInt4;
            }
            try {
                java.lang.Object obj = jSONObject.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (!(obj instanceof java.nio.ByteBuffer)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCanvasPutImageData", "get data failed, value is not a ByteBuffer");
                    lVar.a(i17, o("fail:illegal data"));
                    return;
                }
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                byte[] a17 = ik1.f.a(byteBuffer);
                int length = a17.length / 4;
                int[] iArr = new int[length];
                int i19 = 0;
                int i27 = 0;
                while (i19 < length) {
                    int i28 = i27 + 1;
                    int i29 = (a17[i27] & 255) << 16;
                    int i37 = i28 + 1;
                    int i38 = length;
                    int i39 = ((a17[i28] & 255) << 8) | i29;
                    int i47 = i37 + 1;
                    java.lang.String str2 = str;
                    int i48 = (a17[i37] & 255) | i39;
                    i27 = i47 + 1;
                    iArr[i19] = i48 | ((a17[i47] & 255) << 24);
                    i19++;
                    length = i38;
                    str = str2;
                }
                java.lang.String str3 = str;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(optInt);
                    jSONArray2.put(optInt2);
                    jSONArray2.put(optInt3);
                    jSONArray2.put(optInt4);
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(optInt4));
                    arrayList.add(java.lang.Integer.valueOf(optInt3));
                    arrayList.add(iArr);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasPutImageData", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(3));
                    yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasPutImageData", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    jSONArray2.put(createBitmap);
                    jSONObject2.put(ya.b.f77491x8758c4e1, "__setPixels");
                    jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray2);
                    jSONArray.put(jSONObject2);
                    h91.b bVar = (h91.b) callback;
                    bVar.e(jSONArray, new vb1.f(this, lVar, i17));
                    bVar.a();
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "put json value error : %s", e17);
                    lVar.a(i17, o("fail:build action JSON error"));
                }
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCanvasPutImageData", "get data failed, %s", android.util.Log.getStackTraceString(e18));
                lVar.a(i17, o("fail:missing data"));
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCanvasPutImageData", "get canvas id failed, %s", android.util.Log.getStackTraceString(e19));
            lVar.a(i17, o("fail:illegal canvasId"));
        }
    }
}
