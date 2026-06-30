package rh4;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f477223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.k f477224e;

    public b(rh4.k kVar, java.util.ArrayList arrayList) {
        this.f477224e = kVar;
        this.f477223d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f477223d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.k kVar = this.f477224e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f477287n.remove(arrayList);
                return;
            }
            rh4.i iVar = (rh4.i) it.next();
            kVar.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = iVar.f477268a;
            android.view.View view = k3Var == null ? null : k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = iVar.f477269b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = kVar.f477291r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(kVar.f93704f);
                arrayList2.add(iVar.f477268a);
                duration.alpha(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator()).setDuration(kVar.f93704f).setListener(new rh4.g(kVar, iVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(iVar.f477269b);
                animate.translationX(0.0f).translationY(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(kVar.f93704f).alpha(1.0f).setListener(new rh4.h(kVar, iVar, animate, view2)).start();
            }
        }
    }
}
