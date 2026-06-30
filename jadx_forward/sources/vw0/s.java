package vw0;

/* loaded from: classes5.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd f522343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.p f522344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f522345f;

    public s(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd, dx0.p pVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        this.f522343d = c10952x561633cd;
        this.f522344e = pVar;
        this.f522345f = c3971x241f78;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pw0.i m47168x43d37992;
        java.lang.Object obj;
        pw0.i m47168x43d379922;
        pw0.i m47168x43d379923;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd = this.f522343d;
        m47168x43d37992 = c10952x561633cd.m47168x43d37992();
        java.util.Iterator it = m47168x43d37992.f357503d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vv0.n) obj).f521931a, this.f522345f)) {
                    break;
                }
            }
        }
        vv0.n nVar = (vv0.n) obj;
        m47168x43d379922 = c10952x561633cd.m47168x43d37992();
        int c07 = kz5.n0.c0(m47168x43d379922.f357503d, nVar);
        if (c07 == -1 || nVar == null) {
            return;
        }
        m47168x43d379923 = c10952x561633cd.m47168x43d37992();
        m47168x43d379923.x(c07, vv0.n.a(nVar, null, this.f522344e, 0, false, false, 29, null));
    }
}
