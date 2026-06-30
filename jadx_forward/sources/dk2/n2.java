package dk2;

/* loaded from: classes.dex */
public final class n2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315325a;

    public n2(yz5.p pVar) {
        this.f315325a = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.p pVar = this.f315325a;
        if (i17 == 0 && fVar.f152149b == 0) {
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, fVar.f152151d);
                return f0Var;
            }
        } else if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
            return f0Var;
        }
        return null;
    }
}
