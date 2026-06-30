package dk5;

/* loaded from: classes9.dex */
public class b5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316062a;

    public b5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99) {
        this.f316062a = activityC22573x19a79d99;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_stay_in_wx", true);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316062a;
        intent.putExtra("scene_select_user_liast", activityC22573x19a79d99.f292553f);
        activityC22573x19a79d99.setResult(-1, intent);
        activityC22573x19a79d99.finish();
    }
}
