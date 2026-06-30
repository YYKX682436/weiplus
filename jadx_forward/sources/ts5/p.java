package ts5;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f503274a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f503275b;

    public p(ts5.a collectWhat, java.lang.String key, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 2) != 0) {
            key = java.util.UUID.randomUUID().toString() + java.util.Calendar.getInstance().getTime();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f503274a = collectWhat;
        this.f503275b = key;
    }

    /* renamed from: equals */
    public boolean m167026xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts5.p)) {
            return false;
        }
        ts5.p pVar = (ts5.p) obj;
        return this.f503274a == pVar.f503274a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f503275b, pVar.f503275b);
    }

    /* renamed from: hashCode */
    public int m167027x8cdac1b() {
        return (this.f503274a.hashCode() * 31) + this.f503275b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167028x9616526c() {
        return "UniqueTag(collectWhat=" + this.f503274a + ", key=" + this.f503275b + ')';
    }
}
