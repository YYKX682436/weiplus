package dk5;

/* loaded from: classes9.dex */
public class j7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.m7 f316226d;

    public j7(dk5.m7 m7Var) {
        this.f316226d = m7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/TodoIntroduceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.grouptodo.TodoIntroduceView", "click i know");
        dk5.m7 m7Var = this.f316226d;
        m7Var.dismiss();
        dk5.l7 l7Var = m7Var.f316272d;
        if (l7Var != null) {
            l7Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/TodoIntroduceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
