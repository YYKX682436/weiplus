package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderWxConversationFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment */
/* loaded from: classes10.dex */
public final class C15081xfa49f05a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca {
    public static final /* synthetic */ int E = 0;
    public final qb2.t C = new qb2.t();
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15082x6bdebf16 D;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment$notificationListener$1] */
    public C15081xfa49f05a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.D = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5550x7af2989>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment$notificationListener$1
            {
                this.f39173x3fe91575 = -562898023;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5550x7af2989 c5550x7af2989) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5550x7af2989 event = c5550x7af2989;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.td tdVar = event.f135873g;
                if (tdVar == null) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseConversationFragment", "[notificationListener] brief:" + tdVar.f89533a + ", time:" + tdVar.f89534b + ", count:" + tdVar.f89535c);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15081xfa49f05a c15081xfa49f05a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15081xfa49f05a.this;
                qb2.t tVar = c15081xfa49f05a.C;
                tVar.f65870xa35b5abb = tdVar.f89535c;
                tVar.f65871xa783a79b = ((long) tdVar.f89534b) * 1000;
                tVar.f65861x9b4f418d = 0;
                tVar.f65853xf66fcca9 = tdVar.f89533a;
                android.view.View view = c15081xfa49f05a.f287834h;
                if (view == null) {
                    return true;
                }
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sk(c15081xfa49f05a));
                return true;
            }
        };
    }

    public final void M0(boolean z17) {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_TIME_INT_SYNC, 0);
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_BRIEF_STRING_SYNC, "");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_UNREAD_COUNT_INT_SYNC;
        int r18 = c17.r(u3Var, 0);
        if (r17 > 0) {
            long j17 = r17 * 1000;
            qb2.t tVar = this.C;
            tVar.f65871xa783a79b = j17;
            tVar.f65853xf66fcca9 = v17;
            tVar.F1 = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cqn);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = tVar.F1;
            java.lang.String str2 = str != null ? str : "";
            ((ke0.e) xVar).getClass();
            tVar.E1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
            tVar.f65870xa35b5abb = r18;
            tVar.f65861x9b4f418d = 0;
            if (z17) {
                tVar.f65870xa35b5abb = 0;
                gm0.j1.u().c().x(u3Var, 0);
            }
            android.view.View view = this.f287834h;
            if (view != null) {
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tk(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.o1.c(dv2.h.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 1) {
            wn.a w07 = w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationAdapter");
            ((qb2.b0) w07).J("findersayhisessionholder");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) S).h(mo7438x76847179 != null ? xy2.c.e(mo7438x76847179) : null, zy2.y8.f559151n);
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_TIME_INT_SYNC, 0);
        if ((w0() instanceof qb2.i0) && r17 > 0) {
            java.lang.String m7467x2fec8307 = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cqn);
            qb2.t tVar = this.C;
            tVar.F1 = m7467x2fec8307;
            tVar.f65866xbed8694c = "finder_wx_system_message";
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = tVar.F1;
            if (str == null) {
                str = "";
            }
            ((ke0.e) xVar).getClass();
            tVar.E1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
            M0(false);
            wn.a w07 = w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            ((qb2.i0) w07).f442755t.add(tVar);
        }
        super.mo7518x594b1124(view, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.a t0() {
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        int i17 = m7436x8619eaa0 != null ? m7436x8619eaa0.getInt("KEY_TALKER_TYPE", -1) : -1;
        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
        int i18 = m7436x8619eaa02 != null ? m7436x8619eaa02.getInt("KEY_TALKER_SCENE", -1) : -1;
        qb2.i0 i0Var = new qb2.i0(this);
        i0Var.f442710s = new qb2.l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pk.f211183d);
        i0Var.f442709r = new qb2.g0(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qk(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rk(this));
        i0Var.f442708q = i18;
        i0Var.f442707p = i17;
        return i0Var;
    }
}
