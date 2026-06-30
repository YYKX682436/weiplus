package qz2;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f449448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 f449449e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000, boolean z17) {
        this.f449449e = activityC15524xc77ba000;
        this.f449448d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f449448d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000 activityC15524xc77ba000 = this.f449449e;
        if (z17) {
            activityC15524xc77ba000.f218542e = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activityC15524xc77ba000, false, false, null);
            return;
        }
        android.app.Dialog dialog = activityC15524xc77ba000.f218542e;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        activityC15524xc77ba000.f218542e.dismiss();
        activityC15524xc77ba000.f218542e = null;
    }
}
