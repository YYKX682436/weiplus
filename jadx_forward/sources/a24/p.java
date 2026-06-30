package a24;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 f82429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6) {
        super(1);
        this.f82429d = abstractActivityC17508x8f0972f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        r24.f state = (r24.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof r24.e)) {
            java.lang.String c76 = ((a24.i) ((r24.e) dVar2).f450385b.f384366d).c7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6 = this.f82429d;
            abstractActivityC17508x8f0972f6.mo54450xbf7c1df6(c76);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6.f243370h;
            java.util.Iterator it = abstractActivityC17508x8f0972f6.mo80395x5316d740().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = 0;
                    break;
                }
                dVar = it.next();
                if (((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) dVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.d) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.d dVar3 = dVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.d ? dVar : null;
            if (dVar3 != null && (c16718x7059cefe = dVar3.f82423d) != null && (c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) abstractActivityC17508x8f0972f6.findViewById(com.p314xaae8f345.mm.R.id.lqa)) != null) {
                c22849x81a93d25.post(new a24.o(abstractActivityC17508x8f0972f6, c16718x7059cefe));
            }
        }
        return jz5.f0.f384359a;
    }
}
