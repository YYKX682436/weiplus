package cd1;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f40613d;

    public a(cd1.i iVar) {
        this.f40613d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        cd1.i iVar = this.f40613d;
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "loop check NFC switch currentCount: %d", java.lang.Integer.valueOf(iVar.f40623a));
        int i17 = iVar.f40623a + 1;
        iVar.f40623a = i17;
        if (i17 > 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "loop check count exceed max limit: %d", 10);
            iVar.d();
            iVar.c();
            return false;
        }
        if (!fd1.d.c()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "loopCheck NFC switch is opened, and cancel task");
        iVar.d();
        iVar.b(true);
        return false;
    }
}
