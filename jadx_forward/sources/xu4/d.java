package xu4;

/* loaded from: classes8.dex */
public final class d extends aw4.b0 {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.a f538816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yu4.p uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
    }

    @Override // av4.q
    public java.lang.String c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.reflect.Method method = xu4.d.class.getMethod(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d), java.lang.String.class);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(this, jSONObject.getJSONObject("params").toString());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.String");
            return (java.lang.String) invoke;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject2 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: createEmoticonStream */
    public final java.lang.String m175976xfa381c2(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "emoticonRecentSend: " + str);
        java.lang.String jSONObject = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        if (str == null) {
            return jSONObject;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.String str2 = null;
            try {
                boolean z17 = true;
                if (!jSONObject2.has("key")) {
                    z17 = false;
                }
                if (z17) {
                    str2 = jSONObject2.getString("key");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            if (str2 == null) {
                str2 = "default";
            }
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("SearchEmoji");
            if (!h07.m()) {
                h07.J();
            }
            java.lang.String outputPath = h07.o() + '/' + str2 + ".gif";
            long j17 = jSONObject2.getLong("duration");
            int i17 = jSONObject2.getInt("width");
            int i18 = jSONObject2.getInt("height");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p5.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
            com.p314xaae8f345.mm.p1006xc5476f33.gif.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.p(outputPath, i17, i18, j17);
            this.f538816h = pVar;
            if (pVar.mo65002x316510()) {
                return g().toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", "init gifEncoder failed");
            return jSONObject;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", jz5.a.b(e18));
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:6:0x001b, B:8:0x002e, B:13:0x003a), top: B:5:0x001b }] */
    @android.webkit.JavascriptInterface
    /* renamed from: emoticonImg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m175977x7ee18b5d(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "weixin://fts/emoji?path="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "emoticonImg: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WebSearch.BaseWebSearchJSApi"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r1 = "emoticonImg:failed"
            if (r6 != 0) goto L1b
            return r1
        L1b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6e
            r2.<init>(r6)     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6e
            r6.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = "md5"
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Exception -> L6e
            r3 = 0
            if (r2 == 0) goto L37
            int r4 = r2.length()     // Catch: java.lang.Exception -> L6e
            if (r4 != 0) goto L35
            goto L37
        L35:
            r4 = r3
            goto L38
        L37:
            r4 = 1
        L38:
            if (r4 != 0) goto L6e
            java.lang.Class<com.tencent.mm.feature.emoji.api.r6> r4 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6.class
            i95.m r4 = i95.n0.c(r4)     // Catch: java.lang.Exception -> L6e
            com.tencent.mm.feature.emoji.api.r6 r4 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6) r4     // Catch: java.lang.Exception -> L6e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)     // Catch: java.lang.Exception -> L6e
            com.tencent.mm.feature.emoji.l4 r4 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4) r4     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = r4.wi(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = com.p314xaae8f345.mm.vfs.w6.i(r2, r3)     // Catch: java.lang.Exception -> L6e
            java.lang.String r4 = "retCode"
            org.json.JSONObject r6 = r6.put(r4, r3)     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = "url"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            r4.<init>(r0)     // Catch: java.lang.Exception -> L6e
            r4.append(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r6 = r6.put(r3, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L6e
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xu4.d.m175977x7ee18b5d(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: emoticonRecentSend */
    public final java.lang.String m175978x282a8fa9(java.lang.String str) {
        java.util.LinkedList Ai;
        java.util.LinkedList Ai2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "emoticonRecentSend: " + str);
        if (str == null) {
            return "emoticonRecentSend:failed";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("operation", 0);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6 r6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6.class);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (optInt == 1) {
                java.lang.String optString = jSONObject.optString("md5");
                if (optString == null || optString.length() == 0) {
                    return "emoticonRecentSend:failed";
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4 l4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4) r6Var;
                l4Var.getClass();
                synchronized (l4Var.Ai()) {
                    Ai = l4Var.Ai();
                }
                return jSONObject2.put("isInList", Ai.contains(optString) ? 1 : 0).toString();
            }
            if (optInt == 2) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4 l4Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4) r6Var;
                synchronized (l4Var2.Ai()) {
                    Ai2 = l4Var2.Ai();
                }
                java.util.Iterator it = Ai2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((java.lang.String) it.next());
                }
                return g().put("md5InOrder", jSONArray.toString()).toString();
            }
            if (optInt != 3) {
                if (optInt != 4) {
                    return "emoticonRecentSend:ok";
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4 l4Var3 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4) r6Var;
                synchronized (l4Var3.Ai()) {
                    l4Var3.Ai().clear();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().f552361d.mo70514xb06685ab("GetEmotionListCache", "reqType=?", new java.lang.String[]{"cache_type_send_list"});
                }
                return "emoticonRecentSend:ok";
            }
            java.lang.String optString2 = jSONObject.optString("md5");
            if (optString2 == null || optString2.length() == 0) {
                return "emoticonRecentSend:failed";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4 l4Var4 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4) r6Var;
            l4Var4.getClass();
            synchronized (l4Var4.Ai()) {
                l4Var4.Ai().remove(optString2);
                l4Var4.Bi(l4Var4.Ai());
            }
            return "emoticonRecentSend:ok";
        } catch (java.lang.Exception unused) {
            return "emoticonRecentSend:failed";
        }
        return "emoticonRecentSend:failed";
    }

    @android.webkit.JavascriptInterface
    /* renamed from: endEmoticonStream */
    public final java.lang.String m175979xf800b761(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.a aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "endEmoticonStream: " + str);
        java.lang.String jSONObject = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        if (str == null || (aVar = this.f538816h) == null) {
            return jSONObject;
        }
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.gif.p) aVar).b()) {
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.String str2 = null;
            try {
                boolean z17 = true;
                if (!jSONObject2.has("key")) {
                    z17 = false;
                }
                if (z17) {
                    str2 = jSONObject2.getString("key");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            if (str2 == null) {
                str2 = "default";
            }
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            java.lang.String str3 = lp0.b.h0("SearchEmoji").o() + '/' + str2 + ".gif";
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str3, 0, -1);
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(N);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
            org.json.JSONObject g17 = g();
            int length = N.length;
            g17.put("md5", b17);
            g17.put("size", length);
            g17.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str3);
            return g17.toString();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", jz5.a.b(e18));
            return jSONObject;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: enterEmojiStore */
    public final java.lang.String m175980x8e04f933(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("searchScene", 24);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "searchScene = %s, requestObj = %s.", java.lang.Integer.valueOf(optInt), jSONObject);
            qk.z zVar = new qk.z();
            zVar.f445645h = optInt;
            zVar.f445688a = 13;
            zVar.f445646i = 17;
            java.lang.String optString = jSONObject.optString("talker");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                zVar.f445647j = optString;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", "unable to get emoticon liteapp feature service");
            } else {
                yu4.p u17 = u();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(u17 != null ? u17.H() : null, zVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12065, 9);
            java.lang.String jSONObject2 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject3 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* renamed from: enterKeyboardPlugin */
    public final java.lang.String m175981xa6f8fef2(java.lang.String str) {
        xu4.m b17;
        java.lang.String str2;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "enterKeyboardPlugin onClick");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 5);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                android.util.Pair c17 = rn3.i.Di().c(new vn3.c(48));
                if (c17.first == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                    jSONObject.put("redDot", 1);
                }
                xu4.n nVar = xu4.n.f538830a;
                nVar.c();
                b17 = nVar.b();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "", new java.lang.Object[0]);
            }
            if (b17 != null) {
                str2 = b17.f538825a;
                if (str2 == null) {
                }
                jSONObject.put("wording", str2);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("wetype", jSONObject);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "query:%s", jSONObject2.toString());
                wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String jSONObject3 = jSONObject2.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                ((vd0.o3) z1Var).bj(context, jSONObject3);
                ((vd0.g2) ((wd0.n1) i95.n0.c(wd0.n1.class))).wi(7, str2, java.lang.Integer.valueOf((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "{}")) ? 0 : new org.json.JSONObject(str).optBoolean("hasRedDot")), 1);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype_scene_emoji_search").putBoolean("mmkv_key_scene_emoji_search_config_has_click", true);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(48);
                java.lang.String jSONObject4 = g().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                return jSONObject4;
            }
            str2 = "";
            jSONObject.put("wording", str2);
            org.json.JSONObject jSONObject22 = new org.json.JSONObject();
            jSONObject22.put("wetype", jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "query:%s", jSONObject22.toString());
            wd0.z1 z1Var2 = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            java.lang.String jSONObject32 = jSONObject22.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject32, "toString(...)");
            ((vd0.o3) z1Var2).bj(context2, jSONObject32);
            ((vd0.g2) ((wd0.n1) i95.n0.c(wd0.n1.class))).wi(7, str2, java.lang.Integer.valueOf((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "{}")) ? 0 : new org.json.JSONObject(str).optBoolean("hasRedDot")), 1);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype_scene_emoji_search").putBoolean("mmkv_key_scene_emoji_search_config_has_click", true);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(48);
            java.lang.String jSONObject42 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject42, "toString(...)");
            return jSONObject42;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject5 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getCurrentSearchInputQuery */
    public final java.lang.String m175982x86e9c649(java.lang.String str) {
        java.lang.String a47;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getCurrentSearchInputQuery: " + str);
        try {
            yu4.p u17 = u();
            if (u17 != null && (a47 = u17.a4()) != null) {
                org.json.JSONObject g17 = g();
                g17.put("query", a47);
                java.lang.String jSONObject = g17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String jSONObject2 = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openSearchWebView */
    public final java.lang.String m175983xf159c727(java.lang.String str) {
        r45.xi0 xi0Var;
        java.lang.String str2;
        java.lang.String str3 = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openSearchWebView " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("query");
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
            int optInt4 = jSONObject.optInt("actionType", 0);
            java.lang.String optString4 = jSONObject.optString("extParams", "");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("nativeConfig");
            if (optJSONObject != null) {
                optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            }
            if (optInt4 == 3) {
                java.util.Map c17 = su4.r2.c(optInt, false, optInt2, optString4);
                java.util.HashMap hashMap = (java.util.HashMap) c17;
                hashMap.put("query", optString);
                hashMap.put("searchId", optString2);
                hashMap.put("subType", java.lang.String.valueOf(optInt3));
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString3);
                hashMap.put("subSessionId", su4.r2.f(optInt));
                r45.xi0 xi0Var2 = new r45.xi0();
                yu4.p u17 = u();
                if (u17 != null && (xi0Var = (r45.xi0) u17.m4()) != null && (str2 = xi0Var.f471656o) != null) {
                    str3 = str2;
                }
                xi0Var2.f471656o = str3;
                xi0Var2.f471651g = xu4.g.f538820a.a(c17);
                xi0Var2.f471653i = optString;
                xi0Var2.f471650f = optInt;
                xi0Var2.f471648d = optString2;
                xi0Var2.f471649e = optString3;
                xi0Var2.f471652h = su4.r2.f(optInt);
                yu4.p u18 = u();
                if (u18 != null) {
                    u18.g5(xi0Var2);
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: sendEmoticonStream */
    public final java.lang.String m175984x45894b4e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "sendEmoticonStream: " + str);
        java.lang.String jSONObject = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        if (str != null && this.f538816h != null) {
            try {
                java.lang.String optString = new org.json.JSONObject(str).optString("images");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                q26.h hVar = new q26.h((q26.i) q26.h0.i(q26.h0.o(q26.h0.i(r26.n0.h0(optString, new java.lang.String[]{","}, false, 0, 6, null), xu4.a.f538813d), xu4.b.f538814d), xu4.c.f538815d));
                while (hVar.hasNext()) {
                    byte[] bArr = (byte[]) hVar.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.gif.a aVar = this.f538816h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.gif.p) aVar).a(bArr, 500L);
                }
                return g().toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", jz5.a.b(e17));
            }
        }
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setRecommendSearchHint */
    public final java.lang.String m175985x157d7269(java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "setRecommendSearchHint: ".concat(params));
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(params) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(params, "{}")) {
                java.lang.String jSONObject = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(params);
            yu4.p u17 = u();
            if (u17 != null) {
                java.lang.String optString = jSONObject2.optString("recommendSearchHint");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                u17.W1(optString);
            }
            java.lang.String jSONObject3 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: Exception -> 0x0165, TryCatch #1 {Exception -> 0x0165, blocks: (B:9:0x002b, B:11:0x0030, B:12:0x0039, B:17:0x0145, B:18:0x0095, B:20:0x009d, B:22:0x00a3, B:31:0x0110, B:32:0x0116, B:36:0x0128, B:41:0x0139, B:44:0x013d, B:50:0x0103, B:25:0x00f2, B:29:0x00fd), top: B:8:0x002b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139 A[Catch: Exception -> 0x0165, TRY_ENTER, TryCatch #1 {Exception -> 0x0165, blocks: (B:9:0x002b, B:11:0x0030, B:12:0x0039, B:17:0x0145, B:18:0x0095, B:20:0x009d, B:22:0x00a3, B:31:0x0110, B:32:0x0116, B:36:0x0128, B:41:0x0139, B:44:0x013d, B:50:0x0103, B:25:0x00f2, B:29:0x00fd), top: B:8:0x002b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    @android.webkit.JavascriptInterface
    /* renamed from: setSearchTagResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m175986x116cdacd(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu4.d.m175986x116cdacd(java.lang.String):java.lang.String");
    }

    public final yu4.p u() {
        av4.j jVar = this.f95859a;
        if (jVar instanceof yu4.p) {
            return (yu4.p) jVar;
        }
        return null;
    }
}
