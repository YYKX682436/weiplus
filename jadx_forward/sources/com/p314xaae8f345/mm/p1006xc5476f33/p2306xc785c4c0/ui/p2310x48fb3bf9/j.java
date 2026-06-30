package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class j extends aw4.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f256737e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f256738f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f256739g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f256740h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f256741i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f256742m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f256743n;

    public j() {
        super(null);
        this.f256737e = new java.util.HashMap();
        this.f256738f = new java.util.HashMap();
        this.f256739g = new java.util.HashMap();
        this.f256741i = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.d(this);
        this.f256742m = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.e(this);
        this.f256743n = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.f(this);
    }

    public final void b(r45.in6 in6Var, java.lang.String str, boolean z17) {
        java.util.HashMap hashMap = this.f256739g;
        if (!((java.lang.Boolean) hashMap.get(java.lang.Integer.valueOf(in6Var.f458727s))).booleanValue()) {
            java.util.HashMap hashMap2 = this.f256738f;
            if (z17) {
                hashMap2.remove(java.lang.Integer.valueOf(in6Var.f458727s));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.i(this, null);
            iVar.f256734c = in6Var;
            iVar.f256732a = c01.id.c();
            iVar.f256733b = str;
            hashMap2.put(java.lang.Integer.valueOf(in6Var.f458727s), iVar);
            return;
        }
        aw4.q qVar = this.f96377d;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.a) qVar) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.a) qVar);
            java.util.Iterator it = ((java.util.ArrayList) jVar.H).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1) it.next();
                if (c1Var.f256477c != null) {
                    c1Var.f256478d = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "invalid cache when onSearchDataReady");
                }
            }
            jVar.Y = true;
            jVar.f256526m.u(str);
        }
        hashMap.remove(java.lang.Integer.valueOf(in6Var.f458727s));
    }

    public java.lang.String c(r45.in6 in6Var) {
        int i17 = in6Var.f458727s;
        java.util.HashMap hashMap = this.f256738f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.i) hashMap.get(java.lang.Integer.valueOf(i17));
        java.lang.String str = null;
        if (iVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromCache,channelId = " + i17);
        if (iVar.f256734c.f458716e.equals(in6Var.f458716e) && iVar.f256734c.f458722n.equals(in6Var.f458722n) && c01.id.c() - iVar.f256732a <= 60000) {
            str = iVar.f256733b;
        }
        hashMap.remove(java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache fail");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache success %d", java.lang.Integer.valueOf(str.length()));
        }
        return str;
    }

    public void d(r45.in6 in6Var, boolean z17, boolean z18, int i17) {
        boolean r17 = wm4.u.r();
        int i18 = in6Var.f458727s;
        if (pm4.w.n(i18) && r17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromServer, preTabChannelId = %s，homeContext channelId = %s, hashcode = %s, needCallback = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = this.f256737e;
        sm4.b bVar = (sm4.b) hashMap.get(java.lang.Integer.valueOf(i18));
        java.util.HashMap hashMap2 = this.f256739g;
        if (!z18 && bVar != null && in6Var.f458716e.equals(bVar.f491461f.f458716e)) {
            hashMap2.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "Wait current net scene");
            pm4.y.f(in6Var, "WaitCurrentNetScene", c01.id.c());
        } else {
            sm4.b bVar2 = new sm4.b(in6Var, i17);
            gm0.j1.d().a(1943, this);
            gm0.j1.d().g(bVar2);
            hashMap.put(java.lang.Integer.valueOf(i18), bVar2);
            hashMap2.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "Start new net scene");
        }
    }

    public void e() {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.h(this, null), "TopStory.LoadHtmlDataFromSdcardTask");
    }

    @Override // aw4.a, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (this.f256737e.values() == null || !this.f256737e.values().contains(m1Var)) {
            return;
        }
        sm4.b bVar = (sm4.b) m1Var;
        this.f256737e.remove(java.lang.Integer.valueOf(bVar.f491461f.f458727s));
        if (this.f256737e.isEmpty()) {
            gm0.j1.d().q(1943, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "cacheCgi.isEmpty() = " + this.f256737e.isEmpty());
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "netscene topstory error");
            r45.in6 in6Var = bVar.f491461f;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("ret", -1);
            } catch (org.json.JSONException unused) {
            }
            b(in6Var, jSONObject.toString(), true);
            return;
        }
        r45.s97 s97Var = (r45.s97) bVar.f491460e.f152244b.f152233a;
        java.lang.String str2 = s97Var.f467120f;
        r45.in6 in6Var2 = bVar.f491461f;
        if (in6Var2 != null && pm4.w.l(in6Var2.f458727s)) {
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(s97Var.f467123i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "try to clear haokan red dot");
        }
        r45.in6 in6Var3 = bVar.f491461f;
        if (in6Var3 != null && pm4.w.m(in6Var3.f458727s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "clear home red dot");
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().l();
            om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            mf0.c0 c0Var = wi6.f427970e;
            if (c0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.l0) c0Var).d(wi6.x());
            }
        }
        r45.in6 in6Var4 = bVar.f491461f;
        if (in6Var4 != null && pm4.w.n(in6Var4.f458727s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebData", "clear home red dot");
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().m();
            om4.p wi7 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            mf0.c0 c0Var2 = wi7.f427970e;
            if (c0Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.l0) c0Var2).e(wi7.x());
            }
        }
        b(bVar.f491461f, str2, false);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = bVar.f491460e.f152244b.f152233a;
        if (((r45.s97) fVar).f467122h == null || ((r45.s97) fVar).f467122h.f452359h != 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.g(this, s97Var, str2));
    }
}
