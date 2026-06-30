package bu4;

@j95.b
/* loaded from: classes9.dex */
public class i extends i95.w implements cu4.k {

    /* renamed from: e, reason: collision with root package name */
    public fu4.h f24619e;

    /* renamed from: f, reason: collision with root package name */
    public fu4.n f24620f;

    /* renamed from: g, reason: collision with root package name */
    public bu4.h f24621g;

    /* renamed from: h, reason: collision with root package name */
    public cu4.j f24622h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f24618d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f24623i = false;

    /* renamed from: m, reason: collision with root package name */
    public cu4.g f24624m = new com.tencent.mm.plugin.walletlock.model.j();

    /* renamed from: n, reason: collision with root package name */
    public boolean f24625n = false;

    public boolean Ai() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wallet_lock_kinda_config, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "isWalletKindaEnable %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public void Bi(int i17, java.lang.String str) {
        this.f24622h.onAuthResult(2, str, "", "", "");
    }

    public void Di() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "onAuthenSuccess, isfaceId : %s", java.lang.Boolean.valueOf(this.f24625n));
        zt5.s sVar = this.f24625n ? mz2.d2.IML.f333114g : com.tencent.mm.plugin.walletlock.model.l.instance.f181371e;
        if (sVar != null) {
            java.lang.String str = sVar.f475621b;
            this.f24622h.onAuthResult((com.tencent.mm.sdk.platformtools.t8.K0(str) || fu4.a.d(str)) ? 0 : 1, "", str, sVar.f475629j, sVar.f475630k);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "SoterSignatureResult is null, show as fail");
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.knq);
            if (this.f24625n) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2u);
            }
            Bi(2, string);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "PluginWalletLock onAccountRelease");
        java.util.HashSet hashSet = com.tencent.mm.plugin.walletlock.model.n.INSTANCE.f181379g;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        hu4.i.f285230a = -1L;
        fu4.a.f266884a = -1L;
        ((km0.c) gm0.j1.p().a()).f308989c.registerActivityLifecycleCallbacks(new bu4.f(this));
    }

    public cu4.g wi() {
        if (this.f24624m == null) {
            synchronized (this) {
                if (this.f24624m == null) {
                    this.f24624m = new com.tencent.mm.plugin.walletlock.model.j();
                }
            }
        }
        return this.f24624m;
    }
}
