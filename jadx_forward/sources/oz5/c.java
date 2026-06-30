package oz5;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oz5.c f431857d = new oz5.c();

    public c() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String acc = (java.lang.String) obj;
        oz5.i element = (oz5.i) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(acc, "acc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
