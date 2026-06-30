package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFloatBallDetailLoader;", "Lcom/tencent/mm/plugin/finder/feed/z9;", "Lcom/tencent/mm/plugin/finder/feed/y9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderFloatBallDetailUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader, com.tencent.mm.plugin.finder.feed.z9, com.tencent.mm.plugin.finder.feed.y9> {
    public boolean A;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.y9 f109242x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.z9 f109243y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader f109244z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 113;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f109244z;
        if (finderFloatBallDetailLoader != null) {
            return finderFloatBallDetailLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.y9 y9Var = this.f109242x;
        if (y9Var != null) {
            return y9Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.z9 z9Var = this.f109243y;
        if (z9Var != null) {
            return z9Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.acp;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        this.A = getIntent().getByteArrayExtra("KEY_FLOAT_BALL_INFO") != null;
        com.tencent.mm.plugin.finder.feed.y9 y9Var = new com.tencent.mm.plugin.finder.feed.y9(this);
        this.f109242x = y9Var;
        this.f109243y = new com.tencent.mm.plugin.finder.feed.z9(this, y9Var, 2, getD());
        com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderFloatBallDetailLoader.f107453d = getIntent().getLongExtra("KEY_CACHE_OBJECT_ID", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_CACHE_OBJECT_NONCE_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        finderFloatBallDetailLoader.f107454e = stringExtra;
        finderFloatBallDetailLoader.initFromCache(getIntent());
        finderFloatBallDetailLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.s2(this, finderFloatBallDetailLoader));
        this.f109244z = finderFloatBallDetailLoader;
        ((com.tencent.mm.plugin.finder.viewmodel.component.f2) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class)).f134321i = this.A;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }
}
