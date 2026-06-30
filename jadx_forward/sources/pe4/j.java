package pe4;

/* loaded from: classes15.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe4.m f435237d;

    public j(pe4.m mVar) {
        this.f435237d = mVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth");
        pe4.m mVar = this.f435237d;
        if (mVar.f435253d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        } else {
            mVar.a();
            mVar.f435253d.obtainMessage(1, mVar.f435251b).sendToTarget();
        }
    }
}
