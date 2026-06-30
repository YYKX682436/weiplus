package bm2;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List list) {
        super(1);
        this.f103770d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.rm1 info = (r45.rm1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Iterator it = this.f103770d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (dk2.q.c((r45.d22) obj2, info)) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj2 != null);
    }
}
