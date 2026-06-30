package um4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum4/c;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f510651g = new java.util.HashMap();

    public final void A(r45.in6 in6Var, boolean z17, int i17) {
        int i18 = in6Var.f458727s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "loadDataFromServer, preTabChannelId = %s，homeContext channelId = %s, hashcode = %s, needCallback = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        sm4.b bVar = new sm4.b(in6Var, i17);
        gm0.j1.d().a(1943, this);
        gm0.j1.d().g(bVar);
        this.f510651g.put(java.lang.Integer.valueOf(i18), bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "Start new net scene");
    }

    public final void B(int i17, r45.in6 in6Var, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6817xf4cdaa35 c6817xf4cdaa35 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6817xf4cdaa35();
        c6817xf4cdaa35.f141411d = i17;
        c6817xf4cdaa35.f141412e = java.lang.System.currentTimeMillis();
        c6817xf4cdaa35.f141413f = c6817xf4cdaa35.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, in6Var.f458716e, true);
        c6817xf4cdaa35.f141414g = in6Var.f458727s;
        c6817xf4cdaa35.f141415h = c6817xf4cdaa35.b("searchId", in6Var.f458715d, true);
        c6817xf4cdaa35.f141417j = c6817xf4cdaa35.b("requestId", in6Var.f458722n, true);
        c6817xf4cdaa35.f141416i = in6Var.f458718g;
        c6817xf4cdaa35.f141418k = c6817xf4cdaa35.b(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b(), true);
        c6817xf4cdaa35.f141421n = i18;
        c6817xf4cdaa35.k();
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                r45.in6 in6Var = new r45.in6();
                ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).getClass();
                in6Var.f458724p = wm4.u.i();
                in6Var.f458719h = jSONObject.optString("query", "");
                in6Var.f458718g = jSONObject.optInt("offset", 0);
                in6Var.f458720i = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 21);
                in6Var.f458716e = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
                in6Var.f458717f = jSONObject.optString("subSessionId", "");
                in6Var.f458715d = jSONObject.optString("searchId", "");
                in6Var.f458722n = jSONObject.optString("requestId", "");
                in6Var.f458727s = jSONObject.optInt("tagId", 0);
                in6Var.f458728t = jSONObject.optString("navigationId", "");
                in6Var.f458731w = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b();
                in6Var.D = jSONObject.optBoolean("directRequest", false);
                in6Var.B = jSONObject.optString("homeMsgId", "");
                in6Var.C = jSONObject.optString("redPointMsgId", "");
                java.lang.String optString = jSONObject.optString("extReqParams", "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                        r45.x50 x50Var = new r45.x50();
                        x50Var.f471321d = jSONObject2.optString("key", "");
                        x50Var.f471322e = jSONObject2.optLong("uintValue", 0L);
                        x50Var.f471323f = jSONObject2.optString("textValue", "");
                        in6Var.f458723o.add(x50Var);
                    }
                }
                if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0().size() > 0) {
                    in6Var.A = new r45.o33();
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d : ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0()) {
                        int i18 = c12886x91aa2b6d.f174579d;
                        if (i18 == 2 || i18 == 50) {
                            java.lang.String g17 = c12886x91aa2b6d.g("rawUrl", "");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getStringExtra(...)");
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                                if (!r26.i0.y(g17, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s", false)) {
                                    if (r26.i0.y(g17, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s", false)) {
                                    }
                                }
                                r45.p33 p33Var = new r45.p33();
                                p33Var.f464228d = g17;
                                r45.o33 o33Var = in6Var.A;
                                if (o33Var != null && (linkedList = o33Var.f463399d) != null) {
                                    linkedList.add(p33Var);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "add float ball url %s", g17);
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "channelId = %s directRequest = %s preRequestMode = %s", java.lang.Integer.valueOf(in6Var.f458727s), java.lang.Boolean.valueOf(in6Var.D), java.lang.Integer.valueOf(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20681x433a1d48())));
                int optInt = jSONObject.optInt("preTabChannelId", 0);
                B(5, in6Var, 0);
                A(in6Var, true, optInt);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetK1KData", e17, "getSearchData", new java.lang.Object[0]);
                this.f224976f.a("Error");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.HashMap hashMap = this.f510651g;
        if (hashMap.values() != null) {
            java.util.Collection values = hashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            if (kz5.n0.O(values, m1Var) && (m1Var instanceof sm4.b)) {
                sm4.b bVar = (sm4.b) m1Var;
                hashMap.remove(java.lang.Integer.valueOf(bVar.f491461f.f458727s));
                if (hashMap.isEmpty()) {
                    gm0.j1.d().q(1943, this);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "cacheCgi.isEmpty() = " + hashMap.isEmpty());
                }
                r45.in6 in6Var = bVar.f491461f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(in6Var, "getHomeContext(...)");
                B(6, in6Var, i18);
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "netscene topstory error");
                    this.f224976f.a(str);
                    return;
                }
                java.lang.String str2 = ((r45.s97) bVar.f491460e.f152244b.f152233a).f467120f;
                if (in6Var != null && pm4.w.l(in6Var.f458727s)) {
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(r6.f467123i);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "try to clear haokan red dot");
                }
                if (in6Var != null && pm4.w.m(in6Var.f458727s)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "clear home red dot");
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().l();
                    om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
                    mf0.c0 c0Var = wi6.f427970e;
                    if (c0Var != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.l0) c0Var).d(wi6.x());
                    }
                }
                if (in6Var != null && pm4.w.n(in6Var.f458727s)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "clear home red dot");
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().m();
                    om4.p wi7 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
                    mf0.c0 c0Var2 = wi7.f427970e;
                    if (c0Var2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.l0) c0Var2).e(wi7.x());
                    }
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("json", str2);
                jSONObject.put("isCache", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "search data: " + str2);
                this.f224976f.c(jSONObject, false);
            }
        }
    }
}
