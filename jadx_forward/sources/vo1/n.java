package vo1;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f520071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520072e;

    public n(java.util.ArrayList arrayList, vo1.q qVar) {
        this.f520071d = arrayList;
        this.f520072e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f520071d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vo1.q qVar = this.f520072e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f520083l.remove(arrayList);
                return;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) next;
            qVar.getClass();
            android.view.View itemView = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            android.view.ViewPropertyAnimator animate = itemView.animate();
            qVar.f520086o.add(k3Var);
            animate.alpha(1.0f).setDuration(qVar.f93701c).setListener(new vo1.e(qVar, k3Var, itemView, animate)).start();
        }
    }
}
