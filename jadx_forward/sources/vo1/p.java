package vo1;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f520075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520076e;

    public p(java.util.ArrayList arrayList, vo1.q qVar) {
        this.f520075d = arrayList;
        this.f520076e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f520075d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vo1.q qVar = this.f520076e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f520084m.remove(arrayList);
                return;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            vo1.d dVar = (vo1.d) next;
            qVar.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder = dVar.f520038a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            int i17 = dVar.f520041d - dVar.f520039b;
            int i18 = dVar.f520042e - dVar.f520040c;
            if (i17 != 0) {
                itemView.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                itemView.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = itemView.animate();
            qVar.f520087p.add(holder);
            animate.setDuration(qVar.f93703e).setListener(new vo1.l(qVar, holder, i17, itemView, i18, animate)).start();
        }
    }
}
