package zx5;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f558760d;

    public e0(int i17) {
        this.f558760d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx5.c cVar = com.p314xaae8f345.p3210x3857dc.b3.f301748c;
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc gcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc) cVar;
            gcVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateFailed, errorCode:" + this.f558760d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98 = gcVar.f171277b;
            activityC12695x889c9c98.f171025d = null;
            com.p314xaae8f345.p3210x3857dc.b3.f301748c = null;
            activityC12695x889c9c98.setResult(0, new android.content.Intent());
            activityC12695x889c9c98.finish();
        }
    }
}
