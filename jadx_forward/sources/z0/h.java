package z0;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final z0.h f550441d = new z0.h();

    public h() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String acc = (java.lang.String) obj;
        z0.s element = (z0.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(acc, "acc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
