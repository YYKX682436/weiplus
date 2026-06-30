package rs;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f480769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs.k f480770e;

    public a(rs.k kVar, java.util.ArrayList arrayList) {
        this.f480770e = kVar;
        this.f480769d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f480769d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rs.k kVar = this.f480770e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f480814m.remove(arrayList);
                return;
            }
            rs.j jVar = (rs.j) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = jVar.f480803a;
            kVar.getClass();
            android.view.View view = k3Var.f3639x46306858;
            int i17 = jVar.f480806d - jVar.f480804b;
            int i18 = jVar.f480807e - jVar.f480805c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            kVar.f480817p.add(k3Var);
            animate.setDuration(kVar.f93703e).setListener(new rs.f(kVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
