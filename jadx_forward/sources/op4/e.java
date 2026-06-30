package op4;

/* loaded from: classes10.dex */
public final class e extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce f428803e;

    /* renamed from: f, reason: collision with root package name */
    public uo4.h f428804f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f428805g;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f428803e = pluginLayout;
        this.f428804f = new uo4.h();
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f428824d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7();
        this.f428804f = new uo4.h();
    }

    @Override // op4.k
    public void d() {
        pm0.v.L("MultiVideoPluginLayout_report", true, new op4.d(this, 0L));
    }

    @Override // op4.k
    public java.lang.String g() {
        return "20741";
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (op4.c.f428800a[status.ordinal()] == 1) {
            pm0.v.L("MultiVideoPluginLayout_report", true, new op4.d(this, 1L));
        }
    }
}
