package bm2;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f22237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List list) {
        super(1);
        this.f22237d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.rm1 info = (r45.rm1) obj;
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Iterator it = this.f22237d.iterator();
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
