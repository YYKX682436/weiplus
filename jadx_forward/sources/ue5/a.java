package ue5;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f508481d;

    public a(android.content.Intent intent) {
        this.f508481d = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMainUI", "[onNewIntent] ui: forceRebuild");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f508481d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/variants/ChattingMainUI$onNewIntent$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/variants/ChattingMainUI$onNewIntent$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
