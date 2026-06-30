package s2;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f483743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f483744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.g0 f483745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p2.s f483747h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s2.b0 b0Var, yz5.a aVar, s2.g0 g0Var, java.lang.String str, p2.s sVar) {
        super(1);
        this.f483743d = b0Var;
        this.f483744e = aVar;
        this.f483745f = g0Var;
        this.f483746g = str;
        this.f483747h = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        s2.b0 b0Var = this.f483743d;
        b0Var.f483735s.addView(b0Var, b0Var.f483736t);
        b0Var.k(this.f483744e, this.f483745f, this.f483746g, this.f483747h);
        return new s2.b(b0Var);
    }
}
