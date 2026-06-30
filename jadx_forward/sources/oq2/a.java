package oq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ey2.c3 f428905a;

    public a() {
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.c3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f428905a = (ey2.c3) a17;
    }

    public final void a(int i17, long j17, long j18, long j19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "storePreloadTimeStampCache lastFindPrefetchTimeStampMs:" + j17 + " lastRedDotPrefetchTimeStampMs:" + j18 + " lastTabPagesPrefetchTimeStampMs:" + j19);
        ey2.y2 P6 = this.f428905a.P6(i17);
        if (j17 != 0) {
            P6.f339117b = j17;
        }
        if (j18 != 0) {
            P6.f339118c = j18;
        }
        if (j19 != 0) {
            P6.f339119d = j19;
        }
    }
}
