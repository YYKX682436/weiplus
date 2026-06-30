package os4;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.js3 f429810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f429811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.js3 js3Var, int i17) {
        super(0);
        this.f429810d = js3Var;
        this.f429811e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] mo14344x5f01b1f6 = this.f429810d.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        java.lang.String str = new java.lang.String(mo14344x5f01b1f6, r26.c.f450400c);
        gm0.j1.u().c().y(this.f429811e + "USERINFO_WECOIN_PRICE_LIST_RESPONSE_STRING_SYNC", str);
        return jz5.f0.f384359a;
    }
}
