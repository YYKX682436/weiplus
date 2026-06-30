package ro5;

/* loaded from: classes14.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f479709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479710g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ro5.m1 m1Var, int i17, zo5.e eVar, int i18) {
        super(2);
        this.f479707d = m1Var;
        this.f479708e = i17;
        this.f479709f = eVar;
        this.f479710g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).longValue();
        dp5.d dVar = ((yo5.e) this.f479707d.f479775d.f537329g.mo141623x754a37bb()).f545898n;
        if (dVar != null) {
            ro5.m1 m1Var = this.f479707d;
            int i17 = this.f479708e;
            z17 = ro5.m1.a(m1Var, i17, dVar, new ro5.b1(m1Var, intValue, this.f479709f, i17, this.f479710g));
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
