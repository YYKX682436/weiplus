package n92;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xb1 f417441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.xb1 xb1Var) {
        super(1);
        this.f417441d = xb1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        m92.b bVar = (m92.b) obj;
        java.util.LinkedList m75941xfb821914 = this.f417441d.m75941xfb821914(23);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContacts(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.qz0) it.next()).m75936x14adae67(0);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, bVar.f68723xdec927b)) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
