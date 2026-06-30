package dk5;

/* loaded from: classes9.dex */
public class i5 implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 f316209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316210b;

    public i5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5) {
        this.f316210b = activityC22573x19a79d99;
        this.f316209a = c11295xb9c370e5;
    }

    @Override // dk5.h2
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316210b;
        if (z17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5 = this.f316209a;
            int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
            activityC22573x19a79d99.c7(c11295xb9c370e5, str, null, false, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "thumb img CDN upload fail!");
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22573x19a79d99, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), -1), true, false);
            activityC22573x19a79d99.finish();
        }
    }
}
