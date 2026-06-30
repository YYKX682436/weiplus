package bf3;

/* loaded from: classes7.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f19624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19626f;

    public f0(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.f19624d = activity;
        this.f19625e = str;
        this.f19626f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f19624d;
        if (activity.isFinishing()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(activity);
        j0Var.setTitle(this.f19625e + ": 检测到 js 异常");
        j0Var.t(this.f19626f);
        j0Var.A("马上修", true, null);
        j0Var.w("不再提醒", true, bf3.e0.f19622d);
        j0Var.show();
    }
}
