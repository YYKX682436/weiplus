package ya2;

/* loaded from: classes8.dex */
public final class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f542082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f542083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542084g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f542085h;

    public u(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, int i17, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f542081d = context;
        this.f542082e = k0Var;
        this.f542083f = i17;
        this.f542084g = str;
        this.f542085h = h0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f542083f;
        java.lang.String str = this.f542084g;
        java.lang.String str2 = (java.lang.String) this.f542085h.f391656d;
        android.content.Context context = this.f542081d;
        g4Var.q(i17, str, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nig), 0, 0);
        ya2.s sVar = new ya2.s(context, str2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f542082e;
        k0Var.F = sVar;
        k0Var.G = new ya2.t(str, context);
    }
}
