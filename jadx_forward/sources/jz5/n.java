package jz5;

/* loaded from: classes8.dex */
public final class n implements jz5.g, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f384371d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f384372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f384373f;

    public n(yz5.a initializer, java.lang.Object obj, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        obj = (i17 & 2) != 0 ? null : obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initializer, "initializer");
        this.f384371d = initializer;
        this.f384372e = jz5.a0.f384348a;
        this.f384373f = obj == null ? this : obj;
    }

    @Override // jz5.g
    /* renamed from: getValue */
    public java.lang.Object mo141623x754a37bb() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.f384372e;
        jz5.a0 a0Var = jz5.a0.f384348a;
        if (obj2 != a0Var) {
            return obj2;
        }
        synchronized (this.f384373f) {
            obj = this.f384372e;
            if (obj == a0Var) {
                yz5.a aVar = this.f384371d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                obj = aVar.mo152xb9724478();
                this.f384372e = obj;
                this.f384371d = null;
            }
        }
        return obj;
    }

    @Override // jz5.g
    /* renamed from: isInitialized */
    public boolean mo141624xf582434a() {
        return this.f384372e != jz5.a0.f384348a;
    }

    /* renamed from: toString */
    public java.lang.String m141642x9616526c() {
        return mo141624xf582434a() ? java.lang.String.valueOf(mo141623x754a37bb()) : "Lazy value not initialized yet.";
    }
}
