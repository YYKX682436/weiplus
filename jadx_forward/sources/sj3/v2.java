package sj3;

/* loaded from: classes12.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490315d;

    public v2(sj3.g3 g3Var) {
        this.f490315d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.g3 g3Var = this.f490315d;
        if (g3Var.f490073u) {
            g3Var.m();
        } else {
            g3Var.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
