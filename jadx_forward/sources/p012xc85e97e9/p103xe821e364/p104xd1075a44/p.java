package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.z f93717e;

    public p(p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar, java.util.ArrayList arrayList) {
        this.f93717e = zVar;
        this.f93716d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f93716d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = this.f93717e;
            if (!hasNext) {
                arrayList.clear();
                zVar.f93835m.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.y yVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.y) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = yVar.f93815a;
            zVar.getClass();
            android.view.View view = k3Var.f3639x46306858;
            int i17 = yVar.f93818d - yVar.f93816b;
            int i18 = yVar.f93819e - yVar.f93817c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            zVar.f93838p.add(k3Var);
            animate.setDuration(zVar.f93703e).setListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.u(zVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
