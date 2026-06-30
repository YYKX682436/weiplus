package ax4;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ nw4.k C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f15128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.z0 f15129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nw4.y2 y2Var, com.tencent.mm.plugin.webview.stub.z0 z0Var, nw4.k kVar) {
        super(0);
        this.f15128d = y2Var;
        this.f15129e = z0Var;
        this.C = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nw4.k kVar = this.C;
        nw4.y2 y2Var = this.f15128d;
        try {
            android.os.Bundle b17 = nw4.y2.b(y2Var.f340790a);
            com.tencent.mm.plugin.webview.stub.z0 z0Var = this.f15129e;
            if (z0Var != null) {
                z0Var.ec();
            }
            if (z0Var != null) {
                z0Var.b(b17);
            }
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewNativePageUtil", "closeWindow ex " + e17.getMessage());
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
        return jz5.f0.f302826a;
    }
}
