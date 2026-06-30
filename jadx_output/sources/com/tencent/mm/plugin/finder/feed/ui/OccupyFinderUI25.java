package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI25;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/ui/lg;", "Lcom/tencent/mm/plugin/finder/feed/ui/dg;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class OccupyFinderUI25 extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.ui.lg, com.tencent.mm.plugin.finder.feed.ui.dg> {
    public boolean A;
    public com.tencent.mm.plugin.finder.feed.ui.dg B;
    public com.tencent.mm.plugin.finder.feed.ui.lg C;
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader D;

    /* renamed from: y, reason: collision with root package name */
    public long f109596y;

    /* renamed from: z, reason: collision with root package name */
    public int f109597z;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f109595x = new java.util.ArrayList();
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.fo(this));
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.Cdo(this));
    public final int G = 2;
    public final com.tencent.mm.plugin.finder.feed.ui.eo H = new com.tencent.mm.plugin.finder.feed.ui.eo();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        if (((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue()) {
            return 189;
        }
        jz5.g gVar = this.E;
        if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() != 0) {
            return ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return (((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue() || ((java.lang.Number) ((jz5.n) this.E).getValue()).intValue() != 0) ? 2 : 0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.D;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.ui.dg dgVar = this.B;
        if (dgVar != null) {
            return dgVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.dg dgVar = this.B;
        if (dgVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        intent.putExtra("DATA_SIZE", dgVar.f109946z.size());
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = this.C;
        if (lgVar != null) {
            return lgVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488824ak2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        int i17;
        int i18;
        this.f109596y = getIntent().getLongExtra("KEY_CENTER_FEED_ID", 0L);
        this.f109597z = getIntent().getIntExtra("KEY_CENTER_FEED_POS", 0);
        this.A = getIntent().getBooleanExtra("KEY_HAS_MORE", false);
        long[] longArrayExtra = getIntent().getLongArrayExtra("KEY_FEED_ID_LIST");
        if (longArrayExtra == null) {
            longArrayExtra = new long[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(longArrayExtra.length);
        for (long j17 : longArrayExtra) {
            arrayList.add(java.lang.Long.valueOf(j17));
        }
        this.f109595x = arrayList;
        int i19 = this.f109597z;
        if (i19 > 10) {
            i18 = i19 - 4;
            i17 = i19 + 5;
        } else {
            i17 = 9;
            i18 = 0;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        int h17 = kz5.c0.h(arrayList);
        if (i18 > h17) {
            i18 = h17;
        }
        int i27 = i17 >= 0 ? i17 : 0;
        int h18 = kz5.c0.h(arrayList);
        if (i27 > h18) {
            i27 = h18;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i27);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        com.tencent.mm.plugin.finder.feed.ui.dg dgVar = new com.tencent.mm.plugin.finder.feed.ui.dg(this, this.G, this.f109595x, intValue, intValue2, this.f109596y, this.A);
        this.B = dgVar;
        this.C = new com.tencent.mm.plugin.finder.feed.ui.lg(this, dgVar, this.G, getD());
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = new com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader(this.f109595x, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), intValue, intValue2, this.f109596y, this.A, ((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue());
        finderLocalFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.bo(this, finderLocalFeedLoader));
        this.D = finderLocalFeedLoader;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = this.C;
        if (lgVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        lgVar.getRecyclerView().i(this.H);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4)).setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFavTimelineUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.ik(this, be1.r0.CTRL_INDEX, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.co(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet Q0 = kz5.n0.Q0(super.importUIComponents());
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.h80.class);
        Q0.add(hy2.f.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        return Q0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = this.C;
        if (lgVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        lgVar.getRecyclerView().V0(this.H);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = r30.p.f368949f1;
        long j17 = currentTimeMillis - r30.o.f368948b;
        long j18 = r30.o.f368948b;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String d17 = b52.b.d();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e17 = v52.c.g().e();
        p52.d[] dVarArr = p52.d.f352007d;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        java.lang.String str = r30.m.f368946a;
        kotlin.jvm.internal.o.d(b17);
        ((q30.k) pVar).wi(new q52.e(Ri, "FinderGlobalFavLocalTimelineUI", j17, j18, currentTimeMillis2, d17, e17, 0, false, str, null, b17, false, 0, false, 0, 0, null, 259328, null));
        r30.p pVar2 = (r30.p) i95.n0.c(r30.p.class);
        java.lang.String Ri2 = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - r30.o.f368948b;
        long j19 = r30.o.f368948b;
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String d18 = b52.b.d();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e18 = v52.c.g().e();
        p52.d[] dVarArr2 = p52.d.f352007d;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b18 = b52.b.b();
        java.lang.String str2 = r30.m.f368946a;
        int hashCode = hashCode();
        kotlin.jvm.internal.o.d(b18);
        ((q30.k) pVar2).wi(new q52.e(Ri2, "FinderGlobalFavLocalTimelineUI", currentTimeMillis3, j19, currentTimeMillis4, d18, e18, 1, false, str2, null, b18, false, 0, false, 0, hashCode, null, 193792, null));
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = this.C;
        if (lgVar != null) {
            zy2.zb.Kh(zbVar, lgVar.getRecyclerView(), ml2.x1.f328203g, "21", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = r30.p.f368949f1;
        r30.o.f368948b = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = this.C;
        if (lgVar != null) {
            zy2.zb.Kh(zbVar, lgVar.getRecyclerView(), ml2.x1.f328203g, "21", ml2.y.f328240e, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
