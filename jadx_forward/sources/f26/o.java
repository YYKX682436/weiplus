package f26;

/* loaded from: classes14.dex */
public final class o extends f26.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final p06.k f340735a;

    public o(p06.k annotations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        this.f340735a = annotations;
    }

    /* renamed from: equals */
    public boolean m128967xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof f26.o) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((f26.o) obj).f340735a, this.f340735a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128968x8cdac1b() {
        return this.f340735a.hashCode();
    }
}
