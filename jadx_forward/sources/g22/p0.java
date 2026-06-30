package g22;

/* loaded from: classes15.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 f349387d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 activityC13365x3816f414) {
        this.f349387d = activityC13365x3816f414;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i22.g0 g0Var = this.f349387d.f179985f;
        if (g0Var != null) {
            java.util.List list = g0Var.f369500e;
            if (!(!list.isEmpty()) || ((i22.n0) kz5.n0.i0(list)).mo134661xfb85f7b0() == 8) {
                return;
            }
            list.add(g0Var.f369507o);
            g0Var.m8147xed6e4d18(g0Var.mo1894x7e414b06() - 1);
        }
    }
}
