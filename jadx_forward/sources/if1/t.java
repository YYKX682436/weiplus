package if1;

/* loaded from: classes7.dex */
public abstract class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.view.View view, org.json.JSONObject jSONObject) {
        boolean z17;
        if (view == 0 || jSONObject == null) {
            return;
        }
        int a17 = ik1.w.a(jSONObject.optString("bgColor"));
        int a18 = ik1.w.a(jSONObject.optString("borderColor"));
        float h17 = ik1.w.h(jSONObject, "borderWidth", 0.0f);
        float h18 = ik1.w.h(jSONObject, "borderRadius", 0.0f);
        float[] fArr = new float[4];
        float[] fArr2 = null;
        if (jSONObject.has("borderRadius")) {
            try {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("borderRadius");
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        float f17 = (float) jSONArray.getDouble(i17);
                        if (i17 >= 4) {
                            break;
                        }
                        fArr[i17] = ik1.w.f() * f17;
                    }
                } else {
                    fArr = null;
                }
                fArr2 = fArr;
            } catch (java.lang.Exception unused) {
            }
        }
        boolean z18 = true;
        if (view instanceof if1.u) {
            if1.u uVar = (if1.u) view;
            uVar.mo50852xa5089f5c(a17);
            uVar.mo50853x9b5140d5(a18);
            uVar.mo50854xe7a68960(h18);
            uVar.mo50856x9c683f38(h17);
            uVar.mo50855xe7a68960(fArr2);
            z17 = true;
        } else {
            z17 = false;
        }
        try {
            float f18 = (float) jSONObject.getDouble("opacity");
            if (f18 >= 0.0f && f18 <= 1.0f) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(f18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/view/ViewStyleApplier", "apply", "(Landroid/view/View;Lorg/json/JSONObject;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/view/ViewStyleApplier", "apply", "(Landroid/view/View;Lorg/json/JSONObject;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                z17 = true;
            }
        } catch (org.json.JSONException unused2) {
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("padding");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            view.setPadding(ik1.w.i(optJSONArray, 3), ik1.w.i(optJSONArray, 0), ik1.w.i(optJSONArray, 1), ik1.w.i(optJSONArray, 2));
        }
        float optDouble = (float) jSONObject.optDouble(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, 0.0d);
        float optDouble2 = (float) jSONObject.optDouble("scaleX", 1.0d);
        float optDouble3 = (float) jSONObject.optDouble("scaleY", 1.0d);
        if (jSONObject.has(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2)) {
            view.setRotation(optDouble);
            z17 = true;
        }
        if (jSONObject.has("scaleX")) {
            view.setScaleX(optDouble2);
            z17 = true;
        }
        if (jSONObject.has("scaleY")) {
            view.setScaleY(optDouble3);
        } else {
            z18 = z17;
        }
        if (z18) {
            view.invalidate();
        }
    }
}
