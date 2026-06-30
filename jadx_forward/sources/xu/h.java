package xu;

/* loaded from: classes9.dex */
public final /* synthetic */ class h extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public h(java.lang.Object obj) {
        super(1, obj, xu.k.class, "processState", "processState(Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<s15.h> j17;
        hu.e p07 = (hu.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        xu.k kVar = (xu.k) this.f72685xcfcbe9ef;
        kVar.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof hu.a)) {
            hu.a aVar = (hu.a) dVar;
            hu.f fVar = aVar.f366527b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
            p07.f366535e = fVar;
            s15.w wVar = aVar.f366528c;
            p07.f366536f = wVar;
            fVar.f366538e = wVar;
            if (wVar != null && (j17 = wVar.j()) != null) {
                for (s15.h hVar : j17) {
                    long Q = hVar.Q();
                    if (Q > 0) {
                        try {
                            java.lang.String format = kVar.f538713d.format(new java.util.Date(Q * 1000));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                            hVar.T0(format);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordDetailDataUIC", "Failed to format srcMsgCreateTime: " + e17.getMessage());
                        }
                    }
                }
            }
            pt0.e0 e0Var = pt0.f0.f439742b1;
            hu.f fVar2 = aVar.f366527b;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(fVar2.q(), fVar2.n());
            if (k17 != null) {
                p07.f366535e.f366537d = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(k17);
            }
        }
        return jz5.f0.f384359a;
    }
}
