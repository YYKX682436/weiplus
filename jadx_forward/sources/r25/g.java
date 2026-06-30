package r25;

/* loaded from: classes7.dex */
public final class g implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f450394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc0.h f450395b;

    public g(l81.b1 b1Var, bc0.h hVar) {
        this.f450394a = b1Var;
        this.f450395b = hVar;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkWxaHandler", "handleWxa, startWxa failed, appId: " + this.f450394a.f398547b);
        bc0.h hVar = this.f450395b;
        if (hVar != null) {
            ((o25.C29259x380127) hVar).a(false, null);
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkWxaHandler", "handleWxa, startWxa success, appId: " + this.f450394a.f398547b);
        bc0.h hVar = this.f450395b;
        if (hVar != null) {
            ((o25.C29259x380127) hVar).a(true, null);
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
