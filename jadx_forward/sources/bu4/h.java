package bu4;

/* loaded from: classes9.dex */
public class h implements com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f106149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bu4.i f106150b;

    public h(bu4.i iVar, bu4.i iVar2) {
        this.f106150b = iVar;
        this.f106149a = null;
        this.f106149a = new java.lang.ref.WeakReference(iVar2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f
    /* renamed from: onResult */
    public void mo11328x57429edc(int i17, java.lang.String str) {
        if (this.f106150b.f106156i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "is cancel ignore onResult");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f106149a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "RESULT_OK");
            ((bu4.i) weakReference.get()).Di();
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "ERR_NOT_MATCH");
            ((bu4.i) weakReference.get()).Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knx));
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "ERR_SYSTEM_ERROR");
            ((bu4.i) weakReference.get()).Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knq));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "ERR_TOO_MANY_TRIAL");
            ((bu4.i) weakReference.get()).Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knw));
            return;
        }
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "ERR_USER_CANCEL");
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "ERR_TIMEOUT");
            ((bu4.i) weakReference.get()).Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knx));
        } else {
            if (i17 != 8) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "ERR_NO_FINGERPRINT");
            ((bu4.i) weakReference.get()).Bi(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575084ko5));
        }
    }
}
