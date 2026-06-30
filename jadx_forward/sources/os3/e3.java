package os3;

/* loaded from: classes8.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f429601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 f429602e;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056, int i17) {
        this.f429602e = activityC16939x74e056;
        this.f429601d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int width;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056 = this.f429602e;
        android.view.View view = (android.view.View) activityC16939x74e056.f236442d.getParent();
        if (view == null || (i17 = this.f429601d) <= (width = view.getWidth())) {
            return;
        }
        float f17 = width / i17;
        int i18 = 10;
        while (f17 < activityC16939x74e056.f236442d.mo120151x7520af94() && i18 - 1 > 0) {
            activityC16939x74e056.f236442d.mo120196xf9711e7b();
        }
    }
}
