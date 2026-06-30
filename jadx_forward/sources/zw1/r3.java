package zw1;

/* loaded from: classes15.dex */
public class r3 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f558310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558311c;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var, int i17) {
        this.f558311c = activityC13149x63b02cb3;
        this.f558309a = a3Var;
        this.f558310b = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        ww1.a3 a3Var = this.f558309a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "click save code tv，usage_needed :%s", java.lang.Boolean.valueOf(a3Var.O));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558311c;
        int i17 = activityC13149x63b02cb3.f177968d;
        int i18 = this.f558310b;
        if (i17 == 1 && a3Var.O) {
            activityC13149x63b02cb3.e7();
        } else {
            a3Var.f531645v = 2;
            activityC13149x63b02cb3.j7(i18, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 6, java.lang.Integer.valueOf(i18));
    }
}
