package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTingAudioCollectionUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/y00;", "Lcom/tencent/mm/plugin/finder/feed/w00;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTingAudioCollectionUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI<com.tencent.mm.plugin.finder.feed.y00, com.tencent.mm.plugin.finder.feed.w00> {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.w00 f109568t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.y00 f109569u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader f109570v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109571w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.wm(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109572x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.vm(this));

    /* renamed from: y, reason: collision with root package name */
    public int f109573y;

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.k0 c7() {
        com.tencent.mm.plugin.finder.feed.w00 w00Var = this.f109568t;
        if (w00Var != null) {
            return w00Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.a1 d7() {
        com.tencent.mm.plugin.finder.feed.y00 y00Var = this.f109569u;
        if (y00Var != null) {
            return y00Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void f7() {
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f109573y = getIntent().getIntExtra("key_audio_collection_count", 0);
        setMMTitle(getResources().getString(com.tencent.mm.R.string.f0b, java.lang.Integer.valueOf(this.f109573y)));
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_biz_username");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader = new com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader(stringExtra, V6);
        finderAudioCollectionLoader.initFromCache(getIntent());
        finderAudioCollectionLoader.f107394e = new com.tencent.mm.plugin.finder.feed.ui.tm(this, finderAudioCollectionLoader);
        this.f109570v = finderAudioCollectionLoader;
        int integer = V6 != null ? V6.getInteger(5) : 0;
        com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader2 = this.f109570v;
        if (finderAudioCollectionLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f109568t = new com.tencent.mm.plugin.finder.feed.w00(this, 2, integer, finderAudioCollectionLoader2, stringExtra2 != null ? new jz5.l(stringExtra2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_audio_category_type", -1))) : null);
        com.tencent.mm.plugin.finder.feed.y00 y00Var = new com.tencent.mm.plugin.finder.feed.y00(this, 2, V6 != null ? V6.getInteger(5) : 0, false, 0, ((java.lang.Boolean) ((jz5.n) this.f109572x).getValue()).booleanValue() && ((java.lang.Boolean) ((jz5.n) this.f109571w).getValue()).booleanValue(), 24, null);
        this.f109569u = y00Var;
        com.tencent.mm.plugin.finder.feed.w00 w00Var = this.f109568t;
        if (w00Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        y00Var.f106182o = w00Var;
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            return;
        }
        dy1.a.f(this, iy1.c.FinderTingAudioCollectionUI);
        dy1.a.h(this, 12, 29426);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.um(stringExtra2));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ae8;
    }
}
