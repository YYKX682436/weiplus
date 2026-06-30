package zb3;

/* loaded from: classes9.dex */
public class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zb3.v f552826d;

    public u(zb3.v vVar) {
        this.f552826d = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        zb3.v vVar = this.f552826d;
        android.app.Dialog dialog = vVar.f552827d.f227298s;
        if (dialog != null && dialog.isShowing()) {
            vVar.f552827d.f227298s.hide();
        }
        if (vVar.f552827d.m78513xc2a54588().getVisibility() == 8 || vVar.f552827d.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
            vVar.f552827d.finish();
        }
        vVar.f552827d.m66166xc8398945();
    }
}
