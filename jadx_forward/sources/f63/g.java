package f63;

/* loaded from: classes4.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f341388a;

    public g(yz5.p pVar) {
        this.f341388a = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        yz5.p pVar = this.f341388a;
        if (i17 == 0 && fVar.f152149b == 0) {
            v53.i iVar = (v53.i) fVar.f152151d;
            java.lang.String str = iVar.f514875d;
            pVar.mo149xb9724478(str != null ? str : "", iVar.f514876e);
        } else {
            pVar.mo149xb9724478("", null);
        }
        return jz5.f0.f384359a;
    }
}
