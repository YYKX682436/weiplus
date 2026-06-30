package zw1;

/* loaded from: classes5.dex */
public class s0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558318a;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558318a = activityC13144xce1cfbb7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558318a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.X6(activityC13144xce1cfbb7, activityC13144xce1cfbb7.S1.f464069g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13144xce1cfbb7.P1;
        if (z2Var != null && z2Var.h()) {
            activityC13144xce1cfbb7.P1.B();
            activityC13144xce1cfbb7.P1 = null;
        }
        new android.os.Handler().postDelayed(new zw1.r0(this), 200L);
    }
}
