package rp1;

/* loaded from: classes3.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f479893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f479894e;

    public b2(rp1.k2 k2Var, java.util.ArrayList arrayList) {
        this.f479894e = k2Var;
        this.f479893d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f479893d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rp1.k2 k2Var = this.f479894e;
            if (!hasNext) {
                arrayList.clear();
                k2Var.f479991l.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            k2Var.getClass();
            android.view.View view = k3Var.f3639x46306858;
            android.view.ViewPropertyAnimator animate = view.animate();
            k2Var.f479994o.add(k3Var);
            animate.alpha(1.0f).setDuration(k2Var.f93701c).setListener(new rp1.d2(k2Var, k3Var, view, animate)).start();
        }
    }
}
