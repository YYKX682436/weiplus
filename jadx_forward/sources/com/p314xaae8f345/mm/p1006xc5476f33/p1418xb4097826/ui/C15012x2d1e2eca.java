package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lqb2/t;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment */
/* loaded from: classes10.dex */
public class C15012x2d1e2eca extends com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951<qb2.t> {
    public static final /* synthetic */ int B = 0;

    /* renamed from: z, reason: collision with root package name */
    public ra5.c f210046z;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f210043w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.y0(this));

    /* renamed from: x, reason: collision with root package name */
    public int f210044x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f210045y = -1;
    public final jz5.g A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.c1(this));

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public android.view.View A0() {
        android.widget.TextView emptyTip = K0().f516140c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emptyTip, "emptyTip");
        return emptyTip;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public int B0() {
        return 15;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public android.view.View C0() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 loadingIcon = K0().f516141d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadingIcon, "loadingIcon");
        return loadingIcon;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G0() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 conversationRecyclerView = K0().f516139b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(conversationRecyclerView, "conversationRecyclerView");
        conversationRecyclerView.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.b1(this));
        return conversationRecyclerView;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 H0() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = K0().f516142e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rlLayout, "rlLayout");
        return rlLayout;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public void J0(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f210044x);
        sb6.append('-');
        sb6.append(this.f210045y);
        java.lang.String sql = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("enterFinderConversationPage", r26.i0.u(sql, ',', ';', false, 4, null), j17, "", 0L).a();
    }

    public final vb2.g K0() {
        return (vb2.g) ((jz5.n) this.A).mo141623x754a37bb();
    }

    public void L0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aft;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
        android.content.Context mo7438x76847179 = mo7438x76847179();
        r45.qt2 qt2Var = null;
        if (mo7438x76847179 != null) {
            if (mo7438x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7438x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                qt2Var = nyVar.V6();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a6 a6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206757c;
        if (a6Var.f206482a) {
            a6Var.d(qt2Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206756b.d(qt2Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        ra5.c cVar = this.f210046z;
        if (cVar != null) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(cVar, 200L);
            this.f210046z = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        int i17 = this.f210045y;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1473L, 11L, 1L);
            return;
        }
        if (i17 == 2) {
            int i18 = this.f210044x;
            if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1473L, 12L, 1L);
            } else if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1473L, 13L, 1L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.a t0() {
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        this.f210044x = m7436x8619eaa0 != null ? m7436x8619eaa0.getInt("KEY_TALKER_TYPE", -1) : -1;
        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
        this.f210045y = m7436x8619eaa02 != null ? m7436x8619eaa02.getInt("KEY_TALKER_SCENE", -1) : -1;
        qb2.b0 b0Var = new qb2.b0(this);
        b0Var.f442710s = new qb2.l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.z0.f211607d);
        b0Var.f442709r = new qb2.g0(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a1(this), null, 4, null);
        b0Var.f442708q = this.f210045y;
        b0Var.f442707p = this.f210044x;
        return b0Var;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public java.util.List u0() {
        return kz5.c0.i(((c61.l7) i95.n0.c(c61.l7.class)).Jj(), ((c61.l7) i95.n0.c(c61.l7.class)).ik(), ((c61.l7) i95.n0.c(c61.l7.class)).hk());
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.b y0() {
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        this.f210044x = m7436x8619eaa0 != null ? m7436x8619eaa0.getInt("KEY_TALKER_TYPE", -1) : -1;
        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
        this.f210045y = m7436x8619eaa02 != null ? m7436x8619eaa02.getInt("KEY_TALKER_SCENE", -1) : -1;
        return new qb2.h0((java.lang.String) ((jz5.n) this.f210043w).mo141623x754a37bb(), this.f210044x, this.f210045y);
    }
}
