package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lq40/g;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment */
/* loaded from: classes2.dex */
public class C15106x1388ca00 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 implements q40.g {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f210664t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a f210665u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x f210666v;

    /* renamed from: w, reason: collision with root package name */
    public q40.h f210667w;

    public C15106x1388ca00(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f210664t = "Finder.GlobalFavFeedFragment_".concat(source);
    }

    public void A0() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd.class)).f215926d = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar = this.f210666v;
            if (xVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.app.Activity context = xVar.f210750a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd.class)).f215927e.clear();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = xVar.d().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a B0() {
        q40.h hVar = this.f210667w;
        return hVar != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g(hVar) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x C0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m7548xe6e42394 = m7548xe6e42394();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7548xe6e42394, "requireActivity(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x(m7548xe6e42394, this, presenter, view);
    }

    public void F0(java.util.List positionList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positionList, "positionList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar = this.f210666v;
        if (xVar != null) {
            xVar.i(positionList);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570356ak1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class});
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a aVar = this.f210665u;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        aVar.mo979x3f5eee52();
        this.f210667w = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        if (this.f210667w != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class)).R6(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        if (this.f210667w != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class)).R6(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210664t, "onViewCreated action=" + this.f210667w);
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a B0 = B0();
        this.f210665u = B0;
        if (B0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x C0 = C0(view, B0);
        this.f210666v = C0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a aVar = this.f210665u;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        if (C0 != null) {
            aVar.h(C0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF203048s() {
        return this.f210667w != null ? 188 : 164;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public void w0() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, mo7430x19263085, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Wj(mo7430x19263085, intent, 7, kz5.p0.f395529d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public int x0() {
        return 3;
    }

    public void y0(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar = this.f210666v;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        if (i17 == 1 && i18 == -1) {
            int intExtra = intent != null ? intent.getIntExtra("DATA_SIZE", 0) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a aVar = xVar.f210752c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g gVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g) aVar : null;
            if (gVar == null) {
                return;
            }
            java.util.ArrayList arrayList = gVar.f210681d;
            if (intExtra > arrayList.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavViewCallback", "onActivityResult detailSize: " + intExtra + ", listSize:" + arrayList.size());
                int size = intExtra - arrayList.size();
                o72.f4 f4Var = (o72.f4) i95.n0.c(o72.f4.class);
                int h17 = kz5.c0.h(arrayList);
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d3) f4Var).getClass();
                jz5.l c17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h3.f182661c.a().c(h17, size);
                gVar.v((java.util.List) c17.f384367e, false, ((java.lang.Boolean) c17.f384366d).booleanValue());
            }
        }
    }

    public void z0(int i17) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd.class)).f215926d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar = this.f210666v;
            if (xVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            so2.j5 j5Var = (so2.j5) kz5.n0.a0(xVar.f210752c.c(), i17);
            if (j5Var != null) {
                android.app.Activity context = xVar.f210750a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd fdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd.class);
                fdVar.f215927e.put(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()), java.lang.Boolean.TRUE);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = xVar.d().mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            }
        }
    }
}
