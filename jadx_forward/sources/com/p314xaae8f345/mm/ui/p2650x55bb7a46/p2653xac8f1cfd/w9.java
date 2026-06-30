package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.n0.class)
/* loaded from: classes7.dex */
public final class w9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.n0, a12.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f281694e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f281695f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f281696g;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (m0()) {
            this.f281695f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "onChattingExitAnimEnd, component:" + hashCode());
            ((a12.s) ((a12.k) i95.n0.c(a12.k.class))).Ni();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "onComponentInstall, this:" + hashCode());
        }
    }

    public final boolean m0() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(this.f280113d.x());
    }

    public void n0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "markAllView update isForeGround:" + this.f281695f);
        o0();
        if (this.f281695f) {
            this.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    public final void o0() {
        for (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var : this.f281694e.values()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g0Var);
            p0(g0Var, true);
        }
    }

    public final void p0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 m80051xdfe7150c = g0Var.m80051xdfe7150c(this.f280113d);
        if (m80051xdfe7150c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "holder msg is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = m80051xdfe7150c.f275460g2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a9Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgEcsKFDynamicCard.MsgExtInfoAppMsgEcsKFDynamicCard");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f6 f6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f6) a9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "EcsKF markViewUpdate msgid: " + m80051xdfe7150c.m124847x74d37ac6() + ", msg extinfo oldrefresh:" + f6Var.f285476d + ", newrefresh:" + z17);
        f6Var.f285476d = z17;
        m80051xdfe7150c.f275460g2 = f6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (m0()) {
            a12.k kVar = (a12.k) i95.n0.c(a12.k.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "onChattingResume, component:" + kVar.hashCode());
            this.f281695f = true;
            a12.s sVar = (a12.s) kVar;
            sVar.f82058f = new java.lang.ref.WeakReference(this);
            this.f281696g = this.f280113d.c(com.p314xaae8f345.mm.R.id.f565216bp0);
            o0();
            if (!sVar.f82059g) {
                sVar.Ai();
            }
            this.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "onChattingPause, component:" + hashCode());
            this.f281695f = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        android.util.LruCache lruCache;
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "onChattingEnterAnimStart, component:" + hashCode());
            a12.s sVar = (a12.s) ((a12.k) i95.n0.c(a12.k.class));
            sVar.getClass();
            sVar.f82058f = new java.lang.ref.WeakReference(this);
            int i17 = 0;
            this.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c("ilinkres_8f0d67bd");
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
            java.lang.String x17 = this.f280113d.x();
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i18 = this.f280113d.i();
            if (x17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: empty talker, skip");
                return;
            }
            android.util.LruCache lruCache2 = y00.h.f540060a;
            if (!(x17.length() == 0) && (lruCache = (android.util.LruCache) y00.h.f540060a.get(x17)) != null) {
                i17 = lruCache.size();
            }
            if (i17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: memcache already populated, skip talker=%s cached=%d", x17, java.lang.Integer.valueOf(i17));
                return;
            }
            if (i18 == null) {
                i18 = gm0.j1.b().f354778h.f354678e;
            }
            if (i18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: no available scope, talker=%s", x17);
            } else {
                v65.i.b(i18, null, new y00.d0(x17, null), 1, null);
            }
        }
    }
}
