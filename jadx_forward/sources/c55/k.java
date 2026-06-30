package c55;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120274d;

    public k(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a) {
        this.f120274d = activityC19821xb90ad83a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ProgressBar progressBar = this.f120274d.f273722f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirProgressBar");
            throw null;
        }
    }
}
