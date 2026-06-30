package dk2;

/* loaded from: classes3.dex */
public final class f8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f314991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.p pVar) {
        super(0);
        this.f314990d = context;
        this.f314991e = h0Var;
        this.f314992f = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f314990d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5a));
        u1Var.n((java.lang.String) this.f314991e.f391656d);
        u1Var.l(dk2.e8.f314894a);
        u1Var.q(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "pad can't create live!");
        this.f314992f.mo149xb9724478(java.lang.Boolean.FALSE, "forbidden_device");
        return jz5.f0.f384359a;
    }
}
