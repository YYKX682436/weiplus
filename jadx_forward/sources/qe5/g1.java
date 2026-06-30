package qe5;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443649d;

    public g1(qe5.n1 n1Var) {
        this.f443649d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initOpenBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j75.f Q6 = this.f443649d.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.m(true));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initOpenBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
