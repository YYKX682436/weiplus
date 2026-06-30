package rp1;

/* loaded from: classes3.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f480098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f480099e;

    public z1(rp1.k2 k2Var, java.util.ArrayList arrayList) {
        this.f480099e = k2Var;
        this.f480098d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f480098d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rp1.k2 k2Var = this.f480099e;
            if (!hasNext) {
                arrayList.clear();
                k2Var.f479992m.remove(arrayList);
                return;
            }
            rp1.j2 j2Var = (rp1.j2) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = j2Var.f479975a;
            k2Var.getClass();
            android.view.View view = k3Var.f3639x46306858;
            int i17 = j2Var.f479978d - j2Var.f479976b;
            int i18 = j2Var.f479979e - j2Var.f479977c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            k2Var.f479995p.add(k3Var);
            animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setDuration(k2Var.f93703e).setListener(new rp1.e2(k2Var, k3Var, i17, view, i18, animate)).start();
        }
    }
}
