package aw4;

/* loaded from: classes8.dex */
public abstract class l extends av4.q {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f96428d;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f96429c;

    static {
        new aw4.c(null);
        f96428d = jz5.h.b(aw4.b.f96381d);
    }

    public l(aw4.q qVar) {
        super(qVar);
        this.f96429c = new aw4.k(this);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: addMinimizeTask */
    public java.lang.String m9175x5f055484(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAddMinimizeTaskJSAPI", "addToStar: handleMsg");
        aw4.q i17 = i();
        android.graphics.Bitmap bitmap = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3 = i17 != null ? i17.mo9090x86b9ebe3() : null;
        android.app.Activity activity = (android.app.Activity) (i17 != null ? i17.H() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo9090x86b9ebe3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAddMinimizeTaskJSAPI", "addToStar: handleMsg");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            zv4.g gVar = zv4.h.f557994a;
            android.graphics.RectF e17 = gVar.e(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("coverImgSnapshot", false);
            float f17 = activity.getResources().getDisplayMetrics().density;
            android.graphics.RectF rectF = new android.graphics.RectF(e17);
            rectF.top *= f17;
            rectF.left *= f17;
            rectF.right *= f17;
            rectF.bottom *= f17;
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            if (optBoolean) {
                android.graphics.Bitmap f18 = mo9090x86b9ebe3.f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
                bitmap = gVar.d(f18, rect);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewAddMinimizeTaskJSAPI", "dl: onScreenshotCaptured, bitmap %s", bitmap);
            gVar.a(activity, jSONObject, gVar.c(e17, mo9090x86b9ebe3), bitmap);
            return g().toString();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WebViewAddMinimizeTaskJSAPI", e18, "addToStar: exception", new java.lang.Object[0]);
            throw e18;
        }
    }

    @Override // av4.q
    public boolean d() {
        return com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getCurrentUsername */
    public java.lang.String m9176x5adcf339(java.lang.String str) {
        if (!gm0.j1.a()) {
            return f().put("error", "not login").toString();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ret", 0);
        jSONObject.put(dm.i4.f66875xa013b0d5, c01.z1.r());
        return jSONObject.toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getFinderItemDetail */
    public java.lang.String m9177xc5fee980(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        org.json.JSONObject jSONObject;
        aw4.q i17 = i();
        android.content.Context H = i17 != null ? i17.H() : null;
        if (str != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(str));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            jSONObject = (org.json.JSONObject) m143895xf1229813;
        } else {
            jSONObject = null;
        }
        if (H == null || jSONObject == null) {
            return f().toString();
        }
        if (!(H instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a)) {
            return f().toString();
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = ((um3.b) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) H).a(um3.b.class)).O6();
        v65.i.b(O6, null, new aw4.f(H, jSONObject, O6, this, null), 1, null);
        return g().toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getFinderLivePreviewMicCover */
    public final java.lang.String m9178x8c1ee250(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        android.content.Context H;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewMicCover " + jSONObject);
            java.lang.String optString = jSONObject.optString("encryptedId");
            java.lang.String str2 = optString == null ? "" : optString;
            java.lang.String optString2 = jSONObject.optString("nonceId");
            java.lang.String str3 = optString2 == null ? "" : optString2;
            java.lang.String optString3 = jSONObject.optString("requestId");
            jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            aw4.q i17 = i();
            r45.qt2 wi6 = (i17 == null || (H = i17.H()) == null) ? null : ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(H);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            aw4.q i18 = i();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).sk(str2, str3, i18 != null ? i18.H() : null, new aw4.g(optString3, this), wi6);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewMicCover ex:" + e17.getMessage());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("ret", -1);
            jSONObject2.putOpt("err_msg", "Invalid input parameters:" + e17.getMessage());
            jSONObject2.putOpt("requestId", "");
            aw4.q i19 = i();
            if (i19 != null && (mo9090x86b9ebe3 = i19.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject3 = jSONObject2.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onGetFinderLivePreviewMicCover", jSONObject3);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onGetFinderLivePreviewMicCover", "onGetFinderLivePreviewMicCover", jSONObject3}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            return g().toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013e  */
    @android.webkit.JavascriptInterface
    /* renamed from: getFinderLivePreviewUrl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m9179xee7d90cf(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.l.m9179xee7d90cf(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getNetworkType */
    public java.lang.String m9180x662add52(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getNetworkType %s", str);
        try {
            org.json.JSONObject g17 = g();
            java.lang.String j17 = j();
            g17.put("subtype", j17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j17, "wifi")) {
                g17.put("err_msg", "network_type:wifi");
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j17, "fail")) {
                g17.put("err_msg", "network_type:fail");
            } else {
                g17.put("err_msg", "network_type:wwan");
            }
            return g17.toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSearchDisplayNameList */
    public java.lang.String mo9181x4dbc1c2d(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(new org.json.JSONObject(str).optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String str2 = "";
                java.lang.String string = jSONObject.has(dm.i4.f66865x76d1ec5a) ? jSONObject.getString(dm.i4.f66865x76d1ec5a) : "";
                if (jSONObject.has("userName")) {
                    str2 = jSONObject.getString("userName");
                }
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(str2);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(dm.i4.f66865x76d1ec5a, string);
                jSONObject2.put("userName", str2);
                jSONObject2.put("displayName", e17);
                jSONObject2.put("displaySex", n17.I);
                jSONArray2.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("ret", 0);
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray2.toString());
            return jSONObject3.toString();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e18, "getSearchDisplayNameList", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public boolean h(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", "doProfile fail, username is null");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 174);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        aw4.q i17 = i();
        j45.l.j(i17 != null ? i17.H() : null, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        return true;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: hideVKB */
    public final java.lang.String m9182x36654fab(java.lang.String str) {
        aw4.q i17 = i();
        if (i17 != null) {
            i17.mo9205x36654fab();
        }
        java.lang.String jSONObject = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final aw4.q i() {
        av4.j jVar = this.f95859a;
        if (jVar instanceof aw4.q) {
            return (aw4.q) jVar;
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: isMinimizeTaskEnabled */
    public java.lang.String m9183xf04416f4(java.lang.String str) {
        java.lang.String jSONObject = g().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? 1 : 0).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewIsMinimizeTaskEnabledJSAPI", "addToStar: handleMsg -> %s", jSONObject);
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: isTaskMinimized */
    public java.lang.String m9184x24993477(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (!jSONObject.has("bizName") || !jSONObject.has("bizKey")) {
            return f().toString();
        }
        java.lang.String optString = jSONObject.optString("bizName");
        int i17 = (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "k1kVideo") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, ya.a.f77450x918d59a8)) ? 30 : 27;
        java.lang.String optString2 = jSONObject.optString("bizKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = optString2;
        c16601x7ed0e40c.f66793x2262335f = i17;
        java.lang.String jSONObject2 = g().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Ri(c16601x7ed0e40c) ? 1 : 0).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewIsTaskMinimizedJSAPI", "isTaskMinimized: handleMsg(%s) -> %s", str, jSONObject2);
        return jSONObject2;
    }

    public java.lang.String j() {
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wifi" : su4.r2.k() ? "wangka" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "5g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "4g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "2g" : !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "fail" : "";
    }

    public int k() {
        return 1;
    }

    public final void l(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        aw4.q i17 = i();
        if (i17 == null || (mo9090x86b9ebe3 = i17.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject = (z17 ? g() : f()).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onOpenLiteApp", jSONObject);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onOpenLiteApp", "onOpenLiteApp", jSONObject}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String log(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "log: %s", str);
        return g().toString();
    }

    public final java.lang.String m(int i17, java.lang.String errMsg, java.lang.String json, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("retCode", i17);
            jSONObject.put("errMsg", errMsg);
            jSONObject.put("json", json);
            if (str == null) {
                str = "";
            }
            jSONObject.put("requestId", str);
            aw4.q i18 = i();
            if (i18 != null && (mo9090x86b9ebe3 = i18.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchWebQueryReady", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchWebQueryReady", "onSearchWebQueryReady", jSONObject2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openFinderFeed */
    public java.lang.String m9185xe7707cce(java.lang.String str) {
        android.content.Context context;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openFinderFeed %s", str);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("feedId", jSONObject.optString("feedId", ""));
            jSONObject2.put("extInfo", new org.json.JSONObject(jSONObject.optString("extInfo", "")));
            android.content.Intent intent = new android.content.Intent();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(7, 2, 25, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            aw4.q i17 = i();
            if (i17 == null || (context = i17.H()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            e1Var.B(context, jSONObject3, intent);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "openFinderFeed", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openFinderProfile */
    public java.lang.String m9186x3086479(java.lang.String str) {
        android.content.Context context;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openFinderProfile %s", str);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("userName", "");
            int optInt = jSONObject.optInt("commentScene", 0);
            java.lang.String optString2 = jSONObject.optString("reportExtraInfo", "");
            if (optInt == 0) {
                optInt = 7;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            intent.putExtra("report_scene", 15);
            intent.putExtra("key_enter_profile_type", 1);
            intent.putExtra("key_extra_info", optString2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(optInt, 2, 32, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            aw4.q i17 = i();
            if (i17 == null || (context = i17.H()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            e1Var.w(context, intent);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b, new java.lang.Object[0]);
            return f().toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* renamed from: openFinderSearchView */
    public java.lang.String m9187x506739d(java.lang.String str) {
        org.json.JSONObject jSONObject;
        aw4.q i17 = i();
        android.content.Context H = i17 != null ? i17.H() : null;
        if (str != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                jSONObject = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(str));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                jSONObject = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            r1 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(jSONObject) ? null : jSONObject;
        }
        return (H == null || r1 == null) ? f().toString() : ((py2.i) ((zy2.wb) i95.n0.c(zy2.wb.class))).wi(H, r1) ? g().toString() : f().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* renamed from: openFinderTimeLineView */
    public java.lang.String m9188x2cd445d6(java.lang.String str) {
        org.json.JSONObject jSONObject;
        aw4.q i17 = i();
        android.content.Context H = i17 != null ? i17.H() : null;
        if (str != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                jSONObject = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(str));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                jSONObject = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            r1 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(jSONObject) ? null : jSONObject;
        }
        return (H == null || r1 == null) ? f().toString() : ((py2.i) ((zy2.wb) i95.n0.c(zy2.wb.class))).Ai(H, r1) ? g().toString() : f().toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openFinderView */
    public java.lang.String m9189xe777d1d5(java.lang.String str) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openFinderView params=" + str);
        if (str == null) {
            return f().toString();
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("extInfo", new org.json.JSONObject(jSONObject.optString("extInfo", "")));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            aw4.q i17 = i();
            if (i17 == null || (context = i17.H()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.Context context2 = context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            zy2.ta.d(e1Var, context2, jSONObject2.toString(), null, this.f96429c, 4, null);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "openFinderView", new java.lang.Object[0]);
            return f().toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6 A[Catch: JSONException -> 0x019d, Exception -> 0x02ad, TryCatch #4 {JSONException -> 0x019d, blocks: (B:15:0x0099, B:18:0x00a0, B:19:0x00a3, B:22:0x00af, B:25:0x00c0, B:27:0x00d0, B:29:0x00d5, B:30:0x00df, B:32:0x00e5, B:33:0x00f1, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:39:0x0109, B:41:0x010f, B:42:0x011f, B:44:0x0127, B:46:0x012d, B:47:0x0131, B:49:0x0139, B:51:0x013f, B:52:0x0141, B:54:0x0149, B:56:0x014f, B:57:0x0151, B:59:0x0159, B:60:0x015f, B:63:0x0169, B:65:0x017b, B:68:0x01a4, B:70:0x01b2, B:72:0x01be, B:73:0x01da, B:78:0x01e6, B:79:0x01ea, B:84:0x01f0, B:86:0x01f8, B:87:0x0200, B:89:0x020d, B:90:0x0212, B:102:0x01c9, B:104:0x01d1, B:105:0x01d6), top: B:14:0x0099, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[Catch: JSONException -> 0x019d, Exception -> 0x02ad, TRY_LEAVE, TryCatch #4 {JSONException -> 0x019d, blocks: (B:15:0x0099, B:18:0x00a0, B:19:0x00a3, B:22:0x00af, B:25:0x00c0, B:27:0x00d0, B:29:0x00d5, B:30:0x00df, B:32:0x00e5, B:33:0x00f1, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:39:0x0109, B:41:0x010f, B:42:0x011f, B:44:0x0127, B:46:0x012d, B:47:0x0131, B:49:0x0139, B:51:0x013f, B:52:0x0141, B:54:0x0149, B:56:0x014f, B:57:0x0151, B:59:0x0159, B:60:0x015f, B:63:0x0169, B:65:0x017b, B:68:0x01a4, B:70:0x01b2, B:72:0x01be, B:73:0x01da, B:78:0x01e6, B:79:0x01ea, B:84:0x01f0, B:86:0x01f8, B:87:0x0200, B:89:0x020d, B:90:0x0212, B:102:0x01c9, B:104:0x01d1, B:105:0x01d6), top: B:14:0x0099, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2 A[Catch: JSONException -> 0x019d, Exception -> 0x02ad, TryCatch #4 {JSONException -> 0x019d, blocks: (B:15:0x0099, B:18:0x00a0, B:19:0x00a3, B:22:0x00af, B:25:0x00c0, B:27:0x00d0, B:29:0x00d5, B:30:0x00df, B:32:0x00e5, B:33:0x00f1, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:39:0x0109, B:41:0x010f, B:42:0x011f, B:44:0x0127, B:46:0x012d, B:47:0x0131, B:49:0x0139, B:51:0x013f, B:52:0x0141, B:54:0x0149, B:56:0x014f, B:57:0x0151, B:59:0x0159, B:60:0x015f, B:63:0x0169, B:65:0x017b, B:68:0x01a4, B:70:0x01b2, B:72:0x01be, B:73:0x01da, B:78:0x01e6, B:79:0x01ea, B:84:0x01f0, B:86:0x01f8, B:87:0x0200, B:89:0x020d, B:90:0x0212, B:102:0x01c9, B:104:0x01d1, B:105:0x01d6), top: B:14:0x0099, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f8 A[Catch: JSONException -> 0x019d, Exception -> 0x02ad, TryCatch #4 {JSONException -> 0x019d, blocks: (B:15:0x0099, B:18:0x00a0, B:19:0x00a3, B:22:0x00af, B:25:0x00c0, B:27:0x00d0, B:29:0x00d5, B:30:0x00df, B:32:0x00e5, B:33:0x00f1, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:39:0x0109, B:41:0x010f, B:42:0x011f, B:44:0x0127, B:46:0x012d, B:47:0x0131, B:49:0x0139, B:51:0x013f, B:52:0x0141, B:54:0x0149, B:56:0x014f, B:57:0x0151, B:59:0x0159, B:60:0x015f, B:63:0x0169, B:65:0x017b, B:68:0x01a4, B:70:0x01b2, B:72:0x01be, B:73:0x01da, B:78:0x01e6, B:79:0x01ea, B:84:0x01f0, B:86:0x01f8, B:87:0x0200, B:89:0x020d, B:90:0x0212, B:102:0x01c9, B:104:0x01d1, B:105:0x01d6), top: B:14:0x0099, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020d A[Catch: JSONException -> 0x019d, Exception -> 0x02ad, TryCatch #4 {JSONException -> 0x019d, blocks: (B:15:0x0099, B:18:0x00a0, B:19:0x00a3, B:22:0x00af, B:25:0x00c0, B:27:0x00d0, B:29:0x00d5, B:30:0x00df, B:32:0x00e5, B:33:0x00f1, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:39:0x0109, B:41:0x010f, B:42:0x011f, B:44:0x0127, B:46:0x012d, B:47:0x0131, B:49:0x0139, B:51:0x013f, B:52:0x0141, B:54:0x0149, B:56:0x014f, B:57:0x0151, B:59:0x0159, B:60:0x015f, B:63:0x0169, B:65:0x017b, B:68:0x01a4, B:70:0x01b2, B:72:0x01be, B:73:0x01da, B:78:0x01e6, B:79:0x01ea, B:84:0x01f0, B:86:0x01f8, B:87:0x0200, B:89:0x020d, B:90:0x0212, B:102:0x01c9, B:104:0x01d1, B:105:0x01d6), top: B:14:0x0099, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278 A[Catch: Exception -> 0x02ad, TryCatch #2 {Exception -> 0x02ad, blocks: (B:3:0x0038, B:8:0x0065, B:11:0x006c, B:13:0x0071, B:15:0x0099, B:19:0x00a3, B:22:0x00af, B:27:0x00d0, B:30:0x00df, B:32:0x00e5, B:33:0x00f1, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:39:0x0109, B:41:0x010f, B:42:0x011f, B:44:0x0127, B:46:0x012d, B:47:0x0131, B:49:0x0139, B:51:0x013f, B:52:0x0141, B:54:0x0149, B:56:0x014f, B:57:0x0151, B:59:0x0159, B:60:0x015f, B:63:0x0169, B:65:0x017b, B:68:0x01a4, B:70:0x01b2, B:72:0x01be, B:73:0x01da, B:79:0x01ea, B:84:0x01f0, B:86:0x01f8, B:87:0x0200, B:89:0x020d, B:90:0x0212, B:91:0x0216, B:94:0x0234, B:96:0x0278, B:98:0x0280, B:100:0x027e, B:102:0x01c9, B:104:0x01d1, B:105:0x01d6, B:117:0x02a1, B:122:0x0083), top: B:2:0x0038 }] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @android.webkit.JavascriptInterface
    /* renamed from: openLiteApp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9190xff2414e9(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.l.m9190xff2414e9(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openMusicPage */
    public java.lang.String m9191xd02972a(java.lang.String str) {
        try {
            aw4.n0.f96434a.a(new org.json.JSONObject(str), true);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: playMusic */
    public java.lang.String m9192x8f1a5351(java.lang.String str) {
        try {
            aw4.n0.f96434a.a(new org.json.JSONObject(str), false);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: preloadFinderFeed */
    public java.lang.String m9193x947561cd(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        int optInt;
        long j17;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            optJSONArray = jSONObject.optJSONArray("items");
            optInt = jSONObject.optInt("batchLoadScene", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "", new java.lang.Object[0]);
        }
        if (optJSONArray == null) {
            return g().toString();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = optJSONArray.length();
        if (length > 20) {
            length = 20;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "preloadFinderFeed %s", str);
        for (int i17 = 0; i17 < length; i17++) {
            r45.rv0 rv0Var = new r45.rv0();
            java.lang.Object obj = optJSONArray.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
            java.lang.String string = jSONObject2.getString("feedId");
            if (string != null) {
                if (!(string.length() == 0)) {
                    j17 = new java.math.BigInteger(string).longValue();
                    rv0Var.set(0, java.lang.Long.valueOf(j17));
                    rv0Var.set(1, jSONObject2.getString("encryptId"));
                    rv0Var.set(2, jSONObject2.getString("nonceId"));
                    linkedList.add(rv0Var);
                }
            }
            j17 = 0;
            rv0Var.set(0, java.lang.Long.valueOf(j17));
            rv0Var.set(1, jSONObject2.getString("encryptId"));
            rv0Var.set(2, jSONObject2.getString("nonceId"));
            linkedList.add(rv0Var);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, optInt);
        return g().toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: profile */
    public java.lang.String m9194xed8e89a9(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "profile %s", str);
            return h(new org.json.JSONObject(str).optString(dm.i4.f66875xa013b0d5, "")) ? g().toString() : f().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b, new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: querySearchWeb */
    public java.lang.String m9195x63db94a4(java.lang.String str) {
        aw4.a c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "querySearchWeb " + str);
        if (str == null) {
            return f().toString();
        }
        aw4.q i17 = i();
        if (i17 != null && (c17 = i17.c()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            gm0.j1.d().g(new su4.s1(jSONObject.optString("requestId", ""), jSONObject.optString("commReq", ""), c17.a()));
        }
        return g().toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: removeMinimizeTask */
    public java.lang.String m9196x803717e7(java.lang.String str) {
        android.content.Context context;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (!jSONObject.has("bizName") || !jSONObject.has("bizKey")) {
            return f().toString();
        }
        java.lang.String optString = jSONObject.optString("bizName");
        zv4.g gVar = zv4.h.f557994a;
        int b17 = gVar.b(optString);
        java.lang.String optString2 = jSONObject.optString("bizKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        aw4.q i17 = i();
        if (i17 == null || (context = i17.H()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        gVar.f(b17, optString2, context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewRemoveMinimizeTaskJSAPI", "removeMinimizeTask: handleMsg(%s)", str);
        return g().toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportIDKey */
    public java.lang.String m9197xf0018e90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportIDKey %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jx3.f.INSTANCE.mo68477x336bdfd8(jSONObject.optInt(dm.i4.f66865x76d1ec5a, 0), jSONObject.optInt("key", 0), jSONObject.optInt("value", 0), false);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "reportIdKey", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportKV */
    public final java.lang.String m9198xe68be19f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportKV %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(jSONObject.optInt("logid"), jSONObject.optString("msg", ""));
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "reportIdKey", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportSearchRealTimeStatistics */
    public final java.lang.String m9199xc87ba22a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportSearchRealTimeStatistics %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            r45.lq5 lq5Var = new r45.lq5();
            lq5Var.f461289t = jSONObject.optString("logString", "");
            if (k() == 1) {
                gm0.j1.d().g(new su4.a2(lq5Var));
            } else {
                gm0.j1.d().g(new su4.u1(lq5Var));
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "reportSearchRealTimeStatistics", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportSearchStatistics */
    public java.lang.String m9200xc28bb23f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportSearchStatistics %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(jSONObject.optInt("logId", 0), jSONObject.optString("logString", ""));
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "reportSearchStatistics", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: showNewLifeSwitch */
    public java.lang.String m9201xebeafb13(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "showNewLifeSwitch %s", str);
            new org.json.JSONObject(str);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "showNewLifeSwitch", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: showVKB */
    public final java.lang.String m9202x7b383410(java.lang.String str) {
        aw4.q i17 = i();
        if (i17 != null) {
            i17.mo9206x7b383410();
        }
        java.lang.String jSONObject = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: vibrateShort */
    public void m9203x2e072c4d(java.lang.String str) {
        aw4.n0.f96434a.f(str);
    }
}
