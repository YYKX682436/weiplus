package z43;

/* loaded from: classes15.dex */
public class u implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5 f551662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z43.v f551663b;

    public u(z43.v vVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5 c5Var) {
        this.f551663b = vVar;
        this.f551662a = c5Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchApplication", "onLaunchApp(launchSuccess : %s, launchCancel : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        z43.v vVar = this.f551663b;
        if (z18 || z17) {
            vVar.f551667g.f551677p.f224976f.d(false);
        } else {
            vVar.f551667g.f551677p.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5
    public void b(boolean z17) {
        this.f551662a.b(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5
    /* renamed from: reset */
    public void mo75138x6761d4f() {
        this.f551662a.mo75138x6761d4f();
    }
}
