package rs;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f480771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs.k f480772e;

    public b(rs.k kVar, java.util.ArrayList arrayList) {
        this.f480772e = kVar;
        this.f480771d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f480771d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rs.k kVar = this.f480772e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f480815n.remove(arrayList);
                return;
            }
            rs.i iVar = (rs.i) it.next();
            kVar.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = iVar.f480797a;
            android.view.View view = k3Var == null ? null : k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = iVar.f480798b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = kVar.f480819r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(kVar.f93704f);
                arrayList2.add(iVar.f480797a);
                duration.translationX(iVar.f480801e - iVar.f480799c);
                duration.translationY(iVar.f480802f - iVar.f480800d);
                duration.alpha(0.0f).setListener(new rs.g(kVar, iVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(iVar.f480798b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f93704f).alpha(1.0f).setListener(new rs.h(kVar, iVar, animate, view2)).start();
            }
        }
    }
}
