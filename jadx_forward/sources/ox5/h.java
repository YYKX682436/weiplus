package ox5;

/* loaded from: classes14.dex */
public class h implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox5.a f431347d;

    public h(ox5.a aVar) {
        this.f431347d = aVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        ox5.k kVar = this.f431347d.f431333i;
        if (kVar != null) {
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.L1;
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = ((com.p314xaae8f345.p362xadfe2b3.ui.z0) kVar).f127777a;
            activityC3722x408816c7.getClass();
            new android.os.Handler().postDelayed(new com.p314xaae8f345.p362xadfe2b3.ui.RunnableC3724x9cd32bbb(activityC3722x408816c7), 60);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        ox5.k kVar = this.f431347d.f431333i;
        if (kVar != null) {
            ((com.p314xaae8f345.p362xadfe2b3.ui.z0) kVar).f127777a.C1.setVisibility(0);
        }
    }
}
