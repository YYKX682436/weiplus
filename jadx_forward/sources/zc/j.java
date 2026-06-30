package zc;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f552885e;

    public j(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, boolean z17) {
        this.f552884d = c3646xcf902238;
        this.f552885e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kx5.n h17 = kx5.n.h();
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552884d;
        int i17 = c3646xcf902238.f127500f;
        jz5.l lVar = new jz5.l("activityId", java.lang.String.valueOf(c3646xcf902238.f127498d));
        boolean z17 = this.f552885e;
        h17.k(i17, "onBackPressed", kz5.c1.k(lVar, new jz5.l("animation", java.lang.Boolean.valueOf(z17)), new jz5.l("popPage", java.lang.Boolean.TRUE)), new zc.i(c3646xcf902238, z17));
    }
}
