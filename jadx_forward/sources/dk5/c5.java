package dk5;

/* loaded from: classes9.dex */
public class c5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316102a;

    public c5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99) {
        this.f316102a = activityC22573x19a79d99;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent putExtra = new android.content.Intent().putExtra("Select_back_to_app", true);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316102a;
        putExtra.putExtra("scene_select_user_liast", activityC22573x19a79d99.f292553f);
        if (activityC22573x19a79d99.f292555h == 3) {
            activityC22573x19a79d99.setResult(-1);
            activityC22573x19a79d99.finish();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22573x19a79d99, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), 0), true, false);
        } else {
            if (activityC22573x19a79d99.getIntent().getExtras() != null) {
                putExtra.putExtras(activityC22573x19a79d99.getIntent().getExtras());
            }
            activityC22573x19a79d99.setResult(-1, putExtra);
            activityC22573x19a79d99.finish();
        }
    }
}
