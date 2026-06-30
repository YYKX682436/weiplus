package re2;

/* loaded from: classes3.dex */
public final class i1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "screenShotCallback onScreenShot: dateAdded=" + j17 + ", isPending=" + z17);
        re2.e0 e0Var = re2.j1.f475971b;
        if (e0Var != null && e0Var.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "notifyScreenshotDetected: invitationId=" + e0Var.f475923c + ", phase=" + e0Var.f475922b);
            e0Var.h();
        }
    }
}
