package st2;

/* loaded from: classes3.dex */
public final class n1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f493934d;

    public n1(st2.s1 s1Var) {
        this.f493934d = s1Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        this.f493934d.d();
    }
}
