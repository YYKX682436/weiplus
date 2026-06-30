package ya2;

/* loaded from: classes8.dex */
public final class v implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f542089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f542090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f542091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f542092h;

    public v(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f542088d = context;
        this.f542089e = k0Var;
        this.f542090f = i17;
        this.f542091g = h0Var;
        this.f542092h = h0Var2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f542090f;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f542091g.f391656d;
        ((ke0.e) xVar).getClass();
        android.content.Context context = this.f542088d;
        android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence);
        java.lang.String str = (java.lang.String) this.f542092h.f391656d;
        g4Var.q(i17, i18, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nig), 0, 0);
        ya2.s sVar = new ya2.s(context, str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f542089e;
        k0Var.F = sVar;
        k0Var.G = new ya2.t(i18, context);
    }
}
