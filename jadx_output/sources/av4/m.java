package av4;

/* loaded from: classes8.dex */
public final class m implements com.tencent.mm.pluginsdk.model.app.b5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f14301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f14302b;

    public m(nw4.k kVar, nw4.y2 y2Var) {
        this.f14301a = kVar;
        this.f14302b = y2Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.b5
    public final void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.LocalLaunchApplication", "onLaunchAppCallback(launchRet: %s, launchSuccess: %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        nw4.y2 y2Var = this.f14302b;
        nw4.k kVar = this.f14301a;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, "localLaunchApplication:ok", null);
        } else {
            kVar.f340863d.e(y2Var.f341013c, "localLaunchApplication:fail", null);
        }
    }
}
