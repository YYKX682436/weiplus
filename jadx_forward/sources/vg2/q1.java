package vg2;

/* loaded from: classes3.dex */
public final class q1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f518090e;

    public q1(vg2.r1 r1Var, android.view.ViewGroup viewGroup) {
        this.f518089d = r1Var;
        this.f518090e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        vg2.r1 r1Var = this.f518089d;
        r1Var.f518097e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewGroup viewGroup = this.f518090e;
        if (viewGroup != null) {
            vg2.r1.a(r1Var, viewGroup);
        }
    }
}
