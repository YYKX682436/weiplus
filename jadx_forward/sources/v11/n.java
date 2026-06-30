package v11;

/* loaded from: classes11.dex */
public final class n extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513977a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List items) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f513977a = items;
    }

    /* renamed from: equals */
    public boolean m170930xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513977a, ((v11.n) obj).f513977a);
    }

    /* renamed from: hashCode */
    public int m170931x8cdac1b() {
        return this.f513977a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m170932x9616526c() {
        return "ListBlock(items=" + this.f513977a + ')';
    }
}
