package qw3;

/* loaded from: classes9.dex */
public class o implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3.i f448716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448717b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, ow3.i iVar) {
        this.f448717b = activityC17101x8420a569;
        this.f448716a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448717b;
        android.app.Dialog dialog = activityC17101x8420a569.D;
        if (dialog != null && dialog.isShowing()) {
            activityC17101x8420a569.D.dismiss();
        }
        activityC17101x8420a569.R = true;
        activityC17101x8420a569.S = false;
        ow3.i iVar = this.f448716a;
        r45.f25 f25Var = iVar.f430949s;
        activityC17101x8420a569.C = f25Var.f455482m;
        java.lang.String str2 = f25Var.f455483n;
        activityC17101x8420a569.f238024u = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "set uniqueId:%s", str2);
        r45.f25 f25Var2 = iVar.f430949s;
        activityC17101x8420a569.f238025v = f25Var2.f455484o;
        activityC17101x8420a569.f238026w = f25Var2.f455485p;
        activityC17101x8420a569.f238018o.m83148xdedf72f8(f25Var2.f455486q);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.X6(activityC17101x8420a569)) {
            activityC17101x8420a569.e7();
            return;
        }
        if (activityC17101x8420a569.T) {
            if (activityC17101x8420a569.I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "NetSceneBankRemitOperation: from record goto next direct");
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.Y6(activityC17101x8420a569);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04 c17098x7cd03d04 = activityC17101x8420a569.F;
                java.lang.String str3 = c17098x7cd03d04.f237988e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "doCheckBankBind()");
                java.lang.String str4 = activityC17101x8420a569.U;
                java.lang.String str5 = activityC17101x8420a569.V;
                java.lang.String str6 = c17098x7cd03d04.f237987d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "do check bank bind: %s %s", str3, str6);
                activityC17101x8420a569.m83098x5406100e(new ow3.d(str4, str5, str3, str6));
            }
            activityC17101x8420a569.T = false;
        }
    }
}
