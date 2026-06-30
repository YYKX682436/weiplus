package bu4;

/* loaded from: classes9.dex */
public class e implements fu4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cu4.i f24611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bu4.i f24613c;

    public e(bu4.i iVar, cu4.i iVar2, boolean z17) {
        this.f24613c = iVar;
        this.f24611a = iVar2;
        this.f24612b = z17;
    }

    @Override // fu4.g
    public void h(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "prepare onFinish, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        if (this.f24613c.f24623i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWalletLock", "prepare onFinish, isCancel, ignore callback");
            return;
        }
        cu4.i iVar = this.f24611a;
        if (i17 == 0) {
            iVar.onPrepare(0, "");
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.knq);
        if (this.f24612b) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2u);
        }
        iVar.onPrepare(-1, string);
    }
}
