package em2;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f336719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gk2.e eVar) {
        super(1);
        this.f336719d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String uId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uId, "uId");
        java.util.List Z6 = ((mm2.o4) this.f336719d.a(mm2.o4.class)).Z6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z6, "<get-allLinkMicUserList>(...)");
        synchronized (Z6) {
            java.util.Iterator it = Z6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, uId)) {
                    break;
                }
            }
        }
        return (km2.q) obj2;
    }
}
