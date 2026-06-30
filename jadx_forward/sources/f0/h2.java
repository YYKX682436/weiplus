package f0;

/* loaded from: classes5.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f339643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f339644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f0.r1 r1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(1);
        this.f339643d = r1Var;
        this.f339644e = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        f0.r1 r1Var = this.f339643d;
        if (intValue >= 0 && intValue < r1Var.f().a()) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f339644e, null, null, new f0.g2(r1Var, intValue, null), 3, null);
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + r1Var.f().a() + ')').toString());
    }
}
