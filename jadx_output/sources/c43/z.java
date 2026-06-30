package c43;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f38520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.k0 f38521e;

    public z(c43.k0 k0Var, java.util.Map map) {
        this.f38521e = k0Var;
        this.f38520d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        c43.k0 k0Var = this.f38521e;
        java.util.Map map = this.f38520d;
        if (map != null && map.containsKey(k0Var.f38450a.f38495m.from_username)) {
            k0Var.f38450a.M = (u33.h) map.get(k0Var.f38450a.f38495m.from_username);
        }
        c43.x xVar = k0Var.f38450a;
        android.view.View p17 = xVar.p(xVar.f38496n);
        android.view.ViewGroup viewGroup = k0Var.f38450a.f38496n;
        if (viewGroup == null || p17 == null) {
            return;
        }
        viewGroup.removeAllViews();
        k0Var.f38450a.f38496n.addView(p17);
        c43.x xVar2 = k0Var.f38450a;
        xVar2.k(xVar2.f38495m);
        p17.setOnClickListener(new c43.y(this));
        k0Var.f38450a.A(p17);
    }
}
