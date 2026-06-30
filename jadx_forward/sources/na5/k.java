package na5;

/* loaded from: classes11.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21447x7ea88d1 f417544d;

    public k(com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21447x7ea88d1 activityC21447x7ea88d1) {
        this.f417544d = activityC21447x7ea88d1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21447x7ea88d1 activityC21447x7ea88d1 = this.f417544d;
        android.widget.ImageView U6 = activityC21447x7ea88d1.U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(U6, "<get-iv1>(...)");
        wa5.k.a(U6, "soontest", null);
        new java.util.LinkedList().add(android.util.Pair.create(activityC21447x7ea88d1.U6(), activityC21447x7ea88d1.U6().getTransitionName()));
        android.os.Bundle a17 = wa5.h.a(((wa5.j) activityC21447x7ea88d1.m80391xac8f1cfd(wa5.j.class)).f525857e, view, null, null, 6, null);
        android.content.Intent intent = new android.content.Intent(activityC21447x7ea88d1, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21451xa95cad5a.class);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21447x7ea88d1 activityC21447x7ea88d12 = this.f417544d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(a17);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC21447x7ea88d12, arrayList2.toArray(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        activityC21447x7ea88d12.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(activityC21447x7ea88d12, "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
