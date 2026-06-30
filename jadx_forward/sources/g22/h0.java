package g22;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 f349354d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 activityC13365x3816f414) {
        this.f349354d = activityC13365x3816f414;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 activityC13365x3816f414 = this.f349354d;
        i22.g0 g0Var = activityC13365x3816f414.f179985f;
        if (g0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x84432753 = activityC13365x3816f414.f179984e;
            g0Var.x(c13366x84432753 != null ? c13366x84432753.getLayoutManager() : null);
        }
    }
}
