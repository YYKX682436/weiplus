package kp2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final kp2.a f392489a = new kp2.a();

    public final int a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        if (L0 != null && L0.I0("FinderLiveEntrance") != null && L0.m55856xfb85f7b0() == 16) {
            r45.xs2 Q = ((c61.l7) i95.n0.c(c61.l7.class)).nk().Q("NearbyLiveTab");
            i18 = Q != null ? Q.m75939xb282bd08(12) : 0;
        }
        if (i18 == 0) {
            i18 = wo2.n0.f529638a.c(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareConfig", "getTargetLiveTabId use last cache targetTabId=" + i18 + " commentScene=" + i17);
        }
        if (i18 != 0) {
            return i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareConfig", "getTargetLiveTabId use default targetTabId=88890");
        return 88890;
    }
}
