package c55;

/* loaded from: classes3.dex */
public class n implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryUI f38753d;

    public n(com.tencent.mm.recovery.ui.RecoveryUI recoveryUI) {
        this.f38753d = recoveryUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = this.f38753d;
        android.content.Intent intent = new android.content.Intent(this.f38753d, (java.lang.Class<?>) com.tencent.mm.recovery.ui.RecoveryToolsUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recoveryUI, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI$1", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        recoveryUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI$1", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.i(true, this, "com/tencent/mm/recovery/ui/RecoveryUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
