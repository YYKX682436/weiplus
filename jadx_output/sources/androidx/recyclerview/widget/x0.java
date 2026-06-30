package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.d1 f12268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.g1 f12270f;

    public x0(androidx.recyclerview.widget.g1 g1Var, androidx.recyclerview.widget.d1 d1Var, int i17) {
        this.f12270f = g1Var;
        this.f12268d = d1Var;
        this.f12269e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.g1 g1Var = this.f12270f;
        androidx.recyclerview.widget.RecyclerView recyclerView = g1Var.f12046x;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        androidx.recyclerview.widget.d1 d1Var = this.f12268d;
        if (d1Var.f11996q || d1Var.f11990h.getAdapterPosition() == -1) {
            return;
        }
        androidx.recyclerview.widget.n2 itemAnimator = g1Var.f12046x.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.p(null)) {
            java.util.ArrayList arrayList = (java.util.ArrayList) g1Var.f12044v;
            int size = arrayList.size();
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                if (!((androidx.recyclerview.widget.d1) arrayList.get(i17)).f11997r) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                g1Var.f12041s.onSwiped(d1Var.f11990h, this.f12269e);
                return;
            }
        }
        g1Var.f12046x.post(this);
    }
}
