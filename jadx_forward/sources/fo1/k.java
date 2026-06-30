package fo1;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346413e;

    public k(java.lang.String str, long j17) {
        this.f346412d = str;
        this.f346413e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMediaTimeByTalker, talker=");
        java.lang.String str = this.f346412d;
        sb6.append(str);
        sb6.append(", time=");
        long j17 = this.f346413e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.MediaPullObserver", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("RoamMediaTime", gm0.j1.b().h(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.h(false).iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d + '_' + str;
            if (J2.q(str2, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) > j17) {
                J2.B(str2, j17);
            }
        }
    }
}
