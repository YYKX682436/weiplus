package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes7.dex */
public final class uo extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements xp0.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217681d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f217682e;

    /* renamed from: f, reason: collision with root package name */
    public int f217683f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f217684g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f217685h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f217686i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 f217687m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217681d = new java.util.concurrent.ConcurrentHashMap();
        this.f217682e = new java.util.ArrayList();
    }

    public final void O6() {
        if (this.f217684g) {
            return;
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e29 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.qyf);
        this.f217687m = c10860xa01d8e29;
        if (c10860xa01d8e29 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "no holder:".concat(m158354x19263085().getClass().getSimpleName()));
            return;
        }
        s12.f fVar = (s12.f) ((xp0.f) i95.n0.c(xp0.f.class));
        synchronized (fVar) {
            rk0.c.c("MagicFinderEmojiService", "createBiz", new java.lang.Object[0]);
            if (fVar.f483662d != null) {
                rk0.c.b("MagicFinderEmojiService", "has created", new java.lang.Object[0]);
            } else {
                s12.e eVar = new s12.e(this);
                fVar.f483662d = eVar;
                eVar.V0();
            }
        }
        this.f217684g = true;
    }

    public final void P6() {
        if (this.f217684g) {
            s12.f fVar = (s12.f) ((xp0.f) i95.n0.c(xp0.f.class));
            synchronized (fVar) {
                rk0.c.c("MagicFinderEmojiService", "destroyBiz", new java.lang.Object[0]);
                s12.e eVar = fVar.f483662d;
                if (eVar != null) {
                    jc3.j0 j0Var = eVar.f529908f;
                    if (j0Var != null) {
                        ((rc3.w0) j0Var).m162151x5cd39ffa();
                    }
                    bf3.p pVar = eVar.f529909g;
                    if (pVar != null) {
                        pVar.b();
                    }
                    eVar.f529908f = null;
                    eVar.f529909g = null;
                }
                fVar.f483662d = null;
            }
            this.f217682e.clear();
            this.f217684g = false;
        }
    }

    public final java.lang.String Q6(long j17) {
        return m158354x19263085().getClass().getSimpleName() + '-' + j17;
    }

    public final void R6(android.view.View view, java.lang.String emojiKey, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiKey, "emojiKey");
        if (!this.f217684g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "not create:".concat(m158354x19263085().getClass().getSimpleName()));
            return;
        }
        java.lang.String Q6 = Q6(j17);
        if (this.f217681d.containsKey(Q6) && z17) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ro(Q6, this, view, emojiKey, z17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f217683f = com.p314xaae8f345.mm.ui.bl.i(m158354x19263085(), -1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f217681d.clear();
        P6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (this.f217685h) {
            P6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f217685h) {
            O6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f217681d = new java.util.concurrent.ConcurrentHashMap();
        this.f217682e = new java.util.ArrayList();
    }
}
