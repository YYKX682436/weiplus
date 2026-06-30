package rh4;

/* loaded from: classes3.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f477315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f477316e;

    public s(rh4.b0 b0Var, java.util.ArrayList arrayList) {
        this.f477316e = b0Var;
        this.f477315d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f477315d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.b0 b0Var = this.f477316e;
            if (!hasNext) {
                arrayList.clear();
                b0Var.f477232n.remove(arrayList);
                return;
            }
            rh4.z zVar = (rh4.z) it.next();
            b0Var.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = zVar.f477341a;
            android.view.View view = k3Var == null ? null : k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = zVar.f477342b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = b0Var.f477236r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(b0Var.f93704f);
                arrayList2.add(zVar.f477341a);
                duration.translationX(zVar.f477345e - zVar.f477343c);
                duration.translationY(zVar.f477346f - zVar.f477344d);
                duration.alpha(0.0f).setListener(new rh4.x(b0Var, zVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(zVar.f477342b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(b0Var.f93704f).alpha(1.0f).setListener(new rh4.y(b0Var, zVar, animate, view2)).start();
            }
        }
    }
}
