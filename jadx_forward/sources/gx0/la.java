package gx0;

/* loaded from: classes5.dex */
public final class la implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358208d;

    public la(gx0.ac acVar) {
        this.f358208d = acVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ex0.v vVar;
        cx0.c cVar = (cx0.c) obj;
        gx0.ac acVar = this.f358208d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p895x6855c7a2.p896x8438d441.C10945x27e58328 A7 = acVar.A7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        A7.n(cVar);
        acVar.c8().n7();
        ex0.a0 e86 = acVar.e8();
        ex0.r n17 = e86 != null ? e86.n() : null;
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar != null) {
            int ordinal = fVar.f338667j.ordinal();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i76 = ordinal != 1 ? ordinal != 2 ? acVar.c8().i7() : fVar.l().m34007xde00a612() : fVar.k();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) acVar.c8().f357791y.mo3195x754a37bb();
            if (c4128x879fba0a == null) {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            }
            if (i76.m33983x7b953cf2() && c4128x879fba0a.m33983x7b953cf2()) {
                ((gx0.bh) ((jz5.n) acVar.G).mo141623x754a37bb()).i7(i76, c4128x879fba0a);
            }
        }
        java.util.List<cx0.b> list = cVar.f306033a;
        if (!list.isEmpty()) {
            for (cx0.b bVar : list) {
                ex0.a0 e87 = acVar.e8();
                ex0.r K = e87 != null ? e87.K(bVar.f306029a) : null;
                if (K != null) {
                    ex0.a0 e88 = acVar.e8();
                    if ((e88 == null || (vVar = e88.f338630g) == null || !vVar.e(K)) ? false : true) {
                        p3325xe03a0797.p3326xc267989b.l.d(acVar.mo144225x95f74600(), null, null, new gx0.ka(acVar, K, null), 3, null);
                    }
                }
            }
        }
    }
}
