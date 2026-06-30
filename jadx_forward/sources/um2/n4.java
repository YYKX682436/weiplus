package um2;

/* loaded from: classes3.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(um2.x5 x5Var) {
        super(0);
        this.f510430d = x5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.c cVar = this.f510430d.f101139c;
        java.lang.Object obj = null;
        if (cVar != null) {
            qo0.c.a(cVar, qo0.b.C1, null, 2, null);
        }
        java.util.List list = ((mm2.o4) this.f510430d.c(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        um2.x5 x5Var = this.f510430d;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) next).f390703a, ((mm2.c1) x5Var.c(mm2.c1.class)).m8())) {
                    obj = next;
                    break;
                }
            }
        }
        if (obj != null) {
            mk2.h.f408666a.e();
            um2.x5 x5Var2 = this.f510430d;
            x5Var2.U(1, true, new um2.m4(x5Var2));
        }
        return jz5.f0.f384359a;
    }
}
