package vb1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f516013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f516015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vb1.i f516016g;

    public h(vb1.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f516016g = iVar;
        this.f516013d = lVar;
        this.f516014e = i17;
        this.f516015f = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        java.lang.String str5;
        int i18;
        gb1.n nVar;
        vb1.i iVar;
        java.lang.String str6;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.String str7;
        gb1.n nVar2;
        vb1.i iVar2;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        java.lang.String str8;
        gb1.n nVar3;
        vb1.i iVar3;
        int i38;
        java.lang.String str9;
        java.lang.String str10;
        gb1.n nVar4;
        vb1.i iVar4;
        int i39;
        java.lang.String str11;
        java.lang.String str12;
        android.graphics.Bitmap createBitmap;
        if (!this.f516013d.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
            this.f516013d.a(this.f516014e, this.f516016g.o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q = ((gb1.k) this.f516013d.q(gb1.k.class)).Q(this.f516013d, this.f516015f);
        if (Q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi canvasToTempFilePath failed, component view is null.");
            this.f516013d.a(this.f516014e, this.f516016g.o("fail:page is null"));
            return;
        }
        vb1.i iVar5 = this.f516016g;
        org.json.JSONObject jSONObject = this.f516015f;
        gb1.n nVar5 = new gb1.n(this.f516013d, this.f516014e);
        iVar5.getClass();
        try {
            int i47 = jSONObject.getInt("canvasId");
            android.view.View o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) Q.M(jSONObject.optBoolean("independent", false))).o(i47);
            if (o17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasToTempFilePath", "get view by viewId(%s) return null.", java.lang.Integer.valueOf(i47));
                nVar5.a(iVar5.o("fail:get canvas by canvasId failed"));
                return;
            }
            if (!(o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasToTempFilePath", "the view(%s) is not a instance of CoverViewContainer.", java.lang.Integer.valueOf(i47));
                nVar5.a(iVar5.o("fail:the view is not a instance of CoverViewContainer"));
                return;
            }
            android.view.View view = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) o17).d(android.view.View.class);
            if (view == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasToTempFilePath", "getTargetView return null, viewId(%s).", java.lang.Integer.valueOf(i47));
                nVar5.a(iVar5.o("fail:target view is null."));
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            try {
                try {
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(measuredHeight));
                    arrayList.add(java.lang.Integer.valueOf(measuredWidth));
                    obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasToTempFilePath", "toTempFilePath", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    try {
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str4 = "MicroMsg.JsApiCanvasToTempFilePath";
                        str5 = "fail:create bitmap failed";
                        i18 = i47;
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str4 = "MicroMsg.JsApiCanvasToTempFilePath";
                    str5 = "fail:create bitmap failed";
                    i18 = i47;
                    nVar = nVar5;
                    iVar = iVar5;
                    str6 = "create bitmap failed, viewId(%s). Exception : %s";
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                str = "MicroMsg.JsApiCanvasToTempFilePath";
                str2 = "create bitmap failed, viewId(%s). Throwable : %s";
                str3 = "fail:create bitmap failed";
                i17 = i47;
            }
            try {
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap2, "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasToTempFilePath", "toTempFilePath", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                float h17 = ik1.w.h(jSONObject, "x", 0.0f);
                float h18 = ik1.w.h(jSONObject, "y", 0.0f);
                float f17 = measuredWidth;
                float h19 = ik1.w.h(jSONObject, "width", f17);
                float f18 = measuredHeight;
                float h27 = ik1.w.h(jSONObject, "height", f18);
                if (h17 + h19 > f17) {
                    h19 = f17 - h17;
                }
                if (h18 + h27 > f18) {
                    h27 = f18 - h18;
                }
                float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("destWidth"), h19);
                float L2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("destHeight"), h27);
                int i48 = (int) h17;
                if (i48 < 0 || (i27 = (int) h18) < 0 || (i28 = (int) h19) <= 0) {
                    str7 = "MicroMsg.JsApiCanvasToTempFilePath";
                    nVar2 = nVar5;
                    iVar2 = iVar5;
                    i19 = i47;
                } else {
                    int i49 = (int) h27;
                    if (i49 > 0 && ((int) (h17 + h19)) <= measuredWidth && ((int) (h18 + h27)) <= measuredHeight && (i29 = (int) L) > 0 && (i37 = (int) L2) > 0) {
                        if (view instanceof h91.b) {
                            ((h91.b) view).d(new z81.l(createBitmap2));
                        } else {
                            view.draw(new z81.l(createBitmap2));
                        }
                        if (h19 == f17 && h27 == f18) {
                            str10 = "MicroMsg.JsApiCanvasToTempFilePath";
                        } else {
                            try {
                                zj0.a aVar = new zj0.a();
                                aVar.c(java.lang.Boolean.FALSE);
                                aVar.c(null);
                                aVar.c(java.lang.Integer.valueOf(i49));
                                aVar.c(java.lang.Integer.valueOf(i28));
                                aVar.c(java.lang.Integer.valueOf(i27));
                                aVar.c(java.lang.Integer.valueOf(i48));
                                aVar.c(createBitmap2);
                                java.lang.Object obj2 = new java.lang.Object();
                                yj0.a.d(obj2, aVar.b(), "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasToTempFilePath", "toTempFilePath", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasToTempFilePath", "toTempFilePath", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                                str10 = "MicroMsg.JsApiCanvasToTempFilePath";
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                nVar4 = nVar5;
                                iVar4 = iVar5;
                                i39 = i47;
                                str11 = "create bitmap failed, viewId(%s). Exception : %s";
                                str12 = "fail:create bitmap failed";
                                str10 = "MicroMsg.JsApiCanvasToTempFilePath";
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                str8 = "create bitmap failed, viewId(%s). Throwable : %s";
                                nVar3 = nVar5;
                                iVar3 = iVar5;
                                i38 = i47;
                                str9 = "fail:create bitmap failed";
                                str10 = "MicroMsg.JsApiCanvasToTempFilePath";
                            }
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str10, "bitmap recycle %s", createBitmap2);
                                createBitmap2.recycle();
                                createBitmap2 = createBitmap;
                            } catch (java.lang.Exception e27) {
                                e = e27;
                                nVar4 = nVar5;
                                iVar4 = iVar5;
                                i39 = i47;
                                str11 = "create bitmap failed, viewId(%s). Exception : %s";
                                str12 = "fail:create bitmap failed";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str10, str11, java.lang.Integer.valueOf(i39), e);
                                nVar4.a(iVar4.o(str12));
                                return;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                str8 = "create bitmap failed, viewId(%s). Throwable : %s";
                                nVar3 = nVar5;
                                iVar3 = iVar5;
                                i38 = i47;
                                str9 = "fail:create bitmap failed";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str10, str8, java.lang.Integer.valueOf(i38), th);
                                nVar3.a(iVar3.o(str9));
                                return;
                            }
                        }
                        if (h19 != L || h27 != L2) {
                            try {
                                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap2, i29, i37, false);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str10, "bitmap recycle %s", createBitmap2);
                                createBitmap2.recycle();
                                createBitmap2 = createScaledBitmap;
                            } catch (java.lang.Exception e28) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str10, "create bitmap failed, viewId(%s). Exception : %s", java.lang.Integer.valueOf(i47), e28);
                                nVar5.a(iVar5.o("fail:create bitmap failed"));
                                return;
                            } catch (java.lang.Throwable th9) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str10, "create bitmap failed, viewId(%s). Throwable : %s", java.lang.Integer.valueOf(i47), th9);
                                nVar5.a(iVar5.o("fail:create bitmap failed"));
                                return;
                            }
                        }
                        android.graphics.Bitmap.CompressFormat C = vb1.i.C(jSONObject);
                        java.lang.String str13 = C == android.graphics.Bitmap.CompressFormat.JPEG ? "jpg" : "png";
                        com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = Q.mo50354x59eafec1().mo49614x6665a5c5("canvas_" + i47 + "." + str13);
                        if (mo49614x6665a5c5 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str10, "toTempFilePath, alloc file failed");
                            nVar5.a(iVar5.o("fail alloc file failed"));
                            return;
                        }
                        java.lang.String o18 = mo49614x6665a5c5.o();
                        try {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap2, vb1.i.D(jSONObject), C, o18, true);
                            ik1.b0 b0Var = new ik1.b0();
                            Q.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(o18)), str13, true, b0Var);
                            java.lang.String str14 = (java.lang.String) b0Var.f373357a;
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("tempFilePath", str14);
                            nVar5.a(iVar5.p("ok", hashMap));
                            return;
                        } catch (java.io.IOException e29) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str10, "save bitmap to file failed, viewId(%s). exception : %s", java.lang.Integer.valueOf(i47), e29);
                            nVar5.a(iVar5.o("fail:write file failed"));
                            return;
                        } catch (java.lang.Throwable th10) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str10, "save bitmap to file failed, viewId(%s). throwable : %s", java.lang.Integer.valueOf(i47), th10);
                            nVar5.a(iVar5.o("fail:write file failed"));
                            return;
                        }
                    }
                    nVar2 = nVar5;
                    iVar2 = iVar5;
                    i19 = i47;
                    str7 = "MicroMsg.JsApiCanvasToTempFilePath";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str7, "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, viewId(%s).", java.lang.Float.valueOf(h17), java.lang.Float.valueOf(h18), java.lang.Float.valueOf(h19), java.lang.Float.valueOf(h27), java.lang.Integer.valueOf(i19));
                nVar2.a(iVar2.o("fail:illegal arguments"));
            } catch (java.lang.Exception e37) {
                e = e37;
                str4 = "MicroMsg.JsApiCanvasToTempFilePath";
                i18 = i47;
                str5 = "fail:create bitmap failed";
                nVar = nVar5;
                iVar = iVar5;
                str6 = "create bitmap failed, viewId(%s). Exception : %s";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str4, str6, java.lang.Integer.valueOf(i18), e);
                nVar.a(iVar.o(str5));
            } catch (java.lang.Throwable th11) {
                th = th11;
                str = "MicroMsg.JsApiCanvasToTempFilePath";
                str2 = "create bitmap failed, viewId(%s). Throwable : %s";
                i17 = i47;
                str3 = "fail:create bitmap failed";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2, java.lang.Integer.valueOf(i17), th);
                nVar5.a(iVar5.o(str3));
            }
        } catch (org.json.JSONException e38) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", e38);
            nVar5.a(iVar5.o("fail:canvasId do not exist"));
        }
    }
}
