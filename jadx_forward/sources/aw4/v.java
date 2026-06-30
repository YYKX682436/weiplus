package aw4;

/* loaded from: classes.dex */
public abstract class v extends aw4.a implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96441e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f96442f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f96443g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19225x22a06004 f96444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.websearch.webview.WebSearchImageData$ftsEmojiDownloadedListener$1] */
    public v(aw4.o uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f96441e = "MicroMsg.WebSearch.WebSearchImageData";
        this.f96442f = new java.util.HashMap();
        this.f96443g = new java.util.HashMap();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r07 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372>(a0Var) { // from class: com.tencent.mm.plugin.websearch.webview.WebSearchImageData$ftsEmojiDownloadedListener$1
            {
                this.f39173x3fe91575 = 1327212386;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 c5417xb0026372) {
                aw4.w b17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 event = c5417xb0026372;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                aw4.v vVar = aw4.v.this;
                am.n9 n9Var = event.f135764g;
                if (n9Var.f88939a == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f96441e, "emoji download callback %s", n9Var.f88945g);
                    if (vVar.f96442f.containsKey(event.f135764g.f88945g)) {
                        synchronized (vVar.f96442f) {
                            java.util.HashSet hashSet = (java.util.HashSet) vVar.f96442f.get(event.f135764g.f88945g);
                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashSet);
                            java.util.Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                java.lang.String str = (java.lang.String) it.next();
                                java.lang.String str2 = "weixin://fts/emoji?path=" + event.f135765h.f89051a;
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put(dm.i4.f66865x76d1ec5a, str);
                                    jSONObject.put("src", str2);
                                } catch (org.json.JSONException unused) {
                                }
                                jSONArray.put(jSONObject);
                            }
                            aw4.o b18 = vVar.b();
                            if (b18 != null && (b17 = b18.b()) != null) {
                                java.lang.String jSONArray2 = jSONArray.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
                                b17.n(0, jSONArray2);
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f96444h = r07;
        r07.mo48813x58998cd();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().add(this);
    }

    public final aw4.o b() {
        aw4.q qVar = this.f96377d;
        if (qVar instanceof aw4.o) {
            return (aw4.o) qVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (((java.util.HashSet) r6.put(r13, r1)) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
    
        if (((java.util.HashSet) r6.put(r13, r1)) == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0168 A[Catch: Exception -> 0x01a3, TryCatch #0 {Exception -> 0x01a3, blocks: (B:3:0x0012, B:5:0x0024, B:14:0x0063, B:16:0x007d, B:18:0x0168, B:20:0x017a, B:22:0x0095, B:24:0x00a4, B:26:0x00bd, B:27:0x00af, B:29:0x00d1, B:31:0x0111, B:32:0x0128, B:34:0x0137, B:36:0x0150, B:37:0x0142, B:40:0x0182, B:42:0x0188, B:44:0x018e, B:46:0x0194), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.v.c(java.lang.String):void");
    }

    public final void d(int i17, java.lang.String data) {
        aw4.o b17;
        aw4.w b18;
        java.util.HashSet hashSet;
        aw4.w b19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (i17 != 1) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(data);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.String string = jSONObject.getString(dm.i4.f66865x76d1ec5a);
                java.lang.String string2 = jSONObject.getString("imageUrl");
                jSONObject2.put(dm.i4.f66865x76d1ec5a, string);
                jSONObject2.put("src", string2);
                jSONArray2.put(jSONObject2);
            }
            aw4.o b27 = b();
            if (b27 == null || (b19 = b27.b()) == null) {
                return;
            }
            java.lang.String jSONArray3 = jSONArray2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray3, "toString(...)");
            b19.n(0, jSONArray3);
            return;
        }
        try {
            org.json.JSONArray jSONArray4 = new org.json.JSONArray(data);
            org.json.JSONArray jSONArray5 = new org.json.JSONArray();
            java.lang.String str = null;
            for (int i19 = 0; i19 < jSONArray4.length(); i19++) {
                org.json.JSONObject jSONObject3 = jSONArray4.getJSONObject(i19);
                int optInt = jSONObject3.optInt("emojiType");
                java.lang.String optString = jSONObject3.optString(dm.i4.f66865x76d1ec5a);
                if (optInt == 2) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 c5417xb0026372 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372();
                    am.n9 n9Var = c5417xb0026372.f135764g;
                    n9Var.f88939a = 3;
                    n9Var.f88945g = jSONObject3.optString("md5");
                    c5417xb0026372.f135764g.f88940b = jSONObject3.optString("designerId");
                    c5417xb0026372.f135764g.f88943e = jSONObject3.optString("aesKey");
                    c5417xb0026372.f135764g.f88944f = jSONObject3.optString("encryptUrl");
                    c5417xb0026372.f135764g.f88946h = jSONObject3.optString("productID");
                    c5417xb0026372.f135764g.f88942d = jSONObject3.optString("express");
                    c5417xb0026372.f135764g.f88941c = jSONObject3.optString("imageUrl");
                    c5417xb0026372.e();
                    if (com.p314xaae8f345.mm.vfs.w6.j(c5417xb0026372.f135765h.f89051a)) {
                        str = "weixin://fts/emoji?path=" + c5417xb0026372.f135765h.f89051a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96441e, "path=%s", c5417xb0026372.f135765h.f89051a);
                    } else {
                        synchronized (this.f96442f) {
                            if (this.f96442f.containsKey(c5417xb0026372.f135764g.f88945g)) {
                                hashSet = (java.util.HashSet) this.f96442f.get(c5417xb0026372.f135764g.f88945g);
                                if (hashSet == null) {
                                    hashSet = new java.util.HashSet();
                                }
                            } else {
                                hashSet = new java.util.HashSet();
                            }
                            hashSet.add(optString);
                        }
                        c5417xb0026372.f135764g.f88939a = 1;
                        c5417xb0026372.e();
                    }
                    if (str != null) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put(dm.i4.f66865x76d1ec5a, optString);
                        jSONObject4.put("src", str);
                        jSONArray5.put(jSONObject4);
                        str = null;
                    }
                } else if (optInt != 4) {
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put(dm.i4.f66865x76d1ec5a, optString);
                    jSONObject5.put("src", jSONObject3.optString("imageUrl"));
                    jSONArray5.put(jSONObject5);
                } else {
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    jSONObject6.put(dm.i4.f66865x76d1ec5a, optString);
                    jSONObject6.put("src", jSONObject3.optString(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463));
                    jSONArray5.put(jSONObject6);
                }
            }
            if (jSONArray5.length() <= 0 || (b17 = b()) == null || (b18 = b17.b()) == null) {
                return;
            }
            java.lang.String jSONArray6 = jSONArray5.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray6, "toString(...)");
            b18.n(0, jSONArray6);
        } catch (org.json.JSONException | java.lang.Exception unused) {
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.String str2;
        aw4.w b17;
        java.lang.Object obj;
        synchronized (this.f96443g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96441e, "event %s，eventData %s", str, java.lang.String.valueOf(w0Var));
            if (w0Var == null || (obj = w0Var.f398509d) == null || (str2 = obj.toString()) == null) {
                str2 = "";
            }
            if (this.f96443g.containsKey(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96441e, "notify avatar changed %s", str2);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.HashSet<java.lang.String> hashSet = (java.util.HashSet) this.f96443g.get(str2);
                if (hashSet != null) {
                    for (java.lang.String str3 : hashSet) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        java.lang.String str4 = "weixin://fts/avatar?path=" + com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(str2, false, false);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put(dm.i4.f66865x76d1ec5a, str3);
                            jSONObject.put("src", str4);
                        } catch (java.lang.Exception unused) {
                        }
                        jSONArray.put(jSONObject);
                    }
                }
                aw4.o b18 = b();
                if (b18 != null && (b17 = b18.b()) != null) {
                    java.lang.String jSONArray2 = jSONArray.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
                    b17.n(0, jSONArray2);
                }
                this.f96443g.remove(str2);
            }
        }
    }
}
