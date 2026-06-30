package dr4;

/* loaded from: classes14.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final dr4.c1 f324149d = new dr4.c1();

    public c1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String tag = (java.lang.String) obj;
        java.lang.Runnable task = (java.lang.Runnable) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        pq4.c l17 = gq4.v.Bi().l(tag);
        if (l17 == null) {
            return null;
        }
        l17.b(task);
        return jz5.f0.f384359a;
    }
}
