package f;

/* loaded from: classes14.dex */
public final class r extends p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f339527a;

    public r(f.a launcher, n0.e5 contract) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launcher, "launcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f339527a = launcher;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void a(java.lang.Object obj, z2.m mVar) {
        jz5.f0 f0Var;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = this.f339527a.f339502a;
        if (cVar == null) {
            f0Var = null;
        } else {
            cVar.a(obj, mVar);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void b() {
        throw new java.lang.UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
