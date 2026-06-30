package vp2;

/* loaded from: classes2.dex */
public abstract class h0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f520457d;

    /* renamed from: e, reason: collision with root package name */
    public final dk2.bc f520458e;

    /* renamed from: f, reason: collision with root package name */
    public dk2.dc f520459f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.ic f520460g;

    public h0(r45.yk2 npsSurveyInfo, r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(npsSurveyInfo, "npsSurveyInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f520457d = container;
        try {
            this.f520458e = new dk2.bc(npsSurveyInfo);
        } catch (java.lang.Exception e17) {
            this.f520458e = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveQcPollActivityFeed", "init error: " + e17);
        }
        dk2.bc bcVar = this.f520458e;
        this.f520459f = bcVar != null ? new dk2.dc(bcVar, null, 2, null) : null;
    }

    public final void a(android.content.Context context, int i17) {
        dk2.bc bcVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            dk2.dc dcVar = this.f520459f;
            java.util.List a17 = dcVar != null ? dcVar.a(java.lang.Integer.valueOf(i17)) : kz5.p0.f395529d;
            if (a17.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveQcPollActivityFeed", "createExtStatsFeed empty");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commitActivity taskId: ");
            dk2.dc dcVar2 = this.f520459f;
            sb6.append((dcVar2 == null || (bcVar = dcVar2.f314860a) == null) ? null : bcVar.f314788b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQcPollActivityFeed", sb6.toString());
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Jj(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 18054, a17);
            dk2.bc bcVar2 = this.f520458e;
            this.f520459f = bcVar2 != null ? new dk2.dc(bcVar2, null, 2, null) : null;
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ntl);
            e4Var.c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveQcPollActivityFeed", "commitActivity error: " + e17);
        }
    }

    public final void b(android.content.Context context, java.lang.Iterable options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rq2.w.class);
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("select_options", kz5.n0.g0(options, "#", null, null, 0, null, vp2.f0.f520453d, 30, null));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        wVar.Q6(m75945x2fec8307, "square_nps_quest_unlike_half_screen", r26.i0.t(jSONObject2, ",", ";", false));
    }

    public final void c(android.content.Context context) {
        dk2.hc hcVar;
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rq2.w.class);
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        dk2.ic icVar = this.f520460g;
        jSONObject.putOpt("options_list", (icVar == null || (hcVar = icVar.f315157c) == null || (list = hcVar.f315116e) == null) ? null : kz5.n0.g0(list, "#", null, null, 0, null, vp2.g0.f520456d, 30, null));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        wVar.P6(null, m75945x2fec8307, "square_nps_quest_unlike_half_screen", r26.i0.t(jSONObject2, ",", ";", false));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }
}
