package n2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f415739a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f415740b;

    public c(java.lang.Object current, java.lang.Object target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f415739a = current;
        this.f415740b = target;
    }

    /* renamed from: equals */
    public boolean m148904xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2.c)) {
            return false;
        }
        n2.c cVar = (n2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415739a, cVar.f415739a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415740b, cVar.f415740b);
    }

    /* renamed from: hashCode */
    public int m148905x8cdac1b() {
        return (this.f415739a.hashCode() * 31) + this.f415740b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148906x9616526c() {
        return "TransitionState(current=" + this.f415739a + ", target=" + this.f415740b + ')';
    }
}
