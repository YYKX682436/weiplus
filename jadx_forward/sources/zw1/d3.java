package zw1;

/* loaded from: classes9.dex */
public class d3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.t1 f558138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 f558139e;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5, ww1.t1 t1Var) {
        this.f558139e = activityC13148x64d0f1c5;
        this.f558138d = t1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ww1.t1 t1Var = this.f558138d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f531825p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "goto h5: %s", t1Var.f531825p);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f558139e.mo55332x76847179(), t1Var.f531825p, true);
    }
}
