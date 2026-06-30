package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.z f93737e;

    public r(p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar, java.util.ArrayList arrayList) {
        this.f93737e = zVar;
        this.f93736d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f93736d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = this.f93737e;
            if (!hasNext) {
                arrayList.clear();
                zVar.f93834l.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            zVar.getClass();
            android.view.View view = k3Var.f3639x46306858;
            android.view.ViewPropertyAnimator animate = view.animate();
            zVar.f93837o.add(k3Var);
            animate.alpha(1.0f).setDuration(zVar.f93701c).setListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.t(zVar, k3Var, view, animate)).start();
        }
    }
}
