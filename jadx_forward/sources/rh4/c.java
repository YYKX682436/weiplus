package rh4;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f477237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.k f477238e;

    public c(rh4.k kVar, java.util.ArrayList arrayList) {
        this.f477238e = kVar;
        this.f477237d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f477237d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.k kVar = this.f477238e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f477285l.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            kVar.getClass();
            android.view.View view = k3Var.f3639x46306858;
            android.view.ViewPropertyAnimator animate = view.animate();
            kVar.f477288o.add(k3Var);
            animate.scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(kVar.f93701c).setListener(new rh4.e(kVar, k3Var, view, animate)).start();
        }
    }
}
