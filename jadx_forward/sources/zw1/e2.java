package zw1;

/* loaded from: classes15.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558150d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558150d = activityC13144xce1cfbb7;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        this.f558150d.f177946y.getLocationInWindow(iArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177918e2 = iArr[1];
    }
}
