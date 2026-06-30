package bu4;

/* loaded from: classes9.dex */
public class h implements com.tencent.mm.plugin.walletlock.model.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f24616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bu4.i f24617b;

    public h(bu4.i iVar, bu4.i iVar2) {
        this.f24617b = iVar;
        this.f24616a = null;
        this.f24616a = new java.lang.ref.WeakReference(iVar2);
    }

    @Override // com.tencent.mm.plugin.walletlock.model.f
    public void a() {
    }

    @Override // com.tencent.mm.plugin.walletlock.model.f
    public void onResult(int i17, java.lang.String str) {
        if (this.f24617b.f24623i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "is cancel ignore onResult");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f24616a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_OK");
            ((bu4.i) weakReference.get()).Di();
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "ERR_NOT_MATCH");
            ((bu4.i) weakReference.get()).Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.knx));
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "ERR_SYSTEM_ERROR");
            ((bu4.i) weakReference.get()).Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.knq));
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "ERR_TOO_MANY_TRIAL");
            ((bu4.i) weakReference.get()).Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.knw));
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "ERR_USER_CANCEL");
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "ERR_TIMEOUT");
            ((bu4.i) weakReference.get()).Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.knx));
        } else {
            if (i17 != 8) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "ERR_NO_FINGERPRINT");
            ((bu4.i) weakReference.get()).Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493551ko5));
        }
    }
}
