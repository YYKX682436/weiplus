package fg1;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f343448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f343449e;

    public x(fg1.z zVar, android.app.Activity activity, float f17) {
        this.f343448d = activity;
        this.f343449e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f343448d;
        android.view.WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        float f17 = this.f343449e;
        if (f17 < 0.01f) {
            f17 = 0.01f;
        }
        attributes.screenBrightness = f17;
        activity.getWindow().setAttributes(attributes);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "setScreenBrightness, brightness:%s", java.lang.Float.valueOf(attributes.screenBrightness));
    }
}
