package androidx.recyclerview.widget;

/* loaded from: classes12.dex */
public abstract class q1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.k f12200d;

    public q1(androidx.recyclerview.widget.d0 d0Var) {
        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(this);
        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(d0Var);
        if (eVar.f12004a == null) {
            synchronized (androidx.recyclerview.widget.e.f12002b) {
                if (androidx.recyclerview.widget.e.f12003c == null) {
                    androidx.recyclerview.widget.e.f12003c = java.util.concurrent.Executors.newFixedThreadPool(2);
                }
            }
            eVar.f12004a = androidx.recyclerview.widget.e.f12003c;
        }
        this.f12200d = new androidx.recyclerview.widget.k(dVar, new androidx.recyclerview.widget.f(null, eVar.f12004a, d0Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f12200d.f12105e.size();
    }
}
