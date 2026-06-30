package sf4;

/* loaded from: classes4.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.d2 f488946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f488948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(sf4.d2 d2Var, java.lang.String str, int i17) {
        super(0);
        this.f488946d = d2Var;
        this.f488947e = str;
        this.f488948f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        t21.h0 h0Var = this.f488946d.f488982e;
        if (h0Var != null) {
            h0Var.o(this.f488947e, this.f488948f);
        }
        return jz5.f0.f384359a;
    }
}
