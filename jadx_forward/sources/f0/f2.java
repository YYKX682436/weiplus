package f0;

/* loaded from: classes10.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f339608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f339609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(boolean z17, p3325xe03a0797.p3326xc267989b.y0 y0Var, f0.r1 r1Var) {
        super(2);
        this.f339607d = z17;
        this.f339608e = y0Var;
        this.f339609f = r1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        if (this.f339607d) {
            floatValue = floatValue2;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f339608e, null, null, new f0.e2(this.f339609f, floatValue, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
