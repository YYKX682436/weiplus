package q93;

/* loaded from: classes8.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.n f442440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q93.d f442441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f442442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q93.d f442443d;

    public b(q93.d dVar, nw4.n nVar, q93.d dVar2, int i17) {
        this.f442443d = dVar;
        this.f442440a = nVar;
        this.f442441b = dVar2;
        this.f442442c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x0 x0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3 k3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3) x0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = k3Var.f263397d.f263413g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var);
        nw4.n nVar = this.f442440a;
        nVar.f422432m = v0Var;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var2 = k3Var.f263397d.f263413g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var2);
            v0Var2.rg(new q93.c(this.f442443d, nVar, this.f442441b), this.f442442c);
        } catch (java.lang.Exception unused) {
        }
        nVar.A0(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0
    public boolean b() {
        return false;
    }
}
