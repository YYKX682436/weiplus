package j0;

/* loaded from: classes14.dex */
public final class s4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.s4 f378099d = new j0.s4();

    public s4() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 listSaver = (w0.c0) obj;
        j0.u4 it = (j0.u4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listSaver, "$this$listSaver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Float.valueOf(it.a());
        objArr[1] = java.lang.Boolean.valueOf(((b0.y1) ((n0.q4) it.f378120e).mo128745x754a37bb()) == b0.y1.Vertical);
        return kz5.c0.i(objArr);
    }
}
