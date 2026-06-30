package fk5;

/* loaded from: classes12.dex */
public final class c0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean contains;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.xz xzVar = event.f136451g;
        if (xzVar == null || xzVar.f89943b != 0) {
            return false;
        }
        fk5.y yVar = fk5.y.f345216d;
        java.lang.String talker = xzVar.f89944c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "talker");
        long j17 = xzVar.f89942a;
        yVar.getClass();
        synchronized (yVar.f341404c) {
            contains = ((java.util.ArrayList) yVar.f341404c).contains(java.lang.Long.valueOf(j17));
        }
        if (contains || !fk5.y.f345217e) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardChattingReporter", "forward msg insert receiver db");
        yVar.d(talker, j17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tj("page_out", new fk5.x(j17, talker));
        return false;
    }
}
