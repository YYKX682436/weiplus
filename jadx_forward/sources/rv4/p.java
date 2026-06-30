package rv4;

/* loaded from: classes12.dex */
public final class p implements mv4.d, mv4.c {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f482059a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f482060b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f482061c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f482062d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f482063e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f482064f;

    /* renamed from: g, reason: collision with root package name */
    public long f482065g;

    /* renamed from: h, reason: collision with root package name */
    public long f482066h;

    /* renamed from: i, reason: collision with root package name */
    public long f482067i;

    /* renamed from: j, reason: collision with root package name */
    public int f482068j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f482069k;

    /* renamed from: l, reason: collision with root package name */
    public int f482070l;

    /* renamed from: m, reason: collision with root package name */
    public int f482071m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f482072n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f482073o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f482074p;

    /* renamed from: q, reason: collision with root package name */
    public int f482075q;

    /* renamed from: r, reason: collision with root package name */
    public int f482076r;

    public p(rv4.w session, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f482059a = session;
        this.f482060b = context;
        this.f482061c = kz5.p0.f395529d;
        this.f482062d = "";
        this.f482063e = "";
        this.f482064f = "";
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f482072n = string;
        this.f482073o = session.a().f482087a.optLong("hideHotSearch", 0L) == 0;
        this.f482076r = 3;
    }

    @Override // mv4.d
    public int a() {
        return this.f482070l;
    }

    @Override // mv4.d
    public void b(int i17) {
    }

