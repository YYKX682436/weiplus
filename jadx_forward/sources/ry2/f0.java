package ry2;

/* loaded from: classes8.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f482922d;

    public f0(ry2.q0 q0Var) {
        this.f482922d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.q0 q0Var = this.f482922d;
        q0Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList2 = q0Var.f482990y;
        if (arrayList2 != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                linkedList.add(q0Var.s((java.lang.String) obj, i17));
                i17 = i18;
            }
        }
        q0Var.y(linkedList);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
