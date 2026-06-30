package zh5;

/* loaded from: classes12.dex */
public final class o implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf3.k f554587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh5.p f554588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg3.c f554589c;

    public o(mf3.k kVar, zh5.p pVar, gg3.c cVar) {
        this.f554587a = kVar;
        this.f554588b = pVar;
        this.f554589c = cVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        float f17 = (n1Var == null || (gVar2 = n1Var.f152640e) == null) ? 0.0f : (float) gVar2.f69496x83ec3dd;
        float f18 = (n1Var == null || (gVar = n1Var.f152640e) == null) ? -1.0f : (float) gVar.f69500x8ab84c59;
        float f19 = f17 / f18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        mf3.k kVar = this.f554587a;
        sb6.append(kVar.mo2110x5db1b11());
        sb6.append(", progress: ");
        sb6.append(f19);
        sb6.append('(');
        sb6.append(f17);
        sb6.append('/');
        sb6.append(f18);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", sb6.toString());
        this.f554588b.W6(kVar, gg3.d.f353265d, this.f554589c, new gg3.e(null, 0, f19, 3, null));
    }
}
