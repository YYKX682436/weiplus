package na5;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 f417550d;

    public q(com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 activityC21448x7ea88d2) {
        this.f417550d = activityC21448x7ea88d2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.CharSequence text;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$loadBtns$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = view instanceof android.widget.Button ? (android.widget.Button) view : null;
        this.f417550d.X6((button == null || (text = button.getText()) == null || (obj = text.toString()) == null) ? 1 : java.lang.Integer.parseInt(obj));
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$loadBtns$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
