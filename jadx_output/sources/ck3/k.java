package ck3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck3.a0 f42491d;

    public k(ck3.a0 a0Var) {
        this.f42491d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck3.a0 a0Var = this.f42491d;
        if (a0Var.getParent() != null) {
            android.view.ViewParent parent = a0Var.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(a0Var);
        }
    }
}
