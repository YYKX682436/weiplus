package c55;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c55.q f38755d;

    public p(c55.q qVar) {
        this.f38755d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c55.q qVar = this.f38755d;
        if (qVar.f38757e.f38766d.isFinishing()) {
            return;
        }
        c55.u uVar = qVar.f38757e;
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = uVar.f38766d;
        java.lang.Thread thread = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
        recoveryUI.f192198h.setClickable(true);
        recoveryUI.f192198h.setVisibility(0);
        recoveryUI.f192199i.setVisibility(8);
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI2 = uVar.f38766d;
        recoveryUI2.f192197g.setText(recoveryUI2.getResources().getString(com.tencent.recovery.wx.R.string.recovery_tips_post));
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = uVar.f38766d;
        recoveryUI3.f192198h.setText(recoveryUI3.getResources().getString(com.tencent.recovery.wx.R.string.recovery_btn_restart));
        uVar.f38766d.f192198h.setOnClickListener(new c55.o(this));
    }
}
