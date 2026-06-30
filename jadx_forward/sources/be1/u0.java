package be1;

/* loaded from: classes7.dex */
public class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f101051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f101052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ be1.v0 f101053f;

    public u0(be1.v0 v0Var, android.view.WindowManager.LayoutParams layoutParams, android.app.Activity activity) {
        this.f101053f = v0Var;
        this.f101051d = layoutParams;
        this.f101052e = activity;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        float f17 = this.f101053f.f101057g.f101059g;
        android.view.WindowManager.LayoutParams layoutParams = this.f101051d;
        layoutParams.screenBrightness = f17;
        android.app.Activity activity = this.f101052e;
        if (activity == null || activity.isFinishing() || activity.getWindow() == null) {
            return;
        }
        activity.getWindow().setAttributes(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        float f17 = this.f101053f.f101057g.f101060h;
        android.view.WindowManager.LayoutParams layoutParams = this.f101051d;
        layoutParams.screenBrightness = f17;
        android.app.Activity activity = this.f101052e;
        if (activity == null || activity.isFinishing() || activity.getWindow() == null) {
            return;
        }
        activity.getWindow().setAttributes(layoutParams);
    }
}
