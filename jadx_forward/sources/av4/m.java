package av4;

/* loaded from: classes8.dex */
public final class m implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f95834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f95835b;

    public m(nw4.k kVar, nw4.y2 y2Var) {
        this.f95834a = kVar;
        this.f95835b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b5
    public final void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.LocalLaunchApplication", "onLaunchAppCallback(launchRet: %s, launchSuccess: %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        nw4.y2 y2Var = this.f95835b;
        nw4.k kVar = this.f95834a;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, "localLaunchApplication:ok", null);
        } else {
            kVar.f422396d.e(y2Var.f422546c, "localLaunchApplication:fail", null);
        }
    }
}
