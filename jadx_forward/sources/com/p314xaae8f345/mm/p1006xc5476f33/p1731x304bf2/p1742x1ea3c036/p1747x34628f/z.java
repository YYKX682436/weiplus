package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 f221491b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 f221492c;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var) {
        this.f221492c = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0, com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        org.json.JSONObject optJSONObject;
        sx4.d0 c17;
        vz4.x xVar = this.f221492c.P;
        if (xVar != null) {
            xVar.f(consoleMessage);
        }
        java.lang.String message = consoleMessage != null ? consoleMessage.message() : "";
        if (message.contains("luggage_err") || message.contains("luggageBridge is not defined")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "luggage bridge error");
            this.f221492c.f221404l1.P = message;
        } else if (message.startsWith("WXGAMEPERF:")) {
            if (message.contains("first-contentful-paint")) {
                try {
                    sx4.d0.f(this.f221492c.U, (long) new org.json.JSONObject(message.replaceFirst("WXGAMEPERF:", "").trim()).optDouble("startTime", 0.0d));
                } catch (org.json.JSONException | java.lang.Exception unused) {
                }
            } else if (message.contains("timing") && (optJSONObject = new org.json.JSONObject(message.replaceFirst("WXGAMEPERF:", "").trim()).optJSONObject("timing")) != null && (c17 = sx4.d0.c(this.f221492c.U)) != null) {
                c17.f495126l = optJSONObject.optLong("domainLookupEnd") - optJSONObject.optLong("domainLookupStart");
                c17.f495127m = optJSONObject.optLong("connectEnd") - optJSONObject.optLong("connectStart");
                c17.f495128n = optJSONObject.optLong("responseEnd") - optJSONObject.optLong("requestStart");
                c17.f495129o = optJSONObject.optLong("domInteractive") - optJSONObject.optLong("domLoading");
                c17.f495131q = optJSONObject.optLong("domContentLoadedEventEnd") - optJSONObject.optLong("responseEnd");
                c17.f495132r = optJSONObject.optLong("domComplete") - optJSONObject.optLong("responseEnd");
                c17.f495133s = optJSONObject.optLong("navigationStart");
            }
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.y(this, message));
        }
        return super.b(consoleMessage);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuggageGameWebChromeClientProxy", "onPermissionRequest");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = this.f221492c;
        android.app.Activity a17 = q75.a.a(b0Var.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebCoreImpl", "onPermissionRequest NULL activity");
        } else {
            this.f221491b.h(permissionRequest, a17, b0Var.mo120156xb5887639());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0, com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onReceivedTitle, title = %s", str);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.d(str)) {
            this.f221492c.R = str;
        }
        super.o(c27816xac2547f9, str);
    }
}
