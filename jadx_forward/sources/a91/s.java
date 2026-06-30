package a91;

/* loaded from: classes13.dex */
public class s implements a91.d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        char c17;
        android.graphics.BitmapShader bitmapShader;
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        if (jSONArray.length() < 2) {
            return false;
        }
        java.lang.String optString = jSONArray.optString(0);
        e91.b bVar = iVar.f552245b;
        if ("linear".equalsIgnoreCase(optString)) {
            if (jSONArray.length() >= 3 && (optJSONArray2 = jSONArray.optJSONArray(1)) != null && optJSONArray2.length() >= 4) {
                float g17 = ik1.w.g(optJSONArray2, 0);
                float g18 = ik1.w.g(optJSONArray2, 1);
                float g19 = ik1.w.g(optJSONArray2, 2);
                float g27 = ik1.w.g(optJSONArray2, 3);
                org.json.JSONArray optJSONArray3 = jSONArray.optJSONArray(2);
                if (optJSONArray3 != null && optJSONArray3.length() != 0) {
                    int[] iArr = new int[optJSONArray3.length()];
                    float[] fArr = new float[optJSONArray3.length()];
                    for (int i17 = 0; i17 < optJSONArray3.length(); i17++) {
                        org.json.JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i17);
                        if (optJSONArray4.length() >= 2) {
                            fArr[i17] = (float) optJSONArray4.optDouble(0);
                            iArr[i17] = ik1.w.b(optJSONArray4.optJSONArray(1));
                        }
                    }
                    bVar.setShader(new android.graphics.LinearGradient(g17, g18, g19, g27, iArr, fArr, android.graphics.Shader.TileMode.CLAMP));
                }
            }
            return false;
        }
        if (!"radial".equalsIgnoreCase(optString)) {
            android.graphics.BitmapShader bitmapShader2 = null;
            if ("normal".equalsIgnoreCase(optString)) {
                org.json.JSONArray optJSONArray5 = jSONArray.optJSONArray(1);
                if (optJSONArray5 == null || optJSONArray5.length() < 4) {
                    return false;
                }
                bVar.setShader(null);
                bVar.setColor(ik1.w.b(optJSONArray5));
            } else if ("pattern".equalsIgnoreCase(optString)) {
                java.lang.String optString2 = jSONArray.optString(1);
                java.lang.String optString3 = jSONArray.optString(2);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle failed, type is pattern but image path is null or nil.");
                    return false;
                }
                android.graphics.Bitmap a17 = ((zg1.d) iVar.f552249f).a(iVar, optString2, null, null);
                if (a17 != null && !a17.isRecycled()) {
                    int c18 = ik1.w.c(a17.getWidth());
                    int c19 = ik1.w.c(a17.getHeight());
                    optString3.getClass();
                    switch (optString3.hashCode()) {
                        case -934531685:
                            if (optString3.equals("repeat")) {
                                c17 = 0;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case -724648153:
                            if (optString3.equals("no-repeat")) {
                                c17 = 1;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case -436782906:
                            if (optString3.equals("repeat-x")) {
                                c17 = 2;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case -436782905:
                            if (optString3.equals("repeat-y")) {
                                c17 = 3;
                                break;
                            }
                            c17 = 65535;
                            break;
                        default:
                            c17 = 65535;
                            break;
                    }
                    if (c17 != 0) {
                        if (c17 == 1) {
                            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(config);
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(java.lang.Integer.valueOf(c19 + 1));
                            arrayList.add(java.lang.Integer.valueOf(c18 + 1));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/canvas/action/SetFillStyleAction", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/canvas/action/SetFillStyleAction", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            new android.graphics.Canvas(createBitmap).drawBitmap(a17, new android.graphics.Rect(0, 0, a17.getWidth(), a17.getHeight()), new android.graphics.RectF(0.0f, 0.0f, c18, c19), (android.graphics.Paint) null);
                            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
                            bitmapShader = new android.graphics.BitmapShader(createBitmap, tileMode, tileMode);
                        } else if (c17 == 2) {
                            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(config2);
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(java.lang.Integer.valueOf(c19 + 1));
                            arrayList2.add(java.lang.Integer.valueOf(c18));
                            java.lang.Object obj2 = new java.lang.Object();
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/canvas/action/SetFillStyleAction", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                            yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/appbrand/canvas/action/SetFillStyleAction", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            new android.graphics.Canvas(createBitmap2).drawBitmap(a17, new android.graphics.Rect(0, 0, a17.getWidth(), a17.getHeight()), new android.graphics.RectF(0.0f, 0.0f, c18, c19), (android.graphics.Paint) null);
                            bitmapShader = new android.graphics.BitmapShader(createBitmap2, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                        } else if (c17 == 3) {
                            android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(config3);
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList3.add(java.lang.Integer.valueOf(c19));
                            arrayList3.add(java.lang.Integer.valueOf(c18 + 1));
                            java.lang.Object obj3 = new java.lang.Object();
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/canvas/action/SetFillStyleAction", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap3 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                            yj0.a.e(obj3, createBitmap3, "com/tencent/mm/plugin/appbrand/canvas/action/SetFillStyleAction", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            new android.graphics.Canvas(createBitmap3).drawBitmap(a17, new android.graphics.Rect(0, 0, a17.getWidth(), a17.getHeight()), new android.graphics.RectF(0.0f, 0.0f, c18, c19), (android.graphics.Paint) null);
                            bitmapShader = new android.graphics.BitmapShader(createBitmap3, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.REPEAT);
                        }
                        bitmapShader2 = bitmapShader;
                    } else {
                        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(a17, c18, c19, false);
                        android.graphics.Shader.TileMode tileMode2 = android.graphics.Shader.TileMode.REPEAT;
                        bitmapShader2 = new android.graphics.BitmapShader(createScaledBitmap, tileMode2, tileMode2);
                    }
                    bVar.setShader(bitmapShader2);
                }
            }
        } else {
            if (jSONArray.length() < 3 || (optJSONArray = jSONArray.optJSONArray(1)) == null || optJSONArray.length() < 3) {
                return false;
            }
            float g28 = ik1.w.g(optJSONArray, 0);
            float g29 = ik1.w.g(optJSONArray, 1);
            float g37 = ik1.w.g(optJSONArray, 2);
            if (g37 <= 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle(radial) failed, sr(%s) <= 0.", java.lang.Float.valueOf(g37));
                return false;
            }
            org.json.JSONArray optJSONArray6 = jSONArray.optJSONArray(2);
            int[] iArr2 = new int[optJSONArray6.length()];
            float[] fArr2 = new float[optJSONArray6.length()];
            for (int i18 = 0; i18 < optJSONArray6.length(); i18++) {
                org.json.JSONArray optJSONArray7 = optJSONArray6.optJSONArray(i18);
                if (optJSONArray7.length() >= 2) {
                    fArr2[i18] = (float) optJSONArray7.optDouble(0);
                    iArr2[i18] = ik1.w.b(optJSONArray7.optJSONArray(1));
                }
            }
            bVar.setShader(new android.graphics.RadialGradient(g28, g29, g37, iArr2, fArr2, android.graphics.Shader.TileMode.CLAMP));
        }
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11772x3746bdd4 c11772x3746bdd4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11772x3746bdd4) interfaceC11753x43f81f3c;
        if (c11772x3746bdd4 == null) {
            return false;
        }
        return c11772x3746bdd4.a(iVar, canvas);
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setFillStyle";
    }
}
