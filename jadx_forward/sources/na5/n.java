package na5;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 f417547d;

    public n(com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 activityC21448x7ea88d2) {
        this.f417547d = activityC21448x7ea88d2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2635x2dc211.ActivityC21448x7ea88d2 activityC21448x7ea88d2 = this.f417547d;
        activityC21448x7ea88d2.X6(java.lang.Integer.parseInt(((android.widget.EditText) ((jz5.n) activityC21448x7ea88d2.f278690g).mo141623x754a37bb()).getText().toString()));
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
