package sj3;

/* loaded from: classes14.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f490047d;

    public f4(sj3.a5 a5Var) {
        this.f490047d = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.a5 a5Var = this.f490047d;
        if (a5Var.f489950d.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
            a5Var.f489950d.W6(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
