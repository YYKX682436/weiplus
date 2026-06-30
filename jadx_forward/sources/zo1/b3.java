package zo1;

/* loaded from: classes5.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.c3 f556086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556087e;

    public b3(zo1.c3 c3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556086d = c3Var;
        this.f556087e = activityC12872x8baa24f8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zo1.d3 d3Var;
        while (!this.f556086d.f556105e) {
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException unused) {
            }
            if (this.f556086d.f556105e) {
                return;
            }
            java.lang.String str = this.f556086d.f556104d;
            if (!(str.length() == 0) && (d3Var = this.f556087e.f174393t) != null) {
                d3Var.s(str, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x, false);
            }
        }
    }
}
