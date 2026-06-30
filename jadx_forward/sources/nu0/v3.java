package nu0;

/* loaded from: classes5.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f421653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f421654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f421655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(nu0.b4 b4Var, int i17, yz5.a aVar, int i18) {
        super(0);
        this.f421652d = b4Var;
        this.f421653e = i17;
        this.f421654f = aVar;
        this.f421655g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nu0.q0 U6 = this.f421652d.U6();
        int i17 = this.f421653e;
        nu0.u3 u3Var = new nu0.u3(this.f421654f, this.f421652d, this.f421655g, i17);
        U6.getClass();
        java.lang.String d76 = U6.d7(i17);
        if (d76 != null) {
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = U6.f421608r;
            if (c4063x855a1ef8 != null) {
                c4063x855a1ef8.p(d76);
            }
            U6.X6(false, new nu0.o0(u3Var));
        }
        return jz5.f0.f384359a;
    }
}
