package uw2;

/* loaded from: classes3.dex */
public final class k0 extends rs.k {
    @Override // rs.k
    public void D(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.view.ViewPropertyAnimator animate = itemView.animate();
        this.f480816o.add(k3Var);
        animate.alpha(1.0f).setStartDelay(0L).setDuration(260L).setListener(new uw2.i0(this, k3Var, itemView, animate)).start();
    }

    @Override // rs.k
    public void E(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.3f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        itemView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(itemView, "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator animate = itemView.animate();
        this.f480818q.add(k3Var);
        animate.setDuration(200L).alpha(0.0f).translationY(k3Var.f3639x46306858.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df)).setStartDelay(0L).setListener(new uw2.j0(this, k3Var, itemView, animate)).start();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public long l() {
        return 0L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public long m() {
        return 260L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public long n() {
        return 200L;
    }

    @Override // rs.k, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        J(holder);
        if (holder.m8185xcdaf1228() == -3) {
            return true;
        }
        android.view.View view = holder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f480810i.add(holder);
        return true;
    }

    @Override // rs.k, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        J(holder);
        this.f480809h.add(holder);
        return true;
    }
}