    public final void c() {
        rv4.w wVar = this.f482059a;
        rv4.c cVar = rv4.c.f481979a;
        org.json.JSONObject a17 = cVar.a();
        if (a17 != null) {
            try {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.optString("lastSessionId", ""), wVar.f413207a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] extendCacheTime: same sessionId, set ignoreExpose=true");
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(a17.toString());
                jSONObject.put("lastSessionId", wVar.f413207a);
                jSONObject.put("lastUpdateTime", java.lang.System.currentTimeMillis());
                cVar.c(jSONObject);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] extendCacheTime: updated lastUpdateTime to extend cache validity");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] extendCacheTime error", e17);
            }
        }
    }

    @Override // mv4.c
    public void d() {
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f482076r = i17;
    }

    @Override // mv4.d
    public void f(int i17) {
        this.f482071m = i17;
    }

    public final java.lang.String g(boolean z17, java.lang.String str, boolean z18) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_from_change", java.lang.Integer.valueOf(this.f482068j));
        if (z17) {
            if (str == null) {
                str = this.f482063e + java.lang.System.currentTimeMillis();
            }
            linkedHashMap.put("clickId", str);
        }
        if (z18) {
            int i17 = this.f482068j;
            if (i17 == 0) {
                try {
                    ((iv4.e) ((su4.s0) i95.n0.c(su4.s0.class))).getClass();
                    long j17 = iv4.e.f376668d.f494413a;
                    if (j17 > 0) {
                        linkedHashMap.put("clksearch_tsms", java.lang.Long.valueOf(j17));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "Failed to get search entry statistics", e17);
                }
            } else if (i17 == 1) {
                long j18 = this.f482065g;
                if (j18 > 0) {
                    linkedHashMap.put("clkchange_tsms", java.lang.Long.valueOf(j18));
                }
            }
            long j19 = this.f482066h;
            if (j19 > 0) {
                linkedHashMap.put("clientreq_tsms", java.lang.Long.valueOf(j19));
            }
            long j27 = this.f482067i;
            if (j27 > 0) {
                linkedHashMap.put("clientreturn_tsms", java.lang.Long.valueOf(j27));
            }
        }
        java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @Override // mv4.d
    /* renamed from: getMarginTop */
    public int mo148470xc1272e11() {
        return this.f482071m;
    }

    @Override // mv4.d
    /* renamed from: getTitle */
    public java.lang.String mo148471x7531c8a2() {
        return this.f482072n;
    }

    public boolean h() {
        return this.f482073o && (this.f482061c.isEmpty() ^ true);
    }

    public final void i(java.lang.String json, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f482060b;
        if (abstractActivityC21394xb3d2c0cf.isFinishing() || abstractActivityC21394xb3d2c0cf.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Activity is finishing/destroyed, skip callback");
        } else {
            abstractActivityC21394xb3d2c0cf.runOnUiThread(new rv4.o(this, j17, j18, json));
        }
    }

    public final void j() {
        rv4.c cVar = rv4.c.f481979a;
        org.json.JSONObject a17 = cVar.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshCacheKey: no existing config found");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(a17.toString());
            java.lang.String str = this.f482059a.f413207a;
            jSONObject.put("cache_key", str);
            jSONObject.put("lastUpdateTime", java.lang.System.currentTimeMillis());
            cVar.c(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshCacheKey: updated cache_key from " + a17.optString("cache_key", "") + " to " + str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshCacheKey error", e17);
        }
    }

    public final void k(vu4.a actionId, vu4.b actionType, java.lang.String query, java.lang.String docInfo, java.lang.String extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        java.lang.String str = this.f482059a.f413207a;
        java.lang.String str2 = this.f482063e;
        java.lang.String str3 = this.f482062d;
        int i17 = this.f482076r;
        java.lang.String title = this.f482072n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        vu4.c cVar = new vu4.c(actionId, actionType, str, str2, str3, 0, query, docInfo, i17 + "|2|" + fp.s0.b(title, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), "100000410", this.f482069k);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(extInfo)) {
            cVar.f521824n = g(false, null, false);
        } else {
            cVar.f521824n = extInfo;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(cVar.a());
    }

    public final void l(ov4.f actionId, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        if (actionId == ov4.f.f430764f ? !z17 : z17) {
            ov4.g[] gVarArr = ov4.g.f430768d;
            str = "1205";
        } else {
            ov4.g[] gVarArr2 = ov4.g.f430768d;
            str = "1206";
        }
        rv4.w wVar = this.f482059a;
        ov4.e eVar = new ov4.e(wVar.f413207a, null, null, 0, 3, actionId, 0L, str, null, null, 0, null, 0, 8014, null);
        int ordinal = actionId.ordinal();
        nv4.k kVar = wVar.f413208b;
        if (ordinal == 0) {
            kVar.d("hot-search-switch-status-" + wVar.f413207a, eVar);
        } else if (ordinal == 1) {
            kVar.c(eVar);
        } else {
            if (ordinal != 2) {
                return;
            }
            kVar.getClass();
            eVar.m157224x9616526c();
            kVar.b(eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a A[EDGE_INSN: B:46:0x015a->B:47:0x015a BREAK  A[LOOP:1: B:29:0x0106->B:42:0x0144], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r18, rv4.w r19, yz5.a r20) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.p.m(int, rv4.w, yz5.a):void");
    }

    public final void n(rv4.r scene, int i17, yz5.a onDataReady) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDataReady, "onDataReady");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshData by " + scene + ", actionType:" + i17);
        try {
            int ordinal = scene.ordinal();
            rv4.w wVar = this.f482059a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] REFRESH_BUTTON: requesting new data");
                m(i17, wVar, onDataReady);
                return;
            }
            this.f482068j = 0;
            java.util.List f17 = rv4.q.f482077a.f(i17);
            if (f17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] INIT_DATA: no cache, requesting CGI");
                j();
                m(i17, wVar, onDataReady);
                return;
            }
            this.f482061c = f17;
            l(ov4.f.f430765g, this.f482073o);
            java.util.Iterator it = f17.iterator();
            while (it.hasNext()) {
                ((rv4.i0) it.next()).f482027e = this;
            }
            o();
            this.f482069k = true;
            c();
            onDataReady.mo152xb9724478();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] INIT_DATA: using cached data, " + f17.size() + " items");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTSGlobalTeachHotSearchData", th6, "refreshData Error", new java.lang.Object[0]);
            this.f482061c = kz5.p0.f395529d;
            onDataReady.mo152xb9724478();
        }
    }

    public final void o() {
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:config", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchConfig: " + u17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        org.json.JSONObject f17 = pv4.a.f(u17);
        if (f17 != null) {
            java.lang.String optString = f17.optString("searchID", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f482063e = optString;
            java.lang.String optString2 = f17.optString("requestId", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            this.f482062d = optString2;
            f17.optBoolean("refreshCanShow", false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17.optString("refreshTitle", ""), "optString(...)");
            java.lang.String optString3 = f17.optString("refreshDocInfo", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            this.f482064f = optString3;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17.optString("guessTitle", ""), "optString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17.optString("ctx", ""), "optString(...)");
        }
    }
}
