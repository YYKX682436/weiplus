package a73;

/* loaded from: classes15.dex */
public class b implements b73.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gwallet.GWalletQueryProvider f1929a;

    public b(com.tencent.mm.plugin.gwallet.GWalletQueryProvider gWalletQueryProvider) {
        this.f1929a = gWalletQueryProvider;
    }

    @Override // b73.g
    public void a(b73.j jVar) {
        if (jVar.f18222a == 0) {
            gm0.j1.e().g(new a73.a(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GWalletQueryProvider", "Problem setting up in-app billing: " + jVar);
        com.tencent.mm.plugin.gwallet.GWalletQueryProvider gWalletQueryProvider = this.f1929a;
        gWalletQueryProvider.f142240e = false;
        b73.i iVar = gWalletQueryProvider.f142239d;
        if (iVar != null) {
            iVar.d();
        }
        gWalletQueryProvider.f142239d = null;
    }
}
