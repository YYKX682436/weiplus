package ue2;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.e0 f508327d;

    public a0(ue2.e0 e0Var) {
        this.f508327d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        ue2.e0 e0Var = this.f508327d;
        if (!e0Var.f508341h || e0Var.f508342i || (viewGroup = e0Var.f508338e) == null) {
            return;
        }
        viewGroup.setTranslationY(0.0f);
    }
}
