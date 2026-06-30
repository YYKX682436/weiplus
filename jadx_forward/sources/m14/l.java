package m14;

/* loaded from: classes11.dex */
public class l implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f404413d;

    public l(m14.f fVar) {
        this.f404413d = fVar;
    }

    @Override // c01.da
    public boolean a() {
        return this.f404413d.f404404c;
    }

    @Override // c01.da
    public void c() {
        m14.f fVar = this.f404413d;
        android.app.ProgressDialog progressDialog = fVar.f404403b;
        if (progressDialog != null) {
            progressDialog.dismiss();
            fVar.f404403b = null;
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5938xa5e3b19f().e();
    }
}
