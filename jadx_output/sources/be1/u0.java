package be1;

/* loaded from: classes7.dex */
public class u0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f19518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f19519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ be1.v0 f19520f;

    public u0(be1.v0 v0Var, android.view.WindowManager.LayoutParams layoutParams, android.app.Activity activity) {
        this.f19520f = v0Var;
        this.f19518d = layoutParams;
        this.f19519e = activity;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        float f17 = this.f19520f.f19524g.f19526g;
        android.view.WindowManager.LayoutParams layoutParams = this.f19518d;
        layoutParams.screenBrightness = f17;
        android.app.Activity activity = this.f19519e;
        if (activity == null || activity.isFinishing() || activity.getWindow() == null) {
            return;
        }
        activity.getWindow().setAttributes(layoutParams);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        float f17 = this.f19520f.f19524g.f19527h;
        android.view.WindowManager.LayoutParams layoutParams = this.f19518d;
        layoutParams.screenBrightness = f17;
        android.app.Activity activity = this.f19519e;
        if (activity == null || activity.isFinishing() || activity.getWindow() == null) {
            return;
        }
        activity.getWindow().setAttributes(layoutParams);
    }
}
