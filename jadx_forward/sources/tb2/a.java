package tb2;

/* loaded from: classes.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f498485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f498486e;

    public a(in5.s0 s0Var, yz5.l lVar) {
        this.f498485d = s0Var;
        this.f498486e = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        in5.s0 s0Var = this.f498485d;
        s0Var.f3639x46306858.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f498486e.mo146xb9724478(java.lang.Integer.valueOf(s0Var.f3639x46306858.getWidth()));
        return true;
    }
}
