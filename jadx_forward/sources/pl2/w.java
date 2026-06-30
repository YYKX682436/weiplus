package pl2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f438204a;

    /* renamed from: b, reason: collision with root package name */
    public long f438205b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f438206c;

    /* renamed from: d, reason: collision with root package name */
    public int f438207d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f438208e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f438209f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f438210g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f438211h = 2;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f438212i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pl2.x f438213j;

    public w(pl2.x xVar, int i17) {
        this.f438213j = xVar;
        this.f438204a = i17;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            jSONObject.put(str2, str3);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438213j.f438214d, "report appendChnlExtra error, " + e17.getMessage());
            return str;
        }
    }

    public final jz5.l b() {
        pl2.x xVar = this.f438213j;
        android.app.Activity context = xVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String a17 = a(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).f216921t, "is_related", "1");
        boolean z17 = this.f438206c;
        int i17 = this.f438204a;
        java.lang.String a18 = z17 ? a(a(a17, "active_id", java.lang.String.valueOf(i17)), "active_index", java.lang.String.valueOf(this.f438208e)) : a(a(a(a17, "single_stream_type", "active"), "active_id", java.lang.String.valueOf(i17)), "active_index", java.lang.String.valueOf(this.f438208e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f438214d, xVar.f438220m.hashCode() + "report genJoinLiveChnlExtra " + this.f438206c + ", " + i17 + ", " + this.f438208e + ", " + a18);
        return new jz5.l(java.lang.Boolean.valueOf(this.f438206c), a18);
    }

    public final void c() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("banner_type", "common_recmd");
        int i17 = this.f438204a;
        linkedHashMap.put("active_id", java.lang.String.valueOf(i17));
        pl2.x xVar = this.f438213j;
        linkedHashMap.put("screen_type", xVar.m80379x76847179().getResources().getConfiguration().orientation == 2 ? "2" : "1");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409534x1, linkedHashMap, null, null, null, null, false, 124, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f438214d, "report reportBannerClick " + i17);
    }

    public final void d(int i17, pl2.a aVar, int i18) {
        java.lang.String str;
        km2.n nVar;
        km2.t c17;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17;
        pl2.x xVar = this.f438213j;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f438214d, "report reportSideBarItemExpose feed is null");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("banner_type", "common_recmd");
        int i19 = this.f438204a;
        linkedHashMap.put("active_id", java.lang.String.valueOf(i19));
        linkedHashMap.put("active_index", java.lang.String.valueOf(i17));
        linkedHashMap.put("card_exp_type", java.lang.String.valueOf(i18));
        km2.m mVar = aVar.f438149d;
        linkedHashMap.put("liveId", pm0.v.u(mVar.f390662d.f150070e));
        linkedHashMap.put("feedId", pm0.v.u(mVar.f390662d.f150082s));
        if (xVar.f438218h == null || (nVar = dk2.ef.H) == null || (c17 = nVar.c()) == null || (b17 = c17.b()) == null || (str = java.lang.Long.valueOf(b17.f150070e).toString()) == null) {
            str = "";
        }
        linkedHashMap.put("liveid_id", str);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.f409632x1, linkedHashMap, null, null, null, null, false, 124, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f438214d, "report reportSideBarItemExpose " + i19 + ", " + i17 + ", " + pm0.v.u(mVar.f390662d.f150070e) + ", " + pm0.v.u(mVar.f390662d.f150082s) + ' ');
    }
}
