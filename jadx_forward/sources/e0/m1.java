package e0;

/* loaded from: classes14.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f327183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.s f327184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(e0.f1 f1Var, e0.s sVar) {
        super(0);
        this.f327183d = f1Var;
        this.f327184e = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float d17;
        float e17;
        e0.f1 f1Var = this.f327183d;
        if (f1Var.f327122o) {
            e17 = ((e0.u) this.f327184e).e();
            d17 = 1.0f;
        } else {
            d17 = f1Var.d();
            e17 = f1Var.e() / 100000.0f;
        }
        return java.lang.Float.valueOf(e17 + d17);
    }
}
