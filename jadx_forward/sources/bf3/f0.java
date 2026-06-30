package bf3;

/* loaded from: classes7.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f101157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101159f;

    public f0(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.f101157d = activity;
        this.f101158e = str;
        this.f101159f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f101157d;
        if (activity.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activity);
        j0Var.setTitle(this.f101158e + ": 检测到 js 异常");
        j0Var.t(this.f101159f);
        j0Var.A("马上修", true, null);
        j0Var.w("不再提醒", true, bf3.e0.f101155d);
        j0Var.show();
    }
}
