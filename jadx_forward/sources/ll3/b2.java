package ll3;

/* loaded from: classes4.dex */
public final class b2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f400675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f400676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f400677c;

    public b2(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        this.f400675a = context;
        this.f400676b = intent;
        this.f400677c = a5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = this.f400677c;
        try {
            android.content.Context context = this.f400675a;
            android.content.Intent intent = this.f400676b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/music/model/MusicUIUtil$doJumpToQQMusicPayment$4", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/music/model/MusicUIUtil$doJumpToQQMusicPayment$4", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
