package jz5;

/* loaded from: classes8.dex */
public final class g0 implements jz5.g, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f384360d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f384361e;

    public g0(yz5.a initializer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initializer, "initializer");
        this.f384360d = initializer;
        this.f384361e = jz5.a0.f384348a;
    }

    @Override // jz5.g
    /* renamed from: getValue */
    public java.lang.Object mo141623x754a37bb() {
        if (this.f384361e == jz5.a0.f384348a) {
            yz5.a aVar = this.f384360d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            this.f384361e = aVar.mo152xb9724478();
            this.f384360d = null;
        }
        return this.f384361e;
    }

    @Override // jz5.g
    /* renamed from: isInitialized */
    public boolean mo141624xf582434a() {
        return this.f384361e != jz5.a0.f384348a;
    }

    /* renamed from: toString */
    public java.lang.String m141633x9616526c() {
        return mo141624xf582434a() ? java.lang.String.valueOf(mo141623x754a37bb()) : "Lazy value not initialized yet.";
    }
}
