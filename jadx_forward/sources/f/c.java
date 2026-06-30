package f;

/* loaded from: classes14.dex */
public final class c implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f339504a;

    public c(f.a aVar) {
        this.f339504a = aVar;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        jz5.f0 f0Var;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = this.f339504a.f339502a;
        if (cVar == null) {
            f0Var = null;
        } else {
            cVar.b();
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
