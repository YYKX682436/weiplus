package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.z f12204e;

    public r(androidx.recyclerview.widget.z zVar, java.util.ArrayList arrayList) {
        this.f12204e = zVar;
        this.f12203d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f12203d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            androidx.recyclerview.widget.z zVar = this.f12204e;
            if (!hasNext) {
                arrayList.clear();
                zVar.f12301l.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            zVar.getClass();
            android.view.View view = k3Var.itemView;
            android.view.ViewPropertyAnimator animate = view.animate();
            zVar.f12304o.add(k3Var);
            animate.alpha(1.0f).setDuration(zVar.f12168c).setListener(new androidx.recyclerview.widget.t(zVar, k3Var, view, animate)).start();
        }
    }
}
