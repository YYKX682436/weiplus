package wi5;

/* loaded from: classes.dex */
public final class g extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f527822b;

    public g(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f527822b = item;
    }

    /* renamed from: equals */
    public boolean m173840xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi5.g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527822b, ((wi5.g) obj).f527822b);
    }

    /* renamed from: hashCode */
    public int m173841x8cdac1b() {
        return this.f527822b.mo148315x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173842x9616526c() {
        return "CreateGroupRelatedMoreAction(item=" + this.f527822b + ')';
    }
}
