package pg1;

/* loaded from: classes7.dex */
public final class a implements b06.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f435609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f435610b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f435611c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f435612d;

    public a(java.lang.String name, boolean z17, yz5.l setter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setter, "setter");
        this.f435609a = name;
        this.f435610b = z17;
        this.f435611c = setter;
    }

    @Override // b06.d
    public void a(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        synchronized (this) {
            if (this.f435612d != null && !this.f435610b) {
                throw new java.lang.IllegalStateException("'" + this.f435609a + "' is immutable");
            }
            this.f435612d = obj2;
        }
        this.f435611c.mo146xb9724478(obj2);
    }

    @Override // b06.c
    public java.lang.Object b(java.lang.Object obj, f06.v property) {
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        synchronized (this) {
            obj2 = this.f435612d;
            if (obj2 == null) {
                throw new jz5.e0("'" + this.f435609a + "' is not initialized yet");
            }
        }
        return obj2;
    }
}
