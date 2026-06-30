package lf4;

/* loaded from: classes4.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f400006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f400008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f400009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lf4.b0 b0Var, int i17, java.util.ArrayList arrayList, p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var) {
        super(0);
        this.f400006d = b0Var;
        this.f400007e = i17;
        this.f400008f = arrayList;
        this.f400009g = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.b0 b0Var = this.f400006d;
        sf4.a1 a1Var = (sf4.a1) b0Var.f399888e;
        int i17 = this.f400007e;
        a1Var.h(i17, this.f400008f);
        ((sf4.a1) b0Var.f399888e).d();
        this.f400009g.a(new lf4.q(b0Var, i17));
        return jz5.f0.f384359a;
    }
}
