package sj3;

/* loaded from: classes13.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f490196e;

    public o0(sj3.a1 a1Var, android.view.ViewGroup viewGroup) {
        this.f490195d = a1Var;
        this.f490196e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.a1.a(this.f490195d, (int) this.f490196e.getY());
    }
}
