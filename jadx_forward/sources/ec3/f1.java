package ec3;

/* loaded from: classes9.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ec3.g1 g1Var, yz5.a aVar) {
        super(0);
        this.f332539d = g1Var;
        this.f332540e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ec3.g1 g1Var = this.f332539d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = g1Var.f332545f;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSkinAdapter");
            throw null;
        }
        c22848x6ddd90cf.m8146xced61ae5();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 X6 = g1Var.X6();
        if (X6 != null) {
            X6.postDelayed(new ec3.e1(g1Var, this.f332540e), 70L);
        }
        return jz5.f0.f384359a;
    }
}
