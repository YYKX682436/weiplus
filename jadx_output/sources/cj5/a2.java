package cj5;

/* loaded from: classes.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.i0 f42065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42066e;

    public a2(wi5.i0 i0Var, cj5.l2 l2Var) {
        this.f42065d = i0Var;
        this.f42066e = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        xm3.t0 t0Var;
        for (yz5.a aVar : this.f42065d.f446296b) {
            if (aVar != null && (view = (android.view.View) aVar.invoke()) != null && (t0Var = this.f42066e.f42185h) != null) {
                t0Var.O(view, view.hashCode(), true);
            }
        }
    }
}
