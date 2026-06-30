package sm4;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491459d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f491460e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.in6 f491461f;

    /* renamed from: g, reason: collision with root package name */
    public final long f491462g;

    /* JADX WARN: Multi-variable type inference failed */
    public b(r45.in6 in6Var, int i17) {
        r45.qn6 qn6Var;
        java.lang.String str;
        int i18;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.lang.String str2 = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStory", "Create NetSceneTopStory Home channelId:%s, %s %s %s", java.lang.Integer.valueOf(in6Var.f458727s), java.lang.Integer.valueOf(i17), in6Var.f458724p, in6Var.f458716e);
        this.f491462g = java.lang.System.currentTimeMillis();
        this.f491461f = in6Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1943;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/mmwebrecommend";
        lVar.f152197a = new r45.r97();
        lVar.f152198b = new r45.s97();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491460e = a17;
        r45.r97 r97Var = (r45.r97) a17.f152243a.f152217a;
        r97Var.f466196d = in6Var.f458718g;
        r97Var.f466197e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1);
        r97Var.f466199g = in6Var.f458719h;
        r97Var.f466200h = su4.r2.i();
        r97Var.f466201i = in6Var.f458720i;
        r97Var.f466202m = in6Var.f458715d;
        java.util.LinkedList linkedList = r97Var.f466205p;
        linkedList.addAll(in6Var.f458723o);
        r97Var.f466208s = in6Var.f458727s;
        r97Var.f466214y = i17;
        r97Var.f466215z = in6Var.A;
        r97Var.f466206q = in6Var.f458716e;
        java.lang.String str3 = in6Var.B;
        str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? in6Var.C : str3;
        if (pm4.w.m(in6Var.f458727s)) {
            r45.qn6 qn6Var2 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427966a;
            if (qn6Var2 != null) {
                str3 = qn6Var2.f465646d;
            }
        } else if (pm4.w.l(in6Var.f458727s)) {
            r45.qn6 qn6Var3 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427967b;
            if (qn6Var3 != null) {
                str3 = qn6Var3.f465646d;
            }
        } else if (pm4.w.n(in6Var.f458727s) && (qn6Var = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f427968c) != null) {
            str3 = qn6Var.f465646d;
        }
        r97Var.f466210u = str3;
        r97Var.f466209t = in6Var.f458728t;
        r97Var.f466211v = in6Var.f458733y;
        r97Var.C = j65.e.b() ? 1 : 0;
        r97Var.D = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() ? 1 : 0;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("oaid", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
            ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
            jSONObject.put("imei", "");
            jSONObject.put("devIdInfo", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai());
            int i19 = o45.wf.f424556a;
            jSONObject.put("device_type", wo.q.f529313a);
            str = jSONObject.toString();
        } catch (org.json.JSONException unused) {
            str = "";
        }
        r97Var.E = str;
        r45.x50 x50Var = new r45.x50();
        x50Var.f471321d = "client_system_version";
        x50Var.f471322e = android.os.Build.VERSION.SDK_INT;
        linkedList.add(x50Var);
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f471321d = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37;
        x50Var2.f471323f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b();
        linkedList.add(x50Var2);
        r45.x50 x50Var3 = new r45.x50();
        x50Var3.f471321d = "client_request_time";
        x50Var3.f471323f = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        linkedList.add(x50Var3);
        r45.x50 x50Var4 = new r45.x50();
        x50Var4.f471321d = "clicfg_topstory_top_tab_params";
        x50Var4.f471323f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_topstory_top_tab_params_3, "{\"tabs\":[{\"wording\":\"在看\",\"wording_cn\":\"在看\",\"wording_en\":\"Wow\",\"wording_hk\":\"在看\",\"wording_tw\":\"在看\",\"category\":700,\"showWhenRedDot\":1,\"tabInfo\":\"{\\\"category\\\":700}\",\"bypass\":\"700\"},{\"wording\":\"热点\",\"wording_cn\":\"热点\",\"wording_en\":\"Top\",\"wording_hk\":\"熱點\",\"wording_tw\":\"熱點\",\"category\":100,\"showWhenRedDot\":0,\"tabInfo\":\"{\\\"category\\\":100}\"}]}", true);
        linkedList.add(x50Var4);
        en3.v vVar = (en3.v) ((ra0.v) i95.n0.c(ra0.v.class));
        vVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f336857d, "isNewLifeRedDotEntranceShow() called " + ra0.b0.f474996f);
        boolean z17 = ra0.b0.f474996f;
        ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
        if ((L0 != null && L0.e1()) != false) {
            r45.ez2 D0 = L0.D0();
            java.lang.String i27 = (D0 == null || (m75934xbce7f2f = D0.m75934xbce7f2f(4)) == null) ? null : m75934xbce7f2f.i();
            if (i27 != null) {
                str2 = i27;
            }
        }
        int i28 = in6Var.f458727s;
        ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
        if ((L02 != null && L02.e1()) == true) {
            ((wm4.z) ((pm4.v) i95.n0.c(pm4.v.class))).getClass();
            i18 = wm4.u.h(L02);
        } else {
            i18 = 0;
        }
        boolean z18 = i28 == i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStory", "NetSceneTopStory: isNewLifeRedDotEntranceShow:%s,byPassInfo:%s enterCategory:%s redDotCategory:%s isEnterMatchRedDotCategory:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)), java.lang.Integer.valueOf(in6Var.f458727s), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z18));
        if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && z18) {
            r45.x50 x50Var5 = new r45.x50();
            x50Var5.f471321d = "ReddotBypassInfo";
            x50Var5.f471323f = str2;
            linkedList.add(x50Var5);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.x50 x50Var6 = (r45.x50) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStory", "key: %s unit_value %s text_value %s", x50Var6.f471321d, java.lang.Long.valueOf(x50Var6.f471322e), x50Var6.f471323f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStory", "request params offset %d h5Version %d CheckDocListSize: %d", java.lang.Integer.valueOf(r97Var.f466196d), java.lang.Integer.valueOf(r97Var.f466197e), java.lang.Integer.valueOf(r97Var.f466211v.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        su4.k3.f(this.f491461f.f458720i, 2);
        this.f491459d = u0Var;
        return mo9409x10f9447a(sVar, this.f491460e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1943;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f491462g));
        r45.in6 in6Var = this.f491461f;
        if (i19 == -1) {
            su4.k3.f(in6Var.f458720i, 4);
        } else if (i18 == 0 && i19 == 0) {
            su4.k3.f(in6Var.f458720i, 3);
        } else {
            su4.k3.f(in6Var.f458720i, 8);
        }
        this.f491459d.mo815x76e0bfae(i18, i19, str, this);
    }
}
