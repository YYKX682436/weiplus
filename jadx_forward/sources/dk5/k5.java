package dk5;

/* loaded from: classes9.dex */
public class k5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 f316240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316241b;

    public k5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5) {
        this.f316241b = activityC22573x19a79d99;
        this.f316240a = c11295xb9c370e5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public void a(k91.v5 v5Var) {
        int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316241b;
        activityC22573x19a79d99.a7();
        if (activityC22573x19a79d99.f292568x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus cancelled");
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5 = this.f316240a;
        if (v5Var == null) {
            activityC22573x19a79d99.c7(c11295xb9c370e5, null, null, true, "");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "onGetWeAppInfo: nickName:%s userName:%s", v5Var.f68913x21f9b213, v5Var.f68924xdec927b);
        java.lang.String str = v5Var.f68920x68aa7b8d;
        java.lang.String str2 = v5Var.f68907x6b8edeb4;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        activityC22573x19a79d99.c7(c11295xb9c370e5, null, str == null ? str2 : str, false, v5Var.f68913x21f9b213);
    }
}
