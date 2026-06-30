package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/xb;", "Lcom/tencent/mm/plugin/finder/feed/wb;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI */
/* loaded from: classes2.dex */
public final class ActivityC13971x624f6336 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xb, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wb> {
    public static final /* synthetic */ int B = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 A;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wb f190825x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xb f190826y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 f190827z;

    public static final void k7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13971x624f6336 activityC13971x624f6336, boolean z17) {
        activityC13971x624f6336.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHalfScreenUI", "showRetryTips ifShow:" + z17);
        android.view.View findViewById = activityC13971x624f6336.findViewById(com.p314xaae8f345.mm.R.id.m2d);
        if (findViewById != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p5(activityC13971x624f6336, findViewById));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 162;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f190827z;
        if (c13861xc72e20d8 != null) {
            return c13861xc72e20d8;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wb wbVar = this.f190825x;
        if (wbVar != null) {
            return wbVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableActivityAnimation */
    public boolean mo56573xa904b9f2() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xb xbVar = this.f190826y;
        if (xbVar != null) {
            return xbVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ak7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.k5(this));
        long longExtra = getIntent().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_encrypted_object_id");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("feed_object_nonceId");
        java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
        if (longExtra != 0 && (h17 = bu2.j.f106067a.h(longExtra)) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("use cache cacheTime=");
            long j17 = 1000;
            sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, h17.getTimestamps() / j17));
            sb6.append(", cacheTime=");
            sb6.append(h17.getTimestamps());
            sb6.append(" current=");
            sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, c01.id.c() / j17));
            sb6.append(", urlValidDuration=");
            sb6.append(h17.getFeedObject().m76835x9191e3f7());
            sb6.append('s');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHalfScreenUI", sb6.toString());
            if (h17.getTimestamps() <= 0 || c01.id.c() < h17.getTimestamps() + (h17.getFeedObject().m76835x9191e3f7() * 1000)) {
                this.A = cu2.u.f303974a.p(h17);
            }
        }
        if (this.A == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHalfScreenUI", "cache null.show progress");
            l7(true);
        } else {
            l7(false);
        }
        int intExtra = mo55332x76847179().getIntent().getIntExtra("key_reuqest_scene", 31);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8(longExtra, str, str2, getIntent().getIntExtra("tab_type", 301), false, intExtra, "", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), false, 0, false, false, null, null, null, null, null, null, null, null, null, null, 4194048, null);
        c13861xc72e20d8.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l5(this);
        this.f190827z = c13861xc72e20d8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wb wbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wb(this);
        wbVar.f192499z = longExtra;
        wbVar.A = str2;
        wbVar.E = this.A;
        wbVar.B = str;
        wbVar.F = intExtra;
        wbVar.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.m5(this, wbVar);
        wbVar.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n5(this, wbVar);
        this.f190825x = wbVar;
        this.f190826y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xb(this, wbVar, 2, 162);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Rj(this, iy1.a.Finder);
        aVar.ik(this, be1.r0.f4232x366c91de, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o5(this));
    }

    public final void l7(boolean z17) {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gwj);
        if (findViewById == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.j6.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.z6.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.i7.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b7.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.i6.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.d7.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b9.class)));
    }
}
