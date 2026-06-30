package so2;

/* loaded from: classes.dex */
public final class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f492256a;

    public y1(yz5.l lVar) {
        this.f492256a = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f492256a;
        if (i17 == 0 && fVar.f152149b == 0) {
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                return f0Var;
            }
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return f0Var;
        }
        return null;
    }
}
