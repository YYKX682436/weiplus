package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w4 f264015d;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w4 w4Var, android.graphics.Bitmap bitmap) {
        this.f264015d = w4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w4 w4Var = this.f264015d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y4 y4Var = w4Var.f264033b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 z4Var = y4Var.f264059c;
        final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = z4Var.f264072e;
        final java.lang.String str = w4Var.f264032a;
        final org.json.JSONObject jSONObject = y4Var.f264057a;
        final android.content.Context context = z4Var.f264073f;
        final java.lang.String str2 = y4Var.f264058b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.v4$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
            public final void a(boolean z17, java.lang.String str3, int i17) {
                java.lang.String str4 = str;
                android.content.Context context2 = context;
                java.lang.String str5 = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v4 v4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v4.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var2 = q5Var;
                if (!z17) {
                    v4Var.getClass();
                    q5Var2.a("cancel", null);
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20, 2001, 2, 56, 0, str5);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w4 w4Var2 = v4Var.f264015d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w4Var2.f264033b.f264059c.f264074g.f263894f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "get filepath fail");
                    q5Var2.a("get filepath fail", null);
                    return;
                }
                ((dk5.s5) tg3.t1.a()).Ui(str3, str4);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tailInfo");
                ((dk5.s5) tg3.t1.a()).aj(context2, str4, w4Var2.f264033b.f264059c.f264074g.f263894f, 0, "", "", null, null, optJSONObject != null ? new com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256(optJSONObject.optString("url", ""), 1) : null);
                q5Var2.a(null, null);
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20, 2001, 2, 48, 0, str5);
            }
        };
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(w4Var.f264033b.f264059c.f264074g.f263894f);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        android.content.Context context2 = w4Var.f264033b.f264059c.f264073f;
        java.lang.String str3 = w4Var.f264032a;
        n13.t a17 = n13.t.a(jVar);
        a17.f415671f.f415672a = 3;
        ((dk5.y) a0Var).wi(context2, aVar, str3, a17);
    }
}
