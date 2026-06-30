package nf2;

/* loaded from: classes10.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f418364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f418365f;

    public z0(nf2.d1 d1Var, float f17, float f18) {
        this.f418363d = d1Var;
        this.f418364e = f17;
        this.f418365f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f418363d.l(this.f418364e, this.f418365f);
    }
}
