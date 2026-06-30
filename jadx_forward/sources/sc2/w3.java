package sc2;

/* loaded from: classes2.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.z3 f487866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487868g;

    public w3(android.view.View view, sc2.z3 z3Var, android.view.View view2, android.view.View view3) {
        this.f487865d = view;
        this.f487866e = z3Var;
        this.f487867f = view2;
        this.f487868g = view3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f487865d;
        if (view instanceof android.view.ViewGroup) {
            int childCount = ((android.view.ViewGroup) view).getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = ((android.view.ViewGroup) view).getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().alpha(0.0f).setDuration(250L).start();
                }
            }
        }
        sc2.z3 z3Var = this.f487866e;
        android.view.View view2 = this.f487865d;
        android.view.View view3 = this.f487867f;
        ad2.h.F(z3Var, view2, view3, 250L, null, new sc2.v3(this.f487868g, view3, view2), 8, null);
    }
}
