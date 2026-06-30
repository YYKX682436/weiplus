package rp1;

/* loaded from: classes3.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f479888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f479889e;

    public a2(rp1.k2 k2Var, java.util.ArrayList arrayList) {
        this.f479889e = k2Var;
        this.f479888d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f479888d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rp1.k2 k2Var = this.f479889e;
            if (!hasNext) {
                arrayList.clear();
                k2Var.f479993n.remove(arrayList);
                return;
            }
            rp1.h2 h2Var = (rp1.h2) it.next();
            k2Var.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = h2Var.f479944a;
            android.view.View view = k3Var == null ? null : k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = h2Var.f479945b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = k2Var.f479997r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(k2Var.f93704f);
                arrayList2.add(h2Var.f479944a);
                duration.translationX(h2Var.f479948e - h2Var.f479946c);
                duration.translationY(h2Var.f479949f - h2Var.f479947d);
                duration.alpha(0.0f).setListener(new rp1.f2(k2Var, h2Var, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(h2Var.f479945b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(k2Var.f93704f).alpha(1.0f).setListener(new rp1.g2(k2Var, h2Var, animate, view2)).start();
            }
        }
    }
}
