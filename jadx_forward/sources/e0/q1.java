package e0;

/* loaded from: classes10.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f327223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f327224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f327225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z17, p3325xe03a0797.p3326xc267989b.y0 y0Var, e0.f1 f1Var) {
        super(2);
        this.f327223d = z17;
        this.f327224e = y0Var;
        this.f327225f = f1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        if (this.f327223d) {
            floatValue = floatValue2;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f327224e, null, null, new e0.p1(this.f327225f, floatValue, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
