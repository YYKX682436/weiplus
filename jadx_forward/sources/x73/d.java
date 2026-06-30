package x73;

/* loaded from: classes.dex */
public class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16108xa09a31af f533975d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16108xa09a31af intentServiceC16108xa09a31af) {
        this.f533975d = intentServiceC16108xa09a31af;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16108xa09a31af intentServiceC16108xa09a31af = this.f533975d;
        dp.a.m125854x26a183b(context, intentServiceC16108xa09a31af.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ceh), 1).show();
        intentServiceC16108xa09a31af.stopSelf();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(z17));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16108xa09a31af intentServiceC16108xa09a31af = this.f533975d;
        dp.a.m125854x26a183b(context, intentServiceC16108xa09a31af.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cej), 1).show();
        intentServiceC16108xa09a31af.stopSelf();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskResumed id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskPaused id=%d", java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskStarted id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskRemoved id=%d", java.lang.Long.valueOf(j17));
        this.f533975d.stopSelf();
    }
}
