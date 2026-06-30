package kp1;

/* loaded from: classes11.dex */
public final class u0 implements gp1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f392474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12882xfb6c00a3 f392475b;

    public u0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12882xfb6c00a3 c12882xfb6c00a3) {
        this.f392474a = z17;
        this.f392475b = c12882xfb6c00a3;
    }

    @Override // gp1.m
    /* renamed from: onEnter */
    public void mo131962xaf88dc39() {
        rk4.p6 p6Var = (rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class));
        if (p6Var.Ai()) {
            p6Var.Zi(new rk4.e6(p6Var, this.f392474a));
        }
        gp1.o onEnterPlayerCallback = this.f392475b.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
    }
}
