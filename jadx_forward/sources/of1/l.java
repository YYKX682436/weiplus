package of1;

/* loaded from: classes8.dex */
public class l implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.m f426491a;

    public l(of1.m mVar) {
        this.f426491a = mVar;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        of1.m mVar = this.f426491a;
        try {
            if (mVar.f426415f != null) {
                mVar.f426498i = java.lang.System.currentTimeMillis();
                mVar.f426415f.D8(str, new int[]{3}, 0, 0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "viewCaptureCallback, invoker is null");
            }
        } catch (android.os.RemoteException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "recog failed");
        }
    }
}
