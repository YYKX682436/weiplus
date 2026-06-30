package ll3;

/* loaded from: classes4.dex */
public final class e2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f400694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f400695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f400696c;

    public e2(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        this.f400694a = context;
        this.f400695b = intent;
        this.f400696c = a5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = this.f400696c;
        try {
            android.content.Context context = this.f400694a;
            android.content.Intent intent = this.f400695b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/music/model/MusicUIUtil$launchQQMusic$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/music/model/MusicUIUtil$launchQQMusic$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (a5Var != null) {
                a5Var.a(true, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MusicUIUtil", e17, "launchQQMusic exception", new java.lang.Object[0]);
            if (a5Var != null) {
                a5Var.a(false, false);
            }
        }
    }
}
