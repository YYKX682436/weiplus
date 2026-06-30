package fo1;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f346411d;

    public j(long j17) {
        this.f346411d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetMediaTimeByPkgId, pkgId=");
        long j17 = this.f346411d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.MediaPullObserver", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(j17);
        sb7.append('_');
        java.lang.String sb8 = sb7.toString();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("RoamMediaTime", gm0.j1.b().h(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        java.lang.String[] b17 = J2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "allKeys(...)");
        for (java.lang.String str : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (r26.i0.y(str, sb8, false)) {
                J2.remove(str);
            }
        }
    }
}
