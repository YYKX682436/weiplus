package gi5;

/* loaded from: classes12.dex */
public final class u implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf3.k f353867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gi5.v f353868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg3.c f353869c;

    public u(mf3.k kVar, gi5.v vVar, gg3.c cVar) {
        this.f353867a = kVar;
        this.f353868b = vVar;
        this.f353869c = cVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        float f17 = (n1Var == null || (gVar2 = n1Var.f152640e) == null) ? 0.0f : (float) gVar2.f69496x83ec3dd;
        float f18 = (n1Var == null || (gVar = n1Var.f152640e) == null) ? -1.0f : (float) gVar.f69500x8ab84c59;
        float f19 = f17 / f18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        mf3.k kVar = this.f353867a;
        sb6.append(kVar.mo2110x5db1b11());
        sb6.append(", progress: ");
        sb6.append(f19);
        sb6.append('(');
        sb6.append(f17);
        sb6.append('/');
        sb6.append(f18);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", sb6.toString());
        this.f353868b.W6(kVar, gg3.d.f353265d, this.f353869c, new gg3.e(null, 0, f19, 3, null));
    }
}
