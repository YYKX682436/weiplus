package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.z f12184e;

    public p(androidx.recyclerview.widget.z zVar, java.util.ArrayList arrayList) {
        this.f12184e = zVar;
        this.f12183d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f12183d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            androidx.recyclerview.widget.z zVar = this.f12184e;
            if (!hasNext) {
                arrayList.clear();
                zVar.f12302m.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.y yVar = (androidx.recyclerview.widget.y) it.next();
            androidx.recyclerview.widget.k3 k3Var = yVar.f12282a;
            zVar.getClass();
            android.view.View view = k3Var.itemView;
            int i17 = yVar.f12285d - yVar.f12283b;
            int i18 = yVar.f12286e - yVar.f12284c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            zVar.f12305p.add(k3Var);
            animate.setDuration(zVar.f12170e).setListener(new androidx.recyclerview.widget.u(zVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
