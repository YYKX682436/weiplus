package id;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f371975a;

    /* renamed from: b, reason: collision with root package name */
    public final h45.m f371976b;

    public b(int i17, h45.m callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f371975a = i17;
        this.f371976b = callback;
    }

    /* renamed from: equals */
    public boolean m135094xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id.b)) {
            return false;
        }
        id.b bVar = (id.b) obj;
        return this.f371975a == bVar.f371975a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371976b, bVar.f371976b);
    }

    /* renamed from: hashCode */
    public int m135095x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f371975a) * 31) + this.f371976b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m135096x9616526c() {
        return "CallbackItem(id=" + this.f371975a + ", callback=" + this.f371976b + ')';
    }
}
