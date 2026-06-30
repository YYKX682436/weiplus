package e0;

/* loaded from: classes5.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f327231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f327232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(e0.f1 f1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(1);
        this.f327231d = f1Var;
        this.f327232e = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        e0.f1 f1Var = this.f327231d;
        if (intValue >= 0 && intValue < f1Var.f().a()) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f327232e, null, null, new e0.r1(f1Var, intValue, null), 3, null);
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + f1Var.f().a() + ')').toString());
    }
}
