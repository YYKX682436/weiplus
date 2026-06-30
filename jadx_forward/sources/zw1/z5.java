package zw1;

/* loaded from: classes5.dex */
public class z5 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558403d;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3) {
        this.f558403d = activityC13149x63b02cb3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        boolean z18 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558403d;
        activityC13149x63b02cb3.K = z18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13149x63b02cb3.E;
        if (z2Var == null || !z2Var.h()) {
            return;
        }
        int i18 = com.p314xaae8f345.mm.ui.bl.b(activityC13149x63b02cb3.mo55332x76847179()).y;
        if (i17 > 0) {
            if (i17 * 2 < i18) {
                activityC13149x63b02cb3.E.u((i18 - i65.a.b(activityC13149x63b02cb3.mo55332x76847179(), 56)) - i17);
            }
        } else if (activityC13149x63b02cb3.L) {
            activityC13149x63b02cb3.E.u(activityC13149x63b02cb3.f177967J);
        } else {
            activityC13149x63b02cb3.E.u(activityC13149x63b02cb3.I);
        }
    }
}
