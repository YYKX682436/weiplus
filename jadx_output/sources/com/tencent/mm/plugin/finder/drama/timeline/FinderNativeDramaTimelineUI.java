package com.tencent.mm.plugin.finder.drama.timeline;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineFeedLoader;", "Lac2/y;", "Lac2/t;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderNativeDramaTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader, ac2.y, ac2.t> {
    public final int A = 2;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader f105300x;

    /* renamed from: y, reason: collision with root package name */
    public ac2.t f105301y;

    /* renamed from: z, reason: collision with root package name */
    public ac2.y f105302z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 356;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = this.f105300x;
        if (finderNativeDramaTimelineFeedLoader != null) {
            return finderNativeDramaTimelineFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        ac2.t tVar = this.f105301y;
        if (tVar != null) {
            return tVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        ac2.y yVar = this.f105302z;
        if (yVar != null) {
            return yVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489047ed1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        long longExtra = getIntent().getLongExtra("native_drama_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("native_drama_export_id");
        long longExtra2 = getIntent().getLongExtra("native_drama_object_id", 0L);
        if (ep1.m.g(getIntent())) {
            longExtra2 = getIntent().getLongExtra("KEY_ENTER_PLAYING_FEED_ID", longExtra2);
            com.tencent.mars.xlog.Log.i("FinderNativeDramaTimelineUI", "fromFloatBall");
        }
        long j17 = longExtra2;
        java.lang.String stringExtra2 = getIntent().getStringExtra("native_drama_export_object_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("native_drama_title");
        int intExtra = getIntent().getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0);
        long longExtra3 = getIntent().getLongExtra("native_drama_enter_object_id", 0L);
        int intExtra2 = getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        java.lang.String stringExtra4 = getIntent().getStringExtra("native_drama_enter_dupflag");
        java.lang.String stringExtra5 = getIntent().getStringExtra("native_drama_session_buffer");
        ac2.t tVar = new ac2.t(this, longExtra, j17, stringExtra5);
        this.f105301y = tVar;
        this.f105302z = new ac2.y(this, tVar, this.A, 356);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ac2.z zVar = new ac2.z(longExtra, null, null, true, true, j17);
        zVar.f3076f = stringExtra;
        zVar.f3077g = stringExtra2;
        arrayList.add(zVar);
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        r45.tj2 tj2Var = new r45.tj2();
        tj2Var.set(0, java.lang.Long.valueOf(longExtra));
        tj2Var.set(1, stringExtra5);
        this.f105300x = new com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader(V6, longExtra3, stringExtra4, intExtra2, intExtra, arrayList, zVar, zVar, tj2Var);
        ac2.y yVar = this.f105302z;
        if (yVar != null) {
            yVar.A(stringExtra3);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.q1.j(super.importUIComponents(), ac2.g.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(zb2.b r29, long r30) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI.k7(zb2.b, long):void");
    }
}
