package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.z f12194e;

    public q(androidx.recyclerview.widget.z zVar, java.util.ArrayList arrayList) {
        this.f12194e = zVar;
        this.f12193d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f12193d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            androidx.recyclerview.widget.z zVar = this.f12194e;
            if (!hasNext) {
                arrayList.clear();
                zVar.f12303n.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) it.next();
            zVar.getClass();
            androidx.recyclerview.widget.k3 k3Var = xVar.f12262a;
            android.view.View view = k3Var == null ? null : k3Var.itemView;
            androidx.recyclerview.widget.k3 k3Var2 = xVar.f12263b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = zVar.f12307r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(zVar.f12171f);
                arrayList2.add(xVar.f12262a);
                duration.translationX(xVar.f12266e - xVar.f12264c);
                duration.translationY(xVar.f12267f - xVar.f12265d);
                duration.alpha(0.0f).setListener(new androidx.recyclerview.widget.v(zVar, xVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(xVar.f12263b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(zVar.f12171f).alpha(1.0f).setListener(new androidx.recyclerview.widget.w(zVar, xVar, animate, view2)).start();
            }
        }
    }
}
