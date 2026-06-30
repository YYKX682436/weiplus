package c43;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f120053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.k0 f120054e;

    public z(c43.k0 k0Var, java.util.Map map) {
        this.f120054e = k0Var;
        this.f120053d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        c43.k0 k0Var = this.f120054e;
        java.util.Map map = this.f120053d;
        if (map != null && map.containsKey(k0Var.f119983a.f120028m.f36570xfd4da1cb)) {
            k0Var.f119983a.M = (u33.h) map.get(k0Var.f119983a.f120028m.f36570xfd4da1cb);
        }
        c43.x xVar = k0Var.f119983a;
        android.view.View p17 = xVar.p(xVar.f120029n);
        android.view.ViewGroup viewGroup = k0Var.f119983a.f120029n;
        if (viewGroup == null || p17 == null) {
            return;
        }
        viewGroup.removeAllViews();
        k0Var.f119983a.f120029n.addView(p17);
        c43.x xVar2 = k0Var.f119983a;
        xVar2.k(xVar2.f120028m);
        p17.setOnClickListener(new c43.y(this));
        k0Var.f119983a.A(p17);
    }
}
