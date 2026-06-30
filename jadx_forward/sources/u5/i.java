package u5;

/* loaded from: classes14.dex */
public final class i extends u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f506242a;

    public i(h1.c cVar) {
        super(null);
        this.f506242a = cVar;
    }

    @Override // u5.k
    public h1.c a() {
        return this.f506242a;
    }

    /* renamed from: equals */
    public boolean m167578xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u5.i) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506242a, ((u5.i) obj).f506242a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m167579x8cdac1b() {
        h1.c cVar = this.f506242a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167580x9616526c() {
        return "Loading(painter=" + this.f506242a + ')';
    }
}
