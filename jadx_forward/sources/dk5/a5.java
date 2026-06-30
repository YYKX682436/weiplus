package dk5;

/* loaded from: classes9.dex */
public class a5 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316029d;

    public a5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99) {
        this.f316029d = activityC22573x19a79d99;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316029d;
        if (activityC22573x19a79d99.getWindow() != null && activityC22573x19a79d99.getWindow().getDecorView() != null && activityC22573x19a79d99.getWindow().getDecorView().getWindowToken() != null) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.T6(activityC22573x19a79d99);
            return false;
        }
        int i17 = activityC22573x19a79d99.f292565u;
        if (i17 >= 10) {
            return false;
        }
        activityC22573x19a79d99.f292565u = i17 + 1;
        return true;
    }
}
