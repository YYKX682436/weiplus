package u85;

/* loaded from: classes10.dex */
public abstract class o extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 f507252f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f507253g;

    public o(com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f507252f = info;
        this.f507253g = new java.util.LinkedList();
    }

    public void e(boolean z17) {
        java.util.Iterator it = this.f507253g.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            b(fp0.u.f346823f);
        } else {
            b(fp0.u.f346824g);
        }
    }
}
