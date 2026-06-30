package qx4;

/* loaded from: classes8.dex */
public final class d0 extends av4.q {

    /* renamed from: m, reason: collision with root package name */
    public static final qx4.g f448925m = new qx4.g(null);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f448926n = jz5.h.b(qx4.f.f448938d);

    /* renamed from: c, reason: collision with root package name */
    public final nw4.n f448927c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f448928d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f448929e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f448930f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f448931g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f448932h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f448933i;

    /* renamed from: j, reason: collision with root package name */
    public qx4.c f448934j;

    /* renamed from: k, reason: collision with root package name */
    public qx4.d f448935k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Double f448936l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(qx4.b uiComponent, nw4.n jsApiHandler) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandler, "jsApiHandler");
        this.f448927c = jsApiHandler;
        this.f448932h = jz5.h.b(qx4.n.f448965d);
        this.f448933i = "onDeviceMotionFired";
        ((java.util.HashMap) ((jz5.n) f448926n).mo141623x754a37bb()).put(java.lang.Integer.valueOf(hashCode()), new java.lang.ref.WeakReference(this));
    }

    public static final void h(java.lang.String str, qx4.d0 d0Var) {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("func");
            java.lang.String optString2 = jSONObject.optString("callbackId");
            if (optString2 == null) {
                optString2 = "";
            }
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            d0Var.f448927c.f422422c = d0Var.k();
            d0Var.f448927c.c(nw4.z2.c(optString, optString3, optString2), qx4.j.f448946a);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "commonJsApiProcess exception e:" + m143898xd4a2fc34);
        }
    }

    @Override // av4.q
    public boolean b(int i17, java.lang.String feature, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feature, "feature");
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(feature, "clearSearchBarFocus") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(feature, "WebSearchJSApiGetSearchData")) && i18 <= 0;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: callLiteAppConnectEvent */
    public final java.lang.String m161043x621c4ac5(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "callLiteAppConnectEvent: " + str);
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("err_msg", "params is null");
                java.lang.String jSONObject = f17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            new java.lang.ref.WeakReference(this);
            av4.j jVar = this.f95859a;
            if (jVar != null && (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) != null) {
                ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).wi(jSONObject2, new java.lang.ref.WeakReference(mo9090x86b9ebe3));
            }
            java.lang.String jSONObject3 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "callLiteAppConnectEvent exp:" + e17);
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: clearSearchBarFocus */
    public final java.lang.String m161044xa04415fa(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "clearSearchBarFocus: " + str);
        pm0.v.X(new qx4.h(this));
        java.lang.String jSONObject = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: commonJsApiProcess */
    public final void m161045xa3de22a9(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "commonJsApiProcess: " + str);
        if (str == null || str.length() == 0) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            h(str, this);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qx4.i(str, this));
        }
    }

    @Override // av4.q
    public boolean d() {
        return com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: Exception -> 0x009f, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x001d, B:6:0x0027, B:8:0x003e, B:11:0x0044, B:19:0x0050, B:23:0x0051, B:24:0x0093, B:26:0x005c, B:28:0x0065, B:31:0x006b, B:39:0x0077, B:40:0x0078, B:42:0x0089, B:43:0x008e, B:49:0x0011, B:46:0x000a, B:33:0x006c, B:34:0x0073, B:13:0x0045, B:14:0x004c), top: B:45:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001d A[Catch: Exception -> 0x009f, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x001d, B:6:0x0027, B:8:0x003e, B:11:0x0044, B:19:0x0050, B:23:0x0051, B:24:0x0093, B:26:0x005c, B:28:0x0065, B:31:0x006b, B:39:0x0077, B:40:0x0078, B:42:0x0089, B:43:0x008e, B:49:0x0011, B:46:0x000a, B:33:0x006c, B:34:0x0073, B:13:0x0045, B:14:0x004c), top: B:45:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e A[Catch: Exception -> 0x009f, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x001d, B:6:0x0027, B:8:0x003e, B:11:0x0044, B:19:0x0050, B:23:0x0051, B:24:0x0093, B:26:0x005c, B:28:0x0065, B:31:0x006b, B:39:0x0077, B:40:0x0078, B:42:0x0089, B:43:0x008e, B:49:0x0011, B:46:0x000a, B:33:0x006c, B:34:0x0073, B:13:0x0045, B:14:0x004c), top: B:45:0x000a, inners: #0, #2, #3 }] */
    @android.webkit.JavascriptInterface
    /* renamed from: deviceMotionMonitor */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m161046xca1e2a0e(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "deviceMotionMonitor = "
            java.lang.String r1 = "toString(...)"
            java.lang.String r2 = "MicroMsg.WebSearch.WebSearchJSApi"
            r3 = 0
            if (r7 == 0) goto L1a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r7 = move-exception
            java.lang.String r4 = "deviceMotionMonitor err"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r4, r7)     // Catch: java.lang.Exception -> L9f
        L1a:
            r4 = r3
        L1b:
            if (r4 == 0) goto L26
            java.lang.String r7 = "action"
            java.lang.String r5 = ""
            java.lang.String r7 = r4.optString(r7, r5)     // Catch: java.lang.Exception -> L9f
            goto L27
        L26:
            r7 = r3
        L27:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r4.<init>(r0)     // Catch: java.lang.Exception -> L9f
            r4.append(r7)     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = "activate"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L5c
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.f266074e     // Catch: java.lang.Exception -> L9f
            if (r7 != 0) goto L51
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.fts.n5> r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.class
            monitor-enter(r7)     // Catch: java.lang.Exception -> L9f
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r0 = new com.tencent.mm.plugin.webview.ui.tools.fts.n5     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.f266074e = r0     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Exception -> L9f
        L51:
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.f266074e     // Catch: java.lang.Exception -> L9f
            qx4.l r0 = new qx4.l     // Catch: java.lang.Exception -> L9f
            r0.<init>(r6)     // Catch: java.lang.Exception -> L9f
            r7.a(r0)     // Catch: java.lang.Exception -> L9f
            goto L93
        L5c:
            java.lang.String r0 = "terminate"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Exception -> L9f
            if (r7 == 0) goto L93
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.f266074e     // Catch: java.lang.Exception -> L9f
            if (r7 != 0) goto L78
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.fts.n5> r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.class
            monitor-enter(r7)     // Catch: java.lang.Exception -> L9f
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r0 = new com.tencent.mm.plugin.webview.ui.tools.fts.n5     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.f266074e = r0     // Catch: java.lang.Throwable -> L75
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            goto L78
        L75:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Exception -> L9f
        L78:
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5.f266074e     // Catch: java.lang.Exception -> L9f
            r7.getClass()     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = "WebSearchShakeCheckingManager"
            java.lang.String r2 = "stopCheck"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> L9f
            q35.d r0 = r7.f266075a     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L8e
            r0.b()     // Catch: java.lang.Exception -> L9f
            r7.f266075a = r3     // Catch: java.lang.Exception -> L9f
        L8e:
            r0 = 0
            r7.f266078d = r0     // Catch: java.lang.Exception -> L9f
            r7.f266077c = r0     // Catch: java.lang.Exception -> L9f
        L93:
            org.json.JSONObject r7 = r6.g()     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L9f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)     // Catch: java.lang.Exception -> L9f
            return r7
        L9f:
            org.json.JSONObject r7 = r6.f()
            java.lang.String r7 = r7.toString()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.d0.m161046xca1e2a0e(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: dispatchLiteAppAction */
    public final java.lang.String m161047x1976dc4f(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "dispatchLiteAppAction: " + str);
            ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).Di(new org.json.JSONObject(str), new qx4.m(new java.lang.ref.WeakReference(this)));
            java.lang.String jSONObject = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "dispatchLiteAppAction exp:" + e17);
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: disposeUniformReddot */
    public final java.lang.String m161048x40cf9a0d(java.lang.String str) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray optJSONArray;
        java.lang.String optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, reqData: " + str);
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApi", e17, "disposeUniformReddot", new java.lang.Object[0]);
                java.lang.String jSONObject2 = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
        } else {
            jSONObject = null;
        }
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        if (jSONObject != null && (optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) != null) {
            nk6.N(optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, disposePath: ".concat(optString));
        }
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
            org.json.JSONArray jSONArray = optJSONArray.length() > 0 ? optJSONArray : null;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString2 = jSONArray.optString(i17);
                    if (optString2 != null) {
                        nk6.N(optString2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, disposePath: " + optString2);
                    }
                }
            }
        }
        org.json.JSONObject g17 = g();
        g17.putOpt("retCode", "0");
        java.lang.String jSONObject3 = g17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, result: " + jSONObject3);
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchUniformReddot */
    public final java.lang.String m161049x67bccd52(java.lang.String str) {
        java.lang.String optString;
        java.util.Iterator<java.lang.String> keys;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddot, reqData: " + str);
        if (str != null) {
            try {
                optString = new org.json.JSONObject(str).optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApi", e17, "fetchUniformReddot", new java.lang.Object[0]);
                java.lang.String jSONObject = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
        } else {
            optString = null;
        }
        org.json.JSONObject mo126745xcc31ba03 = optString != null ? i(optString).mo126745xcc31ba03() : null;
        org.json.JSONObject g17 = g();
        g17.putOpt("retCode", "0");
        if (mo126745xcc31ba03 != null && (keys = mo126745xcc31ba03.keys()) != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                g17.putOpt(next, mo126745xcc31ba03.opt(next));
            }
        }
        java.lang.String jSONObject2 = g17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddot, result: " + jSONObject2);
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: fetchUniformReddotList */
    public final java.lang.String m161050x7735f910(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddotList, reqData: " + str);
        try {
            u83.b bVar = new u83.b();
            if (str != null && (optJSONArray = new org.json.JSONObject(str).optJSONArray("pathList")) != null) {
                if (!(optJSONArray.length() > 0)) {
                    optJSONArray = null;
                }
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = optJSONArray.optString(i17);
                        if (optString != null) {
                            bVar.j().add(i(optString));
                        }
                    }
                }
            }
            org.json.JSONObject mo126745xcc31ba03 = bVar.mo126745xcc31ba03();
            org.json.JSONObject g17 = g();
            g17.putOpt("retCode", "0");
            java.util.Iterator<java.lang.String> keys = mo126745xcc31ba03.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                g17.putOpt(next, mo126745xcc31ba03.opt(next));
            }
            java.lang.String jSONObject = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddotList, result: " + jSONObject);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApi", e17, "fetchUniformReddotList", new java.lang.Object[0]);
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getContactMatchUserList */
    public final java.lang.String m161051xca0a5824(java.lang.String str) {
        try {
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("err", "params is null");
                java.lang.String jSONObject = f17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject2.optString("query");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() == 0) {
                org.json.JSONObject f18 = f();
                f18.put("err", "query is empty");
                java.lang.String jSONObject3 = f18.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            java.util.List a17 = ((sg0.h2) ((su4.d1) ((jz5.n) this.f448932h).mo141623x754a37bb())).a(optString, jSONObject2.optLong("timeout", 2000L), jSONObject2.optInt("limit", Integer.MAX_VALUE));
            org.json.JSONObject g17 = g();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                jSONArray.put(((su4.r0) it.next()).a());
            }
            g17.put("matchUserList", jSONArray);
            java.lang.String jSONObject4 = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "getContactMatchUserList err:" + e17);
            java.lang.String jSONObject5 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getNewLifeContact */
    public final java.lang.String m161052xba3900ba(java.lang.String str) {
        java.lang.String jSONObject = g().put(dm.i4.f66875xa013b0d5, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSearchData */
    public final java.lang.String m161053xc3e06d68(java.lang.String str) {
        try {
            java.util.Map e17 = d75.b.e(new org.json.JSONObject(str), qx4.o.f448966d);
            ((java.util.HashMap) e17).put("webview_instance_id", java.lang.Integer.valueOf(hashCode()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Di()).d(e17);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getTeachSearchData */
    public final java.lang.String m161054xdb011d91(java.lang.String str) {
        try {
            java.util.Map e17 = d75.b.e(new org.json.JSONObject(str), qx4.p.f448968d);
            ((java.util.HashMap) e17).put("webview_instance_id", java.lang.Integer.valueOf(hashCode()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Di()).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).aj().f(e17);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: handleCircleToSearchAction */
    public final java.lang.String m161055x9e4c4f51(java.lang.String str) {
        java.lang.String jSONObject;
        java.lang.String str2 = "";
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            qx4.b l17 = l();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B = l17 != null ? l17.B() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = B instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) B : null;
            boolean z17 = false;
            int i17 = abstractActivityC19367xd1ae8c74 != null ? abstractActivityC19367xd1ae8c74.f265799x4 : 0;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5265x4081b1be c5265x4081b1be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5265x4081b1be();
            am.y2 y2Var = c5265x4081b1be.f135593h;
            am.x2 x2Var = c5265x4081b1be.f135592g;
            x2Var.f89871a = i17;
            x2Var.f89872b = jSONObject2.optString("action", "");
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONObject != null && (jSONObject = optJSONObject.toString()) != null) {
                str2 = jSONObject;
            }
            x2Var.f89873c = str2;
            c5265x4081b1be.e();
            org.json.JSONObject g17 = g();
            java.lang.String str3 = y2Var.f89955a;
            if (str3 != null) {
                if (str3.length() > 0) {
                    z17 = true;
                }
            }
            if (z17) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(y2Var.f89955a);
                java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    g17.put(next, jSONObject3.get(next));
                }
            }
            java.lang.String jSONObject4 = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject5 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: handleVideoAction */
    public final void m161056x3e7c4749(java.lang.String str) {
        android.content.Context k17 = k();
        nw4.n nVar = this.f448927c;
        nVar.f422422c = k17;
        nVar.c(nw4.z2.c("handleVideoAction", str, ""), qx4.q.f448970a);
    }

    public final u83.c i(java.lang.String str) {
        r45.f03 I0;
        u83.c cVar = new u83.c();
        cVar.j(str);
        cVar.l(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return cVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
        u83.a j17 = (L0 == null || (I0 = L0.I0(str)) == null) ? null : j(str, L0, I0, L0.K.size());
        if (j17 == null) {
            return cVar;
        }
        cVar.l(true);
        cVar.k(j17);
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0002, B:7:0x000e, B:10:0x0025, B:13:0x002d, B:15:0x003b, B:17:0x0042, B:20:0x004c, B:22:0x005d, B:28:0x006b, B:29:0x0073, B:31:0x0079, B:34:0x0087, B:37:0x0091), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u83.a j(java.lang.String r8, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r9, r45.f03 r10, int r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            u83.a r2 = new u83.a     // Catch: java.lang.Exception -> L9a
            r2.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f455425i     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = ""
            if (r3 != 0) goto Le
            r3 = r4
        Le:
            r2.p(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r9.f65880x11c19d58     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = "field_tipsId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)     // Catch: java.lang.Exception -> L9a
            r2.s(r3)     // Catch: java.lang.Exception -> L9a
            int r3 = r10.f455420d     // Catch: java.lang.Exception -> L9a
            r2.q(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f455422f     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L25
            r3 = r4
        L25:
            r2.t(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f455423g     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L2d
            r3 = r4
        L2d:
            r2.n(r3)     // Catch: java.lang.Exception -> L9a
            int r10 = r10.f455421e     // Catch: java.lang.Exception -> L9a
            r2.o(r10)     // Catch: java.lang.Exception -> L9a
            r45.ez2 r10 = r9.D0()     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto L47
            r3 = 4
            com.tencent.mm.protobuf.g r10 = r10.m75934xbce7f2f(r3)     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto L47
            java.lang.String r10 = r10.i()     // Catch: java.lang.Exception -> L9a
            goto L48
        L47:
            r10 = r0
        L48:
            if (r10 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r10
        L4c:
            r2.l(r4)     // Catch: java.lang.Exception -> L9a
            r45.xs2 r10 = r9.N     // Catch: java.lang.Exception -> L9a
            r3 = 9
            int r10 = r10.m75939xb282bd08(r3)     // Catch: java.lang.Exception -> L9a
            r2.r(r10)     // Catch: java.lang.Exception -> L9a
            r10 = 1
            if (r8 == 0) goto L66
            int r3 = r8.length()     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L64
            goto L66
        L64:
            r3 = r1
            goto L67
        L66:
            r3 = r10
        L67:
            if (r3 != 0) goto L99
            if (r11 <= 0) goto L99
            java.util.List r3 = r9.L0()     // Catch: java.lang.Exception -> L9a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L9a
        L73:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L9a
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L9a
            r45.f03 r4 = (r45.f03) r4     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = r4.f455426m     // Catch: java.lang.Exception -> L9a
            boolean r5 = r8.equals(r5)     // Catch: java.lang.Exception -> L9a
            if (r5 == 0) goto L73
            java.lang.String r5 = r4.f455425i     // Catch: java.lang.Exception -> L9a
            int r6 = r11 + (-1)
            u83.a r4 = r7.j(r5, r9, r4, r6)     // Catch: java.lang.Exception -> L9a
            if (r4 == 0) goto L73
            java.util.LinkedList r5 = r2.j()     // Catch: java.lang.Exception -> L9a
            r5.add(r4)     // Catch: java.lang.Exception -> L9a
            goto L73
        L99:
            return r2
        L9a:
            r8 = move-exception
            java.lang.String r9 = "createRedDotDetail"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "MicroMsg.WebSearch.WebSearchJSApi"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r11, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.d0.j(java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, int):u83.a");
    }

    public final android.content.Context k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        av4.j jVar = this.f95859a;
        if (jVar == null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context m81400x569210f3 = (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) ? null : mo9090x86b9ebe3.m81400x569210f3();
        return m81400x569210f3 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : m81400x569210f3;
    }

    public final qx4.b l() {
        av4.j jVar = this.f95859a;
        if (jVar instanceof qx4.b) {
            return (qx4.b) jVar;
        }
        return null;
    }

    public final void m(java.lang.String funcName, org.json.JSONObject params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        pm0.v.X(new qx4.r(this, funcName, params));
    }

    public final void n(java.util.Map initParamsObj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initParamsObj, "initParamsObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onUIInitJsApi ");
        this.f448931g = initParamsObj;
        if (this.f448928d) {
            org.json.JSONObject g17 = g();
            for (java.util.Map.Entry entry : initParamsObj.entrySet()) {
                g17.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            av4.j jVar = this.f95859a;
            if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
                return;
            }
            java.lang.String jSONObject = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onUiInit", jSONObject);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onUiInit", "onUiInit", jSONObject}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
    }

    public final void o(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onUniformReddotDataChanged, path: ".concat(path));
        try {
            java.lang.String jSONObject = i(path).mo126745xcc31ba03().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onUniformReddotDataChanged, result: ".concat(jSONObject));
            pm0.v.X(new qx4.s(this, "onUniformReddotDataChanged", jSONObject));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApi", e17, "onUniformReddotDataChanged", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: observeUniformReddot */
    public final java.lang.String m161057xd0167230(java.lang.String str) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray optJSONArray;
        p012xc85e97e9.p093xedfae76a.j0 Di;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "observeUniformReddot, reqData: " + str);
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApi", e17, "observeUniformReddot", new java.lang.Object[0]);
                java.lang.String jSONObject2 = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
            if (!(optJSONArray.length() > 0)) {
                optJSONArray = null;
            }
            if (optJSONArray != null) {
                zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
                qx4.b l17 = l();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B = l17 != null ? l17.B() : null;
                if (B != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = optJSONArray.optString(i17);
                        if (optString != null && (Di = ((c61.t8) caVar).Di(optString)) != null) {
                            Di.mo7806x9d92d11c(B, new qx4.t(this, optString));
                        }
                    }
                }
            }
        }
        org.json.JSONObject g17 = g();
        g17.putOpt("retCode", "0");
        java.lang.String jSONObject3 = g17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "observeUniformReddot, result: " + jSONObject3);
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onMoreClickInFlutter */
    public final void m161058x81ee7183(java.lang.String str) {
        qx4.c cVar = this.f448934j;
        if (cVar != null) {
            ((ch0.i0) cVar).f122760a.e("onMoreClickInFlutter", str);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onWebViewSizeChanged */
    public final void m161059xf5c115d9(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        if (this.f448934j == null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : null;
                this.f448936l = jSONObject != null ? java.lang.Double.valueOf(jSONObject.optDouble("height")) : null;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "onWebViewSizeChanged exception e:" + m143898xd4a2fc34);
            }
        }
        qx4.c cVar = this.f448934j;
        if (cVar != null) {
            ((ch0.i0) cVar).f122760a.e("onWebViewSizeChanged", str);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openTransparentWeApp */
    public java.lang.String m161060x6a02a4ab(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "openTransparentWeApp: " + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = jSONObject.optString("userName");
        b1Var.f398555f = jSONObject.optString("relativeURL");
        b1Var.f398565k = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        b1Var.f398549c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(jSONObject.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE).f163727d;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ni()) {
            b1Var.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
        java.lang.String jSONObject2 = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final void p(qx4.d dVar) {
        if (dVar == null) {
            this.f448935k = null;
        } else {
            this.f448935k = new qx4.y(dVar, this);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: preloadFinderFeed */
    public java.lang.String m161061x947561cd(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        int optInt;
        long j17;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            optJSONArray = jSONObject.optJSONArray("items");
            optInt = jSONObject.optInt("batchLoadScene", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApi", e17, "", new java.lang.Object[0]);
        }
        if (optJSONArray == null) {
            java.lang.String jSONObject2 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = optJSONArray.length();
        if (length > 20) {
            length = 20;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "preloadFinderFeed %s", str);
        for (int i17 = 0; i17 < length; i17++) {
            r45.rv0 rv0Var = new r45.rv0();
            java.lang.Object obj = optJSONArray.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            org.json.JSONObject jSONObject3 = (org.json.JSONObject) obj;
            java.lang.String string = jSONObject3.getString("feedId");
            if (string != null) {
                if (!(string.length() == 0)) {
                    j17 = new java.math.BigInteger(string).longValue();
                    rv0Var.set(0, java.lang.Long.valueOf(j17));
                    rv0Var.set(1, jSONObject3.getString("encryptId"));
                    rv0Var.set(2, jSONObject3.getString("nonceId"));
                    linkedList.add(rv0Var);
                }
            }
            j17 = 0;
            rv0Var.set(0, java.lang.Long.valueOf(j17));
            rv0Var.set(1, jSONObject3.getString("encryptId"));
            rv0Var.set(2, jSONObject3.getString("nonceId"));
            linkedList.add(rv0Var);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, optInt);
        java.lang.String jSONObject4 = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        return jSONObject4;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: preloadSearchWebView */
    public final void m161062x5dee4dc8(java.lang.String str) {
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).ij();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: querySearchWeb */
    public final java.lang.String m161063x63db94a4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "querySearchWeb: " + str);
        try {
            java.util.Map e17 = d75.b.e(new org.json.JSONObject(str), qx4.x.f449003d);
            ((java.util.HashMap) e17).put("webview_instance_id", java.lang.Integer.valueOf(hashCode()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ri()).a(e17);
            java.lang.String jSONObject = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "querySearchWeb exp:" + e18);
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: registerNativeEventMonitor */
    public final java.lang.String m161064x2e5b831a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "registerNativeEventMonitor " + str);
        qx4.b l17 = l();
        if (l17 != null) {
            l17.l1();
        }
        java.lang.String jSONObject = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportSearchStatistics */
    public final void m161065xc28bb23f(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "js call reportSearchStatistics failed, params is null");
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Ri()).m(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.i.b(new org.json.JSONObject(str)));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "reportSearchStatistics exception: " + m143898xd4a2fc34);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setPreGetParams */
    public final void m161066x44f95e9b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new qx4.z(str), "MicroMsg.WebSearch.WebSearchJSApi");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setSearchInputWordInFlutter */
    public final void m161067x1f24f5ed(java.lang.String str) {
        qx4.c cVar = this.f448934j;
        if (cVar != null) {
            ((ch0.i0) cVar).f122760a.e("onSetSearchInputWordInFlutter", str);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: showWebViewKeyboard */
    public final java.lang.String m161068x1da24263(java.lang.String str) {
        try {
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("errMsg", "params is null");
                java.lang.String jSONObject = f17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            java.lang.String optString = new org.json.JSONObject(str).optString("action");
            qx4.b l17 = l();
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3 = l17 != null ? l17.mo9090x86b9ebe3() : null;
            qx4.b l18 = l();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B = l18 != null ? l18.B() : null;
            if (mo9090x86b9ebe3 == null) {
                org.json.JSONObject f18 = f();
                f18.put("errMsg", "webview not founded");
                java.lang.String jSONObject2 = f18.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            if (B == null) {
                org.json.JSONObject f19 = f();
                f19.put("errMsg", "activity not founded");
                java.lang.String jSONObject3 = f19.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            if (optString != null) {
                switch (optString.hashCode()) {
                    case 3027047:
                        if (!optString.equals("blur")) {
                            break;
                        } else {
                            mo9090x86b9ebe3.clearFocus();
                            break;
                        }
                    case 3202370:
                        if (!optString.equals("hide")) {
                            break;
                        } else {
                            B.mo48674x36654fab();
                            break;
                        }
                    case 3529469:
                        if (!optString.equals("show")) {
                            break;
                        } else {
                            java.lang.Object systemService = B.getSystemService("input_method");
                            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.toggleSoftInput(0, 2);
                                break;
                            }
                        }
                        break;
                    case 97604824:
                        if (!optString.equals("focus")) {
                            break;
                        } else {
                            mo9090x86b9ebe3.requestFocus();
                            break;
                        }
                }
            }
            java.lang.String jSONObject4 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "showWebViewKeyboard err:" + e17);
            java.lang.String jSONObject5 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: startWebSearch */
    public final java.lang.String m161069xa60977da(java.lang.String str) {
        try {
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("errMsg", "params is null");
                java.lang.String jSONObject = f17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Zi(k(), new org.json.JSONObject(str));
            java.lang.String jSONObject2 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "startWebSearch err:" + e17);
            java.lang.String jSONObject3 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: takeScreenshot */
    public final java.lang.String m161070xb9ed94d(java.lang.String str) {
        try {
            if (str == null) {
                str = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            qx4.b l17 = l();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B = l17 != null ? l17.B() : null;
            if (B != null && (B instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19394xda4dcfbc)) {
                pm0.v.X(new qx4.b0(B, jSONObject, weakReference));
                java.lang.String jSONObject2 = g().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.c1.f35167x24728b, new org.json.JSONObject());
            java.lang.String jSONObject3 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.c1.f35167x24728b, new org.json.JSONObject());
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: toggleFullScreen */
    public final java.lang.String m161071x4721e64f(java.lang.String str) {
        if (!com.p314xaae8f345.p3210x3857dc.a3.k(2023)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "toggleFullScreen fail:xwebsdk ver required");
            java.lang.String jSONObject = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        qx4.b l17 = l();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B = l17 != null ? l17.B() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = B instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) B : null;
        if (abstractActivityC19367xd1ae8c74 == null) {
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "toggleFullScreen: " + str);
            abstractActivityC19367xd1ae8c74.fa(-1.0f, 1.0f, new org.json.JSONObject(str).optInt("duration"), false);
            java.lang.String jSONObject3 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "toggleFullScreen exp:" + e17);
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: updateHalfScreen */
    public final java.lang.String m161072x9945a828(java.lang.String str) {
        qx4.b l17 = l();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B = l17 != null ? l17.B() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = B instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) B : null;
        if (abstractActivityC19367xd1ae8c74 == null) {
            java.lang.String jSONObject = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "updateHalfScreen: " + str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            float optDouble = (float) jSONObject2.optDouble("height", 0.0d);
            float optDouble2 = (float) jSONObject2.optDouble("heightRatio", 0.0d);
            int optInt = jSONObject2.optInt("duration");
            boolean optBoolean = jSONObject2.optBoolean("draggableUpward", false);
            if (optDouble2 <= 0.0f && optDouble > 0.0f) {
                optDouble2 = -1.0f;
            }
            if (optDouble2 > 0.0f || optDouble > 0.0f) {
                if (optDouble <= 0.0f) {
                    optDouble = -1.0f;
                }
                if (optDouble2 <= 0.0f) {
                    optDouble2 = -1.0f;
                } else if (optDouble2 > 1.0f) {
                    optDouble2 = 1.0f;
                }
                abstractActivityC19367xd1ae8c74.fa(optDouble, optDouble2, optInt, optBoolean);
            }
            if (jSONObject2.has("draggableUpward") && abstractActivityC19367xd1ae8c74.f265799x4 != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f c6006xc073954f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6006xc073954f();
                int i17 = abstractActivityC19367xd1ae8c74.f265799x4;
                am.bu buVar = c6006xc073954f.f136300g;
                buVar.f87818a = i17;
                buVar.f87821d = -1.0f;
                buVar.f87819b = -1.0f;
                buVar.f87820c = 0.0f;
                buVar.f87822e = optBoolean;
                c6006xc073954f.e();
            }
            java.lang.String jSONObject3 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "updateHalfScreen exp:" + e17);
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: webViewUIReady */
    public final java.lang.String m161073x1b210d36(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "webViewUIReady " + str);
        this.f448928d = true;
        qx4.b l17 = l();
        if (l17 != null) {
            l17.Y1();
        }
        java.util.Map map = this.f448931g;
        if (map != null) {
            n(map);
        }
        java.lang.String jSONObject = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: webViewUIReadyInFlutter */
    public final java.lang.String m161074x3c672ea1(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "webViewUIReadyInFlutter has ready, isWebViewUIReadyInFlutter: " + this.f448929e);
        if (this.f448929e) {
            java.lang.String jSONObject = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new qx4.c0(this));
        java.lang.String jSONObject2 = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
