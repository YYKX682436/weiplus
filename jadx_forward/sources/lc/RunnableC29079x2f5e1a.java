package lc;

/* renamed from: lc.g$$a */
/* loaded from: classes14.dex */
public final /* synthetic */ class RunnableC29079x2f5e1a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.g f399359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399360e;

    public /* synthetic */ RunnableC29079x2f5e1a(lc.g gVar, int i17) {
        this.f399359d = gVar;
        this.f399360e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f399359d.getActivity();
        if (activity == null) {
            return;
        }
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i17 = this.f399360e;
        if (i17 == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i17 <= 0) {
                i17 = 1;
            }
            attributes.screenBrightness = i17 / 255.0f;
        }
        window.setAttributes(attributes);
    }
}
