package bu2;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17) {
        super(1);
        this.f24554d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j0 it = (so2.j0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = false;
        r45.vx0 vx0Var = (r45.vx0) it.f410438d.getCustom(0);
        if (vx0Var != null && vx0Var.getLong(0) == this.f24554d) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
