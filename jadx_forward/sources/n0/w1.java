package n0;

/* loaded from: classes9.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.x1 f415270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f415271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(n0.x1 x1Var, java.util.HashSet hashSet) {
        super(1);
        this.f415270d = x1Var;
        this.f415271e = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it == this.f415270d) {
            throw new java.lang.IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (it instanceof x0.z0) {
            this.f415271e.add(it);
        }
        return jz5.f0.f384359a;
    }
}
