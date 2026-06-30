package ry2;

/* loaded from: classes8.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f482942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f482943e;

    public n0(ry2.q0 q0Var, java.util.LinkedList linkedList) {
        this.f482942d = q0Var;
        this.f482943e = linkedList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = this.f482943e;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        this.f482942d.y(linkedList);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
