package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/feed/l7;", "Lcom/tencent/mm/plugin/finder/feed/i7;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment */
/* loaded from: classes2.dex */
public final class C15118xbecd3ba3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i7> {
    public boolean A;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i7 f210788u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 f210789v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 f210790w;

    /* renamed from: x, reason: collision with root package name */
    public final int f210791x = 2;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f210792y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.HashSet f210793z;

    public C15118xbecd3ba3() {
        this.f210798p = 100;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 A0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var = this.f210789v;
        if (l7Var != null) {
            return l7Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public void C0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f210793z = new java.util.HashSet();
        F0(0);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 c13859xe71bc226 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226(e17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), false);
        c13859xe71bc226.m56375x868b9334(new wu2.g(this, c13859xe71bc226));
        c13859xe71bc226.f188943f = new wu2.h(this);
        this.f210790w = c13859xe71bc226;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y07 = y0();
        int i17 = this.f210791x;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y08 = y0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = y08 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) y08 : null;
        this.f210788u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i7(y07, this, i17, abstractActivityC15087xee12defa != null ? abstractActivityC15087xee12defa.getD() : 0, G0());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y09 = y0();
        int i18 = this.f210791x;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y010 = y0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa2 = y010 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) y010 : null;
        wu2.i iVar = new wu2.i(this, view, y09, i18, abstractActivityC15087xee12defa2 != null ? abstractActivityC15087xee12defa2.getD() : 0);
        this.f210789v = iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i7 i7Var = this.f210788u;
        if (i7Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        iVar.T(i7Var);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$initOnCreate$3
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new wu2.j(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3.this));
                return true;
            }
        };
        this.f210792y = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        y0().m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f572949d10, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new wu2.k(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public void F0(int i17) {
        java.lang.String str;
        r45.rl2 a17 = cu2.f0.f303924a.a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
        if (a17 == null || (str = a17.m75945x2fec8307(1)) == null) {
            str = "";
        }
        java.lang.String string = i17 > 0 ? y0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuq, java.lang.Integer.valueOf(i17)) : y0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            int dimension = (int) y0().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            y0().mo56583xbf7c1df6(hc2.x0.k(string, y0(), '#', com.p314xaae8f345.mm.R.raw.f80315x74d6a2b9, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.A));
            wu2.m mVar = new wu2.m(this, string);
            b17.getClass();
            b17.f529406d = mVar;
            b17.a();
        }
        android.widget.TextView m78519xb1736e47 = y0().m78519xb1736e47();
        if (m78519xb1736e47 != null) {
            m78519xb1736e47.setContentDescription(y0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cur));
        }
        super.F0(i17);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 G0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 c13859xe71bc226 = this.f210790w;
        if (c13859xe71bc226 != null) {
            return c13859xe71bc226;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.agx;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f210792y;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        super.mo7504xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        java.util.HashSet hashSet = this.f210793z;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                G0().mo56120xc84af884(longValue, true);
                bu2.e0.f106031a.e(longValue, 10);
                if (G0().m56393xfb854877() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var = this.f210789v;
                    if (l7Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    l7Var.U();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var2 = this.f210789v;
                    if (l7Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    android.view.View f294968x = l7Var2.f187713m.getF294968x();
                    if (f294968x != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(f294968x, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment", "checkEmptyOnUnFav", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f294968x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment", "checkEmptyOnUnFav", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        java.util.HashSet hashSet2 = this.f210793z;
        if ((hashSet2 != null ? hashSet2.size() : 0) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var3 = this.f210789v;
            if (l7Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            l7Var3.W();
        }
        F0(G0().f188944g);
        if (this.A) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7 l7Var4 = this.f210789v;
            if (l7Var4 != null) {
                l7Var4.W();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209428q8).mo141623x754a37bb()).r()).booleanValue() ? 163 : 24;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public void w0() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i7 i7Var = this.f210788u;
        if (i7Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = i7Var.f188689e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 c13859xe71bc226 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226) abstractC13919x46aff122 : null;
        if (c13859xe71bc226 == null || (arrayList = c13859xe71bc226.f188948n) == null) {
            arrayList = new java.util.ArrayList();
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, y0(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Wj(y0(), intent, 7, arrayList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public int x0() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i7 i7Var = this.f210788u;
        if (i7Var != null) {
            return i7Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }
}
