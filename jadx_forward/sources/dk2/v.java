package dk2;

/* loaded from: classes3.dex */
public final class v implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f315754d;

    public v(dk2.g0 g0Var) {
        this.f315754d = g0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        dk2.g0 g0Var = this.f315754d;
        int i17 = g0Var.f315006f - 1;
        g0Var.f315006f = i17;
        if (i17 >= 0) {
            if (g0Var.f315003c == 5) {
                int i18 = g0Var.f315008h;
                if (i18 >= 0) {
                    pm0.v.X(new dk2.d0(g0Var, i18, g0Var.f315007g));
                    g0Var.f315008h--;
                }
                int i19 = g0Var.f315011k;
                if (i19 > 0 && g0Var.f315006f <= i19) {
                    pm0.v.X(new dk2.e0(g0Var));
                }
            } else {
                pm0.v.X(new dk2.e0(g0Var));
            }
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "backupTimer onTimerExpired: currentVerifyMode:" + g0Var.f315003c + ", currentVerifyId:" + g0Var.f315004d);
        int i27 = g0Var.f315003c;
        if (i27 == 1 || i27 == 2 || i27 == 3) {
            dk2.g0.c(g0Var, false);
        } else if (i27 == 5) {
            if (g0Var.f315012l != 1) {
                dk2.g0.c(g0Var, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "backupTimer onTimerExpired: Action_Waiting, skip postVerifyRequest");
            }
        }
        return false;
    }
}
