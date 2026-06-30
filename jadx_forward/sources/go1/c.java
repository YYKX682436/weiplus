package go1;

/* loaded from: classes5.dex */
public final class c implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f355475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355476e;

    public c(long j17, long j18) {
        this.f355475d = j17;
        this.f355476e = j18;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        long j17 = this.f355475d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = r0Var.k(j17);
        if (k17 == null) {
            throw new java.lang.InterruptedException("Fail to get package by id=" + j17);
        }
        xn1.k kVar = new xn1.k();
        po1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = k17.f297367i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "getBackupRange(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 a17 = aVar.a(iVar);
        long c17 = c01.id.c();
        long j18 = a17.f174267h;
        long j19 = c17 - this.f355476e;
        if (j18 <= 0 || j19 <= j18) {
            j18 = j19;
        }
        java.util.HashMap hashMap = (java.util.HashMap) p3325xe03a0797.p3326xc267989b.l.f(null, new go1.b(a17, j18, kVar, this.f355475d, null), 1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupPackageHelper", "resultMap = " + hashMap.size() + ", timeInfo=" + kVar);
        return hashMap;
    }
}
