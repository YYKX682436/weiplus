package xq1;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final wq1.d f537561a;

    public f(wq1.d dVar) {
        this.f537561a = dVar;
    }

    public void a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "onDataReady %s %s %s", str, java.lang.Integer.valueOf(i17), str2);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("ret", i17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str3);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new xq1.e(this, jSONObject));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: closePage */
    public void m175766xe33bf8a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "closePage");
        this.f537561a.dismiss();
    }

    @android.webkit.JavascriptInterface
    public void log(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "[%s][%s]", jSONObject.optString(ya.b.f77487x44fa364, ""), jSONObject.optString("msg", ""));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openWeAppPage */
    public void m175767x114daa78(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "openWeAppPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("userName", "");
            java.lang.String optString2 = jSONObject.optString("relativeURL", "");
            java.lang.String optString3 = jSONObject.optString("sceneNote", "");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = optString;
            nxVar.f89000b = optString2;
            nxVar.f89002d = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
            nxVar.f89003e = optString3;
            c6113xa3727625.e();
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportKV */
    public void m175768xe68be19f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "reportKV %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(jSONObject.optInt("logid", 0), jSONObject.optString("msg", ""));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: request */
    public void m175769x414ef28f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "request %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f537561a.o().a(jSONObject.optString("requestId", ""), jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, ""));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: webviewUIReady */
    public void m175770xb7b76556() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebViewJSApi", "webviewUIReady");
        ((ku5.t0) ku5.t0.f394148d).B(new xq1.d(this));
    }
}
