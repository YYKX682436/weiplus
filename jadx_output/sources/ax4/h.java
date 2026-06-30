package ax4;

/* loaded from: classes.dex */
public final class h implements com.tencent.mm.ui.widget.dialog.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f15131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f15132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.z0 f15133d;

    public h(int i17, nw4.k kVar, nw4.y2 y2Var, com.tencent.mm.plugin.webview.stub.z0 z0Var) {
        this.f15130a = i17;
        this.f15131b = kVar;
        this.f15132c = y2Var;
        this.f15133d = z0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k
    public final void a(boolean z17) {
        nw4.k kVar = this.f15131b;
        nw4.y2 y2Var = this.f15132c;
        if (z17 && this.f15130a == 2) {
            pm0.v.V(1500L, new ax4.g(y2Var, this.f15133d, kVar));
            return;
        }
        nw4.g gVar = kVar.f340863d;
        java.lang.String str = y2Var.f341013c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y2Var.f341019i);
        sb6.append(':');
        sb6.append(z17 ? "ok" : "fail");
        gVar.e(str, sb6.toString(), null);
    }
}
