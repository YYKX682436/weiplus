package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.k f65710a;

    /* renamed from: b, reason: collision with root package name */
    public iq0.c f65711b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65712c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f65713d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f65714e = new android.os.Handler(android.os.Looper.getMainLooper());

    public void a(int i17, h10.b bVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("virtualViewId", i17);
            jSONObject.put("action", bVar.f277977d);
            d("dispatchSemanticsAction", jSONObject);
        } catch (org.json.JSONException e17) {
            io.flutter.Log.e("AccessibilityChannel", "dispatchSemanticsAction error", e17);
        }
    }

    public void b(int i17, h10.b bVar, java.lang.Object obj) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("virtualViewId", i17);
            jSONObject.put("action", bVar.f277977d);
            if (obj != null) {
                jSONObject.put("args", obj);
            }
            d("dispatchSemanticsAction", jSONObject);
        } catch (org.json.JSONException e17) {
            io.flutter.Log.e("AccessibilityChannel", "dispatchSemanticsAction error", e17);
        }
    }

    public void c() {
        io.flutter.Log.i("AccessibilityChannel", "on attachFlutter with biz handler: " + this.f65711b);
        if (this.f65711b != null) {
            if (this.f65712c) {
                d("onAccessibilityEnabled", null);
            } else {
                d("onAccessibilityDisabled", null);
            }
            int i17 = this.f65713d;
            this.f65713d = i17;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("accessibilityFeatureFlags", i17);
                d("setAccessibilityFeatures", jSONObject);
            } catch (org.json.JSONException e17) {
                io.flutter.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
            }
        }
    }

    public final void d(java.lang.String str, org.json.JSONObject jSONObject) {
        iq0.c cVar = this.f65711b;
        if (cVar == null) {
            io.flutter.Log.w("AccessibilityChannel", str + " magicCardStarterHandle is null");
            return;
        }
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        if (tVar == null) {
            io.flutter.Log.w("AccessibilityChannel", str + " service is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.METHOD, str);
        if (jSONObject != null) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
        }
        java.lang.String obj = new lc3.a0(hashMap).toString();
        io.flutter.Log.i("AccessibilityChannel", "invoke " + str + ", params = " + obj);
        ((nq0.p) tVar).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("accessibilityEvent", obj));
    }
}
