package lm2;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.h0 f400909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f400910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f400911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(lm2.h0 h0Var, java.lang.String str, lm2.c cVar) {
        super(0);
        this.f400909d = h0Var;
        this.f400910e = str;
        this.f400911f = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lm2.h0 h0Var = this.f400909d;
        java.lang.String str = this.f400910e;
        lm2.j0 d17 = h0Var.d(str);
        if (d17 != null) {
            lm2.h0.a(this.f400909d, "post", kz5.b0.c(this.f400911f), d17.f400944d, d17, (lm2.o) h0Var.f400930d.get(str));
        }
        return jz5.f0.f384359a;
    }
}
