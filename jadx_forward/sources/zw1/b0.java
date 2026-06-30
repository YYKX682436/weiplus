package zw1;

/* loaded from: classes9.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.t1 f558115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 f558116e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0, ww1.t1 t1Var) {
        this.f558116e = activityC13142x725f2ac0;
        this.f558115d = t1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ww1.t1 t1Var = this.f558115d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f531825p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "goto h5: %s", t1Var.f531825p);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f558116e.mo55332x76847179(), t1Var.f531825p, true);
    }
}
