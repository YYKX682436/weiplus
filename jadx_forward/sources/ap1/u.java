package ap1;

/* loaded from: classes5.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.w f94276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.a0 f94277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f94278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ap1.w wVar, ap1.a0 a0Var, int i17) {
        super(0);
        this.f94276d = wVar;
        this.f94277e = a0Var;
        this.f94278f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ap1.w wVar = this.f94276d;
        fo1.h hVar = wVar.f94286m;
        if (hVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("getContactHelper");
            throw null;
        }
        ap1.a0 a0Var = this.f94277e;
        if (!hVar.c(a0Var.f94133a)) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(wVar);
            fo1.h hVar2 = wVar.f94286m;
            if (hVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("getContactHelper");
                throw null;
            }
            hVar2.b(a0Var.f94133a, new ap1.t(weakReference, a0Var, this.f94278f));
        }
        return jz5.f0.f384359a;
    }
}
