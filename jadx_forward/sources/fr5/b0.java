package fr5;

/* loaded from: classes15.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er5.g f347432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(fr5.f0 f0Var, er5.g gVar) {
        super(4);
        this.f347431d = f0Var;
        this.f347432e = gVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        long j17 = ((zq5.l) obj2).f556613a;
        long j18 = ((zq5.l) obj3).f556613a;
        int intValue = ((java.lang.Number) obj4).intValue();
        fr5.f0 f0Var = this.f347431d;
        p3325xe03a0797.p3326xc267989b.l.d(f0Var.f347476h, null, null, new fr5.a0(f0Var, j18, this.f347432e, intValue, floatValue, j17, null), 3, null);
        return jz5.f0.f384359a;
    }
}
