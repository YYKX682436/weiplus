package bu4;

/* loaded from: classes9.dex */
public class e implements fu4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cu4.i f106144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f106145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bu4.i f106146c;

    public e(bu4.i iVar, cu4.i iVar2, boolean z17) {
        this.f106146c = iVar;
        this.f106144a = iVar2;
        this.f106145b = z17;
    }

    @Override // fu4.g
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "prepare onFinish, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        if (this.f106146c.f106156i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWalletLock", "prepare onFinish, isCancel, ignore callback");
            return;
        }
        cu4.i iVar = this.f106144a;
        if (i17 == 0) {
            iVar.mo25444x3cac0e28(0, "");
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knq);
        if (this.f106145b) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2u);
        }
        iVar.mo25444x3cac0e28(-1, string);
    }
}
