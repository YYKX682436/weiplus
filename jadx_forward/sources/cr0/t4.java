package cr0;

/* loaded from: classes12.dex */
public final class t4 implements gi.l0 {
    @Override // gi.l0
    public void a(rh.y2 threadJiffiesList) {
        qh.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadJiffiesList, "threadJiffiesList");
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            qh.w wVar = e17.f435829h.f444868d.f444816b;
            ri.k kVar = wVar instanceof ri.k ? (ri.k) wVar : null;
            if (kVar != null) {
                rh.c1 m17 = kVar.f444922e.m();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "fork(...)");
                if (m17.E()) {
                    m17.l();
                }
                java.util.List list = threadJiffiesList.f477093a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getList(...)");
                boolean z17 = true;
                if (!list.isEmpty()) {
                    synchronized (m17) {
                        if (m17.E() || m17.f476863l == null) {
                            z17 = false;
                        }
                    }
                    if (!z17 || (bVar = m17.f476863l) == null || bVar.g()) {
                        return;
                    }
                    m17.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new cr0.u4(m17, list, bVar));
                }
            }
        }
    }
}
