package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@db5.a(m123858x6ac9171 = 1024)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSMainUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseMainUI;", "<init>", "()V", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSMainUI */
/* loaded from: classes12.dex */
public final class ActivityC15607x502bbbb2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 {
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        c23.g0 g0Var = (c23.g0) pf5.z.f435481a.a(this).e(c23.g0.class);
        if (g0Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exittype", 5);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            g0Var.f119569e = jSONObject2;
            java.lang.String g17 = this.f219470y0.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getSearchContent(...)");
            g0Var.f119568d = g17;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        c23.g0 g0Var = (c23.g0) pf5.z.f435481a.a(this).e(c23.g0.class);
        if (g0Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exittype", 4);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            g0Var.f119569e = jSONObject2;
            java.lang.String g17 = this.f219470y0.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getSearchContent(...)");
            g0Var.f119568d = g17;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o13.p.f423784d = o13.n.g(3);
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            su4.s0 s0Var = (su4.s0) i95.n0.c(su4.s0.class);
            su4.f2 f2Var = new su4.f2(currentTimeMillis);
            ((iv4.e) s0Var).getClass();
            iv4.e.f376668d = f2Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMainUI", "recordTeachPageEnterTimestamp: " + currentTimeMillis);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FTSMainUI", "recordTeachPageEnterTimestamp error", e17);
        }
        super.onCreate(bundle);
        ((ku5.t0) ku5.t0.f394148d).h(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.t2.f219720d, "WCSearchGroupTrain.init");
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FTSMainUI)).Rj(this, iy1.a.Search);
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.L2(this, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.u2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNativeTeach: ");
        boolean z17 = this.V;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMainUI", sb6.toString());
        if (z17) {
            set.add(i23.e.class);
        } else {
            set.add(c23.m.class);
        }
        set.add(c23.o.class);
        set.add(c23.q.class);
        set.add(c23.t.class);
        set.add(x13.c.class);
        set.add(c23.g0.class);
        set.add(z13.f.class);
        set.add(k23.c1.class);
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            set.add(c23.f0.class);
            set.add(c23.c0.class);
        }
    }
}
