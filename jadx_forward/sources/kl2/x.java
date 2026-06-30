package kl2;

/* loaded from: classes3.dex */
public final class x implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f390359a;

    public x(kl2.e0 e0Var) {
        this.f390359a = e0Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        pk2.f8.d(pk2.f8.f437280a, 4, 0, 3, z17 ? 2 : 3, null, 16, null);
        kl2.e0 e0Var = this.f390359a;
        kl2.e0.a(e0Var, z17);
        ll2.e.b(ll2.e.f400666a, "audience.more.morefunction.rewardlimit", false, false, 6, null);
        if (z17) {
            return;
        }
        jl2.b.o0(e0Var.f390292b, 2, 0L, new kl2.y(e0Var), 2, null);
    }
}
