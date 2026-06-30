package n;

/* loaded from: classes15.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public android.view.animation.Interpolator f414952c;

    /* renamed from: d, reason: collision with root package name */
    public n3.c2 f414953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414954e;

    /* renamed from: b, reason: collision with root package name */
    public long f414951b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final n3.d2 f414955f = new n.k(this);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f414950a = new java.util.ArrayList();

    public void a() {
        if (this.f414954e) {
            java.util.Iterator it = this.f414950a.iterator();
            while (it.hasNext()) {
                ((n3.z1) it.next()).b();
            }
            this.f414954e = false;
        }
    }

    public n.l b(n3.z1 z1Var) {
        if (!this.f414954e) {
            this.f414950a.add(z1Var);
        }
        return this;
    }

    public n.l c(n3.z1 z1Var, n3.z1 z1Var2) {
        java.util.ArrayList arrayList = this.f414950a;
        arrayList.add(z1Var);
        android.view.View view = (android.view.View) z1Var.f415987a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        android.view.View view2 = (android.view.View) z1Var2.f415987a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z1Var2);
        return this;
    }

    public void d() {
        android.view.View view;
        if (this.f414954e) {
            return;
        }
        java.util.Iterator it = this.f414950a.iterator();
        while (it.hasNext()) {
            n3.z1 z1Var = (n3.z1) it.next();
            long j17 = this.f414951b;
            if (j17 >= 0) {
                z1Var.c(j17);
            }
            android.view.animation.Interpolator interpolator = this.f414952c;
            if (interpolator != null && (view = (android.view.View) z1Var.f415987a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f414953d != null) {
                z1Var.d(this.f414955f);
            }
            z1Var.f();
        }
        this.f414954e = true;
    }
}
