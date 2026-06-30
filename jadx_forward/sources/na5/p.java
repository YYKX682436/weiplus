package na5;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 f417549d;

    public p(com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 activityC21448x7ea88d2) {
        this.f417549d = activityC21448x7ea88d2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 activityC21448x7ea88d2 = this.f417549d;
        android.content.Intent intent = new android.content.Intent(activityC21448x7ea88d2, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21452x8238fe18.class);
        android.os.Bundle a17 = wa5.h.a(((wa5.j) activityC21448x7ea88d2.m80391xac8f1cfd(wa5.j.class)).f525857e, view, null, null, 6, null);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 activityC21448x7ea88d22 = this.f417549d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(a17);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC21448x7ea88d22, arrayList2.toArray(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        activityC21448x7ea88d22.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(activityC21448x7ea88d22, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
