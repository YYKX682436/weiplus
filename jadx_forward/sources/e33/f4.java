package e33;

/* loaded from: classes5.dex */
public class f4 implements k33.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328752a;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f328752a = activityC15656x6f26b561;
    }

    public void a(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328752a;
        android.view.View findViewById = activityC15656x6f26b561.findViewById(com.p314xaae8f345.mm.R.id.ut_);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830.f219939n;
        boolean z17 = false;
        if (motionEvent != null && findViewById != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewById.getGlobalVisibleRect(rect);
            if (findViewById.getVisibility() == 0 && findViewById.isEnabled() && rect.contains(rawX, rawY)) {
                z17 = true;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "onSingleClick hit live tag button");
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.f220105k2;
            activityC15656x6f26b561.W6();
        }
    }
}
