package md3;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md3.z f407396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407399g;

    public x(md3.z zVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f407396d = zVar;
        this.f407397e = str;
        this.f407398f = str2;
        this.f407399g = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        lc3.e eVar = this.f407396d.f399423a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Qj(eVar != null ? eVar.B0() : null, this.f407397e, this.f407398f, this.f407399g);
    }
}
