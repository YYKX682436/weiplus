package w44;

/* loaded from: classes4.dex */
public abstract class d implements p64.a, p64.b {

    /* renamed from: d, reason: collision with root package name */
    public w44.b f524430d;

    public static /* synthetic */ org.json.JSONObject h(w44.d dVar, java.lang.String str, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeParamInvalidError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeParamInvalidError");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeParamInvalidError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            throw unsupportedOperationException;
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        org.json.JSONObject g17 = dVar.g(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeParamInvalidError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return g17;
    }

    public static /* synthetic */ org.json.JSONObject k(w44.d dVar, int i17, java.lang.String str, org.json.JSONObject jSONObject, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeReturnError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeReturnError");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeReturnError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            throw unsupportedOperationException;
        }
        if ((i18 & 4) != 0) {
            jSONObject = null;
        }
        org.json.JSONObject j17 = dVar.j(i17, str, jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeReturnError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return j17;
    }

    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        try {
            android.os.Bundle o17 = o(bVar, bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            return o17;
        } catch (java.lang.Throwable unused) {
            if (bVar != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("error", -1);
                ((r64.b) bVar).e(bundle2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            return null;
        }
    }

    public final void b(org.json.JSONObject obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("backToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        try {
            if (this.f524430d != null) {
                w44.b d17 = d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
                yz5.l lVar = d17.f524427d;
                if (lVar != null) {
                    lVar.mo146xb9724478(obj);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("backToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }

    public abstract void c(w44.b bVar, org.json.JSONObject jSONObject);

    public final w44.b d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        w44.b bVar = this.f524430d;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            return bVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("apiEnv");
        throw null;
    }

    public final void e(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        this.f524430d = env;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        try {
            c(env, data);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Simple", "there is some exception in js " + th6.getMessage() + '!');
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            org.json.JSONObject k17 = k(this, 609999, "fail:there is some exception", null, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            b(k17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }

    public final boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRunInMainProcess", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRunInMainProcess", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return n17;
    }

    public final org.json.JSONObject g(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeParamInvalidError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        org.json.JSONObject k17 = k(this, 6, "fail:param invalid", null, 4, null);
        if (msg.length() > 0) {
            k17.put("errMsg", msg);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeParamInvalidError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return k17;
    }

    public final android.os.Bundle i(android.os.Bundle p17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeRemoteCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        o64.a aVar = new o64.a();
        aVar.c(this);
        aVar.d(this);
        q64.a a17 = aVar.a();
        android.os.Bundle c17 = a17 != null ? ((r64.b) a17).c(p17) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeRemoteCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return c17;
    }

    public final org.json.JSONObject j(int i17, java.lang.String msg, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeReturnError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (jSONObject != null) {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", msg);
        } else {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", msg);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeReturnError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return jSONObject;
    }

    public final org.json.JSONObject l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", 0);
        jSONObject.put("errMsg", "ok");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return jSONObject;
    }

    public final org.json.JSONObject m(org.json.JSONObject obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        obj.put("errCode", 0);
        obj.put("errMsg", "ok");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return obj;
    }

    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }

    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return null;
    }

    @Override // p64.a
    /* renamed from: onCallbackFromServer */
    public void mo69375xe57d25f1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        try {
            n(bundle);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            org.json.JSONObject k17 = k(this, 609999, "fail:there is some exception", null, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            b(k17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }
}
