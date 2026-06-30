package jz5;

/* loaded from: classes8.dex */
public final class m implements jz5.g, java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f384368f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(jz5.m.class, java.lang.Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile yz5.a f384369d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f384370e;

    public m(yz5.a initializer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initializer, "initializer");
        this.f384369d = initializer;
        this.f384370e = jz5.a0.f384348a;
    }

    @Override // jz5.g
    /* renamed from: getValue */
    public java.lang.Object mo141623x754a37bb() {
        boolean z17;
        java.lang.Object obj = this.f384370e;
        jz5.a0 a0Var = jz5.a0.f384348a;
        if (obj != a0Var) {
            return obj;
        }
        yz5.a aVar = this.f384369d;
        if (aVar != null) {
            java.lang.Object mo152xb9724478 = aVar.mo152xb9724478();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f384368f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, mo152xb9724478)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                this.f384369d = null;
                return mo152xb9724478;
            }
        }
        return this.f384370e;
    }

    @Override // jz5.g
    /* renamed from: isInitialized */
    public boolean mo141624xf582434a() {
        return this.f384370e != jz5.a0.f384348a;
    }

    /* renamed from: toString */
    public java.lang.String m141641x9616526c() {
        return mo141624xf582434a() ? java.lang.String.valueOf(mo141623x754a37bb()) : "Lazy value not initialized yet.";
    }
}
