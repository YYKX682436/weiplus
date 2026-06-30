package zw1;

/* loaded from: classes15.dex */
public class r5 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558316f;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var, ww1.b3 b3Var) {
        this.f558316f = activityC13149x63b02cb3;
        this.f558314d = a3Var;
        this.f558315e = b3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        ww1.a3 a3Var = this.f558314d;
        if (a3Var.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "has show error, do not show timer error");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "has not back resp");
            a3Var.C = true;
            ww1.y2.e(this.f558315e, a3Var, "", this.f558316f.mo55332x76847179());
        }
        return true;
    }
}
