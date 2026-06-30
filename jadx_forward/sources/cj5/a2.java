package cj5;

/* loaded from: classes.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.i0 f123598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123599e;

    public a2(wi5.i0 i0Var, cj5.l2 l2Var) {
        this.f123598d = i0Var;
        this.f123599e = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        xm3.t0 t0Var;
        for (yz5.a aVar : this.f123598d.f527829b) {
            if (aVar != null && (view = (android.view.View) aVar.mo152xb9724478()) != null && (t0Var = this.f123599e.f123718h) != null) {
                t0Var.O(view, view.hashCode(), true);
            }
        }
    }
}
