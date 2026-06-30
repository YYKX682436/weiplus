package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/o9;", "Lcom/tencent/mm/plugin/finder/feed/n9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedRelatedTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.o9, com.tencent.mm.plugin.finder.feed.n9> {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f109238J = 0;
    public com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader A;
    public long C;
    public boolean F;
    public android.view.View H;

    /* renamed from: x, reason: collision with root package name */
    public long f109239x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.n9 f109240y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.o9 f109241z;
    public final int B = 2;
    public java.lang.String D = "";
    public java.lang.String E = "";
    public final jz5.g G = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.p2(this));
    public final com.tencent.mm.plugin.finder.feed.ui.o2 I = new com.tencent.mm.plugin.finder.feed.ui.o2(this);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        if (17 == k7()) {
            return 96;
        }
        return 24 == k7() ? 116 : 40;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.A;
        if (finderFeedRelTimelineLoader != null) {
            return finderFeedRelTimelineLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.n9 n9Var = this.f109240y;
        if (n9Var != null) {
            return n9Var;
        }
        kotlin.jvm.internal.o.o("mPresenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.o9 o9Var = this.f109241z;
        if (o9Var != null) {
            return o9Var;
        }
        kotlin.jvm.internal.o.o("mViewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ai8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0115, code lost:
    
        if ((!r2.isEmpty()) == true) goto L24;
     */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI.h7():void");
    }

    public final int k7() {
        return ((java.lang.Number) ((jz5.n) this.G).getValue()).intValue();
    }

    public final void l7() {
        java.lang.String str;
        java.lang.String string;
        finish();
        if (24 == k7()) {
            r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f109239x;
            long j18 = currentTimeMillis - j17;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.A;
            if (finderFeedRelTimelineLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            r45.qt2 contextObj = finderFeedRelTimelineLoader.getContextObj();
            if (contextObj == null || (str = contextObj.getString(2)) == null) {
                str = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String e17 = v52.c.g().e();
            p52.d[] dVarArr = p52.d.f352007d;
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader2 = this.A;
            if (finderFeedRelTimelineLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            r45.qt2 contextObj2 = finderFeedRelTimelineLoader2.getContextObj();
            ((q30.k) pVar).wi(new q52.e(Ri, "FinderFeedRelatedTimelineUI", j18, j17, currentTimeMillis2, str, e17, 1, false, r30.m.f368946a, null, (contextObj2 == null || (string = contextObj2.getString(1)) == null) ? "" : string, false, 0, false, 0, hashCode(), null, 193792, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        l7();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.o9 o9Var = this.f109241z;
        if (o9Var == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        o9Var.getRecyclerView().V0(this.I);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        java.lang.String str;
        java.lang.String string;
        super.onPause();
        if (17 == k7()) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.o9 o9Var = this.f109241z;
        if (o9Var == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        zy2.zb.Kh(zbVar, o9Var.getRecyclerView(), ml2.x1.f328203g, "40", ml2.y.f328241f, 0, 0L, 0, 112, null);
        if (24 == k7()) {
            r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = r30.p.f368949f1;
            long j17 = currentTimeMillis - r30.o.f368947a;
            long j18 = r30.o.f368947a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.A;
            if (finderFeedRelTimelineLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            r45.qt2 contextObj = finderFeedRelTimelineLoader.getContextObj();
            if (contextObj == null || (str = contextObj.getString(2)) == null) {
                str = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String e17 = v52.c.g().e();
            p52.d[] dVarArr = p52.d.f352007d;
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader2 = this.A;
            if (finderFeedRelTimelineLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            r45.qt2 contextObj2 = finderFeedRelTimelineLoader2.getContextObj();
            ((q30.k) pVar).wi(new q52.e(Ri, "FinderFeedRelatedTimelineUI", j17, j18, currentTimeMillis2, str, e17, 0, false, r30.m.f368946a, null, (contextObj2 == null || (string = contextObj2.getString(1)) == null) ? "" : string, false, 0, false, 0, 0, null, 259328, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (17 == k7()) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.o9 o9Var = this.f109241z;
        if (o9Var == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        zy2.zb.Kh(zbVar, o9Var.getRecyclerView(), ml2.x1.f328203g, "40", ml2.y.f328240e, 0, 0L, 0, 112, null);
        if (24 == k7()) {
            int i17 = r30.p.f368949f1;
            r30.o.f368947a = java.lang.System.currentTimeMillis();
        }
    }
}
