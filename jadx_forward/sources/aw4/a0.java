package aw4;

/* loaded from: classes.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.b0 f96378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f96380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(aw4.b0 b0Var, java.lang.String str, boolean z17) {
        super(0);
        this.f96378d = b0Var;
        this.f96379e = str;
        this.f96380f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aw4.p o17 = this.f96378d.o();
        if (o17 != null) {
            java.lang.String query = this.f96379e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(query, "$query");
            o17.C4(query, this.f96380f);
        }
        return jz5.f0.f384359a;
    }
}
