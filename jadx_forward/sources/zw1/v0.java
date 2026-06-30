package zw1;

/* loaded from: classes5.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558357d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558357d = activityC13144xce1cfbb7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558357d;
        int b17 = i65.a.b(activityC13144xce1cfbb7.mo55332x76847179(), 37);
        android.view.ViewGroup.LayoutParams layoutParams = activityC13144xce1cfbb7.X.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = b17;
            activityC13144xce1cfbb7.X.setLayoutParams(layoutParams);
            activityC13144xce1cfbb7.X.requestLayout();
        }
    }
}
