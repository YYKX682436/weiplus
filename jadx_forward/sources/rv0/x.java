package rv0;

/* loaded from: classes5.dex */
public final class x implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481852e;

    public x(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f481851d = n1Var;
        this.f481852e = a0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        cx0.c cVar = (cx0.c) obj;
        rv0.n1 n1Var = this.f481851d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r76 = n1Var.r7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        r76.n(cVar);
        n1Var.w7();
        java.util.List list = cVar.f306033a;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = ((cx0.b) it.next()).f306029a;
                ex0.a0 a0Var = this.f481852e;
                ex0.r K = a0Var.K(c3971x241f78);
                if (K != null && a0Var.f338630g.e(K)) {
                    p3325xe03a0797.p3326xc267989b.l.d(n1Var.mo144225x95f74600(), null, null, new rv0.w(a0Var, K, null), 3, null);
                }
            }
        }
    }
}
