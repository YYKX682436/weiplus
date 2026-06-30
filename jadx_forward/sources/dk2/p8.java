package dk2;

/* loaded from: classes5.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f315447d = context;
        this.f315448e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f315447d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5a));
        u1Var.n((java.lang.String) this.f315448e.f391656d);
        u1Var.l(dk2.o8.f315377a);
        u1Var.q(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "pad can't create live!");
        return jz5.f0.f384359a;
    }
}
