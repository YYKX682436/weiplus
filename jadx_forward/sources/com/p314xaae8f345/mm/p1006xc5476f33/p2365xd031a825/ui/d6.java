package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class d6 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        super(false);
        this.f261771d = activityC19116x82bf90f1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        a36.c cVar;
        a36.c cVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "click card mch subscribe");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f261771d;
        if (activityC19116x82bf90f1.P1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "do uncheck mch service pos");
            if (activityC19116x82bf90f1.Y1 != null || (cVar2 = activityC19116x82bf90f1.M1) == null || cVar2.f82648r == null) {
                return;
            }
            activityC19116x82bf90f1.G1.setVisibility(0);
            activityC19116x82bf90f1.E1.setVisibility(8);
            activityC19116x82bf90f1.O1 = 0;
            ss4.c cVar3 = new ss4.c(activityC19116x82bf90f1.M1.f82648r.f82654i);
            activityC19116x82bf90f1.Y1 = cVar3;
            cVar3.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u5(activityC19116x82bf90f1));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "do check mch service pos");
        if (activityC19116x82bf90f1.X1 != null || (cVar = activityC19116x82bf90f1.M1) == null || cVar.f82648r == null) {
            return;
        }
        activityC19116x82bf90f1.G1.setVisibility(0);
        activityC19116x82bf90f1.E1.setVisibility(8);
        activityC19116x82bf90f1.O1 = 1;
        ss4.a aVar = new ss4.a(activityC19116x82bf90f1.M1.f82648r.f82654i);
        activityC19116x82bf90f1.X1 = aVar;
        aVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t5(activityC19116x82bf90f1));
    }
}
