package c55;

/* loaded from: classes3.dex */
public class n implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 f120286d;

    public n(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509) {
        this.f120286d = activityC19822xa98ed509;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = this.f120286d;
        android.content.Intent intent = new android.content.Intent(this.f120286d, (java.lang.Class<?>) com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC19822xa98ed509, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI$1", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19822xa98ed509.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC19822xa98ed509, "com/tencent/mm/recovery/ui/RecoveryUI$1", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.i(true, this, "com/tencent/mm/recovery/ui/RecoveryUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
