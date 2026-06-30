package vg0;

/* loaded from: classes8.dex */
public final class k implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517991a;

    /* renamed from: b, reason: collision with root package name */
    public long f517992b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f517993c;

    public k(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517991a = callbackRef;
        this.f517993c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.me.f34458x24728b;
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("jsonParams") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "{}";
        }
        if (c01.id.c() - this.f517992b < 1500) {
            callback.a(kz5.b1.e(new jz5.l("ret", -1)));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchApiHandlers", "startWebSearch %s", str);
            this.f517992b = c01.id.c();
            su4.j2 j2Var = new su4.j2();
            j2Var.f494494x = java.net.URLDecoder.decode(jSONObject.optString("extParams", ""), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            j2Var.f494495y = jSONObject.optString("extReqParams", "");
            tg0.q1 q1Var = (tg0.q1) this.f517991a.get();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = q1Var != null ? ((rx4.e) q1Var).f482667a : null;
            j2Var.f494471a = activityC0065xcd7aa112;
            if (activityC0065xcd7aa112 == null) {
                j2Var.f494471a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            j2Var.f494472b = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            j2Var.f494474d = jSONObject.optString("query", "");
            j2Var.f494473c = jSONObject.optInt("type", 0);
            j2Var.f494475e = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            j2Var.f494476f = jSONObject.optBoolean("isHomePage", false);
            boolean z17 = true;
            j2Var.f494478h = true;
            j2Var.f494479i = false;
            int optInt = jSONObject.optInt("ftsNeedHideKeyBoard", 0);
            if (optInt == 1 || optInt == 2) {
                if (optInt != 1) {
                    z17 = false;
                }
                j2Var.A = z17;
            }
            j2Var.f494491u = false;
            j2Var.f494485o = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            j2Var.f494486p = false;
            j2Var.f494496z = jSONObject.optString("searchPlaceHolder", "");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            callback.a(kz5.b1.e(new jz5.l("ret", 0)));
        } catch (java.lang.Exception unused) {
            callback.a(kz5.b1.e(new jz5.l("ret", -1)));
        }
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517993c;
    }
}
