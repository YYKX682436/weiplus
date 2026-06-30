package bl2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f103241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bl2.k f103242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f103243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bw5.lp0 lp0Var, bl2.k kVar, r45.d22 d22Var) {
        super(0);
        this.f103241d = lp0Var;
        this.f103242e = kVar;
        this.f103243f = d22Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i95.m c17 = i95.n0.c(qk.g9.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        bw5.lp0 tingItem = this.f103241d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        pm0.v.X(new rk4.y8(tingItem, null, new il4.e(null, 0, 2200, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null)));
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        bl2.k kVar = this.f103242e;
        qk.f9.b(aj6, kVar.f199914d, false, this.f103241d, null, null, null, null, null, 248, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var = kVar.f103251i;
        qo0.c cVar = jj0Var.f194858g;
        fm2.c cVar2 = cVar instanceof fm2.c ? (fm2.c) cVar : null;
        if (cVar2 != null) {
            jj0Var.f194658x = true;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f9289 = cVar2.m57689x106f9289();
            if (m57689x106f9289 != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m57689x106f9289.m7481x7a6e8df6() ? m57689x106f9289 : null;
                if (componentCallbacksC1101xa17d4670 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).U6();
                    um2.x5 m129745xca56ce03 = cVar2.m129745xca56ce03();
                    if (m129745xca56ce03 != null) {
                        m129745xca56ce03.d0();
                    }
                }
            }
        }
        r45.d22 d22Var = this.f103243f;
        boolean b17 = dk2.q.b(d22Var);
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(9);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        bl2.k.y(kVar, 3, b17, m75945x2fec8307);
        return jz5.f0.f384359a;
    }
}
