package dk5;

/* loaded from: classes9.dex */
public class z2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316549a;

    public z2(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316549a = activityC22571x51759e93;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j
    public void a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316549a;
        boolean isFinishing = activityC22571x51759e93.isFinishing();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "onCheckEnd, isPass = " + z17 + ", isFinishing = " + isFinishing);
        if (z17 || isFinishing) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22571x51759e93, (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19589xde7b5e3f) activityC22571x51759e93.getIntent().getParcelableExtra("Select_Report_Args"), true, false);
        activityC22571x51759e93.finish();
    }
}
