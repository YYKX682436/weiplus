package e53;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e53.e f331165a = new e53.e();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f331166b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f331167c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f331168d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f331169e;

    /* renamed from: f, reason: collision with root package name */
    public static long f331170f;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f331167c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$liteAppDestroyListener$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3) {
                    return false;
                }
                java.lang.Long l17 = riVar.f89353d;
                long j17 = e53.e.f331170f;
                if (l17 == null || l17.longValue() != j17) {
                    return false;
                }
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = e53.e.f331166b;
                if (abstractC20980x9b9ad01d != null) {
                    abstractC20980x9b9ad01d.mo48814x2efc64();
                }
                ((java.util.LinkedList) e53.e.f331169e).clear();
                mo48814x2efc64();
                return false;
            }
        };
        f331168d = new java.util.HashMap();
        f331169e = new java.util.LinkedList();
    }

    public static final void b(int i17, java.lang.String str, long j17) {
        java.lang.Long j18;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePageTimeReport", "gamelog.report, 27743 ,  error url isNullOrEmpty");
            return;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        long longValue = (queryParameter == null || (j18 = r26.h0.j(queryParameter)) == null) ? 0L : j18.longValue();
        java.lang.String str2 = (java.lang.String) f331168d.get(str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("a8keyScene", j17);
            if (!(str2 == null || str2.length() == 0)) {
                jSONObject.put("ext", str2);
            }
        } catch (org.json.JSONException unused) {
        }
        f331165a.a(i17, 0L, longValue, str, nj0.a.d(jSONObject.toString()));
    }

    public final void a(int i17, long j17, long j18, java.lang.String str, java.lang.String str2) {
        java.lang.String string = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.b().getString("session_id", "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6634xf5c4cb47 c6634xf5c4cb47 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6634xf5c4cb47();
        c6634xf5c4cb47.f139888d = i17;
        c6634xf5c4cb47.f139889e = j17;
        c6634xf5c4cb47.f139890f = c6634xf5c4cb47.b("session_id", string, true);
        c6634xf5c4cb47.f139891g = j18;
        c6634xf5c4cb47.f139893i = currentTimeMillis;
        c6634xf5c4cb47.f139894j = c6634xf5c4cb47.b("URL", str, true);
        c6634xf5c4cb47.f139895k = c6634xf5c4cb47.b("extern_info", str2, true);
        c6634xf5c4cb47.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, null, report, scene:%d, stayTimeSec:%d, sessionId:%s, ssid:%s, client_timestamp:%d, url:%s, extInfo:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), string, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), str, str2);
    }
}
