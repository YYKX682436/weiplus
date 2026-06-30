package rh4;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f477216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.k f477217e;

    public a(rh4.k kVar, java.util.ArrayList arrayList) {
        this.f477217e = kVar;
        this.f477216d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f477216d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.k kVar = this.f477217e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f477286m.remove(arrayList);
                return;
            }
            rh4.j jVar = (rh4.j) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = jVar.f477275a;
            kVar.getClass();
            android.view.View view = k3Var.f3639x46306858;
            int i17 = jVar.f477278d - jVar.f477276b;
            int i18 = jVar.f477279e - jVar.f477277c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            kVar.f477289p.add(k3Var);
            animate.setDuration(kVar.f93703e).setListener(new rh4.f(kVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
