package lo2;

/* loaded from: classes8.dex */
public final class g0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc f401658a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc) {
        this.f401658a = activityC14486x9c4a98dc;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc = this.f401658a;
        java.lang.String str = activityC14486x9c4a98dc.D;
        java.lang.String str2 = activityC14486x9c4a98dc.E;
        activityC14486x9c4a98dc.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberSearchUI", "requestLoadMore CgiGetFinderSearchMemberZone " + str + ' ' + str2);
        if (!(str2.length() == 0)) {
            if (!(str.length() == 0)) {
                p3325xe03a0797.p3326xc267989b.l.d(activityC14486x9c4a98dc.getLifecycleAsyncScope(), null, null, new lo2.l0(activityC14486x9c4a98dc, str, str2, null), 3, null);
            }
        }
        return true;
    }
}
