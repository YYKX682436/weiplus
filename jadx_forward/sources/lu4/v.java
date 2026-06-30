package lu4;

/* loaded from: classes7.dex */
public final class v extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lu4.w context) {
        super("wxPrefetcherClient", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getId */
    public final java.lang.String m146369x5db1b11() {
        return ((lu4.w) this.f402963b).mo54383x5db1b11();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getUserHash */
    public final int m146370x6bf280ef() {
        return java.lang.Math.abs((gm0.m.i() + '-' + wo.w0.g(true)).hashCode() % 10000);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: request */
    public final void m146371x414ef28f(java.lang.String requestUrl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestUrl, "requestUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (str == null) {
            str = "GET";
        }
        h0Var.f391656d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str4 = next;
                    java.lang.String optString = jSONObject.optString(str4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    hashMap.put(str4, optString);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f402964c, "", e17);
        }
        ((ku5.t0) ku5.t0.f394148d).h(new lu4.u(h0Var, requestUrl, hashMap, str3, this, callback), "WxPrefetcherRequest");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setMinBizPkgVersion */
    public final void m146372x6d31de2f(int i17) {
        ((lu4.w) this.f402963b).m(i17);
    }
}
