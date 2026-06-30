package aw4;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.b0 f14845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(aw4.b0 b0Var, java.lang.String str, boolean z17) {
        super(0);
        this.f14845d = b0Var;
        this.f14846e = str;
        this.f14847f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aw4.p o17 = this.f14845d.o();
        if (o17 != null) {
            java.lang.String query = this.f14846e;
            kotlin.jvm.internal.o.f(query, "$query");
            o17.C4(query, this.f14847f);
        }
        return jz5.f0.f302826a;
    }
}
