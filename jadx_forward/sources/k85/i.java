package k85;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity) {
        super(0);
        this.f386940d = activity;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f386940d;
        android.content.Intent intent = activity.getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$2$realShow$1$1$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$2$realShow$1$1$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
