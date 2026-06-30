package df2;

/* loaded from: classes3.dex */
public final class pq implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f312640d;

    public pq(df2.ar arVar) {
        this.f312640d = arVar;
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.ar arVar = this.f312640d;
        arVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(arVar.f311270m, "on animate end");
    }

    @Override // ym5.w1
    public void d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        java.lang.String str = this.f312640d.f311270m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on animate progress = ");
        sb6.append(c22789xd23e9a9b != null ? java.lang.Double.valueOf(c22789xd23e9a9b.m82577x402effa3()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }
}
