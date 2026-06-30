package androidx.fragment.app;

/* loaded from: classes14.dex */
public class u extends androidx.fragment.app.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.s0 f11482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.DialogFragment f11483e;

    public u(androidx.fragment.app.DialogFragment dialogFragment, androidx.fragment.app.s0 s0Var) {
        this.f11483e = dialogFragment;
        this.f11482d = s0Var;
    }

    @Override // androidx.fragment.app.s0
    public android.view.View b(int i17) {
        android.view.View onFindViewById = this.f11483e.onFindViewById(i17);
        if (onFindViewById != null) {
            return onFindViewById;
        }
        androidx.fragment.app.s0 s0Var = this.f11482d;
        if (s0Var.c()) {
            return s0Var.b(i17);
        }
        return null;
    }

    @Override // androidx.fragment.app.s0
    public boolean c() {
        return this.f11483e.onHasView() || this.f11482d.c();
    }
}
