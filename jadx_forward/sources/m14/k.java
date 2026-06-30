package m14;

/* loaded from: classes11.dex */
public class k implements c01.e8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f404412d;

    public k(m14.f fVar) {
        this.f404412d = fVar;
    }

    @Override // c01.e8
    public void b(int i17, int i18) {
    }

    @Override // c01.e8
    public void c(boolean z17, long j17, int i17) {
        m14.f fVar = this.f404412d;
        android.app.ProgressDialog progressDialog = fVar.f404403b;
        if (progressDialog != null) {
            progressDialog.dismiss();
            fVar.f404403b = null;
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5938xa5e3b19f().e();
    }
}
