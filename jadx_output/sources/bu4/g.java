package bu4;

/* loaded from: classes9.dex */
public class g implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bu4.i f24615a;

    public g(bu4.i iVar) {
        this.f24615a = iVar;
    }

    @Override // lz2.a
    public void onAuthCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "face id auth cancel");
    }

    @Override // lz2.a
    public void onAuthFail(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "face id auth fail: %s", java.lang.Integer.valueOf(i17));
        bu4.i iVar = this.f24615a;
        if (i17 == -2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_FACEID_NO_ENROLLED");
            iVar.Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2x));
            return;
        }
        if (i17 == 2005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_SENSOR_ERROR");
            iVar.Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2u));
            return;
        }
        if (i17 == 2007) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_KEY_INVALID");
            iVar.Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2w));
            return;
        }
        if (i17 == 10308) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_TOO_MANY_TRIAL");
            iVar.Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2v));
            return;
        }
        switch (i17) {
            case 2000:
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_USER_CANCEL");
                return;
            case 2001:
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_TIMEOUT");
                iVar.Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2w));
                return;
            case 2002:
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "RESULT_NO_MATCH");
                iVar.Bi(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2w));
                return;
            default:
                return;
        }
    }

    @Override // lz2.a
    public void onAuthSuccess(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "face id auth success");
        this.f24615a.Di();
    }
}
