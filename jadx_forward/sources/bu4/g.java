package bu4;

/* loaded from: classes9.dex */
public class g implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bu4.i f106148a;

    public g(bu4.i iVar) {
        this.f106148a = iVar;
    }

    @Override // lz2.a
    /* renamed from: onAuthCancel */
    public void mo11325x21a77981() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "face id auth cancel");
    }

    @Override // lz2.a
    /* renamed from: onAuthFail */
    public void mo11326xfa7237e5(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "face id auth fail: %s", java.lang.Integer.valueOf(i17));
        bu4.i iVar = this.f106148a;
        if (i17 == -2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_FACEID_NO_ENROLLED");
            iVar.Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2x));
            return;
        }
        if (i17 == 2005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_SENSOR_ERROR");
            iVar.Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2u));
            return;
        }
        if (i17 == 2007) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_KEY_INVALID");
            iVar.Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2w));
            return;
        }
        if (i17 == 10308) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_TOO_MANY_TRIAL");
            iVar.Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2v));
            return;
        }
        switch (i17) {
            case 2000:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_USER_CANCEL");
                return;
            case 2001:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_TIMEOUT");
                iVar.Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2w));
                return;
            case 2002:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_NO_MATCH");
                iVar.Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2w));
                return;
            default:
                return;
        }
    }

    @Override // lz2.a
    /* renamed from: onAuthSuccess */
    public void mo11327x833155dc(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "face id auth success");
        this.f106148a.Di();
    }
}
