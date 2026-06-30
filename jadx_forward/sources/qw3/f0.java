package qw3;

/* loaded from: classes9.dex */
public class f0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw3.g0 f448688d;

    public f0(qw3.g0 g0Var) {
        this.f448688d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "coperationTipDialogNoTransparent onCancel()");
        qw3.g0 g0Var = this.f448688d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = g0Var.f448692e;
        activityC17101x8420a569.T = false;
        activityC17101x8420a569.S = false;
        android.app.Dialog dialog = activityC17101x8420a569.D;
        if (dialog != null && dialog.isShowing()) {
            g0Var.f448692e.D.dismiss();
        }
        if (g0Var.f448692e.m78513xc2a54588().getVisibility() == 8 || g0Var.f448692e.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "usr cancel, & visibility not visiable, so finish");
            g0Var.f448692e.finish();
        }
        g0Var.f448692e.mo73851xc8398945();
    }
}
