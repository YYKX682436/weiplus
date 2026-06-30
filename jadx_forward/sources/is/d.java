package is;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.f f375845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js.p0 f375846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f375847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t f375848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f375849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(is.f fVar, js.p0 p0Var, android.content.Context context, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t tVar, java.lang.String str) {
        super(0);
        this.f375845d = fVar;
        this.f375846e = p0Var;
        this.f375847f = context;
        this.f375848g = tVar;
        this.f375849h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "gateway login confirm dialog do next");
        is.f fVar = this.f375845d;
        js.p0 p0Var = this.f375846e;
        fVar.f375862d = p0Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6) p0Var).f155799a.g7(true);
        u61.o.c(this.f375847f, r45.gn4.kMobileType_Mask, "BeforeLogin", new is.c(fVar, this.f375848g, this.f375849h, p0Var));
        return jz5.f0.f384359a;
    }
}
