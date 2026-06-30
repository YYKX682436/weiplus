package cq;

/* loaded from: classes5.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f302767a;

    public l0(yz5.p pVar) {
        this.f302767a = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.pt2 pt2Var = fVar != null ? (r45.pt2) fVar.f152151d : null;
        boolean z17 = (fVar != null && fVar.b()) && pt2Var != null;
        yz5.p pVar = this.f302767a;
        if (pVar == null) {
            return null;
        }
        pVar.mo149xb9724478(java.lang.Boolean.valueOf(z17), pt2Var);
        return jz5.f0.f384359a;
    }
}
