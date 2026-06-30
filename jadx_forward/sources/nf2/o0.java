package nf2;

/* loaded from: classes10.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.g0 f418318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f418319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(nf2.d1 d1Var, nf2.g0 g0Var, boolean z17) {
        super(0);
        this.f418317d = d1Var;
        this.f418318e = g0Var;
        this.f418319f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nf2.d1 d1Var = this.f418317d;
        nf2.d0 d0Var = new nf2.d0(d1Var, this.f418318e, d1Var.f418215c);
        d0Var.f418210l = d1Var.H;
        d0Var.f418211m = d1Var.f418212J;
        android.view.View view = ((nf2.d1) d0Var.f418199a).f418218f;
        boolean z17 = this.f418319f;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.post(new nf2.a0(d0Var, z17, view));
            }
        }
        d1Var.C = d0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "setupGesture: initialized, alignmentTriggerWidth=" + d1Var.F + ", setInitialPosition=" + z17);
        return jz5.f0.f384359a;
    }
}
