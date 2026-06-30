package im2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig2.r f373867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd f373868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c f373869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ig2.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c c14221x14e9402c) {
        super(0);
        this.f373867d = rVar;
        this.f373868e = c14380x23078afd;
        this.f373869f = c14221x14e9402c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kn0.i iVar;
        boolean z17 = this.f373867d instanceof ig2.i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = this.f373868e;
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5533x6ef6951c c5533x6ef6951c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5533x6ef6951c();
            c5533x6ef6951c.f135858g.f88085a = c14380x23078afd.f198518h;
            c5533x6ef6951c.e();
        }
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        kn0.g gVar = (e1Var == null || (iVar = e1Var.f410523t) == null) ? null : iVar.f391091b;
        if (gVar != null && gVar.f391078l == 1) {
            co0.s u07 = efVar.u0();
            hn0.r rVar = u07 != null ? u07.R1 : null;
            if (rVar != null) {
                je2.z zVar = (je2.z) efVar.i(je2.z.class);
                rVar.b(zVar != null ? zVar.P6() : null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14380x23078afd.f198514d, "onDirectorExit need reSwitch to video");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14380x23078afd.f198514d, "onDirectorExit start finish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c fragment = this.f373869f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        ok2.a Q6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).Q6();
        if (Q6 != null) {
            um2.x5 x5Var = (um2.x5) Q6;
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(x5Var.f101138b)) {
                x5Var.f510582k1 = true;
            }
        }
        c14380x23078afd.P6("onDirectorExit");
        return jz5.f0.f384359a;
    }
}
