package na5;

/* loaded from: classes11.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21449x7ea88d3 f417557d;

    public x(com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21449x7ea88d3 activityC21449x7ea88d3) {
        this.f417557d = activityC21449x7ea88d3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21449x7ea88d3 activityC21449x7ea88d3 = this.f417557d;
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) activityC21449x7ea88d3.f278694o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-iv1>(...)");
        wa5.k.a(imageView, "soontest0", 0);
        jz5.g gVar = activityC21449x7ea88d3.f278695p;
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "<get-iv2>(...)");
        wa5.k.a(imageView2, "soontest1", 1);
        java.util.LinkedList linkedList = activityC21449x7ea88d3.f278692i;
        jz5.g gVar2 = activityC21449x7ea88d3.f278694o;
        linkedList.add(android.util.Pair.create((android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb(), ((android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb()).getTransitionName()));
        linkedList.add(android.util.Pair.create((android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb(), ((android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb()).getTransitionName()));
        android.content.Intent intent = new android.content.Intent(activityC21449x7ea88d3, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21452x8238fe18.class);
        android.os.Bundle a17 = wa5.h.a(((wa5.j) activityC21449x7ea88d3.m80391xac8f1cfd(wa5.j.class)).f525857e, view, null, null, 6, null);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21449x7ea88d3 activityC21449x7ea88d32 = this.f417557d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(a17);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC21449x7ea88d32, arrayList2.toArray(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        activityC21449x7ea88d32.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(activityC21449x7ea88d32, "com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
