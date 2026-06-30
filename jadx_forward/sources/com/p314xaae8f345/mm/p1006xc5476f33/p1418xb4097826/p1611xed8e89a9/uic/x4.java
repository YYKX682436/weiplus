package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class x4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f205875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f205876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205877f;

    public x4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce) {
        this.f205876e = componentCallbacksC1101xa17d4670;
        this.f205877f = c14889x51ce1ce;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            if (this.f205875d > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205877f;
                long longExtra = c14889x51ce1ce.m158359x1e885992().getLongExtra("finder_from_feed_id", 0L);
                java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra, c14889x51ce1ce.m158359x1e885992().getStringExtra("finder_from_feed_dup_flag"), c14889x51ce1ce.m158359x1e885992().getIntExtra("finder_from_feed_comment_scene", 0));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[5];
                lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(longExtra));
                lVarArr[1] = new jz5.l("source_feed_sessionbuffer", ek6);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                lVarArr[3] = new jz5.l("finder_context_id", b52.b.b());
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = c14889x51ce1ce.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                lVarArr[4] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
                ((cy1.a) rVar).yj("page_slide_down", null, kz5.c1.k(lVarArr), 1, true);
            }
            this.f205875d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recycleView, int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m58672x4905e9fa;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m58672x4905e9fa2;
        int m58669xc4f7ae38;
        long m58668x57d8d399;
        int m58667x412701ad;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recycleView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycleView, "recycleView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileFeedUIC", "profileScroll fromScroll");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f205876e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205877f;
        m58672x4905e9fa = c14889x51ce1ce.m58672x4905e9fa();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m58672x4905e9fa, "access$getRecyclerView(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4) a17).T6(m58672x4905e9fa, false, 11);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        m58672x4905e9fa2 = c14889x51ce1ce.m58672x4905e9fa();
        ml2.x1 x1Var = ml2.x1.f409735f;
        ml2.q1 q1Var = ml2.q1.f409345e;
        ml2.y yVar = ml2.y.f409772d;
        m58669xc4f7ae38 = c14889x51ce1ce.m58669xc4f7ae38();
        m58668x57d8d399 = c14889x51ce1ce.m58668x57d8d399();
        m58667x412701ad = c14889x51ce1ce.m58667x412701ad();
        ((ml2.j0) zbVar).oj(m58672x4905e9fa2, x1Var, "temp_5", yVar, m58669xc4f7ae38, m58668x57d8d399, m58667x412701ad);
        this.f205875d += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
