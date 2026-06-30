package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/go;", "Lcom/tencent/mm/plugin/finder/feed/fo;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPoiTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader, com.tencent.mm.plugin.finder.feed.go, com.tencent.mm.plugin.finder.feed.fo> {
    public android.view.View A;
    public final int B = 2;
    public long C;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.fo f109487x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.go f109488y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader f109489z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        android.content.Intent intent = getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        zy2.o9 o9Var = serializableExtra instanceof zy2.o9 ? (zy2.o9) serializableExtra : null;
        java.io.Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("key_half_screen_mode") : null;
        la2.a aVar = serializableExtra2 instanceof la2.a ? (la2.a) serializableExtra2 : null;
        if (o9Var == zy2.o9.f477516d) {
            return 96;
        }
        return aVar == la2.a.f317501e ? 303 : 27;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader = this.f109489z;
        if (finderPoiTimelineLoader != null) {
            return finderPoiTimelineLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.fo foVar = this.f109487x;
        if (foVar != null) {
            return foVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.go goVar = this.f109488y;
        if (goVar != null) {
            return goVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b5d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        if ((!r0.isEmpty()) != true) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI.h7():void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.C;
        long j18 = currentTimeMillis - j17;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e17 = v52.c.g().e();
        p52.d[] dVarArr = p52.d.f352007d;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String string = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getString(1);
        if (string == null) {
            string = "";
        }
        q30.k kVar = (q30.k) pVar;
        kVar.wi(new q52.e(Ri, "FinderPoiTimelineUI", j18, j17, currentTimeMillis2, "", e17, 0, false, r30.m.f368946a, null, string, false, 0, false, 0, 0, null, 259328, null));
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.C = java.lang.System.currentTimeMillis();
    }
}
