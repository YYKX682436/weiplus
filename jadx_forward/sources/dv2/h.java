package dv2;

/* loaded from: classes10.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f325390d;

    /* renamed from: e, reason: collision with root package name */
    public xg3.h0 f325391e;

    /* renamed from: f, reason: collision with root package name */
    public dv2.c f325392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f325393g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325394h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325390d = "Finder.ConversationExposeReportUIC";
        this.f325392f = dv2.c.f325352d;
        this.f325393g = "";
        this.f325394h = jz5.h.b(new dv2.d(this));
        this.f325395i = jz5.h.b(dv2.f.f325382d);
    }

    public final dv2.b O6() {
        return (dv2.b) this.f325395i.mo141623x754a37bb();
    }

    public final void P6(dv2.c source, java.lang.String sessionId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (source == dv2.c.f325352d) {
            return;
        }
        Q6();
        this.f325392f = source;
        this.f325393g = sessionId;
        java.lang.String T0 = source == dv2.c.f325354f ? g92.b.f351302e.T0() : "";
        if (i17 > 0) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.m112784x9cf0d20b().m112786xd6adfefa(T0, sessionId, bw5.cu.FinderPersonalMsgReadReportScene_Read, new dv2.e(this, source, i17, T0, sessionId));
        } else {
            R6();
        }
    }

    public final void Q6() {
        jz5.f0 f0Var;
        xg3.h0 h0Var = this.f325391e;
        java.lang.String str = this.f325390d;
        if (h0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(h0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, hashCode() + ' ' + this.f325392f + " onMsgChange removeMsgListener " + h0Var.hashCode());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, hashCode() + ' ' + this.f325392f + " onMsgChange removeMsgListener msg change is null!");
        }
        this.f325391e = null;
        this.f325393g = "";
    }

    public final void R6() {
        xg3.h0 h0Var = this.f325391e;
        if (h0Var == null) {
            h0Var = new dv2.g(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(h0Var, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f325390d, hashCode() + ' ' + this.f325392f + " onMsgChange addMsgListener " + h0Var.hashCode());
        }
        this.f325391e = h0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        Q6();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f325394h).mo141623x754a37bb()).mo50300x3fa464aa(O6());
        if (O6().f325346d.length() > 0) {
            O6().run();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        Q6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f325390d = "Finder.ConversationExposeReportUIC";
        this.f325392f = dv2.c.f325352d;
        this.f325393g = "";
        this.f325394h = jz5.h.b(new dv2.d(this));
        this.f325395i = jz5.h.b(dv2.f.f325382d);
    }
}
