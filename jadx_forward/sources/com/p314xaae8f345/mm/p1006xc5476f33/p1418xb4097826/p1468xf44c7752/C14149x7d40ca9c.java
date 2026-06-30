package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/gallery/v0;", "Lcom/tencent/mm/plugin/finder/gallery/a0;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment */
/* loaded from: classes2.dex */
public final class C14149x7d40ca9c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0> {
    public static final /* synthetic */ int B = 0;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14150x20233f94 A;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d f192861u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f192862v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0 f192863w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0 f192864x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14152xe4e8bb5f f192865y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f192866z;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$feedProgressListener$1] */
    public C14149x7d40ca9c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d galleryConfig, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryConfig, "galleryConfig");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c.B;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f135783g;
                sb6.append(gaVar.f88282a);
                sb6.append(", progress:");
                sb6.append(gaVar.f88283b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGalleryFragment", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14152xe4e8bb5f c14152xe4e8bb5f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c.this.f192865y;
                if (c14152xe4e8bb5f != null) {
                    c14152xe4e8bb5f.m56136x5a0b1819(gaVar.f88282a);
                    return true;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
        };
        this.f192861u = galleryConfig;
        this.f192862v = z17;
        this.f210798p = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 A0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0 v0Var = this.f192864x;
        if (v0Var != null) {
            return v0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public void C0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        final r45.c41 c41Var = new r45.c41();
        c41Var.set(0, java.lang.Integer.valueOf(this.f210798p));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d dVar = this.f192861u;
        c41Var.set(1, java.lang.Integer.valueOf(dVar.f192893a.f192876b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a aVar = dVar.f192893a;
        byte[] bArr = aVar.f192877c;
        c41Var.set(2, bArr == null ? null : com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        if (this.f192862v) {
            c41Var.set(3, aVar.f192878d);
        }
        if (this.f210798p == 5) {
            this.f192866z = true;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        final r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14152xe4e8bb5f c14152xe4e8bb5f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14152xe4e8bb5f(c41Var, V6) { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$initOnCreate$1
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, mv2.w0
            /* renamed from: onPostStart */
            public void mo55429x74e3dc83(long j17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c c14149x7d40ca9c = this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0 v0Var = c14149x7d40ca9c.f192864x;
                if (v0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                android.view.View t17 = v0Var.t();
                if (t17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "onPostStart", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(t17, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "onPostStart", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0 v0Var2 = c14149x7d40ca9c.f192864x;
                if (v0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                v0Var2.f187713m.setVisibility(0);
                super.mo55429x74e3dc83(j17);
            }
        };
        this.f192865y = c14152xe4e8bb5f;
        c14152xe4e8bb5f.m56375x868b9334(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.n(this));
        c14152xe4e8bb5f.f192871f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.o(this);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y07 = y0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14152xe4e8bb5f c14152xe4e8bb5f2 = this.f192865y;
        if (c14152xe4e8bb5f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        this.f192863w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0(y07, c14152xe4e8bb5f2, dVar, this.f210798p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.p(view, y0(), dVar, this.f210798p);
        this.f192864x = pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0 a0Var = this.f192863w;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        pVar.f187715o = a0Var;
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ajk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        if (this.f192866z) {
            return;
        }
        this.f192866z = true;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.q(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15117x9a4d16cb
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0 a0Var = this.f192863w;
        if (a0Var != null) {
            return a0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }
}
