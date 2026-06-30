package mu4;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.n f412941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f412942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mu4.h f412943c;

    public g(nw4.n nVar, int i17, mu4.h hVar) {
        this.f412941a = nVar;
        this.f412942b = i17;
        this.f412943c = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x0 conn) {
        nw4.n nVar = this.f412941a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conn, "conn");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3 k3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3) conn;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = k3Var.f263397d.f263413g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var);
            nVar.f422432m = v0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var2 = k3Var.f263397d.f263413g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var2);
            v0Var2.rg(new mu4.f(nVar), this.f412942b);
            nVar.A0(true);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f412943c.f412952e, "onConnected ex " + th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0
    public boolean b() {
        return false;
    }
}
