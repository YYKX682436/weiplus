package tu;

/* loaded from: classes3.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f503591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f503592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 f503593f;

    public d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36) {
        this.f503591d = f9Var;
        this.f503592e = z17;
        this.f503593f = activityC10460xf1280e36;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f503591d;
        if (c01.ia.e(f9Var)) {
            return;
        }
        boolean z17 = this.f503592e;
        com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36 = this.f503593f;
        if (z17 && !c01.ia.C(f9Var)) {
            g4Var.f(1, activityC10460xf1280e36.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lag));
        }
        if (z17 && activityC10460xf1280e36.getIntent().getIntExtra("from_scene", 0) == 0) {
            g4Var.f(2, activityC10460xf1280e36.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
        }
    }
}
