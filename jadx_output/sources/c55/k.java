package c55;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38741d;

    public k(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI) {
        this.f38741d = recoveryToolsUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ProgressBar progressBar = this.f38741d.f192189f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirProgressBar");
            throw null;
        }
    }
}
