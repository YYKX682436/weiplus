package p05;

/* loaded from: classes2.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.r2 f432206d = new p05.r2();

    public r2() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        sb6.append((java.lang.String) it.getKey());
        sb6.append(": \n ");
        java.util.Set entrySet = ((java.util.concurrent.ConcurrentHashMap) it.getValue()).entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        sb6.append(kz5.n0.g0(entrySet, null, null, null, 0, null, p05.q2.f432188d, 31, null));
        return sb6.toString();
    }
}
