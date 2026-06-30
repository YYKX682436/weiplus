package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.z f93727e;

    public q(p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar, java.util.ArrayList arrayList) {
        this.f93727e = zVar;
        this.f93726d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f93726d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = this.f93727e;
            if (!hasNext) {
                arrayList.clear();
                zVar.f93836n.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x xVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.x) it.next();
            zVar.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = xVar.f93795a;
            android.view.View view = k3Var == null ? null : k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = xVar.f93796b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = zVar.f93840r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(zVar.f93704f);
                arrayList2.add(xVar.f93795a);
                duration.translationX(xVar.f93799e - xVar.f93797c);
                duration.translationY(xVar.f93800f - xVar.f93798d);
                duration.alpha(0.0f).setListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.v(zVar, xVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(xVar.f93796b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(zVar.f93704f).alpha(1.0f).setListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.w(zVar, xVar, animate, view2)).start();
            }
        }
    }
}
