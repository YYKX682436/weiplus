package ka2;

/* loaded from: classes10.dex */
public final class w implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387583a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        this.f387583a = activityC13659x4f0951e4;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387583a;
        ka2.f streamType = activityC13659x4f0951e4.getK();
        boolean z17 = activityC13659x4f0951e4.f183326t;
        ka2.d dVar = activityC13659x4f0951e4.L;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamType, "streamType");
        boolean a17 = z17 ? dVar.f387552d.a(streamType) : dVar.f387551c.a(streamType);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiNormalLbsListUI", "checkLoadMore isSearchIng:" + activityC13659x4f0951e4.f183326t + " hasMore:" + a17 + " isRequest=" + activityC13659x4f0951e4.B);
        if (!a17 || activityC13659x4f0951e4.B) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.n7(activityC13659x4f0951e4, activityC13659x4f0951e4.f183332z, activityC13659x4f0951e4.f183326t, true, false, activityC13659x4f0951e4.g7(), 0, 40, null);
        activityC13659x4f0951e4.F = true;
        return true;
    }
}
