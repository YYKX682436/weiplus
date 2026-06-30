package nr2;

/* loaded from: classes2.dex */
public final class e implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr2.l f420710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f420711b;

    public e(nr2.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f) {
        this.f420710a = lVar;
        this.f420711b = c15343x638a173f;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        nr2.l lVar = this.f420710a;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoursePreviewItemUIC", "requestInit CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f492089b = 16;
        nr2.m mVar = lVar.f420790m;
        q6Var.f492092e = mVar != null ? mVar.l() : 0L;
        p3325xe03a0797.p3326xc267989b.l.d(lVar.f420786f, null, null, new nr2.h(lVar, q6Var, this.f420711b, null), 3, null);
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        nr2.l lVar = this.f420710a;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoursePreviewItemUIC", "requestLoadMore CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f492089b = 16;
        nr2.m mVar = lVar.f420790m;
        q6Var.f492092e = mVar != null ? mVar.l() : 0L;
        q6Var.f492088a = lVar.f420791n;
        p3325xe03a0797.p3326xc267989b.l.d(lVar.f420786f, null, null, new nr2.k(lVar, q6Var, this.f420711b, null), 3, null);
        return true;
    }
}
