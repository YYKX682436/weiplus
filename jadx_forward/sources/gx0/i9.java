package gx0;

/* loaded from: classes5.dex */
public final class i9 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f358066d;

    public i9(gx0.p9 p9Var) {
        this.f358066d = p9Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        gx0.p9 p9Var = this.f358066d;
        ex0.a0 a0Var = p9Var.u7().f358175r;
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "observeTimelineViewModelReady: timelineViewModel is null");
            return;
        }
        a0Var.f338648y.mo7806x9d92d11c(p9Var.m158354x19263085(), new gx0.h9(p9Var));
    }
}
