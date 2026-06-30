package im2;

/* loaded from: classes3.dex */
public final class h1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373885d;

    public h1(im2.z3 z3Var) {
        this.f373885d = z3Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            im2.z3 z3Var = this.f373885d;
            z3Var.k7().postDelayed(new im2.g1(z3Var), 200L);
        }
    }
}
