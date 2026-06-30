package df5;

/* loaded from: classes10.dex */
public final class n1 extends df5.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f313714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.util.List views) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(views, "views");
        this.f313714a = views;
    }

    /* renamed from: equals */
    public boolean m124350xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df5.n1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313714a, ((df5.n1) obj).f313714a);
    }

    /* renamed from: hashCode */
    public int m124351x8cdac1b() {
        return this.f313714a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124352x9616526c() {
        return "ShowViews(views=" + this.f313714a + ')';
    }
}
