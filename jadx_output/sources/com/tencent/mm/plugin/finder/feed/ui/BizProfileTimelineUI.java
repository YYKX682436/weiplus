package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileLoader;", "Lab2/h0;", "Lab2/g0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BizProfileTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader, ab2.h0, ab2.g0> {
    public java.lang.Boolean A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public ab2.g0 f109195x;

    /* renamed from: y, reason: collision with root package name */
    public ab2.h0 f109196y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader f109197z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 120;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.f109197z;
        if (finderBizProfileLoader != null) {
            return finderBizProfileLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        ab2.g0 g0Var = this.f109195x;
        if (g0Var != null) {
            return g0Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.util.List dataListJustForAdapter;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E1).getValue()).r()).intValue() == 1 && this.B && kotlin.jvm.internal.o.b(this.A, java.lang.Boolean.TRUE)) ? false : true) {
            ab2.g0 g0Var = this.f109195x;
            if (g0Var == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = g0Var.f106570t;
            if (baseFeedLoader != null && (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) != null) {
                android.content.Intent intent = getIntent();
                ab2.g0 g0Var2 = this.f109195x;
                if (g0Var2 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = g0Var2.f106570t;
                hc2.e0.b(intent, 0, dataListJustForAdapter, baseFeedLoader2 != null ? baseFeedLoader2.getLastBuffer() : null, null);
                setResult(-1, getIntent());
            }
        } else {
            com.tencent.mars.xlog.Log.i("BizProfileTimelineUI", "can't save loader data,because hasFinish=" + this.B + ",needBackData=" + this.A);
        }
        super.finish();
        this.B = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        ab2.h0 h0Var = this.f109196y;
        if (h0Var != null) {
            return h0Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aec;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        if (getIntent().hasExtra("KEY_REQUEST_BACK_DATA")) {
            this.A = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("KEY_REQUEST_BACK_DATA", false));
        }
        ab2.g0 g0Var = new ab2.g0(this);
        this.f109195x = g0Var;
        this.f109196y = new ab2.h0(this, g0Var, 2, 120);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_BIZ_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = new com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader(stringExtra, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), true, false, 8, null);
        finderBizProfileLoader.initFromCache(getIntent());
        finderBizProfileLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.a(this, finderBizProfileLoader));
        finderBizProfileLoader.f102772h = new com.tencent.mm.plugin.finder.feed.ui.b(this);
        this.f109197z = finderBizProfileLoader;
        java.lang.System.currentTimeMillis();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BizProfileTimelineUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "BizProfileTimelineUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, be1.r0.CTRL_INDEX, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.c(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.System.currentTimeMillis();
    }
}
