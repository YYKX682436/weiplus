package ax4;

/* loaded from: classes.dex */
public final class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f96664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f96665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 f96666d;

    public h(int i17, nw4.k kVar, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var) {
        this.f96663a = i17;
        this.f96664b = kVar;
        this.f96665c = y2Var;
        this.f96666d = z0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k
    public final void a(boolean z17) {
        nw4.k kVar = this.f96664b;
        nw4.y2 y2Var = this.f96665c;
        if (z17 && this.f96663a == 2) {
            pm0.v.V(1500L, new ax4.g(y2Var, this.f96666d, kVar));
            return;
        }
        nw4.g gVar = kVar.f422396d;
        java.lang.String str = y2Var.f422546c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y2Var.f422552i);
        sb6.append(':');
        sb6.append(z17 ? "ok" : "fail");
        gVar.e(str, sb6.toString(), null);
    }
}
