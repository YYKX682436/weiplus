package zw1;

/* loaded from: classes5.dex */
public class c1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558126d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558126d = activityC13144xce1cfbb7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        boolean z18 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558126d;
        activityC13144xce1cfbb7.f177922a2 = z18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13144xce1cfbb7.P1;
        if (z2Var == null || !z2Var.h()) {
            return;
        }
        int i18 = com.p314xaae8f345.mm.ui.bl.b(activityC13144xce1cfbb7.mo55332x76847179()).y;
        if (i17 > 0) {
            if (i17 * 2 < i18) {
                activityC13144xce1cfbb7.P1.u((i18 - i65.a.b(activityC13144xce1cfbb7.mo55332x76847179(), 56)) - i17);
            }
        } else if (activityC13144xce1cfbb7.f177923b2) {
            activityC13144xce1cfbb7.P1.u(activityC13144xce1cfbb7.Z1);
        } else {
            activityC13144xce1cfbb7.P1.u(activityC13144xce1cfbb7.Y1);
        }
    }
}
