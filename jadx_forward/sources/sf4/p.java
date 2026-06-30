package sf4;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489081a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 f489082b;

    /* renamed from: c, reason: collision with root package name */
    public final sf4.w f489083c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f489084d;

    /* renamed from: e, reason: collision with root package name */
    public final sf4.o f489085e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f489086f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f489087g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 gallery, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 recyclerView, sf4.w pageScrollHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gallery, "gallery");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageScrollHelper, "pageScrollHelper");
        this.f489081a = gallery;
        this.f489082b = recyclerView;
        this.f489083c = pageScrollHelper;
        sf4.o oVar = new sf4.o(this);
        this.f489085e = oVar;
        if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC, false)) {
            this.f489086f = sf4.l.f489057d;
            pageScrollHelper.b(recyclerView);
        } else {
            sf4.m mVar = new sf4.m(this);
            this.f489086f = mVar;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(mVar, 5000L);
            recyclerView.i(oVar);
        }
    }
}
