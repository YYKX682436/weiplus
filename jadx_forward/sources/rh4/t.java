package rh4;

/* loaded from: classes3.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f477317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477318e;

    public t(rh4.b0 b0Var, java.util.ArrayList arrayList) {
        this.f477318e = b0Var;
        this.f477317d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh4.t tVar = this;
        java.util.ArrayList arrayList = tVar.f477317d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.b0 b0Var = tVar.f477318e;
            if (!hasNext) {
                arrayList.clear();
                b0Var.f477230l.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            b0Var.getClass();
            android.view.View view = k3Var.f3639x46306858;
            android.view.ViewPropertyAnimator animate = view.animate();
            b0Var.f477233o.add(k3Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            animate.scaleX(1.0f).scaleY(1.0f).setDuration(b0Var.f93701c).setListener(new rh4.v(b0Var, k3Var, view, animate)).start();
            tVar = this;
        }
    }
}
