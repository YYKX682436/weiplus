package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.k f147243a;

    /* renamed from: b, reason: collision with root package name */
    public iq0.c f147244b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f147245c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f147246d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f147247e = new android.os.Handler(android.os.Looper.getMainLooper());

    public void a(int i17, h10.b bVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("virtualViewId", i17);
            jSONObject.put("action", bVar.f359510d);
            d("dispatchSemanticsAction", jSONObject);
        } catch (org.json.JSONException e17) {
            io.p3284xd2ae381c.Log.e("AccessibilityChannel", "dispatchSemanticsAction error", e17);
        }
    }

    public void b(int i17, h10.b bVar, java.lang.Object obj) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("virtualViewId", i17);
            jSONObject.put("action", bVar.f359510d);
            if (obj != null) {
                jSONObject.put("args", obj);
            }
            d("dispatchSemanticsAction", jSONObject);
        } catch (org.json.JSONException e17) {
            io.p3284xd2ae381c.Log.e("AccessibilityChannel", "dispatchSemanticsAction error", e17);
        }
    }

    public void c() {
        io.p3284xd2ae381c.Log.i("AccessibilityChannel", "on attachFlutter with biz handler: " + this.f147244b);
        if (this.f147244b != null) {
            if (this.f147245c) {
                d("onAccessibilityEnabled", null);
            } else {
                d("onAccessibilityDisabled", null);
            }
            int i17 = this.f147246d;
            this.f147246d = i17;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("accessibilityFeatureFlags", i17);
                d("setAccessibilityFeatures", jSONObject);
            } catch (org.json.JSONException e17) {
                io.p3284xd2ae381c.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
            }
        }
    }

    public final void d(java.lang.String str, org.json.JSONObject jSONObject) {
        iq0.c cVar = this.f147244b;
        if (cVar == null) {
            io.p3284xd2ae381c.Log.w("AccessibilityChannel", str + " magicCardStarterHandle is null");
            return;
        }
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        if (tVar == null) {
            io.p3284xd2ae381c.Log.w("AccessibilityChannel", str + " service is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.f77491x8758c4e1, str);
        if (jSONObject != null) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
        }
        java.lang.String obj = new lc3.a0(hashMap).toString();
        io.p3284xd2ae381c.Log.i("AccessibilityChannel", "invoke " + str + ", params = " + obj);
        ((nq0.p) tVar).Ui(cVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d("accessibilityEvent", obj));
    }
}
