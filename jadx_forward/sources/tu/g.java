package tu;

/* loaded from: classes3.dex */
public final class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 f503599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f503600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f503601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.f f503602g;

    public g(com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, hu.f fVar) {
        this.f503599d = activityC10460xf1280e36;
        this.f503600e = f9Var;
        this.f503601f = z17;
        this.f503602g = fVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36 = this.f503599d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC10460xf1280e36.mo55332x76847179(), 1, false);
        boolean z17 = this.f503601f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f503600e;
        k0Var.f293405n = new tu.d(f9Var, z17, activityC10460xf1280e36);
        k0Var.f293414s = new tu.f(activityC10460xf1280e36, f9Var, this.f503602g);
        k0Var.v();
        return true;
    }
}
