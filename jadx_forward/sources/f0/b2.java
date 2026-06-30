package f0;

/* loaded from: classes14.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f339546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.q f339547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(f0.r1 r1Var, f0.q qVar) {
        super(0);
        this.f339546d = r1Var;
        this.f339547e = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float d17;
        float e17;
        f0.r1 r1Var = this.f339546d;
        if (r1Var.f339757r) {
            e17 = ((f0.s) this.f339547e).e();
            d17 = 1.0f;
        } else {
            d17 = r1Var.d();
            e17 = r1Var.e() / 100000.0f;
        }
        return java.lang.Float.valueOf(e17 + d17);
    }
}
