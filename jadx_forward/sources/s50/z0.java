package s50;

/* loaded from: classes12.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f484683f;

    public z0(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        this.f484681d = l1Var;
        this.f484682e = weakReference;
        this.f484683f = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.j2 m17 = this.f484683f.m();
        s50.l1.Ai(this.f484681d, this.f484682e, m17 != null ? m17.m141821x8cbe620() : 0);
    }
}
