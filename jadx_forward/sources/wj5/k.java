package wj5;

/* loaded from: classes8.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.l f528349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f528350e;

    public k(wj5.l lVar, long j17) {
        this.f528349d = lVar;
        this.f528350e = j17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            java.lang.String str = this.f528349d.f528353g;
            long j17 = this.f528350e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click close finder live tipsbar, liveId:".concat(pm0.v.u(j17)));
            rl2.v wi6 = ((vd2.u0) ((ss5.c0) i95.n0.c(ss5.c0.class))).wi();
            if (wi6 != null) {
                wi6.z0(j17, true);
            }
        }
    }
}
