package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment */
/* loaded from: classes2.dex */
public final class C14067x53338e9a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no f191023t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to f191024u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd f191025v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f191028y;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f191026w = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f191027x = true;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f191029z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wh(this));

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        if (m7436x8619eaa0 != null) {
            java.lang.String string = m7436x8619eaa0.getString("byPassInfo", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            this.f191026w = string;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPostPlayProfilePage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "cluster_profile");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yh(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        return inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.edc, viewGroup, false);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar = this.f191023t;
        if (noVar != null) {
            noVar.mo979x3f5eee52();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [com.tencent.mm.plugin.finder.feed.FinderPostPlaySquareContainerContract$ViewCallback$initView$2] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        c13883xc81866dd.f189106d = this.f210798p;
        java.lang.String str = this.f191026w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c13883xc81866dd.f189107e = str;
        c13883xc81866dd.m56375x868b9334(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xh(this));
        this.f191025v = c13883xc81866dd;
        jz5.g gVar = this.f191029z;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd2 = this.f191025v;
        if (c13883xc81866dd2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        this.f191023t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no(abstractActivityC21394xb3d2c0cf, c13883xc81866dd2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((jz5.n) gVar).mo141623x754a37bb(), this, view, this.f191027x);
        this.f191024u = toVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar = this.f191023t;
        if (noVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        toVar.f190628i = noVar;
        noVar.f190121e = toVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mo moVar = noVar.f190122f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = noVar.f190120d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(abstractC13834x56f46d28, moVar, false, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar2 = noVar.f190121e;
        if (toVar2 != null) {
            java.util.ArrayList data = abstractC13834x56f46d28.m56388xcaeb60d0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            android.view.View findViewById = toVar2.f190625f.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            toVar2.f190629m = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
            toVar2.g();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = toVar2.g().m82555x4905e9fa();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = toVar2.f190623d;
            m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.po poVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.po(data, new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderPostPlaySquareContainerContract$ViewCallback$initView$2
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return type == so2.t4.class.hashCode() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
            });
            toVar2.f190630n = poVar;
            m82555x4905e9fa.mo7960x6cab2c8d(poVar);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = toVar2.f190630n;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qo(toVar2);
            android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf2, com.p314xaae8f345.mm.R.C30864xbddafb2a.bsd, null);
            inflate.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2));
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById2 == null) {
                num = 8;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                num = 8;
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilh);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(num);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            toVar2.g().m82697xe136b7d8(new android.widget.ImageView(abstractActivityC21394xb3d2c0cf2));
            toVar2.f190631o = inflate;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = toVar2.f190630n;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf2.O(inflate, toVar2.f190632p, false);
            toVar2.g().m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.so(toVar2));
            toVar2.g().m82690xd3a27e96(false);
            m82555x4905e9fa.i(toVar2.f190633q);
            if (!toVar2.f190626g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(toVar2.f190627h, "onViewPrepared: skip auto load data");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar2 = toVar2.f190628i;
            if (noVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(noVar2.f190120d, false, 1, null);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.T(toVar2.g(), 0, false, null, 7, null);
        }
    }
}
