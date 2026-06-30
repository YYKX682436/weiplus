package hr5;

/* loaded from: classes15.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f366030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f366031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f366032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(hr5.a1 a1Var, long j17, long j18) {
        super(1);
        this.f366030d = a1Var;
        this.f366031e = j17;
        this.f366032f = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zq5.v a17;
        long j17 = ((zq5.l) obj).f556613a;
        hr5.a1 a1Var = this.f366030d;
        zq5.v vVar = a1Var.f365829t;
        long c17 = a1Var.c(j17, vVar.c());
        boolean z17 = !(c17 == vVar.f556629b);
        if (z17) {
            a17 = r12.a((r20 & 1) != 0 ? r12.f556628a : 0L, (r20 & 2) != 0 ? r12.f556629b : c17, (r20 & 4) != 0 ? r12.f556630c : 0.0f, (r20 & 8) != 0 ? r12.f556631d : 0L, (r20 & 16) != 0 ? a1Var.f365829t.f556632e : 0L);
            a1Var.f365810a.d(new hr5.x(a1Var, this.f366031e, this.f366032f, a17, z17));
            a1Var.j(a17);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
