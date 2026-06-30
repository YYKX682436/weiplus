package ex3;

/* loaded from: classes.dex */
public final class a implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f338738a;

    public a(android.app.Activity activity) {
        this.f338738a = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent addFlags = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI").putExtra("absolutely_exit", true).addFlags(67108864);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(addFlags, "addFlags(...)");
            android.app.Activity activity = this.f338738a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(addFlags);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/model/RepairerInnerLogic$checkNeedRestart$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/model/RepairerInnerLogic$checkNeedRestart$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
