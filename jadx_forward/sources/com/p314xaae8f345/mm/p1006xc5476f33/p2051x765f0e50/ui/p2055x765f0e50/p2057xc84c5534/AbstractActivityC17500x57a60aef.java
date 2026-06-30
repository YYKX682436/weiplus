package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/report/MMReportPreference;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "t14/r", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC17500x57a60aef extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public static final t14.r f243039e = new t14.r(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f243040f = kz5.c0.i(t14.q.class, t14.j.class);

    /* renamed from: d, reason: collision with root package name */
    public long f243041d;

    public abstract int V6();

    public final void W6(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, java.lang.String selectViewId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectViewId, "selectViewId");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h(selectViewId) : null;
        if (h17 == null || !((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).q(selectViewId)) {
            return;
        }
        boolean z17 = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe;
        t14.r rVar2 = f243039e;
        if (z17) {
            rVar2.a(this, selectViewId, ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17).N() ? "1" : "0", 1);
            return;
        }
        java.lang.CharSequence n17 = h17.n();
        if (n17 == null || (str = n17.toString()) == null) {
            str = "";
        }
        rVar2.a(this, selectViewId, str, h17.m());
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: dispatchClick */
    public void mo69080x80434d2e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        super.mo69080x80434d2e(h0Var, c21560x1fce98fb);
        t14.q qVar = (t14.q) m80391xac8f1cfd(t14.q.class);
        if (c21560x1fce98fb == null) {
            qVar.getClass();
            return;
        }
        java.util.Map U6 = qVar.U6(c21560x1fce98fb);
        U6.put("view_id", c21560x1fce98fb.f279313q);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = u24.n.b();
        java.lang.String substring = b17.substring(r26.n0.O(b17, '_', 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.Long j17 = r26.h0.j(substring);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = qVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef abstractActivityC17500x57a60aef = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef) m158354x19263085 : null;
        if (abstractActivityC17500x57a60aef != null) {
            U6.put("before_clk_page_duration", java.lang.Long.valueOf(currentTimeMillis - abstractActivityC17500x57a60aef.f243041d));
        }
        if (j17 != null) {
            U6.put("before_clk_session_duration", java.lang.Long.valueOf(currentTimeMillis - j17.longValue()));
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(h0Var);
            U6.toString();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", U6, 33328);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long c17 = c01.id.c();
        this.f243041d = c17;
        u24.n.a(c17);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j17 = this.f243041d;
        java.lang.Long l17 = u24.n.f505664b;
        if (l17 != null && j17 == l17.longValue()) {
            u24.n.f505663a = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.addAll(f243040f);
    }
}
