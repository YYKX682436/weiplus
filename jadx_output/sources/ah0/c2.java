package ah0;

/* loaded from: classes.dex */
public class c2 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f4728b;

    public c2(ah0.d2 d2Var, android.content.Context context, android.content.Intent intent) {
        this.f4727a = context;
        this.f4728b = intent;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-2097153)));
        android.content.Context context = this.f4727a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f4728b);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/webview/extension/WvPluginInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/webview/extension/WvPluginInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
