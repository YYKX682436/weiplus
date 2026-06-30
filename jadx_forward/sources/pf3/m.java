package pf3;

/* loaded from: classes12.dex */
public abstract class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f435367d;

    @Override // java.lang.Runnable
    public void run() {
        if (this.f435367d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.BottomBarOperationLayer", "SafeRunnable was removed, but still be executed.");
            return;
        }
        pf3.e eVar = (pf3.e) this;
        pf3.g gVar = eVar.f435357e;
        gVar.Q("autoHideRunnable exec + " + eVar, new java.lang.Object[0]);
        gVar.c();
    }
}
