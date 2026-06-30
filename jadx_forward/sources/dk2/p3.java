package dk2;

/* loaded from: classes.dex */
public final class p3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315429b;

    public p3(dk2.r4 r4Var, yz5.p pVar) {
        this.f315428a = r4Var;
        this.f315429b = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315428a.f315542d, "errType:" + fVar.f152148a + " errCode:" + fVar.f152149b);
        yz5.p pVar = this.f315429b;
        if (pVar == null) {
            return null;
        }
        pVar.mo149xb9724478(java.lang.Boolean.valueOf(fVar.f152149b == 0), fVar.f152150c);
        return jz5.f0.f384359a;
    }
}
