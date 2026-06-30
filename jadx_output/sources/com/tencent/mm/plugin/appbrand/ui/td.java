package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class td {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.td f90243a = new com.tencent.mm.plugin.appbrand.ui.td();

    public final java.util.List a(android.widget.LinearLayout linerLayout, java.lang.String tagsInfoRaw, boolean z17) {
        int i17;
        kotlin.jvm.internal.o.g(linerLayout, "linerLayout");
        kotlin.jvm.internal.o.g(tagsInfoRaw, "tagsInfoRaw");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (tagsInfoRaw.length() == 0) {
            com.tencent.mars.xlog.Log.e("WAGameTagsViewMgr", "tagsInfoRaw is empty");
            return arrayList;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(tagsInfoRaw);
        int length = jSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
            kotlin.jvm.internal.o.f(jSONObject, "getJSONObject(...)");
            int optInt = jSONObject.optInt("icon_type");
            arrayList.add(java.lang.Integer.valueOf(optInt % 1000));
            if (z17) {
                optInt += 1000;
                i17 = 4;
            } else {
                i17 = 3;
            }
            int i19 = i17;
            int i27 = optInt;
            android.widget.ImageView imageView = new android.widget.ImageView(linerLayout.getContext());
            org.json.JSONObject jSONObject2 = k91.n3.f305692a;
            com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) ((java.util.LinkedHashMap) k91.n3.f305694c).get(java.lang.Integer.valueOf(i27));
            if (r6Var == null) {
                com.tencent.mars.xlog.Log.e("WAGameTagsViewMgr", "can not match imageFileMap");
            } else {
                try {
                    if (r6Var.m()) {
                        java.lang.String o17 = r6Var.o();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(o17);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/WAGameTagsViewMgr", "addGameTags", "(Landroid/widget/LinearLayout;Ljava/lang/String;Z)Ljava/util/List;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0));
                        yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/appbrand/ui/WAGameTagsViewMgr", "addGameTags", "(Landroid/widget/LinearLayout;Ljava/lang/String;Z)Ljava/util/List;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                        imageView.setImageBitmap(decodeFile);
                    } else {
                        com.tencent.mars.xlog.Log.e("WAGameTagsViewMgr", "File does not exist: " + r6Var);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("WAGameTagsViewMgr", "Error loading image", e17);
                }
                imageView.getResources().getDisplayMetrics();
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                android.content.Context context = linerLayout.getContext();
                org.json.JSONObject jSONObject3 = k91.n3.f305692a;
                java.util.Map map = k91.n3.f305693b;
                org.json.JSONObject jSONObject4 = (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i27));
                layoutParams.width = i65.a.b(context, jSONObject4 != null ? jSONObject4.optInt("icon_width") : 0);
                android.content.Context context2 = linerLayout.getContext();
                org.json.JSONObject jSONObject5 = (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i27));
                layoutParams.height = i65.a.b(context2, jSONObject5 != null ? jSONObject5.optInt("icon_height") : 0);
                if (i18 > 0) {
                    layoutParams.setMarginStart(i65.a.b(linerLayout.getContext(), i19));
                }
                linerLayout.addView(imageView);
                imageView.setLayoutParams(layoutParams);
            }
        }
        return arrayList;
    }
}
