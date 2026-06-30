package rh4;

/* loaded from: classes3.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f477313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477314e;

    public r(rh4.b0 b0Var, java.util.ArrayList arrayList) {
        this.f477314e = b0Var;
        this.f477313d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f477313d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.b0 b0Var = this.f477314e;
            if (!hasNext) {
                arrayList.clear();
                b0Var.f477231m.remove(arrayList);
                return;
            }
            rh4.a0 a0Var = (rh4.a0) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = a0Var.f477218a;
            b0Var.getClass();
            android.view.View view = k3Var.f3639x46306858;
            int i17 = a0Var.f477221d - a0Var.f477219b;
            int i18 = a0Var.f477222e - a0Var.f477220c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            b0Var.f477234p.add(k3Var);
            animate.setDuration(b0Var.f93703e).setListener(new rh4.w(b0Var, k3Var, i17, view, i18, animate)).start();
        }
    }
}
