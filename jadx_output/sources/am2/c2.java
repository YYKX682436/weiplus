package am2;

/* loaded from: classes3.dex */
public final class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.e2 f8645d;

    public c2(am2.e2 e2Var) {
        this.f8645d = e2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.ai1 ai1Var = new r45.ai1();
        ai1Var.set(0, java.lang.Integer.valueOf(c01.id.e()));
        ai1Var.set(1, "太好听了");
        ai1Var.set(2, 1);
        ai1Var.set(3, 1);
        ai1Var.set(4, 100);
        am2.e2 e2Var = this.f8645d;
        am2.e2.a(e2Var, ai1Var);
        pm0.v.V(1000L, new am2.b2(e2Var));
        return true;
    }
}
