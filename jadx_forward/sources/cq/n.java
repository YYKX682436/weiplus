package cq;

/* loaded from: classes.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f302777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.g f302778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.p pVar, bq.g gVar, yz5.l lVar) {
        super(1);
        this.f302777d = pVar;
        this.f302778e = gVar;
        this.f302779f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.dw0 dw0Var = fVar != null ? (r45.dw0) fVar.f152151d : null;
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17 || dw0Var == null) {
            yz5.l lVar = this.f302779f;
            if (lVar == null) {
                return null;
            }
            lVar.mo146xb9724478(fVar);
        } else {
            yz5.p pVar = this.f302777d;
            if (pVar == null) {
                return null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f302778e.f152179f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindPoiResponse");
            pVar.mo149xb9724478(dw0Var, ((r45.dw0) fVar2).m75941xfb821914(1));
        }
        return f0Var;
    }
}
