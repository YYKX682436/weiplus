package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y80 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f218070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 f218071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f218072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 f218073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218074h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var, android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f218070d = z17;
        this.f218071e = e90Var;
        this.f218072f = frameLayout;
        this.f218073g = v80Var;
        this.f218074h = view;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var, android.widget.FrameLayout frameLayout, android.view.View view) {
        android.content.Context context;
        if (v80Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = v80Var.f217756a;
            java.lang.String P6 = e90Var.P6(abstractC14490x69736cb5.mo2128x1ed62e84());
            if (v80Var.f217757b.compareTo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217642e) >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, view, "listen_page_thumbnail", "view_unexp", true, e90Var.Q6(abstractC14490x69736cb5), null, 32, null);
            }
            if (abstractC14490x69736cb5.getEnhanceFromEventType() == 16 && !v80Var.f217758c && v80Var.f217757b != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217641d && !v80Var.f217759d && (context = view.getContext()) != null) {
                hc2.v0.c(context, iy1.c.FinderBreakReminder, "page_out", false, kz5.b1.e(new jz5.l("feed_id", P6)), 4, null);
            }
            if (v80Var.f217757b != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217643f) {
                e90Var.U6(abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217641d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", "flutterContainerClose, feedId = " + P6 + '}');
        }
        pi0.n1 n1Var = e90Var.f215767g;
        if (n1Var != null) {
            n1Var.a();
        }
        e90Var.f215767g = null;
        e90Var.f215771n = null;
        frameLayout.setVisibility(8);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y80(this.f218070d, this.f218071e, this.f218072f, this.f218073g, this.f218074h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y80 y80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y80) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y80Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f218070d;
        android.view.View view = this.f218074h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var = this.f218073g;
        android.widget.FrameLayout frameLayout = this.f218072f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var = this.f218071e;
        if (z17) {
            float f17 = com.p314xaae8f345.mm.ui.bh.a(e90Var.m80379x76847179()).f278669b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar = e90Var.f215768h;
            if (rcVar != null) {
                rcVar.a(true);
            }
            android.view.ViewPropertyAnimator animate = frameLayout.animate();
            animate.setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w80(e90Var));
            animate.setDuration(300L).translationY(f17).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x80(e90Var, v80Var, frameLayout, view)).start();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar2 = e90Var.f215768h;
            if (rcVar2 != null) {
                rcVar2.a(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar3 = e90Var.f215768h;
            if (rcVar3 != null) {
                rcVar3.c(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar4 = e90Var.f215768h;
            if (rcVar4 != null) {
                rcVar4.a(false);
            }
            a(v80Var, e90Var, frameLayout, view);
        }
        return jz5.f0.f384359a;
    }
}
