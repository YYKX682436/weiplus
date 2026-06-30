package ap1;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.a0 f12744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ap1.w wVar, ap1.a0 a0Var, int i17) {
        super(0);
        this.f12743d = wVar;
        this.f12744e = a0Var;
        this.f12745f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ap1.w wVar = this.f12743d;
        fo1.h hVar = wVar.f12753m;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("getContactHelper");
            throw null;
        }
        ap1.a0 a0Var = this.f12744e;
        if (!hVar.c(a0Var.f12600a)) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(wVar);
            fo1.h hVar2 = wVar.f12753m;
            if (hVar2 == null) {
                kotlin.jvm.internal.o.o("getContactHelper");
                throw null;
            }
            hVar2.b(a0Var.f12600a, new ap1.t(weakReference, a0Var, this.f12745f));
        }
        return jz5.f0.f302826a;
    }
}
